grammar ArrayInit;

debug:'{'value (','value)* '}';

value:debug
    |INT
    ;

ID:[a-zA-Z]+;
INT:[0-9]+;