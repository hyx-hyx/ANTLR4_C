grammar for_stmt;
import block,identifier,vardecl,assign_stmt,keyword;
debug: for_stmt;
for_stmt:(FOR
            ('('(type_assign|expr_assign)';' (expr|)';' (expr_assign|expr|)')')
            (';'|block|));
WS:[ \t\r\n]+ ->skip;