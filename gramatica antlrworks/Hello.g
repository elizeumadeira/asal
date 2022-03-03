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

funclist : funcdef funclist_linha
	;

funclist_linha
	: funclist 
	| /* epsilon */
	;

funcdef
	: T_DEF {adicionaFuncao(input.LT(1));} FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES 
		T_ABRECHAVE 
				statement
		T_FECHACHAVE 
	;


paramlist 
	: ( TIPOS {adicionaToken(input.LT(1));} ID paramlist_linha )?
	;

paramlist_linha
	: T_VIRGULA paramlist 
	| /* epsilon */ 
	;

statelist : statement (statelist)?
	;

statement:
		vardecl EOL 
		|/* epsilon */
		
	;

vardecl	
	: 
		{setUltTipo(input.LT(1).getText());} TIPOS 
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

allocexpression : T_NEW TIPOS (T_ABRECOLCHETE numexpression T_FECHACOLCHETE)+
	;

funccall
	: FUNCAO 
        T_ABREPARENTESES 
                ( paramlistcall )?
        T_FECHAPARENTESES
	;

paramlistcall
	:   (
			 ({verificaToken(input.LT(1));} ID | TEXTO | expression) paramlistcall_linha
		)?
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
	:	'"' ( 'A'..'Z' | 'a'..'z' | '0' .. '9' | ' ' | '!'  | '_' )* '"'
        ;
	
NUMERO 
	:	('0'..'9')+   ( '.' ('0'..'9')+  )?
        ;

COMENTARIO
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;} 
    ;