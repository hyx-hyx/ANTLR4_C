grammar expr;
import identifier;
debug: expr+;
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
WS:[ \t\r\n]+ ->skip;
