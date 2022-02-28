// $ANTLR 3.5.1 C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g 2022-02-27 18:48:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class HelloParser extends DebugParser {
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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "expression", "synpred33_Hello", "synpred30_Hello", "synpred37_Hello", 
		"synpred15_Hello", "synpred19_Hello", "printstat", "atribstat", "synpred25_Hello", 
		"synpred38_Hello", "synpred36_Hello", "synpred9_Hello", "synpred29_Hello", 
		"synpred27_Hello", "synpred28_Hello", "synpred32_Hello", "funccall", "synpred20_Hello", 
		"synpred7_Hello", "synpred3_Hello", "returnstat", "funclist", "fator", 
		"program", "statement", "readstat", "synpred10_Hello", "synpred31_Hello", 
		"synpred2_Hello", "synpred4_Hello", "synpred23_Hello", "termo", "synpred21_Hello", 
		"synpred13_Hello", "synpred35_Hello", "synpred6_Hello", "synpred5_Hello", 
		"synpred14_Hello", "synpred22_Hello", "synpred8_Hello", "statelist", "synpred24_Hello", 
		"synpred16_Hello", "synpred11_Hello", "synpred1_Hello", "forstat", "synpred18_Hello", 
		"vardecl", "synpred26_Hello", "expr_linha", "synpred34_Hello", "ifstat", 
		"synpred17_Hello", "synpred12_Hello"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, true, true, false, false, false, false, false, false, false, 
		    false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public HelloParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public HelloParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[54+1];


		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public HelloParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
		this.state.ruleMemo = new HashMap[54+1];


	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return HelloParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g"; }


	    public static void main(String[] args) throws Exception {
	        HelloLexer lex = new HelloLexer(new ANTLRFileStream(args[0]));
	        CommonTokenStream tokens = new CommonTokenStream(lex);
	 
	        HelloParser parser = new HelloParser(tokens);
	 
	        try {
	            parser.program();
	        } catch (RecognitionException e)  {
	            e.printStackTrace();
	        }
	    }



	// $ANTLR start "program"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:113:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:113:9: ( ( statement | funclist ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:114:2: ( statement | funclist )
			{
			dbg.location(114,2);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:114:2: ( statement | funclist )
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:114:3: statement
					{
					dbg.location(114,3);
					pushFollow(FOLLOW_statement_in_program615);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:114:14: funclist
					{
					dbg.location(114,14);
					pushFollow(FOLLOW_funclist_in_program618);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

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
		dbg.location(115, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "funclist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:117:1: funclist : ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )* ;
	public final void funclist() throws RecognitionException {
		int funclist_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "funclist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:118:2: ( ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:119:3: ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )*
			{
			dbg.location(119,3);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:119:3: ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==T_DEF) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:122:17: T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE
					{
					dbg.location(122,17);
					match(input,T_DEF,FOLLOW_T_DEF_in_funclist685); if (state.failed) return;dbg.location(122,23);
					match(input,FUNCAO,FOLLOW_FUNCAO_in_funclist687); if (state.failed) return;dbg.location(123,25);
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funclist713); if (state.failed) return;dbg.location(124,33);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:124:33: ( TIPOS ID ( T_VIRGULA TIPOS ID )* )?
					int alt3=2;
					try { dbg.enterSubRule(3);
					try { dbg.enterDecision(3, decisionCanBacktrack[3]);

					int LA3_0 = input.LA(1);
					if ( (LA3_0==TIPOS) ) {
						alt3=1;
					}
					} finally {dbg.exitDecision(3);}

					switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:125:41: TIPOS ID ( T_VIRGULA TIPOS ID )*
							{
							dbg.location(125,41);
							match(input,TIPOS,FOLLOW_TIPOS_in_funclist791); if (state.failed) return;dbg.location(125,47);
							match(input,ID,FOLLOW_ID_in_funclist793); if (state.failed) return;dbg.location(126,41);
							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:126:41: ( T_VIRGULA TIPOS ID )*
							try { dbg.enterSubRule(2);

							loop2:
							while (true) {
								int alt2=2;
								try { dbg.enterDecision(2, decisionCanBacktrack[2]);

								int LA2_0 = input.LA(1);
								if ( (LA2_0==T_VIRGULA) ) {
									alt2=1;
								}

								} finally {dbg.exitDecision(2);}

								switch (alt2) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:126:42: T_VIRGULA TIPOS ID
									{
									dbg.location(126,42);
									match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_funclist836); if (state.failed) return;dbg.location(126,53);
									match(input,TIPOS,FOLLOW_TIPOS_in_funclist839); if (state.failed) return;dbg.location(126,59);
									match(input,ID,FOLLOW_ID_in_funclist841); if (state.failed) return;
									}
									break;

								default :
									break loop2;
								}
							}
							} finally {dbg.exitSubRule(2);}

							}
							break;

					}
					} finally {dbg.exitSubRule(3);}
					dbg.location(128,25);
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funclist906); if (state.failed) return;dbg.location(129,25);
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funclist932); if (state.failed) return;dbg.location(130,33);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:130:33: ( statement )+
					int cnt4=0;
					try { dbg.enterSubRule(4);

					loop4:
					while (true) {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( (LA4_0==EOL||LA4_0==ID||(LA4_0 >= TIPOS && LA4_0 <= T_ABRECHAVE)||LA4_0==T_BREAK||LA4_0==T_ESCREVA||(LA4_0 >= T_FOR && LA4_0 <= T_IF)||(LA4_0 >= T_READ && LA4_0 <= T_RETURN)) ) {
							alt4=1;
						}

						} finally {dbg.exitDecision(4);}

						switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:130:34: statement
							{
							dbg.location(130,34);
							pushFollow(FOLLOW_statement_in_funclist968);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(4, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt4++;
					}
					} finally {dbg.exitSubRule(4);}
					dbg.location(131,25);
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funclist996); if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

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
		dbg.location(133, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funclist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funclist"



	// $ANTLR start "statement"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:135:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(135, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:136:2: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:136:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			dbg.location(136,3);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:136:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			int alt6=10;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:136:4: vardecl EOL
					{
					dbg.location(136,4);
					pushFollow(FOLLOW_vardecl_in_statement1020);
					vardecl();
					state._fsp--;
					if (state.failed) return;dbg.location(136,12);
					match(input,EOL,FOLLOW_EOL_in_statement1022); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:137:2: atribstat EOL
					{
					dbg.location(137,2);
					pushFollow(FOLLOW_atribstat_in_statement1027);
					atribstat();
					state._fsp--;
					if (state.failed) return;dbg.location(137,12);
					match(input,EOL,FOLLOW_EOL_in_statement1029); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:138:2: printstat EOL
					{
					dbg.location(138,2);
					pushFollow(FOLLOW_printstat_in_statement1034);
					printstat();
					state._fsp--;
					if (state.failed) return;dbg.location(138,12);
					match(input,EOL,FOLLOW_EOL_in_statement1036); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:139:2: readstat EOL
					{
					dbg.location(139,2);
					pushFollow(FOLLOW_readstat_in_statement1042);
					readstat();
					state._fsp--;
					if (state.failed) return;dbg.location(139,11);
					match(input,EOL,FOLLOW_EOL_in_statement1044); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:140:2: returnstat EOL
					{
					dbg.location(140,2);
					pushFollow(FOLLOW_returnstat_in_statement1048);
					returnstat();
					state._fsp--;
					if (state.failed) return;dbg.location(140,13);
					match(input,EOL,FOLLOW_EOL_in_statement1050); if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:141:2: ifstat
					{
					dbg.location(141,2);
					pushFollow(FOLLOW_ifstat_in_statement1055);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:142:2: forstat
					{
					dbg.location(142,2);
					pushFollow(FOLLOW_forstat_in_statement1060);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:143:2: T_ABRECHAVE statelist T_FECHACHAVE
					{
					dbg.location(143,2);
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement1065); if (state.failed) return;dbg.location(143,14);
					pushFollow(FOLLOW_statelist_in_statement1067);
					statelist();
					state._fsp--;
					if (state.failed) return;dbg.location(143,24);
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement1069); if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:144:2: T_BREAK EOL
					{
					dbg.location(144,2);
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement1074); if (state.failed) return;dbg.location(144,10);
					match(input,EOL,FOLLOW_EOL_in_statement1076); if (state.failed) return;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:145:2: EOL
					{
					dbg.location(145,2);
					match(input,EOL,FOLLOW_EOL_in_statement1081); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

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
		dbg.location(146, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:148:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		int vardecl_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "vardecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(148, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:149:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:149:4: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			dbg.location(149,4);
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl1094); if (state.failed) return;dbg.location(149,10);
			match(input,ID,FOLLOW_ID_in_vardecl1096); if (state.failed) return;dbg.location(149,13);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:149:13: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==T_ABRECOLCHETE) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:149:14: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					dbg.location(149,14);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl1099); if (state.failed) return;dbg.location(149,29);
					if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(149,45);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl1111); if (state.failed) return;
					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}

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
		dbg.location(150, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vardecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "vardecl"



	// $ANTLR start "atribstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:152:1: atribstat : ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall ) ;
	public final void atribstat() throws RecognitionException {
		int atribstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "atribstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(152, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:153:2: ( ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:154:2: ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall )
			{
			dbg.location(154,2);
			match(input,ID,FOLLOW_ID_in_atribstat1125); if (state.failed) return;dbg.location(155,17);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:155:17: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==T_ABRECOLCHETE) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:155:18: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					dbg.location(155,18);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_atribstat1148); if (state.failed) return;dbg.location(155,33);
					if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(155,48);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_atribstat1159); if (state.failed) return;
					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(156,17);
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat1179); if (state.failed) return;dbg.location(157,17);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:157:17: ( expression | funccall )
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= ID && LA9_0 <= NUMERO)||LA9_0==T_ABREPARENTESES) ) {
				alt9=1;
			}
			else if ( (LA9_0==FUNCAO) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:157:19: expression
					{
					dbg.location(157,19);
					pushFollow(FOLLOW_expression_in_atribstat1200);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:157:32: funccall
					{
					dbg.location(157,32);
					pushFollow(FOLLOW_funccall_in_atribstat1204);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

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
		dbg.location(158, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribstat"



	// $ANTLR start "funccall"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:160:1: funccall : FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "funccall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(160, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:161:2: ( FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:161:4: FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES
			{
			dbg.location(161,4);
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall1217); if (state.failed) return;dbg.location(162,9);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall1228); if (state.failed) return;dbg.location(163,17);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:163:17: ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= ID && LA11_0 <= NUMERO)) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:163:19: ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )*
					{
					dbg.location(163,19);
					if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(164,17);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:164:17: ( T_VIRGULA ( ID | NUMERO ) )*
					try { dbg.enterSubRule(10);

					loop10:
					while (true) {
						int alt10=2;
						try { dbg.enterDecision(10, decisionCanBacktrack[10]);

						int LA10_0 = input.LA(1);
						if ( (LA10_0==T_VIRGULA) ) {
							alt10=1;
						}

						} finally {dbg.exitDecision(10);}

						switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:164:18: T_VIRGULA ( ID | NUMERO )
							{
							dbg.location(164,18);
							match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_funccall1274); if (state.failed) return;dbg.location(164,28);
							if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								dbg.recognitionException(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}
					} finally {dbg.exitSubRule(10);}

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(165,9);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall1297); if (state.failed) return;
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
		dbg.location(166, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funccall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funccall"



	// $ANTLR start "printstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:168:1: printstat : T_ESCREVA ( ID | TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		int printstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "printstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(168, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:169:2: ( T_ESCREVA ( ID | TEXTO | expression ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:169:4: T_ESCREVA ( ID | TEXTO | expression )
			{
			dbg.location(169,4);
			match(input,T_ESCREVA,FOLLOW_T_ESCREVA_in_printstat1308); if (state.failed) return;dbg.location(169,13);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:169:13: ( ID | TEXTO | expression )
			int alt12=3;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA12_1 = input.LA(2);
				if ( (synpred24_Hello()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=3;
				}

				}
				break;
			case TEXTO:
				{
				alt12=2;
				}
				break;
			case NUMERO:
			case T_ABREPARENTESES:
				{
				alt12=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:169:15: ID
					{
					dbg.location(169,15);
					match(input,ID,FOLLOW_ID_in_printstat1311); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:169:19: TEXTO
					{
					dbg.location(169,19);
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1314); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:169:27: expression
					{
					dbg.location(169,27);
					pushFollow(FOLLOW_expression_in_printstat1318);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

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
		dbg.location(170, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:172:1: readstat : T_READ ( ID | TEXTO | expression ) ;
	public final void readstat() throws RecognitionException {
		int readstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "readstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(172, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:173:2: ( T_READ ( ID | TEXTO | expression ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:173:4: T_READ ( ID | TEXTO | expression )
			{
			dbg.location(173,4);
			match(input,T_READ,FOLLOW_T_READ_in_readstat1333); if (state.failed) return;dbg.location(173,10);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:173:10: ( ID | TEXTO | expression )
			int alt13=3;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA13_1 = input.LA(2);
				if ( (synpred26_Hello()) ) {
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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:173:12: ID
					{
					dbg.location(173,12);
					match(input,ID,FOLLOW_ID_in_readstat1336); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:173:16: TEXTO
					{
					dbg.location(173,16);
					match(input,TEXTO,FOLLOW_TEXTO_in_readstat1339); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:173:24: expression
					{
					dbg.location(173,24);
					pushFollow(FOLLOW_expression_in_readstat1343);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

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
		dbg.location(174, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "readstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:176:1: returnstat : T_RETURN ( ID | NUMERO | TEXTO )? ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "returnstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(176, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:177:2: ( T_RETURN ( ID | NUMERO | TEXTO )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:177:4: T_RETURN ( ID | NUMERO | TEXTO )?
			{
			dbg.location(177,4);
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1358); if (state.failed) return;dbg.location(177,13);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:177:13: ( ID | NUMERO | TEXTO )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= ID && LA14_0 <= TEXTO)) ) {
				alt14=1;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:
					{
					dbg.location(177,13);
					if ( (input.LA(1) >= ID && input.LA(1) <= TEXTO) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}
					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

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
		dbg.location(178, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returnstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:180:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( options {k=1; backtrack=false; } : T_ELSE statement )? ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "ifstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(180, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:180:8: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( options {k=1; backtrack=false; } : T_ELSE statement )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:180:10: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( options {k=1; backtrack=false; } : T_ELSE statement )?
			{
			dbg.location(180,10);
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1383); if (state.failed) return;dbg.location(180,16);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1386); if (state.failed) return;dbg.location(180,33);
			pushFollow(FOLLOW_expression_in_ifstat1388);
			expression();
			state._fsp--;
			if (state.failed) return;dbg.location(180,44);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1390); if (state.failed) return;dbg.location(180,62);
			pushFollow(FOLLOW_statement_in_ifstat1392);
			statement();
			state._fsp--;
			if (state.failed) return;dbg.location(180,72);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:180:72: ( options {k=1; backtrack=false; } : T_ELSE statement )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==T_ELSE) ) {
				int LA15_1 = input.LA(2);
				if ( (true) ) {
					alt15=1;
				}
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:180:106: T_ELSE statement
					{
					dbg.location(180,106);
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat1408); if (state.failed) return;dbg.location(180,113);
					pushFollow(FOLLOW_statement_in_ifstat1410);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}

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
		dbg.location(181, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifstat"



	// $ANTLR start "forstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:183:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE ;
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "forstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(183, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:183:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:183:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE
			{
			dbg.location(183,11);
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1423); if (state.failed) return;dbg.location(183,17);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1425); if (state.failed) return;dbg.location(183,34);
			pushFollow(FOLLOW_atribstat_in_forstat1427);
			atribstat();
			state._fsp--;
			if (state.failed) return;dbg.location(183,44);
			match(input,EOL,FOLLOW_EOL_in_forstat1429); if (state.failed) return;dbg.location(183,48);
			pushFollow(FOLLOW_expression_in_forstat1431);
			expression();
			state._fsp--;
			if (state.failed) return;dbg.location(183,59);
			match(input,EOL,FOLLOW_EOL_in_forstat1433); if (state.failed) return;dbg.location(183,63);
			pushFollow(FOLLOW_atribstat_in_forstat1435);
			atribstat();
			state._fsp--;
			if (state.failed) return;dbg.location(183,73);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1437); if (state.failed) return;dbg.location(184,10);
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1449); if (state.failed) return;dbg.location(184,22);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:184:22: ( statement )+
			int cnt16=0;
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				int LA16_0 = input.LA(1);
				if ( (LA16_0==EOL||LA16_0==ID||(LA16_0 >= TIPOS && LA16_0 <= T_ABRECHAVE)||LA16_0==T_BREAK||LA16_0==T_ESCREVA||(LA16_0 >= T_FOR && LA16_0 <= T_IF)||(LA16_0 >= T_READ && LA16_0 <= T_RETURN)) ) {
					alt16=1;
				}

				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:184:23: statement
					{
					dbg.location(184,23);
					pushFollow(FOLLOW_statement_in_forstat1452);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(16, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt16++;
			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(184,35);
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1456); if (state.failed) return;
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
		dbg.location(185, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "forstat"



	// $ANTLR start "statelist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:187:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		int statelist_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statelist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(187, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:187:11: ( statement ( statelist )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:188:2: statement ( statelist )?
			{
			dbg.location(188,2);
			pushFollow(FOLLOW_statement_in_statelist1470);
			statement();
			state._fsp--;
			if (state.failed) return;dbg.location(188,12);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:188:12: ( statelist )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==EOL||LA17_0==ID||(LA17_0 >= TIPOS && LA17_0 <= T_ABRECHAVE)||LA17_0==T_BREAK||LA17_0==T_ESCREVA||(LA17_0 >= T_FOR && LA17_0 <= T_IF)||(LA17_0 >= T_READ && LA17_0 <= T_RETURN)) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:188:13: statelist
					{
					dbg.location(188,13);
					pushFollow(FOLLOW_statelist_in_statelist1473);
					statelist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

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
		dbg.location(189, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statelist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statelist"



	// $ANTLR start "expression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:191:1: expression : expr_linha ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(191, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:192:2: ( expr_linha )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:192:4: expr_linha
			{
			dbg.location(192,4);
			pushFollow(FOLLOW_expr_linha_in_expression1488);
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
		dbg.location(193, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression"



	// $ANTLR start "expr_linha"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:195:1: expr_linha : termo ( ( T_SOMA | T_SUBTRACAO ) termo )* ;
	public final void expr_linha() throws RecognitionException {
		int expr_linha_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "expr_linha");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(195, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:195:12: ( termo ( ( T_SOMA | T_SUBTRACAO ) termo )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:195:14: termo ( ( T_SOMA | T_SUBTRACAO ) termo )*
			{
			dbg.location(195,14);
			pushFollow(FOLLOW_termo_in_expr_linha1498);
			termo();
			state._fsp--;
			if (state.failed) return;dbg.location(195,20);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:195:20: ( ( T_SOMA | T_SUBTRACAO ) termo )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= T_SOMA && LA18_0 <= T_SUBTRACAO)) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:195:21: ( T_SOMA | T_SUBTRACAO ) termo
					{
					dbg.location(195,21);
					if ( (input.LA(1) >= T_SOMA && input.LA(1) <= T_SUBTRACAO) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(195,46);
					pushFollow(FOLLOW_termo_in_expr_linha1511);
					termo();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}

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
		dbg.location(196, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_linha");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_linha"



	// $ANTLR start "termo"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:198:1: termo : fator ( ( T_MULTIPLICACAO | T_DIVISAO ) fator )* ;
	public final void termo() throws RecognitionException {
		int termo_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "termo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(198, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:198:7: ( fator ( ( T_MULTIPLICACAO | T_DIVISAO ) fator )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:198:9: fator ( ( T_MULTIPLICACAO | T_DIVISAO ) fator )*
			{
			dbg.location(198,9);
			pushFollow(FOLLOW_fator_in_termo1523);
			fator();
			state._fsp--;
			if (state.failed) return;dbg.location(198,14);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:198:14: ( ( T_MULTIPLICACAO | T_DIVISAO ) fator )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==T_DIVISAO||LA19_0==T_MULTIPLICACAO) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:198:15: ( T_MULTIPLICACAO | T_DIVISAO ) fator
					{
					dbg.location(198,15);
					if ( input.LA(1)==T_DIVISAO||input.LA(1)==T_MULTIPLICACAO ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(198,47);
					pushFollow(FOLLOW_fator_in_termo1535);
					fator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}

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
		dbg.location(199, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "termo");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "termo"



	// $ANTLR start "fator"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:201:1: fator : ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES );
	public final void fator() throws RecognitionException {
		int fator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "fator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(201, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:201:7: ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES )
			int alt20=3;
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt20=1;
				}
				break;
			case NUMERO:
				{
				alt20=2;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt20=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:201:9: ID
					{
					dbg.location(201,9);
					match(input,ID,FOLLOW_ID_in_fator1547); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:201:15: NUMERO
					{
					dbg.location(201,15);
					match(input,NUMERO,FOLLOW_NUMERO_in_fator1552); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:201:24: T_ABREPARENTESES expression T_FECHAPARENTESES
					{
					dbg.location(201,24);
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_fator1556); if (state.failed) return;dbg.location(201,41);
					pushFollow(FOLLOW_expression_in_fator1558);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(201,52);
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_fator1560); if (state.failed) return;
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
		dbg.location(202, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fator"

	// $ANTLR start synpred24_Hello
	public final void synpred24_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:169:15: ( ID )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:169:15: ID
		{
		dbg.location(169,15);
		match(input,ID,FOLLOW_ID_in_synpred24_Hello1311); if (state.failed) return;
		}

	}
	// $ANTLR end synpred24_Hello

	// $ANTLR start synpred26_Hello
	public final void synpred26_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:173:12: ( ID )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\antlr3test\\Hello.g:173:12: ID
		{
		dbg.location(173,12);
		match(input,ID,FOLLOW_ID_in_synpred26_Hello1336); if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_Hello

	// Delegated rules

	public final boolean synpred26_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred26_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred24_Hello_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statement_in_program615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funclist685 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_FUNCAO_in_funclist687 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funclist713 = new BitSet(new long[]{0x0000000001000200L});
	public static final BitSet FOLLOW_TIPOS_in_funclist791 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_funclist793 = new BitSet(new long[]{0x0000002001000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_funclist836 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_TIPOS_in_funclist839 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_funclist841 = new BitSet(new long[]{0x0000002001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funclist906 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funclist932 = new BitSet(new long[]{0x0000000606204650L});
	public static final BitSet FOLLOW_statement_in_funclist968 = new BitSet(new long[]{0x0000000606604650L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funclist996 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_vardecl_in_statement1020 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement1027 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement1034 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement1042 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement1048 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement1065 = new BitSet(new long[]{0x0000000606204650L});
	public static final BitSet FOLLOW_statelist_in_statement1067 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement1074 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_statement1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl1094 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_vardecl1096 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl1099 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_set_in_vardecl1101 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl1111 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_atribstat1125 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_atribstat1148 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_set_in_atribstat1150 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_atribstat1159 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat1179 = new BitSet(new long[]{0x00000000000010E0L});
	public static final BitSet FOLLOW_expression_in_atribstat1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall1217 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall1228 = new BitSet(new long[]{0x00000000010000C0L});
	public static final BitSet FOLLOW_set_in_funccall1249 = new BitSet(new long[]{0x0000002001000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_funccall1274 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_set_in_funccall1276 = new BitSet(new long[]{0x0000002001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ESCREVA_in_printstat1308 = new BitSet(new long[]{0x00000000000011C0L});
	public static final BitSet FOLLOW_ID_in_printstat1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1333 = new BitSet(new long[]{0x00000000000011C0L});
	public static final BitSet FOLLOW_ID_in_readstat1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_readstat1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_readstat1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1358 = new BitSet(new long[]{0x00000000000001C2L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1383 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1386 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_expression_in_ifstat1388 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1390 = new BitSet(new long[]{0x0000000606204650L});
	public static final BitSet FOLLOW_statement_in_ifstat1392 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat1408 = new BitSet(new long[]{0x0000000606204650L});
	public static final BitSet FOLLOW_statement_in_ifstat1410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1423 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1425 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_atribstat_in_forstat1427 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_forstat1429 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_expression_in_forstat1431 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_EOL_in_forstat1433 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_atribstat_in_forstat1435 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1437 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1449 = new BitSet(new long[]{0x0000000606204650L});
	public static final BitSet FOLLOW_statement_in_forstat1452 = new BitSet(new long[]{0x0000000606604650L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist1470 = new BitSet(new long[]{0x0000000606204652L});
	public static final BitSet FOLLOW_statelist_in_statelist1473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_linha_in_expression1488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termo_in_expr_linha1498 = new BitSet(new long[]{0x0000001800000002L});
	public static final BitSet FOLLOW_set_in_expr_linha1501 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_termo_in_expr_linha1511 = new BitSet(new long[]{0x0000001800000002L});
	public static final BitSet FOLLOW_fator_in_termo1523 = new BitSet(new long[]{0x0000000080040002L});
	public static final BitSet FOLLOW_set_in_termo1525 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_fator_in_termo1535 = new BitSet(new long[]{0x0000000080040002L});
	public static final BitSet FOLLOW_ID_in_fator1547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_fator1552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_fator1556 = new BitSet(new long[]{0x00000000000010C0L});
	public static final BitSet FOLLOW_expression_in_fator1558 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_fator1560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred24_Hello1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred26_Hello1336 = new BitSet(new long[]{0x0000000000000002L});
}
