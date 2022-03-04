// $ANTLR 3.5.1 C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g 2022-03-03 21:51:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
		"invalidRule", "unaryexpr", "paramlistcall_linha", "factor", "vardecl", 
		"paramlist", "lvalue", "numexpression", "atribstat", "term", "allocexpression", 
		"funclist", "printstat", "ifstat_linha2", "funcdef", "readstat", "forstat", 
		"statelist", "returnstat", "program", "funclist_linha", "funccall", "ifstat", 
		"statement", "paramlistcall", "ifstat_linha", "paramlist_linha", "expression"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false
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
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return HelloParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g"; }



	// $ANTLR start "program"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:96:1: program : ( statement | funclist ) ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:96:9: ( ( statement | funclist ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:97:2: ( statement | funclist )
			{
			dbg.location(97,2);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:97:2: ( statement | funclist )
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
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:97:4: statement
					{
					dbg.location(97,4);
					pushFollow(FOLLOW_statement_in_program568);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:97:16: funclist
					{
					dbg.location(97,16);
					pushFollow(FOLLOW_funclist_in_program572);
					funclist();
					state._fsp--;

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
		}
		dbg.location(98, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "funclist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:100:1: funclist : funcdef funclist_linha ;
	public final void funclist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "funclist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:100:10: ( funcdef funclist_linha )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:100:12: funcdef funclist_linha
			{
			dbg.location(100,12);
			pushFollow(FOLLOW_funcdef_in_funclist584);
			funcdef();
			state._fsp--;
			dbg.location(100,20);
			pushFollow(FOLLOW_funclist_linha_in_funclist586);
			funclist_linha();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(101, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funclist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funclist"



	// $ANTLR start "funclist_linha"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:103:1: funclist_linha : ( funclist |);
	public final void funclist_linha() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "funclist_linha");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:104:2: ( funclist |)
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
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:104:4: funclist
					{
					dbg.location(104,4);
					pushFollow(FOLLOW_funclist_in_funclist_linha597);
					funclist();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:106:2: 
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
		dbg.location(106, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funclist_linha");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funclist_linha"



	// $ANTLR start "funcdef"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:108:1: funcdef : T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE ;
	public final void funcdef() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "funcdef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:2: ( T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:109:4: T_DEF FUNCAO T_ABREPARENTESES paramlist T_FECHAPARENTESES T_ABRECHAVE statelist T_FECHACHAVE
			{
			dbg.location(109,4);
			match(input,T_DEF,FOLLOW_T_DEF_in_funcdef614); dbg.location(109,10);
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funcdef616); dbg.location(109,17);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funcdef618); dbg.location(109,34);
			pushFollow(FOLLOW_paramlist_in_funcdef620);
			paramlist();
			state._fsp--;
			dbg.location(109,44);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funcdef622); dbg.location(110,3);
			match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_funcdef627); dbg.location(111,5);
			pushFollow(FOLLOW_statelist_in_funcdef634);
			statelist();
			state._fsp--;
			dbg.location(112,3);
			match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_funcdef638); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(113, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funcdef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funcdef"



	// $ANTLR start "paramlist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:116:1: paramlist : ( TIPOS ID paramlist_linha )? ;
	public final void paramlist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "paramlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(116, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:117:2: ( ( TIPOS ID paramlist_linha )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:117:4: ( TIPOS ID paramlist_linha )?
			{
			dbg.location(117,4);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:117:4: ( TIPOS ID paramlist_linha )?
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:117:6: TIPOS ID paramlist_linha
					{
					dbg.location(117,6);
					match(input,TIPOS,FOLLOW_TIPOS_in_paramlist654); dbg.location(117,13);
					match(input,ID,FOLLOW_ID_in_paramlist657); dbg.location(117,16);
					pushFollow(FOLLOW_paramlist_linha_in_paramlist659);
					paramlist_linha();
					state._fsp--;

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
		}
		dbg.location(118, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramlist"



	// $ANTLR start "paramlist_linha"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:120:1: paramlist_linha : ( T_VIRGULA paramlist |);
	public final void paramlist_linha() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "paramlist_linha");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(120, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:121:2: ( T_VIRGULA paramlist |)
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==T_VIRGULA) ) {
				alt4=1;
			}
			else if ( (LA4_0==T_FECHAPARENTESES) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:121:4: T_VIRGULA paramlist
					{
					dbg.location(121,4);
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlist_linha673); dbg.location(121,14);
					pushFollow(FOLLOW_paramlist_in_paramlist_linha675);
					paramlist();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:123:2: 
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
		dbg.location(123, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramlist_linha");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramlist_linha"



	// $ANTLR start "statelist"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:1: statelist : statement ( statelist )? ;
	public final void statelist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statelist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:11: ( statement ( statelist )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:13: statement ( statelist )?
			{
			dbg.location(125,13);
			pushFollow(FOLLOW_statement_in_statelist692);
			statement();
			state._fsp--;
			dbg.location(125,23);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:23: ( statelist )?
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:125:24: statelist
					{
					dbg.location(125,24);
					pushFollow(FOLLOW_statelist_in_statelist695);
					statelist();
					state._fsp--;

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
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:128:1: statement : ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) ;
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(128, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:128:10: ( ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:129:2: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
			{
			dbg.location(129,2);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:129:2: ( vardecl EOL | atribstat EOL | printstat EOL | readstat EOL | returnstat EOL | ifstat | forstat | T_ABRECHAVE statelist T_FECHACHAVE | T_BREAK EOL | EOL )
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
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:130:3: vardecl EOL
					{
					dbg.location(130,3);
					pushFollow(FOLLOW_vardecl_in_statement711);
					vardecl();
					state._fsp--;
					dbg.location(130,11);
					match(input,EOL,FOLLOW_EOL_in_statement713); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:131:3: atribstat EOL
					{
					dbg.location(131,3);
					pushFollow(FOLLOW_atribstat_in_statement719);
					atribstat();
					state._fsp--;
					dbg.location(131,13);
					match(input,EOL,FOLLOW_EOL_in_statement721); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:132:3: printstat EOL
					{
					dbg.location(132,3);
					pushFollow(FOLLOW_printstat_in_statement727);
					printstat();
					state._fsp--;
					dbg.location(132,13);
					match(input,EOL,FOLLOW_EOL_in_statement729); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:133:3: readstat EOL
					{
					dbg.location(133,3);
					pushFollow(FOLLOW_readstat_in_statement736);
					readstat();
					state._fsp--;
					dbg.location(133,12);
					match(input,EOL,FOLLOW_EOL_in_statement738); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:134:3: returnstat EOL
					{
					dbg.location(134,3);
					pushFollow(FOLLOW_returnstat_in_statement743);
					returnstat();
					state._fsp--;
					dbg.location(134,14);
					match(input,EOL,FOLLOW_EOL_in_statement745); 
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:135:3: ifstat
					{
					dbg.location(135,3);
					pushFollow(FOLLOW_ifstat_in_statement751);
					ifstat();
					state._fsp--;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:136:3: forstat
					{
					dbg.location(136,3);
					pushFollow(FOLLOW_forstat_in_statement757);
					forstat();
					state._fsp--;

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:137:3: T_ABRECHAVE statelist T_FECHACHAVE
					{
					dbg.location(137,3);
					match(input,T_ABRECHAVE,FOLLOW_T_ABRECHAVE_in_statement763); dbg.location(137,15);
					pushFollow(FOLLOW_statelist_in_statement765);
					statelist();
					state._fsp--;
					dbg.location(137,25);
					match(input,T_FECHACHAVE,FOLLOW_T_FECHACHAVE_in_statement767); 
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:138:3: T_BREAK EOL
					{
					dbg.location(138,3);
					match(input,T_BREAK,FOLLOW_T_BREAK_in_statement773); dbg.location(138,11);
					match(input,EOL,FOLLOW_EOL_in_statement775); 
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:139:3: EOL
					{
					dbg.location(139,3);
					match(input,EOL,FOLLOW_EOL_in_statement781); 
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
		}
		dbg.location(141, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "vardecl"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:143:1: vardecl : TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* ;
	public final void vardecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "vardecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(143, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:144:2: ( TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:145:3: TIPOS ID ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
			{
			dbg.location(145,3);
			match(input,TIPOS,FOLLOW_TIPOS_in_vardecl799); dbg.location(146,3);
			match(input,ID,FOLLOW_ID_in_vardecl804); dbg.location(146,6);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:146:6: ( T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE )*
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:146:7: T_ABRECOLCHETE ( ID | NUMERO ) T_FECHACOLCHETE
					{
					dbg.location(146,7);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_vardecl807); dbg.location(146,22);
					if ( (input.LA(1) >= ID && input.LA(1) <= NUMERO) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(146,38);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_vardecl819); 
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
		}
		dbg.location(147, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vardecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "vardecl"



	// $ANTLR start "lvalue"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:149:1: lvalue : ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* ;
	public final void lvalue() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lvalue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(149, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:150:2: ( ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:150:5: ID ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
			{
			dbg.location(150,5);
			match(input,ID,FOLLOW_ID_in_lvalue833); dbg.location(151,3);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:151:3: ( T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE )*
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:151:5: T_ABRECOLCHETE ( numexpression ) T_FECHACOLCHETE
					{
					dbg.location(151,5);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_lvalue839); dbg.location(151,20);
					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:151:20: ( numexpression )
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:151:22: numexpression
					{
					dbg.location(151,22);
					pushFollow(FOLLOW_numexpression_in_lvalue843);
					numexpression();
					state._fsp--;

					}
					dbg.location(151,38);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_lvalue847); 
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
		}
		dbg.location(152, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lvalue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lvalue"



	// $ANTLR start "atribstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:154:1: atribstat : lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) ;
	public final void atribstat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atribstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(154, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:155:2: ( lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:156:2: lvalue T_ATRIBUICAO ( expression | allocexpression | funccall | TEXTO )
			{
			dbg.location(156,2);
			pushFollow(FOLLOW_lvalue_in_atribstat862);
			lvalue();
			state._fsp--;
			dbg.location(157,2);
			match(input,T_ATRIBUICAO,FOLLOW_T_ATRIBUICAO_in_atribstat866); dbg.location(158,2);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:158:2: ( expression | allocexpression | funccall | TEXTO )
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
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:158:4: expression
					{
					dbg.location(158,4);
					pushFollow(FOLLOW_expression_in_atribstat872);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:158:17: allocexpression
					{
					dbg.location(158,17);
					pushFollow(FOLLOW_allocexpression_in_atribstat876);
					allocexpression();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:158:35: funccall
					{
					dbg.location(158,35);
					pushFollow(FOLLOW_funccall_in_atribstat880);
					funccall();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:158:46: TEXTO
					{
					dbg.location(158,46);
					match(input,TEXTO,FOLLOW_TEXTO_in_atribstat884); 
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
		}
		dbg.location(159, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribstat"



	// $ANTLR start "allocexpression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:161:1: allocexpression : T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ ;
	public final void allocexpression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "allocexpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(161, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:161:17: ( T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:161:19: T_NEW TIPOS ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
			{
			dbg.location(161,19);
			match(input,T_NEW,FOLLOW_T_NEW_in_allocexpression896); dbg.location(161,25);
			match(input,TIPOS,FOLLOW_TIPOS_in_allocexpression898); dbg.location(161,31);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:161:31: ( T_ABRECOLCHETE numexpression T_FECHACOLCHETE )+
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:161:32: T_ABRECOLCHETE numexpression T_FECHACOLCHETE
					{
					dbg.location(161,32);
					match(input,T_ABRECOLCHETE,FOLLOW_T_ABRECOLCHETE_in_allocexpression901); dbg.location(161,47);
					pushFollow(FOLLOW_numexpression_in_allocexpression903);
					numexpression();
					state._fsp--;
					dbg.location(161,61);
					match(input,T_FECHACOLCHETE,FOLLOW_T_FECHACOLCHETE_in_allocexpression905); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
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
		}
		dbg.location(162, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "allocexpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "allocexpression"



	// $ANTLR start "funccall"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:164:1: funccall : FUNCAO T_ABREPARENTESES paramlistcall T_FECHAPARENTESES ;
	public final void funccall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "funccall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(164, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:165:2: ( FUNCAO T_ABREPARENTESES paramlistcall T_FECHAPARENTESES )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:165:4: FUNCAO T_ABREPARENTESES paramlistcall T_FECHAPARENTESES
			{
			dbg.location(165,4);
			match(input,FUNCAO,FOLLOW_FUNCAO_in_funccall918); dbg.location(166,9);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_funccall929); dbg.location(167,17);
			pushFollow(FOLLOW_paramlistcall_in_funccall948);
			paramlistcall();
			state._fsp--;
			dbg.location(168,9);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_funccall958); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(169, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funccall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funccall"



	// $ANTLR start "paramlistcall"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:171:1: paramlistcall : ( TEXTO paramlistcall_linha | expression paramlistcall_linha |);
	public final void paramlistcall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "paramlistcall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(171, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:2: ( TEXTO paramlistcall_linha | expression paramlistcall_linha |)
			int alt11=3;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case TEXTO:
				{
				alt11=1;
				}
				break;
			case ID:
			case NUMERO:
			case T_ABREPARENTESES:
			case T_NULL:
			case T_SOMA:
			case T_SUBTRACAO:
				{
				alt11=2;
				}
				break;
			case T_FECHAPARENTESES:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:172:4: TEXTO paramlistcall_linha
					{
					dbg.location(172,4);
					match(input,TEXTO,FOLLOW_TEXTO_in_paramlistcall969); dbg.location(172,10);
					pushFollow(FOLLOW_paramlistcall_linha_in_paramlistcall971);
					paramlistcall_linha();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:173:4: expression paramlistcall_linha
					{
					dbg.location(173,4);
					pushFollow(FOLLOW_expression_in_paramlistcall977);
					expression();
					state._fsp--;
					dbg.location(173,15);
					pushFollow(FOLLOW_paramlistcall_linha_in_paramlistcall979);
					paramlistcall_linha();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:175:2: 
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
		dbg.location(175, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramlistcall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramlistcall"



	// $ANTLR start "paramlistcall_linha"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:177:1: paramlistcall_linha : ( T_VIRGULA paramlistcall |);
	public final void paramlistcall_linha() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "paramlistcall_linha");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(177, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:178:2: ( T_VIRGULA paramlistcall |)
			int alt12=2;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==T_VIRGULA) ) {
				alt12=1;
			}
			else if ( (LA12_0==T_FECHAPARENTESES) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:179:2: T_VIRGULA paramlistcall
					{
					dbg.location(179,2);
					match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_paramlistcall_linha997); dbg.location(179,12);
					pushFollow(FOLLOW_paramlistcall_in_paramlistcall_linha999);
					paramlistcall();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:181:2: 
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
		dbg.location(181, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramlistcall_linha");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramlistcall_linha"



	// $ANTLR start "printstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:183:1: printstat : T_WRITE ( TEXTO | expression ) ;
	public final void printstat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "printstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(183, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:2: ( T_WRITE ( TEXTO | expression ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:4: T_WRITE ( TEXTO | expression )
			{
			dbg.location(184,4);
			match(input,T_WRITE,FOLLOW_T_WRITE_in_printstat1015); dbg.location(184,12);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:12: ( TEXTO | expression )
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==TEXTO) ) {
				alt13=1;
			}
			else if ( ((LA13_0 >= ID && LA13_0 <= NUMERO)||LA13_0==T_ABREPARENTESES||LA13_0==T_NULL||(LA13_0 >= T_SOMA && LA13_0 <= T_SUBTRACAO)) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:14: TEXTO
					{
					dbg.location(184,14);
					match(input,TEXTO,FOLLOW_TEXTO_in_printstat1019); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:184:22: expression
					{
					dbg.location(184,22);
					pushFollow(FOLLOW_expression_in_printstat1023);
					expression();
					state._fsp--;

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
		}
		dbg.location(185, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printstat"



	// $ANTLR start "readstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:187:1: readstat : T_READ lvalue ;
	public final void readstat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "readstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(187, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:188:2: ( T_READ lvalue )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:188:4: T_READ lvalue
			{
			dbg.location(188,4);
			match(input,T_READ,FOLLOW_T_READ_in_readstat1037); dbg.location(188,11);
			pushFollow(FOLLOW_lvalue_in_readstat1039);
			lvalue();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(189, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "readstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "readstat"



	// $ANTLR start "returnstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:191:1: returnstat : T_RETURN ( TEXTO | expression )? ;
	public final void returnstat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "returnstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(191, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:2: ( T_RETURN ( TEXTO | expression )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:4: T_RETURN ( TEXTO | expression )?
			{
			dbg.location(192,4);
			match(input,T_RETURN,FOLLOW_T_RETURN_in_returnstat1051); dbg.location(192,13);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:13: ( TEXTO | expression )?
			int alt14=3;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==TEXTO) ) {
				alt14=1;
			}
			else if ( ((LA14_0 >= ID && LA14_0 <= NUMERO)||LA14_0==T_ABREPARENTESES||LA14_0==T_NULL||(LA14_0 >= T_SOMA && LA14_0 <= T_SUBTRACAO)) ) {
				alt14=2;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:15: TEXTO
					{
					dbg.location(192,15);
					match(input,TEXTO,FOLLOW_TEXTO_in_returnstat1055); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:192:23: expression
					{
					dbg.location(192,23);
					pushFollow(FOLLOW_expression_in_returnstat1059);
					expression();
					state._fsp--;

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
		}
		dbg.location(193, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returnstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "returnstat"



	// $ANTLR start "ifstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:195:1: ifstat : T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha ;
	public final void ifstat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ifstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(195, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:196:2: ( T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:196:4: T_IF T_ABREPARENTESES expression T_FECHAPARENTESES statement ifstat_linha
			{
			dbg.location(196,4);
			match(input,T_IF,FOLLOW_T_IF_in_ifstat1075); dbg.location(196,9);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_ifstat1077); dbg.location(196,26);
			pushFollow(FOLLOW_expression_in_ifstat1079);
			expression();
			state._fsp--;
			dbg.location(196,37);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_ifstat1081); dbg.location(196,55);
			pushFollow(FOLLOW_statement_in_ifstat1083);
			statement();
			state._fsp--;
			dbg.location(196,65);
			pushFollow(FOLLOW_ifstat_linha_in_ifstat1085);
			ifstat_linha();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(197, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifstat"



	// $ANTLR start "ifstat_linha"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:199:1: ifstat_linha : ( T_ELSE statement |);
	public final void ifstat_linha() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ifstat_linha");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(199, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:200:2: ( T_ELSE statement |)
			int alt15=2;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==T_ELSE) ) {
				alt15=1;
			}
			else if ( (LA15_0==EOF||LA15_0==EOL||LA15_0==ID||(LA15_0 >= TIPOS && LA15_0 <= T_ABRECHAVE)||LA15_0==T_BREAK||LA15_0==T_FECHACHAVE||(LA15_0 >= T_FOR && LA15_0 <= T_IF)||(LA15_0 >= T_READ && LA15_0 <= T_RETURN)||LA15_0==T_WRITE) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:200:4: T_ELSE statement
					{
					dbg.location(200,4);
					match(input,T_ELSE,FOLLOW_T_ELSE_in_ifstat_linha1096); dbg.location(200,11);
					pushFollow(FOLLOW_statement_in_ifstat_linha1098);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:202:2: 
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
		dbg.location(202, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat_linha");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifstat_linha"



	// $ANTLR start "ifstat_linha2"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:204:1: ifstat_linha2 : ( ifstat | statement );
	public final void ifstat_linha2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ifstat_linha2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(204, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:205:2: ( ifstat | statement )
			int alt16=2;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==T_IF) ) {
				alt16=1;
			}
			else if ( (LA16_0==EOL||LA16_0==ID||(LA16_0 >= TIPOS && LA16_0 <= T_ABRECHAVE)||LA16_0==T_BREAK||LA16_0==T_FOR||(LA16_0 >= T_READ && LA16_0 <= T_RETURN)||LA16_0==T_WRITE) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:205:4: ifstat
					{
					dbg.location(205,4);
					pushFollow(FOLLOW_ifstat_in_ifstat_linha21116);
					ifstat();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:205:13: statement
					{
					dbg.location(205,13);
					pushFollow(FOLLOW_statement_in_ifstat_linha21120);
					statement();
					state._fsp--;

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
		dbg.location(206, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat_linha2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifstat_linha2"



	// $ANTLR start "forstat"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:208:1: forstat : T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES statement ;
	public final void forstat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "forstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(208, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:208:9: ( T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES statement )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:208:11: T_FOR T_ABREPARENTESES atribstat EOL expression EOL atribstat T_FECHAPARENTESES statement
			{
			dbg.location(208,11);
			match(input,T_FOR,FOLLOW_T_FOR_in_forstat1131); dbg.location(208,17);
			match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_forstat1133); dbg.location(208,34);
			pushFollow(FOLLOW_atribstat_in_forstat1135);
			atribstat();
			state._fsp--;
			dbg.location(208,44);
			match(input,EOL,FOLLOW_EOL_in_forstat1137); dbg.location(208,48);
			pushFollow(FOLLOW_expression_in_forstat1139);
			expression();
			state._fsp--;
			dbg.location(208,59);
			match(input,EOL,FOLLOW_EOL_in_forstat1141); dbg.location(208,63);
			pushFollow(FOLLOW_atribstat_in_forstat1143);
			atribstat();
			state._fsp--;
			dbg.location(208,73);
			match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_forstat1145); dbg.location(209,7);
			pushFollow(FOLLOW_statement_in_forstat1154);
			statement();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(210, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "forstat"



	// $ANTLR start "expression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:1: expression : numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? ;
	public final void expression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(212, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:12: ( numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )? )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:14: numexpression ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			{
			dbg.location(212,14);
			pushFollow(FOLLOW_numexpression_in_expression1166);
			numexpression();
			state._fsp--;
			dbg.location(212,28);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:28: ( ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==T_DIFERENTE||(LA17_0 >= T_IGUAL && LA17_0 <= T_MENOROUIGUAL)) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:212:30: ( T_MAIOR | T_MENOR | T_MAIOROUIGUAL | T_MENOROUIGUAL | T_IGUAL | T_DIFERENTE ) numexpression
					{
					dbg.location(212,30);
					if ( input.LA(1)==T_DIFERENTE||(input.LA(1) >= T_IGUAL && input.LA(1) <= T_MENOROUIGUAL) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(212,110);
					pushFollow(FOLLOW_numexpression_in_expression1196);
					numexpression();
					state._fsp--;

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
		}
		dbg.location(213, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression"



	// $ANTLR start "numexpression"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:215:1: numexpression : term ( ( T_SOMA | T_SUBTRACAO ) term )* ;
	public final void numexpression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "numexpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(215, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:215:15: ( term ( ( T_SOMA | T_SUBTRACAO ) term )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:215:17: term ( ( T_SOMA | T_SUBTRACAO ) term )*
			{
			dbg.location(215,17);
			pushFollow(FOLLOW_term_in_numexpression1208);
			term();
			state._fsp--;
			dbg.location(215,22);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:215:22: ( ( T_SOMA | T_SUBTRACAO ) term )*
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:215:23: ( T_SOMA | T_SUBTRACAO ) term
					{
					dbg.location(215,23);
					if ( (input.LA(1) >= T_SOMA && input.LA(1) <= T_SUBTRACAO) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(215,48);
					pushFollow(FOLLOW_term_in_numexpression1221);
					term();
					state._fsp--;

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
		}
		dbg.location(216, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "numexpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "numexpression"



	// $ANTLR start "term"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:218:1: term : unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* ;
	public final void term() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(218, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:218:6: ( unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )* )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:219:2: unaryexpr ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
			{
			dbg.location(219,2);
			pushFollow(FOLLOW_unaryexpr_in_term1234);
			unaryexpr();
			state._fsp--;
			dbg.location(219,12);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:219:12: ( ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr )*
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

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:219:14: ( T_MULTIPLICACAO | T_DIVISAO ) unaryexpr
					{
					dbg.location(219,14);
					if ( input.LA(1)==T_DIVISAO||input.LA(1)==T_MULTIPLICACAO ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(219,45);
					pushFollow(FOLLOW_unaryexpr_in_term1247);
					unaryexpr();
					state._fsp--;

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
		}
		dbg.location(220, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "term"



	// $ANTLR start "unaryexpr"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:1: unaryexpr : ( T_SOMA | T_SUBTRACAO )? factor ;
	public final void unaryexpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "unaryexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(222, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:11: ( ( T_SOMA | T_SUBTRACAO )? factor )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:14: ( T_SOMA | T_SUBTRACAO )? factor
			{
			dbg.location(222,14);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:222:14: ( T_SOMA | T_SUBTRACAO )?
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= T_SOMA && LA20_0 <= T_SUBTRACAO)) ) {
				alt20=1;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:
					{
					dbg.location(222,14);
					if ( (input.LA(1) >= T_SOMA && input.LA(1) <= T_SUBTRACAO) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}
					}
					break;

			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(222,40);
			pushFollow(FOLLOW_factor_in_unaryexpr1271);
			factor();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(223, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unaryexpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "unaryexpr"



	// $ANTLR start "factor"
	// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:225:1: factor : ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) ;
	public final void factor() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "factor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(225, 0);

		try {
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:225:8: ( ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES ) )
			dbg.enterAlt(1);

			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:225:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			{
			dbg.location(225,10);
			// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:225:10: ( NUMERO | lvalue | T_NULL | T_ABREPARENTESES numexpression T_FECHAPARENTESES )
			int alt21=4;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

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
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:225:12: NUMERO
					{
					dbg.location(225,12);
					match(input,NUMERO,FOLLOW_NUMERO_in_factor1283); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:225:21: lvalue
					{
					dbg.location(225,21);
					pushFollow(FOLLOW_lvalue_in_factor1287);
					lvalue();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:225:30: T_NULL
					{
					dbg.location(225,30);
					match(input,T_NULL,FOLLOW_T_NULL_in_factor1291); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Elizeu-pc\\Documents\\UFSC\\Compiladores\\ASAL\\asal\\gramatica antlrworks\\Hello.g:225:39: T_ABREPARENTESES numexpression T_FECHAPARENTESES
					{
					dbg.location(225,39);
					match(input,T_ABREPARENTESES,FOLLOW_T_ABREPARENTESES_in_factor1295); dbg.location(225,56);
					pushFollow(FOLLOW_numexpression_in_factor1297);
					numexpression();
					state._fsp--;
					dbg.location(225,70);
					match(input,T_FECHAPARENTESES,FOLLOW_T_FECHAPARENTESES_in_factor1299); 
					}
					break;

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
		}
		dbg.location(226, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "factor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_program572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_funclist584 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_funclist_linha_in_funclist586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funclist_in_funclist_linha597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEF_in_funcdef614 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FUNCAO_in_funcdef616 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funcdef618 = new BitSet(new long[]{0x0000000000800800L});
	public static final BitSet FOLLOW_paramlist_in_funcdef620 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funcdef622 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_funcdef627 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statelist_in_funcdef634 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_funcdef638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_paramlist654 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_paramlist657 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlist_linha_in_paramlist659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlist_linha673 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_paramlist_in_paramlist_linha675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statelist692 = new BitSet(new long[]{0x0000008C03011922L});
	public static final BitSet FOLLOW_statelist_in_statelist695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardecl_in_statement711 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribstat_in_statement719 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement727 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readstat_in_statement736 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_statement743 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_statement757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABRECHAVE_in_statement763 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statelist_in_statement765 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_T_FECHACHAVE_in_statement767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BREAK_in_statement773 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_statement775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_statement781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIPOS_in_vardecl799 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_vardecl804 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_vardecl807 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_set_in_vardecl809 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_vardecl819 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_lvalue833 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_lvalue839 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_lvalue843 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_lvalue847 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_lvalue_in_atribstat862 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_T_ATRIBUICAO_in_atribstat866 = new BitSet(new long[]{0x0000003300004780L});
	public static final BitSet FOLLOW_expression_in_atribstat872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allocexpression_in_atribstat876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funccall_in_atribstat880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_atribstat884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NEW_in_allocexpression896 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TIPOS_in_allocexpression898 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_T_ABRECOLCHETE_in_allocexpression901 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_allocexpression903 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_T_FECHACOLCHETE_in_allocexpression905 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_FUNCAO_in_funccall918 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_funccall929 = new BitSet(new long[]{0x0000003200804700L});
	public static final BitSet FOLLOW_paramlistcall_in_funccall948 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_funccall958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_paramlistcall969 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlistcall_linha_in_paramlistcall971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_paramlistcall977 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paramlistcall_linha_in_paramlistcall979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VIRGULA_in_paramlistcall_linha997 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_paramlistcall_in_paramlistcall_linha999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WRITE_in_printstat1015 = new BitSet(new long[]{0x0000003200004700L});
	public static final BitSet FOLLOW_TEXTO_in_printstat1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_printstat1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_READ_in_readstat1037 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_lvalue_in_readstat1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_RETURN_in_returnstat1051 = new BitSet(new long[]{0x0000003200004702L});
	public static final BitSet FOLLOW_TEXTO_in_returnstat1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_returnstat1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_ifstat1075 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_ifstat1077 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_expression_in_ifstat1079 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_ifstat1081 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_ifstat1083 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ifstat_linha_in_ifstat1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ELSE_in_ifstat_linha1096 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_ifstat_linha1098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_ifstat_linha21116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_ifstat_linha21120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FOR_in_forstat1131 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_forstat1133 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1135 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1137 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_expression_in_forstat1139 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_forstat1141 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_atribstat_in_forstat1143 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_forstat1145 = new BitSet(new long[]{0x0000008C03011920L});
	public static final BitSet FOLLOW_statement_in_forstat1154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numexpression_in_expression1166 = new BitSet(new long[]{0x000000007C040002L});
	public static final BitSet FOLLOW_set_in_expression1170 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_expression1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numexpression1208 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_set_in_numexpression1211 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_term_in_numexpression1221 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_unaryexpr_in_term1234 = new BitSet(new long[]{0x0000000080080002L});
	public static final BitSet FOLLOW_set_in_term1238 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_unaryexpr_in_term1247 = new BitSet(new long[]{0x0000000080080002L});
	public static final BitSet FOLLOW_factor_in_unaryexpr1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_factor1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_factor1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NULL_in_factor1291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ABREPARENTESES_in_factor1295 = new BitSet(new long[]{0x0000003200004300L});
	public static final BitSet FOLLOW_numexpression_in_factor1297 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_T_FECHAPARENTESES_in_factor1299 = new BitSet(new long[]{0x0000000000000002L});
}
