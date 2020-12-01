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
    : IDENTIFIER '{' (component|NL)* '}'
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


variableAssignment
    : IDENTIFIER '=' expression
    ;

expression
    :   IDENTIFIER
    |   value
    ;

value
    : '(' NUMBER ',' NUMBER ')'
    | '(' NUMBER ',' NUMBER ',' NUMBER ')'
    | '(' NUMBER ',' NUMBER ',' NUMBER ',' NUMBER ')'
    | STRING
    | NUMBER
    ;

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

NUMBER  :  ([0-9] | ([1-9][0-9]*)) ('.' [0-9]* [1-9])* ;
STRING  : '"' ~[\n\t\r"]* '"' ;


// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

IDENTIFIER : LETTERS (LETTERS|NUMBERS)* ;


NUMBERS : [0-9] ;
LETTERS : [a-zA-Z] ;
NL : ('\r\n'|'\n') ;


WHITESPACE : [ \t] -> skip;
