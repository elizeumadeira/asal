grammar Hello;

options {
    backtrack=true;
    k=1;
} 

tokens {
	
} 


program	:
	( statement | funclist )
	;

funclist : funcdef funclist_linha
	;

funclist_linha
	: funclist 
	| /* epsilon */
	;

funcdef
	: T_DEF {adicionaFuncao(input.LT(1));} FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES 
		T_ABRECHAVE 
				statelist
		T_FECHACHAVE 
	;


paramlist 
	: (T_INT  | T_FLOAT | T_STRING) ID paramlist_linha 
	|
	;

paramlist_linha	: T_VIRGULA paramlist 
	| /* epsilon */ 
	;

statelist : statement (statelist)?
	;

statement:
		vardecl EOL |
		atribstat EOL |
		printstat EOL |	
		readstat EOL|
		returnstat EOL |
		ifstat |
		forstat |
		T_ABRECHAVE statelist T_FECHACHAVE |
		T_BREAK EOL |
		EOL
	;

vardecl	
	: 
		{setUltTipo(input.LT(1).getText());} ( T_INT  | T_FLOAT | T_STRING ) 
		{adicionaToken(input.LT(1));} ID (T_ABRECOLCHETE ( {verificaToken(input.LT(1));} ID | NUMERO ) T_FECHACOLCHETE)*
	;

lvalue
	: {verificaToken(input.LT(1));} ID
		( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
	;

atribstat
	:
	lvalue 
	T_ATRIBUICAO 
	( expression | allocexpression | funccall | TEXTO )
	;

allocexpression : T_NEW ( T_INT  | T_FLOAT | T_STRING ) (T_ABRECOLCHETE numexpression T_FECHACOLCHETE)+
	;

funccall
	: FUNCAO 
        T_ABREPARENTESES 
                paramlistcall
        T_FECHAPARENTESES
	;

paramlistcall
	: TEXTO paramlistcall_linha 
	| expression paramlistcall_linha 
	| /* epsilon */
	;

paramlistcall_linha
	:
	T_VIRGULA paramlistcall
	| /* epsilon */
	;

printstat
	: T_WRITE ( TEXTO | expression )
	;
	
readstat
	: T_READ lvalue
	;
	
returnstat
	: T_RETURN ( TEXTO | expression )?
	;
	
ifstat	
	: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha
	;

ifstat_linha
	: T_ELSE  statement
	| /* epsilon */
	;
	
forstat	: T_FOR	T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES 
	     statement
	;	
	
expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression)?
	;

numexpression : term (( T_SOMA | T_SUBTRACAO ) term)*
	;

term :
	unaryexpr ( (T_MULTIPLICACAO | T_DIVISAO ) unaryexpr)*
	;

unaryexpr :  ( T_SOMA | T_SUBTRACAO )? factor
	;

factor : ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
	;

ID    
	:	'A' .. 'Z' ('A' .. 'Z' | '0'..'9')*
       	;

FUNCAO 
	:	('a' .. 'z') ( 'a' .. 'z' | '0'..'9' | '_')+
        ;
	        
TEXTO 
	:	'"' ( 'A'..'Z' | 'a'..'z' | '0' .. '9' | ' ' | '!'  | '_' | '-')* '"'
        ;
	
NUMERO 
	:	('0'..'9')+   ( '.' ('0'..'9')+  )?
        ;

ESPACO_BRANCO 
	: 	( '\t' | ' ' | '\r' | '\n' )+    {$channel = HIDDEN;} 
	;

COMENTARIO
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;} 
    ;

EOL : ';'
	;
	
T_DEF : 'def'
	;

T_VIRGULA : ','
			;
	
T_ABREPARENTESES : '('
			;
	
T_FECHAPARENTESES : ')'
			;
	
T_ABRECHAVE : '{'
			;
	
T_FECHACHAVE :  '}'
			;
	
T_ABRECOLCHETE : '['
			;
	
T_FECHACOLCHETE :  ']'
			;

T_ATRIBUICAO : '='
			;
	
T_IGUAL : '=='
			;
	
T_DIFERENTE : '!='
			;

T_MAIOROUIGUAL  : '>=' 
			;
	
T_MENOROUIGUAL : '<='
			;
	
T_MAIOR : '>'
			;
	
T_MENOR : '<'
			;
	
T_SOMA : '+'
			;
	
T_SUBTRACAO : '-'
			;
	
T_MULTIPLICACAO : '*'
			;
	
T_DIVISAO : '/'
	  ;
	  
T_WRITE : 'print'
	;
	
T_READ : 'read'
	;
	
T_RETURN : 'return'
	;

T_IF : 'if'
	;
	
T_ELSE : 'else'
	;

T_FOR : 'for'
	;

T_NEW : 'new'
	;

T_BREAK : 'break'
	;

T_NULL : 'null'
	;

T_INT : 'int'
	;

T_FLOAT : 'float'
	;

T_STRING : 'string'
	;