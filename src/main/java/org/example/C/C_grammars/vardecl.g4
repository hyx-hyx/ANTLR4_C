grammar vardecl;
import expr,identifier;
debug:vardecl+;
vardecl:(Type ((ID (','ID)*)|expr))';';