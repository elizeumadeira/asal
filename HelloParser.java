// $ANTLR 3.5.2 Hello.g 2022-03-01 19:47:40

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
		this.state.ruleMemo = new HashMap[72+1];


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
	// Hello.g:252:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// Hello.g:252:9: ( ( statement | funclist ) )
			// Hello.g:253:2: ( statement | funclist )
			{
			// Hello.g:253:2: ( statement | funclist )
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
					// Hello.g:253:4: statement
					{
					pushFollow(FOLLOW_statement_in_program600);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:253:16: funclist
					{
					pushFollow(FOLLOW_funclist_in_program604);
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
			if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

		}
	}
	// $ANTLR end "program"



	// $ANTLR start "funcdef"
	// Hello.g:256:1: funcdef : T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE ;
	public final void funcdef() throws RecognitionException {
		int funcdef_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// Hello.g:257:2: ( T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE )
			// Hello.g:257:4: T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE
			{
			match(input,T_DEF,FOLLOW_T_DEF_in_funcdef618); if (state.failed) return;
			if ( state.backtracking==0 ) {adicionaFuncao(input.LT(1));}
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funcdef622); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funcdef624); if (state.failed) return;
			pushFollow(FOLLOW_paramlist_in_funcdef626);
			paramlist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funcdef628); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funcdef633); if (state.failed) return;
			pushFollow(FOLLOW_statelist_in_funcdef640);
			statelist();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funcdef644); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, funcdef_StartIndex); }

		}
	}
	// $ANTLR end "funcdef"



	// $ANTLR start "funclist"
	// Hello.g:263:1: funclist : ( funcdef funclist | funcdef );
	public final void funclist() throws RecognitionException {
		int funclist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// Hello.g:263:10: ( funcdef funclist | funcdef )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==T_DEF) ) {
				int LA2_1 = input.LA(2);
				if ( (synpred2_Hello()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Hello.g:263:12: funcdef funclist
					{
					pushFollow(FOLLOW_funcdef_in_funclist655);
					funcdef();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_funclist_in_funclist657);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:263:31: funcdef
					{
					pushFollow(FOLLOW_funcdef_in_funclist661);
					funcdef();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 3, funclist_StartIndex); }

		}
	}
	// $ANTLR end "funclist"



	// $ANTLR start "paramlist"
	// Hello.g:266:1: paramlist : ( TIPOS ID paramlist_linha )? ;
	public final void paramlist() throws RecognitionException {
		int paramlist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// Hello.g:267:2: ( ( TIPOS ID paramlist_linha )? )
			// Hello.g:267:4: ( TIPOS ID paramlist_linha )?
			{
			// Hello.g:267:4: ( TIPOS ID paramlist_linha )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==TIPOS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Hello.g:267:6: TIPOS ID paramlist_linha
					{
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist675); if (state.failed) return;
					if ( state.backtracking==0 ) {adicionaToken(input.LT(1));}
					match(input,ID,FOLLOW_ID_in_paramlist679); if (state.failed) return;
					pushFollow(FOLLOW_paramlist_linha_in_paramlist681);
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
			if ( state.backtracking>0 ) { memoize(input, 4, paramlist_StartIndex); }

		}
	}
	// $ANTLR end "paramlist"



	// $ANTLR start "paramlist_linha"
	// Hello.g:270:1: paramlist_linha : ( T_VIRGULA paramlist |);
	public final void paramlist_linha() throws RecognitionException {
		int paramlist_linha_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// Hello.g:271:2: ( T_VIRGULA paramlist |)
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
					// Hello.g:271:4: T_VIRGULA paramlist
					{
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlist_linha695); if (state.failed) return;
					pushFollow(FOLLOW_paramlist_in_paramlist_linha697);
					paramlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:273:2: 
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
			if ( state.backtracking>0 ) { memoize(input, 5, paramlist_linha_StartIndex); }

		}
	}
	// $ANTLR end "paramlist_linha"



	// $ANTLR start "statelist"
	// Hello.g:275:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		int statelist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// Hello.g:275:11: ( statement ( statelist )? )
			// Hello.g:275:13: statement ( statelist )?
			{
			pushFollow(FOLLOW_statement_in_statelist714);
			statement();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:275:23: ( statelist )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==EOL||LA5_0==ID||(LA5_0 >= TIPOS && LA5_0 <= T_ABRECHAVE)||LA5_0==T_BREAK||(LA5_0 >= T_FOR && LA5_0 <= T_IF)||(LA5_0 >= T_READ && LA5_0 <= T_RETURN)||LA5_0==T_WRITE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Hello.g:275:24: statelist
					{
					pushFollow(FOLLOW_statelist_in_statelist717);
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
			if ( state.backtracking>0 ) { memoize(input, 6, statelist_StartIndex); }

		}
	}
	// $ANTLR end "statelist"



	// $ANTLR start "statement"
	// Hello.g:278:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// Hello.g:278:10: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			// Hello.g:279:2: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			// Hello.g:279:2: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
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
					// Hello.g:280:3: vardecl EOL
					{
					pushFollow(FOLLOW_vardecl_in_statement733);
					vardecl();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement735); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:281:3: atribstat EOL
					{
					pushFollow(FOLLOW_atribstat_in_statement741);
					atribstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement743); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:282:3: printstat EOL
					{
					pushFollow(FOLLOW_printstat_in_statement749);
					printstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement751); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:283:3: readstat EOL
					{
					pushFollow(FOLLOW_readstat_in_statement758);
					readstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement760); if (state.failed) return;
					}
					break;
				case 5 :
					// Hello.g:284:3: returnstat EOL
					{
					pushFollow(FOLLOW_returnstat_in_statement765);
					returnstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement767); if (state.failed) return;
					}
					break;
				case 6 :
					// Hello.g:285:3: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_statement773);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Hello.g:286:3: forstat
					{
					pushFollow(FOLLOW_forstat_in_statement779);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Hello.g:287:3: T_ABRECHAVE statelist T_FECHACHAVE
					{
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement785); if (state.failed) return;
					pushFollow(FOLLOW_statelist_in_statement787);
					statelist();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement789); if (state.failed) return;
					}
					break;
				case 9 :
					// Hello.g:288:3: T_BREAK EOL
					{
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement795); if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement797); if (state.failed) return;
					}
					break;
				case 10 :
					// Hello.g:289:3: EOL
					{
					match(input,EOL,FOLLOW_EOL_in_statement803); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 7, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// Hello.g:293:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		int vardecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// Hello.g:294:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			// Hello.g:295:3: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) {setUltTipo(input.LT(1).getText());}
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl823); if (state.failed) return;
			if ( state.backtracking==0 ) {adicionaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_vardecl830); if (state.failed) return;
			// Hello.g:296:36: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==T_ABRECOLCHETE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Hello.g:296:37: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl833); if (state.failed) return;
					// Hello.g:296:52: ( ID | NUMERO )
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
							// Hello.g:296:54: ID
							{
							if ( state.backtracking==0 ) {verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_vardecl839); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:296:89: NUMERO
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_vardecl843); if (state.failed) return;
							}
							break;

					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl847); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 8, vardecl_StartIndex); }

		}
	}
	// $ANTLR end "vardecl"



	// $ANTLR start "lvalue"
	// Hello.g:299:1: lvalue : ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* ;
	public final void lvalue() throws RecognitionException {
		int lvalue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// Hello.g:300:2: ( ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* )
			// Hello.g:300:4: ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) {verificaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_lvalue862); if (state.failed) return;
			// Hello.g:301:3: ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==T_ABRECOLCHETE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Hello.g:301:5: T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_lvalue868); if (state.failed) return;
					// Hello.g:301:20: ( numexpression )
					// Hello.g:301:22: numexpression
					{
					pushFollow(FOLLOW_numexpression_in_lvalue872);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_lvalue876); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 9, lvalue_StartIndex); }

		}
	}
	// $ANTLR end "lvalue"



	// $ANTLR start "atribstat"
	// Hello.g:304:1: atribstat : lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		int atribstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// Hello.g:305:2: ( lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) )
			// Hello.g:306:2: lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO )
			{
			pushFollow(FOLLOW_lvalue_in_atribstat891);
			lvalue();
			state._fsp--;
			if (state.failed) return;
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat897); if (state.failed) return;
			// Hello.g:308:2: ( expression | allocexpression | funccall | TEXTO )
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
					// Hello.g:308:4: expression
					{
					pushFollow(FOLLOW_expression_in_atribstat903);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:308:17: allocexpression
					{
					pushFollow(FOLLOW_allocexpression_in_atribstat907);
					allocexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:308:35: funccall
					{
					pushFollow(FOLLOW_funccall_in_atribstat911);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:308:46: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat915); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 10, atribstat_StartIndex); }

		}
	}
	// $ANTLR end "atribstat"



	// $ANTLR start "allocexpression"
	// Hello.g:311:1: allocexpression : T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ ;
	public final void allocexpression() throws RecognitionException {
		int allocexpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// Hello.g:311:17: ( T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ )
			// Hello.g:311:19: T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			{
			match(input,T_NEW,FOLLOW_T_NEW_in_allocexpression927); if (state.failed) return;
			match(input,TIPOS,FOLLOW_TIPOS_in_allocexpression929); if (state.failed) return;
			// Hello.g:311:31: ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
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
					// Hello.g:311:32: T_ABRECOLCHETE numexpression T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_allocexpression932); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_allocexpression934);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_allocexpression936); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 11, allocexpression_StartIndex); }

		}
	}
	// $ANTLR end "allocexpression"



	// $ANTLR start "funccall"
	// Hello.g:314:1: funccall : FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// Hello.g:315:2: ( FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES )
			// Hello.g:315:4: FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES
			{
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall949); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall960); if (state.failed) return;
			// Hello.g:317:17: ( paramlistcall )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==T_FECHAPARENTESES) ) {
				int LA12_1 = input.LA(2);
				if ( (synpred22_Hello()) ) {
					alt12=1;
				}
			}
			else if ( ((LA12_0 >= ID && LA12_0 <= TEXTO)||LA12_0==T_ABREPARENTESES||LA12_0==T_NULL||(LA12_0 >= T_SOMA && LA12_0 <= T_SUBTRACAO)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Hello.g:317:19: paramlistcall
					{
					pushFollow(FOLLOW_paramlistcall_in_funccall981);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall994); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, funccall_StartIndex); }

		}
	}
	// $ANTLR end "funccall"



	// $ANTLR start "paramlistcall"
	// Hello.g:321:1: paramlistcall : ( ( ID | TEXTO | expression ) paramlistcall_linha )? ;
	public final void paramlistcall() throws RecognitionException {
		int paramlistcall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// Hello.g:322:2: ( ( ( ID | TEXTO | expression ) paramlistcall_linha )? )
			// Hello.g:322:6: ( ( ID | TEXTO | expression ) paramlistcall_linha )?
			{
			// Hello.g:322:6: ( ( ID | TEXTO | expression ) paramlistcall_linha )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= ID && LA14_0 <= TEXTO)||LA14_0==T_ABREPARENTESES||LA14_0==T_NULL||(LA14_0 >= T_SOMA && LA14_0 <= T_SUBTRACAO)) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// Hello.g:323:5: ( ID | TEXTO | expression ) paramlistcall_linha
					{
					// Hello.g:323:5: ( ID | TEXTO | expression )
					int alt13=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						int LA13_1 = input.LA(2);
						if ( (synpred23_Hello()) ) {
							alt13=1;
						}
						else if ( (true) ) {
							alt13=3;
						}

						}
						break;
					case TEXTO:
						{
						alt13=2;
						}
						break;
					case NUMERO:
					case T_ABREPARENTESES:
					case T_NULL:
					case T_SOMA:
					case T_SUBTRACAO:
						{
						alt13=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// Hello.g:323:6: ID
							{
							if ( state.backtracking==0 ) {verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_paramlistcall1016); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:323:41: TEXTO
							{
							match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1020); if (state.failed) return;
							}
							break;
						case 3 :
							// Hello.g:323:49: expression
							{
							pushFollow(FOLLOW_expression_in_paramlistcall1024);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_paramlistcall_linha_in_paramlistcall1027);
					paramlistcall_linha();
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
			if ( state.backtracking>0 ) { memoize(input, 13, paramlistcall_StartIndex); }

		}
	}
	// $ANTLR end "paramlistcall"



	// $ANTLR start "paramlistcall_linha"
	// Hello.g:327:1: paramlistcall_linha : ( T_VIRGULA paramlistcall |);
	public final void paramlistcall_linha() throws RecognitionException {
		int paramlistcall_linha_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// Hello.g:328:2: ( T_VIRGULA paramlistcall |)
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==T_VIRGULA) ) {
				alt15=1;
			}
			else if ( (LA15_0==EOF||LA15_0==T_FECHAPARENTESES) ) {
				alt15=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// Hello.g:329:2: T_VIRGULA paramlistcall
					{
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlistcall_linha1044); if (state.failed) return;
					pushFollow(FOLLOW_paramlistcall_in_paramlistcall_linha1046);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:331:2: 
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
			if ( state.backtracking>0 ) { memoize(input, 14, paramlistcall_linha_StartIndex); }

		}
	}
	// $ANTLR end "paramlistcall_linha"



	// $ANTLR start "printstat"
	// Hello.g:333:1: printstat : T_WRITE ( lvalue | TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		int printstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// Hello.g:334:2: ( T_WRITE ( lvalue | TEXTO | expression ) )
			// Hello.g:334:4: T_WRITE ( lvalue | TEXTO | expression )
			{
			match(input,T_WRITE,FOLLOW_T_WRITE_in_printstat1062); if (state.failed) return;
			// Hello.g:334:12: ( lvalue | TEXTO | expression )
			int alt16=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA16_1 = input.LA(2);
				if ( (synpred27_Hello()) ) {
					alt16=1;
				}
				else if ( (true) ) {
					alt16=3;
				}

				}
				break;
			case TEXTO:
				{
				alt16=2;
				}
				break;
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt16=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// Hello.g:334:14: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_printstat1066);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:334:23: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1070); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:334:31: expression
					{
					pushFollow(FOLLOW_expression_in_printstat1074);
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
			if ( state.backtracking>0 ) { memoize(input, 15, printstat_StartIndex); }

		}
	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// Hello.g:337:1: readstat : T_READ lvalue ;
	public final void readstat() throws RecognitionException {
		int readstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// Hello.g:338:2: ( T_READ lvalue )
			// Hello.g:338:4: T_READ lvalue
			{
			match(input,T_READ,FOLLOW_T_READ_in_readstat1088); if (state.failed) return;
			pushFollow(FOLLOW_lvalue_in_readstat1090);
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
			if ( state.backtracking>0 ) { memoize(input, 16, readstat_StartIndex); }

		}
	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// Hello.g:341:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// Hello.g:342:2: ( T_RETURN ( TEXTO | expression )? )
			// Hello.g:342:4: T_RETURN ( TEXTO | expression )?
			{
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1102); if (state.failed) return;
			// Hello.g:342:13: ( TEXTO | expression )?
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==TEXTO) ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= ID && LA17_0 <= NUMERO)||LA17_0==T_ABREPARENTESES||LA17_0==T_NULL||(LA17_0 >= T_SOMA && LA17_0 <= T_SUBTRACAO)) ) {
				alt17=2;
			}
			switch (alt17) {
				case 1 :
					// Hello.g:342:15: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1106); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:342:23: expression
					{
					pushFollow(FOLLOW_expression_in_returnstat1110);
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
			if ( state.backtracking>0 ) { memoize(input, 17, returnstat_StartIndex); }

		}
	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// Hello.g:345:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// Hello.g:346:2: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha )
			// Hello.g:346:4: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha
			{
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1126); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1128); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_ifstat1130);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1132); if (state.failed) return;
			pushFollow(FOLLOW_statement_in_ifstat1134);
			statement();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_ifstat_linha_in_ifstat1136);
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
			if ( state.backtracking>0 ) { memoize(input, 18, ifstat_StartIndex); }

		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "ifstat_linha"
	// Hello.g:349:1: ifstat_linha : ( T_ELSE statement |);
	public final void ifstat_linha() throws RecognitionException {
		int ifstat_linha_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// Hello.g:350:2: ( T_ELSE statement |)
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==T_ELSE) ) {
				int LA18_1 = input.LA(2);
				if ( (synpred31_Hello()) ) {
					alt18=1;
				}
				else if ( (true) ) {
					alt18=2;
				}

			}
			else if ( (LA18_0==EOL||LA18_0==ID||(LA18_0 >= TIPOS && LA18_0 <= T_ABRECHAVE)||LA18_0==T_BREAK||LA18_0==T_FECHACHAVE||(LA18_0 >= T_FOR && LA18_0 <= T_IF)||(LA18_0 >= T_READ && LA18_0 <= T_RETURN)||LA18_0==T_WRITE) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// Hello.g:350:4: T_ELSE statement
					{
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat_linha1147); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_ifstat_linha1150);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:352:2: 
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
			if ( state.backtracking>0 ) { memoize(input, 19, ifstat_linha_StartIndex); }

		}
	}
	// $ANTLR end "ifstat_linha"



	// $ANTLR start "forstat"
	// Hello.g:354:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE ;
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// Hello.g:354:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE )
			// Hello.g:354:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE
			{
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1166); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1168); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1170);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1172); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_forstat1174);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1176); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1178);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1180); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1192); if (state.failed) return;
			// Hello.g:355:22: ( statement )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==EOL||LA19_0==ID||(LA19_0 >= TIPOS && LA19_0 <= T_ABRECHAVE)||LA19_0==T_BREAK||(LA19_0 >= T_FOR && LA19_0 <= T_IF)||(LA19_0 >= T_READ && LA19_0 <= T_RETURN)||LA19_0==T_WRITE) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Hello.g:355:23: statement
					{
					pushFollow(FOLLOW_statement_in_forstat1195);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}

			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1199); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, forstat_StartIndex); }

		}
	}
	// $ANTLR end "forstat"



	// $ANTLR start "expression"
	// Hello.g:358:1: expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// Hello.g:358:12: ( numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? )
			// Hello.g:358:14: numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			{
			pushFollow(FOLLOW_numexpression_in_expression1211);
			numexpression();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:358:28: ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==T_DIFERENTE||(LA20_0 >= T_IGUAL && LA20_0 <= T_MENOROUIGUAL)) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Hello.g:358:30: ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression
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
					pushFollow(FOLLOW_numexpression_in_expression1241);
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
			if ( state.backtracking>0 ) { memoize(input, 21, expression_StartIndex); }

		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "numexpression"
	// Hello.g:361:1: numexpression : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void numexpression() throws RecognitionException {
		int numexpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// Hello.g:361:15: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			// Hello.g:361:17: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			pushFollow(FOLLOW_term_in_numexpression1253);
			term();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:361:22: ( ( T_SOMA | T_SUBTRACAO ) term )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= T_SOMA && LA21_0 <= T_SUBTRACAO)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Hello.g:361:23: ( T_SOMA | T_SUBTRACAO ) term
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
					pushFollow(FOLLOW_term_in_numexpression1266);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop21;
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
			if ( state.backtracking>0 ) { memoize(input, 22, numexpression_StartIndex); }

		}
	}
	// $ANTLR end "numexpression"



	// $ANTLR start "term"
	// Hello.g:364:1: term : unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* ;
	public final void term() throws RecognitionException {
		int term_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// Hello.g:364:6: ( unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* )
			// Hello.g:365:2: unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			{
			pushFollow(FOLLOW_unaryexpr_in_term1279);
			unaryexpr();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:365:12: ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==T_DIVISAO||LA22_0==T_MULTIPLICACAO) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Hello.g:365:14: ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr
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
					pushFollow(FOLLOW_unaryexpr_in_term1292);
					unaryexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
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
			if ( state.backtracking>0 ) { memoize(input, 23, term_StartIndex); }

		}
	}
	// $ANTLR end "term"



	// $ANTLR start "unaryexpr"
	// Hello.g:368:1: unaryexpr : ( T_SOMA | T_SUBTRACAO )? factor ;
	public final void unaryexpr() throws RecognitionException {
		int unaryexpr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// Hello.g:368:11: ( ( T_SOMA | T_SUBTRACAO )? factor )
			// Hello.g:368:14: ( T_SOMA | T_SUBTRACAO )? factor
			{
			// Hello.g:368:14: ( T_SOMA | T_SUBTRACAO )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= T_SOMA && LA23_0 <= T_SUBTRACAO)) ) {
				alt23=1;
			}
			switch (alt23) {
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

			pushFollow(FOLLOW_factor_in_unaryexpr1316);
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
			if ( state.backtracking>0 ) { memoize(input, 24, unaryexpr_StartIndex); }

		}
	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "factor"
	// Hello.g:371:1: factor : ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		int factor_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// Hello.g:371:8: ( ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) )
			// Hello.g:371:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			{
			// Hello.g:371:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			int alt24=4;
			switch ( input.LA(1) ) {
			case NUMERO:
				{
				alt24=1;
				}
				break;
			case ID:
				{
				alt24=2;
				}
				break;
			case T_NULL:
				{
				alt24=3;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt24=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// Hello.g:371:12: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1328); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:371:21: lvalue
					{
					pushFollow(FOLLOW_lvalue_in_factor1332);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:371:30: T_NULL
					{
					match(input,T_NULL,FOLLOW_T_NULL_in_factor1336); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:371:39: T_ABREPARENTESES numexpression T_FECHAPARENTESES
					{
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1340); if (state.failed) return;
					pushFollow(FOLLOW_numexpression_in_factor1342);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1344); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 25, factor_StartIndex); }

		}
	}
	// $ANTLR end "factor"

	// $ANTLR start synpred2_Hello
	public final void synpred2_Hello_fragment() throws RecognitionException {
		// Hello.g:263:12: ( funcdef funclist )
		// Hello.g:263:12: funcdef funclist
		{
		pushFollow(FOLLOW_funcdef_in_synpred2_Hello655);
		funcdef();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_funclist_in_synpred2_Hello657);
		funclist();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Hello

	// $ANTLR start synpred22_Hello
	public final void synpred22_Hello_fragment() throws RecognitionException {
		// Hello.g:317:19: ( paramlistcall )
		// Hello.g:317:19: paramlistcall
		{
		pushFollow(FOLLOW_paramlistcall_in_synpred22_Hello981);
		paramlistcall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred22_Hello

	// $ANTLR start synpred23_Hello
	public final void synpred23_Hello_fragment() throws RecognitionException {
		// Hello.g:323:6: ( ID )
		// Hello.g:323:6: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred23_Hello1016); if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_Hello

	// $ANTLR start synpred27_Hello
	public final void synpred27_Hello_fragment() throws RecognitionException {
		// Hello.g:334:14: ( lvalue )
		// Hello.g:334:14: lvalue
		{
		pushFollow(FOLLOW_lvalue_in_synpred27_Hello1066);
		lvalue();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_Hello

	// $ANTLR start synpred31_Hello
	public final void synpred31_Hello_fragment() throws RecognitionException {
		// Hello.g:350:4: ( T_ELSE statement )
		// Hello.g:350:4: T_ELSE statement
		{
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred31_Hello1147); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred31_Hello1150);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred31_Hello

	// Delegated rules

	public final boolean synpred22_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred31_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred31_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statement_in_program600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funcdef618 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funcdef622 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funcdef624 = new BitSet(new long[]{0x0000000000800800L});
	public static final BitSet FOLLOW_paramlist_in_funcdef626 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funcdef628 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funcdef633 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statelist_in_funcdef640 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funcdef644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist655 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_in_funclist657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist675 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist679 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlist_linha_in_paramlist681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlist_linha695 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_paramlist_linha697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist714 = new BitSet(new long[]{0x0000008C03011922L});
	public static final BitSet FOLLOW_statelist_in_statelist717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_statement733 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement741 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement749 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement758 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement765 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement785 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statelist_in_statement787 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement795 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl823 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl830 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl833 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_ID_in_vardecl839 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_NUMERO_in_vardecl843 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl847 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_lvalue862 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_lvalue868 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_lvalue872 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_lvalue876 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_lvalue_in_atribstat891 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat897 = new BitSet(new long[]{0x0000003300004780L});
	public static final BitSet FOLLOW_expression_in_atribstat903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocexpression_in_atribstat907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NEW_in_allocexpression927 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_allocexpression929 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_allocexpression932 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_allocexpression934 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_allocexpression936 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall949 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall960 = new BitSet(new long[]{0x0000003200804700L});
	public static final BitSet FOLLOW_paramlistcall_in_funccall981 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramlistcall1016 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1020 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1024 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlistcall_linha_in_paramlistcall1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlistcall_linha1044 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_paramlistcall_in_paramlistcall_linha1046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WRITE_in_printstat1062 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_lvalue_in_printstat1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1088 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_lvalue_in_readstat1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1102 = new BitSet(new long[]{0x0000003200004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1126 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1128 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1130 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1132 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1134 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ifstat_linha_in_ifstat1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat_linha1147 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_ifstat_linha1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1166 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1168 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1170 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1172 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_expression_in_forstat1174 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1176 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1178 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1180 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1192 = new BitSet(new long[]{0x0000008C03211920L});
	public static final BitSet FOLLOW_statement_in_forstat1195 = new BitSet(new long[]{0x0000008C03211920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numexpression_in_expression1211 = new BitSet(new long[]{0x000000007C040002L});
	public static final BitSet FOLLOW_set_in_expression1215 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_expression1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numexpression1253 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_set_in_numexpression1256 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_term_in_numexpression1266 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_term1279 = new BitSet(new long[]{0x0000000080080002L});
	public static final BitSet FOLLOW_set_in_term1283 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_unaryexpr_in_term1292 = new BitSet(new long[]{0x0000000080080002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_factor1332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NULL_in_factor1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1340 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_factor1342 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_synpred2_Hello655 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_in_synpred2_Hello657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramlistcall_in_synpred22_Hello981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred23_Hello1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred27_Hello1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred31_Hello1147 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_synpred31_Hello1150 = new BitSet(new long[]{0x0000000000000002L});
}
