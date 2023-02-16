grammar block;
import expr,identifier,statement;
debug:block;
statements:statement*'\n'?;
block:('{'statements'}');
WS: [ \t\r\n]+ -> skip;