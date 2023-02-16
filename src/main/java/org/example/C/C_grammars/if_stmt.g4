grammar if_stmt;
import expr,block;
debug: if_stmt;
if_stmt:'if' '(' expr')'
            (('\n'?(('{'statements'}')|statement))|('\n'?))
            ('\n'?'else'
                    ('\n')? (
                                ('{'statements'}'|statement)
                            ));
WS:[ \r\n]+ -> skip;