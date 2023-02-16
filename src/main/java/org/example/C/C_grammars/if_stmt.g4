grammar if_stmt;
import expr,block;
debug: if_stmt;
if_stmt:'if' '(' expr')'
            block
            'else' block;
WS:[ \r\n]+ -> skip;