grammar IPT;

start: value EOF;

named: VARNAME EQ value;

value: list | STRING | NUMBER | named;

list: SQUIGGLY_OPEN value (COMMA value?)* SQUIGGLY_CLOSE;


VARNAME: [a-zA-Z]+;

STRING: QUOTE (SAFECODEPOINT)* QUOTE;

NUMBER: '-'? INT;

EQ: '=';

COMMA: ',';

SQUIGGLY_OPEN: '{';
SQUIGGLY_CLOSE: '}';

fragment QUOTE: '"';

fragment INT: '0' | [1-9] [0-9]*;

fragment SAFECODEPOINT: ~ ["\\\u0000-\u001F];

WS: [ \t\n\r]+ -> skip;
