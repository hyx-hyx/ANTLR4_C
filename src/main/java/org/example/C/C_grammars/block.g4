grammar block;
import expr,identifier,statement;
debug:block;
statements:('\n'?statement'\n'?)*;
block:('{'statements'}');
WS: [ \t\r\n]+ -> skip;