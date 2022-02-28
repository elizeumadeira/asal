// $ANTLR 3.5.2 Hello.g 2022-02-28 14:53:38

	import java.util.Set;
	import java.util.HashSet;


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
		"T_ABREPARENTESES", "T_ATRIBUICAO", "T_BREAK", "T_COMPARACAO", "T_DEF", 
		"T_DIFERENTE", "T_DIVISAO", "T_E", "T_ELSE", "T_ELSEIF", "T_ESCREVA", 
		"T_FECHACHAVE", "T_FECHACOLCHETE", "T_FECHAPARENTESES", "T_FOR", "T_IF", 
		"T_MAIOR", "T_MAIOROUIGUAL", "T_MENOR", "T_MENOROUIGUAL", "T_MULTIPLICACAO", 
		"T_OU", "T_READ", "T_RETURN", "T_SOMA", "T_SUBTRACAO", "T_VIRGULA"
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
	public static final int T_COMPARACAO=17;
	public static final int T_DEF=18;
	public static final int T_DIFERENTE=19;
	public static final int T_DIVISAO=20;
	public static final int T_E=21;
	public static final int T_ELSE=22;
	public static final int T_ELSEIF=23;
	public static final int T_ESCREVA=24;
	public static final int T_FECHACHAVE=25;
	public static final int T_FECHACOLCHETE=26;
	public static final int T_FECHAPARENTESES=27;
	public static final int T_FOR=28;
	public static final int T_IF=29;
	public static final int T_MAIOR=30;
	public static final int T_MAIOROUIGUAL=31;
	public static final int T_MENOR=32;
	public static final int T_MENOROUIGUAL=33;
	public static final int T_MULTIPLICACAO=34;
	public static final int T_OU=35;
	public static final int T_READ=36;
	public static final int T_RETURN=37;
	public static final int T_SOMA=38;
	public static final int T_SUBTRACAO=39;
	public static final int T_VIRGULA=40;

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
		this.state.ruleMemo = new HashMap[73+1];


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



	// $ANTLR start "program"
	// Hello.g:185:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// Hello.g:185:9: ( ( statement | funclist ) )
			// Hello.g:186:2: ( statement | funclist )
			{
			// Hello.g:186:2: ( statement | funclist )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==EOL||LA1_0==ID||(LA1_0 >= TIPOS && LA1_0 <= T_ABRECHAVE)||LA1_0==T_BREAK||LA1_0==T_ESCREVA||(LA1_0 >= T_FOR && LA1_0 <= T_IF)||(LA1_0 >= T_READ && LA1_0 <= T_RETURN)) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF||LA1_0==T_DEF) ) {
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
					// Hello.g:186:4: statement
					{
					pushFollow(FOLLOW_statement_in_program633);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:186:16: funclist
					{
					pushFollow(FOLLOW_funclist_in_program637);
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



	// $ANTLR start "funclist"
	// Hello.g:189:1: funclist : ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )* ;
	public final void funclist() throws RecognitionException {
		int funclist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// Hello.g:190:2: ( ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )* )
			// Hello.g:191:3: ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )*
			{
			// Hello.g:191:3: ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==T_DEF) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Hello.g:192:17: T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE
					{
					match(input,T_DEF,FOLLOW_T_DEF_in_funclist670); if (state.failed) return;
					if ( state.backtracking==0 ) { adicionaFuncao(input.LT(1)); }
					match(input,FUNCAO,FOLLOW_FUNCAO_in_funclist674); if (state.failed) return;
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funclist701); if (state.failed) return;
					// Hello.g:194:33: ( TIPOS ID ( T_VIRGULA TIPOS ID )* )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==TIPOS) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// Hello.g:195:41: TIPOS ID ( T_VIRGULA TIPOS ID )*
							{
							if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
							match(input,TIPOS,FOLLOW_TIPOS_in_funclist781); if (state.failed) return;
							if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_funclist786); if (state.failed) return;
							// Hello.g:196:41: ( T_VIRGULA TIPOS ID )*
							loop2:
							while (true) {
								int alt2=2;
								int LA2_0 = input.LA(1);
								if ( (LA2_0==T_VIRGULA) ) {
									alt2=1;
								}

								switch (alt2) {
								case 1 :
									// Hello.g:196:42: T_VIRGULA TIPOS ID
									{
									match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_funclist829); if (state.failed) return;
									if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
									match(input,TIPOS,FOLLOW_TIPOS_in_funclist834); if (state.failed) return;
									if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
									match(input,ID,FOLLOW_ID_in_funclist839); if (state.failed) return;
									}
									break;

								default :
									break loop2;
								}
							}

							}
							break;

					}

					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funclist904); if (state.failed) return;
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funclist930); if (state.failed) return;
					// Hello.g:200:33: ( statement )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==EOL||LA4_0==ID||(LA4_0 >= TIPOS && LA4_0 <= T_ABRECHAVE)||LA4_0==T_BREAK||LA4_0==T_ESCREVA||(LA4_0 >= T_FOR && LA4_0 <= T_IF)||(LA4_0 >= T_READ && LA4_0 <= T_RETURN)) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Hello.g:200:34: statement
							{
							pushFollow(FOLLOW_statement_in_funclist966);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funclist994); if (state.failed) return;
					}
					break;

				default :
					break loop5;
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
			if ( state.backtracking>0 ) { memoize(input, 2, funclist_StartIndex); }

		}
	}
	// $ANTLR end "funclist"



	// $ANTLR start "statement"
	// Hello.g:205:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// Hello.g:206:2: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			// Hello.g:206:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			// Hello.g:206:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
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
			case T_ESCREVA:
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
					// Hello.g:206:4: vardecl EOL
					{
					pushFollow(FOLLOW_vardecl_in_statement1018);
					vardecl();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1020); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:207:2: atribstat EOL
					{
					pushFollow(FOLLOW_atribstat_in_statement1025);
					atribstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1027); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:208:2: printstat EOL
					{
					pushFollow(FOLLOW_printstat_in_statement1032);
					printstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1034); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:209:2: readstat EOL
					{
					pushFollow(FOLLOW_readstat_in_statement1040);
					readstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1042); if (state.failed) return;
					}
					break;
				case 5 :
					// Hello.g:210:2: returnstat EOL
					{
					pushFollow(FOLLOW_returnstat_in_statement1046);
					returnstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1048); if (state.failed) return;
					}
					break;
				case 6 :
					// Hello.g:211:2: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_statement1053);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Hello.g:212:2: forstat
					{
					pushFollow(FOLLOW_forstat_in_statement1058);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Hello.g:213:2: T_ABRECHAVE statelist T_FECHACHAVE
					{
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement1063); if (state.failed) return;
					pushFollow(FOLLOW_statelist_in_statement1065);
					statelist();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement1067); if (state.failed) return;
					}
					break;
				case 9 :
					// Hello.g:214:2: T_BREAK EOL
					{
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement1072); if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1074); if (state.failed) return;
					}
					break;
				case 10 :
					// Hello.g:215:2: EOL
					{
					match(input,EOL,FOLLOW_EOL_in_statement1079); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 3, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// Hello.g:218:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		int vardecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// Hello.g:219:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			// Hello.g:220:3: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl1097); if (state.failed) return;
			if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_vardecl1104); if (state.failed) return;
			// Hello.g:221:37: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==T_ABRECOLCHETE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Hello.g:221:38: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl1107); if (state.failed) return;
					// Hello.g:221:53: ( ID | NUMERO )
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
							// Hello.g:221:55: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_vardecl1113); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:221:91: NUMERO
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_vardecl1117); if (state.failed) return;
							}
							break;

					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl1121); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 4, vardecl_StartIndex); }

		}
	}
	// $ANTLR end "vardecl"



	// $ANTLR start "atribstat"
	// Hello.g:224:1: atribstat : ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		int atribstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// Hello.g:225:2: ( ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall | TEXTO ) )
			// Hello.g:226:2: ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall | TEXTO )
			{
			match(input,ID,FOLLOW_ID_in_atribstat1135); if (state.failed) return;
			// Hello.g:227:17: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==T_ABRECOLCHETE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Hello.g:227:18: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_atribstat1158); if (state.failed) return;
					if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_atribstat1169); if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat1189); if (state.failed) return;
			// Hello.g:229:17: ( expression | funccall | TEXTO )
			int alt10=3;
			switch ( input.LA(1) ) {
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
				{
				alt10=1;
				}
				break;
			case FUNCAO:
				{
				alt10=2;
				}
				break;
			case TEXTO:
				{
				alt10=3;
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
					// Hello.g:229:19: expression
					{
					pushFollow(FOLLOW_expression_in_atribstat1210);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:229:32: funccall
					{
					pushFollow(FOLLOW_funccall_in_atribstat1214);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:229:43: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat1218); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 5, atribstat_StartIndex); }

		}
	}
	// $ANTLR end "atribstat"



	// $ANTLR start "funccall"
	// Hello.g:232:1: funccall : FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// Hello.g:233:2: ( FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES )
			// Hello.g:233:4: FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES
			{
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall1231); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall1242); if (state.failed) return;
			// Hello.g:235:17: ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= ID && LA12_0 <= NUMERO)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Hello.g:235:19: ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )*
					{
					if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// Hello.g:236:17: ( T_VIRGULA ( ID | NUMERO ) )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==T_VIRGULA) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// Hello.g:236:18: T_VIRGULA ( ID | NUMERO )
							{
							match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_funccall1288); if (state.failed) return;
							if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
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

						default :
							break loop11;
						}
					}

					}
					break;

			}

			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall1311); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, funccall_StartIndex); }

		}
	}
	// $ANTLR end "funccall"



	// $ANTLR start "printstat"
	// Hello.g:240:1: printstat : T_ESCREVA ( ID | TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		int printstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// Hello.g:241:2: ( T_ESCREVA ( ID | TEXTO | expression ) )
			// Hello.g:241:4: T_ESCREVA ( ID | TEXTO | expression )
			{
			match(input,T_ESCREVA,FOLLOW_T_ESCREVA_in_printstat1322); if (state.failed) return;
			// Hello.g:241:13: ( ID | TEXTO | expression )
			int alt13=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA13_1 = input.LA(2);
				if ( (synpred25_Hello()) ) {
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
					// Hello.g:241:15: ID
					{
					match(input,ID,FOLLOW_ID_in_printstat1325); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:241:19: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1328); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:241:27: expression
					{
					pushFollow(FOLLOW_expression_in_printstat1332);
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
			if ( state.backtracking>0 ) { memoize(input, 7, printstat_StartIndex); }

		}
	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// Hello.g:244:1: readstat : T_READ ( ID | TEXTO | expression ) ;
	public final void readstat() throws RecognitionException {
		int readstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// Hello.g:245:2: ( T_READ ( ID | TEXTO | expression ) )
			// Hello.g:245:4: T_READ ( ID | TEXTO | expression )
			{
			match(input,T_READ,FOLLOW_T_READ_in_readstat1347); if (state.failed) return;
			// Hello.g:245:10: ( ID | TEXTO | expression )
			int alt14=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA14_1 = input.LA(2);
				if ( (synpred27_Hello()) ) {
					alt14=1;
				}
				else if ( (true) ) {
					alt14=3;
				}

				}
				break;
			case TEXTO:
				{
				alt14=2;
				}
				break;
			case NUMERO:
			case T_ABREPARENTESES:
				{
				alt14=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// Hello.g:245:12: ID
					{
					match(input,ID,FOLLOW_ID_in_readstat1350); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:245:16: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_readstat1353); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:245:24: expression
					{
					pushFollow(FOLLOW_expression_in_readstat1357);
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
			if ( state.backtracking>0 ) { memoize(input, 8, readstat_StartIndex); }

		}
	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// Hello.g:248:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// Hello.g:249:2: ( T_RETURN ( TEXTO | expression )? )
			// Hello.g:249:4: T_RETURN ( TEXTO | expression )?
			{
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1372); if (state.failed) return;
			// Hello.g:249:13: ( TEXTO | expression )?
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==TEXTO) ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= ID && LA15_0 <= NUMERO)||LA15_0==T_ABREPARENTESES) ) {
				alt15=2;
			}
			switch (alt15) {
				case 1 :
					// Hello.g:249:15: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1376); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:249:23: expression
					{
					pushFollow(FOLLOW_expression_in_returnstat1380);
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
			if ( state.backtracking>0 ) { memoize(input, 9, returnstat_StartIndex); }

		}
	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// Hello.g:252:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// Hello.g:252:8: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE )
			// Hello.g:252:10: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE
			{
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1394); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1397); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_ifstat1399);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1401); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1407); if (state.failed) return;
			// Hello.g:253:16: ( statement )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==EOL||LA16_0==ID||(LA16_0 >= TIPOS && LA16_0 <= T_ABRECHAVE)||LA16_0==T_BREAK||LA16_0==T_ESCREVA||(LA16_0 >= T_FOR && LA16_0 <= T_IF)||(LA16_0 >= T_READ && LA16_0 <= T_RETURN)) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Hello.g:253:17: statement
					{
					pushFollow(FOLLOW_statement_in_ifstat1410);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop16;
				}
			}

			// Hello.g:254:4: ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==T_FECHACHAVE) ) {
					int LA18_1 = input.LA(2);
					if ( (synpred33_Hello()) ) {
						alt18=1;
					}

				}

				switch (alt18) {
				case 1 :
					// Hello.g:254:6: T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )*
					{
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1419); if (state.failed) return;
					match(input,T_ELSEIF,FOLLOW_T_ELSEIF_in_ifstat1421); if (state.failed) return;
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1423); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_ifstat1425);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1427); if (state.failed) return;
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1429); if (state.failed) return;
					// Hello.g:254:86: ( statement )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==EOL||LA17_0==ID||(LA17_0 >= TIPOS && LA17_0 <= T_ABRECHAVE)||LA17_0==T_BREAK||LA17_0==T_ESCREVA||(LA17_0 >= T_FOR && LA17_0 <= T_IF)||(LA17_0 >= T_READ && LA17_0 <= T_RETURN)) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Hello.g:254:87: statement
							{
							pushFollow(FOLLOW_statement_in_ifstat1432);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop17;
						}
					}

					}
					break;

				default :
					break loop18;
				}
			}

			// Hello.g:255:4: ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==T_FECHACHAVE) ) {
				int LA20_1 = input.LA(2);
				if ( (synpred35_Hello()) ) {
					alt20=1;
				}
			}
			switch (alt20) {
				case 1 :
					// Hello.g:255:6: T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )*
					{
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1444); if (state.failed) return;
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat1446); if (state.failed) return;
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1448); if (state.failed) return;
					// Hello.g:255:38: ( statement )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==EOL||LA19_0==ID||(LA19_0 >= TIPOS && LA19_0 <= T_ABRECHAVE)||LA19_0==T_BREAK||LA19_0==T_ESCREVA||(LA19_0 >= T_FOR && LA19_0 <= T_IF)||(LA19_0 >= T_READ && LA19_0 <= T_RETURN)) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// Hello.g:255:39: statement
							{
							pushFollow(FOLLOW_statement_in_ifstat1451);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;

			}

			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1461); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, ifstat_StartIndex); }

		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "forstat"
	// Hello.g:259:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE ;
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// Hello.g:259:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE )
			// Hello.g:259:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE
			{
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1472); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1474); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1476);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1478); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_forstat1480);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1482); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1484);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1486); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1498); if (state.failed) return;
			// Hello.g:260:22: ( statement )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==EOL||LA21_0==ID||(LA21_0 >= TIPOS && LA21_0 <= T_ABRECHAVE)||LA21_0==T_BREAK||LA21_0==T_ESCREVA||(LA21_0 >= T_FOR && LA21_0 <= T_IF)||(LA21_0 >= T_READ && LA21_0 <= T_RETURN)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Hello.g:260:23: statement
					{
					pushFollow(FOLLOW_statement_in_forstat1501);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop21;
				}
			}

			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1505); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, forstat_StartIndex); }

		}
	}
	// $ANTLR end "forstat"



	// $ANTLR start "statelist"
	// Hello.g:263:1: statelist : ( statement )* ;
	public final void statelist() throws RecognitionException {
		int statelist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// Hello.g:263:11: ( ( statement )* )
			// Hello.g:263:13: ( statement )*
			{
			// Hello.g:263:13: ( statement )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==EOL||LA22_0==ID||(LA22_0 >= TIPOS && LA22_0 <= T_ABRECHAVE)||LA22_0==T_BREAK||LA22_0==T_ESCREVA||(LA22_0 >= T_FOR && LA22_0 <= T_IF)||(LA22_0 >= T_READ && LA22_0 <= T_RETURN)) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Hello.g:263:14: statement
					{
					pushFollow(FOLLOW_statement_in_statelist1518);
					statement();
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
			if ( state.backtracking>0 ) { memoize(input, 12, statelist_StartIndex); }

		}
	}
	// $ANTLR end "statelist"



	// $ANTLR start "expression"
	// Hello.g:266:1: expression : expression_linha ( ( T_E | T_OU ) expression_linha )* ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// Hello.g:266:12: ( expression_linha ( ( T_E | T_OU ) expression_linha )* )
			// Hello.g:266:14: expression_linha ( ( T_E | T_OU ) expression_linha )*
			{
			pushFollow(FOLLOW_expression_linha_in_expression1531);
			expression_linha();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:266:31: ( ( T_E | T_OU ) expression_linha )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==T_E||LA23_0==T_OU) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// Hello.g:266:33: ( T_E | T_OU ) expression_linha
					{
					if ( input.LA(1)==T_E||input.LA(1)==T_OU ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expression_linha_in_expression1545);
					expression_linha();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop23;
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
			if ( state.backtracking>0 ) { memoize(input, 13, expression_StartIndex); }

		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "expression_linha"
	// Hello.g:268:1: expression_linha : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void expression_linha() throws RecognitionException {
		int expression_linha_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// Hello.g:268:18: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			// Hello.g:268:20: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			pushFollow(FOLLOW_term_in_expression_linha1556);
			term();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:268:25: ( ( T_SOMA | T_SUBTRACAO ) term )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= T_SOMA && LA24_0 <= T_SUBTRACAO)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// Hello.g:268:26: ( T_SOMA | T_SUBTRACAO ) term
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
					pushFollow(FOLLOW_term_in_expression_linha1569);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop24;
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
			if ( state.backtracking>0 ) { memoize(input, 14, expression_linha_StartIndex); }

		}
	}
	// $ANTLR end "expression_linha"



	// $ANTLR start "term"
	// Hello.g:271:1: term : relational_expression ( ( T_MULTIPLICACAO | T_DIVISAO ) relational_expression )* ;
	public final void term() throws RecognitionException {
		int term_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// Hello.g:271:6: ( relational_expression ( ( T_MULTIPLICACAO | T_DIVISAO ) relational_expression )* )
			// Hello.g:271:8: relational_expression ( ( T_MULTIPLICACAO | T_DIVISAO ) relational_expression )*
			{
			pushFollow(FOLLOW_relational_expression_in_term1581);
			relational_expression();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:271:30: ( ( T_MULTIPLICACAO | T_DIVISAO ) relational_expression )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==T_DIVISAO||LA25_0==T_MULTIPLICACAO) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// Hello.g:271:31: ( T_MULTIPLICACAO | T_DIVISAO ) relational_expression
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
					pushFollow(FOLLOW_relational_expression_in_term1594);
					relational_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop25;
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
			if ( state.backtracking>0 ) { memoize(input, 15, term_StartIndex); }

		}
	}
	// $ANTLR end "term"



	// $ANTLR start "relational_expression"
	// Hello.g:274:1: relational_expression : relational_expression_2 ( ( T_MAIOR | T_MENOR ) relational_expression_2 )* ;
	public final void relational_expression() throws RecognitionException {
		int relational_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// Hello.g:274:23: ( relational_expression_2 ( ( T_MAIOR | T_MENOR ) relational_expression_2 )* )
			// Hello.g:274:25: relational_expression_2 ( ( T_MAIOR | T_MENOR ) relational_expression_2 )*
			{
			pushFollow(FOLLOW_relational_expression_2_in_relational_expression1607);
			relational_expression_2();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:274:49: ( ( T_MAIOR | T_MENOR ) relational_expression_2 )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==T_MAIOR||LA26_0==T_MENOR) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// Hello.g:274:50: ( T_MAIOR | T_MENOR ) relational_expression_2
					{
					if ( input.LA(1)==T_MAIOR||input.LA(1)==T_MENOR ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relational_expression_2_in_relational_expression1620);
					relational_expression_2();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop26;
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
			if ( state.backtracking>0 ) { memoize(input, 16, relational_expression_StartIndex); }

		}
	}
	// $ANTLR end "relational_expression"



	// $ANTLR start "relational_expression_2"
	// Hello.g:277:1: relational_expression_2 : equal_expression ( ( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression )* ;
	public final void relational_expression_2() throws RecognitionException {
		int relational_expression_2_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// Hello.g:277:25: ( equal_expression ( ( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression )* )
			// Hello.g:277:27: equal_expression ( ( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression )*
			{
			pushFollow(FOLLOW_equal_expression_in_relational_expression_21633);
			equal_expression();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:277:44: ( ( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==T_MAIOROUIGUAL||LA27_0==T_MENOROUIGUAL) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Hello.g:277:45: ( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression
					{
					if ( input.LA(1)==T_MAIOROUIGUAL||input.LA(1)==T_MENOROUIGUAL ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_equal_expression_in_relational_expression_21646);
					equal_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop27;
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
			if ( state.backtracking>0 ) { memoize(input, 17, relational_expression_2_StartIndex); }

		}
	}
	// $ANTLR end "relational_expression_2"



	// $ANTLR start "equal_expression"
	// Hello.g:280:1: equal_expression : unaryexpr ( ( T_COMPARACAO | T_DIFERENTE ) unaryexpr )* ;
	public final void equal_expression() throws RecognitionException {
		int equal_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// Hello.g:280:18: ( unaryexpr ( ( T_COMPARACAO | T_DIFERENTE ) unaryexpr )* )
			// Hello.g:280:21: unaryexpr ( ( T_COMPARACAO | T_DIFERENTE ) unaryexpr )*
			{
			pushFollow(FOLLOW_unaryexpr_in_equal_expression1660);
			unaryexpr();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:280:31: ( ( T_COMPARACAO | T_DIFERENTE ) unaryexpr )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==T_COMPARACAO||LA28_0==T_DIFERENTE) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Hello.g:280:32: ( T_COMPARACAO | T_DIFERENTE ) unaryexpr
					{
					if ( input.LA(1)==T_COMPARACAO||input.LA(1)==T_DIFERENTE ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryexpr_in_equal_expression1673);
					unaryexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop28;
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
			if ( state.backtracking>0 ) { memoize(input, 18, equal_expression_StartIndex); }

		}
	}
	// $ANTLR end "equal_expression"



	// $ANTLR start "unaryexpr"
	// Hello.g:283:1: unaryexpr : factor ( ( T_SOMA | T_SUBTRACAO ) factor )* ;
	public final void unaryexpr() throws RecognitionException {
		int unaryexpr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// Hello.g:283:11: ( factor ( ( T_SOMA | T_SUBTRACAO ) factor )* )
			// Hello.g:283:14: factor ( ( T_SOMA | T_SUBTRACAO ) factor )*
			{
			pushFollow(FOLLOW_factor_in_unaryexpr1687);
			factor();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:283:21: ( ( T_SOMA | T_SUBTRACAO ) factor )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( ((LA29_0 >= T_SOMA && LA29_0 <= T_SUBTRACAO)) ) {
					int LA29_1 = input.LA(2);
					if ( (synpred51_Hello()) ) {
						alt29=1;
					}

				}

				switch (alt29) {
				case 1 :
					// Hello.g:283:22: ( T_SOMA | T_SUBTRACAO ) factor
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
					pushFollow(FOLLOW_factor_in_unaryexpr1700);
					factor();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop29;
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
			if ( state.backtracking>0 ) { memoize(input, 19, unaryexpr_StartIndex); }

		}
	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "factor"
	// Hello.g:286:1: factor : ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		int factor_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// Hello.g:286:8: ( ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES ) )
			// Hello.g:286:10: ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES )
			{
			// Hello.g:286:10: ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES )
			int alt30=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt30=1;
				}
				break;
			case NUMERO:
				{
				alt30=2;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt30=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// Hello.g:286:12: ID
					{
					if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
					match(input,ID,FOLLOW_ID_in_factor1717); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:286:49: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1722); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:286:58: T_ABREPARENTESES expression T_FECHAPARENTESES
					{
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1726); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_factor1728);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1730); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 20, factor_StartIndex); }

		}
	}
	// $ANTLR end "factor"

	// $ANTLR start synpred25_Hello
	public final void synpred25_Hello_fragment() throws RecognitionException {
		// Hello.g:241:15: ( ID )
		// Hello.g:241:15: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred25_Hello1325); if (state.failed) return;
		}

	}
	// $ANTLR end synpred25_Hello

	// $ANTLR start synpred27_Hello
	public final void synpred27_Hello_fragment() throws RecognitionException {
		// Hello.g:245:12: ( ID )
		// Hello.g:245:12: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred27_Hello1350); if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_Hello

	// $ANTLR start synpred33_Hello
	public final void synpred33_Hello_fragment() throws RecognitionException {
		// Hello.g:254:6: ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )
		// Hello.g:254:6: T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )*
		{
		match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_synpred33_Hello1419); if (state.failed) return;
		match(input,T_ELSEIF,FOLLOW_T_ELSEIF_in_synpred33_Hello1421); if (state.failed) return;
		match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_synpred33_Hello1423); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred33_Hello1425);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_synpred33_Hello1427); if (state.failed) return;
		match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_synpred33_Hello1429); if (state.failed) return;
		// Hello.g:254:86: ( statement )*
		loop36:
		while (true) {
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EOL||LA36_0==ID||(LA36_0 >= TIPOS && LA36_0 <= T_ABRECHAVE)||LA36_0==T_BREAK||LA36_0==T_ESCREVA||(LA36_0 >= T_FOR && LA36_0 <= T_IF)||(LA36_0 >= T_READ && LA36_0 <= T_RETURN)) ) {
				alt36=1;
			}

			switch (alt36) {
			case 1 :
				// Hello.g:254:87: statement
				{
				pushFollow(FOLLOW_statement_in_synpred33_Hello1432);
				statement();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop36;
			}
		}

		}

	}
	// $ANTLR end synpred33_Hello

	// $ANTLR start synpred35_Hello
	public final void synpred35_Hello_fragment() throws RecognitionException {
		// Hello.g:255:6: ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )
		// Hello.g:255:6: T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )*
		{
		match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_synpred35_Hello1444); if (state.failed) return;
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred35_Hello1446); if (state.failed) return;
		match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_synpred35_Hello1448); if (state.failed) return;
		// Hello.g:255:38: ( statement )*
		loop37:
		while (true) {
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EOL||LA37_0==ID||(LA37_0 >= TIPOS && LA37_0 <= T_ABRECHAVE)||LA37_0==T_BREAK||LA37_0==T_ESCREVA||(LA37_0 >= T_FOR && LA37_0 <= T_IF)||(LA37_0 >= T_READ && LA37_0 <= T_RETURN)) ) {
				alt37=1;
			}

			switch (alt37) {
			case 1 :
				// Hello.g:255:39: statement
				{
				pushFollow(FOLLOW_statement_in_synpred35_Hello1451);
				statement();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop37;
			}
		}

		}

	}
	// $ANTLR end synpred35_Hello

	// $ANTLR start synpred51_Hello
	public final void synpred51_Hello_fragment() throws RecognitionException {
		// Hello.g:283:22: ( ( T_SOMA | T_SUBTRACAO ) factor )
		// Hello.g:283:22: ( T_SOMA | T_SUBTRACAO ) factor
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
		pushFollow(FOLLOW_factor_in_synpred51_Hello1700);
		factor();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred51_Hello

	// Delegated rules

	public final boolean synpred51_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred51_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred35_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred35_Hello_fragment(); // can never throw exception
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
	public final boolean synpred33_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred33_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statement_in_program633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funclist670 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funclist674 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funclist701 = new BitSet(new long[]{0x0000000008000800L});
	public static final BitSet FOLLOW_TIPOS_in_funclist781 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_funclist786 = new BitSet(new long[]{0x0000010008000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_funclist829 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_funclist834 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_funclist839 = new BitSet(new long[]{0x0000010008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funclist904 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funclist930 = new BitSet(new long[]{0x0000003031011920L});
	public static final BitSet FOLLOW_statement_in_funclist966 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funclist994 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_vardecl_in_statement1018 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement1025 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement1032 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement1040 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement1046 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement1063 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_statelist_in_statement1065 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement1072 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl1097 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl1104 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl1107 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_ID_in_vardecl1113 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_NUMERO_in_vardecl1117 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl1121 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_atribstat1135 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_atribstat1158 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_set_in_atribstat1160 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_atribstat1169 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat1189 = new BitSet(new long[]{0x0000000000004780L});
	public static final BitSet FOLLOW_expression_in_atribstat1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat1218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall1231 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall1242 = new BitSet(new long[]{0x0000000008000300L});
	public static final BitSet FOLLOW_set_in_funccall1263 = new BitSet(new long[]{0x0000010008000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_funccall1288 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_set_in_funccall1290 = new BitSet(new long[]{0x0000010008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ESCREVA_in_printstat1322 = new BitSet(new long[]{0x0000000000004700L});
	public static final BitSet FOLLOW_ID_in_printstat1325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1347 = new BitSet(new long[]{0x0000000000004700L});
	public static final BitSet FOLLOW_ID_in_readstat1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_readstat1353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_readstat1357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1372 = new BitSet(new long[]{0x0000000000004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1394 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1397 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1399 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1401 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1407 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1410 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1419 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_ELSEIF_in_ifstat1421 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1423 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1425 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1427 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1429 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1432 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1444 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat1446 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1448 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1451 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1472 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1474 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1476 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1478 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_in_forstat1480 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1482 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1484 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1486 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1498 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_statement_in_forstat1501 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist1518 = new BitSet(new long[]{0x0000003031011922L});
	public static final BitSet FOLLOW_expression_linha_in_expression1531 = new BitSet(new long[]{0x0000000800200002L});
	public static final BitSet FOLLOW_set_in_expression1535 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_linha_in_expression1545 = new BitSet(new long[]{0x0000000800200002L});
	public static final BitSet FOLLOW_term_in_expression_linha1556 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_set_in_expression_linha1559 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_term_in_expression_linha1569 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_relational_expression_in_term1581 = new BitSet(new long[]{0x0000000400100002L});
	public static final BitSet FOLLOW_set_in_term1584 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_relational_expression_in_term1594 = new BitSet(new long[]{0x0000000400100002L});
	public static final BitSet FOLLOW_relational_expression_2_in_relational_expression1607 = new BitSet(new long[]{0x0000000140000002L});
	public static final BitSet FOLLOW_set_in_relational_expression1610 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_relational_expression_2_in_relational_expression1620 = new BitSet(new long[]{0x0000000140000002L});
	public static final BitSet FOLLOW_equal_expression_in_relational_expression_21633 = new BitSet(new long[]{0x0000000280000002L});
	public static final BitSet FOLLOW_set_in_relational_expression_21636 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_equal_expression_in_relational_expression_21646 = new BitSet(new long[]{0x0000000280000002L});
	public static final BitSet FOLLOW_unaryexpr_in_equal_expression1660 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_set_in_equal_expression1663 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_unaryexpr_in_equal_expression1673 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1687 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_set_in_unaryexpr1690 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1700 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_ID_in_factor1717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1726 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_in_factor1728 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred25_Hello1325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred27_Hello1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_synpred33_Hello1419 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_ELSEIF_in_synpred33_Hello1421 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_synpred33_Hello1423 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_in_synpred33_Hello1425 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_synpred33_Hello1427 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_synpred33_Hello1429 = new BitSet(new long[]{0x0000003031011922L});
	public static final BitSet FOLLOW_statement_in_synpred33_Hello1432 = new BitSet(new long[]{0x0000003031011922L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_synpred35_Hello1444 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred35_Hello1446 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_synpred35_Hello1448 = new BitSet(new long[]{0x0000003031011922L});
	public static final BitSet FOLLOW_statement_in_synpred35_Hello1451 = new BitSet(new long[]{0x0000003031011922L});
	public static final BitSet FOLLOW_set_in_synpred51_Hello1690 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_factor_in_synpred51_Hello1700 = new BitSet(new long[]{0x0000000000000002L});
}
