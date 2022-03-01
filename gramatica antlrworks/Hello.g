grammar Hello;

options {
    backtrack=true;
    memoize=true;
    k=1;
} 

tokens {
	EOL = ';'
		;
		
	T_DEF = 'def'
		;
	
	T_VIRGULA = ','
		        ;
		
	T_ABREPARENTESES = '('
		        ;
		
	T_FECHAPARENTESES = ')'
		        ;
		
	T_ABRECHAVE = '{'
		        ;
		
	T_FECHACHAVE =  '}'
		        ;
		
	T_ABRECOLCHETE = '['
		        ;
		
	T_FECHACOLCHETE =  ']'
		        ;

	T_ATRIBUICAO = '='
		        ;
		
	T_IGUAL = '=='
		        ;
		
	T_DIFERENTE = '!='
		        ;
		
	// T_E = '&'
	// 	        ;
		
	// T_OU = '|'
	// 	        ;
		
	T_MAIOROUIGUAL  = '>=' 
		        ;
		
	T_MENOROUIGUAL = '<='
		        ;
		
	T_MAIOR = '>'
		        ;
		
	T_MENOR = '<'
		        ;
		
	T_SOMA = '+'
		        ;
		
	T_SUBTRACAO = '-'
		        ;
		
	T_MULTIPLICACAO = '*'
		        ;
		
	T_DIVISAO = '/'
		  ;
		  
	T_WRITE = 'print'
		;
		
	T_READ = 'read'
		;
		
	T_RETURN = 'return'
		;
	
	T_IF = 'if'
		;
		
	T_ELSE = 'else'
		;

	T_ELSEIF = 'elseif'
		;
		
	T_FOR = 'for'
		;

	T_NEW = 'new'
		;
	
	T_BREAK = 'break'
		;

	T_NULL = 'null'
		;
}


program	:
	( statement | funclist )
	;
	
funcdef
	: T_DEF  FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES 
		T_ABRECHAVE 
				statelist
		T_FECHACHAVE 
	;

funclist : funcdef funclist | funcdef
	;

paramlist :  ( TIPOS   ID T_VIRGULA paramlist | TIPOS   ID)?
	;

statelist : statement (statelist)?
	;

statement
	:(vardecl EOL |
	atribstat EOL |
	printstat EOL |	
	readstat EOL|
	returnstat EOL |
	ifstat |
	forstat |
	T_ABRECHAVE statelist T_FECHACHAVE |
	ESPACO_BRANCO |
	T_BREAK EOL |
	EOL)
	;

vardecl	
	: 
		 TIPOS 
		 ID (T_ABRECOLCHETE (  ID | NUMERO ) T_FECHACOLCHETE)*
	;

lvalue
	:  ID
		( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
	;

atribstat
	:
	lvalue   // atribuição de array   a[b] ou a[1]
	T_ATRIBUICAO 
	( expression | allocexpression | funccall | TEXTO )
	;

allocexpression : T_NEW TIPOS (T_ABRECOLCHETE numexpression T_FECHACOLCHETE)+
	;

funccall
	: FUNCAO 
        T_ABREPARENTESES 
                ( paramlistcall )?
        T_FECHAPARENTESES
	;

paramlistcall
	:   ( ( ID | TEXTO | expression) T_VIRGULA paramlistcall | ( ID | TEXTO | expression) )?
	;

printstat
	: T_WRITE ( lvalue | TEXTO | expression )
	;
	
readstat
	: T_READ lvalue
	;
	
returnstat
	: T_RETURN ( TEXTO | expression )?
	;
	
// ifstat	
// 	: 'if' '(' expression ')' statement ('else' statement)?
// 	;

// ifstat	: T_IF  T_ABREPARENTESES expression T_FECHAPARENTESES 
// 			T_ABRECHAVE (statement)*
// 			// ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE (statement)* )*
// 			( T_FECHACHAVE T_ELSE T_ABRECHAVE (statement)* )?
// 			T_FECHACHAVE
// 	;
	
ifstat	: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement (T_ELSE statement)?
	;

forstat	: T_FOR	T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES 
	        T_ABRECHAVE (statement)* T_FECHACHAVE
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
	
TIPOS 
	:	('int' | 'float' | 'string')
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
	: 	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } 
	;

COMENTARIO
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
	
