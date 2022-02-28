// $ANTLR 3.5.1 C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g 2022-02-28 16:12:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class HelloParser extends DebugParser {
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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "unaryexpr", "synpred43_Hello", "readstat", "synpred19_Hello", 
		"synpred44_Hello", "synpred31_Hello", "synpred40_Hello", "synpred28_Hello", 
		"synpred42_Hello", "expression", "synpred15_Hello", "term", "statelist", 
		"relational_expression", "relational_expression_2", "synpred49_Hello", 
		"synpred21_Hello", "printstat", "synpred36_Hello", "synpred27_Hello", 
		"forstat", "synpred4_Hello", "equal_expression", "synpred8_Hello", "funccall", 
		"synpred26_Hello", "synpred29_Hello", "funclist", "synpred53_Hello", "synpred35_Hello", 
		"expression_linha", "synpred33_Hello", "synpred23_Hello", "synpred16_Hello", 
		"synpred24_Hello", "synpred48_Hello", "ifstat", "program", "synpred41_Hello", 
		"synpred39_Hello", "synpred7_Hello", "synpred51_Hello", "synpred17_Hello", 
		"synpred3_Hello", "atribstat", "synpred25_Hello", "synpred14_Hello", "synpred50_Hello", 
		"synpred6_Hello", "synpred1_Hello", "synpred12_Hello", "synpred9_Hello", 
		"synpred11_Hello", "vardecl", "factor", "synpred18_Hello", "synpred37_Hello", 
		"synpred30_Hello", "synpred38_Hello", "synpred32_Hello", "synpred45_Hello", 
		"synpred10_Hello", "synpred5_Hello", "synpred47_Hello", "synpred34_Hello", 
		"statement", "synpred20_Hello", "synpred22_Hello", "synpred2_Hello", "synpred46_Hello", 
		"synpred13_Hello", "returnstat", "synpred52_Hello"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, true, true, false, false, false, true, false, true, false, 
		    false, false, false, false, false, false, false, true, false, false, 
		    false, false, false, false, false, false
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
		this.state.ruleMemo = new HashMap[73+1];


		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public HelloParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		this.state.ruleMemo = new HashMap[73+1];


		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return HelloParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:103:1: program : ( statement | funclist ) ;
	public final HelloParser.program_return program() throws RecognitionException {
		HelloParser.program_return retval = new HelloParser.program_return();
		retval.start = input.LT(1);
		int program_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope statement1 =null;
		ParserRuleReturnScope funclist2 =null;


		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:103:9: ( ( statement | funclist ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:104:2: ( statement | funclist )
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(104,2);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:104:2: ( statement | funclist )
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:104:4: statement
					{
					dbg.location(104,4);
					pushFollow(FOLLOW_statement_in_program633);
					statement1=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:104:16: funclist
					{
					dbg.location(104,16);
					pushFollow(FOLLOW_funclist_in_program637);
					funclist2=funclist();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, funclist2.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

		}
		dbg.location(105, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program"


	public static class funclist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funclist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:107:1: funclist : ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )* ;
	public final HelloParser.funclist_return funclist() throws RecognitionException {
		HelloParser.funclist_return retval = new HelloParser.funclist_return();
		retval.start = input.LT(1);
		int funclist_StartIndex = input.index();

		Object root_0 = null;

		Token T_DEF3=null;
		Token FUNCAO4=null;
		Token T_ABREPARENTESES5=null;
		Token TIPOS6=null;
		Token ID7=null;
		Token T_VIRGULA8=null;
		Token TIPOS9=null;
		Token ID10=null;
		Token T_FECHAPARENTESES11=null;
		Token T_ABRECHAVE12=null;
		Token T_FECHACHAVE14=null;
		ParserRuleReturnScope statement13 =null;

		Object T_DEF3_tree=null;
		Object FUNCAO4_tree=null;
		Object T_ABREPARENTESES5_tree=null;
		Object TIPOS6_tree=null;
		Object ID7_tree=null;
		Object T_VIRGULA8_tree=null;
		Object TIPOS9_tree=null;
		Object ID10_tree=null;
		Object T_FECHAPARENTESES11_tree=null;
		Object T_ABRECHAVE12_tree=null;
		Object T_FECHACHAVE14_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "funclist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:108:2: ( ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:3: ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(109,3);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:3: ( T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE )*
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:110:17: T_DEF FUNCAO T_ABREPARENTESES ( TIPOS ID ( T_VIRGULA TIPOS ID )* )? T_FECHAPARENTESES T_ABRECHAVE ( statement )+ T_FECHACHAVE
					{
					dbg.location(110,17);
					T_DEF3=(Token)match(input,T_DEF,FOLLOW_T_DEF_in_funclist670); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_DEF3_tree = (Object)adaptor.create(T_DEF3);
					adaptor.addChild(root_0, T_DEF3_tree);
					}
					dbg.location(110,24);
					FUNCAO4=(Token)match(input,FUNCAO,FOLLOW_FUNCAO_in_funclist673); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FUNCAO4_tree = (Object)adaptor.create(FUNCAO4);
					adaptor.addChild(root_0, FUNCAO4_tree);
					}
					dbg.location(111,25);
					T_ABREPARENTESES5=(Token)match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funclist700); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ABREPARENTESES5_tree = (Object)adaptor.create(T_ABREPARENTESES5);
					adaptor.addChild(root_0, T_ABREPARENTESES5_tree);
					}
					dbg.location(112,33);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:112:33: ( TIPOS ID ( T_VIRGULA TIPOS ID )* )?
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

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:113:42: TIPOS ID ( T_VIRGULA TIPOS ID )*
							{
							dbg.location(113,42);
							TIPOS6=(Token)match(input,TIPOS,FOLLOW_TIPOS_in_funclist779); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							TIPOS6_tree = (Object)adaptor.create(TIPOS6);
							adaptor.addChild(root_0, TIPOS6_tree);
							}
							dbg.location(113,50);
							ID7=(Token)match(input,ID,FOLLOW_ID_in_funclist783); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ID7_tree = (Object)adaptor.create(ID7);
							adaptor.addChild(root_0, ID7_tree);
							}
							dbg.location(114,41);
							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:114:41: ( T_VIRGULA TIPOS ID )*
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

									// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:114:42: T_VIRGULA TIPOS ID
									{
									dbg.location(114,42);
									T_VIRGULA8=(Token)match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_funclist826); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									T_VIRGULA8_tree = (Object)adaptor.create(T_VIRGULA8);
									adaptor.addChild(root_0, T_VIRGULA8_tree);
									}
									dbg.location(114,54);
									TIPOS9=(Token)match(input,TIPOS,FOLLOW_TIPOS_in_funclist830); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									TIPOS9_tree = (Object)adaptor.create(TIPOS9);
									adaptor.addChild(root_0, TIPOS9_tree);
									}
									dbg.location(114,62);
									ID10=(Token)match(input,ID,FOLLOW_ID_in_funclist834); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ID10_tree = (Object)adaptor.create(ID10);
									adaptor.addChild(root_0, ID10_tree);
									}

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
					dbg.location(116,25);
					T_FECHAPARENTESES11=(Token)match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funclist899); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_FECHAPARENTESES11_tree = (Object)adaptor.create(T_FECHAPARENTESES11);
					adaptor.addChild(root_0, T_FECHAPARENTESES11_tree);
					}
					dbg.location(117,25);
					T_ABRECHAVE12=(Token)match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funclist925); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ABRECHAVE12_tree = (Object)adaptor.create(T_ABRECHAVE12);
					adaptor.addChild(root_0, T_ABRECHAVE12_tree);
					}
					dbg.location(118,33);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:118:33: ( statement )+
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

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:118:34: statement
							{
							dbg.location(118,34);
							pushFollow(FOLLOW_statement_in_funclist961);
							statement13=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, statement13.getTree());

							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(4, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt4++;
					}
					} finally {dbg.exitSubRule(4);}
					dbg.location(119,25);
					T_FECHACHAVE14=(Token)match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funclist989); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_FECHACHAVE14_tree = (Object)adaptor.create(T_FECHACHAVE14);
					adaptor.addChild(root_0, T_FECHACHAVE14_tree);
					}

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, funclist_StartIndex); }

		}
		dbg.location(121, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funclist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "funclist"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:123:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final HelloParser.statement_return statement() throws RecognitionException {
		HelloParser.statement_return retval = new HelloParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		Object root_0 = null;

		Token EOL16=null;
		Token EOL18=null;
		Token EOL20=null;
		Token EOL22=null;
		Token EOL24=null;
		Token T_ABRECHAVE27=null;
		Token T_FECHACHAVE29=null;
		Token T_BREAK30=null;
		Token EOL31=null;
		Token EOL32=null;
		ParserRuleReturnScope vardecl15 =null;
		ParserRuleReturnScope atribstat17 =null;
		ParserRuleReturnScope printstat19 =null;
		ParserRuleReturnScope readstat21 =null;
		ParserRuleReturnScope returnstat23 =null;
		ParserRuleReturnScope ifstat25 =null;
		ParserRuleReturnScope forstat26 =null;
		ParserRuleReturnScope statelist28 =null;

		Object EOL16_tree=null;
		Object EOL18_tree=null;
		Object EOL20_tree=null;
		Object EOL22_tree=null;
		Object EOL24_tree=null;
		Object T_ABRECHAVE27_tree=null;
		Object T_FECHACHAVE29_tree=null;
		Object T_BREAK30_tree=null;
		Object EOL31_tree=null;
		Object EOL32_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(123, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:124:2: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:124:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(124,3);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:124:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:124:4: vardecl EOL
					{
					dbg.location(124,4);
					pushFollow(FOLLOW_vardecl_in_statement1013);
					vardecl15=vardecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl15.getTree());
					dbg.location(124,12);
					EOL16=(Token)match(input,EOL,FOLLOW_EOL_in_statement1015); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOL16_tree = (Object)adaptor.create(EOL16);
					adaptor.addChild(root_0, EOL16_tree);
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:2: atribstat EOL
					{
					dbg.location(125,2);
					pushFollow(FOLLOW_atribstat_in_statement1020);
					atribstat17=atribstat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atribstat17.getTree());
					dbg.location(125,12);
					EOL18=(Token)match(input,EOL,FOLLOW_EOL_in_statement1022); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOL18_tree = (Object)adaptor.create(EOL18);
					adaptor.addChild(root_0, EOL18_tree);
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:126:2: printstat EOL
					{
					dbg.location(126,2);
					pushFollow(FOLLOW_printstat_in_statement1027);
					printstat19=printstat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, printstat19.getTree());
					dbg.location(126,12);
					EOL20=(Token)match(input,EOL,FOLLOW_EOL_in_statement1029); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOL20_tree = (Object)adaptor.create(EOL20);
					adaptor.addChild(root_0, EOL20_tree);
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:127:2: readstat EOL
					{
					dbg.location(127,2);
					pushFollow(FOLLOW_readstat_in_statement1035);
					readstat21=readstat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, readstat21.getTree());
					dbg.location(127,11);
					EOL22=(Token)match(input,EOL,FOLLOW_EOL_in_statement1037); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOL22_tree = (Object)adaptor.create(EOL22);
					adaptor.addChild(root_0, EOL22_tree);
					}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:128:2: returnstat EOL
					{
					dbg.location(128,2);
					pushFollow(FOLLOW_returnstat_in_statement1041);
					returnstat23=returnstat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, returnstat23.getTree());
					dbg.location(128,13);
					EOL24=(Token)match(input,EOL,FOLLOW_EOL_in_statement1043); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOL24_tree = (Object)adaptor.create(EOL24);
					adaptor.addChild(root_0, EOL24_tree);
					}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:129:2: ifstat
					{
					dbg.location(129,2);
					pushFollow(FOLLOW_ifstat_in_statement1048);
					ifstat25=ifstat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifstat25.getTree());

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:130:2: forstat
					{
					dbg.location(130,2);
					pushFollow(FOLLOW_forstat_in_statement1053);
					forstat26=forstat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forstat26.getTree());

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:131:2: T_ABRECHAVE statelist T_FECHACHAVE
					{
					dbg.location(131,2);
					T_ABRECHAVE27=(Token)match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement1058); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ABRECHAVE27_tree = (Object)adaptor.create(T_ABRECHAVE27);
					adaptor.addChild(root_0, T_ABRECHAVE27_tree);
					}
					dbg.location(131,14);
					pushFollow(FOLLOW_statelist_in_statement1060);
					statelist28=statelist();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statelist28.getTree());
					dbg.location(131,24);
					T_FECHACHAVE29=(Token)match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement1062); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_FECHACHAVE29_tree = (Object)adaptor.create(T_FECHACHAVE29);
					adaptor.addChild(root_0, T_FECHACHAVE29_tree);
					}

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:132:2: T_BREAK EOL
					{
					dbg.location(132,2);
					T_BREAK30=(Token)match(input,T_BREAK,FOLLOW_T_BREAK_in_statement1067); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_BREAK30_tree = (Object)adaptor.create(T_BREAK30);
					adaptor.addChild(root_0, T_BREAK30_tree);
					}
					dbg.location(132,10);
					EOL31=(Token)match(input,EOL,FOLLOW_EOL_in_statement1069); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOL31_tree = (Object)adaptor.create(EOL31);
					adaptor.addChild(root_0, EOL31_tree);
					}

					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:133:2: EOL
					{
					dbg.location(133,2);
					EOL32=(Token)match(input,EOL,FOLLOW_EOL_in_statement1074); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOL32_tree = (Object)adaptor.create(EOL32);
					adaptor.addChild(root_0, EOL32_tree);
					}

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, statement_StartIndex); }

		}
		dbg.location(134, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "statement"


	public static class vardecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vardecl"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:136:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final HelloParser.vardecl_return vardecl() throws RecognitionException {
		HelloParser.vardecl_return retval = new HelloParser.vardecl_return();
		retval.start = input.LT(1);
		int vardecl_StartIndex = input.index();

		Object root_0 = null;

		Token TIPOS33=null;
		Token ID34=null;
		Token T_ABRECOLCHETE35=null;
		Token set36=null;
		Token T_FECHACOLCHETE37=null;

		Object TIPOS33_tree=null;
		Object ID34_tree=null;
		Object T_ABRECOLCHETE35_tree=null;
		Object set36_tree=null;
		Object T_FECHACOLCHETE37_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "vardecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(136, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:137:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:138:4: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(138,4);
			TIPOS33=(Token)match(input,TIPOS,FOLLOW_TIPOS_in_vardecl1091); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TIPOS33_tree = (Object)adaptor.create(TIPOS33);
			adaptor.addChild(root_0, TIPOS33_tree);
			}
			dbg.location(139,4);
			ID34=(Token)match(input,ID,FOLLOW_ID_in_vardecl1097); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID34_tree = (Object)adaptor.create(ID34);
			adaptor.addChild(root_0, ID34_tree);
			}
			dbg.location(139,7);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:139:7: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:139:8: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					dbg.location(139,8);
					T_ABRECOLCHETE35=(Token)match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl1100); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ABRECOLCHETE35_tree = (Object)adaptor.create(T_ABRECOLCHETE35);
					adaptor.addChild(root_0, T_ABRECOLCHETE35_tree);
					}
					dbg.location(139,23);
					set36=input.LT(1);
					if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set36));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(139,40);
					T_FECHACOLCHETE37=(Token)match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl1113); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_FECHACOLCHETE37_tree = (Object)adaptor.create(T_FECHACOLCHETE37);
					adaptor.addChild(root_0, T_FECHACOLCHETE37_tree);
					}

					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, vardecl_StartIndex); }

		}
		dbg.location(140, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vardecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vardecl"


	public static class atribstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atribstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:142:1: atribstat : ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall | TEXTO ) ;
	public final HelloParser.atribstat_return atribstat() throws RecognitionException {
		HelloParser.atribstat_return retval = new HelloParser.atribstat_return();
		retval.start = input.LT(1);
		int atribstat_StartIndex = input.index();

		Object root_0 = null;

		Token ID38=null;
		Token T_ABRECOLCHETE39=null;
		Token set40=null;
		Token T_FECHACOLCHETE41=null;
		Token T_ATRIBUICAO42=null;
		Token TEXTO45=null;
		ParserRuleReturnScope expression43 =null;
		ParserRuleReturnScope funccall44 =null;

		Object ID38_tree=null;
		Object T_ABRECOLCHETE39_tree=null;
		Object set40_tree=null;
		Object T_FECHACOLCHETE41_tree=null;
		Object T_ATRIBUICAO42_tree=null;
		Object TEXTO45_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "atribstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(142, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:143:2: ( ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall | TEXTO ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:144:2: ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* T_ATRIBUICAO ( expression | funccall | TEXTO )
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(144,2);
			ID38=(Token)match(input,ID,FOLLOW_ID_in_atribstat1127); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID38_tree = (Object)adaptor.create(ID38);
			adaptor.addChild(root_0, ID38_tree);
			}
			dbg.location(145,17);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:145:17: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:145:18: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					dbg.location(145,18);
					T_ABRECOLCHETE39=(Token)match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_atribstat1150); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ABRECOLCHETE39_tree = (Object)adaptor.create(T_ABRECOLCHETE39);
					adaptor.addChild(root_0, T_ABRECOLCHETE39_tree);
					}
					dbg.location(145,33);
					set40=input.LT(1);
					if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set40));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(145,48);
					T_FECHACOLCHETE41=(Token)match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_atribstat1161); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_FECHACOLCHETE41_tree = (Object)adaptor.create(T_FECHACOLCHETE41);
					adaptor.addChild(root_0, T_FECHACOLCHETE41_tree);
					}

					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(146,17);
			T_ATRIBUICAO42=(Token)match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat1181); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_ATRIBUICAO42_tree = (Object)adaptor.create(T_ATRIBUICAO42);
			adaptor.addChild(root_0, T_ATRIBUICAO42_tree);
			}
			dbg.location(147,17);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:147:17: ( expression | funccall | TEXTO )
			int alt9=3;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
				{
				alt9=1;
				}
				break;
			case FUNCAO:
				{
				alt9=2;
				}
				break;
			case TEXTO:
				{
				alt9=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:147:19: expression
					{
					dbg.location(147,19);
					pushFollow(FOLLOW_expression_in_atribstat1202);
					expression43=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression43.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:147:32: funccall
					{
					dbg.location(147,32);
					pushFollow(FOLLOW_funccall_in_atribstat1206);
					funccall44=funccall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, funccall44.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:147:43: TEXTO
					{
					dbg.location(147,43);
					TEXTO45=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_atribstat1210); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TEXTO45_tree = (Object)adaptor.create(TEXTO45);
					adaptor.addChild(root_0, TEXTO45_tree);
					}

					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, atribstat_StartIndex); }

		}
		dbg.location(148, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "atribstat"


	public static class funccall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funccall"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:150:1: funccall : FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES ;
	public final HelloParser.funccall_return funccall() throws RecognitionException {
		HelloParser.funccall_return retval = new HelloParser.funccall_return();
		retval.start = input.LT(1);
		int funccall_StartIndex = input.index();

		Object root_0 = null;

		Token FUNCAO46=null;
		Token T_ABREPARENTESES47=null;
		Token set48=null;
		Token T_VIRGULA49=null;
		Token set50=null;
		Token T_FECHAPARENTESES51=null;

		Object FUNCAO46_tree=null;
		Object T_ABREPARENTESES47_tree=null;
		Object set48_tree=null;
		Object T_VIRGULA49_tree=null;
		Object set50_tree=null;
		Object T_FECHAPARENTESES51_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "funccall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(150, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:151:2: ( FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:151:4: FUNCAO T_ABREPARENTESES ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )? T_FECHAPARENTESES
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(151,4);
			FUNCAO46=(Token)match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall1223); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FUNCAO46_tree = (Object)adaptor.create(FUNCAO46);
			adaptor.addChild(root_0, FUNCAO46_tree);
			}
			dbg.location(152,9);
			T_ABREPARENTESES47=(Token)match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall1234); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_ABREPARENTESES47_tree = (Object)adaptor.create(T_ABREPARENTESES47);
			adaptor.addChild(root_0, T_ABREPARENTESES47_tree);
			}
			dbg.location(153,17);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:153:17: ( ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )* )?
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:153:19: ( ID | NUMERO ) ( T_VIRGULA ( ID | NUMERO ) )*
					{
					dbg.location(153,19);
					set48=input.LT(1);
					if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set48));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(154,17);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:154:17: ( T_VIRGULA ( ID | NUMERO ) )*
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

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:154:18: T_VIRGULA ( ID | NUMERO )
							{
							dbg.location(154,18);
							T_VIRGULA49=(Token)match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_funccall1280); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							T_VIRGULA49_tree = (Object)adaptor.create(T_VIRGULA49);
							adaptor.addChild(root_0, T_VIRGULA49_tree);
							}
							dbg.location(154,28);
							set50=input.LT(1);
							if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set50));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
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
			dbg.location(155,9);
			T_FECHAPARENTESES51=(Token)match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall1303); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_FECHAPARENTESES51_tree = (Object)adaptor.create(T_FECHAPARENTESES51);
			adaptor.addChild(root_0, T_FECHAPARENTESES51_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, funccall_StartIndex); }

		}
		dbg.location(156, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funccall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "funccall"


	public static class printstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "printstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:158:1: printstat : T_ESCREVA ( ID | TEXTO | expression ) ;
	public final HelloParser.printstat_return printstat() throws RecognitionException {
		HelloParser.printstat_return retval = new HelloParser.printstat_return();
		retval.start = input.LT(1);
		int printstat_StartIndex = input.index();

		Object root_0 = null;

		Token T_ESCREVA52=null;
		Token ID53=null;
		Token TEXTO54=null;
		ParserRuleReturnScope expression55 =null;

		Object T_ESCREVA52_tree=null;
		Object ID53_tree=null;
		Object TEXTO54_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "printstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(158, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:2: ( T_ESCREVA ( ID | TEXTO | expression ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:4: T_ESCREVA ( ID | TEXTO | expression )
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(159,4);
			T_ESCREVA52=(Token)match(input,T_ESCREVA,FOLLOW_T_ESCREVA_in_printstat1314); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_ESCREVA52_tree = (Object)adaptor.create(T_ESCREVA52);
			adaptor.addChild(root_0, T_ESCREVA52_tree);
			}
			dbg.location(159,13);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:13: ( ID | TEXTO | expression )
			int alt12=3;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA12_1 = input.LA(2);
				if ( (synpred25_Hello()) ) {
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:15: ID
					{
					dbg.location(159,15);
					ID53=(Token)match(input,ID,FOLLOW_ID_in_printstat1317); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID53_tree = (Object)adaptor.create(ID53);
					adaptor.addChild(root_0, ID53_tree);
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:19: TEXTO
					{
					dbg.location(159,19);
					TEXTO54=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_printstat1320); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TEXTO54_tree = (Object)adaptor.create(TEXTO54);
					adaptor.addChild(root_0, TEXTO54_tree);
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:27: expression
					{
					dbg.location(159,27);
					pushFollow(FOLLOW_expression_in_printstat1324);
					expression55=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression55.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, printstat_StartIndex); }

		}
		dbg.location(160, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "printstat"


	public static class readstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "readstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:162:1: readstat : T_READ ( ID | TEXTO | expression ) ;
	public final HelloParser.readstat_return readstat() throws RecognitionException {
		HelloParser.readstat_return retval = new HelloParser.readstat_return();
		retval.start = input.LT(1);
		int readstat_StartIndex = input.index();

		Object root_0 = null;

		Token T_READ56=null;
		Token ID57=null;
		Token TEXTO58=null;
		ParserRuleReturnScope expression59 =null;

		Object T_READ56_tree=null;
		Object ID57_tree=null;
		Object TEXTO58_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "readstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(162, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:163:2: ( T_READ ( ID | TEXTO | expression ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:163:4: T_READ ( ID | TEXTO | expression )
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(163,4);
			T_READ56=(Token)match(input,T_READ,FOLLOW_T_READ_in_readstat1339); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_READ56_tree = (Object)adaptor.create(T_READ56);
			adaptor.addChild(root_0, T_READ56_tree);
			}
			dbg.location(163,10);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:163:10: ( ID | TEXTO | expression )
			int alt13=3;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA13_1 = input.LA(2);
				if ( (synpred27_Hello()) ) {
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:163:12: ID
					{
					dbg.location(163,12);
					ID57=(Token)match(input,ID,FOLLOW_ID_in_readstat1342); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID57_tree = (Object)adaptor.create(ID57);
					adaptor.addChild(root_0, ID57_tree);
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:163:16: TEXTO
					{
					dbg.location(163,16);
					TEXTO58=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_readstat1345); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TEXTO58_tree = (Object)adaptor.create(TEXTO58);
					adaptor.addChild(root_0, TEXTO58_tree);
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:163:24: expression
					{
					dbg.location(163,24);
					pushFollow(FOLLOW_expression_in_readstat1349);
					expression59=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression59.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, readstat_StartIndex); }

		}
		dbg.location(164, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "readstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "readstat"


	public static class returnstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returnstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:166:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final HelloParser.returnstat_return returnstat() throws RecognitionException {
		HelloParser.returnstat_return retval = new HelloParser.returnstat_return();
		retval.start = input.LT(1);
		int returnstat_StartIndex = input.index();

		Object root_0 = null;

		Token T_RETURN60=null;
		Token TEXTO61=null;
		ParserRuleReturnScope expression62 =null;

		Object T_RETURN60_tree=null;
		Object TEXTO61_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "returnstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(166, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:167:2: ( T_RETURN ( TEXTO | expression )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:167:4: T_RETURN ( TEXTO | expression )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(167,4);
			T_RETURN60=(Token)match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1364); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_RETURN60_tree = (Object)adaptor.create(T_RETURN60);
			adaptor.addChild(root_0, T_RETURN60_tree);
			}
			dbg.location(167,13);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:167:13: ( TEXTO | expression )?
			int alt14=3;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==TEXTO) ) {
				alt14=1;
			}
			else if ( ((LA14_0 >= ID && LA14_0 <= NUMERO)||LA14_0==T_ABREPARENTESES) ) {
				alt14=2;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:167:15: TEXTO
					{
					dbg.location(167,15);
					TEXTO61=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1368); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TEXTO61_tree = (Object)adaptor.create(TEXTO61);
					adaptor.addChild(root_0, TEXTO61_tree);
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:167:23: expression
					{
					dbg.location(167,23);
					pushFollow(FOLLOW_expression_in_returnstat1372);
					expression62=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression62.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, returnstat_StartIndex); }

		}
		dbg.location(168, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returnstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "returnstat"


	public static class ifstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:170:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE ;
	public final HelloParser.ifstat_return ifstat() throws RecognitionException {
		HelloParser.ifstat_return retval = new HelloParser.ifstat_return();
		retval.start = input.LT(1);
		int ifstat_StartIndex = input.index();

		Object root_0 = null;

		Token T_IF63=null;
		Token T_ABREPARENTESES64=null;
		Token T_FECHAPARENTESES66=null;
		Token T_ABRECHAVE67=null;
		Token T_FECHACHAVE69=null;
		Token T_ELSEIF70=null;
		Token T_ABREPARENTESES71=null;
		Token T_FECHAPARENTESES73=null;
		Token T_ABRECHAVE74=null;
		Token T_FECHACHAVE76=null;
		Token T_ELSE77=null;
		Token T_ABRECHAVE78=null;
		Token T_FECHACHAVE80=null;
		ParserRuleReturnScope expression65 =null;
		ParserRuleReturnScope statement68 =null;
		ParserRuleReturnScope expression72 =null;
		ParserRuleReturnScope statement75 =null;
		ParserRuleReturnScope statement79 =null;

		Object T_IF63_tree=null;
		Object T_ABREPARENTESES64_tree=null;
		Object T_FECHAPARENTESES66_tree=null;
		Object T_ABRECHAVE67_tree=null;
		Object T_FECHACHAVE69_tree=null;
		Object T_ELSEIF70_tree=null;
		Object T_ABREPARENTESES71_tree=null;
		Object T_FECHAPARENTESES73_tree=null;
		Object T_ABRECHAVE74_tree=null;
		Object T_FECHACHAVE76_tree=null;
		Object T_ELSE77_tree=null;
		Object T_ABRECHAVE78_tree=null;
		Object T_FECHACHAVE80_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "ifstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(170, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:170:8: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:170:10: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )* ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )? T_FECHACHAVE
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(170,10);
			T_IF63=(Token)match(input,T_IF,FOLLOW_T_IF_in_ifstat1386); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_IF63_tree = (Object)adaptor.create(T_IF63);
			adaptor.addChild(root_0, T_IF63_tree);
			}
			dbg.location(170,16);
			T_ABREPARENTESES64=(Token)match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1389); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_ABREPARENTESES64_tree = (Object)adaptor.create(T_ABREPARENTESES64);
			adaptor.addChild(root_0, T_ABREPARENTESES64_tree);
			}
			dbg.location(170,33);
			pushFollow(FOLLOW_expression_in_ifstat1391);
			expression65=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression65.getTree());
			dbg.location(170,44);
			T_FECHAPARENTESES66=(Token)match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1393); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_FECHAPARENTESES66_tree = (Object)adaptor.create(T_FECHAPARENTESES66);
			adaptor.addChild(root_0, T_FECHAPARENTESES66_tree);
			}
			dbg.location(171,4);
			T_ABRECHAVE67=(Token)match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1399); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_ABRECHAVE67_tree = (Object)adaptor.create(T_ABRECHAVE67);
			adaptor.addChild(root_0, T_ABRECHAVE67_tree);
			}
			dbg.location(171,16);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:16: ( statement )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==EOL||LA15_0==ID||(LA15_0 >= TIPOS && LA15_0 <= T_ABRECHAVE)||LA15_0==T_BREAK||LA15_0==T_ESCREVA||(LA15_0 >= T_FOR && LA15_0 <= T_IF)||(LA15_0 >= T_READ && LA15_0 <= T_RETURN)) ) {
					alt15=1;
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:17: statement
					{
					dbg.location(171,17);
					pushFollow(FOLLOW_statement_in_ifstat1402);
					statement68=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement68.getTree());

					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(172,4);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:4: ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )*
			try { dbg.enterSubRule(17);

			loop17:
			while (true) {
				int alt17=2;
				try { dbg.enterDecision(17, decisionCanBacktrack[17]);

				int LA17_0 = input.LA(1);
				if ( (LA17_0==T_FECHACHAVE) ) {
					int LA17_1 = input.LA(2);
					if ( (synpred33_Hello()) ) {
						alt17=1;
					}

				}

				} finally {dbg.exitDecision(17);}

				switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:6: T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )*
					{
					dbg.location(172,6);
					T_FECHACHAVE69=(Token)match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1411); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_FECHACHAVE69_tree = (Object)adaptor.create(T_FECHACHAVE69);
					adaptor.addChild(root_0, T_FECHACHAVE69_tree);
					}
					dbg.location(172,19);
					T_ELSEIF70=(Token)match(input,T_ELSEIF,FOLLOW_T_ELSEIF_in_ifstat1413); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ELSEIF70_tree = (Object)adaptor.create(T_ELSEIF70);
					adaptor.addChild(root_0, T_ELSEIF70_tree);
					}
					dbg.location(172,28);
					T_ABREPARENTESES71=(Token)match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1415); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ABREPARENTESES71_tree = (Object)adaptor.create(T_ABREPARENTESES71);
					adaptor.addChild(root_0, T_ABREPARENTESES71_tree);
					}
					dbg.location(172,45);
					pushFollow(FOLLOW_expression_in_ifstat1417);
					expression72=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression72.getTree());
					dbg.location(172,56);
					T_FECHAPARENTESES73=(Token)match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1419); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_FECHAPARENTESES73_tree = (Object)adaptor.create(T_FECHAPARENTESES73);
					adaptor.addChild(root_0, T_FECHAPARENTESES73_tree);
					}
					dbg.location(172,74);
					T_ABRECHAVE74=(Token)match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1421); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ABRECHAVE74_tree = (Object)adaptor.create(T_ABRECHAVE74);
					adaptor.addChild(root_0, T_ABRECHAVE74_tree);
					}
					dbg.location(172,86);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:86: ( statement )*
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

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:87: statement
							{
							dbg.location(172,87);
							pushFollow(FOLLOW_statement_in_ifstat1424);
							statement75=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, statement75.getTree());

							}
							break;

						default :
							break loop16;
						}
					}
					} finally {dbg.exitSubRule(16);}

					}
					break;

				default :
					break loop17;
				}
			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(173,4);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:4: ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==T_FECHACHAVE) ) {
				int LA19_1 = input.LA(2);
				if ( (synpred35_Hello()) ) {
					alt19=1;
				}
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:6: T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )*
					{
					dbg.location(173,6);
					T_FECHACHAVE76=(Token)match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1436); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_FECHACHAVE76_tree = (Object)adaptor.create(T_FECHACHAVE76);
					adaptor.addChild(root_0, T_FECHACHAVE76_tree);
					}
					dbg.location(173,19);
					T_ELSE77=(Token)match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat1438); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ELSE77_tree = (Object)adaptor.create(T_ELSE77);
					adaptor.addChild(root_0, T_ELSE77_tree);
					}
					dbg.location(173,26);
					T_ABRECHAVE78=(Token)match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_ifstat1440); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ABRECHAVE78_tree = (Object)adaptor.create(T_ABRECHAVE78);
					adaptor.addChild(root_0, T_ABRECHAVE78_tree);
					}
					dbg.location(173,38);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:38: ( statement )*
					try { dbg.enterSubRule(18);

					loop18:
					while (true) {
						int alt18=2;
						try { dbg.enterDecision(18, decisionCanBacktrack[18]);

						int LA18_0 = input.LA(1);
						if ( (LA18_0==EOL||LA18_0==ID||(LA18_0 >= TIPOS && LA18_0 <= T_ABRECHAVE)||LA18_0==T_BREAK||LA18_0==T_ESCREVA||(LA18_0 >= T_FOR && LA18_0 <= T_IF)||(LA18_0 >= T_READ && LA18_0 <= T_RETURN)) ) {
							alt18=1;
						}

						} finally {dbg.exitDecision(18);}

						switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:39: statement
							{
							dbg.location(173,39);
							pushFollow(FOLLOW_statement_in_ifstat1443);
							statement79=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, statement79.getTree());

							}
							break;

						default :
							break loop18;
						}
					}
					} finally {dbg.exitSubRule(18);}

					}
					break;

			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(174,4);
			T_FECHACHAVE80=(Token)match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_ifstat1453); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_FECHACHAVE80_tree = (Object)adaptor.create(T_FECHACHAVE80);
			adaptor.addChild(root_0, T_FECHACHAVE80_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, ifstat_StartIndex); }

		}
		dbg.location(175, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ifstat"


	public static class forstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:177:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE ;
	public final HelloParser.forstat_return forstat() throws RecognitionException {
		HelloParser.forstat_return retval = new HelloParser.forstat_return();
		retval.start = input.LT(1);
		int forstat_StartIndex = input.index();

		Object root_0 = null;

		Token T_FOR81=null;
		Token T_ABREPARENTESES82=null;
		Token EOL84=null;
		Token EOL86=null;
		Token T_FECHAPARENTESES88=null;
		Token T_ABRECHAVE89=null;
		Token T_FECHACHAVE91=null;
		ParserRuleReturnScope atribstat83 =null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope atribstat87 =null;
		ParserRuleReturnScope statement90 =null;

		Object T_FOR81_tree=null;
		Object T_ABREPARENTESES82_tree=null;
		Object EOL84_tree=null;
		Object EOL86_tree=null;
		Object T_FECHAPARENTESES88_tree=null;
		Object T_ABRECHAVE89_tree=null;
		Object T_FECHACHAVE91_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "forstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(177, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:177:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:177:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(177,11);
			T_FOR81=(Token)match(input,T_FOR,FOLLOW_T_FOR_in_forstat1464); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_FOR81_tree = (Object)adaptor.create(T_FOR81);
			adaptor.addChild(root_0, T_FOR81_tree);
			}
			dbg.location(177,17);
			T_ABREPARENTESES82=(Token)match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1466); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_ABREPARENTESES82_tree = (Object)adaptor.create(T_ABREPARENTESES82);
			adaptor.addChild(root_0, T_ABREPARENTESES82_tree);
			}
			dbg.location(177,34);
			pushFollow(FOLLOW_atribstat_in_forstat1468);
			atribstat83=atribstat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, atribstat83.getTree());
			dbg.location(177,44);
			EOL84=(Token)match(input,EOL,FOLLOW_EOL_in_forstat1470); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EOL84_tree = (Object)adaptor.create(EOL84);
			adaptor.addChild(root_0, EOL84_tree);
			}
			dbg.location(177,48);
			pushFollow(FOLLOW_expression_in_forstat1472);
			expression85=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression85.getTree());
			dbg.location(177,59);
			EOL86=(Token)match(input,EOL,FOLLOW_EOL_in_forstat1474); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EOL86_tree = (Object)adaptor.create(EOL86);
			adaptor.addChild(root_0, EOL86_tree);
			}
			dbg.location(177,63);
			pushFollow(FOLLOW_atribstat_in_forstat1476);
			atribstat87=atribstat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, atribstat87.getTree());
			dbg.location(177,73);
			T_FECHAPARENTESES88=(Token)match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1478); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_FECHAPARENTESES88_tree = (Object)adaptor.create(T_FECHAPARENTESES88);
			adaptor.addChild(root_0, T_FECHAPARENTESES88_tree);
			}
			dbg.location(178,10);
			T_ABRECHAVE89=(Token)match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1490); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_ABRECHAVE89_tree = (Object)adaptor.create(T_ABRECHAVE89);
			adaptor.addChild(root_0, T_ABRECHAVE89_tree);
			}
			dbg.location(178,22);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:178:22: ( statement )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==EOL||LA20_0==ID||(LA20_0 >= TIPOS && LA20_0 <= T_ABRECHAVE)||LA20_0==T_BREAK||LA20_0==T_ESCREVA||(LA20_0 >= T_FOR && LA20_0 <= T_IF)||(LA20_0 >= T_READ && LA20_0 <= T_RETURN)) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:178:23: statement
					{
					dbg.location(178,23);
					pushFollow(FOLLOW_statement_in_forstat1493);
					statement90=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement90.getTree());

					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(178,35);
			T_FECHACHAVE91=(Token)match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1497); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			T_FECHACHAVE91_tree = (Object)adaptor.create(T_FECHACHAVE91);
			adaptor.addChild(root_0, T_FECHACHAVE91_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, forstat_StartIndex); }

		}
		dbg.location(179, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "forstat"


	public static class statelist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statelist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:181:1: statelist : ( statement )* ;
	public final HelloParser.statelist_return statelist() throws RecognitionException {
		HelloParser.statelist_return retval = new HelloParser.statelist_return();
		retval.start = input.LT(1);
		int statelist_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope statement92 =null;


		try { dbg.enterRule(getGrammarFileName(), "statelist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(181, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:181:11: ( ( statement )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:181:13: ( statement )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(181,13);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:181:13: ( statement )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==EOL||LA21_0==ID||(LA21_0 >= TIPOS && LA21_0 <= T_ABRECHAVE)||LA21_0==T_BREAK||LA21_0==T_ESCREVA||(LA21_0 >= T_FOR && LA21_0 <= T_IF)||(LA21_0 >= T_READ && LA21_0 <= T_RETURN)) ) {
					alt21=1;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:181:14: statement
					{
					dbg.location(181,14);
					pushFollow(FOLLOW_statement_in_statelist1510);
					statement92=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement92.getTree());

					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, statelist_StartIndex); }

		}
		dbg.location(182, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statelist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "statelist"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:1: expression : expression_linha ( ( T_E | T_OU ) expression_linha )* ;
	public final HelloParser.expression_return expression() throws RecognitionException {
		HelloParser.expression_return retval = new HelloParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		Object root_0 = null;

		Token set94=null;
		ParserRuleReturnScope expression_linha93 =null;
		ParserRuleReturnScope expression_linha95 =null;

		Object set94_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(184, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:12: ( expression_linha ( ( T_E | T_OU ) expression_linha )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:14: expression_linha ( ( T_E | T_OU ) expression_linha )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(184,14);
			pushFollow(FOLLOW_expression_linha_in_expression1523);
			expression_linha93=expression_linha();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_linha93.getTree());
			dbg.location(184,31);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:31: ( ( T_E | T_OU ) expression_linha )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( (LA22_0==T_E||LA22_0==T_OU) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:33: ( T_E | T_OU ) expression_linha
					{
					dbg.location(184,33);
					set94=input.LT(1);
					if ( input.LA(1)==T_E||input.LA(1)==T_OU ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set94));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(184,48);
					pushFollow(FOLLOW_expression_linha_in_expression1537);
					expression_linha95=expression_linha();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_linha95.getTree());

					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, expression_StartIndex); }

		}
		dbg.location(185, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"


	public static class expression_linha_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression_linha"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:186:1: expression_linha : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final HelloParser.expression_linha_return expression_linha() throws RecognitionException {
		HelloParser.expression_linha_return retval = new HelloParser.expression_linha_return();
		retval.start = input.LT(1);
		int expression_linha_StartIndex = input.index();

		Object root_0 = null;

		Token set97=null;
		ParserRuleReturnScope term96 =null;
		ParserRuleReturnScope term98 =null;

		Object set97_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expression_linha");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(186, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:186:18: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:186:20: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(186,20);
			pushFollow(FOLLOW_term_in_expression_linha1548);
			term96=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term96.getTree());
			dbg.location(186,25);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:186:25: ( ( T_SOMA | T_SUBTRACAO ) term )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= T_SOMA && LA23_0 <= T_SUBTRACAO)) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:186:26: ( T_SOMA | T_SUBTRACAO ) term
					{
					dbg.location(186,26);
					set97=input.LT(1);
					if ( (input.LA(1) >= T_SOMA && input.LA(1) <= T_SUBTRACAO) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set97));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(186,51);
					pushFollow(FOLLOW_term_in_expression_linha1561);
					term98=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term98.getTree());

					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, expression_linha_StartIndex); }

		}
		dbg.location(187, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression_linha");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression_linha"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:189:1: term : relational_expression ( ( T_MULTIPLICACAO | T_DIVISAO ) relational_expression )* ;
	public final HelloParser.term_return term() throws RecognitionException {
		HelloParser.term_return retval = new HelloParser.term_return();
		retval.start = input.LT(1);
		int term_StartIndex = input.index();

		Object root_0 = null;

		Token set100=null;
		ParserRuleReturnScope relational_expression99 =null;
		ParserRuleReturnScope relational_expression101 =null;

		Object set100_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(189, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:189:6: ( relational_expression ( ( T_MULTIPLICACAO | T_DIVISAO ) relational_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:189:8: relational_expression ( ( T_MULTIPLICACAO | T_DIVISAO ) relational_expression )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(189,8);
			pushFollow(FOLLOW_relational_expression_in_term1573);
			relational_expression99=relational_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression99.getTree());
			dbg.location(189,30);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:189:30: ( ( T_MULTIPLICACAO | T_DIVISAO ) relational_expression )*
			try { dbg.enterSubRule(24);

			loop24:
			while (true) {
				int alt24=2;
				try { dbg.enterDecision(24, decisionCanBacktrack[24]);

				int LA24_0 = input.LA(1);
				if ( (LA24_0==T_DIVISAO||LA24_0==T_MULTIPLICACAO) ) {
					alt24=1;
				}

				} finally {dbg.exitDecision(24);}

				switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:189:31: ( T_MULTIPLICACAO | T_DIVISAO ) relational_expression
					{
					dbg.location(189,31);
					set100=input.LT(1);
					if ( input.LA(1)==T_DIVISAO||input.LA(1)==T_MULTIPLICACAO ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set100));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(189,63);
					pushFollow(FOLLOW_relational_expression_in_term1586);
					relational_expression101=relational_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression101.getTree());

					}
					break;

				default :
					break loop24;
				}
			}
			} finally {dbg.exitSubRule(24);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, term_StartIndex); }

		}
		dbg.location(190, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "term"


	public static class relational_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relational_expression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:1: relational_expression : relational_expression_2 ( ( T_MAIOR | T_MENOR ) relational_expression_2 )* ;
	public final HelloParser.relational_expression_return relational_expression() throws RecognitionException {
		HelloParser.relational_expression_return retval = new HelloParser.relational_expression_return();
		retval.start = input.LT(1);
		int relational_expression_StartIndex = input.index();

		Object root_0 = null;

		Token set103=null;
		ParserRuleReturnScope relational_expression_2102 =null;
		ParserRuleReturnScope relational_expression_2104 =null;

		Object set103_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "relational_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(192, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:23: ( relational_expression_2 ( ( T_MAIOR | T_MENOR ) relational_expression_2 )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:25: relational_expression_2 ( ( T_MAIOR | T_MENOR ) relational_expression_2 )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(192,25);
			pushFollow(FOLLOW_relational_expression_2_in_relational_expression1599);
			relational_expression_2102=relational_expression_2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression_2102.getTree());
			dbg.location(192,49);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:49: ( ( T_MAIOR | T_MENOR ) relational_expression_2 )*
			try { dbg.enterSubRule(25);

			loop25:
			while (true) {
				int alt25=2;
				try { dbg.enterDecision(25, decisionCanBacktrack[25]);

				int LA25_0 = input.LA(1);
				if ( (LA25_0==T_MAIOR||LA25_0==T_MENOR) ) {
					alt25=1;
				}

				} finally {dbg.exitDecision(25);}

				switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:50: ( T_MAIOR | T_MENOR ) relational_expression_2
					{
					dbg.location(192,50);
					set103=input.LT(1);
					if ( input.LA(1)==T_MAIOR||input.LA(1)==T_MENOR ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set103));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(192,72);
					pushFollow(FOLLOW_relational_expression_2_in_relational_expression1612);
					relational_expression_2104=relational_expression_2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression_2104.getTree());

					}
					break;

				default :
					break loop25;
				}
			}
			} finally {dbg.exitSubRule(25);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, relational_expression_StartIndex); }

		}
		dbg.location(193, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relational_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "relational_expression"


	public static class relational_expression_2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relational_expression_2"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:195:1: relational_expression_2 : equal_expression ( ( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression )* ;
	public final HelloParser.relational_expression_2_return relational_expression_2() throws RecognitionException {
		HelloParser.relational_expression_2_return retval = new HelloParser.relational_expression_2_return();
		retval.start = input.LT(1);
		int relational_expression_2_StartIndex = input.index();

		Object root_0 = null;

		Token set106=null;
		ParserRuleReturnScope equal_expression105 =null;
		ParserRuleReturnScope equal_expression107 =null;

		Object set106_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "relational_expression_2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(195, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:195:25: ( equal_expression ( ( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:195:27: equal_expression ( ( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(195,27);
			pushFollow(FOLLOW_equal_expression_in_relational_expression_21625);
			equal_expression105=equal_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equal_expression105.getTree());
			dbg.location(195,44);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:195:44: ( ( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression )*
			try { dbg.enterSubRule(26);

			loop26:
			while (true) {
				int alt26=2;
				try { dbg.enterDecision(26, decisionCanBacktrack[26]);

				int LA26_0 = input.LA(1);
				if ( (LA26_0==T_MAIOROUIGUAL||LA26_0==T_MENOROUIGUAL) ) {
					alt26=1;
				}

				} finally {dbg.exitDecision(26);}

				switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:195:45: ( T_MAIOROUIGUAL | T_MENOROUIGUAL ) equal_expression
					{
					dbg.location(195,45);
					set106=input.LT(1);
					if ( input.LA(1)==T_MAIOROUIGUAL||input.LA(1)==T_MENOROUIGUAL ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set106));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(195,81);
					pushFollow(FOLLOW_equal_expression_in_relational_expression_21638);
					equal_expression107=equal_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equal_expression107.getTree());

					}
					break;

				default :
					break loop26;
				}
			}
			} finally {dbg.exitSubRule(26);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, relational_expression_2_StartIndex); }

		}
		dbg.location(196, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relational_expression_2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "relational_expression_2"


	public static class equal_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equal_expression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:198:1: equal_expression : unaryexpr ( ( T_COMPARACAO | T_DIFERENTE ) unaryexpr )* ;
	public final HelloParser.equal_expression_return equal_expression() throws RecognitionException {
		HelloParser.equal_expression_return retval = new HelloParser.equal_expression_return();
		retval.start = input.LT(1);
		int equal_expression_StartIndex = input.index();

		Object root_0 = null;

		Token set109=null;
		ParserRuleReturnScope unaryexpr108 =null;
		ParserRuleReturnScope unaryexpr110 =null;

		Object set109_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "equal_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(198, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:198:18: ( unaryexpr ( ( T_COMPARACAO | T_DIFERENTE ) unaryexpr )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:198:21: unaryexpr ( ( T_COMPARACAO | T_DIFERENTE ) unaryexpr )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(198,21);
			pushFollow(FOLLOW_unaryexpr_in_equal_expression1652);
			unaryexpr108=unaryexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryexpr108.getTree());
			dbg.location(198,31);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:198:31: ( ( T_COMPARACAO | T_DIFERENTE ) unaryexpr )*
			try { dbg.enterSubRule(27);

			loop27:
			while (true) {
				int alt27=2;
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==T_COMPARACAO||LA27_0==T_DIFERENTE) ) {
					alt27=1;
				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:198:32: ( T_COMPARACAO | T_DIFERENTE ) unaryexpr
					{
					dbg.location(198,32);
					set109=input.LT(1);
					if ( input.LA(1)==T_COMPARACAO||input.LA(1)==T_DIFERENTE ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set109));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(198,63);
					pushFollow(FOLLOW_unaryexpr_in_equal_expression1665);
					unaryexpr110=unaryexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryexpr110.getTree());

					}
					break;

				default :
					break loop27;
				}
			}
			} finally {dbg.exitSubRule(27);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, equal_expression_StartIndex); }

		}
		dbg.location(199, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "equal_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "equal_expression"


	public static class unaryexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryexpr"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:1: unaryexpr : factor ( ( T_SOMA | T_SUBTRACAO ) factor )* ;
	public final HelloParser.unaryexpr_return unaryexpr() throws RecognitionException {
		HelloParser.unaryexpr_return retval = new HelloParser.unaryexpr_return();
		retval.start = input.LT(1);
		int unaryexpr_StartIndex = input.index();

		Object root_0 = null;

		Token set112=null;
		ParserRuleReturnScope factor111 =null;
		ParserRuleReturnScope factor113 =null;

		Object set112_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "unaryexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(201, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:11: ( factor ( ( T_SOMA | T_SUBTRACAO ) factor )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:14: factor ( ( T_SOMA | T_SUBTRACAO ) factor )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(201,14);
			pushFollow(FOLLOW_factor_in_unaryexpr1679);
			factor111=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor111.getTree());
			dbg.location(201,21);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:21: ( ( T_SOMA | T_SUBTRACAO ) factor )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=2;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				int LA28_0 = input.LA(1);
				if ( ((LA28_0 >= T_SOMA && LA28_0 <= T_SUBTRACAO)) ) {
					int LA28_1 = input.LA(2);
					if ( (synpred51_Hello()) ) {
						alt28=1;
					}

				}

				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:22: ( T_SOMA | T_SUBTRACAO ) factor
					{
					dbg.location(201,22);
					set112=input.LT(1);
					if ( (input.LA(1) >= T_SOMA && input.LA(1) <= T_SUBTRACAO) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set112));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(201,47);
					pushFollow(FOLLOW_factor_in_unaryexpr1692);
					factor113=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor113.getTree());

					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, unaryexpr_StartIndex); }

		}
		dbg.location(202, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unaryexpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "unaryexpr"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:1: factor : ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES ) ;
	public final HelloParser.factor_return factor() throws RecognitionException {
		HelloParser.factor_return retval = new HelloParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		Object root_0 = null;

		Token ID114=null;
		Token NUMERO115=null;
		Token T_ABREPARENTESES116=null;
		Token T_FECHAPARENTESES118=null;
		ParserRuleReturnScope expression117 =null;

		Object ID114_tree=null;
		Object NUMERO115_tree=null;
		Object T_ABREPARENTESES116_tree=null;
		Object T_FECHAPARENTESES118_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "factor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(204, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:8: ( ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:10: ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES )
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(204,10);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:10: ( ID | NUMERO | T_ABREPARENTESES expression T_FECHAPARENTESES )
			int alt29=3;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt29=1;
				}
				break;
			case NUMERO:
				{
				alt29=2;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt29=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:13: ID
					{
					dbg.location(204,13);
					ID114=(Token)match(input,ID,FOLLOW_ID_in_factor1708); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID114_tree = (Object)adaptor.create(ID114);
					adaptor.addChild(root_0, ID114_tree);
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:19: NUMERO
					{
					dbg.location(204,19);
					NUMERO115=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_factor1713); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMERO115_tree = (Object)adaptor.create(NUMERO115);
					adaptor.addChild(root_0, NUMERO115_tree);
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:28: T_ABREPARENTESES expression T_FECHAPARENTESES
					{
					dbg.location(204,28);
					T_ABREPARENTESES116=(Token)match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1717); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_ABREPARENTESES116_tree = (Object)adaptor.create(T_ABREPARENTESES116);
					adaptor.addChild(root_0, T_ABREPARENTESES116_tree);
					}
					dbg.location(204,45);
					pushFollow(FOLLOW_expression_in_factor1719);
					expression117=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression117.getTree());
					dbg.location(204,56);
					T_FECHAPARENTESES118=(Token)match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1721); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					T_FECHAPARENTESES118_tree = (Object)adaptor.create(T_FECHAPARENTESES118);
					adaptor.addChild(root_0, T_FECHAPARENTESES118_tree);
					}

					}
					break;

			}
			} finally {dbg.exitSubRule(29);}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, factor_StartIndex); }

		}
		dbg.location(205, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "factor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "factor"

	// $ANTLR start synpred25_Hello
	public final void synpred25_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:15: ( ID )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:15: ID
		{
		dbg.location(159,15);
		match(input,ID,FOLLOW_ID_in_synpred25_Hello1317); if (state.failed) return;

		}

	}
	// $ANTLR end synpred25_Hello

	// $ANTLR start synpred27_Hello
	public final void synpred27_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:163:12: ( ID )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:163:12: ID
		{
		dbg.location(163,12);
		match(input,ID,FOLLOW_ID_in_synpred27_Hello1342); if (state.failed) return;

		}

	}
	// $ANTLR end synpred27_Hello

	// $ANTLR start synpred33_Hello
	public final void synpred33_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:6: ( T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )* )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:6: T_FECHACHAVE T_ELSEIF T_ABREPARENTESES expression T_FECHAPARENTESES T_ABRECHAVE ( statement )*
		{
		dbg.location(172,6);
		match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_synpred33_Hello1411); if (state.failed) return;
		dbg.location(172,19);
		match(input,T_ELSEIF,FOLLOW_T_ELSEIF_in_synpred33_Hello1413); if (state.failed) return;
		dbg.location(172,28);
		match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_synpred33_Hello1415); if (state.failed) return;
		dbg.location(172,45);
		pushFollow(FOLLOW_expression_in_synpred33_Hello1417);
		expression();
		state._fsp--;
		if (state.failed) return;
		dbg.location(172,56);
		match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_synpred33_Hello1419); if (state.failed) return;
		dbg.location(172,74);
		match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_synpred33_Hello1421); if (state.failed) return;
		dbg.location(172,86);
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:86: ( statement )*
		try { dbg.enterSubRule(35);

		loop35:
		while (true) {
			int alt35=2;
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( (LA35_0==EOL||LA35_0==ID||(LA35_0 >= TIPOS && LA35_0 <= T_ABRECHAVE)||LA35_0==T_BREAK||LA35_0==T_ESCREVA||(LA35_0 >= T_FOR && LA35_0 <= T_IF)||(LA35_0 >= T_READ && LA35_0 <= T_RETURN)) ) {
				alt35=1;
			}

			} finally {dbg.exitDecision(35);}

			switch (alt35) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:87: statement
				{
				dbg.location(172,87);
				pushFollow(FOLLOW_statement_in_synpred33_Hello1424);
				statement();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop35;
			}
		}
		} finally {dbg.exitSubRule(35);}

		}

	}
	// $ANTLR end synpred33_Hello

	// $ANTLR start synpred35_Hello
	public final void synpred35_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:6: ( T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )* )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:6: T_FECHACHAVE T_ELSE T_ABRECHAVE ( statement )*
		{
		dbg.location(173,6);
		match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_synpred35_Hello1436); if (state.failed) return;
		dbg.location(173,19);
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred35_Hello1438); if (state.failed) return;
		dbg.location(173,26);
		match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_synpred35_Hello1440); if (state.failed) return;
		dbg.location(173,38);
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:38: ( statement )*
		try { dbg.enterSubRule(36);

		loop36:
		while (true) {
			int alt36=2;
			try { dbg.enterDecision(36, decisionCanBacktrack[36]);

			int LA36_0 = input.LA(1);
			if ( (LA36_0==EOL||LA36_0==ID||(LA36_0 >= TIPOS && LA36_0 <= T_ABRECHAVE)||LA36_0==T_BREAK||LA36_0==T_ESCREVA||(LA36_0 >= T_FOR && LA36_0 <= T_IF)||(LA36_0 >= T_READ && LA36_0 <= T_RETURN)) ) {
				alt36=1;
			}

			} finally {dbg.exitDecision(36);}

			switch (alt36) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:39: statement
				{
				dbg.location(173,39);
				pushFollow(FOLLOW_statement_in_synpred35_Hello1443);
				statement();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop36;
			}
		}
		} finally {dbg.exitSubRule(36);}

		}

	}
	// $ANTLR end synpred35_Hello

	// $ANTLR start synpred51_Hello
	public final void synpred51_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:22: ( ( T_SOMA | T_SUBTRACAO ) factor )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:22: ( T_SOMA | T_SUBTRACAO ) factor
		{
		dbg.location(201,22);
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
		}dbg.location(201,47);
		pushFollow(FOLLOW_factor_in_synpred51_Hello1692);
		factor();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred51_Hello

	// Delegated rules

	public final boolean synpred51_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred51_Hello_fragment(); // can never throw exception
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
	public final boolean synpred25_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred25_Hello_fragment(); // can never throw exception
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
	public final boolean synpred35_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred35_Hello_fragment(); // can never throw exception
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
	public final boolean synpred27_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred27_Hello_fragment(); // can never throw exception
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
	public final boolean synpred33_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred33_Hello_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_statement_in_program633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funclist670 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funclist673 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funclist700 = new BitSet(new long[]{0x0000000008000800L});
	public static final BitSet FOLLOW_TIPOS_in_funclist779 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_funclist783 = new BitSet(new long[]{0x0000010008000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_funclist826 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_funclist830 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_funclist834 = new BitSet(new long[]{0x0000010008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funclist899 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funclist925 = new BitSet(new long[]{0x0000003031011920L});
	public static final BitSet FOLLOW_statement_in_funclist961 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funclist989 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_vardecl_in_statement1013 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement1020 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement1027 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement1035 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement1041 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement1058 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_statelist_in_statement1060 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement1067 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl1091 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl1097 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl1100 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_set_in_vardecl1102 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl1113 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_atribstat1127 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_atribstat1150 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_set_in_atribstat1152 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_atribstat1161 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat1181 = new BitSet(new long[]{0x0000000000004780L});
	public static final BitSet FOLLOW_expression_in_atribstat1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall1223 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall1234 = new BitSet(new long[]{0x0000000008000300L});
	public static final BitSet FOLLOW_set_in_funccall1255 = new BitSet(new long[]{0x0000010008000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_funccall1280 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_set_in_funccall1282 = new BitSet(new long[]{0x0000010008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ESCREVA_in_printstat1314 = new BitSet(new long[]{0x0000000000004700L});
	public static final BitSet FOLLOW_ID_in_printstat1317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1339 = new BitSet(new long[]{0x0000000000004700L});
	public static final BitSet FOLLOW_ID_in_readstat1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_readstat1345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_readstat1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1364 = new BitSet(new long[]{0x0000000000004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1386 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1389 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1391 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1393 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1399 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1402 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1411 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_ELSEIF_in_ifstat1413 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1415 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1417 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1419 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1421 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1424 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1436 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat1438 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_ifstat1440 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1443 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_ifstat1453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1464 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1466 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1468 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1470 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_in_forstat1472 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1474 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1476 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1478 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1490 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_statement_in_forstat1493 = new BitSet(new long[]{0x0000003033011920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist1510 = new BitSet(new long[]{0x0000003031011922L});
	public static final BitSet FOLLOW_expression_linha_in_expression1523 = new BitSet(new long[]{0x0000000800200002L});
	public static final BitSet FOLLOW_set_in_expression1527 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_linha_in_expression1537 = new BitSet(new long[]{0x0000000800200002L});
	public static final BitSet FOLLOW_term_in_expression_linha1548 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_set_in_expression_linha1551 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_term_in_expression_linha1561 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_relational_expression_in_term1573 = new BitSet(new long[]{0x0000000400100002L});
	public static final BitSet FOLLOW_set_in_term1576 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_relational_expression_in_term1586 = new BitSet(new long[]{0x0000000400100002L});
	public static final BitSet FOLLOW_relational_expression_2_in_relational_expression1599 = new BitSet(new long[]{0x0000000140000002L});
	public static final BitSet FOLLOW_set_in_relational_expression1602 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_relational_expression_2_in_relational_expression1612 = new BitSet(new long[]{0x0000000140000002L});
	public static final BitSet FOLLOW_equal_expression_in_relational_expression_21625 = new BitSet(new long[]{0x0000000280000002L});
	public static final BitSet FOLLOW_set_in_relational_expression_21628 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_equal_expression_in_relational_expression_21638 = new BitSet(new long[]{0x0000000280000002L});
	public static final BitSet FOLLOW_unaryexpr_in_equal_expression1652 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_set_in_equal_expression1655 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_unaryexpr_in_equal_expression1665 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1679 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_set_in_unaryexpr1682 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1692 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_ID_in_factor1708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1717 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_in_factor1719 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred25_Hello1317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred27_Hello1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_synpred33_Hello1411 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_ELSEIF_in_synpred33_Hello1413 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_synpred33_Hello1415 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_expression_in_synpred33_Hello1417 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_synpred33_Hello1419 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_synpred33_Hello1421 = new BitSet(new long[]{0x0000003031011922L});
	public static final BitSet FOLLOW_statement_in_synpred33_Hello1424 = new BitSet(new long[]{0x0000003031011922L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_synpred35_Hello1436 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred35_Hello1438 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_synpred35_Hello1440 = new BitSet(new long[]{0x0000003031011922L});
	public static final BitSet FOLLOW_statement_in_synpred35_Hello1443 = new BitSet(new long[]{0x0000003031011922L});
	public static final BitSet FOLLOW_set_in_synpred51_Hello1682 = new BitSet(new long[]{0x0000000000004300L});
	public static final BitSet FOLLOW_factor_in_synpred51_Hello1692 = new BitSet(new long[]{0x0000000000000002L});
}
