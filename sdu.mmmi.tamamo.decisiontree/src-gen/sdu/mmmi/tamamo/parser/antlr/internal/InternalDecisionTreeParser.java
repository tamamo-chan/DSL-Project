package sdu.mmmi.tamamo.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sdu.mmmi.tamamo.services.DecisionTreeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDecisionTreeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Decisions:'", "'Input:'", "'Parameters:'", "'Rules:'", "'Conclusion:'", "','", "'('", "')'", "'int'", "'string'", "'bool'", "'='", "'?'", "'>'", "'<'", "'>='", "'<='", "':'", "'else:'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDecisionTreeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDecisionTreeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDecisionTreeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDecisionTree.g"; }



     	private DecisionTreeGrammarAccess grammarAccess;

        public InternalDecisionTreeParser(TokenStream input, DecisionTreeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Start";
       	}

       	@Override
       	protected DecisionTreeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStart"
    // InternalDecisionTree.g:64:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // InternalDecisionTree.g:64:46: (iv_ruleStart= ruleStart EOF )
            // InternalDecisionTree.g:65:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalDecisionTree.g:71:1: ruleStart returns [EObject current=null] : (otherlv_0= 'Decisions:' ( (lv_decision_1_0= ruleDecision ) ) otherlv_2= 'Input:' ( (lv_input_3_0= ruleInput ) ) otherlv_4= 'Parameters:' ( (lv_parameter_5_0= ruleParameter ) ) otherlv_6= 'Rules:' ( (lv_rules_7_0= ruleRules ) ) otherlv_8= 'Conclusion:' ( (lv_conclusion_9_0= ruleConclusion ) ) ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_decision_1_0 = null;

        EObject lv_input_3_0 = null;

        EObject lv_parameter_5_0 = null;

        EObject lv_rules_7_0 = null;

        EObject lv_conclusion_9_0 = null;



        	enterRule();

        try {
            // InternalDecisionTree.g:77:2: ( (otherlv_0= 'Decisions:' ( (lv_decision_1_0= ruleDecision ) ) otherlv_2= 'Input:' ( (lv_input_3_0= ruleInput ) ) otherlv_4= 'Parameters:' ( (lv_parameter_5_0= ruleParameter ) ) otherlv_6= 'Rules:' ( (lv_rules_7_0= ruleRules ) ) otherlv_8= 'Conclusion:' ( (lv_conclusion_9_0= ruleConclusion ) ) ) )
            // InternalDecisionTree.g:78:2: (otherlv_0= 'Decisions:' ( (lv_decision_1_0= ruleDecision ) ) otherlv_2= 'Input:' ( (lv_input_3_0= ruleInput ) ) otherlv_4= 'Parameters:' ( (lv_parameter_5_0= ruleParameter ) ) otherlv_6= 'Rules:' ( (lv_rules_7_0= ruleRules ) ) otherlv_8= 'Conclusion:' ( (lv_conclusion_9_0= ruleConclusion ) ) )
            {
            // InternalDecisionTree.g:78:2: (otherlv_0= 'Decisions:' ( (lv_decision_1_0= ruleDecision ) ) otherlv_2= 'Input:' ( (lv_input_3_0= ruleInput ) ) otherlv_4= 'Parameters:' ( (lv_parameter_5_0= ruleParameter ) ) otherlv_6= 'Rules:' ( (lv_rules_7_0= ruleRules ) ) otherlv_8= 'Conclusion:' ( (lv_conclusion_9_0= ruleConclusion ) ) )
            // InternalDecisionTree.g:79:3: otherlv_0= 'Decisions:' ( (lv_decision_1_0= ruleDecision ) ) otherlv_2= 'Input:' ( (lv_input_3_0= ruleInput ) ) otherlv_4= 'Parameters:' ( (lv_parameter_5_0= ruleParameter ) ) otherlv_6= 'Rules:' ( (lv_rules_7_0= ruleRules ) ) otherlv_8= 'Conclusion:' ( (lv_conclusion_9_0= ruleConclusion ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStartAccess().getDecisionsKeyword_0());
            		
            // InternalDecisionTree.g:83:3: ( (lv_decision_1_0= ruleDecision ) )
            // InternalDecisionTree.g:84:4: (lv_decision_1_0= ruleDecision )
            {
            // InternalDecisionTree.g:84:4: (lv_decision_1_0= ruleDecision )
            // InternalDecisionTree.g:85:5: lv_decision_1_0= ruleDecision
            {

            					newCompositeNode(grammarAccess.getStartAccess().getDecisionDecisionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_decision_1_0=ruleDecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartRule());
            					}
            					set(
            						current,
            						"decision",
            						lv_decision_1_0,
            						"sdu.mmmi.tamamo.DecisionTree.Decision");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStartAccess().getInputKeyword_2());
            		
            // InternalDecisionTree.g:106:3: ( (lv_input_3_0= ruleInput ) )
            // InternalDecisionTree.g:107:4: (lv_input_3_0= ruleInput )
            {
            // InternalDecisionTree.g:107:4: (lv_input_3_0= ruleInput )
            // InternalDecisionTree.g:108:5: lv_input_3_0= ruleInput
            {

            					newCompositeNode(grammarAccess.getStartAccess().getInputInputParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_input_3_0=ruleInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_3_0,
            						"sdu.mmmi.tamamo.DecisionTree.Input");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getStartAccess().getParametersKeyword_4());
            		
            // InternalDecisionTree.g:129:3: ( (lv_parameter_5_0= ruleParameter ) )
            // InternalDecisionTree.g:130:4: (lv_parameter_5_0= ruleParameter )
            {
            // InternalDecisionTree.g:130:4: (lv_parameter_5_0= ruleParameter )
            // InternalDecisionTree.g:131:5: lv_parameter_5_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getStartAccess().getParameterParameterParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_parameter_5_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_5_0,
            						"sdu.mmmi.tamamo.DecisionTree.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getStartAccess().getRulesKeyword_6());
            		
            // InternalDecisionTree.g:152:3: ( (lv_rules_7_0= ruleRules ) )
            // InternalDecisionTree.g:153:4: (lv_rules_7_0= ruleRules )
            {
            // InternalDecisionTree.g:153:4: (lv_rules_7_0= ruleRules )
            // InternalDecisionTree.g:154:5: lv_rules_7_0= ruleRules
            {

            					newCompositeNode(grammarAccess.getStartAccess().getRulesRulesParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_rules_7_0=ruleRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartRule());
            					}
            					set(
            						current,
            						"rules",
            						lv_rules_7_0,
            						"sdu.mmmi.tamamo.DecisionTree.Rules");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getStartAccess().getConclusionKeyword_8());
            		
            // InternalDecisionTree.g:175:3: ( (lv_conclusion_9_0= ruleConclusion ) )
            // InternalDecisionTree.g:176:4: (lv_conclusion_9_0= ruleConclusion )
            {
            // InternalDecisionTree.g:176:4: (lv_conclusion_9_0= ruleConclusion )
            // InternalDecisionTree.g:177:5: lv_conclusion_9_0= ruleConclusion
            {

            					newCompositeNode(grammarAccess.getStartAccess().getConclusionConclusionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_conclusion_9_0=ruleConclusion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartRule());
            					}
            					set(
            						current,
            						"conclusion",
            						lv_conclusion_9_0,
            						"sdu.mmmi.tamamo.DecisionTree.Conclusion");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleDecision"
    // InternalDecisionTree.g:198:1: entryRuleDecision returns [EObject current=null] : iv_ruleDecision= ruleDecision EOF ;
    public final EObject entryRuleDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecision = null;


        try {
            // InternalDecisionTree.g:198:49: (iv_ruleDecision= ruleDecision EOF )
            // InternalDecisionTree.g:199:2: iv_ruleDecision= ruleDecision EOF
            {
             newCompositeNode(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecision=ruleDecision();

            state._fsp--;

             current =iv_ruleDecision; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDecision"


    // $ANTLR start "ruleDecision"
    // InternalDecisionTree.g:205:1: ruleDecision returns [EObject current=null] : ( ( ( (lv_text_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleDecision ) ) )? ) | ( ( (lv_text_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_nested_5_0= ruleDecision ) ) otherlv_6= ')' (otherlv_7= ',' ( (lv_next_8_0= ruleDecision ) ) )? ) ) ;
    public final EObject ruleDecision() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token otherlv_1=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_next_2_0 = null;

        EObject lv_nested_5_0 = null;

        EObject lv_next_8_0 = null;



        	enterRule();

        try {
            // InternalDecisionTree.g:211:2: ( ( ( ( (lv_text_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleDecision ) ) )? ) | ( ( (lv_text_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_nested_5_0= ruleDecision ) ) otherlv_6= ')' (otherlv_7= ',' ( (lv_next_8_0= ruleDecision ) ) )? ) ) )
            // InternalDecisionTree.g:212:2: ( ( ( (lv_text_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleDecision ) ) )? ) | ( ( (lv_text_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_nested_5_0= ruleDecision ) ) otherlv_6= ')' (otherlv_7= ',' ( (lv_next_8_0= ruleDecision ) ) )? ) )
            {
            // InternalDecisionTree.g:212:2: ( ( ( (lv_text_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleDecision ) ) )? ) | ( ( (lv_text_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_nested_5_0= ruleDecision ) ) otherlv_6= ')' (otherlv_7= ',' ( (lv_next_8_0= ruleDecision ) ) )? ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=RULE_ID && LA3_1<=RULE_INT)||LA3_1==12||LA3_1==16||LA3_1==18||LA3_1==29) ) {
                    alt3=1;
                }
                else if ( (LA3_1==17) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDecisionTree.g:213:3: ( ( (lv_text_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleDecision ) ) )? )
                    {
                    // InternalDecisionTree.g:213:3: ( ( (lv_text_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleDecision ) ) )? )
                    // InternalDecisionTree.g:214:4: ( (lv_text_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleDecision ) ) )?
                    {
                    // InternalDecisionTree.g:214:4: ( (lv_text_0_0= RULE_ID ) )
                    // InternalDecisionTree.g:215:5: (lv_text_0_0= RULE_ID )
                    {
                    // InternalDecisionTree.g:215:5: (lv_text_0_0= RULE_ID )
                    // InternalDecisionTree.g:216:6: lv_text_0_0= RULE_ID
                    {
                    lv_text_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_text_0_0, grammarAccess.getDecisionAccess().getTextIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecisionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalDecisionTree.g:232:4: (otherlv_1= ',' ( (lv_next_2_0= ruleDecision ) ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==16) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalDecisionTree.g:233:5: otherlv_1= ',' ( (lv_next_2_0= ruleDecision ) )
                            {
                            otherlv_1=(Token)match(input,16,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getDecisionAccess().getCommaKeyword_0_1_0());
                            				
                            // InternalDecisionTree.g:237:5: ( (lv_next_2_0= ruleDecision ) )
                            // InternalDecisionTree.g:238:6: (lv_next_2_0= ruleDecision )
                            {
                            // InternalDecisionTree.g:238:6: (lv_next_2_0= ruleDecision )
                            // InternalDecisionTree.g:239:7: lv_next_2_0= ruleDecision
                            {

                            							newCompositeNode(grammarAccess.getDecisionAccess().getNextDecisionParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_next_2_0=ruleDecision();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDecisionRule());
                            							}
                            							set(
                            								current,
                            								"next",
                            								lv_next_2_0,
                            								"sdu.mmmi.tamamo.DecisionTree.Decision");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDecisionTree.g:259:3: ( ( (lv_text_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_nested_5_0= ruleDecision ) ) otherlv_6= ')' (otherlv_7= ',' ( (lv_next_8_0= ruleDecision ) ) )? )
                    {
                    // InternalDecisionTree.g:259:3: ( ( (lv_text_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_nested_5_0= ruleDecision ) ) otherlv_6= ')' (otherlv_7= ',' ( (lv_next_8_0= ruleDecision ) ) )? )
                    // InternalDecisionTree.g:260:4: ( (lv_text_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_nested_5_0= ruleDecision ) ) otherlv_6= ')' (otherlv_7= ',' ( (lv_next_8_0= ruleDecision ) ) )?
                    {
                    // InternalDecisionTree.g:260:4: ( (lv_text_3_0= RULE_ID ) )
                    // InternalDecisionTree.g:261:5: (lv_text_3_0= RULE_ID )
                    {
                    // InternalDecisionTree.g:261:5: (lv_text_3_0= RULE_ID )
                    // InternalDecisionTree.g:262:6: lv_text_3_0= RULE_ID
                    {
                    lv_text_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_text_3_0, grammarAccess.getDecisionAccess().getTextIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecisionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDecisionAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalDecisionTree.g:282:4: ( (lv_nested_5_0= ruleDecision ) )
                    // InternalDecisionTree.g:283:5: (lv_nested_5_0= ruleDecision )
                    {
                    // InternalDecisionTree.g:283:5: (lv_nested_5_0= ruleDecision )
                    // InternalDecisionTree.g:284:6: lv_nested_5_0= ruleDecision
                    {

                    						newCompositeNode(grammarAccess.getDecisionAccess().getNestedDecisionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nested_5_0=ruleDecision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionRule());
                    						}
                    						set(
                    							current,
                    							"nested",
                    							lv_nested_5_0,
                    							"sdu.mmmi.tamamo.DecisionTree.Decision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getDecisionAccess().getRightParenthesisKeyword_1_3());
                    			
                    // InternalDecisionTree.g:305:4: (otherlv_7= ',' ( (lv_next_8_0= ruleDecision ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==16) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalDecisionTree.g:306:5: otherlv_7= ',' ( (lv_next_8_0= ruleDecision ) )
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getDecisionAccess().getCommaKeyword_1_4_0());
                            				
                            // InternalDecisionTree.g:310:5: ( (lv_next_8_0= ruleDecision ) )
                            // InternalDecisionTree.g:311:6: (lv_next_8_0= ruleDecision )
                            {
                            // InternalDecisionTree.g:311:6: (lv_next_8_0= ruleDecision )
                            // InternalDecisionTree.g:312:7: lv_next_8_0= ruleDecision
                            {

                            							newCompositeNode(grammarAccess.getDecisionAccess().getNextDecisionParserRuleCall_1_4_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_next_8_0=ruleDecision();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDecisionRule());
                            							}
                            							set(
                            								current,
                            								"next",
                            								lv_next_8_0,
                            								"sdu.mmmi.tamamo.DecisionTree.Decision");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDecision"


    // $ANTLR start "entryRuleInput"
    // InternalDecisionTree.g:335:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalDecisionTree.g:335:46: (iv_ruleInput= ruleInput EOF )
            // InternalDecisionTree.g:336:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalDecisionTree.g:342:1: ruleInput returns [EObject current=null] : ( ( ( (lv_type_0_1= ruleInputInt | lv_type_0_2= ruleInputString | lv_type_0_3= ruleInputBool ) ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleInput ) ) )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;

        EObject lv_next_2_0 = null;



        	enterRule();

        try {
            // InternalDecisionTree.g:348:2: ( ( ( ( (lv_type_0_1= ruleInputInt | lv_type_0_2= ruleInputString | lv_type_0_3= ruleInputBool ) ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleInput ) ) )? ) )
            // InternalDecisionTree.g:349:2: ( ( ( (lv_type_0_1= ruleInputInt | lv_type_0_2= ruleInputString | lv_type_0_3= ruleInputBool ) ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleInput ) ) )? )
            {
            // InternalDecisionTree.g:349:2: ( ( ( (lv_type_0_1= ruleInputInt | lv_type_0_2= ruleInputString | lv_type_0_3= ruleInputBool ) ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleInput ) ) )? )
            // InternalDecisionTree.g:350:3: ( ( (lv_type_0_1= ruleInputInt | lv_type_0_2= ruleInputString | lv_type_0_3= ruleInputBool ) ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleInput ) ) )?
            {
            // InternalDecisionTree.g:350:3: ( ( (lv_type_0_1= ruleInputInt | lv_type_0_2= ruleInputString | lv_type_0_3= ruleInputBool ) ) )
            // InternalDecisionTree.g:351:4: ( (lv_type_0_1= ruleInputInt | lv_type_0_2= ruleInputString | lv_type_0_3= ruleInputBool ) )
            {
            // InternalDecisionTree.g:351:4: ( (lv_type_0_1= ruleInputInt | lv_type_0_2= ruleInputString | lv_type_0_3= ruleInputBool ) )
            // InternalDecisionTree.g:352:5: (lv_type_0_1= ruleInputInt | lv_type_0_2= ruleInputString | lv_type_0_3= ruleInputBool )
            {
            // InternalDecisionTree.g:352:5: (lv_type_0_1= ruleInputInt | lv_type_0_2= ruleInputString | lv_type_0_3= ruleInputBool )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDecisionTree.g:353:6: lv_type_0_1= ruleInputInt
                    {

                    						newCompositeNode(grammarAccess.getInputAccess().getTypeInputIntParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_0_1=ruleInputInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_1,
                    							"sdu.mmmi.tamamo.DecisionTree.InputInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalDecisionTree.g:369:6: lv_type_0_2= ruleInputString
                    {

                    						newCompositeNode(grammarAccess.getInputAccess().getTypeInputStringParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_0_2=ruleInputString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_2,
                    							"sdu.mmmi.tamamo.DecisionTree.InputString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalDecisionTree.g:385:6: lv_type_0_3= ruleInputBool
                    {

                    						newCompositeNode(grammarAccess.getInputAccess().getTypeInputBoolParserRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_0_3=ruleInputBool();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_3,
                    							"sdu.mmmi.tamamo.DecisionTree.InputBool");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalDecisionTree.g:403:3: (otherlv_1= ',' ( (lv_next_2_0= ruleInput ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDecisionTree.g:404:4: otherlv_1= ',' ( (lv_next_2_0= ruleInput ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
                    			
                    // InternalDecisionTree.g:408:4: ( (lv_next_2_0= ruleInput ) )
                    // InternalDecisionTree.g:409:5: (lv_next_2_0= ruleInput )
                    {
                    // InternalDecisionTree.g:409:5: (lv_next_2_0= ruleInput )
                    // InternalDecisionTree.g:410:6: lv_next_2_0= ruleInput
                    {

                    						newCompositeNode(grammarAccess.getInputAccess().getNextInputParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_next_2_0=ruleInput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputRule());
                    						}
                    						set(
                    							current,
                    							"next",
                    							lv_next_2_0,
                    							"sdu.mmmi.tamamo.DecisionTree.Input");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleInputInt"
    // InternalDecisionTree.g:432:1: entryRuleInputInt returns [EObject current=null] : iv_ruleInputInt= ruleInputInt EOF ;
    public final EObject entryRuleInputInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputInt = null;


        try {
            // InternalDecisionTree.g:432:49: (iv_ruleInputInt= ruleInputInt EOF )
            // InternalDecisionTree.g:433:2: iv_ruleInputInt= ruleInputInt EOF
            {
             newCompositeNode(grammarAccess.getInputIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputInt=ruleInputInt();

            state._fsp--;

             current =iv_ruleInputInt; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputInt"


    // $ANTLR start "ruleInputInt"
    // InternalDecisionTree.g:439:1: ruleInputInt returns [EObject current=null] : (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInputInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDecisionTree.g:445:2: ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDecisionTree.g:446:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDecisionTree.g:446:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDecisionTree.g:447:3: otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputIntAccess().getIntKeyword_0());
            		
            // InternalDecisionTree.g:451:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDecisionTree.g:452:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDecisionTree.g:452:4: (lv_name_1_0= RULE_ID )
            // InternalDecisionTree.g:453:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputIntAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputIntRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleInputInt"


    // $ANTLR start "entryRuleInputString"
    // InternalDecisionTree.g:473:1: entryRuleInputString returns [EObject current=null] : iv_ruleInputString= ruleInputString EOF ;
    public final EObject entryRuleInputString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputString = null;


        try {
            // InternalDecisionTree.g:473:52: (iv_ruleInputString= ruleInputString EOF )
            // InternalDecisionTree.g:474:2: iv_ruleInputString= ruleInputString EOF
            {
             newCompositeNode(grammarAccess.getInputStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputString=ruleInputString();

            state._fsp--;

             current =iv_ruleInputString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputString"


    // $ANTLR start "ruleInputString"
    // InternalDecisionTree.g:480:1: ruleInputString returns [EObject current=null] : (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInputString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDecisionTree.g:486:2: ( (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDecisionTree.g:487:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDecisionTree.g:487:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDecisionTree.g:488:3: otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputStringAccess().getStringKeyword_0());
            		
            // InternalDecisionTree.g:492:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDecisionTree.g:493:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDecisionTree.g:493:4: (lv_name_1_0= RULE_ID )
            // InternalDecisionTree.g:494:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputStringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleInputString"


    // $ANTLR start "entryRuleInputBool"
    // InternalDecisionTree.g:514:1: entryRuleInputBool returns [EObject current=null] : iv_ruleInputBool= ruleInputBool EOF ;
    public final EObject entryRuleInputBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBool = null;


        try {
            // InternalDecisionTree.g:514:50: (iv_ruleInputBool= ruleInputBool EOF )
            // InternalDecisionTree.g:515:2: iv_ruleInputBool= ruleInputBool EOF
            {
             newCompositeNode(grammarAccess.getInputBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputBool=ruleInputBool();

            state._fsp--;

             current =iv_ruleInputBool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputBool"


    // $ANTLR start "ruleInputBool"
    // InternalDecisionTree.g:521:1: ruleInputBool returns [EObject current=null] : (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInputBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDecisionTree.g:527:2: ( (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDecisionTree.g:528:2: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDecisionTree.g:528:2: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDecisionTree.g:529:3: otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputBoolAccess().getBoolKeyword_0());
            		
            // InternalDecisionTree.g:533:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDecisionTree.g:534:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDecisionTree.g:534:4: (lv_name_1_0= RULE_ID )
            // InternalDecisionTree.g:535:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputBoolAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputBoolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleInputBool"


    // $ANTLR start "entryRuleParameter"
    // InternalDecisionTree.g:555:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDecisionTree.g:555:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalDecisionTree.g:556:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDecisionTree.g:562:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ( (lv_next_3_0= ruleParameter ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        EObject lv_next_3_0 = null;



        	enterRule();

        try {
            // InternalDecisionTree.g:568:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ( (lv_next_3_0= ruleParameter ) )? ) )
            // InternalDecisionTree.g:569:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ( (lv_next_3_0= ruleParameter ) )? )
            {
            // InternalDecisionTree.g:569:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ( (lv_next_3_0= ruleParameter ) )? )
            // InternalDecisionTree.g:570:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ( (lv_next_3_0= ruleParameter ) )?
            {
            // InternalDecisionTree.g:570:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDecisionTree.g:571:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDecisionTree.g:571:4: (lv_name_0_0= RULE_ID )
            // InternalDecisionTree.g:572:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getEqualsSignKeyword_1());
            		
            // InternalDecisionTree.g:592:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDecisionTree.g:593:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDecisionTree.g:593:4: (lv_value_2_0= RULE_INT )
            // InternalDecisionTree.g:594:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_value_2_0, grammarAccess.getParameterAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDecisionTree.g:610:3: ( (lv_next_3_0= ruleParameter ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDecisionTree.g:611:4: (lv_next_3_0= ruleParameter )
                    {
                    // InternalDecisionTree.g:611:4: (lv_next_3_0= ruleParameter )
                    // InternalDecisionTree.g:612:5: lv_next_3_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getNextParameterParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_3_0=ruleParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_3_0,
                    						"sdu.mmmi.tamamo.DecisionTree.Parameter");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRules"
    // InternalDecisionTree.g:633:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // InternalDecisionTree.g:633:46: (iv_ruleRules= ruleRules EOF )
            // InternalDecisionTree.g:634:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalDecisionTree.g:640:1: ruleRules returns [EObject current=null] : ( ( (lv_left_0_0= ruleRuleType ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) )? otherlv_3= '?' ( (lv_affected_parameter_4_0= RULE_ID ) ) ( (lv_points_5_0= RULE_INT ) )? ( (lv_next_6_0= ruleRules ) )? ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_affected_parameter_4_0=null;
        Token lv_points_5_0=null;
        AntlrDatatypeRuleToken lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_right_2_0 = null;

        EObject lv_next_6_0 = null;



        	enterRule();

        try {
            // InternalDecisionTree.g:646:2: ( ( ( (lv_left_0_0= ruleRuleType ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) )? otherlv_3= '?' ( (lv_affected_parameter_4_0= RULE_ID ) ) ( (lv_points_5_0= RULE_INT ) )? ( (lv_next_6_0= ruleRules ) )? ) )
            // InternalDecisionTree.g:647:2: ( ( (lv_left_0_0= ruleRuleType ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) )? otherlv_3= '?' ( (lv_affected_parameter_4_0= RULE_ID ) ) ( (lv_points_5_0= RULE_INT ) )? ( (lv_next_6_0= ruleRules ) )? )
            {
            // InternalDecisionTree.g:647:2: ( ( (lv_left_0_0= ruleRuleType ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) )? otherlv_3= '?' ( (lv_affected_parameter_4_0= RULE_ID ) ) ( (lv_points_5_0= RULE_INT ) )? ( (lv_next_6_0= ruleRules ) )? )
            // InternalDecisionTree.g:648:3: ( (lv_left_0_0= ruleRuleType ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) )? otherlv_3= '?' ( (lv_affected_parameter_4_0= RULE_ID ) ) ( (lv_points_5_0= RULE_INT ) )? ( (lv_next_6_0= ruleRules ) )?
            {
            // InternalDecisionTree.g:648:3: ( (lv_left_0_0= ruleRuleType ) )
            // InternalDecisionTree.g:649:4: (lv_left_0_0= ruleRuleType )
            {
            // InternalDecisionTree.g:649:4: (lv_left_0_0= ruleRuleType )
            // InternalDecisionTree.g:650:5: lv_left_0_0= ruleRuleType
            {

            					newCompositeNode(grammarAccess.getRulesAccess().getLeftRuleTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_left_0_0=ruleRuleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRulesRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"sdu.mmmi.tamamo.DecisionTree.RuleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDecisionTree.g:667:3: ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=24 && LA7_0<=27)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDecisionTree.g:668:4: ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) )
                    {
                    // InternalDecisionTree.g:668:4: ( (lv_operator_1_0= ruleOperator ) )
                    // InternalDecisionTree.g:669:5: (lv_operator_1_0= ruleOperator )
                    {
                    // InternalDecisionTree.g:669:5: (lv_operator_1_0= ruleOperator )
                    // InternalDecisionTree.g:670:6: lv_operator_1_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getRulesAccess().getOperatorOperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_operator_1_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRulesRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"sdu.mmmi.tamamo.DecisionTree.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDecisionTree.g:687:4: ( (lv_right_2_0= ruleRuleType ) )
                    // InternalDecisionTree.g:688:5: (lv_right_2_0= ruleRuleType )
                    {
                    // InternalDecisionTree.g:688:5: (lv_right_2_0= ruleRuleType )
                    // InternalDecisionTree.g:689:6: lv_right_2_0= ruleRuleType
                    {

                    						newCompositeNode(grammarAccess.getRulesAccess().getRightRuleTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_right_2_0=ruleRuleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRulesRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"sdu.mmmi.tamamo.DecisionTree.RuleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRulesAccess().getQuestionMarkKeyword_2());
            		
            // InternalDecisionTree.g:711:3: ( (lv_affected_parameter_4_0= RULE_ID ) )
            // InternalDecisionTree.g:712:4: (lv_affected_parameter_4_0= RULE_ID )
            {
            // InternalDecisionTree.g:712:4: (lv_affected_parameter_4_0= RULE_ID )
            // InternalDecisionTree.g:713:5: lv_affected_parameter_4_0= RULE_ID
            {
            lv_affected_parameter_4_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_affected_parameter_4_0, grammarAccess.getRulesAccess().getAffected_parameterIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRulesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"affected_parameter",
            						lv_affected_parameter_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDecisionTree.g:729:3: ( (lv_points_5_0= RULE_INT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||(LA8_1>=RULE_ID && LA8_1<=RULE_INT)||LA8_1==15) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalDecisionTree.g:730:4: (lv_points_5_0= RULE_INT )
                    {
                    // InternalDecisionTree.g:730:4: (lv_points_5_0= RULE_INT )
                    // InternalDecisionTree.g:731:5: lv_points_5_0= RULE_INT
                    {
                    lv_points_5_0=(Token)match(input,RULE_INT,FOLLOW_19); 

                    					newLeafNode(lv_points_5_0, grammarAccess.getRulesAccess().getPointsINTTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRulesRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"points",
                    						lv_points_5_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalDecisionTree.g:747:3: ( (lv_next_6_0= ruleRules ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_INT)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDecisionTree.g:748:4: (lv_next_6_0= ruleRules )
                    {
                    // InternalDecisionTree.g:748:4: (lv_next_6_0= ruleRules )
                    // InternalDecisionTree.g:749:5: lv_next_6_0= ruleRules
                    {

                    					newCompositeNode(grammarAccess.getRulesAccess().getNextRulesParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_6_0=ruleRules();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRulesRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_6_0,
                    						"sdu.mmmi.tamamo.DecisionTree.Rules");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleRuleType"
    // InternalDecisionTree.g:770:1: entryRuleRuleType returns [String current=null] : iv_ruleRuleType= ruleRuleType EOF ;
    public final String entryRuleRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleType = null;


        try {
            // InternalDecisionTree.g:770:48: (iv_ruleRuleType= ruleRuleType EOF )
            // InternalDecisionTree.g:771:2: iv_ruleRuleType= ruleRuleType EOF
            {
             newCompositeNode(grammarAccess.getRuleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleType=ruleRuleType();

            state._fsp--;

             current =iv_ruleRuleType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuleType"


    // $ANTLR start "ruleRuleType"
    // InternalDecisionTree.g:777:1: ruleRuleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleRuleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDecisionTree.g:783:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) )
            // InternalDecisionTree.g:784:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            {
            // InternalDecisionTree.g:784:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDecisionTree.g:785:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getRuleTypeAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDecisionTree.g:793:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getRuleTypeAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleRuleType"


    // $ANTLR start "entryRuleOperator"
    // InternalDecisionTree.g:804:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalDecisionTree.g:804:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalDecisionTree.g:805:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalDecisionTree.g:811:1: ruleOperator returns [EObject current=null] : ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>=' ) | ( () otherlv_7= '<=' ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDecisionTree.g:817:2: ( ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>=' ) | ( () otherlv_7= '<=' ) ) )
            // InternalDecisionTree.g:818:2: ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>=' ) | ( () otherlv_7= '<=' ) )
            {
            // InternalDecisionTree.g:818:2: ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '>=' ) | ( () otherlv_7= '<=' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDecisionTree.g:819:3: ( () otherlv_1= '>' )
                    {
                    // InternalDecisionTree.g:819:3: ( () otherlv_1= '>' )
                    // InternalDecisionTree.g:820:4: () otherlv_1= '>'
                    {
                    // InternalDecisionTree.g:820:4: ()
                    // InternalDecisionTree.g:821:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getGreaterThanAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDecisionTree.g:833:3: ( () otherlv_3= '<' )
                    {
                    // InternalDecisionTree.g:833:3: ( () otherlv_3= '<' )
                    // InternalDecisionTree.g:834:4: () otherlv_3= '<'
                    {
                    // InternalDecisionTree.g:834:4: ()
                    // InternalDecisionTree.g:835:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getLessThanAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDecisionTree.g:847:3: ( () otherlv_5= '>=' )
                    {
                    // InternalDecisionTree.g:847:3: ( () otherlv_5= '>=' )
                    // InternalDecisionTree.g:848:4: () otherlv_5= '>='
                    {
                    // InternalDecisionTree.g:848:4: ()
                    // InternalDecisionTree.g:849:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getGreaterEqualAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDecisionTree.g:861:3: ( () otherlv_7= '<=' )
                    {
                    // InternalDecisionTree.g:861:3: ( () otherlv_7= '<=' )
                    // InternalDecisionTree.g:862:4: () otherlv_7= '<='
                    {
                    // InternalDecisionTree.g:862:4: ()
                    // InternalDecisionTree.g:863:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getLessEqualAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleConclusion"
    // InternalDecisionTree.g:878:1: entryRuleConclusion returns [EObject current=null] : iv_ruleConclusion= ruleConclusion EOF ;
    public final EObject entryRuleConclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConclusion = null;


        try {
            // InternalDecisionTree.g:878:51: (iv_ruleConclusion= ruleConclusion EOF )
            // InternalDecisionTree.g:879:2: iv_ruleConclusion= ruleConclusion EOF
            {
             newCompositeNode(grammarAccess.getConclusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConclusion=ruleConclusion();

            state._fsp--;

             current =iv_ruleConclusion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConclusion"


    // $ANTLR start "ruleConclusion"
    // InternalDecisionTree.g:885:1: ruleConclusion returns [EObject current=null] : ( ( ( (lv_left_0_0= ruleRuleType ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) otherlv_3= ':' ( (lv_decision_4_0= ruleDecision ) ) ( (lv_next_5_0= ruleConclusion ) )? ) | (this_ConclusionNested_6= ruleConclusionNested ( (lv_next_7_0= ruleConclusion ) )? ) | (otherlv_8= 'else:' ( (lv_left_9_0= RULE_ID ) ) ) ) ;
    public final EObject ruleConclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_8=null;
        Token lv_left_9_0=null;
        AntlrDatatypeRuleToken lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_right_2_0 = null;

        EObject lv_decision_4_0 = null;

        EObject lv_next_5_0 = null;

        EObject this_ConclusionNested_6 = null;

        EObject lv_next_7_0 = null;



        	enterRule();

        try {
            // InternalDecisionTree.g:891:2: ( ( ( ( (lv_left_0_0= ruleRuleType ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) otherlv_3= ':' ( (lv_decision_4_0= ruleDecision ) ) ( (lv_next_5_0= ruleConclusion ) )? ) | (this_ConclusionNested_6= ruleConclusionNested ( (lv_next_7_0= ruleConclusion ) )? ) | (otherlv_8= 'else:' ( (lv_left_9_0= RULE_ID ) ) ) ) )
            // InternalDecisionTree.g:892:2: ( ( ( (lv_left_0_0= ruleRuleType ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) otherlv_3= ':' ( (lv_decision_4_0= ruleDecision ) ) ( (lv_next_5_0= ruleConclusion ) )? ) | (this_ConclusionNested_6= ruleConclusionNested ( (lv_next_7_0= ruleConclusion ) )? ) | (otherlv_8= 'else:' ( (lv_left_9_0= RULE_ID ) ) ) )
            {
            // InternalDecisionTree.g:892:2: ( ( ( (lv_left_0_0= ruleRuleType ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) otherlv_3= ':' ( (lv_decision_4_0= ruleDecision ) ) ( (lv_next_5_0= ruleConclusion ) )? ) | (this_ConclusionNested_6= ruleConclusionNested ( (lv_next_7_0= ruleConclusion ) )? ) | (otherlv_8= 'else:' ( (lv_left_9_0= RULE_ID ) ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==17) ) {
                    alt14=2;
                }
                else if ( ((LA14_2>=24 && LA14_2<=27)) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDecisionTree.g:893:3: ( ( (lv_left_0_0= ruleRuleType ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) otherlv_3= ':' ( (lv_decision_4_0= ruleDecision ) ) ( (lv_next_5_0= ruleConclusion ) )? )
                    {
                    // InternalDecisionTree.g:893:3: ( ( (lv_left_0_0= ruleRuleType ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) otherlv_3= ':' ( (lv_decision_4_0= ruleDecision ) ) ( (lv_next_5_0= ruleConclusion ) )? )
                    // InternalDecisionTree.g:894:4: ( (lv_left_0_0= ruleRuleType ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleRuleType ) ) otherlv_3= ':' ( (lv_decision_4_0= ruleDecision ) ) ( (lv_next_5_0= ruleConclusion ) )?
                    {
                    // InternalDecisionTree.g:894:4: ( (lv_left_0_0= ruleRuleType ) )
                    // InternalDecisionTree.g:895:5: (lv_left_0_0= ruleRuleType )
                    {
                    // InternalDecisionTree.g:895:5: (lv_left_0_0= ruleRuleType )
                    // InternalDecisionTree.g:896:6: lv_left_0_0= ruleRuleType
                    {

                    						newCompositeNode(grammarAccess.getConclusionAccess().getLeftRuleTypeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_left_0_0=ruleRuleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConclusionRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_0_0,
                    							"sdu.mmmi.tamamo.DecisionTree.RuleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDecisionTree.g:913:4: ( (lv_operator_1_0= ruleOperator ) )
                    // InternalDecisionTree.g:914:5: (lv_operator_1_0= ruleOperator )
                    {
                    // InternalDecisionTree.g:914:5: (lv_operator_1_0= ruleOperator )
                    // InternalDecisionTree.g:915:6: lv_operator_1_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getConclusionAccess().getOperatorOperatorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_operator_1_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConclusionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"sdu.mmmi.tamamo.DecisionTree.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDecisionTree.g:932:4: ( (lv_right_2_0= ruleRuleType ) )
                    // InternalDecisionTree.g:933:5: (lv_right_2_0= ruleRuleType )
                    {
                    // InternalDecisionTree.g:933:5: (lv_right_2_0= ruleRuleType )
                    // InternalDecisionTree.g:934:6: lv_right_2_0= ruleRuleType
                    {

                    						newCompositeNode(grammarAccess.getConclusionAccess().getRightRuleTypeParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_right_2_0=ruleRuleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConclusionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"sdu.mmmi.tamamo.DecisionTree.RuleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConclusionAccess().getColonKeyword_0_3());
                    			
                    // InternalDecisionTree.g:955:4: ( (lv_decision_4_0= ruleDecision ) )
                    // InternalDecisionTree.g:956:5: (lv_decision_4_0= ruleDecision )
                    {
                    // InternalDecisionTree.g:956:5: (lv_decision_4_0= ruleDecision )
                    // InternalDecisionTree.g:957:6: lv_decision_4_0= ruleDecision
                    {

                    						newCompositeNode(grammarAccess.getConclusionAccess().getDecisionDecisionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_decision_4_0=ruleDecision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConclusionRule());
                    						}
                    						set(
                    							current,
                    							"decision",
                    							lv_decision_4_0,
                    							"sdu.mmmi.tamamo.DecisionTree.Decision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDecisionTree.g:974:4: ( (lv_next_5_0= ruleConclusion ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||LA12_0==29) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalDecisionTree.g:975:5: (lv_next_5_0= ruleConclusion )
                            {
                            // InternalDecisionTree.g:975:5: (lv_next_5_0= ruleConclusion )
                            // InternalDecisionTree.g:976:6: lv_next_5_0= ruleConclusion
                            {

                            						newCompositeNode(grammarAccess.getConclusionAccess().getNextConclusionParserRuleCall_0_5_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_next_5_0=ruleConclusion();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConclusionRule());
                            						}
                            						set(
                            							current,
                            							"next",
                            							lv_next_5_0,
                            							"sdu.mmmi.tamamo.DecisionTree.Conclusion");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDecisionTree.g:995:3: (this_ConclusionNested_6= ruleConclusionNested ( (lv_next_7_0= ruleConclusion ) )? )
                    {
                    // InternalDecisionTree.g:995:3: (this_ConclusionNested_6= ruleConclusionNested ( (lv_next_7_0= ruleConclusion ) )? )
                    // InternalDecisionTree.g:996:4: this_ConclusionNested_6= ruleConclusionNested ( (lv_next_7_0= ruleConclusion ) )?
                    {

                    				newCompositeNode(grammarAccess.getConclusionAccess().getConclusionNestedParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_22);
                    this_ConclusionNested_6=ruleConclusionNested();

                    state._fsp--;


                    				current = this_ConclusionNested_6;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDecisionTree.g:1004:4: ( (lv_next_7_0= ruleConclusion ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==29) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalDecisionTree.g:1005:5: (lv_next_7_0= ruleConclusion )
                            {
                            // InternalDecisionTree.g:1005:5: (lv_next_7_0= ruleConclusion )
                            // InternalDecisionTree.g:1006:6: lv_next_7_0= ruleConclusion
                            {

                            						newCompositeNode(grammarAccess.getConclusionAccess().getNextConclusionParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_next_7_0=ruleConclusion();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConclusionRule());
                            						}
                            						set(
                            							current,
                            							"next",
                            							lv_next_7_0,
                            							"sdu.mmmi.tamamo.DecisionTree.Conclusion");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDecisionTree.g:1025:3: (otherlv_8= 'else:' ( (lv_left_9_0= RULE_ID ) ) )
                    {
                    // InternalDecisionTree.g:1025:3: (otherlv_8= 'else:' ( (lv_left_9_0= RULE_ID ) ) )
                    // InternalDecisionTree.g:1026:4: otherlv_8= 'else:' ( (lv_left_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getConclusionAccess().getElseKeyword_2_0());
                    			
                    // InternalDecisionTree.g:1030:4: ( (lv_left_9_0= RULE_ID ) )
                    // InternalDecisionTree.g:1031:5: (lv_left_9_0= RULE_ID )
                    {
                    // InternalDecisionTree.g:1031:5: (lv_left_9_0= RULE_ID )
                    // InternalDecisionTree.g:1032:6: lv_left_9_0= RULE_ID
                    {
                    lv_left_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_left_9_0, grammarAccess.getConclusionAccess().getLeftIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConclusionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"left",
                    							lv_left_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConclusion"


    // $ANTLR start "entryRuleConclusionNested"
    // InternalDecisionTree.g:1053:1: entryRuleConclusionNested returns [EObject current=null] : iv_ruleConclusionNested= ruleConclusionNested EOF ;
    public final EObject entryRuleConclusionNested() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConclusionNested = null;


        try {
            // InternalDecisionTree.g:1053:57: (iv_ruleConclusionNested= ruleConclusionNested EOF )
            // InternalDecisionTree.g:1054:2: iv_ruleConclusionNested= ruleConclusionNested EOF
            {
             newCompositeNode(grammarAccess.getConclusionNestedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConclusionNested=ruleConclusionNested();

            state._fsp--;

             current =iv_ruleConclusionNested; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConclusionNested"


    // $ANTLR start "ruleConclusionNested"
    // InternalDecisionTree.g:1060:1: ruleConclusionNested returns [EObject current=null] : ( ( (lv_parent_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_nested_2_0= ruleConclusion ) ) otherlv_3= ')' ) ;
    public final EObject ruleConclusionNested() throws RecognitionException {
        EObject current = null;

        Token lv_parent_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_nested_2_0 = null;



        	enterRule();

        try {
            // InternalDecisionTree.g:1066:2: ( ( ( (lv_parent_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_nested_2_0= ruleConclusion ) ) otherlv_3= ')' ) )
            // InternalDecisionTree.g:1067:2: ( ( (lv_parent_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_nested_2_0= ruleConclusion ) ) otherlv_3= ')' )
            {
            // InternalDecisionTree.g:1067:2: ( ( (lv_parent_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_nested_2_0= ruleConclusion ) ) otherlv_3= ')' )
            // InternalDecisionTree.g:1068:3: ( (lv_parent_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_nested_2_0= ruleConclusion ) ) otherlv_3= ')'
            {
            // InternalDecisionTree.g:1068:3: ( (lv_parent_0_0= RULE_ID ) )
            // InternalDecisionTree.g:1069:4: (lv_parent_0_0= RULE_ID )
            {
            // InternalDecisionTree.g:1069:4: (lv_parent_0_0= RULE_ID )
            // InternalDecisionTree.g:1070:5: lv_parent_0_0= RULE_ID
            {
            lv_parent_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_parent_0_0, grammarAccess.getConclusionNestedAccess().getParentIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConclusionNestedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parent",
            						lv_parent_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getConclusionNestedAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDecisionTree.g:1090:3: ( (lv_nested_2_0= ruleConclusion ) )
            // InternalDecisionTree.g:1091:4: (lv_nested_2_0= ruleConclusion )
            {
            // InternalDecisionTree.g:1091:4: (lv_nested_2_0= ruleConclusion )
            // InternalDecisionTree.g:1092:5: lv_nested_2_0= ruleConclusion
            {

            					newCompositeNode(grammarAccess.getConclusionNestedAccess().getNestedConclusionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_nested_2_0=ruleConclusion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConclusionNestedRule());
            					}
            					set(
            						current,
            						"nested",
            						lv_nested_2_0,
            						"sdu.mmmi.tamamo.DecisionTree.Conclusion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConclusionNestedAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleConclusionNested"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000032L});

}