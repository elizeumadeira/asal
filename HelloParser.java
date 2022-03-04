// $ANTLR 3.5.2 Hello.g 2022-03-04 19:25:08

	import java.util.Set;
	import java.util.HashSet;
	import java.io.PrintWriter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class HelloParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMENTARIO", "EOL", "ESPACO_BRANCO", 
		"FUNCAO", "ID", "NUMERO", "TEXTO", "TIPOS", "T_ABRECHAVE", "T_ABRECOLCHETE", 
		"T_ABREPARENTESES", "T_ATRIBUICAO", "T_BREAK", "T_DEF", "T_DIFERENTE", 
		"T_DIVISAO", "T_ELSE", "T_FECHACHAVE", "T_FECHACOLCHETE", "T_FECHAPARENTESES", 
		"T_FOR", "T_IF", "T_IGUAL", "T_MAIOR", "T_MAIOROUIGUAL", "T_MENOR", "T_MENOROUIGUAL", 
		"T_MULTIPLICACAO", "T_NEW", "T_NULL", "T_READ", "T_RETURN", "T_SOMA", 
		"T_SUBTRACAO", "T_VIRGULA", "T_WRITE"
	};
	public static final int EOF=-1;
	public static final int COMENTARIO=4;
	public static final int EOL=5;
	public static final int ESPACO_BRANCO=6;
	public static final int FUNCAO=7;
	public static final int ID=8;
	public static final int NUMERO=9;
	public static final int TEXTO=10;
	public static final int TIPOS=11;
	public static final int T_ABRECHAVE=12;
	public static final int T_ABRECOLCHETE=13;
	public static final int T_ABREPARENTESES=14;
	public static final int T_ATRIBUICAO=15;
	public static final int T_BREAK=16;
	public static final int T_DEF=17;
	public static final int T_DIFERENTE=18;
	public static final int T_DIVISAO=19;
	public static final int T_ELSE=20;
	public static final int T_FECHACHAVE=21;
	public static final int T_FECHACOLCHETE=22;
	public static final int T_FECHAPARENTESES=23;
	public static final int T_FOR=24;
	public static final int T_IF=25;
	public static final int T_IGUAL=26;
	public static final int T_MAIOR=27;
	public static final int T_MAIOROUIGUAL=28;
	public static final int T_MENOR=29;
	public static final int T_MENOROUIGUAL=30;
	public static final int T_MULTIPLICACAO=31;
	public static final int T_NEW=32;
	public static final int T_NULL=33;
	public static final int T_READ=34;
	public static final int T_RETURN=35;
	public static final int T_SOMA=36;
	public static final int T_SUBTRACAO=37;
	public static final int T_VIRGULA=38;
	public static final int T_WRITE=39;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public HelloParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public HelloParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return HelloParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Hello.g"; }


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



	// $ANTLR start "program"
	// Hello.g:251:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		try {
			// Hello.g:251:9: ( ( statement | funclist ) )
			// Hello.g:252:2: ( statement | funclist )
			{
			// Hello.g:252:2: ( statement | funclist )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==EOL||LA1_0==ID||(LA1_0 >= TIPOS && LA1_0 <= T_ABRECHAVE)||LA1_0==T_BREAK||(LA1_0 >= T_FOR && LA1_0 <= T_IF)||(LA1_0 >= T_READ && LA1_0 <= T_RETURN)||LA1_0==T_WRITE) ) {
				alt1=1;
			}
			else if ( (LA1_0==T_DEF) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// Hello.g:252:4: statement
					{
					pushFollow(FOLLOW_statement_in_program591);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:252:16: funclist
					{
					pushFollow(FOLLOW_funclist_in_program595);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "funclist"
	// Hello.g:255:1: funclist : funcdef funclist_linha ;
	public final void funclist() throws RecognitionException {
		try {
			// Hello.g:255:10: ( funcdef funclist_linha )
			// Hello.g:255:12: funcdef funclist_linha
			{
			pushFollow(FOLLOW_funcdef_in_funclist607);
			funcdef();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_funclist_linha_in_funclist609);
			funclist_linha();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funclist"



	// $ANTLR start "funclist_linha"
	// Hello.g:258:1: funclist_linha : ( funclist |);
	public final void funclist_linha() throws RecognitionException {
		try {
			// Hello.g:259:2: ( funclist |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==T_DEF) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF) ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Hello.g:259:4: funclist
					{
					pushFollow(FOLLOW_funclist_in_funclist_linha620);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:261:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funclist_linha"



	// $ANTLR start "funcdef"
	// Hello.g:263:1: funcdef : T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE ;
	public final void funcdef() throws RecognitionException {
		try {
			// Hello.g:264:2: ( T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE )
			// Hello.g:264:4: T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE
			{
			match(input,T_DEF,FOLLOW_T_DEF_in_funcdef637); if (state.failed) return;
			if ( state.backtracking==0 ) {adicionaFuncao(input.LT(1));}
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funcdef641); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funcdef643); if (state.failed) return;
			pushFollow(FOLLOW_paramlist_in_funcdef645);
			paramlist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funcdef647); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funcdef652); if (state.failed) return;
			pushFollow(FOLLOW_statelist_in_funcdef659);
			statelist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funcdef663); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funcdef"



	// $ANTLR start "paramlist"
	// Hello.g:271:1: paramlist : ( TIPOS ID paramlist_linha )? ;
	public final void paramlist() throws RecognitionException {
		try {
			// Hello.g:272:2: ( ( TIPOS ID paramlist_linha )? )
			// Hello.g:272:4: ( TIPOS ID paramlist_linha )?
			{
			// Hello.g:272:4: ( TIPOS ID paramlist_linha )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==TIPOS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Hello.g:272:6: TIPOS ID paramlist_linha
					{
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist679); if (state.failed) return;
					if ( state.backtracking==0 ) {adicionaToken(input.LT(1));}
					match(input,ID,FOLLOW_ID_in_paramlist683); if (state.failed) return;
					pushFollow(FOLLOW_paramlist_linha_in_paramlist685);
					paramlist_linha();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paramlist"



	// $ANTLR start "paramlist_linha"
	// Hello.g:275:1: paramlist_linha : ( T_VIRGULA paramlist |);
	public final void paramlist_linha() throws RecognitionException {
		try {
			// Hello.g:276:2: ( T_VIRGULA paramlist |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==T_VIRGULA) ) {
				alt4=1;
			}
			else if ( (LA4_0==EOF||LA4_0==T_FECHAPARENTESES) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Hello.g:276:4: T_VIRGULA paramlist
					{
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlist_linha699); if (state.failed) return;
					pushFollow(FOLLOW_paramlist_in_paramlist_linha701);
					paramlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:278:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paramlist_linha"



	// $ANTLR start "statelist"
	// Hello.g:280:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		try {
			// Hello.g:280:11: ( statement ( statelist )? )
			// Hello.g:280:13: statement ( statelist )?
			{
			pushFollow(FOLLOW_statement_in_statelist718);
			statement();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:280:23: ( statelist )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==EOL||LA5_0==ID||(LA5_0 >= TIPOS && LA5_0 <= T_ABRECHAVE)||LA5_0==T_BREAK||(LA5_0 >= T_FOR && LA5_0 <= T_IF)||(LA5_0 >= T_READ && LA5_0 <= T_RETURN)||LA5_0==T_WRITE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Hello.g:280:24: statelist
					{
					pushFollow(FOLLOW_statelist_in_statelist721);
					statelist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statelist"



	// $ANTLR start "statement"
	// Hello.g:283:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL );
	public final void statement() throws RecognitionException {
		try {
			// Hello.g:283:10: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			int alt6=10;
			switch ( input.LA(1) ) {
			case TIPOS:
				{
				alt6=1;
				}
				break;
			case ID:
				{
				alt6=2;
				}
				break;
			case T_WRITE:
				{
				alt6=3;
				}
				break;
			case T_READ:
				{
				alt6=4;
				}
				break;
			case T_RETURN:
				{
				alt6=5;
				}
				break;
			case T_IF:
				{
				alt6=6;
				}
				break;
			case T_FOR:
				{
				alt6=7;
				}
				break;
			case T_ABRECHAVE:
				{
				alt6=8;
				}
				break;
			case T_BREAK:
				{
				alt6=9;
				}
				break;
			case EOL:
				{
				alt6=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// Hello.g:284:3: vardecl EOL
					{
					pushFollow(FOLLOW_vardecl_in_statement734);
					vardecl();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement736); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:285:3: atribstat EOL
					{
					pushFollow(FOLLOW_atribstat_in_statement742);
					atribstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement744); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:286:3: printstat EOL
					{
					pushFollow(FOLLOW_printstat_in_statement750);
					printstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement752); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:287:3: readstat EOL
					{
					pushFollow(FOLLOW_readstat_in_statement759);
					readstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement761); if (state.failed) return;
					}
					break;
				case 5 :
					// Hello.g:288:3: returnstat EOL
					{
					pushFollow(FOLLOW_returnstat_in_statement766);
					returnstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement768); if (state.failed) return;
					}
					break;
				case 6 :
					// Hello.g:289:3: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_statement774);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Hello.g:290:3: forstat
					{
					pushFollow(FOLLOW_forstat_in_statement780);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Hello.g:291:3: T_ABRECHAVE statelist T_FECHACHAVE
					{
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement786); if (state.failed) return;
					pushFollow(FOLLOW_statelist_in_statement788);
					statelist();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement790); if (state.failed) return;
					}
					break;
				case 9 :
					// Hello.g:292:3: T_BREAK EOL
					{
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement796); if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement798); if (state.failed) return;
					}
					break;
				case 10 :
					// Hello.g:293:3: EOL
					{
					match(input,EOL,FOLLOW_EOL_in_statement804); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// Hello.g:296:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		try {
			// Hello.g:297:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			// Hello.g:298:3: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) {setUltTipo(input.LT(1).getText());}
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl821); if (state.failed) return;
			if ( state.backtracking==0 ) {adicionaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_vardecl828); if (state.failed) return;
			// Hello.g:299:36: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==T_ABRECOLCHETE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Hello.g:299:37: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl831); if (state.failed) return;
					// Hello.g:299:52: ( ID | NUMERO )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==ID) ) {
						alt7=1;
					}
					else if ( (LA7_0==NUMERO) ) {
						alt7=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// Hello.g:299:54: ID
							{
							if ( state.backtracking==0 ) {verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_vardecl837); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:299:89: NUMERO
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_vardecl841); if (state.failed) return;
							}
							break;

					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl845); if (state.failed) return;
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "vardecl"



	// $ANTLR start "lvalue"
	// Hello.g:302:1: lvalue : ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* ;
	public final void lvalue() throws RecognitionException {
		try {
			// Hello.g:303:2: ( ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* )
			// Hello.g:303:4: ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) {verificaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_lvalue860); if (state.failed) return;
			// Hello.g:304:3: ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==T_ABRECOLCHETE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Hello.g:304:5: T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_lvalue866); if (state.failed) return;
					// Hello.g:304:20: ( numexpression )
					// Hello.g:304:22: numexpression
					{
					pushFollow(FOLLOW_numexpression_in_lvalue870);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_lvalue874); if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lvalue"



	// $ANTLR start "atribstat"
	// Hello.g:307:1: atribstat : lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		try {
			// Hello.g:308:2: ( lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) )
			// Hello.g:309:2: lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO )
			{
			pushFollow(FOLLOW_lvalue_in_atribstat889);
			lvalue();
			state._fsp--;
			if (state.failed) return;
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat893); if (state.failed) return;
			// Hello.g:311:2: ( expression | allocexpression | funccall | TEXTO )
			int alt10=4;
			switch ( input.LA(1) ) {
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt10=1;
				}
				break;
			case T_NEW:
				{
				alt10=2;
				}
				break;
			case FUNCAO:
				{
				alt10=3;
				}
				break;
			case TEXTO:
				{
				alt10=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// Hello.g:311:4: expression
					{
					pushFollow(FOLLOW_expression_in_atribstat899);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:311:17: allocexpression
					{
					pushFollow(FOLLOW_allocexpression_in_atribstat903);
					allocexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:311:35: funccall
					{
					pushFollow(FOLLOW_funccall_in_atribstat907);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:311:46: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat911); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atribstat"



	// $ANTLR start "allocexpression"
	// Hello.g:314:1: allocexpression : T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ ;
	public final void allocexpression() throws RecognitionException {
		try {
			// Hello.g:314:17: ( T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ )
			// Hello.g:314:19: T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			{
			match(input,T_NEW,FOLLOW_T_NEW_in_allocexpression923); if (state.failed) return;
			match(input,TIPOS,FOLLOW_TIPOS_in_allocexpression925); if (state.failed) return;
			// Hello.g:314:31: ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==T_ABRECOLCHETE) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Hello.g:314:32: T_ABRECOLCHETE numexpression T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_allocexpression928); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_allocexpression930);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_allocexpression932); if (state.failed) return;
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "allocexpression"



	// $ANTLR start "funccall"
	// Hello.g:317:1: funccall : FUNCAO T_ABREPARENTESES paramlistcall T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		try {
			// Hello.g:318:2: ( FUNCAO T_ABREPARENTESES paramlistcall T_FECHAPARENTESES )
			// Hello.g:318:4: FUNCAO T_ABREPARENTESES paramlistcall T_FECHAPARENTESES
			{
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall945); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall956); if (state.failed) return;
			pushFollow(FOLLOW_paramlistcall_in_funccall975);
			paramlistcall();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall985); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funccall"



	// $ANTLR start "paramlistcall"
	// Hello.g:324:1: paramlistcall : ( TEXTO paramlistcall_linha | expression paramlistcall_linha |);
	public final void paramlistcall() throws RecognitionException {
		try {
			// Hello.g:325:2: ( TEXTO paramlistcall_linha | expression paramlistcall_linha |)
			int alt12=3;
			switch ( input.LA(1) ) {
			case TEXTO:
				{
				alt12=1;
				}
				break;
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt12=2;
				}
				break;
			case EOF:
			case T_FECHAPARENTESES:
				{
				alt12=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// Hello.g:325:4: TEXTO paramlistcall_linha
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall996); if (state.failed) return;
					pushFollow(FOLLOW_paramlistcall_linha_in_paramlistcall998);
					paramlistcall_linha();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:326:4: expression paramlistcall_linha
					{
					pushFollow(FOLLOW_expression_in_paramlistcall1004);
					expression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_paramlistcall_linha_in_paramlistcall1006);
					paramlistcall_linha();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:328:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paramlistcall"



	// $ANTLR start "paramlistcall_linha"
	// Hello.g:330:1: paramlistcall_linha : ( T_VIRGULA paramlistcall |);
	public final void paramlistcall_linha() throws RecognitionException {
		try {
			// Hello.g:331:2: ( T_VIRGULA paramlistcall |)
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==T_VIRGULA) ) {
				alt13=1;
			}
			else if ( (LA13_0==EOF||LA13_0==T_FECHAPARENTESES) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// Hello.g:332:2: T_VIRGULA paramlistcall
					{
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlistcall_linha1024); if (state.failed) return;
					pushFollow(FOLLOW_paramlistcall_in_paramlistcall_linha1026);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:334:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paramlistcall_linha"



	// $ANTLR start "printstat"
	// Hello.g:336:1: printstat : T_WRITE ( TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		try {
			// Hello.g:337:2: ( T_WRITE ( TEXTO | expression ) )
			// Hello.g:337:4: T_WRITE ( TEXTO | expression )
			{
			match(input,T_WRITE,FOLLOW_T_WRITE_in_printstat1042); if (state.failed) return;
			// Hello.g:337:12: ( TEXTO | expression )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==TEXTO) ) {
				alt14=1;
			}
			else if ( ((LA14_0 >= ID && LA14_0 <= NUMERO)||LA14_0==T_ABREPARENTESES||LA14_0==T_NULL||(LA14_0 >= T_SOMA && LA14_0 <= T_SUBTRACAO)) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// Hello.g:337:14: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1046); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:337:22: expression
					{
					pushFollow(FOLLOW_expression_in_printstat1050);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// Hello.g:340:1: readstat : T_READ lvalue ;
	public final void readstat() throws RecognitionException {
		try {
			// Hello.g:341:2: ( T_READ lvalue )
			// Hello.g:341:4: T_READ lvalue
			{
			match(input,T_READ,FOLLOW_T_READ_in_readstat1064); if (state.failed) return;
			pushFollow(FOLLOW_lvalue_in_readstat1066);
			lvalue();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// Hello.g:344:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		try {
			// Hello.g:345:2: ( T_RETURN ( TEXTO | expression )? )
			// Hello.g:345:4: T_RETURN ( TEXTO | expression )?
			{
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1078); if (state.failed) return;
			// Hello.g:345:13: ( TEXTO | expression )?
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==TEXTO) ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= ID && LA15_0 <= NUMERO)||LA15_0==T_ABREPARENTESES||LA15_0==T_NULL||(LA15_0 >= T_SOMA && LA15_0 <= T_SUBTRACAO)) ) {
				alt15=2;
			}
			switch (alt15) {
				case 1 :
					// Hello.g:345:15: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1082); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:345:23: expression
					{
					pushFollow(FOLLOW_expression_in_returnstat1086);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// Hello.g:348:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha ;
	public final void ifstat() throws RecognitionException {
		try {
			// Hello.g:349:2: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha )
			// Hello.g:349:4: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha
			{
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1102); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1104); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_ifstat1106);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1108); if (state.failed) return;
			pushFollow(FOLLOW_statement_in_ifstat1110);
			statement();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_ifstat_linha_in_ifstat1112);
			ifstat_linha();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "ifstat_linha"
	// Hello.g:352:1: ifstat_linha : ( T_ELSE statement |);
	public final void ifstat_linha() throws RecognitionException {
		try {
			// Hello.g:353:2: ( T_ELSE statement |)
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==T_ELSE) ) {
				int LA16_1 = input.LA(2);
				if ( (synpred28_Hello()) ) {
					alt16=1;
				}
				else if ( (true) ) {
					alt16=2;
				}

			}
			else if ( (LA16_0==EOL||LA16_0==ID||(LA16_0 >= TIPOS && LA16_0 <= T_ABRECHAVE)||LA16_0==T_BREAK||LA16_0==T_FECHACHAVE||(LA16_0 >= T_FOR && LA16_0 <= T_IF)||(LA16_0 >= T_READ && LA16_0 <= T_RETURN)||LA16_0==T_WRITE) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Hello.g:353:4: T_ELSE statement
					{
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat_linha1123); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_ifstat_linha1126);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:355:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifstat_linha"



	// $ANTLR start "forstat"
	// Hello.g:357:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES statement ;
	public final void forstat() throws RecognitionException {
		try {
			// Hello.g:357:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES statement )
			// Hello.g:357:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES statement
			{
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1142); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1144); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1146);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1148); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_forstat1150);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1152); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1154);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1156); if (state.failed) return;
			pushFollow(FOLLOW_statement_in_forstat1165);
			statement();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forstat"



	// $ANTLR start "expression"
	// Hello.g:361:1: expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? ;
	public final void expression() throws RecognitionException {
		try {
			// Hello.g:361:12: ( numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? )
			// Hello.g:361:14: numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			{
			pushFollow(FOLLOW_numexpression_in_expression1177);
			numexpression();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:361:28: ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==T_DIFERENTE||(LA17_0 >= T_IGUAL && LA17_0 <= T_MENOROUIGUAL)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// Hello.g:361:30: ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression
					{
					if ( input.LA(1)==T_DIFERENTE||(input.LA(1) >= T_IGUAL && input.LA(1) <= T_MENOROUIGUAL) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numexpression_in_expression1207);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "numexpression"
	// Hello.g:364:1: numexpression : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void numexpression() throws RecognitionException {
		try {
			// Hello.g:364:15: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			// Hello.g:364:17: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			pushFollow(FOLLOW_term_in_numexpression1219);
			term();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:364:22: ( ( T_SOMA | T_SUBTRACAO ) term )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= T_SOMA && LA18_0 <= T_SUBTRACAO)) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Hello.g:364:23: ( T_SOMA | T_SUBTRACAO ) term
					{
					if ( (input.LA(1) >= T_SOMA && input.LA(1) <= T_SUBTRACAO) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_numexpression1232);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "numexpression"



	// $ANTLR start "term"
	// Hello.g:367:1: term : unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* ;
	public final void term() throws RecognitionException {
		try {
			// Hello.g:367:6: ( unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* )
			// Hello.g:368:2: unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			{
			pushFollow(FOLLOW_unaryexpr_in_term1245);
			unaryexpr();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:368:12: ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==T_DIVISAO||LA19_0==T_MULTIPLICACAO) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Hello.g:368:14: ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr
					{
					if ( input.LA(1)==T_DIVISAO||input.LA(1)==T_MULTIPLICACAO ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryexpr_in_term1258);
					unaryexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "term"



	// $ANTLR start "unaryexpr"
	// Hello.g:371:1: unaryexpr : ( T_SOMA | T_SUBTRACAO )? factor ;
	public final void unaryexpr() throws RecognitionException {
		try {
			// Hello.g:371:11: ( ( T_SOMA | T_SUBTRACAO )? factor )
			// Hello.g:371:14: ( T_SOMA | T_SUBTRACAO )? factor
			{
			// Hello.g:371:14: ( T_SOMA | T_SUBTRACAO )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= T_SOMA && LA20_0 <= T_SUBTRACAO)) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Hello.g:
					{
					if ( (input.LA(1) >= T_SOMA && input.LA(1) <= T_SUBTRACAO) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_factor_in_unaryexpr1282);
			factor();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "factor"
	// Hello.g:374:1: factor : ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		try {
			// Hello.g:374:8: ( ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) )
			// Hello.g:374:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			{
			// Hello.g:374:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			int alt21=4;
			switch ( input.LA(1) ) {
			case NUMERO:
				{
				alt21=1;
				}
				break;
			case ID:
				{
				alt21=2;
				}
				break;
			case T_NULL:
				{
				alt21=3;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt21=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// Hello.g:374:12: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1294); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:374:21: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_factor1298);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:374:30: T_NULL
					{
					match(input,T_NULL,FOLLOW_T_NULL_in_factor1302); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:374:39: T_ABREPARENTESES numexpression T_FECHAPARENTESES
					{
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1306); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_factor1308);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1310); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "factor"

	// $ANTLR start synpred28_Hello
	public final void synpred28_Hello_fragment() throws RecognitionException {
		// Hello.g:353:4: ( T_ELSE statement )
		// Hello.g:353:4: T_ELSE statement
		{
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred28_Hello1123); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred28_Hello1126);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred28_Hello

	// Delegated rules

	public final boolean synpred28_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred28_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statement_in_program591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist607 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_linha_in_funclist609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_funclist_linha620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funcdef637 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funcdef641 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funcdef643 = new BitSet(new long[]{0x0000000000800800L});
	public static final BitSet FOLLOW_paramlist_in_funcdef645 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funcdef647 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funcdef652 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statelist_in_funcdef659 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funcdef663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist679 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist683 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlist_linha_in_paramlist685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlist_linha699 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_paramlist_linha701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist718 = new BitSet(new long[]{0x0000008C03011922L});
	public static final BitSet FOLLOW_statelist_in_statelist721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_statement734 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement742 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement750 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement759 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement766 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement786 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statelist_in_statement788 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement796 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl821 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl828 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl831 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_ID_in_vardecl837 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_NUMERO_in_vardecl841 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl845 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_lvalue860 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_lvalue866 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_lvalue870 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_lvalue874 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_lvalue_in_atribstat889 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat893 = new BitSet(new long[]{0x0000003300004780L});
	public static final BitSet FOLLOW_expression_in_atribstat899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocexpression_in_atribstat903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NEW_in_allocexpression923 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_allocexpression925 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_allocexpression928 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_allocexpression930 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_allocexpression932 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall945 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall956 = new BitSet(new long[]{0x0000003200804700L});
	public static final BitSet FOLLOW_paramlistcall_in_funccall975 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall996 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlistcall_linha_in_paramlistcall998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1004 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlistcall_linha_in_paramlistcall1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlistcall_linha1024 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_paramlistcall_in_paramlistcall_linha1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WRITE_in_printstat1042 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1064 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_lvalue_in_readstat1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1078 = new BitSet(new long[]{0x0000003200004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1102 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1104 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1106 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1108 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1110 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ifstat_linha_in_ifstat1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat_linha1123 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_ifstat_linha1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1142 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1144 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1146 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1148 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_expression_in_forstat1150 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1152 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1154 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1156 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_forstat1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numexpression_in_expression1177 = new BitSet(new long[]{0x000000007C040002L});
	public static final BitSet FOLLOW_set_in_expression1181 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_expression1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numexpression1219 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_set_in_numexpression1222 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_term_in_numexpression1232 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_term1245 = new BitSet(new long[]{0x0000000080080002L});
	public static final BitSet FOLLOW_set_in_term1249 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_unaryexpr_in_term1258 = new BitSet(new long[]{0x0000000080080002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_factor1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NULL_in_factor1302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1306 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_factor1308 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred28_Hello1123 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_synpred28_Hello1126 = new BitSet(new long[]{0x0000000000000002L});
}
