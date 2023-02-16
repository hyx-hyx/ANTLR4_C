grammar callstmt;
import expr;
debug: callstmt+;
call:ID'('(((ID|expr)(','(ID|expr))*)|)')';
callstmt:call';';