lexer grammar keyword;
import identifier;
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

WS  :   [ \t\n\r]+ -> skip ;