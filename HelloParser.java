// $ANTLR 3.5.2 Hello.g 2022-02-28 13:08:10

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "EOL", "FUNCAO", "ID", "NUMERO", 
		"TEXTO", "TIPOS", "T_ABRECHAVE", "T_ABRECOLCHETE", "T_ABREPARENTESES", 
		"T_ATRIBUICAO", "T_BREAK", "T_COMPARACAO", "T_DEF", "T_DIFERENTE", "T_DIVISAO", 
		"T_E", "T_ELSE", "T_ESCREVA", "T_FECHACHAVE", "T_FECHACOLCHETE", "T_FECHAPARENTESES", 
		"T_FOR", "T_IF", "T_MAIOR", "T_MAIOROUIGUAL", "T_MENOR", "T_MENOROUIGUAL", 
		"T_MULTIPLICACAO", "T_OU", "T_READ", "T_RETURN", "T_SOMA", "T_SUBTRACAO", 
		"T_VIRGULA", "WHITESPACE"
	};
	public static final int EOF=-1;
	public static final int EOL=4;
	public static final int FUNCAO=5;
	public static final int ID=6;
	public static final int NUMERO=7;
	public static final int TEXTO=8;
	public static final int TIPOS=9;
	public static final int T_ABRECHAVE=10;
	public static final int T_ABRECOLCHETE=11;
	public static final int T_ABREPARENTESES=12;
	public static final int T_ATRIBUICAO=13;
	public static final int T_BREAK=14;
	public static final int T_COMPARACAO=15;
	public static final int T_DEF=16;
	public static final int T_DIFERENTE=17;
	public static final int T_DIVISAO=18;
	public static final int T_E=19;
	public static final int T_ELSE=20;
	public static final int T_ESCREVA=21;
	public static final int T_FECHACHAVE=22;
	public static final int T_FECHACOLCHETE=23;
	public static final int T_FECHAPARENTESES=24;
	public static final int T_FOR=25;
	public static final int T_IF=26;
	public static final int T_MAIOR=27;
	public static final int T_MAIOROUIGUAL=28;
	public static final int T_MENOR=29;
	public static final int T_MENOROUIGUAL=30;
	public static final int T_MULTIPLICACAO=31;
	public static final int T_OU=32;
	public static final int T_READ=33;
	public static final int T_RETURN=34;
	public static final int T_SOMA=35;
	public static final int T_SUBTRACAO=36;
	public static final int T_VIRGULA=37;
	public static final int WHITESPACE=38;

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
		this.state.ruleMemo = new HashMap[54+1];


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
	// Hello.g:182:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// Hello.g:182:9: ( ( statement | funclist ) )
			// Hello.g:183:2: ( statement | funclist )
			{
			// Hello.g:183:2: ( statement | funclist )
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
					// Hello.g:183:3: statement
					{
					pushFollow(FOLLOW_statement_in_program620);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:183:14: funclist
					{
					pushFollow(FOLLOW_funclist_in_program623);
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
	// Hello.g:186:1: funclist : ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )* ;
	public final void funclist() throws RecognitionException {
		int funclist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// Hello.g:187:2: ( ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )* )
			// Hello.g:188:3: ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )*
			{
			// Hello.g:188:3: ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==T_DEF) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Hello.g:191:17: T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE
					{
					match(input,T_DEF,FOLLOW_T_DEF_in_funclist690); if (state.failed) return;
					if ( state.backtracking==0 ) { adicionaFuncao(input.LT(1)); }
					match(input,FUNCAO,FOLLOW_FUNCAO_in_funclist694); if (state.failed) return;
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funclist721); if (state.failed) return;
					// Hello.g:193:33: ( TIPOS ID ( T_VIRGULA TIPOS ID )* )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==TIPOS) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// Hello.g:194:41: TIPOS ID ( T_VIRGULA TIPOS ID )*
							{
							if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
							match(input,TIPOS,FOLLOW_TIPOS_in_funclist801); if (state.failed) return;
							if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_funclist806); if (state.failed) return;
							// Hello.g:195:41: ( T_VIRGULA TIPOS ID )*
							loop2:
							while (true) {
								int alt2=2;
								int LA2_0 = input.LA(1);
								if ( (LA2_0==T_VIRGULA) ) {
									alt2=1;
								}

								switch (alt2) {
								case 1 :
									// Hello.g:195:42: T_VIRGULA TIPOS ID
									{
									match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_funclist849); if (state.failed) return;
									if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
									match(input,TIPOS,FOLLOW_TIPOS_in_funclist854); if (state.failed) return;
									if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
									match(input,ID,FOLLOW_ID_in_funclist859); if (state.failed) return;
									}
									break;

								default :
									break loop2;
								}
							}

							}
							break;

					}

					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funclist924); if (state.failed) return;
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funclist950); if (state.failed) return;
					// Hello.g:199:33: ( statement )+
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
							// Hello.g:199:34: statement
							{
							pushFollow(FOLLOW_statement_in_funclist986);
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

					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funclist1014); if (state.failed) return;
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
	// Hello.g:204:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// Hello.g:205:2: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			// Hello.g:205:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			// Hello.g:205:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
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
					// Hello.g:205:4: vardecl EOL
					{
					pushFollow(FOLLOW_vardecl_in_statement1038);
					vardecl();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1040); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:206:2: atribstat EOL
					{
					pushFollow(FOLLOW_atribstat_in_statement1045);
					atribstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1047); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:207:2: printstat EOL
					{
					pushFollow(FOLLOW_printstat_in_statement1052);
					printstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1054); if (state.failed) return;
					}
					break;
				case 4 :
					// Hello.g:208:2: readstat EOL
					{
					pushFollow(FOLLOW_readstat_in_statement1060);
					readstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1062); if (state.failed) return;
					}
					break;
				case 5 :
					// Hello.g:209:2: returnstat EOL
					{
					pushFollow(FOLLOW_returnstat_in_statement1066);
					returnstat();
					state._fsp--;
					if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1068); if (state.failed) return;
					}
					break;
				case 6 :
					// Hello.g:210:2: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_statement1073);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Hello.g:211:2: forstat
					{
					pushFollow(FOLLOW_forstat_in_statement1078);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Hello.g:212:2: T_ABRECHAVE statelist T_FECHACHAVE
					{
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement1083); if (state.failed) return;
					pushFollow(FOLLOW_statelist_in_statement1085);
					statelist();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement1087); if (state.failed) return;
					}
					break;
				case 9 :
					// Hello.g:213:2: T_BREAK EOL
					{
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement1092); if (state.failed) return;
					match(input,EOL,FOLLOW_EOL_in_statement1094); if (state.failed) return;
					}
					break;
				case 10 :
					// Hello.g:214:2: EOL
					{
					match(input,EOL,FOLLOW_EOL_in_statement1099); if (state.failed) return;
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
	// Hello.g:217:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		int vardecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// Hello.g:218:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			// Hello.g:219:2: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			if ( state.backtracking==0 ) { setUltTipo(input.LT(1).getText()); }
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl1116); if (state.failed) return;
			if ( state.backtracking==0 ) { adicionaToken(input.LT(1));}
			match(input,ID,FOLLOW_ID_in_vardecl1120); if (state.failed) return;
			// Hello.g:219:81: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==T_ABRECOLCHETE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Hello.g:219:82: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl1123); if (state.failed) return;
					// Hello.g:219:97: ( ID | NUMERO )
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
							// Hello.g:219:99: ID
							{
							if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
							match(input,ID,FOLLOW_ID_in_vardecl1129); if (state.failed) return;
							}
							break;
						case 2 :
							// Hello.g:219:135: NUMERO
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_vardecl1133); if (state.failed) return;
							}
							break;

					}

					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl1137); if (state.failed) return;
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
	// Hello.g:222:1: atribstat : ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall ) ;
	public final void atribstat() throws RecognitionException {
		int atribstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// Hello.g:223:2: ( ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall ) )
			// Hello.g:224:2: ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall )
			{
			match(input,ID,FOLLOW_ID_in_atribstat1151); if (state.failed) return;
			// Hello.g:225:17: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==T_ABRECOLCHETE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Hello.g:225:18: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_atribstat1174); if (state.failed) return;
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
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_atribstat1185); if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat1205); if (state.failed) return;
			// Hello.g:227:17: ( expression | funccall )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= ID && LA10_0 <= NUMERO)||LA10_0==T_ABREPARENTESES) ) {
				alt10=1;
			}
			else if ( (LA10_0==FUNCAO) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// Hello.g:227:19: expression
					{
					pushFollow(FOLLOW_expression_in_atribstat1226);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:227:32: funccall
					{
					pushFollow(FOLLOW_funccall_in_atribstat1230);
					funccall();
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
			if ( state.backtracking>0 ) { memoize(input, 5, atribstat_StartIndex); }

		}
	}
	// $ANTLR end "atribstat"



	// $ANTLR start "funccall"
	// Hello.g:230:1: funccall : FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// Hello.g:231:2: ( FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES )
			// Hello.g:231:4: FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES
			{
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall1243); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall1254); if (state.failed) return;
			// Hello.g:233:17: ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= ID && LA12_0 <= NUMERO)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Hello.g:233:19: ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )*
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
					// Hello.g:234:17: ( T_VIRGULA ( ID | NUMERO ) )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==T_VIRGULA) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// Hello.g:234:18: T_VIRGULA ( ID | NUMERO )
							{
							match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_funccall1300); if (state.failed) return;
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

			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall1323); if (state.failed) return;
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
	// Hello.g:238:1: printstat : T_ESCREVA ( ID | TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		int printstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// Hello.g:239:2: ( T_ESCREVA ( ID | TEXTO | expression ) )
			// Hello.g:239:4: T_ESCREVA ( ID | TEXTO | expression )
			{
			match(input,T_ESCREVA,FOLLOW_T_ESCREVA_in_printstat1334); if (state.failed) return;
			// Hello.g:239:13: ( ID | TEXTO | expression )
			int alt13=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA13_1 = input.LA(2);
				if ( (synpred24_Hello()) ) {
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
					// Hello.g:239:15: ID
					{
					match(input,ID,FOLLOW_ID_in_printstat1337); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:239:19: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1340); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:239:27: expression
					{
					pushFollow(FOLLOW_expression_in_printstat1344);
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
	// Hello.g:242:1: readstat : T_READ ( ID | TEXTO | expression ) ;
	public final void readstat() throws RecognitionException {
		int readstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// Hello.g:243:2: ( T_READ ( ID | TEXTO | expression ) )
			// Hello.g:243:4: T_READ ( ID | TEXTO | expression )
			{
			match(input,T_READ,FOLLOW_T_READ_in_readstat1359); if (state.failed) return;
			// Hello.g:243:10: ( ID | TEXTO | expression )
			int alt14=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA14_1 = input.LA(2);
				if ( (synpred26_Hello()) ) {
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
					// Hello.g:243:12: ID
					{
					match(input,ID,FOLLOW_ID_in_readstat1362); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:243:16: TEXTO
					{
					match(input,TEXTO,FOLLOW_TEXTO_in_readstat1365); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:243:24: expression
					{
					pushFollow(FOLLOW_expression_in_readstat1369);
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
	// Hello.g:246:1: returnstat : T_RETURN ( ID | NUMERO | TEXTO )? ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// Hello.g:247:2: ( T_RETURN ( ID | NUMERO | TEXTO )? )
			// Hello.g:247:4: T_RETURN ( ID | NUMERO | TEXTO )?
			{
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1384); if (state.failed) return;
			// Hello.g:247:13: ( ID | NUMERO | TEXTO )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( ((LA15_0 >= ID && LA15_0 <= TEXTO)) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// Hello.g:
					{
					if ( (input.LA(1) >= ID && input.LA(1) <= TEXTO) ) {
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
	// Hello.g:250:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( options {k=1; backtrack=false; } : T_ELSE statement )? ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// Hello.g:250:8: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( options {k=1; backtrack=false; } : T_ELSE statement )? )
			// Hello.g:250:10: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( options {k=1; backtrack=false; } : T_ELSE statement )?
			{
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1409); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1412); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_ifstat1414);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1416); if (state.failed) return;
			pushFollow(FOLLOW_statement_in_ifstat1418);
			statement();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:250:72: ( options {k=1; backtrack=false; } : T_ELSE statement )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==T_ELSE) ) {
				int LA16_1 = input.LA(2);
				if ( (true) ) {
					alt16=1;
				}
			}
			switch (alt16) {
				case 1 :
					// Hello.g:250:106: T_ELSE statement
					{
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat1434); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_ifstat1436);
					statement();
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
			if ( state.backtracking>0 ) { memoize(input, 10, ifstat_StartIndex); }

		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "forstat"
	// Hello.g:253:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE ;
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// Hello.g:253:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )
			// Hello.g:253:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE
			{
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1449); if (state.failed) return;
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1451); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1453);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1455); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_forstat1457);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,EOL,FOLLOW_EOL_in_forstat1459); if (state.failed) return;
			pushFollow(FOLLOW_atribstat_in_forstat1461);
			atribstat();
			state._fsp--;
			if (state.failed) return;
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1463); if (state.failed) return;
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1475); if (state.failed) return;
			// Hello.g:254:22: ( statement )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==EOL||LA17_0==ID||(LA17_0 >= TIPOS && LA17_0 <= T_ABRECHAVE)||LA17_0==T_BREAK||LA17_0==T_ESCREVA||(LA17_0 >= T_FOR && LA17_0 <= T_IF)||(LA17_0 >= T_READ && LA17_0 <= T_RETURN)) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// Hello.g:254:23: statement
					{
					pushFollow(FOLLOW_statement_in_forstat1478);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1482); if (state.failed) return;
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
	// Hello.g:257:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		int statelist_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// Hello.g:257:11: ( statement ( statelist )? )
			// Hello.g:258:2: statement ( statelist )?
			{
			pushFollow(FOLLOW_statement_in_statelist1496);
			statement();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:258:12: ( statelist )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==EOL||LA18_0==ID||(LA18_0 >= TIPOS && LA18_0 <= T_ABRECHAVE)||LA18_0==T_BREAK||LA18_0==T_ESCREVA||(LA18_0 >= T_FOR && LA18_0 <= T_IF)||(LA18_0 >= T_READ && LA18_0 <= T_RETURN)) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Hello.g:258:13: statelist
					{
					pushFollow(FOLLOW_statelist_in_statelist1499);
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
			if ( state.backtracking>0 ) { memoize(input, 12, statelist_StartIndex); }

		}
	}
	// $ANTLR end "statelist"



	// $ANTLR start "expression"
	// Hello.g:261:1: expression : expr_linha ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// Hello.g:262:2: ( expr_linha )
			// Hello.g:262:4: expr_linha
			{
			pushFollow(FOLLOW_expr_linha_in_expression1514);
			expr_linha();
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
			if ( state.backtracking>0 ) { memoize(input, 13, expression_StartIndex); }

		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "expr_linha"
	// Hello.g:265:1: expr_linha : termo ( ( T_SOMA | T_SUBTRACAO ) termo )* ;
	public final void expr_linha() throws RecognitionException {
		int expr_linha_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// Hello.g:265:12: ( termo ( ( T_SOMA | T_SUBTRACAO ) termo )* )
			// Hello.g:265:14: termo ( ( T_SOMA | T_SUBTRACAO ) termo )*
			{
			pushFollow(FOLLOW_termo_in_expr_linha1524);
			termo();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:265:20: ( ( T_SOMA | T_SUBTRACAO ) termo )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= T_SOMA && LA19_0 <= T_SUBTRACAO)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Hello.g:265:21: ( T_SOMA | T_SUBTRACAO ) termo
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
					pushFollow(FOLLOW_termo_in_expr_linha1537);
					termo();
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
			if ( state.backtracking>0 ) { memoize(input, 14, expr_linha_StartIndex); }

		}
	}
	// $ANTLR end "expr_linha"



	// $ANTLR start "termo"
	// Hello.g:268:1: termo : fator ( ( T_MULTIPLICACAO | T_DIVISAO ) fator )* ;
	public final void termo() throws RecognitionException {
		int termo_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// Hello.g:268:7: ( fator ( ( T_MULTIPLICACAO | T_DIVISAO ) fator )* )
			// Hello.g:268:9: fator ( ( T_MULTIPLICACAO | T_DIVISAO ) fator )*
			{
			pushFollow(FOLLOW_fator_in_termo1549);
			fator();
			state._fsp--;
			if (state.failed) return;
			// Hello.g:268:14: ( ( T_MULTIPLICACAO | T_DIVISAO ) fator )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==T_DIVISAO||LA20_0==T_MULTIPLICACAO) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// Hello.g:268:15: ( T_MULTIPLICACAO | T_DIVISAO ) fator
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
					pushFollow(FOLLOW_fator_in_termo1561);
					fator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop20;
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
			if ( state.backtracking>0 ) { memoize(input, 15, termo_StartIndex); }

		}
	}
	// $ANTLR end "termo"



	// $ANTLR start "fator"
	// Hello.g:271:1: fator : ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES );
	public final void fator() throws RecognitionException {
		int fator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// Hello.g:271:7: ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES )
			int alt21=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt21=1;
				}
				break;
			case NUMERO:
				{
				alt21=2;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt21=3;
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
					// Hello.g:271:9: ID
					{
					if ( state.backtracking==0 ) { verificaToken(input.LT(1));}
					match(input,ID,FOLLOW_ID_in_fator1575); if (state.failed) return;
					}
					break;
				case 2 :
					// Hello.g:271:46: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_fator1580); if (state.failed) return;
					}
					break;
				case 3 :
					// Hello.g:271:55: T_ABREPARENTESES expression T_FECHAPARENTESES
					{
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_fator1584); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_fator1586);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_fator1588); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 16, fator_StartIndex); }

		}
	}
	// $ANTLR end "fator"

	// $ANTLR start synpred24_Hello
	public final void synpred24_Hello_fragment() throws RecognitionException {
		// Hello.g:239:15: ( ID )
		// Hello.g:239:15: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred24_Hello1337); if (state.failed) return;
		}

	}
	// $ANTLR end synpred24_Hello

	// $ANTLR start synpred26_Hello
	public final void synpred26_Hello_fragment() throws RecognitionException {
		// Hello.g:243:12: ( ID )
		// Hello.g:243:12: ID
		{
		match(input,ID,FOLLOW_ID_in_synpred26_Hello1362); if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_Hello

	// Delegated rules

	public final boolean synpred26_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_Hello() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statement_in_program620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funclist690 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FUNCAO_in_funclist694 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funclist721 = new BitSet(new long[]{0x0000000001000200L});
	public static final BitSet FOLLOW_TIPOS_in_funclist801 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_funclist806 = new BitSet(new long[]{0x0000002001000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_funclist849 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_TIPOS_in_funclist854 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_funclist859 = new BitSet(new long[]{0x0000002001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funclist924 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funclist950 = new BitSet(new long[]{0x0000000606204650L});
	public static final BitSet FOLLOW_statement_in_funclist986 = new BitSet(new long[]{0x0000000606604650L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funclist1014 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_vardecl_in_statement1038 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement1045 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement1052 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement1060 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement1066 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement1073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement1083 = new BitSet(new long[]{0x0000000606204650L});
	public static final BitSet FOLLOW_statelist_in_statement1085 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement1092 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl1116 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_vardecl1120 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl1123 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_ID_in_vardecl1129 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_NUMERO_in_vardecl1133 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl1137 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_atribstat1151 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_atribstat1174 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_set_in_atribstat1176 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_atribstat1185 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat1205 = new BitSet(new long[]{0x00000000000010E0L});
	public static final BitSet FOLLOW_expression_in_atribstat1226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall1243 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall1254 = new BitSet(new long[]{0x00000000010000C0L});
	public static final BitSet FOLLOW_set_in_funccall1275 = new BitSet(new long[]{0x0000002001000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_funccall1300 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_set_in_funccall1302 = new BitSet(new long[]{0x0000002001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall1323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ESCREVA_in_printstat1334 = new BitSet(new long[]{0x00000000000011C0L});
	public static final BitSet FOLLOW_ID_in_printstat1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1359 = new BitSet(new long[]{0x00000000000011C0L});
	public static final BitSet FOLLOW_ID_in_readstat1362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_readstat1365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_readstat1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1384 = new BitSet(new long[]{0x00000000000001C2L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1409 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1412 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_expression_in_ifstat1414 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1416 = new BitSet(new long[]{0x0000000606204650L});
	public static final BitSet FOLLOW_statement_in_ifstat1418 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat1434 = new BitSet(new long[]{0x0000000606204650L});
	public static final BitSet FOLLOW_statement_in_ifstat1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1449 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1451 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_atribstat_in_forstat1453 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_forstat1455 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_expression_in_forstat1457 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_forstat1459 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_atribstat_in_forstat1461 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1463 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1475 = new BitSet(new long[]{0x0000000606204650L});
	public static final BitSet FOLLOW_statement_in_forstat1478 = new BitSet(new long[]{0x0000000606604650L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist1496 = new BitSet(new long[]{0x0000000606204652L});
	public static final BitSet FOLLOW_statelist_in_statelist1499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_linha_in_expression1514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termo_in_expr_linha1524 = new BitSet(new long[]{0x0000001800000002L});
	public static final BitSet FOLLOW_set_in_expr_linha1527 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_termo_in_expr_linha1537 = new BitSet(new long[]{0x0000001800000002L});
	public static final BitSet FOLLOW_fator_in_termo1549 = new BitSet(new long[]{0x0000000080040002L});
	public static final BitSet FOLLOW_set_in_termo1551 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_fator_in_termo1561 = new BitSet(new long[]{0x0000000080040002L});
	public static final BitSet FOLLOW_ID_in_fator1575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_fator1580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_fator1584 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_expression_in_fator1586 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_fator1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred24_Hello1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred26_Hello1362 = new BitSet(new long[]{0x0000000000000002L});
}
