grammar ccal;	

prog: decl_list func_list main;

decl_list: decl SEMI decl_list |;

decl: var_decl | const_decl;

var_decl: Variable ID COLON type;

const_decl: Const ID COLON type ASSIGN expr;

func_list: func func_list |;

func:   type ID LPAREN param_list RPAREN
        LBRACE
        decl_list stm_block
        Return LPAREN (expr | ) RPAREN SEMI
        RBRACE
        ;

type: Integer | Boolean | Void;

param_list: nemp_param_list |;

nemp_param_list: ID COLON type | ID COLON type COMMA nemp_param_list;

main:   Main LBRACE
        decl_list
        stm_block
        RBRACE
        ;

stm_block: stm stm_block |;

stm:    ID ASSIGN expr SEMI
        | ID LPAREN arg_lst RPAREN SEMI
        | LBRACE stm_block RBRACE
        | If cond LBRACE stm_block RBRACE Else LBRACE stm_block RBRACE
        | While cond LBRACE stm_block RBRACE
        | Skip SEMI;

expr:   frag bin_arith_op frag
        | LPAREN expr RPAREN 
        | ID LPAREN arg_lst RPAREN
        | frag
        ;

bin_arith_op: ADD | <assoc=right> SUB;

frag: ID | SUB ID | NUMBER | True | False;

cond:   TILDE cond 
        | LPAREN cond RPAREN
        | expr comp_op expr
        | cond (OR | AND) cond
        ;

comp_op: EQUAL | NOTEQUAL | LT | LE | GT | GE;

arg_lst: nemp_arg_lst |;

nemp_arg_lst: ID | ID COMMA nemp_arg_lst;

// KEYWORDS

Variable:       V A R;
Const:          C O N S T;
Return:         R E T U R N;
Integer:        I N T E G E R;
Void:           V O I D;
Main:           M A I N;
If:             I F;
Else:           E L S E;
While:          W H I L E;
Skip:           S K I P;
Boolean:        B O O L E A N;
True:           T R U E;
False:          F A L S E;

// FRAGMENTS

fragment A:     'a'|'A';
fragment B:     'b'|'B';
fragment C:     'c'|'C';
fragment D:     'd'|'D';
fragment E:     'e'|'E';
fragment F:     'f'|'F';
fragment G:     'g'|'G';
fragment H:     'h'|'H';
fragment I:     'i'|'I';
fragment K:     'k'|'K';
fragment L:     'l'|'L';
fragment M:     'm'|'M';
fragment N:     'n'|'N';
fragment O:     'o'|'O';
fragment P:     'p'|'P';
fragment R:     'r'|'R';
fragment S:     's'|'S';
fragment T:     't'|'T';
fragment U:     'u'|'U';
fragment V:     'v'|'V';
fragment W:     'w'|'W';

fragment Letter: [a-zA-Z];
fragment Digit: [0-9];
fragment UnderScore: '_';

BOOLEAN: 'true' | 'false';
ID: Letter (Letter | Digit | UnderScore)*;
NUMBER: ('0' | SUB?[1-9] Digit*);

// SEPARATORS

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMI: ';';
COMMA: ',';

// OPERATORS

ASSIGN: '=';
GT: '>';
LT: '<';
TILDE: '~';
COLON: ':';
EQUAL: '==';
LE: '<=';
GE: '>=';
NOTEQUAL: '!=';
AND: '&&';
OR: '||';
ADD: '+';
SUB: '−' | '-';

// WHITESPACES AND COMMENTS

WS: [ \t\n\r]+ -> skip;
MULTI_LINE_COMMENT: '/*' (MULTI_LINE_COMMENT | .)*? '*/' -> skip;
SINGLE_LINE_COMMENT: '//' ~[\r\n]* -> skip;