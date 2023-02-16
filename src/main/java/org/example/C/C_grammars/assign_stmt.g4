grammar assign_stmt;
import expr,identifier,callstmt;
debug: assign_stmt+;
type_assign:(Type)(ID|expr)'='(call|expr);
expr_assign:(ID|expr)'='(call|expr);
assign_stmt:(expr_assign|type_assign)';';

WS:[ \t\r\n]+ ->skip;