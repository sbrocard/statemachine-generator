package net.sb.statemachine.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.sb.statemachine.dsl.services.StmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'events'", "'end'", "'commands'", "'guard'", "'state'", "'entryActions'", "'{'", "'}'", "'do'", "'exitActions'", "'['", "']'", "'=>'", "'/'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalStmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStmParser.tokenNames; }
    public String getGrammarFileName() { return "../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g"; }



     	private StmGrammarAccess grammarAccess;
     	
        public InternalStmParser(TokenStream input, StmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Statemachine";	
       	}
       	
       	@Override
       	protected StmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStatemachine"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:67:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:68:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:69:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine75);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine85); 

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
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:76:1: ruleStatemachine returns [EObject current=null] : ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= 'end' otherlv_4= 'commands' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= 'end' otherlv_7= 'guard' ( (lv_guards_8_0= ruleGuard ) )* otherlv_9= 'end' ( (lv_states_10_0= ruleState ) )* ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_events_2_0 = null;

        EObject lv_commands_5_0 = null;

        EObject lv_guards_8_0 = null;

        EObject lv_states_10_0 = null;


         enterRule(); 
            
        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:79:28: ( ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= 'end' otherlv_4= 'commands' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= 'end' otherlv_7= 'guard' ( (lv_guards_8_0= ruleGuard ) )* otherlv_9= 'end' ( (lv_states_10_0= ruleState ) )* ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:80:1: ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= 'end' otherlv_4= 'commands' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= 'end' otherlv_7= 'guard' ( (lv_guards_8_0= ruleGuard ) )* otherlv_9= 'end' ( (lv_states_10_0= ruleState ) )* )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:80:1: ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= 'end' otherlv_4= 'commands' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= 'end' otherlv_7= 'guard' ( (lv_guards_8_0= ruleGuard ) )* otherlv_9= 'end' ( (lv_states_10_0= ruleState ) )* )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:80:2: () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= 'end' otherlv_4= 'commands' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= 'end' otherlv_7= 'guard' ( (lv_guards_8_0= ruleGuard ) )* otherlv_9= 'end' ( (lv_states_10_0= ruleState ) )*
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:80:2: ()
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleStatemachine131); 

                	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1());
                
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:90:1: ( (lv_events_2_0= ruleEvent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:91:1: (lv_events_2_0= ruleEvent )
            	    {
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:91:1: (lv_events_2_0= ruleEvent )
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:92:3: lv_events_2_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine152);
            	    lv_events_2_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_2_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine165); 

                	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleStatemachine177); 

                	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getCommandsKeyword_4());
                
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:116:1: ( (lv_commands_5_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:117:1: (lv_commands_5_0= ruleCommand )
            	    {
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:117:1: (lv_commands_5_0= ruleCommand )
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:118:3: lv_commands_5_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleStatemachine198);
            	    lv_commands_5_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_5_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine211); 

                	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleStatemachine223); 

                	newLeafNode(otherlv_7, grammarAccess.getStatemachineAccess().getGuardKeyword_7());
                
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:142:1: ( (lv_guards_8_0= ruleGuard ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:143:1: (lv_guards_8_0= ruleGuard )
            	    {
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:143:1: (lv_guards_8_0= ruleGuard )
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:144:3: lv_guards_8_0= ruleGuard
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getGuardsGuardParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGuard_in_ruleStatemachine244);
            	    lv_guards_8_0=ruleGuard();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"guards",
            	            		lv_guards_8_0, 
            	            		"Guard");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine257); 

                	newLeafNode(otherlv_9, grammarAccess.getStatemachineAccess().getEndKeyword_9());
                
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:164:1: ( (lv_states_10_0= ruleState ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:165:1: (lv_states_10_0= ruleState )
            	    {
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:165:1: (lv_states_10_0= ruleState )
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:166:3: lv_states_10_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine278);
            	    lv_states_10_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_10_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEvent"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:190:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:191:2: (iv_ruleEvent= ruleEvent EOF )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:192:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent315);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent325); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:199:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:202:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:203:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:203:1: ( (lv_name_0_0= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:204:1: (lv_name_0_0= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:204:1: (lv_name_0_0= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:205:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent366); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCommand"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:229:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:230:2: (iv_ruleCommand= ruleCommand EOF )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:231:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand406);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand416); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:238:1: ruleCommand returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:241:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:242:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:242:1: ( (lv_name_0_0= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:243:1: (lv_name_0_0= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:243:1: (lv_name_0_0= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:244:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand457); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleState"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:268:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:269:2: (iv_ruleState= ruleState EOF )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:270:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState497);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState507); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:277:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )? ( (lv_states_9_0= ruleState ) )* ( (lv_selfEvents_10_0= ruleSelfEvent ) )* ( (lv_transitions_11_0= ruleTransition ) )* (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? otherlv_16= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_states_9_0 = null;

        EObject lv_selfEvents_10_0 = null;

        EObject lv_transitions_11_0 = null;


         enterRule(); 
            
        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:280:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )? ( (lv_states_9_0= ruleState ) )* ( (lv_selfEvents_10_0= ruleSelfEvent ) )* ( (lv_transitions_11_0= ruleTransition ) )* (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? otherlv_16= 'end' ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:281:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )? ( (lv_states_9_0= ruleState ) )* ( (lv_selfEvents_10_0= ruleSelfEvent ) )* ( (lv_transitions_11_0= ruleTransition ) )* (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? otherlv_16= 'end' )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:281:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )? ( (lv_states_9_0= ruleState ) )* ( (lv_selfEvents_10_0= ruleSelfEvent ) )* ( (lv_transitions_11_0= ruleTransition ) )* (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? otherlv_16= 'end' )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:281:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )? ( (lv_states_9_0= ruleState ) )* ( (lv_selfEvents_10_0= ruleSelfEvent ) )* ( (lv_transitions_11_0= ruleTransition ) )* (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? otherlv_16= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleState544); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:285:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:286:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:286:1: (lv_name_1_0= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState561); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:303:2: (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:303:4: otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleState579); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getEntryActionsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleState591); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:311:1: ( (otherlv_4= RULE_ID ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:312:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:312:1: (otherlv_4= RULE_ID )
                    	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:313:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState611); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getStateAccess().getEntryActionsCommandCrossReference_2_2_0()); 
                    	    	

                    	    }


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

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleState624); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:328:3: (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:328:5: otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleState639); 

                        	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getDoKeyword_3_0());
                        
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:332:1: ( (otherlv_7= RULE_ID ) )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:333:1: (otherlv_7= RULE_ID )
                    {
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:333:1: (otherlv_7= RULE_ID )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:334:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState659); 

                    		newLeafNode(otherlv_7, grammarAccess.getStateAccess().getDoActionCommandCrossReference_3_1_0()); 
                    	

                    }


                    }

                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:345:2: ( (otherlv_8= RULE_ID ) )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:346:1: (otherlv_8= RULE_ID )
                    {
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:346:1: (otherlv_8= RULE_ID )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:347:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState679); 

                    		newLeafNode(otherlv_8, grammarAccess.getStateAccess().getStopActionCommandCrossReference_3_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:358:4: ( (lv_states_9_0= ruleState ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:359:1: (lv_states_9_0= ruleState )
            	    {
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:359:1: (lv_states_9_0= ruleState )
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:360:3: lv_states_9_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getStatesStateParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleState702);
            	    lv_states_9_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_9_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:376:3: ( (lv_selfEvents_10_0= ruleSelfEvent ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==21) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==RULE_ID) ) {
                            int LA9_5 = input.LA(4);

                            if ( (LA9_5==RULE_ID) ) {
                                int LA9_6 = input.LA(5);

                                if ( (LA9_6==22) ) {
                                    int LA9_7 = input.LA(6);

                                    if ( (LA9_7==24) ) {
                                        alt9=1;
                                    }


                                }


                            }
                            else if ( (LA9_5==22) ) {
                                int LA9_7 = input.LA(5);

                                if ( (LA9_7==24) ) {
                                    alt9=1;
                                }


                            }


                        }


                    }
                    else if ( (LA9_1==24) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:377:1: (lv_selfEvents_10_0= ruleSelfEvent )
            	    {
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:377:1: (lv_selfEvents_10_0= ruleSelfEvent )
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:378:3: lv_selfEvents_10_0= ruleSelfEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getSelfEventsSelfEventParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelfEvent_in_ruleState724);
            	    lv_selfEvents_10_0=ruleSelfEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"selfEvents",
            	            		lv_selfEvents_10_0, 
            	            		"SelfEvent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:394:3: ( (lv_transitions_11_0= ruleTransition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:395:1: (lv_transitions_11_0= ruleTransition )
            	    {
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:395:1: (lv_transitions_11_0= ruleTransition )
            	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:396:3: lv_transitions_11_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState746);
            	    lv_transitions_11_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_11_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:412:3: (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:412:5: otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleState760); 

                        	newLeafNode(otherlv_12, grammarAccess.getStateAccess().getExitActionsKeyword_7_0());
                        
                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleState772); 

                        	newLeafNode(otherlv_13, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:420:1: ( (otherlv_14= RULE_ID ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:421:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:421:1: (otherlv_14= RULE_ID )
                    	    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:422:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState792); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getStateAccess().getExitActionsCommandCrossReference_7_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleState805); 

                        	newLeafNode(otherlv_15, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,12,FOLLOW_12_in_ruleState819); 

                	newLeafNode(otherlv_16, grammarAccess.getStateAccess().getEndKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:449:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:450:2: (iv_ruleTransition= ruleTransition EOF )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:451:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition855);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition865); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:458:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_guard_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:461:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )? ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:462:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )? )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:462:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )? )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:462:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )?
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:462:2: ( (otherlv_0= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:463:1: (otherlv_0= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:463:1: (otherlv_0= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:464:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition910); 

            		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0()); 
            	

            }


            }

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:475:2: (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:475:4: otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTransition923); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:479:1: ( (lv_guard_2_0= ruleGuardCall ) )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:480:1: (lv_guard_2_0= ruleGuardCall )
                    {
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:480:1: (lv_guard_2_0= ruleGuardCall )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:481:3: lv_guard_2_0= ruleGuardCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardGuardCallParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGuardCall_in_ruleTransition944);
                    lv_guard_2_0=ruleGuardCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"guard",
                            		lv_guard_2_0, 
                            		"GuardCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleTransition956); 

                        	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleTransition970); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_2());
                
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:505:1: ( (otherlv_5= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:506:1: (otherlv_5= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:506:1: (otherlv_5= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:507:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition990); 

            		newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0()); 
            	

            }


            }

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:518:2: (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:518:4: otherlv_6= '/' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleTransition1003); 

                        	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getSolidusKeyword_4_0());
                        
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:522:1: ( (otherlv_7= RULE_ID ) )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:523:1: (otherlv_7= RULE_ID )
                    {
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:523:1: (otherlv_7= RULE_ID )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:524:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition1023); 

                    		newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getActionCommandCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleSelfEvent"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:543:1: entryRuleSelfEvent returns [EObject current=null] : iv_ruleSelfEvent= ruleSelfEvent EOF ;
    public final EObject entryRuleSelfEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfEvent = null;


        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:544:2: (iv_ruleSelfEvent= ruleSelfEvent EOF )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:545:2: iv_ruleSelfEvent= ruleSelfEvent EOF
            {
             newCompositeNode(grammarAccess.getSelfEventRule()); 
            pushFollow(FOLLOW_ruleSelfEvent_in_entryRuleSelfEvent1061);
            iv_ruleSelfEvent=ruleSelfEvent();

            state._fsp--;

             current =iv_ruleSelfEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfEvent1071); 

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
    // $ANTLR end "entryRuleSelfEvent"


    // $ANTLR start "ruleSelfEvent"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:552:1: ruleSelfEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '/' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleSelfEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_guard_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:555:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '/' ( (otherlv_5= RULE_ID ) ) ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:556:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '/' ( (otherlv_5= RULE_ID ) ) )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:556:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '/' ( (otherlv_5= RULE_ID ) ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:556:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '/' ( (otherlv_5= RULE_ID ) )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:556:2: ( (otherlv_0= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:557:1: (otherlv_0= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:557:1: (otherlv_0= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:558:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelfEventRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelfEvent1116); 

            		newLeafNode(otherlv_0, grammarAccess.getSelfEventAccess().getEventEventCrossReference_0_0()); 
            	

            }


            }

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:569:2: (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:569:4: otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSelfEvent1129); 

                        	newLeafNode(otherlv_1, grammarAccess.getSelfEventAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:573:1: ( (lv_guard_2_0= ruleGuardCall ) )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:574:1: (lv_guard_2_0= ruleGuardCall )
                    {
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:574:1: (lv_guard_2_0= ruleGuardCall )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:575:3: lv_guard_2_0= ruleGuardCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelfEventAccess().getGuardGuardCallParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGuardCall_in_ruleSelfEvent1150);
                    lv_guard_2_0=ruleGuardCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelfEventRule());
                    	        }
                           		set(
                           			current, 
                           			"guard",
                            		lv_guard_2_0, 
                            		"GuardCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSelfEvent1162); 

                        	newLeafNode(otherlv_3, grammarAccess.getSelfEventAccess().getRightSquareBracketKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleSelfEvent1176); 

                	newLeafNode(otherlv_4, grammarAccess.getSelfEventAccess().getSolidusKeyword_2());
                
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:599:1: ( (otherlv_5= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:600:1: (otherlv_5= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:600:1: (otherlv_5= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:601:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelfEventRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelfEvent1196); 

            		newLeafNode(otherlv_5, grammarAccess.getSelfEventAccess().getActionCommandCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelfEvent"


    // $ANTLR start "entryRuleGuardCall"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:620:1: entryRuleGuardCall returns [EObject current=null] : iv_ruleGuardCall= ruleGuardCall EOF ;
    public final EObject entryRuleGuardCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardCall = null;


        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:621:2: (iv_ruleGuardCall= ruleGuardCall EOF )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:622:2: iv_ruleGuardCall= ruleGuardCall EOF
            {
             newCompositeNode(grammarAccess.getGuardCallRule()); 
            pushFollow(FOLLOW_ruleGuardCall_in_entryRuleGuardCall1232);
            iv_ruleGuardCall=ruleGuardCall();

            state._fsp--;

             current =iv_ruleGuardCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuardCall1242); 

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
    // $ANTLR end "entryRuleGuardCall"


    // $ANTLR start "ruleGuardCall"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:629:1: ruleGuardCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameters_1_0= RULE_ID ) )? ) ;
    public final EObject ruleGuardCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parameters_1_0=null;

         enterRule(); 
            
        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:632:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameters_1_0= RULE_ID ) )? ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:633:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameters_1_0= RULE_ID ) )? )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:633:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameters_1_0= RULE_ID ) )? )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:633:2: ( (otherlv_0= RULE_ID ) ) ( (lv_parameters_1_0= RULE_ID ) )?
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:633:2: ( (otherlv_0= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:634:1: (otherlv_0= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:634:1: (otherlv_0= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:635:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuardCall1287); 

            		newLeafNode(otherlv_0, grammarAccess.getGuardCallAccess().getGuardGuardCrossReference_0_0()); 
            	

            }


            }

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:646:2: ( (lv_parameters_1_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:647:1: (lv_parameters_1_0= RULE_ID )
                    {
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:647:1: (lv_parameters_1_0= RULE_ID )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:648:3: lv_parameters_1_0= RULE_ID
                    {
                    lv_parameters_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuardCall1304); 

                    			newLeafNode(lv_parameters_1_0, grammarAccess.getGuardCallAccess().getParametersIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardCallRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"parameters",
                            		lv_parameters_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuardCall"


    // $ANTLR start "entryRuleGuard"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:672:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:673:2: (iv_ruleGuard= ruleGuard EOF )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:674:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard1346);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard1356); 

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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:681:1: ruleGuard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:684:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )? ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:685:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )? )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:685:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )? )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:685:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )?
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:685:2: ( (lv_name_0_0= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:686:1: (lv_name_0_0= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:686:1: (lv_name_0_0= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:687:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuard1398); 

            			newLeafNode(lv_name_0_0, grammarAccess.getGuardAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:703:2: (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:703:4: otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleGuard1416); 

                        	newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:707:1: ( (lv_parameters_2_0= ruleParameter ) )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:708:1: (lv_parameters_2_0= ruleParameter )
                    {
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:708:1: (lv_parameters_2_0= ruleParameter )
                    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:709:3: lv_parameters_2_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getParametersParameterParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleGuard1437);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGuardRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleGuard1449); 

                        	newLeafNode(otherlv_3, grammarAccess.getGuardAccess().getRightSquareBracketKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleParameter"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:737:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:738:2: (iv_ruleParameter= ruleParameter EOF )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:739:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1487);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1497); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:746:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;

         enterRule(); 
            
        try {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:749:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:750:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:750:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:750:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:750:2: ( (lv_name_0_0= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:751:1: (lv_name_0_0= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:751:1: (lv_name_0_0= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:752:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1539); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleParameter1556); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:772:1: ( (lv_type_2_0= RULE_ID ) )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:773:1: (lv_type_2_0= RULE_ID )
            {
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:773:1: (lv_type_2_0= RULE_ID )
            // ../net.sb.statemachine.dsl/src-gen/net/sb/statemachine/dsl/parser/antlr/internal/InternalStm.g:774:3: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1573); 

            			newLeafNode(lv_type_2_0, grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatemachine131 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine152 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine165 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatemachine177 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatemachine198 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine211 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStatemachine223 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleStatemachine244 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine257 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine278 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleState544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState561 = new BitSet(new long[]{0x0000000000199010L});
    public static final BitSet FOLLOW_16_in_ruleState579 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleState591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState611 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleState624 = new BitSet(new long[]{0x0000000000189010L});
    public static final BitSet FOLLOW_19_in_ruleState639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState679 = new BitSet(new long[]{0x0000000000109010L});
    public static final BitSet FOLLOW_ruleState_in_ruleState702 = new BitSet(new long[]{0x0000000000109010L});
    public static final BitSet FOLLOW_ruleSelfEvent_in_ruleState724 = new BitSet(new long[]{0x0000000000101010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState746 = new BitSet(new long[]{0x0000000000101010L});
    public static final BitSet FOLLOW_20_in_ruleState760 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleState772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState792 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleState805 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition910 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21_in_ruleTransition923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGuardCall_in_ruleTransition944 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransition956 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransition970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition990 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleTransition1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfEvent_in_entryRuleSelfEvent1061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfEvent1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelfEvent1116 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_ruleSelfEvent1129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGuardCall_in_ruleSelfEvent1150 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSelfEvent1162 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSelfEvent1176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelfEvent1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuardCall_in_entryRuleGuardCall1232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuardCall1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuardCall1287 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuardCall1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard1346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuard1398 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleGuard1416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleGuard1437 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGuard1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1539 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleParameter1556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1573 = new BitSet(new long[]{0x0000000000000002L});

}