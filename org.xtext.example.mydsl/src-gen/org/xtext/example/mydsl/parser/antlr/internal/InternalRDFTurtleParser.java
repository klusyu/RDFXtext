package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.RDFTurtleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRDFTurtleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IRIREF", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_DECIMAL", "RULE_STRING", "RULE_EXPONENT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'@prefix'", "'@base'", "'PREFIX'", "'BASE'", "';'", "','", "'a'", "'@'", "'^^'", "'true'", "'false'", "'[]'", "'['", "']'", "'('", "')'", "'_:'", "':'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int RULE_IRIREF=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_DECIMAL=8;
    public static final int RULE_EXPONENT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

        public InternalRDFTurtleParser(TokenStream input, RDFTurtleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TurtleDoc";
       	}

       	@Override
       	protected RDFTurtleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTurtleDoc"
    // InternalRDFTurtle.g:64:1: entryRuleTurtleDoc returns [EObject current=null] : iv_ruleTurtleDoc= ruleTurtleDoc EOF ;
    public final EObject entryRuleTurtleDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurtleDoc = null;


        try {
            // InternalRDFTurtle.g:64:50: (iv_ruleTurtleDoc= ruleTurtleDoc EOF )
            // InternalRDFTurtle.g:65:2: iv_ruleTurtleDoc= ruleTurtleDoc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTurtleDocRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTurtleDoc=ruleTurtleDoc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTurtleDoc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurtleDoc"


    // $ANTLR start "ruleTurtleDoc"
    // InternalRDFTurtle.g:71:1: ruleTurtleDoc returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleTurtleDoc() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalRDFTurtle.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalRDFTurtle.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_IRIREF && LA1_0<=RULE_ID)||(LA1_0>=16 && LA1_0<=19)||(LA1_0>=27 && LA1_0<=28)||LA1_0==30||(LA1_0>=32 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRDFTurtle.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalRDFTurtle.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalRDFTurtle.g:80:4: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTurtleDocAccess().getStatementsStatementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getTurtleDocRule());
            	      				}
            	      				add(
            	      					current,
            	      					"statements",
            	      					lv_statements_0_0,
            	      					"org.xtext.example.mydsl.RDFTurtle.Statement");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurtleDoc"


    // $ANTLR start "entryRuleStatement"
    // InternalRDFTurtle.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRDFTurtle.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRDFTurtle.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRDFTurtle.g:107:1: ruleStatement returns [EObject current=null] : ( ( ( (lv_directive_0_0= ruleDirective ) ) | ( (lv_triples_1_0= ruleTriples ) ) ) otherlv_2= '.' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_directive_0_0 = null;

        EObject lv_triples_1_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:113:2: ( ( ( ( (lv_directive_0_0= ruleDirective ) ) | ( (lv_triples_1_0= ruleTriples ) ) ) otherlv_2= '.' ) )
            // InternalRDFTurtle.g:114:2: ( ( ( (lv_directive_0_0= ruleDirective ) ) | ( (lv_triples_1_0= ruleTriples ) ) ) otherlv_2= '.' )
            {
            // InternalRDFTurtle.g:114:2: ( ( ( (lv_directive_0_0= ruleDirective ) ) | ( (lv_triples_1_0= ruleTriples ) ) ) otherlv_2= '.' )
            // InternalRDFTurtle.g:115:3: ( ( (lv_directive_0_0= ruleDirective ) ) | ( (lv_triples_1_0= ruleTriples ) ) ) otherlv_2= '.'
            {
            // InternalRDFTurtle.g:115:3: ( ( (lv_directive_0_0= ruleDirective ) ) | ( (lv_triples_1_0= ruleTriples ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=16 && LA2_0<=19)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_IRIREF && LA2_0<=RULE_ID)||(LA2_0>=27 && LA2_0<=28)||LA2_0==30||(LA2_0>=32 && LA2_0<=33)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRDFTurtle.g:116:4: ( (lv_directive_0_0= ruleDirective ) )
                    {
                    // InternalRDFTurtle.g:116:4: ( (lv_directive_0_0= ruleDirective ) )
                    // InternalRDFTurtle.g:117:5: (lv_directive_0_0= ruleDirective )
                    {
                    // InternalRDFTurtle.g:117:5: (lv_directive_0_0= ruleDirective )
                    // InternalRDFTurtle.g:118:6: lv_directive_0_0= ruleDirective
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getDirectiveDirectiveParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_directive_0_0=ruleDirective();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"directive",
                      							lv_directive_0_0,
                      							"org.xtext.example.mydsl.RDFTurtle.Directive");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:136:4: ( (lv_triples_1_0= ruleTriples ) )
                    {
                    // InternalRDFTurtle.g:136:4: ( (lv_triples_1_0= ruleTriples ) )
                    // InternalRDFTurtle.g:137:5: (lv_triples_1_0= ruleTriples )
                    {
                    // InternalRDFTurtle.g:137:5: (lv_triples_1_0= ruleTriples )
                    // InternalRDFTurtle.g:138:6: lv_triples_1_0= ruleTriples
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getTriplesTriplesParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_triples_1_0=ruleTriples();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"triples",
                      							lv_triples_1_0,
                      							"org.xtext.example.mydsl.RDFTurtle.Triples");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getFullStopKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDirective"
    // InternalRDFTurtle.g:164:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalRDFTurtle.g:164:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalRDFTurtle.g:165:2: iv_ruleDirective= ruleDirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectiveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDirective=ruleDirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirective; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // InternalRDFTurtle.g:171:1: ruleDirective returns [EObject current=null] : ( ( (lv_prefix_0_0= rulePrefixID ) ) | ( (lv_base_1_0= ruleBase ) ) | ( (lv_sparqlPrefix_2_0= ruleSparqlPrefix ) ) | ( (lv_sparqlBase_3_0= ruleSparqlBase ) ) ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        EObject lv_prefix_0_0 = null;

        EObject lv_base_1_0 = null;

        EObject lv_sparqlPrefix_2_0 = null;

        EObject lv_sparqlBase_3_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:177:2: ( ( ( (lv_prefix_0_0= rulePrefixID ) ) | ( (lv_base_1_0= ruleBase ) ) | ( (lv_sparqlPrefix_2_0= ruleSparqlPrefix ) ) | ( (lv_sparqlBase_3_0= ruleSparqlBase ) ) ) )
            // InternalRDFTurtle.g:178:2: ( ( (lv_prefix_0_0= rulePrefixID ) ) | ( (lv_base_1_0= ruleBase ) ) | ( (lv_sparqlPrefix_2_0= ruleSparqlPrefix ) ) | ( (lv_sparqlBase_3_0= ruleSparqlBase ) ) )
            {
            // InternalRDFTurtle.g:178:2: ( ( (lv_prefix_0_0= rulePrefixID ) ) | ( (lv_base_1_0= ruleBase ) ) | ( (lv_sparqlPrefix_2_0= ruleSparqlPrefix ) ) | ( (lv_sparqlBase_3_0= ruleSparqlBase ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRDFTurtle.g:179:3: ( (lv_prefix_0_0= rulePrefixID ) )
                    {
                    // InternalRDFTurtle.g:179:3: ( (lv_prefix_0_0= rulePrefixID ) )
                    // InternalRDFTurtle.g:180:4: (lv_prefix_0_0= rulePrefixID )
                    {
                    // InternalRDFTurtle.g:180:4: (lv_prefix_0_0= rulePrefixID )
                    // InternalRDFTurtle.g:181:5: lv_prefix_0_0= rulePrefixID
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDirectiveAccess().getPrefixPrefixIDParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_prefix_0_0=rulePrefixID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDirectiveRule());
                      					}
                      					set(
                      						current,
                      						"prefix",
                      						lv_prefix_0_0,
                      						"org.xtext.example.mydsl.RDFTurtle.PrefixID");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:199:3: ( (lv_base_1_0= ruleBase ) )
                    {
                    // InternalRDFTurtle.g:199:3: ( (lv_base_1_0= ruleBase ) )
                    // InternalRDFTurtle.g:200:4: (lv_base_1_0= ruleBase )
                    {
                    // InternalRDFTurtle.g:200:4: (lv_base_1_0= ruleBase )
                    // InternalRDFTurtle.g:201:5: lv_base_1_0= ruleBase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDirectiveAccess().getBaseBaseParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_base_1_0=ruleBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDirectiveRule());
                      					}
                      					set(
                      						current,
                      						"base",
                      						lv_base_1_0,
                      						"org.xtext.example.mydsl.RDFTurtle.Base");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRDFTurtle.g:219:3: ( (lv_sparqlPrefix_2_0= ruleSparqlPrefix ) )
                    {
                    // InternalRDFTurtle.g:219:3: ( (lv_sparqlPrefix_2_0= ruleSparqlPrefix ) )
                    // InternalRDFTurtle.g:220:4: (lv_sparqlPrefix_2_0= ruleSparqlPrefix )
                    {
                    // InternalRDFTurtle.g:220:4: (lv_sparqlPrefix_2_0= ruleSparqlPrefix )
                    // InternalRDFTurtle.g:221:5: lv_sparqlPrefix_2_0= ruleSparqlPrefix
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDirectiveAccess().getSparqlPrefixSparqlPrefixParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_sparqlPrefix_2_0=ruleSparqlPrefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDirectiveRule());
                      					}
                      					set(
                      						current,
                      						"sparqlPrefix",
                      						lv_sparqlPrefix_2_0,
                      						"org.xtext.example.mydsl.RDFTurtle.SparqlPrefix");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRDFTurtle.g:239:3: ( (lv_sparqlBase_3_0= ruleSparqlBase ) )
                    {
                    // InternalRDFTurtle.g:239:3: ( (lv_sparqlBase_3_0= ruleSparqlBase ) )
                    // InternalRDFTurtle.g:240:4: (lv_sparqlBase_3_0= ruleSparqlBase )
                    {
                    // InternalRDFTurtle.g:240:4: (lv_sparqlBase_3_0= ruleSparqlBase )
                    // InternalRDFTurtle.g:241:5: lv_sparqlBase_3_0= ruleSparqlBase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDirectiveAccess().getSparqlBaseSparqlBaseParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_sparqlBase_3_0=ruleSparqlBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDirectiveRule());
                      					}
                      					set(
                      						current,
                      						"sparqlBase",
                      						lv_sparqlBase_3_0,
                      						"org.xtext.example.mydsl.RDFTurtle.SparqlBase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRulePrefixID"
    // InternalRDFTurtle.g:262:1: entryRulePrefixID returns [EObject current=null] : iv_rulePrefixID= rulePrefixID EOF ;
    public final EObject entryRulePrefixID() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixID = null;


        try {
            // InternalRDFTurtle.g:262:49: (iv_rulePrefixID= rulePrefixID EOF )
            // InternalRDFTurtle.g:263:2: iv_rulePrefixID= rulePrefixID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixID=rulePrefixID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixID; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixID"


    // $ANTLR start "rulePrefixID"
    // InternalRDFTurtle.g:269:1: rulePrefixID returns [EObject current=null] : (otherlv_0= '@prefix' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_iriref_2_0= RULE_IRIREF ) ) ) ;
    public final EObject rulePrefixID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_iriref_2_0=null;
        AntlrDatatypeRuleToken lv_prefixName_1_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:275:2: ( (otherlv_0= '@prefix' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_iriref_2_0= RULE_IRIREF ) ) ) )
            // InternalRDFTurtle.g:276:2: (otherlv_0= '@prefix' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_iriref_2_0= RULE_IRIREF ) ) )
            {
            // InternalRDFTurtle.g:276:2: (otherlv_0= '@prefix' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_iriref_2_0= RULE_IRIREF ) ) )
            // InternalRDFTurtle.g:277:3: otherlv_0= '@prefix' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_iriref_2_0= RULE_IRIREF ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrefixIDAccess().getPrefixKeyword_0());
              		
            }
            // InternalRDFTurtle.g:281:3: ( (lv_prefixName_1_0= rulePrefixName ) )
            // InternalRDFTurtle.g:282:4: (lv_prefixName_1_0= rulePrefixName )
            {
            // InternalRDFTurtle.g:282:4: (lv_prefixName_1_0= rulePrefixName )
            // InternalRDFTurtle.g:283:5: lv_prefixName_1_0= rulePrefixName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrefixIDAccess().getPrefixNamePrefixNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_prefixName_1_0=rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrefixIDRule());
              					}
              					set(
              						current,
              						"prefixName",
              						lv_prefixName_1_0,
              						"org.xtext.example.mydsl.RDFTurtle.PrefixName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRDFTurtle.g:300:3: ( (lv_iriref_2_0= RULE_IRIREF ) )
            // InternalRDFTurtle.g:301:4: (lv_iriref_2_0= RULE_IRIREF )
            {
            // InternalRDFTurtle.g:301:4: (lv_iriref_2_0= RULE_IRIREF )
            // InternalRDFTurtle.g:302:5: lv_iriref_2_0= RULE_IRIREF
            {
            lv_iriref_2_0=(Token)match(input,RULE_IRIREF,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_iriref_2_0, grammarAccess.getPrefixIDAccess().getIrirefIRIREFTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrefixIDRule());
              					}
              					setWithLastConsumed(
              						current,
              						"iriref",
              						lv_iriref_2_0,
              						"org.xtext.example.mydsl.RDFTurtle.IRIREF");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixID"


    // $ANTLR start "entryRuleBase"
    // InternalRDFTurtle.g:322:1: entryRuleBase returns [EObject current=null] : iv_ruleBase= ruleBase EOF ;
    public final EObject entryRuleBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBase = null;


        try {
            // InternalRDFTurtle.g:322:45: (iv_ruleBase= ruleBase EOF )
            // InternalRDFTurtle.g:323:2: iv_ruleBase= ruleBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBase=ruleBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBase"


    // $ANTLR start "ruleBase"
    // InternalRDFTurtle.g:329:1: ruleBase returns [EObject current=null] : (otherlv_0= '@base' ( (lv_iriref_1_0= RULE_IRIREF ) ) ) ;
    public final EObject ruleBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_iriref_1_0=null;


        	enterRule();

        try {
            // InternalRDFTurtle.g:335:2: ( (otherlv_0= '@base' ( (lv_iriref_1_0= RULE_IRIREF ) ) ) )
            // InternalRDFTurtle.g:336:2: (otherlv_0= '@base' ( (lv_iriref_1_0= RULE_IRIREF ) ) )
            {
            // InternalRDFTurtle.g:336:2: (otherlv_0= '@base' ( (lv_iriref_1_0= RULE_IRIREF ) ) )
            // InternalRDFTurtle.g:337:3: otherlv_0= '@base' ( (lv_iriref_1_0= RULE_IRIREF ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBaseAccess().getBaseKeyword_0());
              		
            }
            // InternalRDFTurtle.g:341:3: ( (lv_iriref_1_0= RULE_IRIREF ) )
            // InternalRDFTurtle.g:342:4: (lv_iriref_1_0= RULE_IRIREF )
            {
            // InternalRDFTurtle.g:342:4: (lv_iriref_1_0= RULE_IRIREF )
            // InternalRDFTurtle.g:343:5: lv_iriref_1_0= RULE_IRIREF
            {
            lv_iriref_1_0=(Token)match(input,RULE_IRIREF,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_iriref_1_0, grammarAccess.getBaseAccess().getIrirefIRIREFTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBaseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"iriref",
              						lv_iriref_1_0,
              						"org.xtext.example.mydsl.RDFTurtle.IRIREF");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBase"


    // $ANTLR start "entryRuleSparqlPrefix"
    // InternalRDFTurtle.g:363:1: entryRuleSparqlPrefix returns [EObject current=null] : iv_ruleSparqlPrefix= ruleSparqlPrefix EOF ;
    public final EObject entryRuleSparqlPrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSparqlPrefix = null;


        try {
            // InternalRDFTurtle.g:363:53: (iv_ruleSparqlPrefix= ruleSparqlPrefix EOF )
            // InternalRDFTurtle.g:364:2: iv_ruleSparqlPrefix= ruleSparqlPrefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSparqlPrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSparqlPrefix=ruleSparqlPrefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSparqlPrefix; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSparqlPrefix"


    // $ANTLR start "ruleSparqlPrefix"
    // InternalRDFTurtle.g:370:1: ruleSparqlPrefix returns [EObject current=null] : (otherlv_0= 'PREFIX' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_iriref_2_0= RULE_IRIREF ) ) ) ;
    public final EObject ruleSparqlPrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_iriref_2_0=null;
        AntlrDatatypeRuleToken lv_prefixName_1_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:376:2: ( (otherlv_0= 'PREFIX' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_iriref_2_0= RULE_IRIREF ) ) ) )
            // InternalRDFTurtle.g:377:2: (otherlv_0= 'PREFIX' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_iriref_2_0= RULE_IRIREF ) ) )
            {
            // InternalRDFTurtle.g:377:2: (otherlv_0= 'PREFIX' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_iriref_2_0= RULE_IRIREF ) ) )
            // InternalRDFTurtle.g:378:3: otherlv_0= 'PREFIX' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_iriref_2_0= RULE_IRIREF ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSparqlPrefixAccess().getPREFIXKeyword_0());
              		
            }
            // InternalRDFTurtle.g:382:3: ( (lv_prefixName_1_0= rulePrefixName ) )
            // InternalRDFTurtle.g:383:4: (lv_prefixName_1_0= rulePrefixName )
            {
            // InternalRDFTurtle.g:383:4: (lv_prefixName_1_0= rulePrefixName )
            // InternalRDFTurtle.g:384:5: lv_prefixName_1_0= rulePrefixName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSparqlPrefixAccess().getPrefixNamePrefixNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_prefixName_1_0=rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSparqlPrefixRule());
              					}
              					set(
              						current,
              						"prefixName",
              						lv_prefixName_1_0,
              						"org.xtext.example.mydsl.RDFTurtle.PrefixName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRDFTurtle.g:401:3: ( (lv_iriref_2_0= RULE_IRIREF ) )
            // InternalRDFTurtle.g:402:4: (lv_iriref_2_0= RULE_IRIREF )
            {
            // InternalRDFTurtle.g:402:4: (lv_iriref_2_0= RULE_IRIREF )
            // InternalRDFTurtle.g:403:5: lv_iriref_2_0= RULE_IRIREF
            {
            lv_iriref_2_0=(Token)match(input,RULE_IRIREF,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_iriref_2_0, grammarAccess.getSparqlPrefixAccess().getIrirefIRIREFTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSparqlPrefixRule());
              					}
              					setWithLastConsumed(
              						current,
              						"iriref",
              						lv_iriref_2_0,
              						"org.xtext.example.mydsl.RDFTurtle.IRIREF");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSparqlPrefix"


    // $ANTLR start "entryRuleSparqlBase"
    // InternalRDFTurtle.g:423:1: entryRuleSparqlBase returns [EObject current=null] : iv_ruleSparqlBase= ruleSparqlBase EOF ;
    public final EObject entryRuleSparqlBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSparqlBase = null;


        try {
            // InternalRDFTurtle.g:423:51: (iv_ruleSparqlBase= ruleSparqlBase EOF )
            // InternalRDFTurtle.g:424:2: iv_ruleSparqlBase= ruleSparqlBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSparqlBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSparqlBase=ruleSparqlBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSparqlBase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSparqlBase"


    // $ANTLR start "ruleSparqlBase"
    // InternalRDFTurtle.g:430:1: ruleSparqlBase returns [EObject current=null] : (otherlv_0= 'BASE' ( (lv_iriref_1_0= RULE_IRIREF ) ) ) ;
    public final EObject ruleSparqlBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_iriref_1_0=null;


        	enterRule();

        try {
            // InternalRDFTurtle.g:436:2: ( (otherlv_0= 'BASE' ( (lv_iriref_1_0= RULE_IRIREF ) ) ) )
            // InternalRDFTurtle.g:437:2: (otherlv_0= 'BASE' ( (lv_iriref_1_0= RULE_IRIREF ) ) )
            {
            // InternalRDFTurtle.g:437:2: (otherlv_0= 'BASE' ( (lv_iriref_1_0= RULE_IRIREF ) ) )
            // InternalRDFTurtle.g:438:3: otherlv_0= 'BASE' ( (lv_iriref_1_0= RULE_IRIREF ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSparqlBaseAccess().getBASEKeyword_0());
              		
            }
            // InternalRDFTurtle.g:442:3: ( (lv_iriref_1_0= RULE_IRIREF ) )
            // InternalRDFTurtle.g:443:4: (lv_iriref_1_0= RULE_IRIREF )
            {
            // InternalRDFTurtle.g:443:4: (lv_iriref_1_0= RULE_IRIREF )
            // InternalRDFTurtle.g:444:5: lv_iriref_1_0= RULE_IRIREF
            {
            lv_iriref_1_0=(Token)match(input,RULE_IRIREF,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_iriref_1_0, grammarAccess.getSparqlBaseAccess().getIrirefIRIREFTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSparqlBaseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"iriref",
              						lv_iriref_1_0,
              						"org.xtext.example.mydsl.RDFTurtle.IRIREF");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSparqlBase"


    // $ANTLR start "entryRuleTriples"
    // InternalRDFTurtle.g:464:1: entryRuleTriples returns [EObject current=null] : iv_ruleTriples= ruleTriples EOF ;
    public final EObject entryRuleTriples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriples = null;


        try {
            // InternalRDFTurtle.g:464:48: (iv_ruleTriples= ruleTriples EOF )
            // InternalRDFTurtle.g:465:2: iv_ruleTriples= ruleTriples EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriplesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTriples=ruleTriples();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriples; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriples"


    // $ANTLR start "ruleTriples"
    // InternalRDFTurtle.g:471:1: ruleTriples returns [EObject current=null] : ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ) ;
    public final EObject ruleTriples() throws RecognitionException {
        EObject current = null;

        EObject lv_subject_0_0 = null;

        EObject lv_predicateObjectList_1_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:477:2: ( ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ) )
            // InternalRDFTurtle.g:478:2: ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) )
            {
            // InternalRDFTurtle.g:478:2: ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) )
            // InternalRDFTurtle.g:479:3: ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) )
            {
            // InternalRDFTurtle.g:479:3: ( (lv_subject_0_0= ruleSubject ) )
            // InternalRDFTurtle.g:480:4: (lv_subject_0_0= ruleSubject )
            {
            // InternalRDFTurtle.g:480:4: (lv_subject_0_0= ruleSubject )
            // InternalRDFTurtle.g:481:5: lv_subject_0_0= ruleSubject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTriplesAccess().getSubjectSubjectParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_subject_0_0=ruleSubject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTriplesRule());
              					}
              					set(
              						current,
              						"subject",
              						lv_subject_0_0,
              						"org.xtext.example.mydsl.RDFTurtle.Subject");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRDFTurtle.g:498:3: ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) )
            // InternalRDFTurtle.g:499:4: (lv_predicateObjectList_1_0= rulePredicateObjectList )
            {
            // InternalRDFTurtle.g:499:4: (lv_predicateObjectList_1_0= rulePredicateObjectList )
            // InternalRDFTurtle.g:500:5: lv_predicateObjectList_1_0= rulePredicateObjectList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTriplesAccess().getPredicateObjectListPredicateObjectListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_predicateObjectList_1_0=rulePredicateObjectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTriplesRule());
              					}
              					set(
              						current,
              						"predicateObjectList",
              						lv_predicateObjectList_1_0,
              						"org.xtext.example.mydsl.RDFTurtle.PredicateObjectList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriples"


    // $ANTLR start "entryRulePredicateObject"
    // InternalRDFTurtle.g:521:1: entryRulePredicateObject returns [EObject current=null] : iv_rulePredicateObject= rulePredicateObject EOF ;
    public final EObject entryRulePredicateObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObject = null;


        try {
            // InternalRDFTurtle.g:521:56: (iv_rulePredicateObject= rulePredicateObject EOF )
            // InternalRDFTurtle.g:522:2: iv_rulePredicateObject= rulePredicateObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredicateObject=rulePredicateObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicateObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicateObject"


    // $ANTLR start "rulePredicateObject"
    // InternalRDFTurtle.g:528:1: rulePredicateObject returns [EObject current=null] : ( ( (lv_verb_0_0= ruleVerb ) ) ( (lv_objectList_1_0= ruleObjectList ) ) ) ;
    public final EObject rulePredicateObject() throws RecognitionException {
        EObject current = null;

        EObject lv_verb_0_0 = null;

        EObject lv_objectList_1_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:534:2: ( ( ( (lv_verb_0_0= ruleVerb ) ) ( (lv_objectList_1_0= ruleObjectList ) ) ) )
            // InternalRDFTurtle.g:535:2: ( ( (lv_verb_0_0= ruleVerb ) ) ( (lv_objectList_1_0= ruleObjectList ) ) )
            {
            // InternalRDFTurtle.g:535:2: ( ( (lv_verb_0_0= ruleVerb ) ) ( (lv_objectList_1_0= ruleObjectList ) ) )
            // InternalRDFTurtle.g:536:3: ( (lv_verb_0_0= ruleVerb ) ) ( (lv_objectList_1_0= ruleObjectList ) )
            {
            // InternalRDFTurtle.g:536:3: ( (lv_verb_0_0= ruleVerb ) )
            // InternalRDFTurtle.g:537:4: (lv_verb_0_0= ruleVerb )
            {
            // InternalRDFTurtle.g:537:4: (lv_verb_0_0= ruleVerb )
            // InternalRDFTurtle.g:538:5: lv_verb_0_0= ruleVerb
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredicateObjectAccess().getVerbVerbParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_verb_0_0=ruleVerb();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPredicateObjectRule());
              					}
              					set(
              						current,
              						"verb",
              						lv_verb_0_0,
              						"org.xtext.example.mydsl.RDFTurtle.Verb");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRDFTurtle.g:555:3: ( (lv_objectList_1_0= ruleObjectList ) )
            // InternalRDFTurtle.g:556:4: (lv_objectList_1_0= ruleObjectList )
            {
            // InternalRDFTurtle.g:556:4: (lv_objectList_1_0= ruleObjectList )
            // InternalRDFTurtle.g:557:5: lv_objectList_1_0= ruleObjectList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredicateObjectAccess().getObjectListObjectListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_objectList_1_0=ruleObjectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPredicateObjectRule());
              					}
              					set(
              						current,
              						"objectList",
              						lv_objectList_1_0,
              						"org.xtext.example.mydsl.RDFTurtle.ObjectList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicateObject"


    // $ANTLR start "entryRulePredicateObjectList"
    // InternalRDFTurtle.g:578:1: entryRulePredicateObjectList returns [EObject current=null] : iv_rulePredicateObjectList= rulePredicateObjectList EOF ;
    public final EObject entryRulePredicateObjectList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObjectList = null;


        try {
            // InternalRDFTurtle.g:578:60: (iv_rulePredicateObjectList= rulePredicateObjectList EOF )
            // InternalRDFTurtle.g:579:2: iv_rulePredicateObjectList= rulePredicateObjectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateObjectListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredicateObjectList=rulePredicateObjectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicateObjectList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicateObjectList"


    // $ANTLR start "rulePredicateObjectList"
    // InternalRDFTurtle.g:585:1: rulePredicateObjectList returns [EObject current=null] : ( ( (lv_predicateObjects_0_0= rulePredicateObject ) ) (otherlv_1= ';' ( (lv_predicateObjects_2_0= rulePredicateObject ) ) )* (otherlv_3= ';' )? ) ;
    public final EObject rulePredicateObjectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_predicateObjects_0_0 = null;

        EObject lv_predicateObjects_2_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:591:2: ( ( ( (lv_predicateObjects_0_0= rulePredicateObject ) ) (otherlv_1= ';' ( (lv_predicateObjects_2_0= rulePredicateObject ) ) )* (otherlv_3= ';' )? ) )
            // InternalRDFTurtle.g:592:2: ( ( (lv_predicateObjects_0_0= rulePredicateObject ) ) (otherlv_1= ';' ( (lv_predicateObjects_2_0= rulePredicateObject ) ) )* (otherlv_3= ';' )? )
            {
            // InternalRDFTurtle.g:592:2: ( ( (lv_predicateObjects_0_0= rulePredicateObject ) ) (otherlv_1= ';' ( (lv_predicateObjects_2_0= rulePredicateObject ) ) )* (otherlv_3= ';' )? )
            // InternalRDFTurtle.g:593:3: ( (lv_predicateObjects_0_0= rulePredicateObject ) ) (otherlv_1= ';' ( (lv_predicateObjects_2_0= rulePredicateObject ) ) )* (otherlv_3= ';' )?
            {
            // InternalRDFTurtle.g:593:3: ( (lv_predicateObjects_0_0= rulePredicateObject ) )
            // InternalRDFTurtle.g:594:4: (lv_predicateObjects_0_0= rulePredicateObject )
            {
            // InternalRDFTurtle.g:594:4: (lv_predicateObjects_0_0= rulePredicateObject )
            // InternalRDFTurtle.g:595:5: lv_predicateObjects_0_0= rulePredicateObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredicateObjectListAccess().getPredicateObjectsPredicateObjectParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_predicateObjects_0_0=rulePredicateObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPredicateObjectListRule());
              					}
              					add(
              						current,
              						"predicateObjects",
              						lv_predicateObjects_0_0,
              						"org.xtext.example.mydsl.RDFTurtle.PredicateObject");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRDFTurtle.g:612:3: (otherlv_1= ';' ( (lv_predicateObjects_2_0= rulePredicateObject ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    int LA4_1 = input.LA(2);

                    if ( ((LA4_1>=RULE_IRIREF && LA4_1<=RULE_ID)||LA4_1==22||LA4_1==33) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalRDFTurtle.g:613:4: otherlv_1= ';' ( (lv_predicateObjects_2_0= rulePredicateObject ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPredicateObjectListAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalRDFTurtle.g:617:4: ( (lv_predicateObjects_2_0= rulePredicateObject ) )
            	    // InternalRDFTurtle.g:618:5: (lv_predicateObjects_2_0= rulePredicateObject )
            	    {
            	    // InternalRDFTurtle.g:618:5: (lv_predicateObjects_2_0= rulePredicateObject )
            	    // InternalRDFTurtle.g:619:6: lv_predicateObjects_2_0= rulePredicateObject
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPredicateObjectListAccess().getPredicateObjectsPredicateObjectParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_predicateObjects_2_0=rulePredicateObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPredicateObjectListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"predicateObjects",
            	      							lv_predicateObjects_2_0,
            	      							"org.xtext.example.mydsl.RDFTurtle.PredicateObject");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalRDFTurtle.g:637:3: (otherlv_3= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRDFTurtle.g:638:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPredicateObjectListAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicateObjectList"


    // $ANTLR start "entryRuleObjectList"
    // InternalRDFTurtle.g:647:1: entryRuleObjectList returns [EObject current=null] : iv_ruleObjectList= ruleObjectList EOF ;
    public final EObject entryRuleObjectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectList = null;


        try {
            // InternalRDFTurtle.g:647:51: (iv_ruleObjectList= ruleObjectList EOF )
            // InternalRDFTurtle.g:648:2: iv_ruleObjectList= ruleObjectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjectList=ruleObjectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectList"


    // $ANTLR start "ruleObjectList"
    // InternalRDFTurtle.g:654:1: ruleObjectList returns [EObject current=null] : ( ( (lv_objects_0_0= ruleObject ) ) (otherlv_1= ',' ( (lv_objects_2_0= ruleObject ) ) )* ) ;
    public final EObject ruleObjectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_objects_0_0 = null;

        EObject lv_objects_2_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:660:2: ( ( ( (lv_objects_0_0= ruleObject ) ) (otherlv_1= ',' ( (lv_objects_2_0= ruleObject ) ) )* ) )
            // InternalRDFTurtle.g:661:2: ( ( (lv_objects_0_0= ruleObject ) ) (otherlv_1= ',' ( (lv_objects_2_0= ruleObject ) ) )* )
            {
            // InternalRDFTurtle.g:661:2: ( ( (lv_objects_0_0= ruleObject ) ) (otherlv_1= ',' ( (lv_objects_2_0= ruleObject ) ) )* )
            // InternalRDFTurtle.g:662:3: ( (lv_objects_0_0= ruleObject ) ) (otherlv_1= ',' ( (lv_objects_2_0= ruleObject ) ) )*
            {
            // InternalRDFTurtle.g:662:3: ( (lv_objects_0_0= ruleObject ) )
            // InternalRDFTurtle.g:663:4: (lv_objects_0_0= ruleObject )
            {
            // InternalRDFTurtle.g:663:4: (lv_objects_0_0= ruleObject )
            // InternalRDFTurtle.g:664:5: lv_objects_0_0= ruleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectListAccess().getObjectsObjectParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_objects_0_0=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectListRule());
              					}
              					add(
              						current,
              						"objects",
              						lv_objects_0_0,
              						"org.xtext.example.mydsl.RDFTurtle.Object");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRDFTurtle.g:681:3: (otherlv_1= ',' ( (lv_objects_2_0= ruleObject ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRDFTurtle.g:682:4: otherlv_1= ',' ( (lv_objects_2_0= ruleObject ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getObjectListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalRDFTurtle.g:686:4: ( (lv_objects_2_0= ruleObject ) )
            	    // InternalRDFTurtle.g:687:5: (lv_objects_2_0= ruleObject )
            	    {
            	    // InternalRDFTurtle.g:687:5: (lv_objects_2_0= ruleObject )
            	    // InternalRDFTurtle.g:688:6: lv_objects_2_0= ruleObject
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getObjectListAccess().getObjectsObjectParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_objects_2_0=ruleObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getObjectListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"objects",
            	      							lv_objects_2_0,
            	      							"org.xtext.example.mydsl.RDFTurtle.Object");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectList"


    // $ANTLR start "entryRuleVerb"
    // InternalRDFTurtle.g:710:1: entryRuleVerb returns [EObject current=null] : iv_ruleVerb= ruleVerb EOF ;
    public final EObject entryRuleVerb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerb = null;


        try {
            // InternalRDFTurtle.g:710:45: (iv_ruleVerb= ruleVerb EOF )
            // InternalRDFTurtle.g:711:2: iv_ruleVerb= ruleVerb EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVerbRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVerb=ruleVerb();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVerb; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerb"


    // $ANTLR start "ruleVerb"
    // InternalRDFTurtle.g:717:1: ruleVerb returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) | ( (lv_isA_1_0= 'a' ) ) ) ;
    public final EObject ruleVerb() throws RecognitionException {
        EObject current = null;

        Token lv_isA_1_0=null;
        EObject lv_predicate_0_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:723:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) | ( (lv_isA_1_0= 'a' ) ) ) )
            // InternalRDFTurtle.g:724:2: ( ( (lv_predicate_0_0= rulePredicate ) ) | ( (lv_isA_1_0= 'a' ) ) )
            {
            // InternalRDFTurtle.g:724:2: ( ( (lv_predicate_0_0= rulePredicate ) ) | ( (lv_isA_1_0= 'a' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_IRIREF && LA7_0<=RULE_ID)||LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRDFTurtle.g:725:3: ( (lv_predicate_0_0= rulePredicate ) )
                    {
                    // InternalRDFTurtle.g:725:3: ( (lv_predicate_0_0= rulePredicate ) )
                    // InternalRDFTurtle.g:726:4: (lv_predicate_0_0= rulePredicate )
                    {
                    // InternalRDFTurtle.g:726:4: (lv_predicate_0_0= rulePredicate )
                    // InternalRDFTurtle.g:727:5: lv_predicate_0_0= rulePredicate
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVerbAccess().getPredicatePredicateParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_predicate_0_0=rulePredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVerbRule());
                      					}
                      					set(
                      						current,
                      						"predicate",
                      						lv_predicate_0_0,
                      						"org.xtext.example.mydsl.RDFTurtle.Predicate");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:745:3: ( (lv_isA_1_0= 'a' ) )
                    {
                    // InternalRDFTurtle.g:745:3: ( (lv_isA_1_0= 'a' ) )
                    // InternalRDFTurtle.g:746:4: (lv_isA_1_0= 'a' )
                    {
                    // InternalRDFTurtle.g:746:4: (lv_isA_1_0= 'a' )
                    // InternalRDFTurtle.g:747:5: lv_isA_1_0= 'a'
                    {
                    lv_isA_1_0=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isA_1_0, grammarAccess.getVerbAccess().getIsAAKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVerbRule());
                      					}
                      					setWithLastConsumed(current, "isA", lv_isA_1_0 != null, "a");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerb"


    // $ANTLR start "entryRuleSubject"
    // InternalRDFTurtle.g:763:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalRDFTurtle.g:763:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalRDFTurtle.g:764:2: iv_ruleSubject= ruleSubject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubject=ruleSubject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalRDFTurtle.g:770:1: ruleSubject returns [EObject current=null] : ( ( (lv_resource_0_0= ruleiResource ) ) | ( (lv_blank_1_0= ruleBlank ) ) ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        EObject lv_resource_0_0 = null;

        EObject lv_blank_1_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:776:2: ( ( ( (lv_resource_0_0= ruleiResource ) ) | ( (lv_blank_1_0= ruleBlank ) ) ) )
            // InternalRDFTurtle.g:777:2: ( ( (lv_resource_0_0= ruleiResource ) ) | ( (lv_blank_1_0= ruleBlank ) ) )
            {
            // InternalRDFTurtle.g:777:2: ( ( (lv_resource_0_0= ruleiResource ) ) | ( (lv_blank_1_0= ruleBlank ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_IRIREF && LA8_0<=RULE_ID)||LA8_0==33) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=27 && LA8_0<=28)||LA8_0==30||LA8_0==32) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRDFTurtle.g:778:3: ( (lv_resource_0_0= ruleiResource ) )
                    {
                    // InternalRDFTurtle.g:778:3: ( (lv_resource_0_0= ruleiResource ) )
                    // InternalRDFTurtle.g:779:4: (lv_resource_0_0= ruleiResource )
                    {
                    // InternalRDFTurtle.g:779:4: (lv_resource_0_0= ruleiResource )
                    // InternalRDFTurtle.g:780:5: lv_resource_0_0= ruleiResource
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSubjectAccess().getResourceIResourceParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_resource_0_0=ruleiResource();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSubjectRule());
                      					}
                      					set(
                      						current,
                      						"resource",
                      						lv_resource_0_0,
                      						"org.xtext.example.mydsl.RDFTurtle.iResource");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:798:3: ( (lv_blank_1_0= ruleBlank ) )
                    {
                    // InternalRDFTurtle.g:798:3: ( (lv_blank_1_0= ruleBlank ) )
                    // InternalRDFTurtle.g:799:4: (lv_blank_1_0= ruleBlank )
                    {
                    // InternalRDFTurtle.g:799:4: (lv_blank_1_0= ruleBlank )
                    // InternalRDFTurtle.g:800:5: lv_blank_1_0= ruleBlank
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSubjectAccess().getBlankBlankParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_blank_1_0=ruleBlank();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSubjectRule());
                      					}
                      					set(
                      						current,
                      						"blank",
                      						lv_blank_1_0,
                      						"org.xtext.example.mydsl.RDFTurtle.Blank");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRulePredicate"
    // InternalRDFTurtle.g:821:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalRDFTurtle.g:821:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalRDFTurtle.g:822:2: iv_rulePredicate= rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalRDFTurtle.g:828:1: rulePredicate returns [EObject current=null] : this_iResource_0= ruleiResource ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_iResource_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:834:2: (this_iResource_0= ruleiResource )
            // InternalRDFTurtle.g:835:2: this_iResource_0= ruleiResource
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getPredicateAccess().getIResourceParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_iResource_0=ruleiResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_iResource_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleObject"
    // InternalRDFTurtle.g:846:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalRDFTurtle.g:846:47: (iv_ruleObject= ruleObject EOF )
            // InternalRDFTurtle.g:847:2: iv_ruleObject= ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalRDFTurtle.g:853:1: ruleObject returns [EObject current=null] : ( ( (lv_resource_0_0= ruleiResource ) ) | ( (lv_blank_1_0= ruleBlank ) ) | ( (lv_literal_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject lv_resource_0_0 = null;

        EObject lv_blank_1_0 = null;

        EObject lv_literal_2_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:859:2: ( ( ( (lv_resource_0_0= ruleiResource ) ) | ( (lv_blank_1_0= ruleBlank ) ) | ( (lv_literal_2_0= ruleLiteral ) ) ) )
            // InternalRDFTurtle.g:860:2: ( ( (lv_resource_0_0= ruleiResource ) ) | ( (lv_blank_1_0= ruleBlank ) ) | ( (lv_literal_2_0= ruleLiteral ) ) )
            {
            // InternalRDFTurtle.g:860:2: ( ( (lv_resource_0_0= ruleiResource ) ) | ( (lv_blank_1_0= ruleBlank ) ) | ( (lv_literal_2_0= ruleLiteral ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_IRIREF:
            case RULE_ID:
            case 33:
                {
                alt9=1;
                }
                break;
            case 27:
            case 28:
            case 30:
            case 32:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_DECIMAL:
            case RULE_STRING:
            case 25:
            case 26:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRDFTurtle.g:861:3: ( (lv_resource_0_0= ruleiResource ) )
                    {
                    // InternalRDFTurtle.g:861:3: ( (lv_resource_0_0= ruleiResource ) )
                    // InternalRDFTurtle.g:862:4: (lv_resource_0_0= ruleiResource )
                    {
                    // InternalRDFTurtle.g:862:4: (lv_resource_0_0= ruleiResource )
                    // InternalRDFTurtle.g:863:5: lv_resource_0_0= ruleiResource
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjectAccess().getResourceIResourceParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_resource_0_0=ruleiResource();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getObjectRule());
                      					}
                      					set(
                      						current,
                      						"resource",
                      						lv_resource_0_0,
                      						"org.xtext.example.mydsl.RDFTurtle.iResource");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:881:3: ( (lv_blank_1_0= ruleBlank ) )
                    {
                    // InternalRDFTurtle.g:881:3: ( (lv_blank_1_0= ruleBlank ) )
                    // InternalRDFTurtle.g:882:4: (lv_blank_1_0= ruleBlank )
                    {
                    // InternalRDFTurtle.g:882:4: (lv_blank_1_0= ruleBlank )
                    // InternalRDFTurtle.g:883:5: lv_blank_1_0= ruleBlank
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjectAccess().getBlankBlankParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_blank_1_0=ruleBlank();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getObjectRule());
                      					}
                      					set(
                      						current,
                      						"blank",
                      						lv_blank_1_0,
                      						"org.xtext.example.mydsl.RDFTurtle.Blank");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRDFTurtle.g:901:3: ( (lv_literal_2_0= ruleLiteral ) )
                    {
                    // InternalRDFTurtle.g:901:3: ( (lv_literal_2_0= ruleLiteral ) )
                    // InternalRDFTurtle.g:902:4: (lv_literal_2_0= ruleLiteral )
                    {
                    // InternalRDFTurtle.g:902:4: (lv_literal_2_0= ruleLiteral )
                    // InternalRDFTurtle.g:903:5: lv_literal_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjectAccess().getLiteralLiteralParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_literal_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getObjectRule());
                      					}
                      					set(
                      						current,
                      						"literal",
                      						lv_literal_2_0,
                      						"org.xtext.example.mydsl.RDFTurtle.Literal");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleLanguageString"
    // InternalRDFTurtle.g:924:1: entryRuleLanguageString returns [EObject current=null] : iv_ruleLanguageString= ruleLanguageString EOF ;
    public final EObject entryRuleLanguageString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageString = null;


        try {
            // InternalRDFTurtle.g:924:55: (iv_ruleLanguageString= ruleLanguageString EOF )
            // InternalRDFTurtle.g:925:2: iv_ruleLanguageString= ruleLanguageString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLanguageString=ruleLanguageString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageString"


    // $ANTLR start "ruleLanguageString"
    // InternalRDFTurtle.g:931:1: ruleLanguageString returns [EObject current=null] : ( ( (lv_qutoedString_0_0= ruleQuotedString ) ) (otherlv_1= '@' ( (lv_lang_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleLanguageString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lang_2_0=null;
        AntlrDatatypeRuleToken lv_qutoedString_0_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:937:2: ( ( ( (lv_qutoedString_0_0= ruleQuotedString ) ) (otherlv_1= '@' ( (lv_lang_2_0= RULE_ID ) ) )? ) )
            // InternalRDFTurtle.g:938:2: ( ( (lv_qutoedString_0_0= ruleQuotedString ) ) (otherlv_1= '@' ( (lv_lang_2_0= RULE_ID ) ) )? )
            {
            // InternalRDFTurtle.g:938:2: ( ( (lv_qutoedString_0_0= ruleQuotedString ) ) (otherlv_1= '@' ( (lv_lang_2_0= RULE_ID ) ) )? )
            // InternalRDFTurtle.g:939:3: ( (lv_qutoedString_0_0= ruleQuotedString ) ) (otherlv_1= '@' ( (lv_lang_2_0= RULE_ID ) ) )?
            {
            // InternalRDFTurtle.g:939:3: ( (lv_qutoedString_0_0= ruleQuotedString ) )
            // InternalRDFTurtle.g:940:4: (lv_qutoedString_0_0= ruleQuotedString )
            {
            // InternalRDFTurtle.g:940:4: (lv_qutoedString_0_0= ruleQuotedString )
            // InternalRDFTurtle.g:941:5: lv_qutoedString_0_0= ruleQuotedString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageStringAccess().getQutoedStringQuotedStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_qutoedString_0_0=ruleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLanguageStringRule());
              					}
              					set(
              						current,
              						"qutoedString",
              						lv_qutoedString_0_0,
              						"org.xtext.example.mydsl.RDFTurtle.QuotedString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRDFTurtle.g:958:3: (otherlv_1= '@' ( (lv_lang_2_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRDFTurtle.g:959:4: otherlv_1= '@' ( (lv_lang_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLanguageStringAccess().getCommercialAtKeyword_1_0());
                      			
                    }
                    // InternalRDFTurtle.g:963:4: ( (lv_lang_2_0= RULE_ID ) )
                    // InternalRDFTurtle.g:964:5: (lv_lang_2_0= RULE_ID )
                    {
                    // InternalRDFTurtle.g:964:5: (lv_lang_2_0= RULE_ID )
                    // InternalRDFTurtle.g:965:6: lv_lang_2_0= RULE_ID
                    {
                    lv_lang_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lang_2_0, grammarAccess.getLanguageStringAccess().getLangIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLanguageStringRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"lang",
                      							lv_lang_2_0,
                      							"org.xtext.example.mydsl.RDFTurtle.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageString"


    // $ANTLR start "entryRuleLiteral"
    // InternalRDFTurtle.g:986:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalRDFTurtle.g:986:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalRDFTurtle.g:987:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalRDFTurtle.g:993:1: ruleLiteral returns [EObject current=null] : ( ( (lv_languageString_0_0= ruleLanguageString ) ) | ( (lv_datatypeString_1_0= ruleDatatypeString ) ) | ( (lv_dword_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_DOUBLE ) ) | ( (lv_decimal_4_0= RULE_DECIMAL ) ) | ( (lv_bool_5_0= ruleBoolean ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_dword_2_0=null;
        Token lv_real_3_0=null;
        Token lv_decimal_4_0=null;
        EObject lv_languageString_0_0 = null;

        EObject lv_datatypeString_1_0 = null;

        AntlrDatatypeRuleToken lv_bool_5_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:999:2: ( ( ( (lv_languageString_0_0= ruleLanguageString ) ) | ( (lv_datatypeString_1_0= ruleDatatypeString ) ) | ( (lv_dword_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_DOUBLE ) ) | ( (lv_decimal_4_0= RULE_DECIMAL ) ) | ( (lv_bool_5_0= ruleBoolean ) ) ) )
            // InternalRDFTurtle.g:1000:2: ( ( (lv_languageString_0_0= ruleLanguageString ) ) | ( (lv_datatypeString_1_0= ruleDatatypeString ) ) | ( (lv_dword_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_DOUBLE ) ) | ( (lv_decimal_4_0= RULE_DECIMAL ) ) | ( (lv_bool_5_0= ruleBoolean ) ) )
            {
            // InternalRDFTurtle.g:1000:2: ( ( (lv_languageString_0_0= ruleLanguageString ) ) | ( (lv_datatypeString_1_0= ruleDatatypeString ) ) | ( (lv_dword_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_DOUBLE ) ) | ( (lv_decimal_4_0= RULE_DECIMAL ) ) | ( (lv_bool_5_0= ruleBoolean ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=RULE_IRIREF && LA11_1<=RULE_STRING)||LA11_1==15||(LA11_1>=20 && LA11_1<=21)||LA11_1==23||(LA11_1>=25 && LA11_1<=33)) ) {
                    alt11=1;
                }
                else if ( (LA11_1==24) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt11=4;
                }
                break;
            case RULE_DECIMAL:
                {
                alt11=5;
                }
                break;
            case 25:
            case 26:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRDFTurtle.g:1001:3: ( (lv_languageString_0_0= ruleLanguageString ) )
                    {
                    // InternalRDFTurtle.g:1001:3: ( (lv_languageString_0_0= ruleLanguageString ) )
                    // InternalRDFTurtle.g:1002:4: (lv_languageString_0_0= ruleLanguageString )
                    {
                    // InternalRDFTurtle.g:1002:4: (lv_languageString_0_0= ruleLanguageString )
                    // InternalRDFTurtle.g:1003:5: lv_languageString_0_0= ruleLanguageString
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralAccess().getLanguageStringLanguageStringParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_languageString_0_0=ruleLanguageString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralRule());
                      					}
                      					set(
                      						current,
                      						"languageString",
                      						lv_languageString_0_0,
                      						"org.xtext.example.mydsl.RDFTurtle.LanguageString");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:1021:3: ( (lv_datatypeString_1_0= ruleDatatypeString ) )
                    {
                    // InternalRDFTurtle.g:1021:3: ( (lv_datatypeString_1_0= ruleDatatypeString ) )
                    // InternalRDFTurtle.g:1022:4: (lv_datatypeString_1_0= ruleDatatypeString )
                    {
                    // InternalRDFTurtle.g:1022:4: (lv_datatypeString_1_0= ruleDatatypeString )
                    // InternalRDFTurtle.g:1023:5: lv_datatypeString_1_0= ruleDatatypeString
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralAccess().getDatatypeStringDatatypeStringParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_datatypeString_1_0=ruleDatatypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralRule());
                      					}
                      					set(
                      						current,
                      						"datatypeString",
                      						lv_datatypeString_1_0,
                      						"org.xtext.example.mydsl.RDFTurtle.DatatypeString");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRDFTurtle.g:1041:3: ( (lv_dword_2_0= RULE_INT ) )
                    {
                    // InternalRDFTurtle.g:1041:3: ( (lv_dword_2_0= RULE_INT ) )
                    // InternalRDFTurtle.g:1042:4: (lv_dword_2_0= RULE_INT )
                    {
                    // InternalRDFTurtle.g:1042:4: (lv_dword_2_0= RULE_INT )
                    // InternalRDFTurtle.g:1043:5: lv_dword_2_0= RULE_INT
                    {
                    lv_dword_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_dword_2_0, grammarAccess.getLiteralAccess().getDwordINTTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"dword",
                      						lv_dword_2_0,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRDFTurtle.g:1060:3: ( (lv_real_3_0= RULE_DOUBLE ) )
                    {
                    // InternalRDFTurtle.g:1060:3: ( (lv_real_3_0= RULE_DOUBLE ) )
                    // InternalRDFTurtle.g:1061:4: (lv_real_3_0= RULE_DOUBLE )
                    {
                    // InternalRDFTurtle.g:1061:4: (lv_real_3_0= RULE_DOUBLE )
                    // InternalRDFTurtle.g:1062:5: lv_real_3_0= RULE_DOUBLE
                    {
                    lv_real_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_real_3_0, grammarAccess.getLiteralAccess().getRealDOUBLETerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"real",
                      						lv_real_3_0,
                      						"org.xtext.example.mydsl.RDFTurtle.DOUBLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRDFTurtle.g:1079:3: ( (lv_decimal_4_0= RULE_DECIMAL ) )
                    {
                    // InternalRDFTurtle.g:1079:3: ( (lv_decimal_4_0= RULE_DECIMAL ) )
                    // InternalRDFTurtle.g:1080:4: (lv_decimal_4_0= RULE_DECIMAL )
                    {
                    // InternalRDFTurtle.g:1080:4: (lv_decimal_4_0= RULE_DECIMAL )
                    // InternalRDFTurtle.g:1081:5: lv_decimal_4_0= RULE_DECIMAL
                    {
                    lv_decimal_4_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_decimal_4_0, grammarAccess.getLiteralAccess().getDecimalDECIMALTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"decimal",
                      						lv_decimal_4_0,
                      						"org.xtext.example.mydsl.RDFTurtle.DECIMAL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalRDFTurtle.g:1098:3: ( (lv_bool_5_0= ruleBoolean ) )
                    {
                    // InternalRDFTurtle.g:1098:3: ( (lv_bool_5_0= ruleBoolean ) )
                    // InternalRDFTurtle.g:1099:4: (lv_bool_5_0= ruleBoolean )
                    {
                    // InternalRDFTurtle.g:1099:4: (lv_bool_5_0= ruleBoolean )
                    // InternalRDFTurtle.g:1100:5: lv_bool_5_0= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralAccess().getBoolBooleanParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_bool_5_0=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralRule());
                      					}
                      					set(
                      						current,
                      						"bool",
                      						lv_bool_5_0,
                      						"org.xtext.example.mydsl.RDFTurtle.Boolean");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleDatatypeString"
    // InternalRDFTurtle.g:1121:1: entryRuleDatatypeString returns [EObject current=null] : iv_ruleDatatypeString= ruleDatatypeString EOF ;
    public final EObject entryRuleDatatypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeString = null;


        try {
            // InternalRDFTurtle.g:1121:55: (iv_ruleDatatypeString= ruleDatatypeString EOF )
            // InternalRDFTurtle.g:1122:2: iv_ruleDatatypeString= ruleDatatypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatatypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDatatypeString=ruleDatatypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatatypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatypeString"


    // $ANTLR start "ruleDatatypeString"
    // InternalRDFTurtle.g:1128:1: ruleDatatypeString returns [EObject current=null] : ( ( (lv_qutoedString_0_0= ruleQuotedString ) ) otherlv_1= '^^' ( (lv_resource_2_0= ruleiResource ) ) ) ;
    public final EObject ruleDatatypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_qutoedString_0_0 = null;

        EObject lv_resource_2_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:1134:2: ( ( ( (lv_qutoedString_0_0= ruleQuotedString ) ) otherlv_1= '^^' ( (lv_resource_2_0= ruleiResource ) ) ) )
            // InternalRDFTurtle.g:1135:2: ( ( (lv_qutoedString_0_0= ruleQuotedString ) ) otherlv_1= '^^' ( (lv_resource_2_0= ruleiResource ) ) )
            {
            // InternalRDFTurtle.g:1135:2: ( ( (lv_qutoedString_0_0= ruleQuotedString ) ) otherlv_1= '^^' ( (lv_resource_2_0= ruleiResource ) ) )
            // InternalRDFTurtle.g:1136:3: ( (lv_qutoedString_0_0= ruleQuotedString ) ) otherlv_1= '^^' ( (lv_resource_2_0= ruleiResource ) )
            {
            // InternalRDFTurtle.g:1136:3: ( (lv_qutoedString_0_0= ruleQuotedString ) )
            // InternalRDFTurtle.g:1137:4: (lv_qutoedString_0_0= ruleQuotedString )
            {
            // InternalRDFTurtle.g:1137:4: (lv_qutoedString_0_0= ruleQuotedString )
            // InternalRDFTurtle.g:1138:5: lv_qutoedString_0_0= ruleQuotedString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDatatypeStringAccess().getQutoedStringQuotedStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_qutoedString_0_0=ruleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDatatypeStringRule());
              					}
              					set(
              						current,
              						"qutoedString",
              						lv_qutoedString_0_0,
              						"org.xtext.example.mydsl.RDFTurtle.QuotedString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDatatypeStringAccess().getCircumflexAccentCircumflexAccentKeyword_1());
              		
            }
            // InternalRDFTurtle.g:1159:3: ( (lv_resource_2_0= ruleiResource ) )
            // InternalRDFTurtle.g:1160:4: (lv_resource_2_0= ruleiResource )
            {
            // InternalRDFTurtle.g:1160:4: (lv_resource_2_0= ruleiResource )
            // InternalRDFTurtle.g:1161:5: lv_resource_2_0= ruleiResource
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDatatypeStringAccess().getResourceIResourceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_resource_2_0=ruleiResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDatatypeStringRule());
              					}
              					set(
              						current,
              						"resource",
              						lv_resource_2_0,
              						"org.xtext.example.mydsl.RDFTurtle.iResource");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatypeString"


    // $ANTLR start "entryRuleBoolean"
    // InternalRDFTurtle.g:1182:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalRDFTurtle.g:1182:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalRDFTurtle.g:1183:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalRDFTurtle.g:1189:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRDFTurtle.g:1195:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalRDFTurtle.g:1196:2: (kw= 'true' | kw= 'false' )
            {
            // InternalRDFTurtle.g:1196:2: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRDFTurtle.g:1197:3: kw= 'true'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:1203:3: kw= 'false'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleBlank"
    // InternalRDFTurtle.g:1212:1: entryRuleBlank returns [EObject current=null] : iv_ruleBlank= ruleBlank EOF ;
    public final EObject entryRuleBlank() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlank = null;


        try {
            // InternalRDFTurtle.g:1212:46: (iv_ruleBlank= ruleBlank EOF )
            // InternalRDFTurtle.g:1213:2: iv_ruleBlank= ruleBlank EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlankRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlank=ruleBlank();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlank; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlank"


    // $ANTLR start "ruleBlank"
    // InternalRDFTurtle.g:1219:1: ruleBlank returns [EObject current=null] : ( ( (lv_nodeID_0_0= ruleNodeID ) ) | ( (lv_isSquare_1_0= '[]' ) ) | (otherlv_2= '[' ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) otherlv_4= ']' ) | ( (lv_collection_5_0= ruleCollection ) ) ) ;
    public final EObject ruleBlank() throws RecognitionException {
        EObject current = null;

        Token lv_isSquare_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_nodeID_0_0 = null;

        EObject lv_predicateObjectList_3_0 = null;

        EObject lv_collection_5_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:1225:2: ( ( ( (lv_nodeID_0_0= ruleNodeID ) ) | ( (lv_isSquare_1_0= '[]' ) ) | (otherlv_2= '[' ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) otherlv_4= ']' ) | ( (lv_collection_5_0= ruleCollection ) ) ) )
            // InternalRDFTurtle.g:1226:2: ( ( (lv_nodeID_0_0= ruleNodeID ) ) | ( (lv_isSquare_1_0= '[]' ) ) | (otherlv_2= '[' ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) otherlv_4= ']' ) | ( (lv_collection_5_0= ruleCollection ) ) )
            {
            // InternalRDFTurtle.g:1226:2: ( ( (lv_nodeID_0_0= ruleNodeID ) ) | ( (lv_isSquare_1_0= '[]' ) ) | (otherlv_2= '[' ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) otherlv_4= ']' ) | ( (lv_collection_5_0= ruleCollection ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 30:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRDFTurtle.g:1227:3: ( (lv_nodeID_0_0= ruleNodeID ) )
                    {
                    // InternalRDFTurtle.g:1227:3: ( (lv_nodeID_0_0= ruleNodeID ) )
                    // InternalRDFTurtle.g:1228:4: (lv_nodeID_0_0= ruleNodeID )
                    {
                    // InternalRDFTurtle.g:1228:4: (lv_nodeID_0_0= ruleNodeID )
                    // InternalRDFTurtle.g:1229:5: lv_nodeID_0_0= ruleNodeID
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlankAccess().getNodeIDNodeIDParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_nodeID_0_0=ruleNodeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlankRule());
                      					}
                      					set(
                      						current,
                      						"nodeID",
                      						lv_nodeID_0_0,
                      						"org.xtext.example.mydsl.RDFTurtle.NodeID");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:1247:3: ( (lv_isSquare_1_0= '[]' ) )
                    {
                    // InternalRDFTurtle.g:1247:3: ( (lv_isSquare_1_0= '[]' ) )
                    // InternalRDFTurtle.g:1248:4: (lv_isSquare_1_0= '[]' )
                    {
                    // InternalRDFTurtle.g:1248:4: (lv_isSquare_1_0= '[]' )
                    // InternalRDFTurtle.g:1249:5: lv_isSquare_1_0= '[]'
                    {
                    lv_isSquare_1_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isSquare_1_0, grammarAccess.getBlankAccess().getIsSquareLeftSquareBracketRightSquareBracketKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBlankRule());
                      					}
                      					setWithLastConsumed(current, "isSquare", lv_isSquare_1_0 != null, "[]");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRDFTurtle.g:1262:3: (otherlv_2= '[' ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) otherlv_4= ']' )
                    {
                    // InternalRDFTurtle.g:1262:3: (otherlv_2= '[' ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) otherlv_4= ']' )
                    // InternalRDFTurtle.g:1263:4: otherlv_2= '[' ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBlankAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    // InternalRDFTurtle.g:1267:4: ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) )
                    // InternalRDFTurtle.g:1268:5: (lv_predicateObjectList_3_0= rulePredicateObjectList )
                    {
                    // InternalRDFTurtle.g:1268:5: (lv_predicateObjectList_3_0= rulePredicateObjectList )
                    // InternalRDFTurtle.g:1269:6: lv_predicateObjectList_3_0= rulePredicateObjectList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlankAccess().getPredicateObjectListPredicateObjectListParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_predicateObjectList_3_0=rulePredicateObjectList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBlankRule());
                      						}
                      						set(
                      							current,
                      							"predicateObjectList",
                      							lv_predicateObjectList_3_0,
                      							"org.xtext.example.mydsl.RDFTurtle.PredicateObjectList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getBlankAccess().getRightSquareBracketKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRDFTurtle.g:1292:3: ( (lv_collection_5_0= ruleCollection ) )
                    {
                    // InternalRDFTurtle.g:1292:3: ( (lv_collection_5_0= ruleCollection ) )
                    // InternalRDFTurtle.g:1293:4: (lv_collection_5_0= ruleCollection )
                    {
                    // InternalRDFTurtle.g:1293:4: (lv_collection_5_0= ruleCollection )
                    // InternalRDFTurtle.g:1294:5: lv_collection_5_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlankAccess().getCollectionCollectionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_collection_5_0=ruleCollection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlankRule());
                      					}
                      					set(
                      						current,
                      						"collection",
                      						lv_collection_5_0,
                      						"org.xtext.example.mydsl.RDFTurtle.Collection");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlank"


    // $ANTLR start "entryRuleItemList"
    // InternalRDFTurtle.g:1315:1: entryRuleItemList returns [EObject current=null] : iv_ruleItemList= ruleItemList EOF ;
    public final EObject entryRuleItemList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemList = null;


        try {
            // InternalRDFTurtle.g:1315:49: (iv_ruleItemList= ruleItemList EOF )
            // InternalRDFTurtle.g:1316:2: iv_ruleItemList= ruleItemList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItemListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleItemList=ruleItemList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItemList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemList"


    // $ANTLR start "ruleItemList"
    // InternalRDFTurtle.g:1322:1: ruleItemList returns [EObject current=null] : ( ( (lv_objects_0_0= ruleObject ) ) ( (lv_objects_1_0= ruleObject ) )* ) ;
    public final EObject ruleItemList() throws RecognitionException {
        EObject current = null;

        EObject lv_objects_0_0 = null;

        EObject lv_objects_1_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:1328:2: ( ( ( (lv_objects_0_0= ruleObject ) ) ( (lv_objects_1_0= ruleObject ) )* ) )
            // InternalRDFTurtle.g:1329:2: ( ( (lv_objects_0_0= ruleObject ) ) ( (lv_objects_1_0= ruleObject ) )* )
            {
            // InternalRDFTurtle.g:1329:2: ( ( (lv_objects_0_0= ruleObject ) ) ( (lv_objects_1_0= ruleObject ) )* )
            // InternalRDFTurtle.g:1330:3: ( (lv_objects_0_0= ruleObject ) ) ( (lv_objects_1_0= ruleObject ) )*
            {
            // InternalRDFTurtle.g:1330:3: ( (lv_objects_0_0= ruleObject ) )
            // InternalRDFTurtle.g:1331:4: (lv_objects_0_0= ruleObject )
            {
            // InternalRDFTurtle.g:1331:4: (lv_objects_0_0= ruleObject )
            // InternalRDFTurtle.g:1332:5: lv_objects_0_0= ruleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItemListAccess().getObjectsObjectParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_objects_0_0=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getItemListRule());
              					}
              					add(
              						current,
              						"objects",
              						lv_objects_0_0,
              						"org.xtext.example.mydsl.RDFTurtle.Object");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRDFTurtle.g:1349:3: ( (lv_objects_1_0= ruleObject ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_IRIREF && LA14_0<=RULE_STRING)||(LA14_0>=25 && LA14_0<=28)||LA14_0==30||(LA14_0>=32 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRDFTurtle.g:1350:4: (lv_objects_1_0= ruleObject )
            	    {
            	    // InternalRDFTurtle.g:1350:4: (lv_objects_1_0= ruleObject )
            	    // InternalRDFTurtle.g:1351:5: lv_objects_1_0= ruleObject
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getItemListAccess().getObjectsObjectParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_objects_1_0=ruleObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getItemListRule());
            	      					}
            	      					add(
            	      						current,
            	      						"objects",
            	      						lv_objects_1_0,
            	      						"org.xtext.example.mydsl.RDFTurtle.Object");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemList"


    // $ANTLR start "entryRuleCollection"
    // InternalRDFTurtle.g:1372:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalRDFTurtle.g:1372:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalRDFTurtle.g:1373:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalRDFTurtle.g:1379:1: ruleCollection returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_itemList_2_0= ruleItemList ) )? otherlv_3= ')' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_itemList_2_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:1385:2: ( ( () otherlv_1= '(' ( (lv_itemList_2_0= ruleItemList ) )? otherlv_3= ')' ) )
            // InternalRDFTurtle.g:1386:2: ( () otherlv_1= '(' ( (lv_itemList_2_0= ruleItemList ) )? otherlv_3= ')' )
            {
            // InternalRDFTurtle.g:1386:2: ( () otherlv_1= '(' ( (lv_itemList_2_0= ruleItemList ) )? otherlv_3= ')' )
            // InternalRDFTurtle.g:1387:3: () otherlv_1= '(' ( (lv_itemList_2_0= ruleItemList ) )? otherlv_3= ')'
            {
            // InternalRDFTurtle.g:1387:3: ()
            // InternalRDFTurtle.g:1388:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionAccess().getCollectionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalRDFTurtle.g:1398:3: ( (lv_itemList_2_0= ruleItemList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_IRIREF && LA15_0<=RULE_STRING)||(LA15_0>=25 && LA15_0<=28)||LA15_0==30||(LA15_0>=32 && LA15_0<=33)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRDFTurtle.g:1399:4: (lv_itemList_2_0= ruleItemList )
                    {
                    // InternalRDFTurtle.g:1399:4: (lv_itemList_2_0= ruleItemList )
                    // InternalRDFTurtle.g:1400:5: lv_itemList_2_0= ruleItemList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCollectionAccess().getItemListItemListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_itemList_2_0=ruleItemList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCollectionRule());
                      					}
                      					set(
                      						current,
                      						"itemList",
                      						lv_itemList_2_0,
                      						"org.xtext.example.mydsl.RDFTurtle.ItemList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleiResource"
    // InternalRDFTurtle.g:1425:1: entryRuleiResource returns [EObject current=null] : iv_ruleiResource= ruleiResource EOF ;
    public final EObject entryRuleiResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleiResource = null;


        try {
            // InternalRDFTurtle.g:1425:50: (iv_ruleiResource= ruleiResource EOF )
            // InternalRDFTurtle.g:1426:2: iv_ruleiResource= ruleiResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIResourceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleiResource=ruleiResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleiResource; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleiResource"


    // $ANTLR start "ruleiResource"
    // InternalRDFTurtle.g:1432:1: ruleiResource returns [EObject current=null] : ( ( (lv_iriRef_0_0= RULE_IRIREF ) ) | ( (lv_qname_1_0= ruleQname ) ) ) ;
    public final EObject ruleiResource() throws RecognitionException {
        EObject current = null;

        Token lv_iriRef_0_0=null;
        EObject lv_qname_1_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:1438:2: ( ( ( (lv_iriRef_0_0= RULE_IRIREF ) ) | ( (lv_qname_1_0= ruleQname ) ) ) )
            // InternalRDFTurtle.g:1439:2: ( ( (lv_iriRef_0_0= RULE_IRIREF ) ) | ( (lv_qname_1_0= ruleQname ) ) )
            {
            // InternalRDFTurtle.g:1439:2: ( ( (lv_iriRef_0_0= RULE_IRIREF ) ) | ( (lv_qname_1_0= ruleQname ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_IRIREF) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID||LA16_0==33) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRDFTurtle.g:1440:3: ( (lv_iriRef_0_0= RULE_IRIREF ) )
                    {
                    // InternalRDFTurtle.g:1440:3: ( (lv_iriRef_0_0= RULE_IRIREF ) )
                    // InternalRDFTurtle.g:1441:4: (lv_iriRef_0_0= RULE_IRIREF )
                    {
                    // InternalRDFTurtle.g:1441:4: (lv_iriRef_0_0= RULE_IRIREF )
                    // InternalRDFTurtle.g:1442:5: lv_iriRef_0_0= RULE_IRIREF
                    {
                    lv_iriRef_0_0=(Token)match(input,RULE_IRIREF,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_iriRef_0_0, grammarAccess.getIResourceAccess().getIriRefIRIREFTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIResourceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"iriRef",
                      						lv_iriRef_0_0,
                      						"org.xtext.example.mydsl.RDFTurtle.IRIREF");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:1459:3: ( (lv_qname_1_0= ruleQname ) )
                    {
                    // InternalRDFTurtle.g:1459:3: ( (lv_qname_1_0= ruleQname ) )
                    // InternalRDFTurtle.g:1460:4: (lv_qname_1_0= ruleQname )
                    {
                    // InternalRDFTurtle.g:1460:4: (lv_qname_1_0= ruleQname )
                    // InternalRDFTurtle.g:1461:5: lv_qname_1_0= ruleQname
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIResourceAccess().getQnameQnameParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_qname_1_0=ruleQname();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIResourceRule());
                      					}
                      					set(
                      						current,
                      						"qname",
                      						lv_qname_1_0,
                      						"org.xtext.example.mydsl.RDFTurtle.Qname");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleiResource"


    // $ANTLR start "entryRuleNodeID"
    // InternalRDFTurtle.g:1482:1: entryRuleNodeID returns [EObject current=null] : iv_ruleNodeID= ruleNodeID EOF ;
    public final EObject entryRuleNodeID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeID = null;


        try {
            // InternalRDFTurtle.g:1482:47: (iv_ruleNodeID= ruleNodeID EOF )
            // InternalRDFTurtle.g:1483:2: iv_ruleNodeID= ruleNodeID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeID=ruleNodeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeID; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeID"


    // $ANTLR start "ruleNodeID"
    // InternalRDFTurtle.g:1489:1: ruleNodeID returns [EObject current=null] : (otherlv_0= '_:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNodeID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRDFTurtle.g:1495:2: ( (otherlv_0= '_:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRDFTurtle.g:1496:2: (otherlv_0= '_:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRDFTurtle.g:1496:2: (otherlv_0= '_:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRDFTurtle.g:1497:3: otherlv_0= '_:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNodeIDAccess().get_Keyword_0());
              		
            }
            // InternalRDFTurtle.g:1501:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRDFTurtle.g:1502:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRDFTurtle.g:1502:4: (lv_name_1_0= RULE_ID )
            // InternalRDFTurtle.g:1503:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getNodeIDAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNodeIDRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.mydsl.RDFTurtle.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeID"


    // $ANTLR start "entryRuleQname"
    // InternalRDFTurtle.g:1523:1: entryRuleQname returns [EObject current=null] : iv_ruleQname= ruleQname EOF ;
    public final EObject entryRuleQname() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQname = null;


        try {
            // InternalRDFTurtle.g:1523:46: (iv_ruleQname= ruleQname EOF )
            // InternalRDFTurtle.g:1524:2: iv_ruleQname= ruleQname EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQnameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQname=ruleQname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQname; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQname"


    // $ANTLR start "ruleQname"
    // InternalRDFTurtle.g:1530:1: ruleQname returns [EObject current=null] : ( () ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) ) ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleQname() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_prefixName_1_0 = null;



        	enterRule();

        try {
            // InternalRDFTurtle.g:1536:2: ( ( () ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) ) ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )? ) )
            // InternalRDFTurtle.g:1537:2: ( () ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) ) ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalRDFTurtle.g:1537:2: ( () ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) ) ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )? )
            // InternalRDFTurtle.g:1538:3: () ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) ) ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )?
            {
            // InternalRDFTurtle.g:1538:3: ()
            // InternalRDFTurtle.g:1539:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQnameAccess().getQnameAction_0(),
              					current);
              			
            }

            }

            // InternalRDFTurtle.g:1545:3: ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) )
            // InternalRDFTurtle.g:1546:4: ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName )
            {
            // InternalRDFTurtle.g:1550:4: (lv_prefixName_1_0= rulePrefixName )
            // InternalRDFTurtle.g:1551:5: lv_prefixName_1_0= rulePrefixName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQnameAccess().getPrefixNamePrefixNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_prefixName_1_0=rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQnameRule());
              					}
              					set(
              						current,
              						"prefixName",
              						lv_prefixName_1_0,
              						"org.xtext.example.mydsl.RDFTurtle.PrefixName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRDFTurtle.g:1568:3: ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred2_InternalRDFTurtle()) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalRDFTurtle.g:1569:4: ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID )
                    {
                    // InternalRDFTurtle.g:1573:4: (lv_name_2_0= RULE_ID )
                    // InternalRDFTurtle.g:1574:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_2_0, grammarAccess.getQnameAccess().getNameIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getQnameRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_2_0,
                      						"org.xtext.example.mydsl.RDFTurtle.ID");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQname"


    // $ANTLR start "entryRulePrefixName"
    // InternalRDFTurtle.g:1594:1: entryRulePrefixName returns [String current=null] : iv_rulePrefixName= rulePrefixName EOF ;
    public final String entryRulePrefixName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixName = null;


        try {
            // InternalRDFTurtle.g:1594:50: (iv_rulePrefixName= rulePrefixName EOF )
            // InternalRDFTurtle.g:1595:2: iv_rulePrefixName= rulePrefixName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixName=rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixName"


    // $ANTLR start "rulePrefixName"
    // InternalRDFTurtle.g:1601:1: rulePrefixName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID )? kw= ':' ) ;
    public final AntlrDatatypeRuleToken rulePrefixName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRDFTurtle.g:1607:2: ( ( (this_ID_0= RULE_ID )? kw= ':' ) )
            // InternalRDFTurtle.g:1608:2: ( (this_ID_0= RULE_ID )? kw= ':' )
            {
            // InternalRDFTurtle.g:1608:2: ( (this_ID_0= RULE_ID )? kw= ':' )
            // InternalRDFTurtle.g:1609:3: (this_ID_0= RULE_ID )? kw= ':'
            {
            // InternalRDFTurtle.g:1609:3: (this_ID_0= RULE_ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRDFTurtle.g:1610:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_0, grammarAccess.getPrefixNameAccess().getIDTerminalRuleCall_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPrefixNameAccess().getColonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixName"


    // $ANTLR start "entryRuleQuotedString"
    // InternalRDFTurtle.g:1627:1: entryRuleQuotedString returns [String current=null] : iv_ruleQuotedString= ruleQuotedString EOF ;
    public final String entryRuleQuotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuotedString = null;


        try {
            // InternalRDFTurtle.g:1627:52: (iv_ruleQuotedString= ruleQuotedString EOF )
            // InternalRDFTurtle.g:1628:2: iv_ruleQuotedString= ruleQuotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuotedString=ruleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedString"


    // $ANTLR start "ruleQuotedString"
    // InternalRDFTurtle.g:1634:1: ruleQuotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleQuotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalRDFTurtle.g:1640:2: (this_STRING_0= RULE_STRING )
            // InternalRDFTurtle.g:1641:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getQuotedStringAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuotedString"

    // $ANTLR start synpred2_InternalRDFTurtle
    public final void synpred2_InternalRDFTurtle_fragment() throws RecognitionException {   
        // InternalRDFTurtle.g:1569:4: ( ( RULE_ID ) )
        // InternalRDFTurtle.g:1569:5: ( RULE_ID )
        {
        // InternalRDFTurtle.g:1569:5: ( RULE_ID )
        // InternalRDFTurtle.g:1570:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalRDFTurtle

    // Delegated rules

    public final boolean synpred2_InternalRDFTurtle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalRDFTurtle_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003580F0032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200400030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000035E0F03F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000035E0F03F2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003DE0F03F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});

}