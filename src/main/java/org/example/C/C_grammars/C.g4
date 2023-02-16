grammar C;
@lexer::header {    // place this header action only in lexer, not the parser
import java.util.*;
}

// explicitly define keyword token types to avoid implicit def warnings
tokens {FOR,WHILE,DO,INCLUDE,SWITCH,RETURN,IF,DEFINE }

@lexer::members {   // place this class member only in lexer
Map<String,Integer> keywords = new HashMap<String,Integer>() {{
    put("for", KeywordsParser.FOR);
    put("while",   KeywordsParser.WHILE);
    put("if",    KeywordsParser.IF);
    put("return",  KeywordsParser.RETURN);
    put("switch",  KeywordsParser.SWITCH);
    put("include",  KeywordsParser.INCLUDE);
    put("define",  KeywordsParser.DEFINE);
    put("do", KeywordsParser.DO);
}};
}
debug: file;
head:('#'(('include''<'(ID('.h')?)'>')|('define' ID expr)))|'\n';
preprocess:head+;

statement:assign_stmt
        |if_stmt
        |while_stmt
        |for_stmt
        |vardecl
        |callstmt
        |(expr';')
        ;

vardecl:(Type ((ID (','ID)*)|expr))';';
while_stmt:'while'('(' expr')')
            (('\n'?)(statement|block|';'))?;
file:preprocess(vardecl|type_assign)*
    (('\n')?)
    func+;

for_stmt:(FOR
            ('('(type_assign|expr_assign)';' (expr|)';' (expr_assign|expr|)')')
            (';'|block|));
func:((Type ID)('('args?')')(('\n'?'{'statements'}')?|';'));
args:arg (','arg)*;
arg:Type ID ('='expr)?;
expr:ID'['expr']'
    |'('expr')'
    |expr'.'expr
    |expr'->'expr
    |<assoc=right>'-'expr
    |<assoc=right>(Type)expr
    |<assoc=right>('++'|'--')expr
    |<assoc=right>expr('++'|'--')
    |<assoc=right>'*'expr
    |<assoc=right>'&'expr
    |<assoc=right>('!'|'~'|'&'|'sizeof')expr
    |expr ('*'|'/'|'%') expr //优先级为3
    |expr('+'|'-')expr     //优先级为4565
    |expr('<<'|'>>')expr   //优先级为5
    |expr('<='|'>='|'>'|'<')expr  //优先级为6
    |expr('=='|'!=')expr          //优先级为7
    |expr'&'expr                  //优先级为8
    |expr'^'expr                  //优先级为9
    |expr'|'expr                  //优先级为10
    |expr'&&'expr                 //优先级为11
    |expr'||'expr                 //优先级为12
    |<assoc=right> expr'?'expr';'expr
    |<assoc=right> expr('+='|'-='|'*='|'/='|'%='|'<<='|'>>='|'&='|'^='|'|=')expr //优先级14
    |expr(',')expr
    |INT
    |ID
    ;

if_stmt:'if' '(' expr')'
            (('\n'?(('{'statements'}')|statement))|('\n'?))
            ('\n'?'else'
                    ('\n')? (
                                ('{'statements'}'|statement)
                            ));
call:ID'('(((ID|expr)(','(ID|expr))*)|)')';
callstmt:call';';
statements:statement*'\n'?;
block:('{'statements'}');
type_assign:(Type)(ID|expr)'='(call|expr);
expr_assign:(ID|expr)'='(call|expr);
assign_stmt:(expr_assign|type_assign)';';

//lexer
Type: 'int'|'float'|'double'|'char'|'bool'|'long'|'void'|'include';
INT:'0'|([1-9][0-9]*);

//字符串
STRING:'"' (ESC|.)*? '"';
fragment ESC:'\\'[btnr"\\];

//注释
LINE_COMMENT:'//'.*? ->skip;
COMMENT:'/*'.*? '*/' ->skip;

//include,define
//PRE:'include'|'define';

ID  :   [_a-zA-Z]([_a-zA-Z0-9]*)
        {
        if ( keywords.containsKey(getText()) ) {
            setType(keywords.get(getText())); // reset token type
        }
        }
    ;

NEWLINE:'\r'?'\n';
WS :[ \t\r\n]+ -> skip;