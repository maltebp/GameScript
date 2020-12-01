grammar GameScript;

program
    :   block? ((NL block)|NL)* EOF
    ;


block
    :   start   # StartBlock
    |   objectDefinition # ObjectBlock
    ;


start
    :   'Start' commandBlock
    ;


objectDefinition
    : 'Object' IDENTIFIER ':' (component|NL)*
    ;

component
    : NL IDENTIFIER ':' (attribute|NL)*
    ;

attribute
    : NL IDENTIFIER '=' STRING
    ;


commandBlock
    : '{' (NL command)* NL '}'
    ;


command
    : 'print' output=STRING      # Print
    ;




// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

STRING : '"' ~[\n\t\r"]* '"' ;


// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

IDENTIFIER : LETTERS (LETTERS|NUMBERS)* ;


NUMBERS : [0-9] ;
LETTERS : [a-zA-Z] ;
NL : ('\r\n'|'\n') ;


WHITESPACE : [ \t] -> skip;
