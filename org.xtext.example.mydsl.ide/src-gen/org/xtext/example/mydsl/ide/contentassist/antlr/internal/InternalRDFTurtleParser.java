package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.RDFTurtleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRDFTurtleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_IRIREF", "RULE_INT", "RULE_DOUBLE", "RULE_DECIMAL", "RULE_EXPONENT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'.'", "'@prefix'", "'@base'", "'PREFIX'", "'BASE'", "';'", "','", "'@'", "'^^'", "'['", "']'", "'('", "')'", "'_:'", "':'", "'a'", "'[]'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=8;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int RULE_IRIREF=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_DECIMAL=9;
    public static final int RULE_EXPONENT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRDFTurtleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRDFTurtleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRDFTurtleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRDFTurtle.g"; }


    	private RDFTurtleGrammarAccess grammarAccess;

    	public void setGrammarAccess(RDFTurtleGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTurtleDoc"
    // InternalRDFTurtle.g:54:1: entryRuleTurtleDoc : ruleTurtleDoc EOF ;
    public final void entryRuleTurtleDoc() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:55:1: ( ruleTurtleDoc EOF )
            // InternalRDFTurtle.g:56:1: ruleTurtleDoc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurtleDocRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTurtleDoc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurtleDocRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurtleDoc"


    // $ANTLR start "ruleTurtleDoc"
    // InternalRDFTurtle.g:63:1: ruleTurtleDoc : ( ( rule__TurtleDoc__StatementsAssignment )* ) ;
    public final void ruleTurtleDoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:67:2: ( ( ( rule__TurtleDoc__StatementsAssignment )* ) )
            // InternalRDFTurtle.g:68:2: ( ( rule__TurtleDoc__StatementsAssignment )* )
            {
            // InternalRDFTurtle.g:68:2: ( ( rule__TurtleDoc__StatementsAssignment )* )
            // InternalRDFTurtle.g:69:3: ( rule__TurtleDoc__StatementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurtleDocAccess().getStatementsAssignment()); 
            }
            // InternalRDFTurtle.g:70:3: ( rule__TurtleDoc__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_IRIREF)||(LA1_0>=18 && LA1_0<=21)||LA1_0==26||LA1_0==28||(LA1_0>=30 && LA1_0<=31)||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRDFTurtle.g:70:4: rule__TurtleDoc__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TurtleDoc__StatementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurtleDocAccess().getStatementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurtleDoc"


    // $ANTLR start "entryRuleStatement"
    // InternalRDFTurtle.g:79:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:80:1: ( ruleStatement EOF )
            // InternalRDFTurtle.g:81:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRDFTurtle.g:88:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:92:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalRDFTurtle.g:93:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalRDFTurtle.g:93:2: ( ( rule__Statement__Group__0 ) )
            // InternalRDFTurtle.g:94:3: ( rule__Statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:95:3: ( rule__Statement__Group__0 )
            // InternalRDFTurtle.g:95:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDirective"
    // InternalRDFTurtle.g:104:1: entryRuleDirective : ruleDirective EOF ;
    public final void entryRuleDirective() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:105:1: ( ruleDirective EOF )
            // InternalRDFTurtle.g:106:1: ruleDirective EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectiveRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDirective();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectiveRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // InternalRDFTurtle.g:113:1: ruleDirective : ( ( rule__Directive__Alternatives ) ) ;
    public final void ruleDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:117:2: ( ( ( rule__Directive__Alternatives ) ) )
            // InternalRDFTurtle.g:118:2: ( ( rule__Directive__Alternatives ) )
            {
            // InternalRDFTurtle.g:118:2: ( ( rule__Directive__Alternatives ) )
            // InternalRDFTurtle.g:119:3: ( rule__Directive__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectiveAccess().getAlternatives()); 
            }
            // InternalRDFTurtle.g:120:3: ( rule__Directive__Alternatives )
            // InternalRDFTurtle.g:120:4: rule__Directive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Directive__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectiveAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRulePrefixID"
    // InternalRDFTurtle.g:129:1: entryRulePrefixID : rulePrefixID EOF ;
    public final void entryRulePrefixID() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:130:1: ( rulePrefixID EOF )
            // InternalRDFTurtle.g:131:1: rulePrefixID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixIDRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrefixID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefixID"


    // $ANTLR start "rulePrefixID"
    // InternalRDFTurtle.g:138:1: rulePrefixID : ( ( rule__PrefixID__Group__0 ) ) ;
    public final void rulePrefixID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:142:2: ( ( ( rule__PrefixID__Group__0 ) ) )
            // InternalRDFTurtle.g:143:2: ( ( rule__PrefixID__Group__0 ) )
            {
            // InternalRDFTurtle.g:143:2: ( ( rule__PrefixID__Group__0 ) )
            // InternalRDFTurtle.g:144:3: ( rule__PrefixID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixIDAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:145:3: ( rule__PrefixID__Group__0 )
            // InternalRDFTurtle.g:145:4: rule__PrefixID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrefixID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixIDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixID"


    // $ANTLR start "entryRuleBase"
    // InternalRDFTurtle.g:154:1: entryRuleBase : ruleBase EOF ;
    public final void entryRuleBase() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:155:1: ( ruleBase EOF )
            // InternalRDFTurtle.g:156:1: ruleBase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBase"


    // $ANTLR start "ruleBase"
    // InternalRDFTurtle.g:163:1: ruleBase : ( ( rule__Base__Group__0 ) ) ;
    public final void ruleBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:167:2: ( ( ( rule__Base__Group__0 ) ) )
            // InternalRDFTurtle.g:168:2: ( ( rule__Base__Group__0 ) )
            {
            // InternalRDFTurtle.g:168:2: ( ( rule__Base__Group__0 ) )
            // InternalRDFTurtle.g:169:3: ( rule__Base__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:170:3: ( rule__Base__Group__0 )
            // InternalRDFTurtle.g:170:4: rule__Base__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Base__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBase"


    // $ANTLR start "entryRuleSparqlPrefix"
    // InternalRDFTurtle.g:179:1: entryRuleSparqlPrefix : ruleSparqlPrefix EOF ;
    public final void entryRuleSparqlPrefix() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:180:1: ( ruleSparqlPrefix EOF )
            // InternalRDFTurtle.g:181:1: ruleSparqlPrefix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlPrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSparqlPrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlPrefixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSparqlPrefix"


    // $ANTLR start "ruleSparqlPrefix"
    // InternalRDFTurtle.g:188:1: ruleSparqlPrefix : ( ( rule__SparqlPrefix__Group__0 ) ) ;
    public final void ruleSparqlPrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:192:2: ( ( ( rule__SparqlPrefix__Group__0 ) ) )
            // InternalRDFTurtle.g:193:2: ( ( rule__SparqlPrefix__Group__0 ) )
            {
            // InternalRDFTurtle.g:193:2: ( ( rule__SparqlPrefix__Group__0 ) )
            // InternalRDFTurtle.g:194:3: ( rule__SparqlPrefix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlPrefixAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:195:3: ( rule__SparqlPrefix__Group__0 )
            // InternalRDFTurtle.g:195:4: rule__SparqlPrefix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SparqlPrefix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlPrefixAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSparqlPrefix"


    // $ANTLR start "entryRuleSparqlBase"
    // InternalRDFTurtle.g:204:1: entryRuleSparqlBase : ruleSparqlBase EOF ;
    public final void entryRuleSparqlBase() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:205:1: ( ruleSparqlBase EOF )
            // InternalRDFTurtle.g:206:1: ruleSparqlBase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSparqlBase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlBaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSparqlBase"


    // $ANTLR start "ruleSparqlBase"
    // InternalRDFTurtle.g:213:1: ruleSparqlBase : ( ( rule__SparqlBase__Group__0 ) ) ;
    public final void ruleSparqlBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:217:2: ( ( ( rule__SparqlBase__Group__0 ) ) )
            // InternalRDFTurtle.g:218:2: ( ( rule__SparqlBase__Group__0 ) )
            {
            // InternalRDFTurtle.g:218:2: ( ( rule__SparqlBase__Group__0 ) )
            // InternalRDFTurtle.g:219:3: ( rule__SparqlBase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlBaseAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:220:3: ( rule__SparqlBase__Group__0 )
            // InternalRDFTurtle.g:220:4: rule__SparqlBase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SparqlBase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlBaseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSparqlBase"


    // $ANTLR start "entryRuleTriples"
    // InternalRDFTurtle.g:229:1: entryRuleTriples : ruleTriples EOF ;
    public final void entryRuleTriples() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:230:1: ( ruleTriples EOF )
            // InternalRDFTurtle.g:231:1: ruleTriples EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTriples();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTriples"


    // $ANTLR start "ruleTriples"
    // InternalRDFTurtle.g:238:1: ruleTriples : ( ( rule__Triples__Group__0 ) ) ;
    public final void ruleTriples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:242:2: ( ( ( rule__Triples__Group__0 ) ) )
            // InternalRDFTurtle.g:243:2: ( ( rule__Triples__Group__0 ) )
            {
            // InternalRDFTurtle.g:243:2: ( ( rule__Triples__Group__0 ) )
            // InternalRDFTurtle.g:244:3: ( rule__Triples__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:245:3: ( rule__Triples__Group__0 )
            // InternalRDFTurtle.g:245:4: rule__Triples__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Triples__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriples"


    // $ANTLR start "entryRulePredicateObject"
    // InternalRDFTurtle.g:254:1: entryRulePredicateObject : rulePredicateObject EOF ;
    public final void entryRulePredicateObject() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:255:1: ( rulePredicateObject EOF )
            // InternalRDFTurtle.g:256:1: rulePredicateObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePredicateObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicateObject"


    // $ANTLR start "rulePredicateObject"
    // InternalRDFTurtle.g:263:1: rulePredicateObject : ( ( rule__PredicateObject__Group__0 ) ) ;
    public final void rulePredicateObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:267:2: ( ( ( rule__PredicateObject__Group__0 ) ) )
            // InternalRDFTurtle.g:268:2: ( ( rule__PredicateObject__Group__0 ) )
            {
            // InternalRDFTurtle.g:268:2: ( ( rule__PredicateObject__Group__0 ) )
            // InternalRDFTurtle.g:269:3: ( rule__PredicateObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:270:3: ( rule__PredicateObject__Group__0 )
            // InternalRDFTurtle.g:270:4: rule__PredicateObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateObject"


    // $ANTLR start "entryRulePredicateObjectList"
    // InternalRDFTurtle.g:279:1: entryRulePredicateObjectList : rulePredicateObjectList EOF ;
    public final void entryRulePredicateObjectList() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:280:1: ( rulePredicateObjectList EOF )
            // InternalRDFTurtle.g:281:1: rulePredicateObjectList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectListRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePredicateObjectList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicateObjectList"


    // $ANTLR start "rulePredicateObjectList"
    // InternalRDFTurtle.g:288:1: rulePredicateObjectList : ( ( rule__PredicateObjectList__Group__0 ) ) ;
    public final void rulePredicateObjectList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:292:2: ( ( ( rule__PredicateObjectList__Group__0 ) ) )
            // InternalRDFTurtle.g:293:2: ( ( rule__PredicateObjectList__Group__0 ) )
            {
            // InternalRDFTurtle.g:293:2: ( ( rule__PredicateObjectList__Group__0 ) )
            // InternalRDFTurtle.g:294:3: ( rule__PredicateObjectList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectListAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:295:3: ( rule__PredicateObjectList__Group__0 )
            // InternalRDFTurtle.g:295:4: rule__PredicateObjectList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateObjectList"


    // $ANTLR start "entryRuleObjectList"
    // InternalRDFTurtle.g:304:1: entryRuleObjectList : ruleObjectList EOF ;
    public final void entryRuleObjectList() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:305:1: ( ruleObjectList EOF )
            // InternalRDFTurtle.g:306:1: ruleObjectList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObjectList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectList"


    // $ANTLR start "ruleObjectList"
    // InternalRDFTurtle.g:313:1: ruleObjectList : ( ( rule__ObjectList__Group__0 ) ) ;
    public final void ruleObjectList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:317:2: ( ( ( rule__ObjectList__Group__0 ) ) )
            // InternalRDFTurtle.g:318:2: ( ( rule__ObjectList__Group__0 ) )
            {
            // InternalRDFTurtle.g:318:2: ( ( rule__ObjectList__Group__0 ) )
            // InternalRDFTurtle.g:319:3: ( rule__ObjectList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectListAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:320:3: ( rule__ObjectList__Group__0 )
            // InternalRDFTurtle.g:320:4: rule__ObjectList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectList"


    // $ANTLR start "entryRuleVerb"
    // InternalRDFTurtle.g:329:1: entryRuleVerb : ruleVerb EOF ;
    public final void entryRuleVerb() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:330:1: ( ruleVerb EOF )
            // InternalRDFTurtle.g:331:1: ruleVerb EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVerb();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerb"


    // $ANTLR start "ruleVerb"
    // InternalRDFTurtle.g:338:1: ruleVerb : ( ( rule__Verb__Alternatives ) ) ;
    public final void ruleVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:342:2: ( ( ( rule__Verb__Alternatives ) ) )
            // InternalRDFTurtle.g:343:2: ( ( rule__Verb__Alternatives ) )
            {
            // InternalRDFTurtle.g:343:2: ( ( rule__Verb__Alternatives ) )
            // InternalRDFTurtle.g:344:3: ( rule__Verb__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbAccess().getAlternatives()); 
            }
            // InternalRDFTurtle.g:345:3: ( rule__Verb__Alternatives )
            // InternalRDFTurtle.g:345:4: rule__Verb__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Verb__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerb"


    // $ANTLR start "entryRuleSubject"
    // InternalRDFTurtle.g:354:1: entryRuleSubject : ruleSubject EOF ;
    public final void entryRuleSubject() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:355:1: ( ruleSubject EOF )
            // InternalRDFTurtle.g:356:1: ruleSubject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalRDFTurtle.g:363:1: ruleSubject : ( ( rule__Subject__Alternatives ) ) ;
    public final void ruleSubject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:367:2: ( ( ( rule__Subject__Alternatives ) ) )
            // InternalRDFTurtle.g:368:2: ( ( rule__Subject__Alternatives ) )
            {
            // InternalRDFTurtle.g:368:2: ( ( rule__Subject__Alternatives ) )
            // InternalRDFTurtle.g:369:3: ( rule__Subject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectAccess().getAlternatives()); 
            }
            // InternalRDFTurtle.g:370:3: ( rule__Subject__Alternatives )
            // InternalRDFTurtle.g:370:4: rule__Subject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRulePredicate"
    // InternalRDFTurtle.g:379:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:380:1: ( rulePredicate EOF )
            // InternalRDFTurtle.g:381:1: rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalRDFTurtle.g:388:1: rulePredicate : ( ( rule__Predicate__IrAssignment ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:392:2: ( ( ( rule__Predicate__IrAssignment ) ) )
            // InternalRDFTurtle.g:393:2: ( ( rule__Predicate__IrAssignment ) )
            {
            // InternalRDFTurtle.g:393:2: ( ( rule__Predicate__IrAssignment ) )
            // InternalRDFTurtle.g:394:3: ( rule__Predicate__IrAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getIrAssignment()); 
            }
            // InternalRDFTurtle.g:395:3: ( rule__Predicate__IrAssignment )
            // InternalRDFTurtle.g:395:4: rule__Predicate__IrAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__IrAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getIrAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleObject"
    // InternalRDFTurtle.g:404:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:405:1: ( ruleObject EOF )
            // InternalRDFTurtle.g:406:1: ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalRDFTurtle.g:413:1: ruleObject : ( ( rule__Object__Alternatives ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:417:2: ( ( ( rule__Object__Alternatives ) ) )
            // InternalRDFTurtle.g:418:2: ( ( rule__Object__Alternatives ) )
            {
            // InternalRDFTurtle.g:418:2: ( ( rule__Object__Alternatives ) )
            // InternalRDFTurtle.g:419:3: ( rule__Object__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getAlternatives()); 
            }
            // InternalRDFTurtle.g:420:3: ( rule__Object__Alternatives )
            // InternalRDFTurtle.g:420:4: rule__Object__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Object__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleLanguageString"
    // InternalRDFTurtle.g:429:1: entryRuleLanguageString : ruleLanguageString EOF ;
    public final void entryRuleLanguageString() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:430:1: ( ruleLanguageString EOF )
            // InternalRDFTurtle.g:431:1: ruleLanguageString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLanguageString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguageString"


    // $ANTLR start "ruleLanguageString"
    // InternalRDFTurtle.g:438:1: ruleLanguageString : ( ( rule__LanguageString__Group__0 ) ) ;
    public final void ruleLanguageString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:442:2: ( ( ( rule__LanguageString__Group__0 ) ) )
            // InternalRDFTurtle.g:443:2: ( ( rule__LanguageString__Group__0 ) )
            {
            // InternalRDFTurtle.g:443:2: ( ( rule__LanguageString__Group__0 ) )
            // InternalRDFTurtle.g:444:3: ( rule__LanguageString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageStringAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:445:3: ( rule__LanguageString__Group__0 )
            // InternalRDFTurtle.g:445:4: rule__LanguageString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageString__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageStringAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguageString"


    // $ANTLR start "entryRuleLiteral"
    // InternalRDFTurtle.g:454:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:455:1: ( ruleLiteral EOF )
            // InternalRDFTurtle.g:456:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalRDFTurtle.g:463:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:467:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalRDFTurtle.g:468:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalRDFTurtle.g:468:2: ( ( rule__Literal__Alternatives ) )
            // InternalRDFTurtle.g:469:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalRDFTurtle.g:470:3: ( rule__Literal__Alternatives )
            // InternalRDFTurtle.g:470:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleDatatypeString"
    // InternalRDFTurtle.g:479:1: entryRuleDatatypeString : ruleDatatypeString EOF ;
    public final void entryRuleDatatypeString() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:480:1: ( ruleDatatypeString EOF )
            // InternalRDFTurtle.g:481:1: ruleDatatypeString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDatatypeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatatypeString"


    // $ANTLR start "ruleDatatypeString"
    // InternalRDFTurtle.g:488:1: ruleDatatypeString : ( ( rule__DatatypeString__Group__0 ) ) ;
    public final void ruleDatatypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:492:2: ( ( ( rule__DatatypeString__Group__0 ) ) )
            // InternalRDFTurtle.g:493:2: ( ( rule__DatatypeString__Group__0 ) )
            {
            // InternalRDFTurtle.g:493:2: ( ( rule__DatatypeString__Group__0 ) )
            // InternalRDFTurtle.g:494:3: ( rule__DatatypeString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeStringAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:495:3: ( rule__DatatypeString__Group__0 )
            // InternalRDFTurtle.g:495:4: rule__DatatypeString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeString__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeStringAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatypeString"


    // $ANTLR start "entryRuleBoolean"
    // InternalRDFTurtle.g:504:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:505:1: ( ruleBoolean EOF )
            // InternalRDFTurtle.g:506:1: ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalRDFTurtle.g:513:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:517:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalRDFTurtle.g:518:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalRDFTurtle.g:518:2: ( ( rule__Boolean__Alternatives ) )
            // InternalRDFTurtle.g:519:3: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // InternalRDFTurtle.g:520:3: ( rule__Boolean__Alternatives )
            // InternalRDFTurtle.g:520:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleBlank"
    // InternalRDFTurtle.g:529:1: entryRuleBlank : ruleBlank EOF ;
    public final void entryRuleBlank() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:530:1: ( ruleBlank EOF )
            // InternalRDFTurtle.g:531:1: ruleBlank EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlankRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlank();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlankRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlank"


    // $ANTLR start "ruleBlank"
    // InternalRDFTurtle.g:538:1: ruleBlank : ( ( rule__Blank__Alternatives ) ) ;
    public final void ruleBlank() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:542:2: ( ( ( rule__Blank__Alternatives ) ) )
            // InternalRDFTurtle.g:543:2: ( ( rule__Blank__Alternatives ) )
            {
            // InternalRDFTurtle.g:543:2: ( ( rule__Blank__Alternatives ) )
            // InternalRDFTurtle.g:544:3: ( rule__Blank__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlankAccess().getAlternatives()); 
            }
            // InternalRDFTurtle.g:545:3: ( rule__Blank__Alternatives )
            // InternalRDFTurtle.g:545:4: rule__Blank__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Blank__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlankAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlank"


    // $ANTLR start "entryRuleItemList"
    // InternalRDFTurtle.g:554:1: entryRuleItemList : ruleItemList EOF ;
    public final void entryRuleItemList() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:555:1: ( ruleItemList EOF )
            // InternalRDFTurtle.g:556:1: ruleItemList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleItemList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemList"


    // $ANTLR start "ruleItemList"
    // InternalRDFTurtle.g:563:1: ruleItemList : ( ( rule__ItemList__Group__0 ) ) ;
    public final void ruleItemList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:567:2: ( ( ( rule__ItemList__Group__0 ) ) )
            // InternalRDFTurtle.g:568:2: ( ( rule__ItemList__Group__0 ) )
            {
            // InternalRDFTurtle.g:568:2: ( ( rule__ItemList__Group__0 ) )
            // InternalRDFTurtle.g:569:3: ( rule__ItemList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemListAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:570:3: ( rule__ItemList__Group__0 )
            // InternalRDFTurtle.g:570:4: rule__ItemList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemList"


    // $ANTLR start "entryRuleCollection"
    // InternalRDFTurtle.g:579:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:580:1: ( ruleCollection EOF )
            // InternalRDFTurtle.g:581:1: ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCollection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalRDFTurtle.g:588:1: ruleCollection : ( ( rule__Collection__Group__0 ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:592:2: ( ( ( rule__Collection__Group__0 ) ) )
            // InternalRDFTurtle.g:593:2: ( ( rule__Collection__Group__0 ) )
            {
            // InternalRDFTurtle.g:593:2: ( ( rule__Collection__Group__0 ) )
            // InternalRDFTurtle.g:594:3: ( rule__Collection__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:595:3: ( rule__Collection__Group__0 )
            // InternalRDFTurtle.g:595:4: rule__Collection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleiResource"
    // InternalRDFTurtle.g:604:1: entryRuleiResource : ruleiResource EOF ;
    public final void entryRuleiResource() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:605:1: ( ruleiResource EOF )
            // InternalRDFTurtle.g:606:1: ruleiResource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIResourceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleiResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIResourceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleiResource"


    // $ANTLR start "ruleiResource"
    // InternalRDFTurtle.g:613:1: ruleiResource : ( ( rule__IResource__Alternatives ) ) ;
    public final void ruleiResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:617:2: ( ( ( rule__IResource__Alternatives ) ) )
            // InternalRDFTurtle.g:618:2: ( ( rule__IResource__Alternatives ) )
            {
            // InternalRDFTurtle.g:618:2: ( ( rule__IResource__Alternatives ) )
            // InternalRDFTurtle.g:619:3: ( rule__IResource__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIResourceAccess().getAlternatives()); 
            }
            // InternalRDFTurtle.g:620:3: ( rule__IResource__Alternatives )
            // InternalRDFTurtle.g:620:4: rule__IResource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IResource__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIResourceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleiResource"


    // $ANTLR start "entryRuleNodeID"
    // InternalRDFTurtle.g:629:1: entryRuleNodeID : ruleNodeID EOF ;
    public final void entryRuleNodeID() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:630:1: ( ruleNodeID EOF )
            // InternalRDFTurtle.g:631:1: ruleNodeID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNodeID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeID"


    // $ANTLR start "ruleNodeID"
    // InternalRDFTurtle.g:638:1: ruleNodeID : ( ( rule__NodeID__Group__0 ) ) ;
    public final void ruleNodeID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:642:2: ( ( ( rule__NodeID__Group__0 ) ) )
            // InternalRDFTurtle.g:643:2: ( ( rule__NodeID__Group__0 ) )
            {
            // InternalRDFTurtle.g:643:2: ( ( rule__NodeID__Group__0 ) )
            // InternalRDFTurtle.g:644:3: ( rule__NodeID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIDAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:645:3: ( rule__NodeID__Group__0 )
            // InternalRDFTurtle.g:645:4: rule__NodeID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeID"


    // $ANTLR start "entryRuleQname"
    // InternalRDFTurtle.g:654:1: entryRuleQname : ruleQname EOF ;
    public final void entryRuleQname() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:655:1: ( ruleQname EOF )
            // InternalRDFTurtle.g:656:1: ruleQname EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQname();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQname"


    // $ANTLR start "ruleQname"
    // InternalRDFTurtle.g:663:1: ruleQname : ( ( rule__Qname__Group__0 ) ) ;
    public final void ruleQname() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:667:2: ( ( ( rule__Qname__Group__0 ) ) )
            // InternalRDFTurtle.g:668:2: ( ( rule__Qname__Group__0 ) )
            {
            // InternalRDFTurtle.g:668:2: ( ( rule__Qname__Group__0 ) )
            // InternalRDFTurtle.g:669:3: ( rule__Qname__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:670:3: ( rule__Qname__Group__0 )
            // InternalRDFTurtle.g:670:4: rule__Qname__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qname__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQname"


    // $ANTLR start "entryRulePrefixName"
    // InternalRDFTurtle.g:679:1: entryRulePrefixName : rulePrefixName EOF ;
    public final void entryRulePrefixName() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:680:1: ( rulePrefixName EOF )
            // InternalRDFTurtle.g:681:1: rulePrefixName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixNameRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefixName"


    // $ANTLR start "rulePrefixName"
    // InternalRDFTurtle.g:688:1: rulePrefixName : ( ( rule__PrefixName__Group__0 ) ) ;
    public final void rulePrefixName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:692:2: ( ( ( rule__PrefixName__Group__0 ) ) )
            // InternalRDFTurtle.g:693:2: ( ( rule__PrefixName__Group__0 ) )
            {
            // InternalRDFTurtle.g:693:2: ( ( rule__PrefixName__Group__0 ) )
            // InternalRDFTurtle.g:694:3: ( rule__PrefixName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixNameAccess().getGroup()); 
            }
            // InternalRDFTurtle.g:695:3: ( rule__PrefixName__Group__0 )
            // InternalRDFTurtle.g:695:4: rule__PrefixName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrefixName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixName"


    // $ANTLR start "entryRuleQuotedString"
    // InternalRDFTurtle.g:704:1: entryRuleQuotedString : ruleQuotedString EOF ;
    public final void entryRuleQuotedString() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:705:1: ( ruleQuotedString EOF )
            // InternalRDFTurtle.g:706:1: ruleQuotedString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQuotedString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuotedString"


    // $ANTLR start "ruleQuotedString"
    // InternalRDFTurtle.g:713:1: ruleQuotedString : ( RULE_STRING ) ;
    public final void ruleQuotedString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:717:2: ( ( RULE_STRING ) )
            // InternalRDFTurtle.g:718:2: ( RULE_STRING )
            {
            // InternalRDFTurtle.g:718:2: ( RULE_STRING )
            // InternalRDFTurtle.g:719:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedStringAccess().getSTRINGTerminalRuleCall()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedStringAccess().getSTRINGTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuotedString"


    // $ANTLR start "rule__Statement__Alternatives_0"
    // InternalRDFTurtle.g:728:1: rule__Statement__Alternatives_0 : ( ( ( rule__Statement__DirectiveAssignment_0_0 ) ) | ( ( rule__Statement__TriplesAssignment_0_1 ) ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:732:1: ( ( ( rule__Statement__DirectiveAssignment_0_0 ) ) | ( ( rule__Statement__TriplesAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=21)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_IRIREF)||LA2_0==26||LA2_0==28||(LA2_0>=30 && LA2_0<=31)||LA2_0==33) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRDFTurtle.g:733:2: ( ( rule__Statement__DirectiveAssignment_0_0 ) )
                    {
                    // InternalRDFTurtle.g:733:2: ( ( rule__Statement__DirectiveAssignment_0_0 ) )
                    // InternalRDFTurtle.g:734:3: ( rule__Statement__DirectiveAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDirectiveAssignment_0_0()); 
                    }
                    // InternalRDFTurtle.g:735:3: ( rule__Statement__DirectiveAssignment_0_0 )
                    // InternalRDFTurtle.g:735:4: rule__Statement__DirectiveAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__DirectiveAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getDirectiveAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:739:2: ( ( rule__Statement__TriplesAssignment_0_1 ) )
                    {
                    // InternalRDFTurtle.g:739:2: ( ( rule__Statement__TriplesAssignment_0_1 ) )
                    // InternalRDFTurtle.g:740:3: ( rule__Statement__TriplesAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getTriplesAssignment_0_1()); 
                    }
                    // InternalRDFTurtle.g:741:3: ( rule__Statement__TriplesAssignment_0_1 )
                    // InternalRDFTurtle.g:741:4: rule__Statement__TriplesAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__TriplesAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getTriplesAssignment_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives_0"


    // $ANTLR start "rule__Directive__Alternatives"
    // InternalRDFTurtle.g:749:1: rule__Directive__Alternatives : ( ( ( rule__Directive__PrefixAssignment_0 ) ) | ( ( rule__Directive__BaseAssignment_1 ) ) | ( ( rule__Directive__SparqlPrefixAssignment_2 ) ) | ( ( rule__Directive__SparqlBaseAssignment_3 ) ) );
    public final void rule__Directive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:753:1: ( ( ( rule__Directive__PrefixAssignment_0 ) ) | ( ( rule__Directive__BaseAssignment_1 ) ) | ( ( rule__Directive__SparqlPrefixAssignment_2 ) ) | ( ( rule__Directive__SparqlBaseAssignment_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRDFTurtle.g:754:2: ( ( rule__Directive__PrefixAssignment_0 ) )
                    {
                    // InternalRDFTurtle.g:754:2: ( ( rule__Directive__PrefixAssignment_0 ) )
                    // InternalRDFTurtle.g:755:3: ( rule__Directive__PrefixAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectiveAccess().getPrefixAssignment_0()); 
                    }
                    // InternalRDFTurtle.g:756:3: ( rule__Directive__PrefixAssignment_0 )
                    // InternalRDFTurtle.g:756:4: rule__Directive__PrefixAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Directive__PrefixAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectiveAccess().getPrefixAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:760:2: ( ( rule__Directive__BaseAssignment_1 ) )
                    {
                    // InternalRDFTurtle.g:760:2: ( ( rule__Directive__BaseAssignment_1 ) )
                    // InternalRDFTurtle.g:761:3: ( rule__Directive__BaseAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectiveAccess().getBaseAssignment_1()); 
                    }
                    // InternalRDFTurtle.g:762:3: ( rule__Directive__BaseAssignment_1 )
                    // InternalRDFTurtle.g:762:4: rule__Directive__BaseAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Directive__BaseAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectiveAccess().getBaseAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRDFTurtle.g:766:2: ( ( rule__Directive__SparqlPrefixAssignment_2 ) )
                    {
                    // InternalRDFTurtle.g:766:2: ( ( rule__Directive__SparqlPrefixAssignment_2 ) )
                    // InternalRDFTurtle.g:767:3: ( rule__Directive__SparqlPrefixAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectiveAccess().getSparqlPrefixAssignment_2()); 
                    }
                    // InternalRDFTurtle.g:768:3: ( rule__Directive__SparqlPrefixAssignment_2 )
                    // InternalRDFTurtle.g:768:4: rule__Directive__SparqlPrefixAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Directive__SparqlPrefixAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectiveAccess().getSparqlPrefixAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRDFTurtle.g:772:2: ( ( rule__Directive__SparqlBaseAssignment_3 ) )
                    {
                    // InternalRDFTurtle.g:772:2: ( ( rule__Directive__SparqlBaseAssignment_3 ) )
                    // InternalRDFTurtle.g:773:3: ( rule__Directive__SparqlBaseAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectiveAccess().getSparqlBaseAssignment_3()); 
                    }
                    // InternalRDFTurtle.g:774:3: ( rule__Directive__SparqlBaseAssignment_3 )
                    // InternalRDFTurtle.g:774:4: rule__Directive__SparqlBaseAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Directive__SparqlBaseAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectiveAccess().getSparqlBaseAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Alternatives"


    // $ANTLR start "rule__Verb__Alternatives"
    // InternalRDFTurtle.g:782:1: rule__Verb__Alternatives : ( ( ( rule__Verb__PredicateAssignment_0 ) ) | ( ( rule__Verb__IsAAssignment_1 ) ) );
    public final void rule__Verb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:786:1: ( ( ( rule__Verb__PredicateAssignment_0 ) ) | ( ( rule__Verb__IsAAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_IRIREF)||LA4_0==31) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRDFTurtle.g:787:2: ( ( rule__Verb__PredicateAssignment_0 ) )
                    {
                    // InternalRDFTurtle.g:787:2: ( ( rule__Verb__PredicateAssignment_0 ) )
                    // InternalRDFTurtle.g:788:3: ( rule__Verb__PredicateAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVerbAccess().getPredicateAssignment_0()); 
                    }
                    // InternalRDFTurtle.g:789:3: ( rule__Verb__PredicateAssignment_0 )
                    // InternalRDFTurtle.g:789:4: rule__Verb__PredicateAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verb__PredicateAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVerbAccess().getPredicateAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:793:2: ( ( rule__Verb__IsAAssignment_1 ) )
                    {
                    // InternalRDFTurtle.g:793:2: ( ( rule__Verb__IsAAssignment_1 ) )
                    // InternalRDFTurtle.g:794:3: ( rule__Verb__IsAAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVerbAccess().getIsAAssignment_1()); 
                    }
                    // InternalRDFTurtle.g:795:3: ( rule__Verb__IsAAssignment_1 )
                    // InternalRDFTurtle.g:795:4: rule__Verb__IsAAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verb__IsAAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVerbAccess().getIsAAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verb__Alternatives"


    // $ANTLR start "rule__Subject__Alternatives"
    // InternalRDFTurtle.g:803:1: rule__Subject__Alternatives : ( ( ( rule__Subject__ResourceAssignment_0 ) ) | ( ( rule__Subject__BlankAssignment_1 ) ) );
    public final void rule__Subject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:807:1: ( ( ( rule__Subject__ResourceAssignment_0 ) ) | ( ( rule__Subject__BlankAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_IRIREF)||LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==26||LA5_0==28||LA5_0==30||LA5_0==33) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRDFTurtle.g:808:2: ( ( rule__Subject__ResourceAssignment_0 ) )
                    {
                    // InternalRDFTurtle.g:808:2: ( ( rule__Subject__ResourceAssignment_0 ) )
                    // InternalRDFTurtle.g:809:3: ( rule__Subject__ResourceAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubjectAccess().getResourceAssignment_0()); 
                    }
                    // InternalRDFTurtle.g:810:3: ( rule__Subject__ResourceAssignment_0 )
                    // InternalRDFTurtle.g:810:4: rule__Subject__ResourceAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subject__ResourceAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubjectAccess().getResourceAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:814:2: ( ( rule__Subject__BlankAssignment_1 ) )
                    {
                    // InternalRDFTurtle.g:814:2: ( ( rule__Subject__BlankAssignment_1 ) )
                    // InternalRDFTurtle.g:815:3: ( rule__Subject__BlankAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubjectAccess().getBlankAssignment_1()); 
                    }
                    // InternalRDFTurtle.g:816:3: ( rule__Subject__BlankAssignment_1 )
                    // InternalRDFTurtle.g:816:4: rule__Subject__BlankAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subject__BlankAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubjectAccess().getBlankAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Alternatives"


    // $ANTLR start "rule__Object__Alternatives"
    // InternalRDFTurtle.g:824:1: rule__Object__Alternatives : ( ( ( rule__Object__ResourceAssignment_0 ) ) | ( ( rule__Object__BlankAssignment_1 ) ) | ( ( rule__Object__LiteralAssignment_2 ) ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:828:1: ( ( ( rule__Object__ResourceAssignment_0 ) ) | ( ( rule__Object__BlankAssignment_1 ) ) | ( ( rule__Object__LiteralAssignment_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_IRIREF:
            case 31:
                {
                alt6=1;
                }
                break;
            case 26:
            case 28:
            case 30:
            case 33:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_DECIMAL:
            case 15:
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRDFTurtle.g:829:2: ( ( rule__Object__ResourceAssignment_0 ) )
                    {
                    // InternalRDFTurtle.g:829:2: ( ( rule__Object__ResourceAssignment_0 ) )
                    // InternalRDFTurtle.g:830:3: ( rule__Object__ResourceAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getResourceAssignment_0()); 
                    }
                    // InternalRDFTurtle.g:831:3: ( rule__Object__ResourceAssignment_0 )
                    // InternalRDFTurtle.g:831:4: rule__Object__ResourceAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__ResourceAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getResourceAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:835:2: ( ( rule__Object__BlankAssignment_1 ) )
                    {
                    // InternalRDFTurtle.g:835:2: ( ( rule__Object__BlankAssignment_1 ) )
                    // InternalRDFTurtle.g:836:3: ( rule__Object__BlankAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getBlankAssignment_1()); 
                    }
                    // InternalRDFTurtle.g:837:3: ( rule__Object__BlankAssignment_1 )
                    // InternalRDFTurtle.g:837:4: rule__Object__BlankAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__BlankAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getBlankAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRDFTurtle.g:841:2: ( ( rule__Object__LiteralAssignment_2 ) )
                    {
                    // InternalRDFTurtle.g:841:2: ( ( rule__Object__LiteralAssignment_2 ) )
                    // InternalRDFTurtle.g:842:3: ( rule__Object__LiteralAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getObjectAccess().getLiteralAssignment_2()); 
                    }
                    // InternalRDFTurtle.g:843:3: ( rule__Object__LiteralAssignment_2 )
                    // InternalRDFTurtle.g:843:4: rule__Object__LiteralAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__LiteralAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getObjectAccess().getLiteralAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalRDFTurtle.g:851:1: rule__Literal__Alternatives : ( ( ( rule__Literal__LanguageStringAssignment_0 ) ) | ( ( rule__Literal__DatatypeStringAssignment_1 ) ) | ( ( rule__Literal__DwordAssignment_2 ) ) | ( ( rule__Literal__RealAssignment_3 ) ) | ( ( rule__Literal__DecimalAssignment_4 ) ) | ( ( rule__Literal__BoolAssignment_5 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:855:1: ( ( ( rule__Literal__LanguageStringAssignment_0 ) ) | ( ( rule__Literal__DatatypeStringAssignment_1 ) ) | ( ( rule__Literal__DwordAssignment_2 ) ) | ( ( rule__Literal__RealAssignment_3 ) ) | ( ( rule__Literal__DecimalAssignment_4 ) ) | ( ( rule__Literal__BoolAssignment_5 ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==25) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||(LA7_1>=RULE_STRING && LA7_1<=RULE_DECIMAL)||(LA7_1>=15 && LA7_1<=17)||(LA7_1>=22 && LA7_1<=24)||(LA7_1>=26 && LA7_1<=31)||LA7_1==33) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt7=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt7=4;
                }
                break;
            case RULE_DECIMAL:
                {
                alt7=5;
                }
                break;
            case 15:
            case 16:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRDFTurtle.g:856:2: ( ( rule__Literal__LanguageStringAssignment_0 ) )
                    {
                    // InternalRDFTurtle.g:856:2: ( ( rule__Literal__LanguageStringAssignment_0 ) )
                    // InternalRDFTurtle.g:857:3: ( rule__Literal__LanguageStringAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getLanguageStringAssignment_0()); 
                    }
                    // InternalRDFTurtle.g:858:3: ( rule__Literal__LanguageStringAssignment_0 )
                    // InternalRDFTurtle.g:858:4: rule__Literal__LanguageStringAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__LanguageStringAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getLanguageStringAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:862:2: ( ( rule__Literal__DatatypeStringAssignment_1 ) )
                    {
                    // InternalRDFTurtle.g:862:2: ( ( rule__Literal__DatatypeStringAssignment_1 ) )
                    // InternalRDFTurtle.g:863:3: ( rule__Literal__DatatypeStringAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getDatatypeStringAssignment_1()); 
                    }
                    // InternalRDFTurtle.g:864:3: ( rule__Literal__DatatypeStringAssignment_1 )
                    // InternalRDFTurtle.g:864:4: rule__Literal__DatatypeStringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__DatatypeStringAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getDatatypeStringAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRDFTurtle.g:868:2: ( ( rule__Literal__DwordAssignment_2 ) )
                    {
                    // InternalRDFTurtle.g:868:2: ( ( rule__Literal__DwordAssignment_2 ) )
                    // InternalRDFTurtle.g:869:3: ( rule__Literal__DwordAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getDwordAssignment_2()); 
                    }
                    // InternalRDFTurtle.g:870:3: ( rule__Literal__DwordAssignment_2 )
                    // InternalRDFTurtle.g:870:4: rule__Literal__DwordAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__DwordAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getDwordAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRDFTurtle.g:874:2: ( ( rule__Literal__RealAssignment_3 ) )
                    {
                    // InternalRDFTurtle.g:874:2: ( ( rule__Literal__RealAssignment_3 ) )
                    // InternalRDFTurtle.g:875:3: ( rule__Literal__RealAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getRealAssignment_3()); 
                    }
                    // InternalRDFTurtle.g:876:3: ( rule__Literal__RealAssignment_3 )
                    // InternalRDFTurtle.g:876:4: rule__Literal__RealAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__RealAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getRealAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRDFTurtle.g:880:2: ( ( rule__Literal__DecimalAssignment_4 ) )
                    {
                    // InternalRDFTurtle.g:880:2: ( ( rule__Literal__DecimalAssignment_4 ) )
                    // InternalRDFTurtle.g:881:3: ( rule__Literal__DecimalAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getDecimalAssignment_4()); 
                    }
                    // InternalRDFTurtle.g:882:3: ( rule__Literal__DecimalAssignment_4 )
                    // InternalRDFTurtle.g:882:4: rule__Literal__DecimalAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__DecimalAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getDecimalAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRDFTurtle.g:886:2: ( ( rule__Literal__BoolAssignment_5 ) )
                    {
                    // InternalRDFTurtle.g:886:2: ( ( rule__Literal__BoolAssignment_5 ) )
                    // InternalRDFTurtle.g:887:3: ( rule__Literal__BoolAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBoolAssignment_5()); 
                    }
                    // InternalRDFTurtle.g:888:3: ( rule__Literal__BoolAssignment_5 )
                    // InternalRDFTurtle.g:888:4: rule__Literal__BoolAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__BoolAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBoolAssignment_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalRDFTurtle.g:896:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:900:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRDFTurtle.g:901:2: ( 'true' )
                    {
                    // InternalRDFTurtle.g:901:2: ( 'true' )
                    // InternalRDFTurtle.g:902:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:907:2: ( 'false' )
                    {
                    // InternalRDFTurtle.g:907:2: ( 'false' )
                    // InternalRDFTurtle.g:908:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Blank__Alternatives"
    // InternalRDFTurtle.g:917:1: rule__Blank__Alternatives : ( ( ( rule__Blank__NodeIDAssignment_0 ) ) | ( ( rule__Blank__IsSquareAssignment_1 ) ) | ( ( rule__Blank__Group_2__0 ) ) | ( ( rule__Blank__CollectionAssignment_3 ) ) );
    public final void rule__Blank__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:921:1: ( ( ( rule__Blank__NodeIDAssignment_0 ) ) | ( ( rule__Blank__IsSquareAssignment_1 ) ) | ( ( rule__Blank__Group_2__0 ) ) | ( ( rule__Blank__CollectionAssignment_3 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRDFTurtle.g:922:2: ( ( rule__Blank__NodeIDAssignment_0 ) )
                    {
                    // InternalRDFTurtle.g:922:2: ( ( rule__Blank__NodeIDAssignment_0 ) )
                    // InternalRDFTurtle.g:923:3: ( rule__Blank__NodeIDAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlankAccess().getNodeIDAssignment_0()); 
                    }
                    // InternalRDFTurtle.g:924:3: ( rule__Blank__NodeIDAssignment_0 )
                    // InternalRDFTurtle.g:924:4: rule__Blank__NodeIDAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Blank__NodeIDAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlankAccess().getNodeIDAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:928:2: ( ( rule__Blank__IsSquareAssignment_1 ) )
                    {
                    // InternalRDFTurtle.g:928:2: ( ( rule__Blank__IsSquareAssignment_1 ) )
                    // InternalRDFTurtle.g:929:3: ( rule__Blank__IsSquareAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlankAccess().getIsSquareAssignment_1()); 
                    }
                    // InternalRDFTurtle.g:930:3: ( rule__Blank__IsSquareAssignment_1 )
                    // InternalRDFTurtle.g:930:4: rule__Blank__IsSquareAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Blank__IsSquareAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlankAccess().getIsSquareAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRDFTurtle.g:934:2: ( ( rule__Blank__Group_2__0 ) )
                    {
                    // InternalRDFTurtle.g:934:2: ( ( rule__Blank__Group_2__0 ) )
                    // InternalRDFTurtle.g:935:3: ( rule__Blank__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlankAccess().getGroup_2()); 
                    }
                    // InternalRDFTurtle.g:936:3: ( rule__Blank__Group_2__0 )
                    // InternalRDFTurtle.g:936:4: rule__Blank__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Blank__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlankAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRDFTurtle.g:940:2: ( ( rule__Blank__CollectionAssignment_3 ) )
                    {
                    // InternalRDFTurtle.g:940:2: ( ( rule__Blank__CollectionAssignment_3 ) )
                    // InternalRDFTurtle.g:941:3: ( rule__Blank__CollectionAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlankAccess().getCollectionAssignment_3()); 
                    }
                    // InternalRDFTurtle.g:942:3: ( rule__Blank__CollectionAssignment_3 )
                    // InternalRDFTurtle.g:942:4: rule__Blank__CollectionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Blank__CollectionAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlankAccess().getCollectionAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__Alternatives"


    // $ANTLR start "rule__IResource__Alternatives"
    // InternalRDFTurtle.g:950:1: rule__IResource__Alternatives : ( ( ( rule__IResource__IriRefAssignment_0 ) ) | ( ( rule__IResource__QnameAssignment_1 ) ) );
    public final void rule__IResource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:954:1: ( ( ( rule__IResource__IriRefAssignment_0 ) ) | ( ( rule__IResource__QnameAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IRIREF) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||LA10_0==31) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRDFTurtle.g:955:2: ( ( rule__IResource__IriRefAssignment_0 ) )
                    {
                    // InternalRDFTurtle.g:955:2: ( ( rule__IResource__IriRefAssignment_0 ) )
                    // InternalRDFTurtle.g:956:3: ( rule__IResource__IriRefAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIResourceAccess().getIriRefAssignment_0()); 
                    }
                    // InternalRDFTurtle.g:957:3: ( rule__IResource__IriRefAssignment_0 )
                    // InternalRDFTurtle.g:957:4: rule__IResource__IriRefAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IResource__IriRefAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIResourceAccess().getIriRefAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:961:2: ( ( rule__IResource__QnameAssignment_1 ) )
                    {
                    // InternalRDFTurtle.g:961:2: ( ( rule__IResource__QnameAssignment_1 ) )
                    // InternalRDFTurtle.g:962:3: ( rule__IResource__QnameAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIResourceAccess().getQnameAssignment_1()); 
                    }
                    // InternalRDFTurtle.g:963:3: ( rule__IResource__QnameAssignment_1 )
                    // InternalRDFTurtle.g:963:4: rule__IResource__QnameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__IResource__QnameAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIResourceAccess().getQnameAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IResource__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalRDFTurtle.g:971:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:975:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalRDFTurtle.g:976:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalRDFTurtle.g:983:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:987:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalRDFTurtle.g:988:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalRDFTurtle.g:988:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalRDFTurtle.g:989:2: ( rule__Statement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            }
            // InternalRDFTurtle.g:990:2: ( rule__Statement__Alternatives_0 )
            // InternalRDFTurtle.g:990:3: rule__Statement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalRDFTurtle.g:998:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1002:1: ( rule__Statement__Group__1__Impl )
            // InternalRDFTurtle.g:1003:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalRDFTurtle.g:1009:1: rule__Statement__Group__1__Impl : ( '.' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1013:1: ( ( '.' ) )
            // InternalRDFTurtle.g:1014:1: ( '.' )
            {
            // InternalRDFTurtle.g:1014:1: ( '.' )
            // InternalRDFTurtle.g:1015:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__PrefixID__Group__0"
    // InternalRDFTurtle.g:1025:1: rule__PrefixID__Group__0 : rule__PrefixID__Group__0__Impl rule__PrefixID__Group__1 ;
    public final void rule__PrefixID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1029:1: ( rule__PrefixID__Group__0__Impl rule__PrefixID__Group__1 )
            // InternalRDFTurtle.g:1030:2: rule__PrefixID__Group__0__Impl rule__PrefixID__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PrefixID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrefixID__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixID__Group__0"


    // $ANTLR start "rule__PrefixID__Group__0__Impl"
    // InternalRDFTurtle.g:1037:1: rule__PrefixID__Group__0__Impl : ( '@prefix' ) ;
    public final void rule__PrefixID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1041:1: ( ( '@prefix' ) )
            // InternalRDFTurtle.g:1042:1: ( '@prefix' )
            {
            // InternalRDFTurtle.g:1042:1: ( '@prefix' )
            // InternalRDFTurtle.g:1043:2: '@prefix'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixIDAccess().getPrefixKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixIDAccess().getPrefixKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixID__Group__0__Impl"


    // $ANTLR start "rule__PrefixID__Group__1"
    // InternalRDFTurtle.g:1052:1: rule__PrefixID__Group__1 : rule__PrefixID__Group__1__Impl rule__PrefixID__Group__2 ;
    public final void rule__PrefixID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1056:1: ( rule__PrefixID__Group__1__Impl rule__PrefixID__Group__2 )
            // InternalRDFTurtle.g:1057:2: rule__PrefixID__Group__1__Impl rule__PrefixID__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__PrefixID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrefixID__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixID__Group__1"


    // $ANTLR start "rule__PrefixID__Group__1__Impl"
    // InternalRDFTurtle.g:1064:1: rule__PrefixID__Group__1__Impl : ( ( rule__PrefixID__PrefixNameAssignment_1 ) ) ;
    public final void rule__PrefixID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1068:1: ( ( ( rule__PrefixID__PrefixNameAssignment_1 ) ) )
            // InternalRDFTurtle.g:1069:1: ( ( rule__PrefixID__PrefixNameAssignment_1 ) )
            {
            // InternalRDFTurtle.g:1069:1: ( ( rule__PrefixID__PrefixNameAssignment_1 ) )
            // InternalRDFTurtle.g:1070:2: ( rule__PrefixID__PrefixNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixIDAccess().getPrefixNameAssignment_1()); 
            }
            // InternalRDFTurtle.g:1071:2: ( rule__PrefixID__PrefixNameAssignment_1 )
            // InternalRDFTurtle.g:1071:3: rule__PrefixID__PrefixNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrefixID__PrefixNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixIDAccess().getPrefixNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixID__Group__1__Impl"


    // $ANTLR start "rule__PrefixID__Group__2"
    // InternalRDFTurtle.g:1079:1: rule__PrefixID__Group__2 : rule__PrefixID__Group__2__Impl ;
    public final void rule__PrefixID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1083:1: ( rule__PrefixID__Group__2__Impl )
            // InternalRDFTurtle.g:1084:2: rule__PrefixID__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrefixID__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixID__Group__2"


    // $ANTLR start "rule__PrefixID__Group__2__Impl"
    // InternalRDFTurtle.g:1090:1: rule__PrefixID__Group__2__Impl : ( ( rule__PrefixID__IrirefAssignment_2 ) ) ;
    public final void rule__PrefixID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1094:1: ( ( ( rule__PrefixID__IrirefAssignment_2 ) ) )
            // InternalRDFTurtle.g:1095:1: ( ( rule__PrefixID__IrirefAssignment_2 ) )
            {
            // InternalRDFTurtle.g:1095:1: ( ( rule__PrefixID__IrirefAssignment_2 ) )
            // InternalRDFTurtle.g:1096:2: ( rule__PrefixID__IrirefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixIDAccess().getIrirefAssignment_2()); 
            }
            // InternalRDFTurtle.g:1097:2: ( rule__PrefixID__IrirefAssignment_2 )
            // InternalRDFTurtle.g:1097:3: rule__PrefixID__IrirefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PrefixID__IrirefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixIDAccess().getIrirefAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixID__Group__2__Impl"


    // $ANTLR start "rule__Base__Group__0"
    // InternalRDFTurtle.g:1106:1: rule__Base__Group__0 : rule__Base__Group__0__Impl rule__Base__Group__1 ;
    public final void rule__Base__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1110:1: ( rule__Base__Group__0__Impl rule__Base__Group__1 )
            // InternalRDFTurtle.g:1111:2: rule__Base__Group__0__Impl rule__Base__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Base__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Base__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__Group__0"


    // $ANTLR start "rule__Base__Group__0__Impl"
    // InternalRDFTurtle.g:1118:1: rule__Base__Group__0__Impl : ( '@base' ) ;
    public final void rule__Base__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1122:1: ( ( '@base' ) )
            // InternalRDFTurtle.g:1123:1: ( '@base' )
            {
            // InternalRDFTurtle.g:1123:1: ( '@base' )
            // InternalRDFTurtle.g:1124:2: '@base'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseAccess().getBaseKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseAccess().getBaseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__Group__0__Impl"


    // $ANTLR start "rule__Base__Group__1"
    // InternalRDFTurtle.g:1133:1: rule__Base__Group__1 : rule__Base__Group__1__Impl ;
    public final void rule__Base__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1137:1: ( rule__Base__Group__1__Impl )
            // InternalRDFTurtle.g:1138:2: rule__Base__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Base__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__Group__1"


    // $ANTLR start "rule__Base__Group__1__Impl"
    // InternalRDFTurtle.g:1144:1: rule__Base__Group__1__Impl : ( ( rule__Base__IrirefAssignment_1 ) ) ;
    public final void rule__Base__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1148:1: ( ( ( rule__Base__IrirefAssignment_1 ) ) )
            // InternalRDFTurtle.g:1149:1: ( ( rule__Base__IrirefAssignment_1 ) )
            {
            // InternalRDFTurtle.g:1149:1: ( ( rule__Base__IrirefAssignment_1 ) )
            // InternalRDFTurtle.g:1150:2: ( rule__Base__IrirefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseAccess().getIrirefAssignment_1()); 
            }
            // InternalRDFTurtle.g:1151:2: ( rule__Base__IrirefAssignment_1 )
            // InternalRDFTurtle.g:1151:3: rule__Base__IrirefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Base__IrirefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseAccess().getIrirefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__Group__1__Impl"


    // $ANTLR start "rule__SparqlPrefix__Group__0"
    // InternalRDFTurtle.g:1160:1: rule__SparqlPrefix__Group__0 : rule__SparqlPrefix__Group__0__Impl rule__SparqlPrefix__Group__1 ;
    public final void rule__SparqlPrefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1164:1: ( rule__SparqlPrefix__Group__0__Impl rule__SparqlPrefix__Group__1 )
            // InternalRDFTurtle.g:1165:2: rule__SparqlPrefix__Group__0__Impl rule__SparqlPrefix__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SparqlPrefix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SparqlPrefix__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlPrefix__Group__0"


    // $ANTLR start "rule__SparqlPrefix__Group__0__Impl"
    // InternalRDFTurtle.g:1172:1: rule__SparqlPrefix__Group__0__Impl : ( 'PREFIX' ) ;
    public final void rule__SparqlPrefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1176:1: ( ( 'PREFIX' ) )
            // InternalRDFTurtle.g:1177:1: ( 'PREFIX' )
            {
            // InternalRDFTurtle.g:1177:1: ( 'PREFIX' )
            // InternalRDFTurtle.g:1178:2: 'PREFIX'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlPrefixAccess().getPREFIXKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlPrefixAccess().getPREFIXKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlPrefix__Group__0__Impl"


    // $ANTLR start "rule__SparqlPrefix__Group__1"
    // InternalRDFTurtle.g:1187:1: rule__SparqlPrefix__Group__1 : rule__SparqlPrefix__Group__1__Impl rule__SparqlPrefix__Group__2 ;
    public final void rule__SparqlPrefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1191:1: ( rule__SparqlPrefix__Group__1__Impl rule__SparqlPrefix__Group__2 )
            // InternalRDFTurtle.g:1192:2: rule__SparqlPrefix__Group__1__Impl rule__SparqlPrefix__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SparqlPrefix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SparqlPrefix__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlPrefix__Group__1"


    // $ANTLR start "rule__SparqlPrefix__Group__1__Impl"
    // InternalRDFTurtle.g:1199:1: rule__SparqlPrefix__Group__1__Impl : ( ( rule__SparqlPrefix__PrefixNameAssignment_1 ) ) ;
    public final void rule__SparqlPrefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1203:1: ( ( ( rule__SparqlPrefix__PrefixNameAssignment_1 ) ) )
            // InternalRDFTurtle.g:1204:1: ( ( rule__SparqlPrefix__PrefixNameAssignment_1 ) )
            {
            // InternalRDFTurtle.g:1204:1: ( ( rule__SparqlPrefix__PrefixNameAssignment_1 ) )
            // InternalRDFTurtle.g:1205:2: ( rule__SparqlPrefix__PrefixNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlPrefixAccess().getPrefixNameAssignment_1()); 
            }
            // InternalRDFTurtle.g:1206:2: ( rule__SparqlPrefix__PrefixNameAssignment_1 )
            // InternalRDFTurtle.g:1206:3: rule__SparqlPrefix__PrefixNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SparqlPrefix__PrefixNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlPrefixAccess().getPrefixNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlPrefix__Group__1__Impl"


    // $ANTLR start "rule__SparqlPrefix__Group__2"
    // InternalRDFTurtle.g:1214:1: rule__SparqlPrefix__Group__2 : rule__SparqlPrefix__Group__2__Impl ;
    public final void rule__SparqlPrefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1218:1: ( rule__SparqlPrefix__Group__2__Impl )
            // InternalRDFTurtle.g:1219:2: rule__SparqlPrefix__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SparqlPrefix__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlPrefix__Group__2"


    // $ANTLR start "rule__SparqlPrefix__Group__2__Impl"
    // InternalRDFTurtle.g:1225:1: rule__SparqlPrefix__Group__2__Impl : ( ( rule__SparqlPrefix__IrirefAssignment_2 ) ) ;
    public final void rule__SparqlPrefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1229:1: ( ( ( rule__SparqlPrefix__IrirefAssignment_2 ) ) )
            // InternalRDFTurtle.g:1230:1: ( ( rule__SparqlPrefix__IrirefAssignment_2 ) )
            {
            // InternalRDFTurtle.g:1230:1: ( ( rule__SparqlPrefix__IrirefAssignment_2 ) )
            // InternalRDFTurtle.g:1231:2: ( rule__SparqlPrefix__IrirefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlPrefixAccess().getIrirefAssignment_2()); 
            }
            // InternalRDFTurtle.g:1232:2: ( rule__SparqlPrefix__IrirefAssignment_2 )
            // InternalRDFTurtle.g:1232:3: rule__SparqlPrefix__IrirefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SparqlPrefix__IrirefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlPrefixAccess().getIrirefAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlPrefix__Group__2__Impl"


    // $ANTLR start "rule__SparqlBase__Group__0"
    // InternalRDFTurtle.g:1241:1: rule__SparqlBase__Group__0 : rule__SparqlBase__Group__0__Impl rule__SparqlBase__Group__1 ;
    public final void rule__SparqlBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1245:1: ( rule__SparqlBase__Group__0__Impl rule__SparqlBase__Group__1 )
            // InternalRDFTurtle.g:1246:2: rule__SparqlBase__Group__0__Impl rule__SparqlBase__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SparqlBase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SparqlBase__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlBase__Group__0"


    // $ANTLR start "rule__SparqlBase__Group__0__Impl"
    // InternalRDFTurtle.g:1253:1: rule__SparqlBase__Group__0__Impl : ( 'BASE' ) ;
    public final void rule__SparqlBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1257:1: ( ( 'BASE' ) )
            // InternalRDFTurtle.g:1258:1: ( 'BASE' )
            {
            // InternalRDFTurtle.g:1258:1: ( 'BASE' )
            // InternalRDFTurtle.g:1259:2: 'BASE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlBaseAccess().getBASEKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlBaseAccess().getBASEKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlBase__Group__0__Impl"


    // $ANTLR start "rule__SparqlBase__Group__1"
    // InternalRDFTurtle.g:1268:1: rule__SparqlBase__Group__1 : rule__SparqlBase__Group__1__Impl ;
    public final void rule__SparqlBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1272:1: ( rule__SparqlBase__Group__1__Impl )
            // InternalRDFTurtle.g:1273:2: rule__SparqlBase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SparqlBase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlBase__Group__1"


    // $ANTLR start "rule__SparqlBase__Group__1__Impl"
    // InternalRDFTurtle.g:1279:1: rule__SparqlBase__Group__1__Impl : ( ( rule__SparqlBase__IrirefAssignment_1 ) ) ;
    public final void rule__SparqlBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1283:1: ( ( ( rule__SparqlBase__IrirefAssignment_1 ) ) )
            // InternalRDFTurtle.g:1284:1: ( ( rule__SparqlBase__IrirefAssignment_1 ) )
            {
            // InternalRDFTurtle.g:1284:1: ( ( rule__SparqlBase__IrirefAssignment_1 ) )
            // InternalRDFTurtle.g:1285:2: ( rule__SparqlBase__IrirefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlBaseAccess().getIrirefAssignment_1()); 
            }
            // InternalRDFTurtle.g:1286:2: ( rule__SparqlBase__IrirefAssignment_1 )
            // InternalRDFTurtle.g:1286:3: rule__SparqlBase__IrirefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SparqlBase__IrirefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlBaseAccess().getIrirefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlBase__Group__1__Impl"


    // $ANTLR start "rule__Triples__Group__0"
    // InternalRDFTurtle.g:1295:1: rule__Triples__Group__0 : rule__Triples__Group__0__Impl rule__Triples__Group__1 ;
    public final void rule__Triples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1299:1: ( rule__Triples__Group__0__Impl rule__Triples__Group__1 )
            // InternalRDFTurtle.g:1300:2: rule__Triples__Group__0__Impl rule__Triples__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Triples__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Triples__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triples__Group__0"


    // $ANTLR start "rule__Triples__Group__0__Impl"
    // InternalRDFTurtle.g:1307:1: rule__Triples__Group__0__Impl : ( ( rule__Triples__SubjectAssignment_0 ) ) ;
    public final void rule__Triples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1311:1: ( ( ( rule__Triples__SubjectAssignment_0 ) ) )
            // InternalRDFTurtle.g:1312:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            {
            // InternalRDFTurtle.g:1312:1: ( ( rule__Triples__SubjectAssignment_0 ) )
            // InternalRDFTurtle.g:1313:2: ( rule__Triples__SubjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesAccess().getSubjectAssignment_0()); 
            }
            // InternalRDFTurtle.g:1314:2: ( rule__Triples__SubjectAssignment_0 )
            // InternalRDFTurtle.g:1314:3: rule__Triples__SubjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Triples__SubjectAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesAccess().getSubjectAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triples__Group__0__Impl"


    // $ANTLR start "rule__Triples__Group__1"
    // InternalRDFTurtle.g:1322:1: rule__Triples__Group__1 : rule__Triples__Group__1__Impl ;
    public final void rule__Triples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1326:1: ( rule__Triples__Group__1__Impl )
            // InternalRDFTurtle.g:1327:2: rule__Triples__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Triples__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triples__Group__1"


    // $ANTLR start "rule__Triples__Group__1__Impl"
    // InternalRDFTurtle.g:1333:1: rule__Triples__Group__1__Impl : ( ( rule__Triples__PredicateObjectListAssignment_1 ) ) ;
    public final void rule__Triples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1337:1: ( ( ( rule__Triples__PredicateObjectListAssignment_1 ) ) )
            // InternalRDFTurtle.g:1338:1: ( ( rule__Triples__PredicateObjectListAssignment_1 ) )
            {
            // InternalRDFTurtle.g:1338:1: ( ( rule__Triples__PredicateObjectListAssignment_1 ) )
            // InternalRDFTurtle.g:1339:2: ( rule__Triples__PredicateObjectListAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesAccess().getPredicateObjectListAssignment_1()); 
            }
            // InternalRDFTurtle.g:1340:2: ( rule__Triples__PredicateObjectListAssignment_1 )
            // InternalRDFTurtle.g:1340:3: rule__Triples__PredicateObjectListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Triples__PredicateObjectListAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesAccess().getPredicateObjectListAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triples__Group__1__Impl"


    // $ANTLR start "rule__PredicateObject__Group__0"
    // InternalRDFTurtle.g:1349:1: rule__PredicateObject__Group__0 : rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 ;
    public final void rule__PredicateObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1353:1: ( rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1 )
            // InternalRDFTurtle.g:1354:2: rule__PredicateObject__Group__0__Impl rule__PredicateObject__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PredicateObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateObject__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObject__Group__0"


    // $ANTLR start "rule__PredicateObject__Group__0__Impl"
    // InternalRDFTurtle.g:1361:1: rule__PredicateObject__Group__0__Impl : ( ( rule__PredicateObject__VerbAssignment_0 ) ) ;
    public final void rule__PredicateObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1365:1: ( ( ( rule__PredicateObject__VerbAssignment_0 ) ) )
            // InternalRDFTurtle.g:1366:1: ( ( rule__PredicateObject__VerbAssignment_0 ) )
            {
            // InternalRDFTurtle.g:1366:1: ( ( rule__PredicateObject__VerbAssignment_0 ) )
            // InternalRDFTurtle.g:1367:2: ( rule__PredicateObject__VerbAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectAccess().getVerbAssignment_0()); 
            }
            // InternalRDFTurtle.g:1368:2: ( rule__PredicateObject__VerbAssignment_0 )
            // InternalRDFTurtle.g:1368:3: rule__PredicateObject__VerbAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObject__VerbAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectAccess().getVerbAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObject__Group__0__Impl"


    // $ANTLR start "rule__PredicateObject__Group__1"
    // InternalRDFTurtle.g:1376:1: rule__PredicateObject__Group__1 : rule__PredicateObject__Group__1__Impl ;
    public final void rule__PredicateObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1380:1: ( rule__PredicateObject__Group__1__Impl )
            // InternalRDFTurtle.g:1381:2: rule__PredicateObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObject__Group__1"


    // $ANTLR start "rule__PredicateObject__Group__1__Impl"
    // InternalRDFTurtle.g:1387:1: rule__PredicateObject__Group__1__Impl : ( ( rule__PredicateObject__ObjectListAssignment_1 ) ) ;
    public final void rule__PredicateObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1391:1: ( ( ( rule__PredicateObject__ObjectListAssignment_1 ) ) )
            // InternalRDFTurtle.g:1392:1: ( ( rule__PredicateObject__ObjectListAssignment_1 ) )
            {
            // InternalRDFTurtle.g:1392:1: ( ( rule__PredicateObject__ObjectListAssignment_1 ) )
            // InternalRDFTurtle.g:1393:2: ( rule__PredicateObject__ObjectListAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectAccess().getObjectListAssignment_1()); 
            }
            // InternalRDFTurtle.g:1394:2: ( rule__PredicateObject__ObjectListAssignment_1 )
            // InternalRDFTurtle.g:1394:3: rule__PredicateObject__ObjectListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObject__ObjectListAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectAccess().getObjectListAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObject__Group__1__Impl"


    // $ANTLR start "rule__PredicateObjectList__Group__0"
    // InternalRDFTurtle.g:1403:1: rule__PredicateObjectList__Group__0 : rule__PredicateObjectList__Group__0__Impl rule__PredicateObjectList__Group__1 ;
    public final void rule__PredicateObjectList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1407:1: ( rule__PredicateObjectList__Group__0__Impl rule__PredicateObjectList__Group__1 )
            // InternalRDFTurtle.g:1408:2: rule__PredicateObjectList__Group__0__Impl rule__PredicateObjectList__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PredicateObjectList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateObjectList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__Group__0"


    // $ANTLR start "rule__PredicateObjectList__Group__0__Impl"
    // InternalRDFTurtle.g:1415:1: rule__PredicateObjectList__Group__0__Impl : ( ( rule__PredicateObjectList__PredicateObjectsAssignment_0 ) ) ;
    public final void rule__PredicateObjectList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1419:1: ( ( ( rule__PredicateObjectList__PredicateObjectsAssignment_0 ) ) )
            // InternalRDFTurtle.g:1420:1: ( ( rule__PredicateObjectList__PredicateObjectsAssignment_0 ) )
            {
            // InternalRDFTurtle.g:1420:1: ( ( rule__PredicateObjectList__PredicateObjectsAssignment_0 ) )
            // InternalRDFTurtle.g:1421:2: ( rule__PredicateObjectList__PredicateObjectsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectListAccess().getPredicateObjectsAssignment_0()); 
            }
            // InternalRDFTurtle.g:1422:2: ( rule__PredicateObjectList__PredicateObjectsAssignment_0 )
            // InternalRDFTurtle.g:1422:3: rule__PredicateObjectList__PredicateObjectsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectList__PredicateObjectsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectListAccess().getPredicateObjectsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__Group__0__Impl"


    // $ANTLR start "rule__PredicateObjectList__Group__1"
    // InternalRDFTurtle.g:1430:1: rule__PredicateObjectList__Group__1 : rule__PredicateObjectList__Group__1__Impl rule__PredicateObjectList__Group__2 ;
    public final void rule__PredicateObjectList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1434:1: ( rule__PredicateObjectList__Group__1__Impl rule__PredicateObjectList__Group__2 )
            // InternalRDFTurtle.g:1435:2: rule__PredicateObjectList__Group__1__Impl rule__PredicateObjectList__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__PredicateObjectList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateObjectList__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__Group__1"


    // $ANTLR start "rule__PredicateObjectList__Group__1__Impl"
    // InternalRDFTurtle.g:1442:1: rule__PredicateObjectList__Group__1__Impl : ( ( rule__PredicateObjectList__Group_1__0 )* ) ;
    public final void rule__PredicateObjectList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1446:1: ( ( ( rule__PredicateObjectList__Group_1__0 )* ) )
            // InternalRDFTurtle.g:1447:1: ( ( rule__PredicateObjectList__Group_1__0 )* )
            {
            // InternalRDFTurtle.g:1447:1: ( ( rule__PredicateObjectList__Group_1__0 )* )
            // InternalRDFTurtle.g:1448:2: ( rule__PredicateObjectList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectListAccess().getGroup_1()); 
            }
            // InternalRDFTurtle.g:1449:2: ( rule__PredicateObjectList__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    int LA11_1 = input.LA(2);

                    if ( ((LA11_1>=RULE_ID && LA11_1<=RULE_IRIREF)||(LA11_1>=31 && LA11_1<=32)) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalRDFTurtle.g:1449:3: rule__PredicateObjectList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PredicateObjectList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectListAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__Group__1__Impl"


    // $ANTLR start "rule__PredicateObjectList__Group__2"
    // InternalRDFTurtle.g:1457:1: rule__PredicateObjectList__Group__2 : rule__PredicateObjectList__Group__2__Impl ;
    public final void rule__PredicateObjectList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1461:1: ( rule__PredicateObjectList__Group__2__Impl )
            // InternalRDFTurtle.g:1462:2: rule__PredicateObjectList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectList__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__Group__2"


    // $ANTLR start "rule__PredicateObjectList__Group__2__Impl"
    // InternalRDFTurtle.g:1468:1: rule__PredicateObjectList__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__PredicateObjectList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1472:1: ( ( ( ';' )? ) )
            // InternalRDFTurtle.g:1473:1: ( ( ';' )? )
            {
            // InternalRDFTurtle.g:1473:1: ( ( ';' )? )
            // InternalRDFTurtle.g:1474:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectListAccess().getSemicolonKeyword_2()); 
            }
            // InternalRDFTurtle.g:1475:2: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRDFTurtle.g:1475:3: ';'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectListAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__Group__2__Impl"


    // $ANTLR start "rule__PredicateObjectList__Group_1__0"
    // InternalRDFTurtle.g:1484:1: rule__PredicateObjectList__Group_1__0 : rule__PredicateObjectList__Group_1__0__Impl rule__PredicateObjectList__Group_1__1 ;
    public final void rule__PredicateObjectList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1488:1: ( rule__PredicateObjectList__Group_1__0__Impl rule__PredicateObjectList__Group_1__1 )
            // InternalRDFTurtle.g:1489:2: rule__PredicateObjectList__Group_1__0__Impl rule__PredicateObjectList__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__PredicateObjectList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateObjectList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__Group_1__0"


    // $ANTLR start "rule__PredicateObjectList__Group_1__0__Impl"
    // InternalRDFTurtle.g:1496:1: rule__PredicateObjectList__Group_1__0__Impl : ( ';' ) ;
    public final void rule__PredicateObjectList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1500:1: ( ( ';' ) )
            // InternalRDFTurtle.g:1501:1: ( ';' )
            {
            // InternalRDFTurtle.g:1501:1: ( ';' )
            // InternalRDFTurtle.g:1502:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectListAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectListAccess().getSemicolonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__Group_1__0__Impl"


    // $ANTLR start "rule__PredicateObjectList__Group_1__1"
    // InternalRDFTurtle.g:1511:1: rule__PredicateObjectList__Group_1__1 : rule__PredicateObjectList__Group_1__1__Impl ;
    public final void rule__PredicateObjectList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1515:1: ( rule__PredicateObjectList__Group_1__1__Impl )
            // InternalRDFTurtle.g:1516:2: rule__PredicateObjectList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__Group_1__1"


    // $ANTLR start "rule__PredicateObjectList__Group_1__1__Impl"
    // InternalRDFTurtle.g:1522:1: rule__PredicateObjectList__Group_1__1__Impl : ( ( rule__PredicateObjectList__PredicateObjectsAssignment_1_1 ) ) ;
    public final void rule__PredicateObjectList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1526:1: ( ( ( rule__PredicateObjectList__PredicateObjectsAssignment_1_1 ) ) )
            // InternalRDFTurtle.g:1527:1: ( ( rule__PredicateObjectList__PredicateObjectsAssignment_1_1 ) )
            {
            // InternalRDFTurtle.g:1527:1: ( ( rule__PredicateObjectList__PredicateObjectsAssignment_1_1 ) )
            // InternalRDFTurtle.g:1528:2: ( rule__PredicateObjectList__PredicateObjectsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectListAccess().getPredicateObjectsAssignment_1_1()); 
            }
            // InternalRDFTurtle.g:1529:2: ( rule__PredicateObjectList__PredicateObjectsAssignment_1_1 )
            // InternalRDFTurtle.g:1529:3: rule__PredicateObjectList__PredicateObjectsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectList__PredicateObjectsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectListAccess().getPredicateObjectsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__Group_1__1__Impl"


    // $ANTLR start "rule__ObjectList__Group__0"
    // InternalRDFTurtle.g:1538:1: rule__ObjectList__Group__0 : rule__ObjectList__Group__0__Impl rule__ObjectList__Group__1 ;
    public final void rule__ObjectList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1542:1: ( rule__ObjectList__Group__0__Impl rule__ObjectList__Group__1 )
            // InternalRDFTurtle.g:1543:2: rule__ObjectList__Group__0__Impl rule__ObjectList__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ObjectList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectList__Group__0"


    // $ANTLR start "rule__ObjectList__Group__0__Impl"
    // InternalRDFTurtle.g:1550:1: rule__ObjectList__Group__0__Impl : ( ( rule__ObjectList__ObjectsAssignment_0 ) ) ;
    public final void rule__ObjectList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1554:1: ( ( ( rule__ObjectList__ObjectsAssignment_0 ) ) )
            // InternalRDFTurtle.g:1555:1: ( ( rule__ObjectList__ObjectsAssignment_0 ) )
            {
            // InternalRDFTurtle.g:1555:1: ( ( rule__ObjectList__ObjectsAssignment_0 ) )
            // InternalRDFTurtle.g:1556:2: ( rule__ObjectList__ObjectsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectListAccess().getObjectsAssignment_0()); 
            }
            // InternalRDFTurtle.g:1557:2: ( rule__ObjectList__ObjectsAssignment_0 )
            // InternalRDFTurtle.g:1557:3: rule__ObjectList__ObjectsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectList__ObjectsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectListAccess().getObjectsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectList__Group__0__Impl"


    // $ANTLR start "rule__ObjectList__Group__1"
    // InternalRDFTurtle.g:1565:1: rule__ObjectList__Group__1 : rule__ObjectList__Group__1__Impl ;
    public final void rule__ObjectList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1569:1: ( rule__ObjectList__Group__1__Impl )
            // InternalRDFTurtle.g:1570:2: rule__ObjectList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectList__Group__1"


    // $ANTLR start "rule__ObjectList__Group__1__Impl"
    // InternalRDFTurtle.g:1576:1: rule__ObjectList__Group__1__Impl : ( ( rule__ObjectList__Group_1__0 )* ) ;
    public final void rule__ObjectList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1580:1: ( ( ( rule__ObjectList__Group_1__0 )* ) )
            // InternalRDFTurtle.g:1581:1: ( ( rule__ObjectList__Group_1__0 )* )
            {
            // InternalRDFTurtle.g:1581:1: ( ( rule__ObjectList__Group_1__0 )* )
            // InternalRDFTurtle.g:1582:2: ( rule__ObjectList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectListAccess().getGroup_1()); 
            }
            // InternalRDFTurtle.g:1583:2: ( rule__ObjectList__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRDFTurtle.g:1583:3: rule__ObjectList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ObjectList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectListAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectList__Group__1__Impl"


    // $ANTLR start "rule__ObjectList__Group_1__0"
    // InternalRDFTurtle.g:1592:1: rule__ObjectList__Group_1__0 : rule__ObjectList__Group_1__0__Impl rule__ObjectList__Group_1__1 ;
    public final void rule__ObjectList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1596:1: ( rule__ObjectList__Group_1__0__Impl rule__ObjectList__Group_1__1 )
            // InternalRDFTurtle.g:1597:2: rule__ObjectList__Group_1__0__Impl rule__ObjectList__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ObjectList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectList__Group_1__0"


    // $ANTLR start "rule__ObjectList__Group_1__0__Impl"
    // InternalRDFTurtle.g:1604:1: rule__ObjectList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ObjectList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1608:1: ( ( ',' ) )
            // InternalRDFTurtle.g:1609:1: ( ',' )
            {
            // InternalRDFTurtle.g:1609:1: ( ',' )
            // InternalRDFTurtle.g:1610:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectListAccess().getCommaKeyword_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectListAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectList__Group_1__0__Impl"


    // $ANTLR start "rule__ObjectList__Group_1__1"
    // InternalRDFTurtle.g:1619:1: rule__ObjectList__Group_1__1 : rule__ObjectList__Group_1__1__Impl ;
    public final void rule__ObjectList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1623:1: ( rule__ObjectList__Group_1__1__Impl )
            // InternalRDFTurtle.g:1624:2: rule__ObjectList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectList__Group_1__1"


    // $ANTLR start "rule__ObjectList__Group_1__1__Impl"
    // InternalRDFTurtle.g:1630:1: rule__ObjectList__Group_1__1__Impl : ( ( rule__ObjectList__ObjectsAssignment_1_1 ) ) ;
    public final void rule__ObjectList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1634:1: ( ( ( rule__ObjectList__ObjectsAssignment_1_1 ) ) )
            // InternalRDFTurtle.g:1635:1: ( ( rule__ObjectList__ObjectsAssignment_1_1 ) )
            {
            // InternalRDFTurtle.g:1635:1: ( ( rule__ObjectList__ObjectsAssignment_1_1 ) )
            // InternalRDFTurtle.g:1636:2: ( rule__ObjectList__ObjectsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectListAccess().getObjectsAssignment_1_1()); 
            }
            // InternalRDFTurtle.g:1637:2: ( rule__ObjectList__ObjectsAssignment_1_1 )
            // InternalRDFTurtle.g:1637:3: rule__ObjectList__ObjectsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectList__ObjectsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectListAccess().getObjectsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectList__Group_1__1__Impl"


    // $ANTLR start "rule__LanguageString__Group__0"
    // InternalRDFTurtle.g:1646:1: rule__LanguageString__Group__0 : rule__LanguageString__Group__0__Impl rule__LanguageString__Group__1 ;
    public final void rule__LanguageString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1650:1: ( rule__LanguageString__Group__0__Impl rule__LanguageString__Group__1 )
            // InternalRDFTurtle.g:1651:2: rule__LanguageString__Group__0__Impl rule__LanguageString__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__LanguageString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LanguageString__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageString__Group__0"


    // $ANTLR start "rule__LanguageString__Group__0__Impl"
    // InternalRDFTurtle.g:1658:1: rule__LanguageString__Group__0__Impl : ( ( rule__LanguageString__QutoedStringAssignment_0 ) ) ;
    public final void rule__LanguageString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1662:1: ( ( ( rule__LanguageString__QutoedStringAssignment_0 ) ) )
            // InternalRDFTurtle.g:1663:1: ( ( rule__LanguageString__QutoedStringAssignment_0 ) )
            {
            // InternalRDFTurtle.g:1663:1: ( ( rule__LanguageString__QutoedStringAssignment_0 ) )
            // InternalRDFTurtle.g:1664:2: ( rule__LanguageString__QutoedStringAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageStringAccess().getQutoedStringAssignment_0()); 
            }
            // InternalRDFTurtle.g:1665:2: ( rule__LanguageString__QutoedStringAssignment_0 )
            // InternalRDFTurtle.g:1665:3: rule__LanguageString__QutoedStringAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageString__QutoedStringAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageStringAccess().getQutoedStringAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageString__Group__0__Impl"


    // $ANTLR start "rule__LanguageString__Group__1"
    // InternalRDFTurtle.g:1673:1: rule__LanguageString__Group__1 : rule__LanguageString__Group__1__Impl ;
    public final void rule__LanguageString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1677:1: ( rule__LanguageString__Group__1__Impl )
            // InternalRDFTurtle.g:1678:2: rule__LanguageString__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageString__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageString__Group__1"


    // $ANTLR start "rule__LanguageString__Group__1__Impl"
    // InternalRDFTurtle.g:1684:1: rule__LanguageString__Group__1__Impl : ( ( rule__LanguageString__Group_1__0 )? ) ;
    public final void rule__LanguageString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1688:1: ( ( ( rule__LanguageString__Group_1__0 )? ) )
            // InternalRDFTurtle.g:1689:1: ( ( rule__LanguageString__Group_1__0 )? )
            {
            // InternalRDFTurtle.g:1689:1: ( ( rule__LanguageString__Group_1__0 )? )
            // InternalRDFTurtle.g:1690:2: ( rule__LanguageString__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageStringAccess().getGroup_1()); 
            }
            // InternalRDFTurtle.g:1691:2: ( rule__LanguageString__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRDFTurtle.g:1691:3: rule__LanguageString__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LanguageString__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageStringAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageString__Group__1__Impl"


    // $ANTLR start "rule__LanguageString__Group_1__0"
    // InternalRDFTurtle.g:1700:1: rule__LanguageString__Group_1__0 : rule__LanguageString__Group_1__0__Impl rule__LanguageString__Group_1__1 ;
    public final void rule__LanguageString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1704:1: ( rule__LanguageString__Group_1__0__Impl rule__LanguageString__Group_1__1 )
            // InternalRDFTurtle.g:1705:2: rule__LanguageString__Group_1__0__Impl rule__LanguageString__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__LanguageString__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LanguageString__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageString__Group_1__0"


    // $ANTLR start "rule__LanguageString__Group_1__0__Impl"
    // InternalRDFTurtle.g:1712:1: rule__LanguageString__Group_1__0__Impl : ( '@' ) ;
    public final void rule__LanguageString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1716:1: ( ( '@' ) )
            // InternalRDFTurtle.g:1717:1: ( '@' )
            {
            // InternalRDFTurtle.g:1717:1: ( '@' )
            // InternalRDFTurtle.g:1718:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageStringAccess().getCommercialAtKeyword_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageStringAccess().getCommercialAtKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageString__Group_1__0__Impl"


    // $ANTLR start "rule__LanguageString__Group_1__1"
    // InternalRDFTurtle.g:1727:1: rule__LanguageString__Group_1__1 : rule__LanguageString__Group_1__1__Impl ;
    public final void rule__LanguageString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1731:1: ( rule__LanguageString__Group_1__1__Impl )
            // InternalRDFTurtle.g:1732:2: rule__LanguageString__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageString__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageString__Group_1__1"


    // $ANTLR start "rule__LanguageString__Group_1__1__Impl"
    // InternalRDFTurtle.g:1738:1: rule__LanguageString__Group_1__1__Impl : ( ( rule__LanguageString__LangAssignment_1_1 ) ) ;
    public final void rule__LanguageString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1742:1: ( ( ( rule__LanguageString__LangAssignment_1_1 ) ) )
            // InternalRDFTurtle.g:1743:1: ( ( rule__LanguageString__LangAssignment_1_1 ) )
            {
            // InternalRDFTurtle.g:1743:1: ( ( rule__LanguageString__LangAssignment_1_1 ) )
            // InternalRDFTurtle.g:1744:2: ( rule__LanguageString__LangAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageStringAccess().getLangAssignment_1_1()); 
            }
            // InternalRDFTurtle.g:1745:2: ( rule__LanguageString__LangAssignment_1_1 )
            // InternalRDFTurtle.g:1745:3: rule__LanguageString__LangAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LanguageString__LangAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageStringAccess().getLangAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageString__Group_1__1__Impl"


    // $ANTLR start "rule__DatatypeString__Group__0"
    // InternalRDFTurtle.g:1754:1: rule__DatatypeString__Group__0 : rule__DatatypeString__Group__0__Impl rule__DatatypeString__Group__1 ;
    public final void rule__DatatypeString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1758:1: ( rule__DatatypeString__Group__0__Impl rule__DatatypeString__Group__1 )
            // InternalRDFTurtle.g:1759:2: rule__DatatypeString__Group__0__Impl rule__DatatypeString__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__DatatypeString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DatatypeString__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeString__Group__0"


    // $ANTLR start "rule__DatatypeString__Group__0__Impl"
    // InternalRDFTurtle.g:1766:1: rule__DatatypeString__Group__0__Impl : ( ( rule__DatatypeString__QutoedStringAssignment_0 ) ) ;
    public final void rule__DatatypeString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1770:1: ( ( ( rule__DatatypeString__QutoedStringAssignment_0 ) ) )
            // InternalRDFTurtle.g:1771:1: ( ( rule__DatatypeString__QutoedStringAssignment_0 ) )
            {
            // InternalRDFTurtle.g:1771:1: ( ( rule__DatatypeString__QutoedStringAssignment_0 ) )
            // InternalRDFTurtle.g:1772:2: ( rule__DatatypeString__QutoedStringAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeStringAccess().getQutoedStringAssignment_0()); 
            }
            // InternalRDFTurtle.g:1773:2: ( rule__DatatypeString__QutoedStringAssignment_0 )
            // InternalRDFTurtle.g:1773:3: rule__DatatypeString__QutoedStringAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeString__QutoedStringAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeStringAccess().getQutoedStringAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeString__Group__0__Impl"


    // $ANTLR start "rule__DatatypeString__Group__1"
    // InternalRDFTurtle.g:1781:1: rule__DatatypeString__Group__1 : rule__DatatypeString__Group__1__Impl rule__DatatypeString__Group__2 ;
    public final void rule__DatatypeString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1785:1: ( rule__DatatypeString__Group__1__Impl rule__DatatypeString__Group__2 )
            // InternalRDFTurtle.g:1786:2: rule__DatatypeString__Group__1__Impl rule__DatatypeString__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DatatypeString__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DatatypeString__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeString__Group__1"


    // $ANTLR start "rule__DatatypeString__Group__1__Impl"
    // InternalRDFTurtle.g:1793:1: rule__DatatypeString__Group__1__Impl : ( '^^' ) ;
    public final void rule__DatatypeString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1797:1: ( ( '^^' ) )
            // InternalRDFTurtle.g:1798:1: ( '^^' )
            {
            // InternalRDFTurtle.g:1798:1: ( '^^' )
            // InternalRDFTurtle.g:1799:2: '^^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeStringAccess().getCircumflexAccentCircumflexAccentKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeStringAccess().getCircumflexAccentCircumflexAccentKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeString__Group__1__Impl"


    // $ANTLR start "rule__DatatypeString__Group__2"
    // InternalRDFTurtle.g:1808:1: rule__DatatypeString__Group__2 : rule__DatatypeString__Group__2__Impl ;
    public final void rule__DatatypeString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1812:1: ( rule__DatatypeString__Group__2__Impl )
            // InternalRDFTurtle.g:1813:2: rule__DatatypeString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeString__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeString__Group__2"


    // $ANTLR start "rule__DatatypeString__Group__2__Impl"
    // InternalRDFTurtle.g:1819:1: rule__DatatypeString__Group__2__Impl : ( ( rule__DatatypeString__ResourceAssignment_2 ) ) ;
    public final void rule__DatatypeString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1823:1: ( ( ( rule__DatatypeString__ResourceAssignment_2 ) ) )
            // InternalRDFTurtle.g:1824:1: ( ( rule__DatatypeString__ResourceAssignment_2 ) )
            {
            // InternalRDFTurtle.g:1824:1: ( ( rule__DatatypeString__ResourceAssignment_2 ) )
            // InternalRDFTurtle.g:1825:2: ( rule__DatatypeString__ResourceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeStringAccess().getResourceAssignment_2()); 
            }
            // InternalRDFTurtle.g:1826:2: ( rule__DatatypeString__ResourceAssignment_2 )
            // InternalRDFTurtle.g:1826:3: rule__DatatypeString__ResourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeString__ResourceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeStringAccess().getResourceAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeString__Group__2__Impl"


    // $ANTLR start "rule__Blank__Group_2__0"
    // InternalRDFTurtle.g:1835:1: rule__Blank__Group_2__0 : rule__Blank__Group_2__0__Impl rule__Blank__Group_2__1 ;
    public final void rule__Blank__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1839:1: ( rule__Blank__Group_2__0__Impl rule__Blank__Group_2__1 )
            // InternalRDFTurtle.g:1840:2: rule__Blank__Group_2__0__Impl rule__Blank__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Blank__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Blank__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__Group_2__0"


    // $ANTLR start "rule__Blank__Group_2__0__Impl"
    // InternalRDFTurtle.g:1847:1: rule__Blank__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Blank__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1851:1: ( ( '[' ) )
            // InternalRDFTurtle.g:1852:1: ( '[' )
            {
            // InternalRDFTurtle.g:1852:1: ( '[' )
            // InternalRDFTurtle.g:1853:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlankAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlankAccess().getLeftSquareBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__Group_2__0__Impl"


    // $ANTLR start "rule__Blank__Group_2__1"
    // InternalRDFTurtle.g:1862:1: rule__Blank__Group_2__1 : rule__Blank__Group_2__1__Impl rule__Blank__Group_2__2 ;
    public final void rule__Blank__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1866:1: ( rule__Blank__Group_2__1__Impl rule__Blank__Group_2__2 )
            // InternalRDFTurtle.g:1867:2: rule__Blank__Group_2__1__Impl rule__Blank__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Blank__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Blank__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__Group_2__1"


    // $ANTLR start "rule__Blank__Group_2__1__Impl"
    // InternalRDFTurtle.g:1874:1: rule__Blank__Group_2__1__Impl : ( ( rule__Blank__PredicateObjectListAssignment_2_1 ) ) ;
    public final void rule__Blank__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1878:1: ( ( ( rule__Blank__PredicateObjectListAssignment_2_1 ) ) )
            // InternalRDFTurtle.g:1879:1: ( ( rule__Blank__PredicateObjectListAssignment_2_1 ) )
            {
            // InternalRDFTurtle.g:1879:1: ( ( rule__Blank__PredicateObjectListAssignment_2_1 ) )
            // InternalRDFTurtle.g:1880:2: ( rule__Blank__PredicateObjectListAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlankAccess().getPredicateObjectListAssignment_2_1()); 
            }
            // InternalRDFTurtle.g:1881:2: ( rule__Blank__PredicateObjectListAssignment_2_1 )
            // InternalRDFTurtle.g:1881:3: rule__Blank__PredicateObjectListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Blank__PredicateObjectListAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlankAccess().getPredicateObjectListAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__Group_2__1__Impl"


    // $ANTLR start "rule__Blank__Group_2__2"
    // InternalRDFTurtle.g:1889:1: rule__Blank__Group_2__2 : rule__Blank__Group_2__2__Impl ;
    public final void rule__Blank__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1893:1: ( rule__Blank__Group_2__2__Impl )
            // InternalRDFTurtle.g:1894:2: rule__Blank__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Blank__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__Group_2__2"


    // $ANTLR start "rule__Blank__Group_2__2__Impl"
    // InternalRDFTurtle.g:1900:1: rule__Blank__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Blank__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1904:1: ( ( ']' ) )
            // InternalRDFTurtle.g:1905:1: ( ']' )
            {
            // InternalRDFTurtle.g:1905:1: ( ']' )
            // InternalRDFTurtle.g:1906:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlankAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlankAccess().getRightSquareBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__Group_2__2__Impl"


    // $ANTLR start "rule__ItemList__Group__0"
    // InternalRDFTurtle.g:1916:1: rule__ItemList__Group__0 : rule__ItemList__Group__0__Impl rule__ItemList__Group__1 ;
    public final void rule__ItemList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1920:1: ( rule__ItemList__Group__0__Impl rule__ItemList__Group__1 )
            // InternalRDFTurtle.g:1921:2: rule__ItemList__Group__0__Impl rule__ItemList__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ItemList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemList__Group__0"


    // $ANTLR start "rule__ItemList__Group__0__Impl"
    // InternalRDFTurtle.g:1928:1: rule__ItemList__Group__0__Impl : ( ( rule__ItemList__ObjectsAssignment_0 ) ) ;
    public final void rule__ItemList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1932:1: ( ( ( rule__ItemList__ObjectsAssignment_0 ) ) )
            // InternalRDFTurtle.g:1933:1: ( ( rule__ItemList__ObjectsAssignment_0 ) )
            {
            // InternalRDFTurtle.g:1933:1: ( ( rule__ItemList__ObjectsAssignment_0 ) )
            // InternalRDFTurtle.g:1934:2: ( rule__ItemList__ObjectsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemListAccess().getObjectsAssignment_0()); 
            }
            // InternalRDFTurtle.g:1935:2: ( rule__ItemList__ObjectsAssignment_0 )
            // InternalRDFTurtle.g:1935:3: rule__ItemList__ObjectsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ItemList__ObjectsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemListAccess().getObjectsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemList__Group__0__Impl"


    // $ANTLR start "rule__ItemList__Group__1"
    // InternalRDFTurtle.g:1943:1: rule__ItemList__Group__1 : rule__ItemList__Group__1__Impl ;
    public final void rule__ItemList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1947:1: ( rule__ItemList__Group__1__Impl )
            // InternalRDFTurtle.g:1948:2: rule__ItemList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemList__Group__1"


    // $ANTLR start "rule__ItemList__Group__1__Impl"
    // InternalRDFTurtle.g:1954:1: rule__ItemList__Group__1__Impl : ( ( rule__ItemList__ObjectsAssignment_1 )* ) ;
    public final void rule__ItemList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1958:1: ( ( ( rule__ItemList__ObjectsAssignment_1 )* ) )
            // InternalRDFTurtle.g:1959:1: ( ( rule__ItemList__ObjectsAssignment_1 )* )
            {
            // InternalRDFTurtle.g:1959:1: ( ( rule__ItemList__ObjectsAssignment_1 )* )
            // InternalRDFTurtle.g:1960:2: ( rule__ItemList__ObjectsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemListAccess().getObjectsAssignment_1()); 
            }
            // InternalRDFTurtle.g:1961:2: ( rule__ItemList__ObjectsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_DECIMAL)||(LA15_0>=15 && LA15_0<=16)||LA15_0==26||LA15_0==28||(LA15_0>=30 && LA15_0<=31)||LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRDFTurtle.g:1961:3: rule__ItemList__ObjectsAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ItemList__ObjectsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemListAccess().getObjectsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemList__Group__1__Impl"


    // $ANTLR start "rule__Collection__Group__0"
    // InternalRDFTurtle.g:1970:1: rule__Collection__Group__0 : rule__Collection__Group__0__Impl rule__Collection__Group__1 ;
    public final void rule__Collection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1974:1: ( rule__Collection__Group__0__Impl rule__Collection__Group__1 )
            // InternalRDFTurtle.g:1975:2: rule__Collection__Group__0__Impl rule__Collection__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Collection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Collection__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__0"


    // $ANTLR start "rule__Collection__Group__0__Impl"
    // InternalRDFTurtle.g:1982:1: rule__Collection__Group__0__Impl : ( () ) ;
    public final void rule__Collection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:1986:1: ( ( () ) )
            // InternalRDFTurtle.g:1987:1: ( () )
            {
            // InternalRDFTurtle.g:1987:1: ( () )
            // InternalRDFTurtle.g:1988:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionAccess().getCollectionAction_0()); 
            }
            // InternalRDFTurtle.g:1989:2: ()
            // InternalRDFTurtle.g:1989:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionAccess().getCollectionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__0__Impl"


    // $ANTLR start "rule__Collection__Group__1"
    // InternalRDFTurtle.g:1997:1: rule__Collection__Group__1 : rule__Collection__Group__1__Impl rule__Collection__Group__2 ;
    public final void rule__Collection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2001:1: ( rule__Collection__Group__1__Impl rule__Collection__Group__2 )
            // InternalRDFTurtle.g:2002:2: rule__Collection__Group__1__Impl rule__Collection__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Collection__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Collection__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__1"


    // $ANTLR start "rule__Collection__Group__1__Impl"
    // InternalRDFTurtle.g:2009:1: rule__Collection__Group__1__Impl : ( '(' ) ;
    public final void rule__Collection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2013:1: ( ( '(' ) )
            // InternalRDFTurtle.g:2014:1: ( '(' )
            {
            // InternalRDFTurtle.g:2014:1: ( '(' )
            // InternalRDFTurtle.g:2015:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__1__Impl"


    // $ANTLR start "rule__Collection__Group__2"
    // InternalRDFTurtle.g:2024:1: rule__Collection__Group__2 : rule__Collection__Group__2__Impl rule__Collection__Group__3 ;
    public final void rule__Collection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2028:1: ( rule__Collection__Group__2__Impl rule__Collection__Group__3 )
            // InternalRDFTurtle.g:2029:2: rule__Collection__Group__2__Impl rule__Collection__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Collection__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Collection__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__2"


    // $ANTLR start "rule__Collection__Group__2__Impl"
    // InternalRDFTurtle.g:2036:1: rule__Collection__Group__2__Impl : ( ( rule__Collection__ItemListAssignment_2 )? ) ;
    public final void rule__Collection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2040:1: ( ( ( rule__Collection__ItemListAssignment_2 )? ) )
            // InternalRDFTurtle.g:2041:1: ( ( rule__Collection__ItemListAssignment_2 )? )
            {
            // InternalRDFTurtle.g:2041:1: ( ( rule__Collection__ItemListAssignment_2 )? )
            // InternalRDFTurtle.g:2042:2: ( rule__Collection__ItemListAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionAccess().getItemListAssignment_2()); 
            }
            // InternalRDFTurtle.g:2043:2: ( rule__Collection__ItemListAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_DECIMAL)||(LA16_0>=15 && LA16_0<=16)||LA16_0==26||LA16_0==28||(LA16_0>=30 && LA16_0<=31)||LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRDFTurtle.g:2043:3: rule__Collection__ItemListAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collection__ItemListAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionAccess().getItemListAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__2__Impl"


    // $ANTLR start "rule__Collection__Group__3"
    // InternalRDFTurtle.g:2051:1: rule__Collection__Group__3 : rule__Collection__Group__3__Impl ;
    public final void rule__Collection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2055:1: ( rule__Collection__Group__3__Impl )
            // InternalRDFTurtle.g:2056:2: rule__Collection__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__3"


    // $ANTLR start "rule__Collection__Group__3__Impl"
    // InternalRDFTurtle.g:2062:1: rule__Collection__Group__3__Impl : ( ')' ) ;
    public final void rule__Collection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2066:1: ( ( ')' ) )
            // InternalRDFTurtle.g:2067:1: ( ')' )
            {
            // InternalRDFTurtle.g:2067:1: ( ')' )
            // InternalRDFTurtle.g:2068:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__3__Impl"


    // $ANTLR start "rule__NodeID__Group__0"
    // InternalRDFTurtle.g:2078:1: rule__NodeID__Group__0 : rule__NodeID__Group__0__Impl rule__NodeID__Group__1 ;
    public final void rule__NodeID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2082:1: ( rule__NodeID__Group__0__Impl rule__NodeID__Group__1 )
            // InternalRDFTurtle.g:2083:2: rule__NodeID__Group__0__Impl rule__NodeID__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__NodeID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeID__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeID__Group__0"


    // $ANTLR start "rule__NodeID__Group__0__Impl"
    // InternalRDFTurtle.g:2090:1: rule__NodeID__Group__0__Impl : ( '_:' ) ;
    public final void rule__NodeID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2094:1: ( ( '_:' ) )
            // InternalRDFTurtle.g:2095:1: ( '_:' )
            {
            // InternalRDFTurtle.g:2095:1: ( '_:' )
            // InternalRDFTurtle.g:2096:2: '_:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIDAccess().get_Keyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIDAccess().get_Keyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeID__Group__0__Impl"


    // $ANTLR start "rule__NodeID__Group__1"
    // InternalRDFTurtle.g:2105:1: rule__NodeID__Group__1 : rule__NodeID__Group__1__Impl ;
    public final void rule__NodeID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2109:1: ( rule__NodeID__Group__1__Impl )
            // InternalRDFTurtle.g:2110:2: rule__NodeID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeID__Group__1"


    // $ANTLR start "rule__NodeID__Group__1__Impl"
    // InternalRDFTurtle.g:2116:1: rule__NodeID__Group__1__Impl : ( ( rule__NodeID__NameAssignment_1 ) ) ;
    public final void rule__NodeID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2120:1: ( ( ( rule__NodeID__NameAssignment_1 ) ) )
            // InternalRDFTurtle.g:2121:1: ( ( rule__NodeID__NameAssignment_1 ) )
            {
            // InternalRDFTurtle.g:2121:1: ( ( rule__NodeID__NameAssignment_1 ) )
            // InternalRDFTurtle.g:2122:2: ( rule__NodeID__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIDAccess().getNameAssignment_1()); 
            }
            // InternalRDFTurtle.g:2123:2: ( rule__NodeID__NameAssignment_1 )
            // InternalRDFTurtle.g:2123:3: rule__NodeID__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeID__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIDAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeID__Group__1__Impl"


    // $ANTLR start "rule__Qname__Group__0"
    // InternalRDFTurtle.g:2132:1: rule__Qname__Group__0 : rule__Qname__Group__0__Impl rule__Qname__Group__1 ;
    public final void rule__Qname__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2136:1: ( rule__Qname__Group__0__Impl rule__Qname__Group__1 )
            // InternalRDFTurtle.g:2137:2: rule__Qname__Group__0__Impl rule__Qname__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Qname__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qname__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__0"


    // $ANTLR start "rule__Qname__Group__0__Impl"
    // InternalRDFTurtle.g:2144:1: rule__Qname__Group__0__Impl : ( () ) ;
    public final void rule__Qname__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2148:1: ( ( () ) )
            // InternalRDFTurtle.g:2149:1: ( () )
            {
            // InternalRDFTurtle.g:2149:1: ( () )
            // InternalRDFTurtle.g:2150:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getQnameAction_0()); 
            }
            // InternalRDFTurtle.g:2151:2: ()
            // InternalRDFTurtle.g:2151:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getQnameAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__0__Impl"


    // $ANTLR start "rule__Qname__Group__1"
    // InternalRDFTurtle.g:2159:1: rule__Qname__Group__1 : rule__Qname__Group__1__Impl rule__Qname__Group__2 ;
    public final void rule__Qname__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2163:1: ( rule__Qname__Group__1__Impl rule__Qname__Group__2 )
            // InternalRDFTurtle.g:2164:2: rule__Qname__Group__1__Impl rule__Qname__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Qname__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qname__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__1"


    // $ANTLR start "rule__Qname__Group__1__Impl"
    // InternalRDFTurtle.g:2171:1: rule__Qname__Group__1__Impl : ( ( rule__Qname__PrefixNameAssignment_1 ) ) ;
    public final void rule__Qname__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2175:1: ( ( ( rule__Qname__PrefixNameAssignment_1 ) ) )
            // InternalRDFTurtle.g:2176:1: ( ( rule__Qname__PrefixNameAssignment_1 ) )
            {
            // InternalRDFTurtle.g:2176:1: ( ( rule__Qname__PrefixNameAssignment_1 ) )
            // InternalRDFTurtle.g:2177:2: ( rule__Qname__PrefixNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getPrefixNameAssignment_1()); 
            }
            // InternalRDFTurtle.g:2178:2: ( rule__Qname__PrefixNameAssignment_1 )
            // InternalRDFTurtle.g:2178:3: rule__Qname__PrefixNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Qname__PrefixNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getPrefixNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__1__Impl"


    // $ANTLR start "rule__Qname__Group__2"
    // InternalRDFTurtle.g:2186:1: rule__Qname__Group__2 : rule__Qname__Group__2__Impl ;
    public final void rule__Qname__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2190:1: ( rule__Qname__Group__2__Impl )
            // InternalRDFTurtle.g:2191:2: rule__Qname__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qname__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__2"


    // $ANTLR start "rule__Qname__Group__2__Impl"
    // InternalRDFTurtle.g:2197:1: rule__Qname__Group__2__Impl : ( ( rule__Qname__NameAssignment_2 )? ) ;
    public final void rule__Qname__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2201:1: ( ( ( rule__Qname__NameAssignment_2 )? ) )
            // InternalRDFTurtle.g:2202:1: ( ( rule__Qname__NameAssignment_2 )? )
            {
            // InternalRDFTurtle.g:2202:1: ( ( rule__Qname__NameAssignment_2 )? )
            // InternalRDFTurtle.g:2203:2: ( rule__Qname__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getNameAssignment_2()); 
            }
            // InternalRDFTurtle.g:2204:2: ( rule__Qname__NameAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred26_InternalRDFTurtle()) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalRDFTurtle.g:2204:3: rule__Qname__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Qname__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__2__Impl"


    // $ANTLR start "rule__PrefixName__Group__0"
    // InternalRDFTurtle.g:2213:1: rule__PrefixName__Group__0 : rule__PrefixName__Group__0__Impl rule__PrefixName__Group__1 ;
    public final void rule__PrefixName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2217:1: ( rule__PrefixName__Group__0__Impl rule__PrefixName__Group__1 )
            // InternalRDFTurtle.g:2218:2: rule__PrefixName__Group__0__Impl rule__PrefixName__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PrefixName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrefixName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixName__Group__0"


    // $ANTLR start "rule__PrefixName__Group__0__Impl"
    // InternalRDFTurtle.g:2225:1: rule__PrefixName__Group__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__PrefixName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2229:1: ( ( ( RULE_ID )? ) )
            // InternalRDFTurtle.g:2230:1: ( ( RULE_ID )? )
            {
            // InternalRDFTurtle.g:2230:1: ( ( RULE_ID )? )
            // InternalRDFTurtle.g:2231:2: ( RULE_ID )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixNameAccess().getIDTerminalRuleCall_0()); 
            }
            // InternalRDFTurtle.g:2232:2: ( RULE_ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRDFTurtle.g:2232:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixName__Group__0__Impl"


    // $ANTLR start "rule__PrefixName__Group__1"
    // InternalRDFTurtle.g:2240:1: rule__PrefixName__Group__1 : rule__PrefixName__Group__1__Impl ;
    public final void rule__PrefixName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2244:1: ( rule__PrefixName__Group__1__Impl )
            // InternalRDFTurtle.g:2245:2: rule__PrefixName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrefixName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixName__Group__1"


    // $ANTLR start "rule__PrefixName__Group__1__Impl"
    // InternalRDFTurtle.g:2251:1: rule__PrefixName__Group__1__Impl : ( ':' ) ;
    public final void rule__PrefixName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2255:1: ( ( ':' ) )
            // InternalRDFTurtle.g:2256:1: ( ':' )
            {
            // InternalRDFTurtle.g:2256:1: ( ':' )
            // InternalRDFTurtle.g:2257:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixNameAccess().getColonKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixNameAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixName__Group__1__Impl"


    // $ANTLR start "rule__TurtleDoc__StatementsAssignment"
    // InternalRDFTurtle.g:2267:1: rule__TurtleDoc__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__TurtleDoc__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2271:1: ( ( ruleStatement ) )
            // InternalRDFTurtle.g:2272:2: ( ruleStatement )
            {
            // InternalRDFTurtle.g:2272:2: ( ruleStatement )
            // InternalRDFTurtle.g:2273:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurtleDocAccess().getStatementsStatementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurtleDocAccess().getStatementsStatementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurtleDoc__StatementsAssignment"


    // $ANTLR start "rule__Statement__DirectiveAssignment_0_0"
    // InternalRDFTurtle.g:2282:1: rule__Statement__DirectiveAssignment_0_0 : ( ruleDirective ) ;
    public final void rule__Statement__DirectiveAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2286:1: ( ( ruleDirective ) )
            // InternalRDFTurtle.g:2287:2: ( ruleDirective )
            {
            // InternalRDFTurtle.g:2287:2: ( ruleDirective )
            // InternalRDFTurtle.g:2288:3: ruleDirective
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getDirectiveDirectiveParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDirective();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getDirectiveDirectiveParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__DirectiveAssignment_0_0"


    // $ANTLR start "rule__Statement__TriplesAssignment_0_1"
    // InternalRDFTurtle.g:2297:1: rule__Statement__TriplesAssignment_0_1 : ( ruleTriples ) ;
    public final void rule__Statement__TriplesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2301:1: ( ( ruleTriples ) )
            // InternalRDFTurtle.g:2302:2: ( ruleTriples )
            {
            // InternalRDFTurtle.g:2302:2: ( ruleTriples )
            // InternalRDFTurtle.g:2303:3: ruleTriples
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getTriplesTriplesParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTriples();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getTriplesTriplesParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__TriplesAssignment_0_1"


    // $ANTLR start "rule__Directive__PrefixAssignment_0"
    // InternalRDFTurtle.g:2312:1: rule__Directive__PrefixAssignment_0 : ( rulePrefixID ) ;
    public final void rule__Directive__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2316:1: ( ( rulePrefixID ) )
            // InternalRDFTurtle.g:2317:2: ( rulePrefixID )
            {
            // InternalRDFTurtle.g:2317:2: ( rulePrefixID )
            // InternalRDFTurtle.g:2318:3: rulePrefixID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectiveAccess().getPrefixPrefixIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectiveAccess().getPrefixPrefixIDParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__PrefixAssignment_0"


    // $ANTLR start "rule__Directive__BaseAssignment_1"
    // InternalRDFTurtle.g:2327:1: rule__Directive__BaseAssignment_1 : ( ruleBase ) ;
    public final void rule__Directive__BaseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2331:1: ( ( ruleBase ) )
            // InternalRDFTurtle.g:2332:2: ( ruleBase )
            {
            // InternalRDFTurtle.g:2332:2: ( ruleBase )
            // InternalRDFTurtle.g:2333:3: ruleBase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectiveAccess().getBaseBaseParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectiveAccess().getBaseBaseParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__BaseAssignment_1"


    // $ANTLR start "rule__Directive__SparqlPrefixAssignment_2"
    // InternalRDFTurtle.g:2342:1: rule__Directive__SparqlPrefixAssignment_2 : ( ruleSparqlPrefix ) ;
    public final void rule__Directive__SparqlPrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2346:1: ( ( ruleSparqlPrefix ) )
            // InternalRDFTurtle.g:2347:2: ( ruleSparqlPrefix )
            {
            // InternalRDFTurtle.g:2347:2: ( ruleSparqlPrefix )
            // InternalRDFTurtle.g:2348:3: ruleSparqlPrefix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectiveAccess().getSparqlPrefixSparqlPrefixParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSparqlPrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectiveAccess().getSparqlPrefixSparqlPrefixParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__SparqlPrefixAssignment_2"


    // $ANTLR start "rule__Directive__SparqlBaseAssignment_3"
    // InternalRDFTurtle.g:2357:1: rule__Directive__SparqlBaseAssignment_3 : ( ruleSparqlBase ) ;
    public final void rule__Directive__SparqlBaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2361:1: ( ( ruleSparqlBase ) )
            // InternalRDFTurtle.g:2362:2: ( ruleSparqlBase )
            {
            // InternalRDFTurtle.g:2362:2: ( ruleSparqlBase )
            // InternalRDFTurtle.g:2363:3: ruleSparqlBase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectiveAccess().getSparqlBaseSparqlBaseParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSparqlBase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectiveAccess().getSparqlBaseSparqlBaseParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__SparqlBaseAssignment_3"


    // $ANTLR start "rule__PrefixID__PrefixNameAssignment_1"
    // InternalRDFTurtle.g:2372:1: rule__PrefixID__PrefixNameAssignment_1 : ( rulePrefixName ) ;
    public final void rule__PrefixID__PrefixNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2376:1: ( ( rulePrefixName ) )
            // InternalRDFTurtle.g:2377:2: ( rulePrefixName )
            {
            // InternalRDFTurtle.g:2377:2: ( rulePrefixName )
            // InternalRDFTurtle.g:2378:3: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixIDAccess().getPrefixNamePrefixNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixIDAccess().getPrefixNamePrefixNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixID__PrefixNameAssignment_1"


    // $ANTLR start "rule__PrefixID__IrirefAssignment_2"
    // InternalRDFTurtle.g:2387:1: rule__PrefixID__IrirefAssignment_2 : ( RULE_IRIREF ) ;
    public final void rule__PrefixID__IrirefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2391:1: ( ( RULE_IRIREF ) )
            // InternalRDFTurtle.g:2392:2: ( RULE_IRIREF )
            {
            // InternalRDFTurtle.g:2392:2: ( RULE_IRIREF )
            // InternalRDFTurtle.g:2393:3: RULE_IRIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixIDAccess().getIrirefIRIREFTerminalRuleCall_2_0()); 
            }
            match(input,RULE_IRIREF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixIDAccess().getIrirefIRIREFTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixID__IrirefAssignment_2"


    // $ANTLR start "rule__Base__IrirefAssignment_1"
    // InternalRDFTurtle.g:2402:1: rule__Base__IrirefAssignment_1 : ( RULE_IRIREF ) ;
    public final void rule__Base__IrirefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2406:1: ( ( RULE_IRIREF ) )
            // InternalRDFTurtle.g:2407:2: ( RULE_IRIREF )
            {
            // InternalRDFTurtle.g:2407:2: ( RULE_IRIREF )
            // InternalRDFTurtle.g:2408:3: RULE_IRIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseAccess().getIrirefIRIREFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IRIREF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseAccess().getIrirefIRIREFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base__IrirefAssignment_1"


    // $ANTLR start "rule__SparqlPrefix__PrefixNameAssignment_1"
    // InternalRDFTurtle.g:2417:1: rule__SparqlPrefix__PrefixNameAssignment_1 : ( rulePrefixName ) ;
    public final void rule__SparqlPrefix__PrefixNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2421:1: ( ( rulePrefixName ) )
            // InternalRDFTurtle.g:2422:2: ( rulePrefixName )
            {
            // InternalRDFTurtle.g:2422:2: ( rulePrefixName )
            // InternalRDFTurtle.g:2423:3: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlPrefixAccess().getPrefixNamePrefixNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlPrefixAccess().getPrefixNamePrefixNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlPrefix__PrefixNameAssignment_1"


    // $ANTLR start "rule__SparqlPrefix__IrirefAssignment_2"
    // InternalRDFTurtle.g:2432:1: rule__SparqlPrefix__IrirefAssignment_2 : ( RULE_IRIREF ) ;
    public final void rule__SparqlPrefix__IrirefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2436:1: ( ( RULE_IRIREF ) )
            // InternalRDFTurtle.g:2437:2: ( RULE_IRIREF )
            {
            // InternalRDFTurtle.g:2437:2: ( RULE_IRIREF )
            // InternalRDFTurtle.g:2438:3: RULE_IRIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlPrefixAccess().getIrirefIRIREFTerminalRuleCall_2_0()); 
            }
            match(input,RULE_IRIREF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlPrefixAccess().getIrirefIRIREFTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlPrefix__IrirefAssignment_2"


    // $ANTLR start "rule__SparqlBase__IrirefAssignment_1"
    // InternalRDFTurtle.g:2447:1: rule__SparqlBase__IrirefAssignment_1 : ( RULE_IRIREF ) ;
    public final void rule__SparqlBase__IrirefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2451:1: ( ( RULE_IRIREF ) )
            // InternalRDFTurtle.g:2452:2: ( RULE_IRIREF )
            {
            // InternalRDFTurtle.g:2452:2: ( RULE_IRIREF )
            // InternalRDFTurtle.g:2453:3: RULE_IRIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSparqlBaseAccess().getIrirefIRIREFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IRIREF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSparqlBaseAccess().getIrirefIRIREFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SparqlBase__IrirefAssignment_1"


    // $ANTLR start "rule__Triples__SubjectAssignment_0"
    // InternalRDFTurtle.g:2462:1: rule__Triples__SubjectAssignment_0 : ( ruleSubject ) ;
    public final void rule__Triples__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2466:1: ( ( ruleSubject ) )
            // InternalRDFTurtle.g:2467:2: ( ruleSubject )
            {
            // InternalRDFTurtle.g:2467:2: ( ruleSubject )
            // InternalRDFTurtle.g:2468:3: ruleSubject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesAccess().getSubjectSubjectParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesAccess().getSubjectSubjectParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triples__SubjectAssignment_0"


    // $ANTLR start "rule__Triples__PredicateObjectListAssignment_1"
    // InternalRDFTurtle.g:2477:1: rule__Triples__PredicateObjectListAssignment_1 : ( rulePredicateObjectList ) ;
    public final void rule__Triples__PredicateObjectListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2481:1: ( ( rulePredicateObjectList ) )
            // InternalRDFTurtle.g:2482:2: ( rulePredicateObjectList )
            {
            // InternalRDFTurtle.g:2482:2: ( rulePredicateObjectList )
            // InternalRDFTurtle.g:2483:3: rulePredicateObjectList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesAccess().getPredicateObjectListPredicateObjectListParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicateObjectList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesAccess().getPredicateObjectListPredicateObjectListParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triples__PredicateObjectListAssignment_1"


    // $ANTLR start "rule__PredicateObject__VerbAssignment_0"
    // InternalRDFTurtle.g:2492:1: rule__PredicateObject__VerbAssignment_0 : ( ruleVerb ) ;
    public final void rule__PredicateObject__VerbAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2496:1: ( ( ruleVerb ) )
            // InternalRDFTurtle.g:2497:2: ( ruleVerb )
            {
            // InternalRDFTurtle.g:2497:2: ( ruleVerb )
            // InternalRDFTurtle.g:2498:3: ruleVerb
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectAccess().getVerbVerbParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVerb();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectAccess().getVerbVerbParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObject__VerbAssignment_0"


    // $ANTLR start "rule__PredicateObject__ObjectListAssignment_1"
    // InternalRDFTurtle.g:2507:1: rule__PredicateObject__ObjectListAssignment_1 : ( ruleObjectList ) ;
    public final void rule__PredicateObject__ObjectListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2511:1: ( ( ruleObjectList ) )
            // InternalRDFTurtle.g:2512:2: ( ruleObjectList )
            {
            // InternalRDFTurtle.g:2512:2: ( ruleObjectList )
            // InternalRDFTurtle.g:2513:3: ruleObjectList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectAccess().getObjectListObjectListParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObjectList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectAccess().getObjectListObjectListParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObject__ObjectListAssignment_1"


    // $ANTLR start "rule__PredicateObjectList__PredicateObjectsAssignment_0"
    // InternalRDFTurtle.g:2522:1: rule__PredicateObjectList__PredicateObjectsAssignment_0 : ( rulePredicateObject ) ;
    public final void rule__PredicateObjectList__PredicateObjectsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2526:1: ( ( rulePredicateObject ) )
            // InternalRDFTurtle.g:2527:2: ( rulePredicateObject )
            {
            // InternalRDFTurtle.g:2527:2: ( rulePredicateObject )
            // InternalRDFTurtle.g:2528:3: rulePredicateObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectListAccess().getPredicateObjectsPredicateObjectParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicateObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectListAccess().getPredicateObjectsPredicateObjectParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__PredicateObjectsAssignment_0"


    // $ANTLR start "rule__PredicateObjectList__PredicateObjectsAssignment_1_1"
    // InternalRDFTurtle.g:2537:1: rule__PredicateObjectList__PredicateObjectsAssignment_1_1 : ( rulePredicateObject ) ;
    public final void rule__PredicateObjectList__PredicateObjectsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2541:1: ( ( rulePredicateObject ) )
            // InternalRDFTurtle.g:2542:2: ( rulePredicateObject )
            {
            // InternalRDFTurtle.g:2542:2: ( rulePredicateObject )
            // InternalRDFTurtle.g:2543:3: rulePredicateObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectListAccess().getPredicateObjectsPredicateObjectParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicateObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectListAccess().getPredicateObjectsPredicateObjectParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectList__PredicateObjectsAssignment_1_1"


    // $ANTLR start "rule__ObjectList__ObjectsAssignment_0"
    // InternalRDFTurtle.g:2552:1: rule__ObjectList__ObjectsAssignment_0 : ( ruleObject ) ;
    public final void rule__ObjectList__ObjectsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2556:1: ( ( ruleObject ) )
            // InternalRDFTurtle.g:2557:2: ( ruleObject )
            {
            // InternalRDFTurtle.g:2557:2: ( ruleObject )
            // InternalRDFTurtle.g:2558:3: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectListAccess().getObjectsObjectParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectListAccess().getObjectsObjectParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectList__ObjectsAssignment_0"


    // $ANTLR start "rule__ObjectList__ObjectsAssignment_1_1"
    // InternalRDFTurtle.g:2567:1: rule__ObjectList__ObjectsAssignment_1_1 : ( ruleObject ) ;
    public final void rule__ObjectList__ObjectsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2571:1: ( ( ruleObject ) )
            // InternalRDFTurtle.g:2572:2: ( ruleObject )
            {
            // InternalRDFTurtle.g:2572:2: ( ruleObject )
            // InternalRDFTurtle.g:2573:3: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectListAccess().getObjectsObjectParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectListAccess().getObjectsObjectParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectList__ObjectsAssignment_1_1"


    // $ANTLR start "rule__Verb__PredicateAssignment_0"
    // InternalRDFTurtle.g:2582:1: rule__Verb__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Verb__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2586:1: ( ( rulePredicate ) )
            // InternalRDFTurtle.g:2587:2: ( rulePredicate )
            {
            // InternalRDFTurtle.g:2587:2: ( rulePredicate )
            // InternalRDFTurtle.g:2588:3: rulePredicate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbAccess().getPredicatePredicateParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbAccess().getPredicatePredicateParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verb__PredicateAssignment_0"


    // $ANTLR start "rule__Verb__IsAAssignment_1"
    // InternalRDFTurtle.g:2597:1: rule__Verb__IsAAssignment_1 : ( ( 'a' ) ) ;
    public final void rule__Verb__IsAAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2601:1: ( ( ( 'a' ) ) )
            // InternalRDFTurtle.g:2602:2: ( ( 'a' ) )
            {
            // InternalRDFTurtle.g:2602:2: ( ( 'a' ) )
            // InternalRDFTurtle.g:2603:3: ( 'a' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbAccess().getIsAAKeyword_1_0()); 
            }
            // InternalRDFTurtle.g:2604:3: ( 'a' )
            // InternalRDFTurtle.g:2605:4: 'a'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbAccess().getIsAAKeyword_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbAccess().getIsAAKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbAccess().getIsAAKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verb__IsAAssignment_1"


    // $ANTLR start "rule__Subject__ResourceAssignment_0"
    // InternalRDFTurtle.g:2616:1: rule__Subject__ResourceAssignment_0 : ( ruleiResource ) ;
    public final void rule__Subject__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2620:1: ( ( ruleiResource ) )
            // InternalRDFTurtle.g:2621:2: ( ruleiResource )
            {
            // InternalRDFTurtle.g:2621:2: ( ruleiResource )
            // InternalRDFTurtle.g:2622:3: ruleiResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectAccess().getResourceIResourceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleiResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectAccess().getResourceIResourceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__ResourceAssignment_0"


    // $ANTLR start "rule__Subject__BlankAssignment_1"
    // InternalRDFTurtle.g:2631:1: rule__Subject__BlankAssignment_1 : ( ruleBlank ) ;
    public final void rule__Subject__BlankAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2635:1: ( ( ruleBlank ) )
            // InternalRDFTurtle.g:2636:2: ( ruleBlank )
            {
            // InternalRDFTurtle.g:2636:2: ( ruleBlank )
            // InternalRDFTurtle.g:2637:3: ruleBlank
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectAccess().getBlankBlankParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlank();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectAccess().getBlankBlankParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__BlankAssignment_1"


    // $ANTLR start "rule__Predicate__IrAssignment"
    // InternalRDFTurtle.g:2646:1: rule__Predicate__IrAssignment : ( ruleiResource ) ;
    public final void rule__Predicate__IrAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2650:1: ( ( ruleiResource ) )
            // InternalRDFTurtle.g:2651:2: ( ruleiResource )
            {
            // InternalRDFTurtle.g:2651:2: ( ruleiResource )
            // InternalRDFTurtle.g:2652:3: ruleiResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getIrIResourceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleiResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getIrIResourceParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__IrAssignment"


    // $ANTLR start "rule__Object__ResourceAssignment_0"
    // InternalRDFTurtle.g:2661:1: rule__Object__ResourceAssignment_0 : ( ruleiResource ) ;
    public final void rule__Object__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2665:1: ( ( ruleiResource ) )
            // InternalRDFTurtle.g:2666:2: ( ruleiResource )
            {
            // InternalRDFTurtle.g:2666:2: ( ruleiResource )
            // InternalRDFTurtle.g:2667:3: ruleiResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getResourceIResourceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleiResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getResourceIResourceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ResourceAssignment_0"


    // $ANTLR start "rule__Object__BlankAssignment_1"
    // InternalRDFTurtle.g:2676:1: rule__Object__BlankAssignment_1 : ( ruleBlank ) ;
    public final void rule__Object__BlankAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2680:1: ( ( ruleBlank ) )
            // InternalRDFTurtle.g:2681:2: ( ruleBlank )
            {
            // InternalRDFTurtle.g:2681:2: ( ruleBlank )
            // InternalRDFTurtle.g:2682:3: ruleBlank
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getBlankBlankParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlank();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getBlankBlankParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__BlankAssignment_1"


    // $ANTLR start "rule__Object__LiteralAssignment_2"
    // InternalRDFTurtle.g:2691:1: rule__Object__LiteralAssignment_2 : ( ruleLiteral ) ;
    public final void rule__Object__LiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2695:1: ( ( ruleLiteral ) )
            // InternalRDFTurtle.g:2696:2: ( ruleLiteral )
            {
            // InternalRDFTurtle.g:2696:2: ( ruleLiteral )
            // InternalRDFTurtle.g:2697:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLiteralLiteralParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getLiteralLiteralParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__LiteralAssignment_2"


    // $ANTLR start "rule__LanguageString__QutoedStringAssignment_0"
    // InternalRDFTurtle.g:2706:1: rule__LanguageString__QutoedStringAssignment_0 : ( ruleQuotedString ) ;
    public final void rule__LanguageString__QutoedStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2710:1: ( ( ruleQuotedString ) )
            // InternalRDFTurtle.g:2711:2: ( ruleQuotedString )
            {
            // InternalRDFTurtle.g:2711:2: ( ruleQuotedString )
            // InternalRDFTurtle.g:2712:3: ruleQuotedString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageStringAccess().getQutoedStringQuotedStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQuotedString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageStringAccess().getQutoedStringQuotedStringParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageString__QutoedStringAssignment_0"


    // $ANTLR start "rule__LanguageString__LangAssignment_1_1"
    // InternalRDFTurtle.g:2721:1: rule__LanguageString__LangAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__LanguageString__LangAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2725:1: ( ( RULE_ID ) )
            // InternalRDFTurtle.g:2726:2: ( RULE_ID )
            {
            // InternalRDFTurtle.g:2726:2: ( RULE_ID )
            // InternalRDFTurtle.g:2727:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageStringAccess().getLangIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageStringAccess().getLangIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageString__LangAssignment_1_1"


    // $ANTLR start "rule__Literal__LanguageStringAssignment_0"
    // InternalRDFTurtle.g:2736:1: rule__Literal__LanguageStringAssignment_0 : ( ruleLanguageString ) ;
    public final void rule__Literal__LanguageStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2740:1: ( ( ruleLanguageString ) )
            // InternalRDFTurtle.g:2741:2: ( ruleLanguageString )
            {
            // InternalRDFTurtle.g:2741:2: ( ruleLanguageString )
            // InternalRDFTurtle.g:2742:3: ruleLanguageString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLanguageStringLanguageStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLanguageString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLanguageStringLanguageStringParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__LanguageStringAssignment_0"


    // $ANTLR start "rule__Literal__DatatypeStringAssignment_1"
    // InternalRDFTurtle.g:2751:1: rule__Literal__DatatypeStringAssignment_1 : ( ruleDatatypeString ) ;
    public final void rule__Literal__DatatypeStringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2755:1: ( ( ruleDatatypeString ) )
            // InternalRDFTurtle.g:2756:2: ( ruleDatatypeString )
            {
            // InternalRDFTurtle.g:2756:2: ( ruleDatatypeString )
            // InternalRDFTurtle.g:2757:3: ruleDatatypeString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getDatatypeStringDatatypeStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDatatypeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getDatatypeStringDatatypeStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__DatatypeStringAssignment_1"


    // $ANTLR start "rule__Literal__DwordAssignment_2"
    // InternalRDFTurtle.g:2766:1: rule__Literal__DwordAssignment_2 : ( RULE_INT ) ;
    public final void rule__Literal__DwordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2770:1: ( ( RULE_INT ) )
            // InternalRDFTurtle.g:2771:2: ( RULE_INT )
            {
            // InternalRDFTurtle.g:2771:2: ( RULE_INT )
            // InternalRDFTurtle.g:2772:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getDwordINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getDwordINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__DwordAssignment_2"


    // $ANTLR start "rule__Literal__RealAssignment_3"
    // InternalRDFTurtle.g:2781:1: rule__Literal__RealAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Literal__RealAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2785:1: ( ( RULE_DOUBLE ) )
            // InternalRDFTurtle.g:2786:2: ( RULE_DOUBLE )
            {
            // InternalRDFTurtle.g:2786:2: ( RULE_DOUBLE )
            // InternalRDFTurtle.g:2787:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getRealDOUBLETerminalRuleCall_3_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getRealDOUBLETerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__RealAssignment_3"


    // $ANTLR start "rule__Literal__DecimalAssignment_4"
    // InternalRDFTurtle.g:2796:1: rule__Literal__DecimalAssignment_4 : ( RULE_DECIMAL ) ;
    public final void rule__Literal__DecimalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2800:1: ( ( RULE_DECIMAL ) )
            // InternalRDFTurtle.g:2801:2: ( RULE_DECIMAL )
            {
            // InternalRDFTurtle.g:2801:2: ( RULE_DECIMAL )
            // InternalRDFTurtle.g:2802:3: RULE_DECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getDecimalDECIMALTerminalRuleCall_4_0()); 
            }
            match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getDecimalDECIMALTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__DecimalAssignment_4"


    // $ANTLR start "rule__Literal__BoolAssignment_5"
    // InternalRDFTurtle.g:2811:1: rule__Literal__BoolAssignment_5 : ( ruleBoolean ) ;
    public final void rule__Literal__BoolAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2815:1: ( ( ruleBoolean ) )
            // InternalRDFTurtle.g:2816:2: ( ruleBoolean )
            {
            // InternalRDFTurtle.g:2816:2: ( ruleBoolean )
            // InternalRDFTurtle.g:2817:3: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getBoolBooleanParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getBoolBooleanParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__BoolAssignment_5"


    // $ANTLR start "rule__DatatypeString__QutoedStringAssignment_0"
    // InternalRDFTurtle.g:2826:1: rule__DatatypeString__QutoedStringAssignment_0 : ( ruleQuotedString ) ;
    public final void rule__DatatypeString__QutoedStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2830:1: ( ( ruleQuotedString ) )
            // InternalRDFTurtle.g:2831:2: ( ruleQuotedString )
            {
            // InternalRDFTurtle.g:2831:2: ( ruleQuotedString )
            // InternalRDFTurtle.g:2832:3: ruleQuotedString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeStringAccess().getQutoedStringQuotedStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQuotedString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeStringAccess().getQutoedStringQuotedStringParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeString__QutoedStringAssignment_0"


    // $ANTLR start "rule__DatatypeString__ResourceAssignment_2"
    // InternalRDFTurtle.g:2841:1: rule__DatatypeString__ResourceAssignment_2 : ( ruleiResource ) ;
    public final void rule__DatatypeString__ResourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2845:1: ( ( ruleiResource ) )
            // InternalRDFTurtle.g:2846:2: ( ruleiResource )
            {
            // InternalRDFTurtle.g:2846:2: ( ruleiResource )
            // InternalRDFTurtle.g:2847:3: ruleiResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeStringAccess().getResourceIResourceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleiResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeStringAccess().getResourceIResourceParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeString__ResourceAssignment_2"


    // $ANTLR start "rule__Blank__NodeIDAssignment_0"
    // InternalRDFTurtle.g:2856:1: rule__Blank__NodeIDAssignment_0 : ( ruleNodeID ) ;
    public final void rule__Blank__NodeIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2860:1: ( ( ruleNodeID ) )
            // InternalRDFTurtle.g:2861:2: ( ruleNodeID )
            {
            // InternalRDFTurtle.g:2861:2: ( ruleNodeID )
            // InternalRDFTurtle.g:2862:3: ruleNodeID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlankAccess().getNodeIDNodeIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodeID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlankAccess().getNodeIDNodeIDParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__NodeIDAssignment_0"


    // $ANTLR start "rule__Blank__IsSquareAssignment_1"
    // InternalRDFTurtle.g:2871:1: rule__Blank__IsSquareAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__Blank__IsSquareAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2875:1: ( ( ( '[]' ) ) )
            // InternalRDFTurtle.g:2876:2: ( ( '[]' ) )
            {
            // InternalRDFTurtle.g:2876:2: ( ( '[]' ) )
            // InternalRDFTurtle.g:2877:3: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlankAccess().getIsSquareLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            }
            // InternalRDFTurtle.g:2878:3: ( '[]' )
            // InternalRDFTurtle.g:2879:4: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlankAccess().getIsSquareLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlankAccess().getIsSquareLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlankAccess().getIsSquareLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__IsSquareAssignment_1"


    // $ANTLR start "rule__Blank__PredicateObjectListAssignment_2_1"
    // InternalRDFTurtle.g:2890:1: rule__Blank__PredicateObjectListAssignment_2_1 : ( rulePredicateObjectList ) ;
    public final void rule__Blank__PredicateObjectListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2894:1: ( ( rulePredicateObjectList ) )
            // InternalRDFTurtle.g:2895:2: ( rulePredicateObjectList )
            {
            // InternalRDFTurtle.g:2895:2: ( rulePredicateObjectList )
            // InternalRDFTurtle.g:2896:3: rulePredicateObjectList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlankAccess().getPredicateObjectListPredicateObjectListParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicateObjectList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlankAccess().getPredicateObjectListPredicateObjectListParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__PredicateObjectListAssignment_2_1"


    // $ANTLR start "rule__Blank__CollectionAssignment_3"
    // InternalRDFTurtle.g:2905:1: rule__Blank__CollectionAssignment_3 : ( ruleCollection ) ;
    public final void rule__Blank__CollectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2909:1: ( ( ruleCollection ) )
            // InternalRDFTurtle.g:2910:2: ( ruleCollection )
            {
            // InternalRDFTurtle.g:2910:2: ( ruleCollection )
            // InternalRDFTurtle.g:2911:3: ruleCollection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlankAccess().getCollectionCollectionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCollection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlankAccess().getCollectionCollectionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blank__CollectionAssignment_3"


    // $ANTLR start "rule__ItemList__ObjectsAssignment_0"
    // InternalRDFTurtle.g:2920:1: rule__ItemList__ObjectsAssignment_0 : ( ruleObject ) ;
    public final void rule__ItemList__ObjectsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2924:1: ( ( ruleObject ) )
            // InternalRDFTurtle.g:2925:2: ( ruleObject )
            {
            // InternalRDFTurtle.g:2925:2: ( ruleObject )
            // InternalRDFTurtle.g:2926:3: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemListAccess().getObjectsObjectParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemListAccess().getObjectsObjectParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemList__ObjectsAssignment_0"


    // $ANTLR start "rule__ItemList__ObjectsAssignment_1"
    // InternalRDFTurtle.g:2935:1: rule__ItemList__ObjectsAssignment_1 : ( ruleObject ) ;
    public final void rule__ItemList__ObjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2939:1: ( ( ruleObject ) )
            // InternalRDFTurtle.g:2940:2: ( ruleObject )
            {
            // InternalRDFTurtle.g:2940:2: ( ruleObject )
            // InternalRDFTurtle.g:2941:3: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemListAccess().getObjectsObjectParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemListAccess().getObjectsObjectParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemList__ObjectsAssignment_1"


    // $ANTLR start "rule__Collection__ItemListAssignment_2"
    // InternalRDFTurtle.g:2950:1: rule__Collection__ItemListAssignment_2 : ( ruleItemList ) ;
    public final void rule__Collection__ItemListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2954:1: ( ( ruleItemList ) )
            // InternalRDFTurtle.g:2955:2: ( ruleItemList )
            {
            // InternalRDFTurtle.g:2955:2: ( ruleItemList )
            // InternalRDFTurtle.g:2956:3: ruleItemList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionAccess().getItemListItemListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleItemList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionAccess().getItemListItemListParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__ItemListAssignment_2"


    // $ANTLR start "rule__IResource__IriRefAssignment_0"
    // InternalRDFTurtle.g:2965:1: rule__IResource__IriRefAssignment_0 : ( RULE_IRIREF ) ;
    public final void rule__IResource__IriRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2969:1: ( ( RULE_IRIREF ) )
            // InternalRDFTurtle.g:2970:2: ( RULE_IRIREF )
            {
            // InternalRDFTurtle.g:2970:2: ( RULE_IRIREF )
            // InternalRDFTurtle.g:2971:3: RULE_IRIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIResourceAccess().getIriRefIRIREFTerminalRuleCall_0_0()); 
            }
            match(input,RULE_IRIREF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIResourceAccess().getIriRefIRIREFTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IResource__IriRefAssignment_0"


    // $ANTLR start "rule__IResource__QnameAssignment_1"
    // InternalRDFTurtle.g:2980:1: rule__IResource__QnameAssignment_1 : ( ruleQname ) ;
    public final void rule__IResource__QnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2984:1: ( ( ruleQname ) )
            // InternalRDFTurtle.g:2985:2: ( ruleQname )
            {
            // InternalRDFTurtle.g:2985:2: ( ruleQname )
            // InternalRDFTurtle.g:2986:3: ruleQname
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIResourceAccess().getQnameQnameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQname();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIResourceAccess().getQnameQnameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IResource__QnameAssignment_1"


    // $ANTLR start "rule__NodeID__NameAssignment_1"
    // InternalRDFTurtle.g:2995:1: rule__NodeID__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NodeID__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:2999:1: ( ( RULE_ID ) )
            // InternalRDFTurtle.g:3000:2: ( RULE_ID )
            {
            // InternalRDFTurtle.g:3000:2: ( RULE_ID )
            // InternalRDFTurtle.g:3001:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIDAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIDAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeID__NameAssignment_1"


    // $ANTLR start "rule__Qname__PrefixNameAssignment_1"
    // InternalRDFTurtle.g:3010:1: rule__Qname__PrefixNameAssignment_1 : ( rulePrefixName ) ;
    public final void rule__Qname__PrefixNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:3014:1: ( ( rulePrefixName ) )
            // InternalRDFTurtle.g:3015:2: ( rulePrefixName )
            {
            // InternalRDFTurtle.g:3015:2: ( rulePrefixName )
            // InternalRDFTurtle.g:3016:3: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getPrefixNamePrefixNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getPrefixNamePrefixNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__PrefixNameAssignment_1"


    // $ANTLR start "rule__Qname__NameAssignment_2"
    // InternalRDFTurtle.g:3025:1: rule__Qname__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Qname__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRDFTurtle.g:3029:1: ( ( RULE_ID ) )
            // InternalRDFTurtle.g:3030:2: ( RULE_ID )
            {
            // InternalRDFTurtle.g:3030:2: ( RULE_ID )
            // InternalRDFTurtle.g:3031:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__NameAssignment_2"

    // $ANTLR start synpred26_InternalRDFTurtle
    public final void synpred26_InternalRDFTurtle_fragment() throws RecognitionException {   
        // InternalRDFTurtle.g:2204:3: ( rule__Qname__NameAssignment_2 )
        // InternalRDFTurtle.g:2204:3: rule__Qname__NameAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__Qname__NameAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalRDFTurtle

    // Delegated rules

    public final boolean synpred26_InternalRDFTurtle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalRDFTurtle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000002D43C0062L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000180000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000002D43D83F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000002D43D83F2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000002D43C0060L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000002F43D83F0L});

}