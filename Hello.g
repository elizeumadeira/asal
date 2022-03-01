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

	T_FOR = 'for'
		;

	T_NEW = 'new'
		;
	
	T_BREAK = 'break'
		;

	T_NULL = 'null'
		;
}

@header {
	import java.util.Set;
	import java.util.HashSet;
	import java.io.PrintWriter;
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
				// System.out.println(tempToken.toString() + " " + token.getText());
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

		public String getLinhaTabela(String linha, String token, String tipo, String funcao, String valor){
			int length = 15;
			String celula = new String(new char[length]).replace('\0', ' ');
			String separador = " | ";
			// String space10 = new String(new char[length]).replace('\0', ' ');

			return 
				(linha + celula).substring(0, length) + separador +
				(token + celula).substring(0, length) + separador +
				(tipo + celula).substring(0, length) + separador +
				(funcao + celula).substring(0, length) + separador +
				(valor + celula).substring(0, length) + separador
				;
		}
	
    public static void main(String[] args) throws Exception {
        HelloLexer lex = new HelloLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
 
        HelloParser parser = new HelloParser(tokens);
 
        try {
            parser.program();

			System.out.println("tokens.size " + tokens.size());
			String ultTipo = "";
			String ultFuncao = "";
			String linha = parser.getLinhaTabela(
				"LINHA",
				"TOKEN",
				"TIPO",
				"FUNCAO",
				"VALOR"
			);

			// System.out.println(linha);
			PrintWriter writer;
			writer = new PrintWriter("Tabela de tokens " + args[0] + ".txt", "UTF-8");
			writer.println(linha);
			for (int i = 0; i < tokens.size(); i++) {
				Token token = tokens.get(i);
				if (token.getChannel() == parser.HIDDEN) {
					continue;
				}

				if (token.getChannel() == parser.HIDDEN) {
					continue;
				}
				
				if (token.getType() == -1 ) {
					continue;
				}

				if (parser.tokenNames[token.getType()].equals("FUNCAO")) {
					ultFuncao = token.getText();
				}

				if (parser.tokenNames[token.getType()].equals("TIPOS")) {
					ultTipo = token.getText();
				}

				// LinguagemToken tempToken = new LinguagemToken(ultFuncao, token.getText(), ultTipo);

				linha = parser.getLinhaTabela(
					token.getLine() + " ",
					parser.tokenNames[token.getType()],
					( parser.tokenNames[token.getType()].equals("ID") ?  ultTipo : "--"),
					( parser.tokenNames[token.getType()].equals("ID") ?  ultFuncao : "--"),
					token.getText()
				);
				writer.println(linha);
				// System.out.println(linha);
			}
			writer.close();

        } catch (RecognitionException e)  {
            e.printStackTrace();
        } catch (Exception e)  {
            e.printStackTrace();
        }
    }
}

program	:
	( statement | funclist )
	;
	
funcdef
	: T_DEF { adicionaFuncao(input.LT(1)); } FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES 
		T_ABRECHAVE 
				statelist
		T_FECHACHAVE 
	;

funclist : funcdef funclist | funcdef
	;

paramlist :  ( 
				TIPOS { adicionaToken(input.LT(1));} ID paramlist_linha
				// TIPOS  { adicionaToken(input.LT(1));} ID
			)?
	;

paramlist_linha: ( T_VIRGULA paramlist )?
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
	T_BREAK EOL |
	EOL)
	;

vardecl	
	: 
		{ setUltTipo(input.LT(1).getText()); } TIPOS 
		{ adicionaToken(input.LT(1));} ID (T_ABRECOLCHETE ( { verificaToken(input.LT(1));} ID | NUMERO ) T_FECHACOLCHETE)*
	;

lvalue
	: { verificaToken(input.LT(1));} ID
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
	:   ( ({ verificaToken(input.LT(1));} ID | TEXTO | expression) T_VIRGULA paramlistcall | ({ verificaToken(input.LT(1));} ID | TEXTO | expression) )?
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
	
ifstat	: T_IF  T_ABREPARENTESES expression T_FECHAPARENTESES statement
		 ( T_ELSE  statement )?
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
	: 	( '\t' | ' ' | '\r' | '\n' )+    { $channel = HIDDEN; } 
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
