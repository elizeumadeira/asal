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
		
	T_FOR = 'for'
		;
	
	T_BREAK = 'break'
		;
}

@header {
	import java.util.Set;
	import java.util.HashSet;
}

@members {
	java.util.HashMap<String, String> mapaVar = new java.util.HashMap<String, String>();;
        java.util.HashMap<String, String> mapaFuncaoVar = new java.util.HashMap<String, String>();;
        String ultTipo = "";
        String ultFuncao = "";

	java.util.HashMap<String, LinguagemToken> mapa = new java.util.HashMap<String, LinguagemToken>();
	
	public void adicionaToken(Token token){
                LinguagemToken tempToken = new LinguagemToken(ultFuncao, token.getText(), ultTipo);
                if(mapa.get(tempToken.toString()) == null){
                        mapa.put(tempToken.toString(), tempToken);
                        System.out.println("Token "+ token.getText() + " adicionado: " + token.toString() + " / Tipo: "+ ultTipo + " / Funcao: " + ultFuncao);
                        ultTipo = "";
                } else{
                        throw new RuntimeException("ID '"+token.getText()+"' ja foi declarado. Erro em " + token.getLine()+":");
                }
        }
        
        public void verificaToken(Token token){
                // if(mapaVar.get(token.getText()) == null){
                //         throw new RuntimeException("ID '"+token.getText()+"' nao declarado em "+ token.getLine()+":"+ token.getColumn());
                // }
                LinguagemToken tempToken = new LinguagemToken(ultFuncao, token.getText(), ultTipo);

                // System.out.println("TempToken: " + tempToken.toString());
                // escreveMapa();

                if(mapa.get(tempToken.toString()) == null){
                        throw new RuntimeException("ID '"+token.getText()+"' nao declarado em "+ token.getLine() + " / Funcao: " + ultFuncao);
                }
        }

        public void adicionaFuncao(Token token){
		System.out.println("Funcao "+token.getText());
                if(mapaFuncaoVar.get(token.getText()) == null){
                        mapaFuncaoVar.put(token.getText(), token.getText());
                        setUltFuncao(token.getText());
                } else{
                        throw new RuntimeException("Funcao '"+token.getText()+"' ja foi declarado. Erro em "+ token.getLine());
                }
        }

        public void verificaFuncao(Token token){
                if(mapaFuncaoVar.get(token.getText()) == null){
                        throw new RuntimeException("Funcao '"+token.getText()+"' nao declarado em "+ token.getLine());
                }
        }

        public void setUltTipo(String tipo){
                ultTipo = tipo;
        }

        public void setUltFuncao(String funcao){
                ultFuncao = funcao;
        }

        public void escreveMapa(){
                System.out.println("Mapa de tokens\n");
                for (java.util.Map.Entry<String,LinguagemToken> entry : mapa.entrySet()){
                        System.out.println(entry.toString());
                }
        }
	
    public static void main(String[] args) throws Exception {
        HelloLexer lex = new HelloLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
 
        HelloParser parser = new HelloParser(tokens);
 
        try {
            parser.program();
            parser.escreveMapa();
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
}

program	:
	(statement| funclist)
	;
	
funclist
	:
		(
                // funções não retornam mais o tipo
                // tipos 
                T_DEF { adicionaFuncao(input.LT(1)); } FUNCAO 
                        T_ABREPARENTESES 
                                ( 
                                        { setUltTipo(input.LT(1).getText()); } TIPOS { adicionaToken(input.LT(1));}  ID
                                        (T_VIRGULA  { setUltTipo(input.LT(1).getText()); } TIPOS { adicionaToken(input.LT(1));}  ID  )*
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
	{ setUltTipo(input.LT(1).getText()); } TIPOS { adicionaToken(input.LT(1));} ID (T_ABRECOLCHETE ( { verificaToken(input.LT(1));} ID | NUMERO ) T_FECHACOLCHETE)*
	;

atribstat
	:
	ID    // atribuição de array   a[b] ou a[1]
                (T_ABRECOLCHETE (ID | NUMERO ) T_FECHACOLCHETE)*
                T_ATRIBUICAO 
                ( expression | funccall )
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
	: T_RETURN ( ID | NUMERO | TEXTO)?
	;
	
ifstat	: T_IF  T_ABREPARENTESES expression T_FECHAPARENTESES statement (options {k=1; backtrack=false;}: T_ELSE statement)?
	;
	
forstat	: T_FOR	T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES 
	        T_ABRECHAVE (statement)+ T_FECHACHAVE
	;	
	
statelist :	
	statement (statelist)?
	;
	
expression 
	: expr_linha
	;

expr_linha : term (( T_SOMA | T_SUBTRACAO ) term)*
	;

term : fator(( T_MULTIPLICACAO | T_DIVISAO)  fator)*
	;

unaryexpr
	: ('+' | '-')?	factor
	;

fator : { verificaToken(input.LT(1));} ID  | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES
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
	:	'"' ( 'A'..'Z' | 'a'..'z' | '0' .. '9' | ' ' | '!')? '"'
        ;
	
NUMERO 
	:	('0'..'9')+   ( '.' ('0'..'9')+  )?
        ;

WHITESPACE 
	: 	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } 
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
