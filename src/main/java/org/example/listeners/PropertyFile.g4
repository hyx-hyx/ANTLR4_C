grammar PropertyFile;
file:proc+;
proc:ID'='STRING'\n';

ID:[_a-zA-Z]([_a-zA-Z0-9]*);

//字符串
STRING:'"' (ESC|.)*? '"';
fragment ESC:'\\'[btnr"\\];