grammar preprocess;
import keyword,expr;
debug:preprocess+;
head:('#'(('include''<'(ID('.h')?)'>')|('define' ID expr)))|'\n';
preprocess:head+;
WS:[ \t\r\n]+ ->skip;