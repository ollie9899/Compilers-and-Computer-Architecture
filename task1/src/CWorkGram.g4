grammar CWorkGram;
wholeexpr : prog | EOF;

prog :  dec | prog dec;

dec : type Idfr LParen vardec RParen block;

vardec : | vardecne;

vardecne : type Idfr #justType| vardecne Comma type Idfr #vardecneType;

block : LBrace ene RBrace;

ene : exp | exp Semicolon ene;

exp : Idfr #idfrExp | IntLit #intLitExp | Idfr Assign exp #asgmt | LParen exp binop exp RParen #binOpExpr
        | Idfr LParen args RParen #funInvoc | block #blockExp | If exp Then block Else block #ifStmt
        | While exp Do block #whileLoop
        | Repeat block Until exp #repeatLoop | Skip #skipExp ;

args : | argsne;

argsne : exp #justExp | argsne Comma exp #argsneExp;

binop : Eq | Less | Gtr | LessEq | GtrEq | Plus | Minus | Times | Div | And | Or | Xor;

type : IntType | BoolType | UnitType;


While : 'while' ;
If : 'if' ;
Do : 'do' ;
Then : 'then' ;
Repeat : 'repeat' ;
Else : 'else' ;
Until : 'until';

Assign : ':=' ;
Eq : '==' ;
Less : '<' ;
Gtr : '>' ;
LessEq : '<=' ;
GtrEq :	'>=' ;
Plus : '+' ;
Times :	'*' ;
Minus :	'-' ;
Div	: '/' ;
And : '&&' ;
Or : '||' ;
Xor	: '^^' ;

IntType : 'int' ;
BoolType : 'bool' ;
UnitType : 'unit' ;

LParen : '(' ;
Comma : ',' ;
RParen : ')' ;
LBrace : '{' ;
Semicolon :	';' ;
RBrace : '}' ;

Skip : 'skip';
WS : [ \n\r\t]+ -> skip ;
Idfr : [a-z][A-Za-z0-9_]* ;
IntLit : '0' | [1-9][0-9]* ;


