grammar while_stmt;
import expr,block;
debug: while_stmt;
while_stmt:'while'('(' expr')')
            (('\n'?)(statement|block|';'))?;
WS :[ \t\r\n]+ -> skip;