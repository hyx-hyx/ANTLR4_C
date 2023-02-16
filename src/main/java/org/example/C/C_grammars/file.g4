grammar file;
import func,identifier,vardecl,assign_stmt,if_stmt,for_stmt,preprocess;
debug:file;
file:preprocess(vardecl|type_assign)*
    (('\n')?)
    func+;

WS:[ \t\r\n]+ ->skip;