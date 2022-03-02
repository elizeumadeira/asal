// $ANTLR 3.5.1 C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g 2022-03-01 20:24:09

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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred6_Hello", "synpred24_Hello", "synpred20_Hello", 
		"paramlist_linha", "synpred38_Hello", "synpred7_Hello", "synpred36_Hello", 
		"paramlist", "synpred2_Hello", "ifstat_linha", "synpred37_Hello", "synpred43_Hello", 
		"synpred46_Hello", "vardecl", "synpred13_Hello", "synpred39_Hello", "synpred41_Hello", 
		"allocexpression", "synpred14_Hello", "atribstat", "synpred23_Hello", 
		"synpred34_Hello", "funcdef", "synpred10_Hello", "funclist", "expression", 
		"synpred21_Hello", "term", "synpred47_Hello", "numexpression", "synpred19_Hello", 
		"synpred31_Hello", "synpred4_Hello", "synpred42_Hello", "paramlistcall_linha", 
		"synpred33_Hello", "synpred45_Hello", "synpred17_Hello", "returnstat", 
		"forstat", "paramlistcall", "synpred18_Hello", "ifstat", "synpred35_Hello", 
		"funclist_linha", "synpred28_Hello", "statelist", "readstat", "unaryexpr", 
		"factor", "synpred29_Hello", "synpred32_Hello", "synpred11_Hello", "synpred30_Hello", 
		"funccall", "synpred1_Hello", "statement", "lvalue", "synpred12_Hello", 
		"synpred16_Hello", "synpred26_Hello", "synpred22_Hello", "synpred8_Hello", 
		"synpred9_Hello", "synpred3_Hello", "program", "synpred27_Hello", "synpred40_Hello", 
		"synpred15_Hello", "printstat", "synpred5_Hello", "synpred25_Hello", "synpred44_Hello"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    true, true, false, false, true, false, true, false, false, false, 
		    false, false, false, false
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
		this.state.ruleMemo = new HashMap[73+1];


	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return HelloParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g"; }



	// $ANTLR start "program"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:98:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:98:9: ( ( statement | funclist ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:99:2: ( statement | funclist )
			{
			dbg.location(99,2);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:99:2: ( statement | funclist )
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:99:4: statement
					{
					dbg.location(99,4);
					pushFollow(FOLLOW_statement_in_program586);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:99:16: funclist
					{
					dbg.location(99,16);
					pushFollow(FOLLOW_funclist_in_program590);
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
		dbg.location(100, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "funcdef"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:102:1: funcdef : T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE ;
	public final void funcdef() throws RecognitionException {
		int funcdef_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "funcdef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:103:2: ( T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:103:4: T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE
			{
			dbg.location(103,4);
			match(input,T_DEF,FOLLOW_T_DEF_in_funcdef604); if (state.failed) return;dbg.location(103,11);
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funcdef607); if (state.failed) return;dbg.location(103,18);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funcdef609); if (state.failed) return;dbg.location(103,35);
			pushFollow(FOLLOW_paramlist_in_funcdef611);
			paramlist();
			state._fsp--;
			if (state.failed) return;dbg.location(103,45);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funcdef613); if (state.failed) return;dbg.location(104,3);
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funcdef618); if (state.failed) return;dbg.location(105,5);
			pushFollow(FOLLOW_statelist_in_funcdef625);
			statelist();
			state._fsp--;
			if (state.failed) return;dbg.location(106,3);
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funcdef629); if (state.failed) return;
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
		dbg.location(107, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funcdef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funcdef"



	// $ANTLR start "funclist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:1: funclist : funcdef funclist_linha ;
	public final void funclist() throws RecognitionException {
		int funclist_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "funclist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:10: ( funcdef funclist_linha )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:12: funcdef funclist_linha
			{
			dbg.location(109,12);
			pushFollow(FOLLOW_funcdef_in_funclist640);
			funcdef();
			state._fsp--;
			if (state.failed) return;dbg.location(109,20);
			pushFollow(FOLLOW_funclist_linha_in_funclist642);
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
			if ( state.backtracking>0 ) { memoize(input, 3, funclist_StartIndex); }

		}
		dbg.location(110, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funclist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funclist"



	// $ANTLR start "funclist_linha"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:112:1: funclist_linha : ( funclist |);
	public final void funclist_linha() throws RecognitionException {
		int funclist_linha_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "funclist_linha");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:113:2: ( funclist |)
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:113:4: funclist
					{
					dbg.location(113,4);
					pushFollow(FOLLOW_funclist_in_funclist_linha653);
					funclist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:115:2: 
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
			if ( state.backtracking>0 ) { memoize(input, 4, funclist_linha_StartIndex); }

		}
		dbg.location(115, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funclist_linha");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funclist_linha"



	// $ANTLR start "paramlist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:117:1: paramlist : ( TIPOS ID paramlist_linha )? ;
	public final void paramlist() throws RecognitionException {
		int paramlist_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "paramlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:118:2: ( ( TIPOS ID paramlist_linha )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:118:4: ( TIPOS ID paramlist_linha )?
			{
			dbg.location(118,4);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:118:4: ( TIPOS ID paramlist_linha )?
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:118:6: TIPOS ID paramlist_linha
					{
					dbg.location(118,6);
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist673); if (state.failed) return;dbg.location(118,13);
					match(input,ID,FOLLOW_ID_in_paramlist676); if (state.failed) return;dbg.location(118,16);
					pushFollow(FOLLOW_paramlist_linha_in_paramlist678);
					paramlist_linha();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 5, paramlist_StartIndex); }

		}
		dbg.location(119, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramlist"



	// $ANTLR start "paramlist_linha"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:121:1: paramlist_linha : ( T_VIRGULA paramlist |);
	public final void paramlist_linha() throws RecognitionException {
		int paramlist_linha_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "paramlist_linha");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:2: ( T_VIRGULA paramlist |)
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:122:4: T_VIRGULA paramlist
					{
					dbg.location(122,4);
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlist_linha692); if (state.failed) return;dbg.location(122,14);
					pushFollow(FOLLOW_paramlist_in_paramlist_linha694);
					paramlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:124:2: 
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
			if ( state.backtracking>0 ) { memoize(input, 6, paramlist_linha_StartIndex); }

		}
		dbg.location(124, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramlist_linha");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramlist_linha"



	// $ANTLR start "statelist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:126:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		int statelist_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statelist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:126:11: ( statement ( statelist )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:126:13: statement ( statelist )?
			{
			dbg.location(126,13);
			pushFollow(FOLLOW_statement_in_statelist711);
			statement();
			state._fsp--;
			if (state.failed) return;dbg.location(126,23);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:126:23: ( statelist )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==EOL||LA5_0==ID||(LA5_0 >= TIPOS && LA5_0 <= T_ABRECHAVE)||LA5_0==T_BREAK||(LA5_0 >= T_FOR && LA5_0 <= T_IF)||(LA5_0 >= T_READ && LA5_0 <= T_RETURN)||LA5_0==T_WRITE) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:126:24: statelist
					{
					dbg.location(126,24);
					pushFollow(FOLLOW_statelist_in_statelist714);
					statelist();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 7, statelist_StartIndex); }

		}
		dbg.location(127, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statelist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statelist"



	// $ANTLR start "statement"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:129:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:129:10: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:130:2: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			dbg.location(130,2);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:130:2: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:131:3: vardecl EOL
					{
					dbg.location(131,3);
					pushFollow(FOLLOW_vardecl_in_statement730);
					vardecl();
					state._fsp--;
					if (state.failed) return;dbg.location(131,11);
					match(input,EOL,FOLLOW_EOL_in_statement732); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:132:3: atribstat EOL
					{
					dbg.location(132,3);
					pushFollow(FOLLOW_atribstat_in_statement738);
					atribstat();
					state._fsp--;
					if (state.failed) return;dbg.location(132,13);
					match(input,EOL,FOLLOW_EOL_in_statement740); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:133:3: printstat EOL
					{
					dbg.location(133,3);
					pushFollow(FOLLOW_printstat_in_statement746);
					printstat();
					state._fsp--;
					if (state.failed) return;dbg.location(133,13);
					match(input,EOL,FOLLOW_EOL_in_statement748); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:134:3: readstat EOL
					{
					dbg.location(134,3);
					pushFollow(FOLLOW_readstat_in_statement755);
					readstat();
					state._fsp--;
					if (state.failed) return;dbg.location(134,12);
					match(input,EOL,FOLLOW_EOL_in_statement757); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:135:3: returnstat EOL
					{
					dbg.location(135,3);
					pushFollow(FOLLOW_returnstat_in_statement762);
					returnstat();
					state._fsp--;
					if (state.failed) return;dbg.location(135,14);
					match(input,EOL,FOLLOW_EOL_in_statement764); if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:136:3: ifstat
					{
					dbg.location(136,3);
					pushFollow(FOLLOW_ifstat_in_statement770);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:137:3: forstat
					{
					dbg.location(137,3);
					pushFollow(FOLLOW_forstat_in_statement776);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:138:3: T_ABRECHAVE statelist T_FECHACHAVE
					{
					dbg.location(138,3);
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement782); if (state.failed) return;dbg.location(138,15);
					pushFollow(FOLLOW_statelist_in_statement784);
					statelist();
					state._fsp--;
					if (state.failed) return;dbg.location(138,25);
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement786); if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:139:3: T_BREAK EOL
					{
					dbg.location(139,3);
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement792); if (state.failed) return;dbg.location(139,11);
					match(input,EOL,FOLLOW_EOL_in_statement794); if (state.failed) return;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:140:3: EOL
					{
					dbg.location(140,3);
					match(input,EOL,FOLLOW_EOL_in_statement800); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 8, statement_StartIndex); }

		}
		dbg.location(142, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:144:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		int vardecl_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "vardecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(144, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:145:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:146:4: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			dbg.location(146,4);
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl819); if (state.failed) return;dbg.location(147,4);
			match(input,ID,FOLLOW_ID_in_vardecl825); if (state.failed) return;dbg.location(147,7);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:147:7: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:147:8: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					dbg.location(147,8);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl828); if (state.failed) return;dbg.location(147,23);
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
					}dbg.location(147,40);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl841); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 9, vardecl_StartIndex); }

		}
		dbg.location(148, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vardecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "vardecl"



	// $ANTLR start "lvalue"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:150:1: lvalue : ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* ;
	public final void lvalue() throws RecognitionException {
		int lvalue_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "lvalue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(150, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:151:2: ( ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:151:5: ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			{
			dbg.location(151,5);
			match(input,ID,FOLLOW_ID_in_lvalue855); if (state.failed) return;dbg.location(152,3);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:152:3: ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:152:5: T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE
					{
					dbg.location(152,5);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_lvalue861); if (state.failed) return;dbg.location(152,20);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:152:20: ( numexpression )
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:152:22: numexpression
					{
					dbg.location(152,22);
					pushFollow(FOLLOW_numexpression_in_lvalue865);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}
					dbg.location(152,38);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_lvalue869); if (state.failed) return;
					}
					break;

				default :
					break loop8;
				}
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
			if ( state.backtracking>0 ) { memoize(input, 10, lvalue_StartIndex); }

		}
		dbg.location(153, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lvalue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lvalue"



	// $ANTLR start "atribstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:155:1: atribstat : lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		int atribstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "atribstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(155, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:156:2: ( lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:157:2: lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO )
			{
			dbg.location(157,2);
			pushFollow(FOLLOW_lvalue_in_atribstat884);
			lvalue();
			state._fsp--;
			if (state.failed) return;dbg.location(158,2);
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat888); if (state.failed) return;dbg.location(159,2);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:2: ( expression | allocexpression | funccall | TEXTO )
			int alt9=4;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt9=1;
				}
				break;
			case T_NEW:
				{
				alt9=2;
				}
				break;
			case FUNCAO:
				{
				alt9=3;
				}
				break;
			case TEXTO:
				{
				alt9=4;
				}
				break;
			default:
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:4: expression
					{
					dbg.location(159,4);
					pushFollow(FOLLOW_expression_in_atribstat894);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:17: allocexpression
					{
					dbg.location(159,17);
					pushFollow(FOLLOW_allocexpression_in_atribstat898);
					allocexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:35: funccall
					{
					dbg.location(159,35);
					pushFollow(FOLLOW_funccall_in_atribstat902);
					funccall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:159:46: TEXTO
					{
					dbg.location(159,46);
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat906); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 11, atribstat_StartIndex); }

		}
		dbg.location(160, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribstat"



	// $ANTLR start "allocexpression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:162:1: allocexpression : T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ ;
	public final void allocexpression() throws RecognitionException {
		int allocexpression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "allocexpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(162, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:162:17: ( T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:162:19: T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			{
			dbg.location(162,19);
			match(input,T_NEW,FOLLOW_T_NEW_in_allocexpression918); if (state.failed) return;dbg.location(162,25);
			match(input,TIPOS,FOLLOW_TIPOS_in_allocexpression920); if (state.failed) return;dbg.location(162,31);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:162:31: ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			int cnt10=0;
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==T_ABRECOLCHETE) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:162:32: T_ABRECOLCHETE numexpression T_FECHACOLCHETE
					{
					dbg.location(162,32);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_allocexpression923); if (state.failed) return;dbg.location(162,47);
					pushFollow(FOLLOW_numexpression_in_allocexpression925);
					numexpression();
					state._fsp--;
					if (state.failed) return;dbg.location(162,61);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_allocexpression927); if (state.failed) return;
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(10, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt10++;
			}
			} finally {dbg.exitSubRule(10);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, allocexpression_StartIndex); }

		}
		dbg.location(163, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "allocexpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "allocexpression"



	// $ANTLR start "funccall"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:165:1: funccall : FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		int funccall_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "funccall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(165, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:166:2: ( FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:166:4: FUNCAO T_ABREPARENTESES ( paramlistcall )? T_FECHAPARENTESES
			{
			dbg.location(166,4);
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall940); if (state.failed) return;dbg.location(167,9);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall951); if (state.failed) return;dbg.location(168,17);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:168:17: ( paramlistcall )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==T_FECHAPARENTESES) ) {
				int LA11_1 = input.LA(2);
				if ( (synpred22_Hello()) ) {
					alt11=1;
				}
			}
			else if ( ((LA11_0 >= ID && LA11_0 <= TEXTO)||LA11_0==T_ABREPARENTESES||LA11_0==T_NULL||(LA11_0 >= T_SOMA && LA11_0 <= T_SUBTRACAO)) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:168:19: paramlistcall
					{
					dbg.location(168,19);
					pushFollow(FOLLOW_paramlistcall_in_funccall972);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(169,9);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall985); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, funccall_StartIndex); }

		}
		dbg.location(170, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funccall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funccall"



	// $ANTLR start "paramlistcall"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:1: paramlistcall : ( ( ID | TEXTO | expression ) paramlistcall_linha )? ;
	public final void paramlistcall() throws RecognitionException {
		int paramlistcall_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "paramlistcall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(172, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:2: ( ( ( ID | TEXTO | expression ) paramlistcall_linha )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:6: ( ( ID | TEXTO | expression ) paramlistcall_linha )?
			{
			dbg.location(173,6);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:6: ( ( ID | TEXTO | expression ) paramlistcall_linha )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= ID && LA13_0 <= TEXTO)||LA13_0==T_ABREPARENTESES||LA13_0==T_NULL||(LA13_0 >= T_SOMA && LA13_0 <= T_SUBTRACAO)) ) {
				alt13=1;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:174:5: ( ID | TEXTO | expression ) paramlistcall_linha
					{
					dbg.location(174,5);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:174:5: ( ID | TEXTO | expression )
					int alt12=3;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					switch ( input.LA(1) ) {
					case ID:
						{
						int LA12_1 = input.LA(2);
						if ( (synpred23_Hello()) ) {
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

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:174:7: ID
							{
							dbg.location(174,7);
							match(input,ID,FOLLOW_ID_in_paramlistcall1006); if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:174:12: TEXTO
							{
							dbg.location(174,12);
							match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall1010); if (state.failed) return;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:174:20: expression
							{
							dbg.location(174,20);
							pushFollow(FOLLOW_expression_in_paramlistcall1014);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(174,32);
					pushFollow(FOLLOW_paramlistcall_linha_in_paramlistcall1017);
					paramlistcall_linha();
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
			if ( state.backtracking>0 ) { memoize(input, 14, paramlistcall_StartIndex); }

		}
		dbg.location(176, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramlistcall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramlistcall"



	// $ANTLR start "paramlistcall_linha"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:178:1: paramlistcall_linha : ( T_VIRGULA paramlistcall |);
	public final void paramlistcall_linha() throws RecognitionException {
		int paramlistcall_linha_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "paramlistcall_linha");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(178, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:179:2: ( T_VIRGULA paramlistcall |)
			int alt14=2;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==T_VIRGULA) ) {
				alt14=1;
			}
			else if ( (LA14_0==EOF||LA14_0==T_FECHAPARENTESES) ) {
				alt14=2;
			}

			else {
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:180:2: T_VIRGULA paramlistcall
					{
					dbg.location(180,2);
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlistcall_linha1034); if (state.failed) return;dbg.location(180,12);
					pushFollow(FOLLOW_paramlistcall_in_paramlistcall_linha1036);
					paramlistcall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:182:2: 
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
			if ( state.backtracking>0 ) { memoize(input, 15, paramlistcall_linha_StartIndex); }

		}
		dbg.location(182, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramlistcall_linha");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramlistcall_linha"



	// $ANTLR start "printstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:1: printstat : T_WRITE ( lvalue | TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		int printstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "printstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(184, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:185:2: ( T_WRITE ( lvalue | TEXTO | expression ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:185:4: T_WRITE ( lvalue | TEXTO | expression )
			{
			dbg.location(185,4);
			match(input,T_WRITE,FOLLOW_T_WRITE_in_printstat1052); if (state.failed) return;dbg.location(185,12);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:185:12: ( lvalue | TEXTO | expression )
			int alt15=3;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA15_1 = input.LA(2);
				if ( (synpred27_Hello()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=3;
				}

				}
				break;
			case TEXTO:
				{
				alt15=2;
				}
				break;
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt15=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:185:14: lvalue
					{
					dbg.location(185,14);
					pushFollow(FOLLOW_lvalue_in_printstat1056);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:185:23: TEXTO
					{
					dbg.location(185,23);
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1060); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:185:31: expression
					{
					dbg.location(185,31);
					pushFollow(FOLLOW_expression_in_printstat1064);
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
			if ( state.backtracking>0 ) { memoize(input, 16, printstat_StartIndex); }

		}
		dbg.location(186, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:188:1: readstat : T_READ lvalue ;
	public final void readstat() throws RecognitionException {
		int readstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "readstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(188, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:189:2: ( T_READ lvalue )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:189:4: T_READ lvalue
			{
			dbg.location(189,4);
			match(input,T_READ,FOLLOW_T_READ_in_readstat1078); if (state.failed) return;dbg.location(189,11);
			pushFollow(FOLLOW_lvalue_in_readstat1080);
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
			if ( state.backtracking>0 ) { memoize(input, 17, readstat_StartIndex); }

		}
		dbg.location(190, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "readstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "returnstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(192, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:193:2: ( T_RETURN ( TEXTO | expression )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:193:4: T_RETURN ( TEXTO | expression )?
			{
			dbg.location(193,4);
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1092); if (state.failed) return;dbg.location(193,13);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:193:13: ( TEXTO | expression )?
			int alt16=3;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==TEXTO) ) {
				alt16=1;
			}
			else if ( ((LA16_0 >= ID && LA16_0 <= NUMERO)||LA16_0==T_ABREPARENTESES||LA16_0==T_NULL||(LA16_0 >= T_SOMA && LA16_0 <= T_SUBTRACAO)) ) {
				alt16=2;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:193:15: TEXTO
					{
					dbg.location(193,15);
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1096); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:193:23: expression
					{
					dbg.location(193,23);
					pushFollow(FOLLOW_expression_in_returnstat1100);
					expression();
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
			if ( state.backtracking>0 ) { memoize(input, 18, returnstat_StartIndex); }

		}
		dbg.location(194, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returnstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:196:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "ifstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(196, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:197:2: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:197:4: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha
			{
			dbg.location(197,4);
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1116); if (state.failed) return;dbg.location(197,9);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1118); if (state.failed) return;dbg.location(197,26);
			pushFollow(FOLLOW_expression_in_ifstat1120);
			expression();
			state._fsp--;
			if (state.failed) return;dbg.location(197,37);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1122); if (state.failed) return;dbg.location(197,55);
			pushFollow(FOLLOW_statement_in_ifstat1124);
			statement();
			state._fsp--;
			if (state.failed) return;dbg.location(197,65);
			pushFollow(FOLLOW_ifstat_linha_in_ifstat1126);
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
			if ( state.backtracking>0 ) { memoize(input, 19, ifstat_StartIndex); }

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



	// $ANTLR start "ifstat_linha"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:200:1: ifstat_linha : ( T_ELSE statement |);
	public final void ifstat_linha() throws RecognitionException {
		int ifstat_linha_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "ifstat_linha");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(200, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:2: ( T_ELSE statement |)
			int alt17=2;
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==T_ELSE) ) {
				int LA17_1 = input.LA(2);
				if ( (synpred31_Hello()) ) {
					alt17=1;
				}
				else if ( (true) ) {
					alt17=2;
				}

			}
			else if ( (LA17_0==EOL||LA17_0==ID||(LA17_0 >= TIPOS && LA17_0 <= T_ABRECHAVE)||LA17_0==T_BREAK||LA17_0==T_FECHACHAVE||(LA17_0 >= T_FOR && LA17_0 <= T_IF)||(LA17_0 >= T_READ && LA17_0 <= T_RETURN)||LA17_0==T_WRITE) ) {
				alt17=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:4: T_ELSE statement
					{
					dbg.location(201,4);
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat_linha1137); if (state.failed) return;dbg.location(201,12);
					pushFollow(FOLLOW_statement_in_ifstat_linha1140);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:203:2: 
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
			if ( state.backtracking>0 ) { memoize(input, 20, ifstat_linha_StartIndex); }

		}
		dbg.location(203, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat_linha");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifstat_linha"



	// $ANTLR start "forstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:205:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE ;
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "forstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(205, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:205:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:205:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES T_ABRECHAVE ( statement )* T_FECHACHAVE
			{
			dbg.location(205,11);
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1156); if (state.failed) return;dbg.location(205,17);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1158); if (state.failed) return;dbg.location(205,34);
			pushFollow(FOLLOW_atribstat_in_forstat1160);
			atribstat();
			state._fsp--;
			if (state.failed) return;dbg.location(205,44);
			match(input,EOL,FOLLOW_EOL_in_forstat1162); if (state.failed) return;dbg.location(205,48);
			pushFollow(FOLLOW_expression_in_forstat1164);
			expression();
			state._fsp--;
			if (state.failed) return;dbg.location(205,59);
			match(input,EOL,FOLLOW_EOL_in_forstat1166); if (state.failed) return;dbg.location(205,63);
			pushFollow(FOLLOW_atribstat_in_forstat1168);
			atribstat();
			state._fsp--;
			if (state.failed) return;dbg.location(205,73);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1170); if (state.failed) return;dbg.location(206,10);
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_forstat1182); if (state.failed) return;dbg.location(206,22);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:206:22: ( statement )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==EOL||LA18_0==ID||(LA18_0 >= TIPOS && LA18_0 <= T_ABRECHAVE)||LA18_0==T_BREAK||(LA18_0 >= T_FOR && LA18_0 <= T_IF)||(LA18_0 >= T_READ && LA18_0 <= T_RETURN)||LA18_0==T_WRITE) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:206:23: statement
					{
					dbg.location(206,23);
					pushFollow(FOLLOW_statement_in_forstat1185);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(206,35);
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_forstat1189); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, forstat_StartIndex); }

		}
		dbg.location(207, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "forstat"



	// $ANTLR start "expression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:209:1: expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(209, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:209:12: ( numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:209:14: numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			{
			dbg.location(209,14);
			pushFollow(FOLLOW_numexpression_in_expression1201);
			numexpression();
			state._fsp--;
			if (state.failed) return;dbg.location(209,28);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:209:28: ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==T_DIFERENTE||(LA19_0 >= T_IGUAL && LA19_0 <= T_MENOROUIGUAL)) ) {
				alt19=1;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:209:30: ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression
					{
					dbg.location(209,30);
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
					}dbg.location(209,110);
					pushFollow(FOLLOW_numexpression_in_expression1231);
					numexpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

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
			if ( state.backtracking>0 ) { memoize(input, 22, expression_StartIndex); }

		}
		dbg.location(210, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression"



	// $ANTLR start "numexpression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:1: numexpression : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void numexpression() throws RecognitionException {
		int numexpression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "numexpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(212, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:15: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:17: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			dbg.location(212,17);
			pushFollow(FOLLOW_term_in_numexpression1243);
			term();
			state._fsp--;
			if (state.failed) return;dbg.location(212,22);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:22: ( ( T_SOMA | T_SUBTRACAO ) term )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= T_SOMA && LA20_0 <= T_SUBTRACAO)) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:23: ( T_SOMA | T_SUBTRACAO ) term
					{
					dbg.location(212,23);
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
					}dbg.location(212,48);
					pushFollow(FOLLOW_term_in_numexpression1256);
					term();
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
			if ( state.backtracking>0 ) { memoize(input, 23, numexpression_StartIndex); }

		}
		dbg.location(213, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "numexpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "numexpression"



	// $ANTLR start "term"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:215:1: term : unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* ;
	public final void term() throws RecognitionException {
		int term_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(215, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:215:6: ( unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:216:2: unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			{
			dbg.location(216,2);
			pushFollow(FOLLOW_unaryexpr_in_term1269);
			unaryexpr();
			state._fsp--;
			if (state.failed) return;dbg.location(216,12);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:216:12: ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==T_DIVISAO||LA21_0==T_MULTIPLICACAO) ) {
					alt21=1;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:216:14: ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr
					{
					dbg.location(216,14);
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
					}dbg.location(216,45);
					pushFollow(FOLLOW_unaryexpr_in_term1282);
					unaryexpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, term_StartIndex); }

		}
		dbg.location(217, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "term"



	// $ANTLR start "unaryexpr"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:219:1: unaryexpr : ( T_SOMA | T_SUBTRACAO )? factor ;
	public final void unaryexpr() throws RecognitionException {
		int unaryexpr_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "unaryexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(219, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:219:11: ( ( T_SOMA | T_SUBTRACAO )? factor )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:219:14: ( T_SOMA | T_SUBTRACAO )? factor
			{
			dbg.location(219,14);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:219:14: ( T_SOMA | T_SUBTRACAO )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= T_SOMA && LA22_0 <= T_SUBTRACAO)) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:
					{
					dbg.location(219,14);
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
			} finally {dbg.exitSubRule(22);}
			dbg.location(219,40);
			pushFollow(FOLLOW_factor_in_unaryexpr1306);
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
			if ( state.backtracking>0 ) { memoize(input, 25, unaryexpr_StartIndex); }

		}
		dbg.location(220, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unaryexpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "factor"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:1: factor : ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		int factor_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "factor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(222, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:8: ( ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			{
			dbg.location(222,10);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			int alt23=4;
			try { dbg.enterSubRule(23);
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			switch ( input.LA(1) ) {
			case NUMERO:
				{
				alt23=1;
				}
				break;
			case ID:
				{
				alt23=2;
				}
				break;
			case T_NULL:
				{
				alt23=3;
				}
				break;
			case T_ABREPARENTESES:
				{
				alt23=4;
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:12: NUMERO
					{
					dbg.location(222,12);
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1318); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:21: lvalue
					{
					dbg.location(222,21);
					pushFollow(FOLLOW_lvalue_in_factor1322);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:30: T_NULL
					{
					dbg.location(222,30);
					match(input,T_NULL,FOLLOW_T_NULL_in_factor1326); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:39: T_ABREPARENTESES numexpression T_FECHAPARENTESES
					{
					dbg.location(222,39);
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1330); if (state.failed) return;dbg.location(222,56);
					pushFollow(FOLLOW_numexpression_in_factor1332);
					numexpression();
					state._fsp--;
					if (state.failed) return;dbg.location(222,70);
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1334); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(23);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, factor_StartIndex); }

		}
		dbg.location(223, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "factor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "factor"

	// $ANTLR start synpred22_Hello
	public final void synpred22_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:168:19: ( paramlistcall )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:168:19: paramlistcall
		{
		dbg.location(168,19);
		pushFollow(FOLLOW_paramlistcall_in_synpred22_Hello972);
		paramlistcall();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred22_Hello

	// $ANTLR start synpred23_Hello
	public final void synpred23_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:174:7: ( ID )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:174:7: ID
		{
		dbg.location(174,7);
		match(input,ID,FOLLOW_ID_in_synpred23_Hello1006); if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_Hello

	// $ANTLR start synpred27_Hello
	public final void synpred27_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:185:14: ( lvalue )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:185:14: lvalue
		{
		dbg.location(185,14);
		pushFollow(FOLLOW_lvalue_in_synpred27_Hello1056);
		lvalue();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_Hello

	// $ANTLR start synpred31_Hello
	public final void synpred31_Hello_fragment() throws RecognitionException {
		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:4: ( T_ELSE statement )
		dbg.enterAlt(1);

		// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:201:4: T_ELSE statement
		{
		dbg.location(201,4);
		match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred31_Hello1137); if (state.failed) return;dbg.location(201,12);
		pushFollow(FOLLOW_statement_in_synpred31_Hello1140);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred31_Hello

	// Delegated rules

	public final boolean synpred22_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred22_Hello_fragment(); // can never throw exception
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
	public final boolean synpred31_Hello() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred31_Hello_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_statement_in_program586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funcdef604 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funcdef607 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funcdef609 = new BitSet(new long[]{0x0000000000800800L});
	public static final BitSet FOLLOW_paramlist_in_funcdef611 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funcdef613 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funcdef618 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statelist_in_funcdef625 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funcdef629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist640 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_linha_in_funclist642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_funclist_linha653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist673 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist676 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlist_linha_in_paramlist678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlist_linha692 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_paramlist_linha694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist711 = new BitSet(new long[]{0x0000008C03011922L});
	public static final BitSet FOLLOW_statelist_in_statelist714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_statement730 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement738 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement746 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement755 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement762 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement782 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statelist_in_statement784 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement792 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl819 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl825 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl828 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_set_in_vardecl830 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl841 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_lvalue855 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_lvalue861 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_lvalue865 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_lvalue869 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_lvalue_in_atribstat884 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat888 = new BitSet(new long[]{0x0000003300004780L});
	public static final BitSet FOLLOW_expression_in_atribstat894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocexpression_in_atribstat898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NEW_in_allocexpression918 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_allocexpression920 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_allocexpression923 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_allocexpression925 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_allocexpression927 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall940 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall951 = new BitSet(new long[]{0x0000003200804700L});
	public static final BitSet FOLLOW_paramlistcall_in_funccall972 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramlistcall1006 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall1010 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_expression_in_paramlistcall1014 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlistcall_linha_in_paramlistcall1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlistcall_linha1034 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_paramlistcall_in_paramlistcall_linha1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WRITE_in_printstat1052 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_lvalue_in_printstat1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1078 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_lvalue_in_readstat1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1092 = new BitSet(new long[]{0x0000003200004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1116 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1118 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1120 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1122 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1124 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ifstat_linha_in_ifstat1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat_linha1137 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_ifstat_linha1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1156 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1158 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1160 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1162 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_expression_in_forstat1164 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1166 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1168 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1170 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_forstat1182 = new BitSet(new long[]{0x0000008C03211920L});
	public static final BitSet FOLLOW_statement_in_forstat1185 = new BitSet(new long[]{0x0000008C03211920L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_forstat1189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numexpression_in_expression1201 = new BitSet(new long[]{0x000000007C040002L});
	public static final BitSet FOLLOW_set_in_expression1205 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_expression1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numexpression1243 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_set_in_numexpression1246 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_term_in_numexpression1256 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_term1269 = new BitSet(new long[]{0x0000000080080002L});
	public static final BitSet FOLLOW_set_in_term1273 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_unaryexpr_in_term1282 = new BitSet(new long[]{0x0000000080080002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_factor1322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NULL_in_factor1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1330 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_factor1332 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramlistcall_in_synpred22_Hello972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred23_Hello1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred27_Hello1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_synpred31_Hello1137 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_synpred31_Hello1140 = new BitSet(new long[]{0x0000000000000002L});
}
