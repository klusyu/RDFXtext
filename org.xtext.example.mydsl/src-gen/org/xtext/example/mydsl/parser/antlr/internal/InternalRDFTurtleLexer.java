package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRDFTurtleLexer extends Lexer {
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

    public InternalRDFTurtleLexer() {;} 
    public InternalRDFTurtleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRDFTurtleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRDFTurtle.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:11:7: ( '.' )
            // InternalRDFTurtle.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:12:7: ( '@prefix' )
            // InternalRDFTurtle.g:12:9: '@prefix'
            {
            match("@prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:13:7: ( '@base' )
            // InternalRDFTurtle.g:13:9: '@base'
            {
            match("@base"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:14:7: ( 'PREFIX' )
            // InternalRDFTurtle.g:14:9: 'PREFIX'
            {
            match("PREFIX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:15:7: ( 'BASE' )
            // InternalRDFTurtle.g:15:9: 'BASE'
            {
            match("BASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:16:7: ( ';' )
            // InternalRDFTurtle.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:17:7: ( ',' )
            // InternalRDFTurtle.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:18:7: ( 'a' )
            // InternalRDFTurtle.g:18:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:19:7: ( '@' )
            // InternalRDFTurtle.g:19:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:20:7: ( '^^' )
            // InternalRDFTurtle.g:20:9: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:21:7: ( 'true' )
            // InternalRDFTurtle.g:21:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:22:7: ( 'false' )
            // InternalRDFTurtle.g:22:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:23:7: ( '[]' )
            // InternalRDFTurtle.g:23:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:24:7: ( '[' )
            // InternalRDFTurtle.g:24:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:25:7: ( ']' )
            // InternalRDFTurtle.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:26:7: ( '(' )
            // InternalRDFTurtle.g:26:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:27:7: ( ')' )
            // InternalRDFTurtle.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:28:7: ( '_:' )
            // InternalRDFTurtle.g:28:9: '_:'
            {
            match("_:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:29:7: ( ':' )
            // InternalRDFTurtle.g:29:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:1650:13: ( ( '-' | '+' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT ) )
            // InternalRDFTurtle.g:1650:15: ( '-' | '+' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )
            {
            // InternalRDFTurtle.g:1650:15: ( '-' | '+' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRDFTurtle.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalRDFTurtle.g:1650:26: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalRDFTurtle.g:1650:27: ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT
                    {
                    // InternalRDFTurtle.g:1650:27: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRDFTurtle.g:1650:28: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    match('.'); 
                    // InternalRDFTurtle.g:1650:43: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRDFTurtle.g:1650:44: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:1650:69: '.' ( '0' .. '9' )+ RULE_EXPONENT
                    {
                    match('.'); 
                    // InternalRDFTurtle.g:1650:73: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRDFTurtle.g:1650:74: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalRDFTurtle.g:1650:99: ( '0' .. '9' )+ RULE_EXPONENT
                    {
                    // InternalRDFTurtle.g:1650:99: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRDFTurtle.g:1650:100: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:1652:14: ( ( '-' | '+' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ ) )
            // InternalRDFTurtle.g:1652:16: ( '-' | '+' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            {
            // InternalRDFTurtle.g:1652:16: ( '-' | '+' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRDFTurtle.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalRDFTurtle.g:1652:27: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                alt11=1;
            }
            else if ( (LA11_0=='.') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRDFTurtle.g:1652:28: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // InternalRDFTurtle.g:1652:28: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRDFTurtle.g:1652:29: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    match('.'); 
                    // InternalRDFTurtle.g:1652:44: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRDFTurtle.g:1652:45: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:1652:56: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalRDFTurtle.g:1652:60: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRDFTurtle.g:1652:61: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalRDFTurtle.g:1654:24: ( ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )+ )
            // InternalRDFTurtle.g:1654:26: ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRDFTurtle.g:1654:36: ( '-' | '+' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRDFTurtle.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalRDFTurtle.g:1654:47: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRDFTurtle.g:1654:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_IRIREF"
    public final void mRULE_IRIREF() throws RecognitionException {
        try {
            int _type = RULE_IRIREF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:1656:13: ( '<' ( options {greedy=false; } : . )* '>' )
            // InternalRDFTurtle.g:1656:15: '<' ( options {greedy=false; } : . )* '>'
            {
            match('<'); 
            // InternalRDFTurtle.g:1656:19: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='>') ) {
                    alt14=2;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='=')||(LA14_0>='?' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRDFTurtle.g:1656:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IRIREF"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:1658:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalRDFTurtle.g:1658:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // InternalRDFTurtle.g:1658:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRDFTurtle.g:1658:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRDFTurtle.g:1658:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='-'||(LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRDFTurtle.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:1660:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRDFTurtle.g:1660:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalRDFTurtle.g:1660:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRDFTurtle.g:1660:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalRDFTurtle.g:1660:39: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRDFTurtle.g:1660:40: ( '\\r' )? '\\n'
                    {
                    // InternalRDFTurtle.g:1660:40: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalRDFTurtle.g:1660:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:1662:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' ) )
            // InternalRDFTurtle.g:1662:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            {
            // InternalRDFTurtle.g:1662:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\"') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='\"') ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3=='\"') ) {
                        alt23=3;
                    }
                    else {
                        alt23=1;}
                }
                else if ( ((LA23_1>='\u0000' && LA23_1<='!')||(LA23_1>='#' && LA23_1<='\uFFFF')) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0=='\'') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalRDFTurtle.g:1662:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRDFTurtle.g:1662:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRDFTurtle.g:1662:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRDFTurtle.g:1662:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRDFTurtle.g:1662:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRDFTurtle.g:1662:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\\') ) {
                            alt21=1;
                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRDFTurtle.g:1662:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRDFTurtle.g:1662:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 3 :
                    // InternalRDFTurtle.g:1662:83: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // InternalRDFTurtle.g:1662:89: ( options {greedy=false; } : . )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\"') ) {
                            int LA22_1 = input.LA(2);

                            if ( (LA22_1=='\"') ) {
                                int LA22_3 = input.LA(3);

                                if ( (LA22_3=='\"') ) {
                                    alt22=2;
                                }
                                else if ( ((LA22_3>='\u0000' && LA22_3<='!')||(LA22_3>='#' && LA22_3<='\uFFFF')) ) {
                                    alt22=1;
                                }


                            }
                            else if ( ((LA22_1>='\u0000' && LA22_1<='!')||(LA22_1>='#' && LA22_1<='\uFFFF')) ) {
                                alt22=1;
                            }


                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRDFTurtle.g:1662:117: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:1664:10: ( ( '0' .. '9' )+ )
            // InternalRDFTurtle.g:1664:12: ( '0' .. '9' )+
            {
            // InternalRDFTurtle.g:1664:12: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRDFTurtle.g:1664:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:1666:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRDFTurtle.g:1666:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRDFTurtle.g:1666:24: ( options {greedy=false; } : . )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='*') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='/') ) {
                        alt25=2;
                    }
                    else if ( ((LA25_1>='\u0000' && LA25_1<='.')||(LA25_1>='0' && LA25_1<='\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<=')')||(LA25_0>='+' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRDFTurtle.g:1666:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:1668:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRDFTurtle.g:1668:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRDFTurtle.g:1668:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRDFTurtle.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRDFTurtle.g:1670:16: ( . )
            // InternalRDFTurtle.g:1670:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRDFTurtle.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_DOUBLE | RULE_DECIMAL | RULE_IRIREF | RULE_ID | RULE_SL_COMMENT | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt27=29;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // InternalRDFTurtle.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalRDFTurtle.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalRDFTurtle.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalRDFTurtle.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalRDFTurtle.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalRDFTurtle.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalRDFTurtle.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalRDFTurtle.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalRDFTurtle.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalRDFTurtle.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalRDFTurtle.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalRDFTurtle.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalRDFTurtle.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalRDFTurtle.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalRDFTurtle.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalRDFTurtle.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalRDFTurtle.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalRDFTurtle.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalRDFTurtle.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalRDFTurtle.g:1:124: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 21 :
                // InternalRDFTurtle.g:1:136: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 22 :
                // InternalRDFTurtle.g:1:149: RULE_IRIREF
                {
                mRULE_IRIREF(); 

                }
                break;
            case 23 :
                // InternalRDFTurtle.g:1:161: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // InternalRDFTurtle.g:1:169: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalRDFTurtle.g:1:185: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalRDFTurtle.g:1:197: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalRDFTurtle.g:1:206: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // InternalRDFTurtle.g:1:222: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // InternalRDFTurtle.g:1:230: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA6_eotS =
        "\5\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\2\56\3\uffff";
    static final String DFA6_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA6_specialS =
        "\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1650:26: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )";
        }
    }
    static final String DFA27_eotS =
        "\1\uffff\1\34\1\37\2\41\2\uffff\1\45\1\32\2\41\1\52\3\uffff\1\41\1\uffff\1\32\1\65\1\32\2\uffff\3\32\2\uffff\1\73\4\uffff\1\41\1\uffff\1\41\4\uffff\2\41\11\uffff\1\73\1\65\10\uffff\4\41\1\73\1\41\1\106\1\107\2\41\2\uffff\1\112\1\113\2\uffff";
    static final String DFA27_eofS =
        "\114\uffff";
    static final String DFA27_minS =
        "\1\0\1\60\1\142\1\122\1\101\2\uffff\1\55\1\101\1\162\1\141\1\135\3\uffff\1\72\1\uffff\2\56\1\0\2\uffff\2\0\1\52\2\uffff\1\60\4\uffff\1\105\1\uffff\1\123\4\uffff\1\165\1\154\7\uffff\1\56\2\60\1\56\10\uffff\1\106\1\105\1\145\1\163\1\60\1\111\2\55\1\145\1\130\2\uffff\2\55\2\uffff";
    static final String DFA27_maxS =
        "\1\uffff\1\71\1\160\1\122\1\101\2\uffff\2\172\1\162\1\141\1\135\3\uffff\1\72\1\uffff\1\71\1\145\1\uffff\2\uffff\2\uffff\1\52\2\uffff\1\145\4\uffff\1\105\1\uffff\1\123\4\uffff\1\165\1\154\7\uffff\1\145\1\71\2\145\10\uffff\1\106\1\105\1\145\1\163\1\145\1\111\2\172\1\145\1\130\2\uffff\2\172\2\uffff";
    static final String DFA27_acceptS =
        "\5\uffff\1\6\1\7\5\uffff\1\17\1\20\1\21\1\uffff\1\23\3\uffff\1\27\1\30\3\uffff\1\34\1\35\1\uffff\1\1\1\2\1\3\1\11\1\uffff\1\27\1\uffff\1\6\1\7\1\10\1\12\2\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\4\uffff\1\24\1\32\1\26\1\30\1\31\1\33\1\34\1\25\12\uffff\1\5\1\13\2\uffff\1\14\1\4";
    static final String DFA27_specialS =
        "\1\3\22\uffff\1\1\2\uffff\1\2\1\0\64\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\1\25\3\32\1\27\1\15\1\16\1\32\1\21\1\6\1\21\1\1\1\30\12\22\1\20\1\5\1\23\3\32\1\2\1\24\1\4\15\24\1\3\12\24\1\13\1\32\1\14\1\10\1\17\1\32\1\7\4\24\1\12\15\24\1\11\6\24\uff85\32",
            "\12\33",
            "\1\36\15\uffff\1\35",
            "\1\40",
            "\1\42",
            "",
            "",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\32\41\3\uffff\1\46\1\41\1\uffff\32\41",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "\1\56",
            "",
            "\1\61\1\uffff\12\60",
            "\1\62\1\uffff\12\63\13\uffff\1\64\37\uffff\1\64",
            "\0\66",
            "",
            "",
            "\0\70",
            "\0\70",
            "\1\71",
            "",
            "",
            "\12\33\13\uffff\1\64\37\uffff\1\64",
            "",
            "",
            "",
            "",
            "\1\74",
            "",
            "\1\75",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\1\uffff\12\60\13\uffff\1\64\37\uffff\1\64",
            "\12\33",
            "\12\100\13\uffff\1\64\37\uffff\1\64",
            "\1\62\1\uffff\12\63\13\uffff\1\64\37\uffff\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\100\13\uffff\1\64\37\uffff\1\64",
            "\1\105",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\110",
            "\1\111",
            "",
            "",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\41\2\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_DOUBLE | RULE_DECIMAL | RULE_IRIREF | RULE_ID | RULE_SL_COMMENT | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_23 = input.LA(1);

                        s = -1;
                        if ( ((LA27_23>='\u0000' && LA27_23<='\uFFFF')) ) {s = 56;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_19 = input.LA(1);

                        s = -1;
                        if ( ((LA27_19>='\u0000' && LA27_19<='\uFFFF')) ) {s = 54;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_22 = input.LA(1);

                        s = -1;
                        if ( ((LA27_22>='\u0000' && LA27_22<='\uFFFF')) ) {s = 56;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0=='.') ) {s = 1;}

                        else if ( (LA27_0=='@') ) {s = 2;}

                        else if ( (LA27_0=='P') ) {s = 3;}

                        else if ( (LA27_0=='B') ) {s = 4;}

                        else if ( (LA27_0==';') ) {s = 5;}

                        else if ( (LA27_0==',') ) {s = 6;}

                        else if ( (LA27_0=='a') ) {s = 7;}

                        else if ( (LA27_0=='^') ) {s = 8;}

                        else if ( (LA27_0=='t') ) {s = 9;}

                        else if ( (LA27_0=='f') ) {s = 10;}

                        else if ( (LA27_0=='[') ) {s = 11;}

                        else if ( (LA27_0==']') ) {s = 12;}

                        else if ( (LA27_0=='(') ) {s = 13;}

                        else if ( (LA27_0==')') ) {s = 14;}

                        else if ( (LA27_0=='_') ) {s = 15;}

                        else if ( (LA27_0==':') ) {s = 16;}

                        else if ( (LA27_0=='+'||LA27_0=='-') ) {s = 17;}

                        else if ( ((LA27_0>='0' && LA27_0<='9')) ) {s = 18;}

                        else if ( (LA27_0=='<') ) {s = 19;}

                        else if ( (LA27_0=='A'||(LA27_0>='C' && LA27_0<='O')||(LA27_0>='Q' && LA27_0<='Z')||(LA27_0>='b' && LA27_0<='e')||(LA27_0>='g' && LA27_0<='s')||(LA27_0>='u' && LA27_0<='z')) ) {s = 20;}

                        else if ( (LA27_0=='#') ) {s = 21;}

                        else if ( (LA27_0=='\"') ) {s = 22;}

                        else if ( (LA27_0=='\'') ) {s = 23;}

                        else if ( (LA27_0=='/') ) {s = 24;}

                        else if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {s = 25;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\u001F')||LA27_0=='!'||(LA27_0>='$' && LA27_0<='&')||LA27_0=='*'||(LA27_0>='=' && LA27_0<='?')||LA27_0=='\\'||LA27_0=='`'||(LA27_0>='{' && LA27_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}