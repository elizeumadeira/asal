grammar Hello;

options {
    backtrack=true;
    memoize=true;
    k=1;
    output = AST;
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
		
	T_COMPARACAO = '=='
		        ;
		
	T_DIFERENTE = '!='
		        ;
		
	T_E = '&'
		        ;
		
	T_OU = '|'
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
		  
	T_ESCREVA = 'print'
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
	
	T_BREAK = 'break'
		;
}


program	:
	( statement | funclist)
	;
	
funclist
	:
		(
                T_DEF  FUNCAO 
                        T_ABREPARENTESES 
                                ( 
                                         TIPOS   ID
                                        (T_VIRGULA   TIPOS   ID  )*
                                )?
                        T_FECHAPARENTESES
                        T_ABRECHAVE 
                                (statement)+
                        T_FECHACHAVE 
        )*
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
	T_BREAK EOL |
	EOL)
	;

vardecl	
	: 
		 TIPOS 
		 ID (T_ABRECOLCHETE (  ID | NUMERO ) T_FECHACOLCHETE)*
	;

atribstat
	:
	ID    // atribuição de array   a[b] ou a[1]
                (T_ABRECOLCHETE (ID | NUMERO ) T_FECHACOLCHETE)*
                T_ATRIBUICAO 
                ( expression | funccall | TEXTO )
	;

funccall
	: FUNCAO 
        T_ABREPARENTESES 
                ( (ID | NUMERO)
                (T_VIRGULA (ID | NUMERO) )*)?
        T_FECHAPARENTESES
	;

printstat
	: T_ESCREVA( ID |TEXTO | expression ) 
	;
	
readstat
	: T_READ( ID |TEXTO | expression ) 
	;
	
returnstat
	: T_RETURN ( TEXTO | expression )?
	;
	
ifstat	: T_IF  T_ABREPARENTESES expression T_FECHAPARENTESES 
			T_ABRECHAVE (statement)*
			( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE (statement)* )*
			( T_FECHACHAVE T_ELSE T_ABRECHAVE (statement)* )?
			T_FECHACHAVE
	;
	
forstat	: T_FOR	T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES 
	        T_ABRECHAVE (statement)* T_FECHACHAVE
	;	
	
statelist :	(statement)*
	;
	
expression : expression_linha ( ( T_E | T_OU ) expression_linha)*
	;
expression_linha : term (( T_SOMA | T_SUBTRACAO ) term)*
	;

term : relational_expression (( T_MULTIPLICACAO | T_DIVISAO ) relational_expression )*
	;

relational_expression : relational_expression_2 (( T_MAIOR | T_MENOR ) relational_expression_2 )*
	;

relational_expression_2 : equal_expression (( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression )*
	;

equal_expression :  unaryexpr (( T_COMPARACAO | T_DIFERENTE ) unaryexpr )*
	;

unaryexpr :  factor (( T_SOMA | T_SUBTRACAO ) factor )*
	;

factor : (  ID  | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES )
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
/*
program	:
	(statement| funclist)
	;

funclist
	: funcdef funclist | funcdef
	;
	
funcdef	
	:'def' 'ident' '(' paramlist ')' '{' statelist ')'
	;
	
paramlist
	: ('int' | 'float' | 'string') ('ident' ','  paramlist | ('int' | 'float' | 'string'))+
	;

statement
	:(vardecl ':' |
	atribstat ':' |
	printstat ':' |	
	readstat ':'|
	returnstat ':' |
	ifstat |
	forstat |
	'{' statelist '}' |
	'break' ';' |
	';')
	;

vardecl	
	: ('int' | 'float' | 'string') 'ident' ('[int_constant]')*
	;
	
atribstat
	:	lvalue '=' (expression | allocexpression | funccall)
	;
	
funccall
	:'ident' '(' paramlistcall ')'	
	;

paramlistcall
	: 'ident' (',' paramlistcall | 'ident')?
	;
	
printstat
	: 'print' expression
	;

readstat
	: lvalue	
	;
	
returnstat
	: 'return'
	;
	
ifstat	
	: 'if' '(' expression ')' statement ('else' statement)?
	;
	
forstat	
	: 'for' '(' atribstat ';' expression ';' atribstat ')' statement
	;
	
statelist
	: statement (statelist)?
	;
	
allocexpression
	: 'new' ('int' | 'float' | 'string') ('[' numexpression ']')+
	;
	
expression
	: numexpression ( ( '<' | '>' | '<=' | '>=' | '==' | '!=') numexpression)?
	;
	
numexpression
	: term ( ('+' | '-' ) term)*
	;
	
term
	: unaryexpr ( ('*' | '/' | '%') unaryexpr)*
	;
	
unaryexpr
	: ('+' | '-')?	factor
	;
	
factor
	: ('int_constant' | 'float_constant' | 'string_constant' | 'null' | lvalue | '(' numexpression ')')
	;

lvalue	
	: 'ident' ('[' numexpression ']')*
	;
*/
