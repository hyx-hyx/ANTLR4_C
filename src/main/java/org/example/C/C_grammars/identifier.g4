lexer grammar identifier;
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

ID:[_a-zA-Z]([_a-zA-Z0-9]*);
NEWLINE:'\r'?'\n';
WS :[ \t\r\n]+ -> skip;