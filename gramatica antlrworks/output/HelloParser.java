// $ANTLR 3.5.1 C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g 2022-03-01 15:29:02

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMENTARIO", "EOL", "ESPACO_BRANCO", 
		"FUNCAO", "ID", "NUMERO", "TEXTO", "TIPOS", "T_ABRECHAVE", "T_ABRECOLCHETE", 
		"T_ABREPARENTESES", "T_ATRIBUICAO", "T_BREAK", "T_DEF", "T_DIFERENTE", 
		"T_DIVISAO", "T_ELSE", "T_ELSEIF", "T_FECHACHAVE", "T_FECHACOLCHETE", 
		"T_FECHAPARENTESES", "T_FOR", "T_IF", "T_IGUAL", "T_MAIOR", "T_MAIOROUIGUAL", 
		"T_MENOR", "T_MENOROUIGUAL", "T_MULTIPLICACAO", "T_NEW", "T_NULL", "T_READ", 
		"T_RETURN", "T_SOMA", "T_SUBTRACAO", "T_VIRGULA", "T_WRITE"
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
	public static final int T_ELSEIF=21;
	public static final int T_FECHACHAVE=22;
	public static final int T_FECHACOLCHETE=23;
	public static final int T_FECHAPARENTESES=24;
	public static final int T_FOR=25;
	public static final int T_IF=26;
	public static final int T_IGUAL=27;
	public static final int T_MAIOR=28;
	public static final int T_MAIOROUIGUAL=29;
	public static final int T_MENOR=30;
	public static final int T_MENOROUIGUAL=31;
	public static final int T_MULTIPLICACAO=32;
	public static final int T_NEW=33;
	public static final int T_NULL=34;
	public static final int T_READ=35;
	public static final int T_RETURN=36;
	public static final int T_SOMA=37;
	public static final int T_SUBTRACAO=38;
	public static final int T_VIRGULA=39;
	public static final int T_WRITE=40;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred29_Hello", "synpred30_Hello", "synpred48_Hello", 
		"paramlistcall", "expression", "synpred1_Hello", "statelist", "synpred12_Hello", 
		"synpred13_Hello", "readstat", "synpred25_Hello", "synpred26_Hello", "synpred8_Hello", 
		"synpred4_Hello", "synpred36_Hello", "synpred31_Hello", "unaryexpr", "allocexpression", 
		"synpred46_Hello", "returnstat", "synpred33_Hello", "synpred27_Hello", 
		"vardecl", "synpred37_Hello", "synpred2_Hello", "term", "printstat", "synpred11_Hello", 
		"program", "synpred3_Hello", "synpred15_Hello", "synpred41_Hello", "ifstat", 
		"synpred42_Hello", "synpred40_Hello", "synpred24_Hello", "synpred6_Hello", 
		"synpred9_Hello", "synpred22_Hello", "funccall", "synpred10_Hello", "synpred17_Hello", 
		"synpred16_Hello", "synpred43_Hello", "synpred28_Hello", "paramlist", 
		"synpred32_Hello", "funcdef", "funclist", "atribstat", "synpred14_Hello", 
		"numexpression", "synpred7_Hello", "synpred34_Hello", "synpred35_Hello", 
		"synpred50_Hello", "synpred47_Hello", "synpred49_Hello", "factor", "synpred44_Hello", 
		"synpred19_Hello", "synpred38_Hello", "lvalue", "synpred18_Hello", "synpred39_Hello", 
		"statement", "synpred23_Hello", "synpred21_Hello", "forstat", "synpred20_Hello", 
		"synpred5_Hello", "synpred45_Hello"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, true, true, false, false, false, false, false, false, true, true, 
		    true, true, true, false, true, false, false, false, false, false, 
		    false, true, true
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
		this.state.ruleMemo = new HashMap[72+1];


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
		this.state.ruleMemo = new HashMap[72+1];


	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return HelloParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g"; }



	// $ANTLR start "program"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:108:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:108:9: ( ( statement | funclist ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:2: ( statement | funclist )
			{
			dbg.location(109,2);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:2: ( statement | funclist )
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( ((LA1_0 >= EOL && LA1_0 <= ESPACO_BRANCO)||LA1_0==ID||(LA1_0 >= TIPOS && LA1_0 <= T_ABRECHAVE)||LA1_0==T_BREAK||(LA1_0 >= T_FOR && LA1_0 <= T_IF)||(LA1_0 >= T_READ && LA1_0 <= T_RETURN)||LA1_0==T_WRITE) ) {
				alt1=1;
			}
			else if ( (LA1_0==T_DEF) ) {
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:4: statement
					{
					dbg.location(109,4);
					pushFollow(FOLLOW_statement_in_program616);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:16: funclist
					{
					dbg.location(109,16);
					pushFollow(FOLLOW_funclist_in_program620);
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
		dbg.location(110, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "funcdef"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:112:1: funcdef : T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE ;
	public final void funcdef() throws RecognitionException {
		int funcdef_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "funcdef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:113:2: ( T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:113:4: T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE
			{
			dbg.location(113,4);
			match(input,T_DEF,FOLLOW_T_DEF_in_funcdef634); if (state.failed) return;dbg.location(113,11);
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funcdef637); if (state.failed) return;dbg.location(113,18);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funcdef639); if (state.failed) return;dbg.location(113,35);
			pushFollow(FOLLOW_paramlist_in_funcdef641);
			paramlist();
			state._fsp--;
			if (state.failed) return;dbg.location(113,45);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funcdef643); if (state.failed) return;dbg.location(114,3);
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funcdef648); if (state.failed) return;dbg.location(115,5);
			pushFollow(FOLLOW_statelist_in_funcdef655);
			statelist();
			state._fsp--;
			if (state.failed) return;dbg.location(116,3);
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funcdef659); if (state.failed) return;
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
		dbg.location(117, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funcdef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funcdef"



	// $ANTLR start "funclist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:119:1: funclist : ( funcdef funclist | funcdef );
	public final void funclist() throws RecognitionException {
		int funclist_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "funclist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(119, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:119:10: ( funcdef funclist | funcdef )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:119:12: funcdef funclist
					{
					dbg.location(119,12);
					pushFollow(FOLLOW_funcdef_in_funclist670);
					funcdef();
					state._fsp--;
					if (state.failed) return;dbg.location(119,20);
					pushFollow(FOLLOW_funclist_in_funclist672);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:119:31: funcdef
					{
					dbg.location(119,31);
					pushFollow(FOLLOW_funcdef_in_funclist676);
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
		dbg.location(120, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funclist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funclist"



	// $ANTLR start "paramlist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:1: paramlist : ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )? ;
	public final void paramlist() throws RecognitionException {
		int paramlist_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "paramlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(122, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:11: ( ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:14: ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )?
			{
			dbg.location(122,14);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:14: ( TIPOS ID T_VIRGULA paramlist | TIPOS ID )?
			int alt3=3;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==TIPOS) ) {
				int LA3_1 = input.LA(2);
				if ( (synpred3_Hello()) ) {
					alt3=1;
				}
				else if ( (synpred4_Hello()) ) {
					alt3=2;
				}
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:16: TIPOS ID T_VIRGULA paramlist
					{
					dbg.location(122,16);
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist689); if (state.failed) return;dbg.location(122,24);
					match(input,ID,FOLLOW_ID_in_paramlist693); if (state.failed) return;dbg.location(122,27);
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlist695); if (state.failed) return;dbg.location(122,37);
					pushFollow(FOLLOW_paramlist_in_paramlist697);
					paramlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:49: TIPOS ID
					{
					dbg.location(122,49);
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist701); if (state.failed) return;dbg.location(122,57);
					match(input,ID,FOLLOW_ID_in_paramlist705); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

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
		dbg.location(123, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramlist"



	// $ANTLR start "statelist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		int statelist_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statelist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:11: ( statement ( statelist )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:13: statement ( statelist )?
			{
			dbg.location(125,13);
			pushFollow(FOLLOW_statement_in_statelist717);
			statement();
			state._fsp--;
			if (state.failed) return;dbg.location(125,23);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:23: ( statelist )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= EOL && LA4_0 <= ESPACO_BRANCO)||LA4_0==ID||(LA4_0 >= TIPOS && LA4_0 <= T_ABRECHAVE)||LA4_0==T_BREAK||(LA4_0 >= T_FOR && LA4_0 <= T_IF)||(LA4_0 >= T_READ && LA4_0 <= T_RETURN)||LA4_0==T_WRITE) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:24: statelist
					{
					dbg.location(125,24);
					pushFollow(FOLLOW_statelist_in_statelist720);
					statelist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, statelist_StartIndex); }

		}
		dbg.location(126, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statelist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statelist"



	// $ANTLR start "statement"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:128:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | ESPACO_BRANCO | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(128, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:129:2: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | ESPACO_BRANCO | T_BREAK EOL | EOL ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:129:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | ESPACO_BRANCO | T_BREAK EOL | EOL )
			{
			dbg.location(129,3);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:129:3: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | ESPACO_BRANCO | T_BREAK EOL | EOL )
			int alt5=11;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case TIPOS:
				{
				alt5=1;
				}
				break;
			case ID:
				{
				alt5=2;
				}
				break;
			case T_WRITE:
				{
				alt5=3;
				}
				break;
			case T_READ:
				{
				alt5=4;
				}
				break;
			case T_RETURN:
				{
				alt5=5;
				}
				break;
			case T_IF:
				{
				alt5=6;
				}
				break;
			case T_FOR:
				{
				alt5=7;
				}
				break;
			case T_ABRECHAVE:
				{
				alt5=8;
				}
				break;
			case ESPACO_BRANCO:
				{
				alt5=9;
				}
				break;
			case T_BREAK:
				{
				alt5=10;
				}
				break;
			case EOL:
				{
				alt5=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:129:4: vardecl EOL
					{
					dbg.location(129,4);
					pushFollow(FOLLOW_vardecl_in_statement733);
					vardecl();
					state._fsp--;
					if (state.failed) return;dbg.location(129,12);
					match(input,EOL,FOLLOW_EOL_in_statement735); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:130:2: atribstat EOL
					{
					dbg.location(130,2);
					pushFollow(FOLLOW_atribstat_in_statement740);
					atribstat();
					state._fsp--;
					if (state.failed) return;dbg.location(130,12);
					match(input,EOL,FOLLOW_EOL_in_statement742); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:131:2: printstat EOL
					{
					dbg.location(131,2);
					pushFollow(FOLLOW_printstat_in_statement747);
					printstat();
					state._fsp--;
					if (state.failed) return;dbg.location(131,12);
					match(input,EOL,FOLLOW_EOL_in_statement749); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:132:2: readstat EOL
					{
					dbg.location(132,2);
					pushFollow(FOLLOW_readstat_in_statement755);
					readstat();
					state._fsp--;
					if (state.failed) return;dbg.location(132,11);
					match(input,EOL,FOLLOW_EOL_in_statement757); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:133:2: returnstat EOL
					{
					dbg.location(133,2);
					pushFollow(FOLLOW_returnstat_in_statement761);
					returnstat();
					state._fsp--;
					if (state.failed) return;dbg.location(133,13);
					match(input,EOL,FOLLOW_EOL_in_statement763); if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:134:2: ifstat
					{
					dbg.location(134,2);
					pushFollow(FOLLOW_ifstat_in_statement768);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:135:2: forstat
					{
					dbg.location(135,2);
					pushFollow(FOLLOW_forstat_in_statement773);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:136:2: T_ABRECHAVE statelist T_FECHACHAVE
					{
					dbg.location(136,2);
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement778); if (state.failed) return;dbg.location(136,14);
					pushFollow(FOLLOW_statelist_in_statement780);
					statelist();
					state._fsp--;
					if (state.failed) return;dbg.location(136,24);
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement782); if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:137:2: ESPACO_BRANCO
					{
					dbg.location(137,2);
					match(input,ESPACO_BRANCO,FOLLOW_ESPACO_BRANCO_in_statement787); if (state.failed) return;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:138:2: T_BREAK EOL
					{
					dbg.location(138,2);
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement792); if (state.failed) return;dbg.location(138,10);
					match(input,EOL,FOLLOW_EOL_in_statement794); if (state.failed) return;
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:139:2: EOL
					{
					dbg.location(139,2);
					match(input,EOL,FOLLOW_EOL_in_statement799); if (state.failed) return;
					}
					break;

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
			if ( state.backtracking>0 ) { memoize(input, 6, statement_StartIndex); }

		}
		dbg.location(140, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:142:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		int vardecl_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "vardecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(142, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:143:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:144:4: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			dbg.location(144,4);
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl816); if (state.failed) return;dbg.location(145,4);
			match(input,ID,FOLLOW_ID_in_vardecl822); if (state.failed) return;dbg.location(145,7);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:145:7: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==T_ABRECOLCHETE) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:145:8: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					dbg.location(145,8);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl825); if (state.failed) return;dbg.location(145,23);
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
					}dbg.location(145,40);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl838); if (state.failed) return;
					}
					break;

				default :
					break loop6;
				}
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
			if ( state.backtracking>0 ) { memoize(input, 7, vardecl_StartIndex); }

		}
		dbg.location(146, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vardecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "vardecl"



	// $ANTLR start "lvalue"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:148:1: lvalue : ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* ;
	public final void lvalue() throws RecognitionException {
		int lvalue_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "lvalue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(148, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:149:2: ( ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:149:5: ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			{
			dbg.location(149,5);
			match(input,ID,FOLLOW_ID_in_lvalue852); if (state.failed) return;dbg.location(150,3);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:150:3: ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:150:5: T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE
					{
					dbg.location(150,5);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_lvalue858); if (state.failed) return;dbg.location(150,20);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:150:20: ( numexpression )
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:150:22: numexpression
					{
					dbg.location(150,22);
					pushFollow(FOLLOW_numexpression_in_lvalue862);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}
					dbg.location(150,38);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_lvalue866); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 8, lvalue_StartIndex); }

		}
		dbg.location(151, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lvalue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lvalue"



	// $ANTLR start "atribstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:153:1: atribstat : lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		int atribstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "atribstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(153, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:154:2: ( lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:155:2: lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO )
			{
			dbg.location(155,2);
			pushFollow(FOLLOW_lvalue_in_atribstat881);
			lvalue();
			state._fsp--;
			if (state.failed) return;dbg.location(156,2);
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat887); if (state.failed) return;dbg.location(157,2);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:157:2: ( expression | allocexpression | funccall | TEXTO )
			int alt8=4;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt8=1;
				}
				break;
			case T_NEW:
				{
				alt8=2;
				}
				break;
			case FUNCAO:
				{
				alt8=3;
				}
				break;
			case TEXTO:
				{
				alt8=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:157:4: expression
					{
					dbg.location(157,4);
					pushFollow(FOLLOW_expression_in_atribstat893);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:157:17: allocexpression
					{
					dbg.location(157,17);
					pushFollow(FOLLOW_allocexpression_in_atribstat897);
					allocexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:157:35: funccall
					{
					dbg.location(157,35);
					pushFollow(FOLLOW_funccall_in_atribstat901);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:157:46: TEXTO
					{
					dbg.location(157,46);
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat905); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, atribstat_StartIndex); }

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



	// $ANTLR start "allocexpression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:160:1: allocexpression : T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ ;
	public final void allocexpression() throws RecognitionException {
		int allocexpression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "allocexpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(160, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:160:17: ( T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:160:19: T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			{
			dbg.location(160,19);
			match(input,T_NEW,FOLLOW_T_NEW_in_allocexpression917); if (state.failed) return;dbg.location(160,25);
			match(input,TIPOS,FOLLOW_TIPOS_in_allocexpression919); if (state.failed) return;dbg.location(160,31);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:160:31: ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			int cnt9=0;
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==T_ABRECOLCHETE) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:160:32: T_ABRECOLCHETE numexpression T_FECHACOLCHETE
					{
					dbg.location(160,32);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_allocexpression922); if (state.failed) return;dbg.location(160,47);
					pushFollow(FOLLOW_numexpression_in_allocexpression924);
					numexpression();
					state._fsp--;
					if (state.failed) return;dbg.location(160,61);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_allocexpression926); if (state.failed) return;
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(9, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt9++;
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
			if ( state.backtracking>0 ) { memoize(input, 10, allocexpression_StartIndex); }

		}
		dbg.location(161, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "allocexpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "allocexpression"



	// $ANTLR start "funccall"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:163:1: funccall : FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "funccall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(163, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:164:2: ( FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:164:4: FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES
			{
			dbg.location(164,4);
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall939); if (state.failed) return;dbg.location(165,9);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall950); if (state.failed) return;dbg.location(166,17);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:166:17: ( paramlistcall )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==T_FECHAPARENTESES) ) {
				int LA10_1 = input.LA(2);
				if ( (synpred23_Hello()) ) {
					alt10=1;
				}
			}
			else if ( ((LA10_0 >= ID && LA10_0 <= TEXTO)||LA10_0==T_ABREPARENTESES||LA10_0==T_NULL||(LA10_0 >= T_SOMA && LA10_0 <= T_SUBTRACAO)) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:166:19: paramlistcall
					{
					dbg.location(166,19);
					pushFollow(FOLLOW_paramlistcall_in_funccall971);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(167,9);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall984); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, funccall_StartIndex); }

		}
		dbg.location(168, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funccall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funccall"



	// $ANTLR start "paramlistcall"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:170:1: paramlistcall : ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )? ;
	public final void paramlistcall() throws RecognitionException {
		int paramlistcall_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "paramlistcall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(170, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:2: ( ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:6: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )?
			{
			dbg.location(171,6);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:6: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall | ( ID | TEXTO | expression ) )?
			int alt13=3;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= ID && LA13_0 <= TEXTO)||LA13_0==T_ABREPARENTESES||LA13_0==T_NULL||(LA13_0 >= T_SOMA && LA13_0 <= T_SUBTRACAO)) ) {
				int LA13_1 = input.LA(2);
				if ( (synpred26_Hello()) ) {
					alt13=1;
				}
				else if ( (synpred29_Hello()) ) {
					alt13=2;
				}
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:8: ( ID | TEXTO | expression ) T_VIRGULA paramlistcall
					{
					dbg.location(171,8);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:8: ( ID | TEXTO | expression )
					int alt11=3;
					try { dbg.enterSubRule(11);
					try { dbg.enterDecision(11, decisionCanBacktrack[11]);

					switch ( input.LA(1) ) {
					case ID:
						{
						int LA11_1 = input.LA(2);
						if ( (synpred24_Hello()) ) {
							alt11=1;
						}
						else if ( (true) ) {
							alt11=3;
						}

						}
						break;
					case TEXTO:
						{
						alt11=2;
						}
						break;
					case NUMERO:
					case T_ABREPARENTESES:
					case T_NULL:
					case T_SOMA:
					case T_SUBTRACAO:
						{
						alt11=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(11);}

					switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:10: ID
							{
							dbg.location(171,10);
							match(input,ID,FOLLOW_ID_in_paramlistcall1001); if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:15: TEXTO
							{
							dbg.location(171,15);
							match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1005); if (state.failed) return;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:23: expression
							{
							dbg.location(171,23);
							pushFollow(FOLLOW_expression_in_paramlistcall1009);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(171,35);
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlistcall1012); if (state.failed) return;dbg.location(171,45);
					pushFollow(FOLLOW_paramlistcall_in_paramlistcall1014);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:61: ( ID | TEXTO | expression )
					{
					dbg.location(171,61);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:61: ( ID | TEXTO | expression )
					int alt12=3;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					switch ( input.LA(1) ) {
					case ID:
						{
						int LA12_1 = input.LA(2);
						if ( (synpred27_Hello()) ) {
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
					case T_NULL:
					case T_SOMA:
					case T_SUBTRACAO:
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

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:63: ID
							{
							dbg.location(171,63);
							match(input,ID,FOLLOW_ID_in_paramlistcall1020); if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:68: TEXTO
							{
							dbg.location(171,68);
							match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1024); if (state.failed) return;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:76: expression
							{
							dbg.location(171,76);
							pushFollow(FOLLOW_expression_in_paramlistcall1028);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(12);}

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
			if ( state.backtracking>0 ) { memoize(input, 12, paramlistcall_StartIndex); }

		}
		dbg.location(172, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramlistcall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramlistcall"



	// $ANTLR start "printstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:174:1: printstat : T_WRITE ( lvalue | TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		int printstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "printstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(174, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:175:2: ( T_WRITE ( lvalue | TEXTO | expression ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:175:4: T_WRITE ( lvalue | TEXTO | expression )
			{
			dbg.location(175,4);
			match(input,T_WRITE,FOLLOW_T_WRITE_in_printstat1043); if (state.failed) return;dbg.location(175,12);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:175:12: ( lvalue | TEXTO | expression )
			int alt14=3;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA14_1 = input.LA(2);
				if ( (synpred30_Hello()) ) {
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
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt14=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:175:14: lvalue
					{
					dbg.location(175,14);
					pushFollow(FOLLOW_lvalue_in_printstat1047);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:175:23: TEXTO
					{
					dbg.location(175,23);
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1051); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:175:31: expression
					{
					dbg.location(175,31);
					pushFollow(FOLLOW_expression_in_printstat1055);
					expression();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 13, printstat_StartIndex); }

		}
		dbg.location(176, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:178:1: readstat : T_READ lvalue ;
	public final void readstat() throws RecognitionException {
		int readstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "readstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(178, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:179:2: ( T_READ lvalue )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:179:4: T_READ lvalue
			{
			dbg.location(179,4);
			match(input,T_READ,FOLLOW_T_READ_in_readstat1069); if (state.failed) return;dbg.location(179,11);
			pushFollow(FOLLOW_lvalue_in_readstat1071);
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
			if ( state.backtracking>0 ) { memoize(input, 14, readstat_StartIndex); }

		}
		dbg.location(180, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "readstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:182:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "returnstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(182, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:183:2: ( T_RETURN ( TEXTO | expression )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:183:4: T_RETURN ( TEXTO | expression )?
			{
			dbg.location(183,4);
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1083); if (state.failed) return;dbg.location(183,13);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:183:13: ( TEXTO | expression )?
			int alt15=3;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==TEXTO) ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= ID && LA15_0 <= NUMERO)||LA15_0==T_ABREPARENTESES||LA15_0==T_NULL||(LA15_0 >= T_SOMA && LA15_0 <= T_SUBTRACAO)) ) {
				alt15=2;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:183:15: TEXTO
					{
					dbg.location(183,15);
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1087); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:183:23: expression
					{
					dbg.location(183,23);
					pushFollow(FOLLOW_expression_in_returnstat1091);
					expression();
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
			if ( state.backtracking>0 ) { memoize(input, 15, returnstat_StartIndex); }

		}
		dbg.location(184, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returnstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:197:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( T_ELSE statement )? ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "ifstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(197, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:197:8: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( T_ELSE statement )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:197:10: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ( T_ELSE statement )?
			{
			dbg.location(197,10);
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1117); if (state.failed) return;dbg.location(197,15);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1119); if (state.failed) return;dbg.location(197,32);
			pushFollow(FOLLOW_expression_in_ifstat1121);
			expression();
			state._fsp--;
			if (state.failed) return;dbg.location(197,43);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1123); if (state.failed) return;dbg.location(197,61);
			pushFollow(FOLLOW_statement_in_ifstat1125);
			statement();
			state._fsp--;
			if (state.failed) return;dbg.location(197,71);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:197:71: ( T_ELSE statement )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==T_ELSE) ) {
				int LA16_1 = input.LA(2);
				if ( (synpred34_Hello()) ) {
					alt16=1;
				}
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:197:72: T_ELSE statement
					{
					dbg.location(197,72);
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat1128); if (state.failed) return;dbg.location(197,79);
					pushFollow(FOLLOW_statement_in_ifstat1130);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, ifstat_StartIndex); }

		}
		dbg.location(198, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifstat"



	// $ANTLR start "forstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:200:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE ;
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "forstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(200, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:200:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:200:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE
			{
			dbg.location(200,11);
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1142); if (state.failed) return;dbg.location(200,17);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1144); if (state.failed) return;dbg.location(200,34);
			pushFollow(FOLLOW_atribstat_in_forstat1146);
			atribstat();
			state._fsp--;
			if (state.failed) return;dbg.location(200,44);
			match(input,EOL,FOLLOW_EOL_in_forstat1148); if (state.failed) return;dbg.location(200,48);
			pushFollow(FOLLOW_expression_in_forstat1150);
			expression();
			state._fsp--;
			if (state.failed) return;dbg.location(200,59);
			match(input,EOL,FOLLOW_EOL_in_forstat1152); if (state.failed) return;dbg.location(200,63);
			pushFollow(FOLLOW_atribstat_in_forstat1154);
			atribstat();
			state._fsp--;
			if (state.failed) return;dbg.location(200,73);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1156); if (state.failed) return;dbg.location(201,10);
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1168); if (state.failed) return;dbg.location(201,22);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:22: ( statement )*
			try { dbg.enterSubRule(17);

			loop17:
			while (true) {
				int alt17=2;
				try { dbg.enterDecision(17, decisionCanBacktrack[17]);

				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= EOL && LA17_0 <= ESPACO_BRANCO)||LA17_0==ID||(LA17_0 >= TIPOS && LA17_0 <= T_ABRECHAVE)||LA17_0==T_BREAK||(LA17_0 >= T_FOR && LA17_0 <= T_IF)||(LA17_0 >= T_READ && LA17_0 <= T_RETURN)||LA17_0==T_WRITE) ) {
					alt17=1;
				}

				} finally {dbg.exitDecision(17);}

				switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:23: statement
					{
					dbg.location(201,23);
					pushFollow(FOLLOW_statement_in_forstat1171);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop17;
				}
			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(201,35);
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1175); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, forstat_StartIndex); }

		}
		dbg.location(202, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "forstat"



	// $ANTLR start "expression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:1: expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(204, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:12: ( numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:14: numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			{
			dbg.location(204,14);
			pushFollow(FOLLOW_numexpression_in_expression1187);
			numexpression();
			state._fsp--;
			if (state.failed) return;dbg.location(204,28);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:28: ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==T_DIFERENTE||(LA18_0 >= T_IGUAL && LA18_0 <= T_MENOROUIGUAL)) ) {
				alt18=1;
			}
			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:30: ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression
					{
					dbg.location(204,30);
					if ( input.LA(1)==T_DIFERENTE||(input.LA(1) >= T_IGUAL && input.LA(1) <= T_MENOROUIGUAL) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(204,110);
					pushFollow(FOLLOW_numexpression_in_expression1217);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

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
			if ( state.backtracking>0 ) { memoize(input, 18, expression_StartIndex); }

		}
		dbg.location(205, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression"



	// $ANTLR start "numexpression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:207:1: numexpression : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void numexpression() throws RecognitionException {
		int numexpression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "numexpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(207, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:207:15: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:207:17: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			dbg.location(207,17);
			pushFollow(FOLLOW_term_in_numexpression1229);
			term();
			state._fsp--;
			if (state.failed) return;dbg.location(207,22);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:207:22: ( ( T_SOMA | T_SUBTRACAO ) term )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= T_SOMA && LA19_0 <= T_SUBTRACAO)) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:207:23: ( T_SOMA | T_SUBTRACAO ) term
					{
					dbg.location(207,23);
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
					}dbg.location(207,48);
					pushFollow(FOLLOW_term_in_numexpression1242);
					term();
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
			if ( state.backtracking>0 ) { memoize(input, 19, numexpression_StartIndex); }

		}
		dbg.location(208, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "numexpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "numexpression"



	// $ANTLR start "term"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:210:1: term : unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* ;
	public final void term() throws RecognitionException {
		int term_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(210, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:210:6: ( unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:211:2: unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			{
			dbg.location(211,2);
			pushFollow(FOLLOW_unaryexpr_in_term1255);
			unaryexpr();
			state._fsp--;
			if (state.failed) return;dbg.location(211,12);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:211:12: ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==T_DIVISAO||LA20_0==T_MULTIPLICACAO) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:211:14: ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr
					{
					dbg.location(211,14);
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
					}dbg.location(211,45);
					pushFollow(FOLLOW_unaryexpr_in_term1268);
					unaryexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, term_StartIndex); }

		}
		dbg.location(212, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "term"



	// $ANTLR start "unaryexpr"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:214:1: unaryexpr : ( T_SOMA | T_SUBTRACAO )? factor ;
	public final void unaryexpr() throws RecognitionException {
		int unaryexpr_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "unaryexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(214, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:214:11: ( ( T_SOMA | T_SUBTRACAO )? factor )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:214:14: ( T_SOMA | T_SUBTRACAO )? factor
			{
			dbg.location(214,14);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:214:14: ( T_SOMA | T_SUBTRACAO )?
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( ((LA21_0 >= T_SOMA && LA21_0 <= T_SUBTRACAO)) ) {
				alt21=1;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:
					{
					dbg.location(214,14);
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
					}
					}
					break;

			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(214,40);
			pushFollow(FOLLOW_factor_in_unaryexpr1292);
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
			if ( state.backtracking>0 ) { memoize(input, 21, unaryexpr_StartIndex); }

		}
		dbg.location(215, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unaryexpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "factor"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:217:1: factor : ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		int factor_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "factor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(217, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:217:8: ( ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:217:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			{
			dbg.location(217,10);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:217:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			int alt22=4;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			switch ( input.LA(1) ) {
			case NUMERO:
				{
				alt22=1;
				}
				break;
			case ID:
				{
				alt22=2;
				}
				break;
			case T_NULL:
				{
				alt22=3;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt22=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:217:12: NUMERO
					{
					dbg.location(217,12);
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1304); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:217:21: lvalue
					{
					dbg.location(217,21);
					pushFollow(FOLLOW_lvalue_in_factor1308);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:217:30: T_NULL
					{
					dbg.location(217,30);
					match(input,T_NULL,FOLLOW_T_NULL_in_factor1312); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:217:39: T_ABREPARENTESES numexpression T_FECHAPARENTESES
					{
					dbg.location(217,39);
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1316); if (state.failed) return;dbg.location(217,56);
					pushFollow(FOLLOW_numexpression_in_factor1318);
					numexpression();
					state._fsp--;
					if (state.failed) return;dbg.location(217,70);
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1320); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(22);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, factor_StartIndex); }

		}
		dbg.location(218, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "factor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "factor"

	// $ANTLR start synpred2_Hello
	public final void synpred2_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:119:12: ( funcdef funclist )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:119:12: funcdef funclist
		{
		dbg.location(119,12);
		pushFollow(FOLLOW_funcdef_in_synpred2_Hello670);
		funcdef();
		state._fsp--;
		if (state.failed) return;dbg.location(119,20);
		pushFollow(FOLLOW_funclist_in_synpred2_Hello672);
		funclist();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Hello

	// $ANTLR start synpred3_Hello
	public final void synpred3_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:16: ( TIPOS ID T_VIRGULA paramlist )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:16: TIPOS ID T_VIRGULA paramlist
		{
		dbg.location(122,16);
		match(input,TIPOS,FOLLOW_TIPOS_in_synpred3_Hello689); if (state.failed) return;dbg.location(122,24);
		match(input,ID,FOLLOW_ID_in_synpred3_Hello693); if (state.failed) return;dbg.location(122,27);
		match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_synpred3_Hello695); if (state.failed) return;dbg.location(122,37);
		pushFollow(FOLLOW_paramlist_in_synpred3_Hello697);
		paramlist();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_Hello

	// $ANTLR start synpred4_Hello
	public final void synpred4_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:49: ( TIPOS ID )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:49: TIPOS ID
		{
		dbg.location(122,49);
		match(input,TIPOS,FOLLOW_TIPOS_in_synpred4_Hello701); if (state.failed) return;dbg.location(122,57);
		match(input,ID,FOLLOW_ID_in_synpred4_Hello705); if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_Hello

	// $ANTLR start synpred23_Hello
	public final void synpred23_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:166:19: ( paramlistcall )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:166:19: paramlistcall
		{
		dbg.location(166,19);
		pushFollow(FOLLOW_paramlistcall_in_synpred23_Hello971);
		paramlistcall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_Hello

	// $ANTLR start synpred24_Hello
	public final void synpred24_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:10: ( ID )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:10: ID
		{
		dbg.location(171,10);
		match(input,ID,FOLLOW_ID_in_synpred24_Hello1001); if (state.failed) return;
		}

	}
	// $ANTLR end synpred24_Hello

	// $ANTLR start synpred26_Hello
	public final void synpred26_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:8: ( ( ID | TEXTO | expression ) T_VIRGULA paramlistcall )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:8: ( ID | TEXTO | expression ) T_VIRGULA paramlistcall
		{
		dbg.location(171,8);
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:8: ( ID | TEXTO | expression )
		int alt23=3;
		try { dbg.enterSubRule(23);
		try { dbg.enterDecision(23, decisionCanBacktrack[23]);

		switch ( input.LA(1) ) {
		case ID:
			{
			int LA23_1 = input.LA(2);
			if ( (synpred24_Hello()) ) {
				alt23=1;
			}
			else if ( (true) ) {
				alt23=3;
			}

			}
			break;
		case TEXTO:
			{
			alt23=2;
			}
			break;
		case NUMERO:
		case T_ABREPARENTESES:
		case T_NULL:
		case T_SOMA:
		case T_SUBTRACAO:
			{
			alt23=3;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 23, 0, input);
			dbg.recognitionException(nvae);
			throw nvae;
		}
		} finally {dbg.exitDecision(23);}

		switch (alt23) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:10: ID
				{
				dbg.location(171,10);
				match(input,ID,FOLLOW_ID_in_synpred26_Hello1001); if (state.failed) return;
				}
				break;
			case 2 :
				dbg.enterAlt(2);

				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:15: TEXTO
				{
				dbg.location(171,15);
				match(input,TEXTO,FOLLOW_TEXTO_in_synpred26_Hello1005); if (state.failed) return;
				}
				break;
			case 3 :
				dbg.enterAlt(3);

				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:23: expression
				{
				dbg.location(171,23);
				pushFollow(FOLLOW_expression_in_synpred26_Hello1009);
				expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(23);}
		dbg.location(171,35);
		match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_synpred26_Hello1012); if (state.failed) return;dbg.location(171,45);
		pushFollow(FOLLOW_paramlistcall_in_synpred26_Hello1014);
		paramlistcall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_Hello

	// $ANTLR start synpred27_Hello
	public final void synpred27_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:63: ( ID )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:63: ID
		{
		dbg.location(171,63);
		match(input,ID,FOLLOW_ID_in_synpred27_Hello1020); if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_Hello

	// $ANTLR start synpred29_Hello
	public final void synpred29_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:61: ( ( ID | TEXTO | expression ) )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:61: ( ID | TEXTO | expression )
		{
		dbg.location(171,61);
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:61: ( ID | TEXTO | expression )
		int alt24=3;
		try { dbg.enterSubRule(24);
		try { dbg.enterDecision(24, decisionCanBacktrack[24]);

		switch ( input.LA(1) ) {
		case ID:
			{
			int LA24_1 = input.LA(2);
			if ( (synpred27_Hello()) ) {
				alt24=1;
			}
			else if ( (true) ) {
				alt24=3;
			}

			}
			break;
		case TEXTO:
			{
			alt24=2;
			}
			break;
		case NUMERO:
		case T_ABREPARENTESES:
		case T_NULL:
		case T_SOMA:
		case T_SUBTRACAO:
			{
			alt24=3;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 24, 0, input);
			dbg.recognitionException(nvae);
			throw nvae;
		}
		} finally {dbg.exitDecision(24);}

		switch (alt24) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:63: ID
				{
				dbg.location(171,63);
				match(input,ID,FOLLOW_ID_in_synpred29_Hello1020); if (state.failed) return;
				}
				break;
			case 2 :
				dbg.enterAlt(2);

				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:68: TEXTO
				{
				dbg.location(171,68);
				match(input,TEXTO,FOLLOW_TEXTO_in_synpred29_Hello1024); if (state.failed) return;
				}
				break;
			case 3 :
				dbg.enterAlt(3);

				// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:76: expression
				{
				dbg.location(171,76);
				pushFollow(FOLLOW_expression_in_synpred29_Hello1028);
				expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(24);}

		}

	}
	// $ANTLR end synpred29_Hello

	// $ANTLR start synpred30_Hello
	public final void synpred30_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:175:14: ( lvalue )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:175:14: lvalue
		{
		dbg.location(175,14);
		pushFollow(FOLLOW_lvalue_in_synpred30_Hello1047);
		lvalue();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred30_Hello

	// $ANTLR start synpred34_Hello
	public final void synpred34_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:197:72: ( T_ELSE statement )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:197:72: T_ELSE statement
		{
		dbg.location(197,72);
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred34_Hello1128); if (state.failed) return;dbg.location(197,79);
		pushFollow(FOLLOW_statement_in_synpred34_Hello1130);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred34_Hello

	// Delegated rules

	public final boolean synpred3_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred3_Hello_fragment(); // can never throw exception
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
	public final boolean synpred29_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred29_Hello_fragment(); // can never throw exception
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
	public final boolean synpred34_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred34_Hello_fragment(); // can never throw exception
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
	public final boolean synpred30_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred30_Hello_fragment(); // can never throw exception
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
	public final boolean synpred2_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred2_Hello_fragment(); // can never throw exception
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
	public final boolean synpred23_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred23_Hello_fragment(); // can never throw exception
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
	public final boolean synpred4_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred4_Hello_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_statement_in_program616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funcdef634 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funcdef637 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funcdef639 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_paramlist_in_funcdef641 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funcdef643 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funcdef648 = new BitSet(new long[]{0x0000011806011960L});
	public static final BitSet FOLLOW_statelist_in_funcdef655 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funcdef659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist670 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_in_funclist672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist689 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist693 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlist695 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_paramlist697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist701 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist717 = new BitSet(new long[]{0x0000011806011962L});
	public static final BitSet FOLLOW_statelist_in_statelist720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_statement733 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement740 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement747 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement755 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement761 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement778 = new BitSet(new long[]{0x0000011806011960L});
	public static final BitSet FOLLOW_statelist_in_statement780 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ESPACO_BRANCO_in_statement787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement792 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl816 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl822 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl825 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_set_in_vardecl827 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl838 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_lvalue852 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_lvalue858 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_numexpression_in_lvalue862 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_lvalue866 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_lvalue_in_atribstat881 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat887 = new BitSet(new long[]{0x0000006600004780L});
	public static final BitSet FOLLOW_expression_in_atribstat893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocexpression_in_atribstat897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NEW_in_allocexpression917 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_allocexpression919 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_allocexpression922 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_numexpression_in_allocexpression924 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_allocexpression926 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall939 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall950 = new BitSet(new long[]{0x0000006401004700L});
	public static final BitSet FOLLOW_paramlistcall_in_funccall971 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramlistcall1001 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1005 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1009 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlistcall1012 = new BitSet(new long[]{0x0000006400004700L});
	public static final BitSet FOLLOW_paramlistcall_in_paramlistcall1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramlistcall1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WRITE_in_printstat1043 = new BitSet(new long[]{0x0000006400004700L});
	public static final BitSet FOLLOW_lvalue_in_printstat1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1069 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_lvalue_in_readstat1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1083 = new BitSet(new long[]{0x0000006400004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1117 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1119 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1121 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1123 = new BitSet(new long[]{0x0000011806011960L});
	public static final BitSet FOLLOW_statement_in_ifstat1125 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat1128 = new BitSet(new long[]{0x0000011806011960L});
	public static final BitSet FOLLOW_statement_in_ifstat1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1142 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1144 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1146 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1148 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_expression_in_forstat1150 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1152 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1154 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1156 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1168 = new BitSet(new long[]{0x0000011806411960L});
	public static final BitSet FOLLOW_statement_in_forstat1171 = new BitSet(new long[]{0x0000011806411960L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numexpression_in_expression1187 = new BitSet(new long[]{0x00000000F8040002L});
	public static final BitSet FOLLOW_set_in_expression1191 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_numexpression_in_expression1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numexpression1229 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_set_in_numexpression1232 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_term_in_numexpression1242 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_term1255 = new BitSet(new long[]{0x0000000100080002L});
	public static final BitSet FOLLOW_set_in_term1259 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_unaryexpr_in_term1268 = new BitSet(new long[]{0x0000000100080002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_factor1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NULL_in_factor1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1316 = new BitSet(new long[]{0x0000006400004300L});
	public static final BitSet FOLLOW_numexpression_in_factor1318 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_synpred2_Hello670 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_in_synpred2_Hello672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_synpred3_Hello689 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_synpred3_Hello693 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_synpred3_Hello695 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_synpred3_Hello697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_synpred4_Hello701 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_synpred4_Hello705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramlistcall_in_synpred23_Hello971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred24_Hello1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred26_Hello1001 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_TEXTO_in_synpred26_Hello1005 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_expression_in_synpred26_Hello1009 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_T_VIRGULA_in_synpred26_Hello1012 = new BitSet(new long[]{0x0000006400004700L});
	public static final BitSet FOLLOW_paramlistcall_in_synpred26_Hello1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred27_Hello1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred29_Hello1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_synpred29_Hello1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred29_Hello1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred30_Hello1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred34_Hello1128 = new BitSet(new long[]{0x0000011806011960L});
	public static final BitSet FOLLOW_statement_in_synpred34_Hello1130 = new BitSet(new long[]{0x0000000000000002L});
}
