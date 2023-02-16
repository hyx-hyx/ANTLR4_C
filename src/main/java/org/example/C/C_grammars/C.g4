grammar C;
import func;
debug:c_parser+;
c_parser:  (statement|func)+;
statement:(define_stmt|assign_stmt);
define_stmt:Type ID'='expr ';' ;
assign_stmt:expr'='expr';';
