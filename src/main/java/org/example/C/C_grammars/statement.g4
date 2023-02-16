grammar statement;
import if_stmt,while_stmt,assign_stmt,for_stmt,vardecl,callstmt,expr;
debug: statement+;
statement:assign_stmt
        |if_stmt
        |while_stmt
        |for_stmt
        |vardecl
        |callstmt
        |(expr';')
        ;
WS:[ \t\r\n]+ ->skip;