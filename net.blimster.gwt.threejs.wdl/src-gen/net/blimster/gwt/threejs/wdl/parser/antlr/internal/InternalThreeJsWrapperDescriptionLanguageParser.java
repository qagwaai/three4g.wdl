package net.blimster.gwt.threejs.wdl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.blimster.gwt.threejs.wdl.services.ThreeJsWrapperDescriptionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalThreeJsWrapperDescriptionLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'class'", "'extends'", "'{'", "'package'", "';'", "'}'", "'constructors:'", "'builder'", "'('", "')'", "'default'", "','", "'json'", "'properties:'", "'readonly'", "'methods:'", "'['", "']'", "'.'", "'int'", "'float'", "'boolean'", "'string'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
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


        public InternalThreeJsWrapperDescriptionLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalThreeJsWrapperDescriptionLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalThreeJsWrapperDescriptionLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g"; }



     	private ThreeJsWrapperDescriptionLanguageGrammarAccess grammarAccess;
     	
        public InternalThreeJsWrapperDescriptionLanguageParser(TokenStream input, ThreeJsWrapperDescriptionLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ThreeJsWrapperDescriptionLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:77:1: ruleModel returns [EObject current=null] : ( (lv_wrappers_0_0= ruleObjectWrapper ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_wrappers_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:80:28: ( ( (lv_wrappers_0_0= ruleObjectWrapper ) )* )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:81:1: ( (lv_wrappers_0_0= ruleObjectWrapper ) )*
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:81:1: ( (lv_wrappers_0_0= ruleObjectWrapper ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:82:1: (lv_wrappers_0_0= ruleObjectWrapper )
            	    {
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:82:1: (lv_wrappers_0_0= ruleObjectWrapper )
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:83:3: lv_wrappers_0_0= ruleObjectWrapper
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getWrappersObjectWrapperParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjectWrapper_in_ruleModel130);
            	    lv_wrappers_0_0=ruleObjectWrapper();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wrappers",
            	            		lv_wrappers_0_0, 
            	            		"ObjectWrapper");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleObjectWrapper"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:107:1: entryRuleObjectWrapper returns [EObject current=null] : iv_ruleObjectWrapper= ruleObjectWrapper EOF ;
    public final EObject entryRuleObjectWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectWrapper = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:108:2: (iv_ruleObjectWrapper= ruleObjectWrapper EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:109:2: iv_ruleObjectWrapper= ruleObjectWrapper EOF
            {
             newCompositeNode(grammarAccess.getObjectWrapperRule()); 
            pushFollow(FOLLOW_ruleObjectWrapper_in_entryRuleObjectWrapper166);
            iv_ruleObjectWrapper=ruleObjectWrapper();

            state._fsp--;

             current =iv_ruleObjectWrapper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectWrapper176); 

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
    // $ANTLR end "entryRuleObjectWrapper"


    // $ANTLR start "ruleObjectWrapper"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:116:1: ruleObjectWrapper returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' otherlv_6= 'package' ( (lv_pck_7_0= ruleQualifiedName ) ) otherlv_8= ';' ( (lv_constructorSection_9_0= ruleConstructorSection ) )? ( (lv_propertySection_10_0= rulePropertySection ) )? ( (lv_methodSection_11_0= ruleMethodSection ) )? otherlv_12= '}' ) ;
    public final EObject ruleObjectWrapper() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_pck_7_0 = null;

        EObject lv_constructorSection_9_0 = null;

        EObject lv_propertySection_10_0 = null;

        EObject lv_methodSection_11_0 = null;


         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:119:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' otherlv_6= 'package' ( (lv_pck_7_0= ruleQualifiedName ) ) otherlv_8= ';' ( (lv_constructorSection_9_0= ruleConstructorSection ) )? ( (lv_propertySection_10_0= rulePropertySection ) )? ( (lv_methodSection_11_0= ruleMethodSection ) )? otherlv_12= '}' ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:120:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' otherlv_6= 'package' ( (lv_pck_7_0= ruleQualifiedName ) ) otherlv_8= ';' ( (lv_constructorSection_9_0= ruleConstructorSection ) )? ( (lv_propertySection_10_0= rulePropertySection ) )? ( (lv_methodSection_11_0= ruleMethodSection ) )? otherlv_12= '}' )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:120:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' otherlv_6= 'package' ( (lv_pck_7_0= ruleQualifiedName ) ) otherlv_8= ';' ( (lv_constructorSection_9_0= ruleConstructorSection ) )? ( (lv_propertySection_10_0= rulePropertySection ) )? ( (lv_methodSection_11_0= ruleMethodSection ) )? otherlv_12= '}' )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:120:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' otherlv_6= 'package' ( (lv_pck_7_0= ruleQualifiedName ) ) otherlv_8= ';' ( (lv_constructorSection_9_0= ruleConstructorSection ) )? ( (lv_propertySection_10_0= rulePropertySection ) )? ( (lv_methodSection_11_0= ruleMethodSection ) )? otherlv_12= '}'
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:120:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:121:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:121:1: (lv_abstract_0_0= 'abstract' )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:122:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,11,FOLLOW_11_in_ruleObjectWrapper219); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getObjectWrapperAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectWrapperRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleObjectWrapper245); 

                	newLeafNode(otherlv_1, grammarAccess.getObjectWrapperAccess().getClassKeyword_1());
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:139:1: ( (lv_name_2_0= RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:140:1: (lv_name_2_0= RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:140:1: (lv_name_2_0= RULE_ID )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:141:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectWrapper262); 

            			newLeafNode(lv_name_2_0, grammarAccess.getObjectWrapperAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectWrapperRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:157:2: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:157:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleObjectWrapper280); 

                        	newLeafNode(otherlv_3, grammarAccess.getObjectWrapperAccess().getExtendsKeyword_3_0());
                        
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:161:1: ( (otherlv_4= RULE_ID ) )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:162:1: (otherlv_4= RULE_ID )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:162:1: (otherlv_4= RULE_ID )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:163:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectWrapperRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectWrapper300); 

                    		newLeafNode(otherlv_4, grammarAccess.getObjectWrapperAccess().getSupertypeObjectWrapperCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleObjectWrapper314); 

                	newLeafNode(otherlv_5, grammarAccess.getObjectWrapperAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleObjectWrapper326); 

                	newLeafNode(otherlv_6, grammarAccess.getObjectWrapperAccess().getPackageKeyword_5());
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:182:1: ( (lv_pck_7_0= ruleQualifiedName ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:183:1: (lv_pck_7_0= ruleQualifiedName )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:183:1: (lv_pck_7_0= ruleQualifiedName )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:184:3: lv_pck_7_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getObjectWrapperAccess().getPckQualifiedNameParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectWrapper347);
            lv_pck_7_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getObjectWrapperRule());
            	        }
                   		set(
                   			current, 
                   			"pck",
                    		lv_pck_7_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleObjectWrapper359); 

                	newLeafNode(otherlv_8, grammarAccess.getObjectWrapperAccess().getSemicolonKeyword_7());
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:204:1: ( (lv_constructorSection_9_0= ruleConstructorSection ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:205:1: (lv_constructorSection_9_0= ruleConstructorSection )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:205:1: (lv_constructorSection_9_0= ruleConstructorSection )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:206:3: lv_constructorSection_9_0= ruleConstructorSection
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectWrapperAccess().getConstructorSectionConstructorSectionParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstructorSection_in_ruleObjectWrapper380);
                    lv_constructorSection_9_0=ruleConstructorSection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectWrapperRule());
                    	        }
                           		set(
                           			current, 
                           			"constructorSection",
                            		lv_constructorSection_9_0, 
                            		"ConstructorSection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:222:3: ( (lv_propertySection_10_0= rulePropertySection ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:223:1: (lv_propertySection_10_0= rulePropertySection )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:223:1: (lv_propertySection_10_0= rulePropertySection )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:224:3: lv_propertySection_10_0= rulePropertySection
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectWrapperAccess().getPropertySectionPropertySectionParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertySection_in_ruleObjectWrapper402);
                    lv_propertySection_10_0=rulePropertySection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectWrapperRule());
                    	        }
                           		set(
                           			current, 
                           			"propertySection",
                            		lv_propertySection_10_0, 
                            		"PropertySection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:240:3: ( (lv_methodSection_11_0= ruleMethodSection ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:241:1: (lv_methodSection_11_0= ruleMethodSection )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:241:1: (lv_methodSection_11_0= ruleMethodSection )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:242:3: lv_methodSection_11_0= ruleMethodSection
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectWrapperAccess().getMethodSectionMethodSectionParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMethodSection_in_ruleObjectWrapper424);
                    lv_methodSection_11_0=ruleMethodSection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectWrapperRule());
                    	        }
                           		set(
                           			current, 
                           			"methodSection",
                            		lv_methodSection_11_0, 
                            		"MethodSection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleObjectWrapper437); 

                	newLeafNode(otherlv_12, grammarAccess.getObjectWrapperAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleObjectWrapper"


    // $ANTLR start "entryRuleConstructorSection"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:270:1: entryRuleConstructorSection returns [EObject current=null] : iv_ruleConstructorSection= ruleConstructorSection EOF ;
    public final EObject entryRuleConstructorSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorSection = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:271:2: (iv_ruleConstructorSection= ruleConstructorSection EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:272:2: iv_ruleConstructorSection= ruleConstructorSection EOF
            {
             newCompositeNode(grammarAccess.getConstructorSectionRule()); 
            pushFollow(FOLLOW_ruleConstructorSection_in_entryRuleConstructorSection473);
            iv_ruleConstructorSection=ruleConstructorSection();

            state._fsp--;

             current =iv_ruleConstructorSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructorSection483); 

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
    // $ANTLR end "entryRuleConstructorSection"


    // $ANTLR start "ruleConstructorSection"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:279:1: ruleConstructorSection returns [EObject current=null] : ( () otherlv_1= 'constructors:' ( ( (lv_builderConstructor_2_0= 'builder' ) ) otherlv_3= '(' otherlv_4= ')' otherlv_5= ';' )? ( ( (lv_defaultConstructor_6_0= 'default' ) ) otherlv_7= '(' otherlv_8= ')' otherlv_9= ';' )? ( (lv_constructors_10_0= ruleConstructor ) )* ) ;
    public final EObject ruleConstructorSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_builderConstructor_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_defaultConstructor_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_constructors_10_0 = null;


         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:282:28: ( ( () otherlv_1= 'constructors:' ( ( (lv_builderConstructor_2_0= 'builder' ) ) otherlv_3= '(' otherlv_4= ')' otherlv_5= ';' )? ( ( (lv_defaultConstructor_6_0= 'default' ) ) otherlv_7= '(' otherlv_8= ')' otherlv_9= ';' )? ( (lv_constructors_10_0= ruleConstructor ) )* ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:283:1: ( () otherlv_1= 'constructors:' ( ( (lv_builderConstructor_2_0= 'builder' ) ) otherlv_3= '(' otherlv_4= ')' otherlv_5= ';' )? ( ( (lv_defaultConstructor_6_0= 'default' ) ) otherlv_7= '(' otherlv_8= ')' otherlv_9= ';' )? ( (lv_constructors_10_0= ruleConstructor ) )* )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:283:1: ( () otherlv_1= 'constructors:' ( ( (lv_builderConstructor_2_0= 'builder' ) ) otherlv_3= '(' otherlv_4= ')' otherlv_5= ';' )? ( ( (lv_defaultConstructor_6_0= 'default' ) ) otherlv_7= '(' otherlv_8= ')' otherlv_9= ';' )? ( (lv_constructors_10_0= ruleConstructor ) )* )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:283:2: () otherlv_1= 'constructors:' ( ( (lv_builderConstructor_2_0= 'builder' ) ) otherlv_3= '(' otherlv_4= ')' otherlv_5= ';' )? ( ( (lv_defaultConstructor_6_0= 'default' ) ) otherlv_7= '(' otherlv_8= ')' otherlv_9= ';' )? ( (lv_constructors_10_0= ruleConstructor ) )*
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:283:2: ()
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:284:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstructorSectionAccess().getConstructorSectionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleConstructorSection529); 

                	newLeafNode(otherlv_1, grammarAccess.getConstructorSectionAccess().getConstructorsKeyword_1());
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:293:1: ( ( (lv_builderConstructor_2_0= 'builder' ) ) otherlv_3= '(' otherlv_4= ')' otherlv_5= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:293:2: ( (lv_builderConstructor_2_0= 'builder' ) ) otherlv_3= '(' otherlv_4= ')' otherlv_5= ';'
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:293:2: ( (lv_builderConstructor_2_0= 'builder' ) )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:294:1: (lv_builderConstructor_2_0= 'builder' )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:294:1: (lv_builderConstructor_2_0= 'builder' )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:295:3: lv_builderConstructor_2_0= 'builder'
                    {
                    lv_builderConstructor_2_0=(Token)match(input,19,FOLLOW_19_in_ruleConstructorSection548); 

                            newLeafNode(lv_builderConstructor_2_0, grammarAccess.getConstructorSectionAccess().getBuilderConstructorBuilderKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorSectionRule());
                    	        }
                           		setWithLastConsumed(current, "builderConstructor", lv_builderConstructor_2_0, "builder");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleConstructorSection573); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstructorSectionAccess().getLeftParenthesisKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleConstructorSection585); 

                        	newLeafNode(otherlv_4, grammarAccess.getConstructorSectionAccess().getRightParenthesisKeyword_2_2());
                        
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleConstructorSection597); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstructorSectionAccess().getSemicolonKeyword_2_3());
                        

                    }
                    break;

            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:320:3: ( ( (lv_defaultConstructor_6_0= 'default' ) ) otherlv_7= '(' otherlv_8= ')' otherlv_9= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:320:4: ( (lv_defaultConstructor_6_0= 'default' ) ) otherlv_7= '(' otherlv_8= ')' otherlv_9= ';'
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:320:4: ( (lv_defaultConstructor_6_0= 'default' ) )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:321:1: (lv_defaultConstructor_6_0= 'default' )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:321:1: (lv_defaultConstructor_6_0= 'default' )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:322:3: lv_defaultConstructor_6_0= 'default'
                    {
                    lv_defaultConstructor_6_0=(Token)match(input,22,FOLLOW_22_in_ruleConstructorSection618); 

                            newLeafNode(lv_defaultConstructor_6_0, grammarAccess.getConstructorSectionAccess().getDefaultConstructorDefaultKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorSectionRule());
                    	        }
                           		setWithLastConsumed(current, "defaultConstructor", lv_defaultConstructor_6_0, "default");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleConstructorSection643); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstructorSectionAccess().getLeftParenthesisKeyword_3_1());
                        
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleConstructorSection655); 

                        	newLeafNode(otherlv_8, grammarAccess.getConstructorSectionAccess().getRightParenthesisKeyword_3_2());
                        
                    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleConstructorSection667); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstructorSectionAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:347:3: ( (lv_constructors_10_0= ruleConstructor ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:348:1: (lv_constructors_10_0= ruleConstructor )
            	    {
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:348:1: (lv_constructors_10_0= ruleConstructor )
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:349:3: lv_constructors_10_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorSectionAccess().getConstructorsConstructorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleConstructorSection690);
            	    lv_constructors_10_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_10_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleConstructorSection"


    // $ANTLR start "entryRuleConstructor"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:373:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:374:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:375:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor727);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor737); 

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:382:1: ruleConstructor returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ( (lv_json_7_0= 'json' ) )? otherlv_8= ';' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_json_7_0=null;
        Token otherlv_8=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:385:28: ( ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ( (lv_json_7_0= 'json' ) )? otherlv_8= ';' ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:386:1: ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ( (lv_json_7_0= 'json' ) )? otherlv_8= ';' )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:386:1: ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ( (lv_json_7_0= 'json' ) )? otherlv_8= ';' )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:386:2: () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ( (lv_json_7_0= 'json' ) )? otherlv_8= ';'
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:386:2: ()
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:387:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstructorAccess().getConstructorAction_0(),
                        current);
                

            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:392:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:393:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:393:1: (lv_name_1_0= RULE_ID )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:394:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor788); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleConstructor806); 

                	newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2());
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:414:1: ( (lv_parameters_3_0= ruleParameter ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:415:1: (lv_parameters_3_0= ruleParameter )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:415:1: (lv_parameters_3_0= ruleParameter )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:416:3: lv_parameters_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleConstructor827);
            lv_parameters_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:432:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:432:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleConstructor840); 

            	        	newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getCommaKeyword_4_0());
            	        
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:436:1: ( (lv_parameters_5_0= ruleParameter ) )
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:437:1: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:437:1: (lv_parameters_5_0= ruleParameter )
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:438:3: lv_parameters_5_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleConstructor861);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_5_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleConstructor875); 

                	newLeafNode(otherlv_6, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_5());
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:458:1: ( (lv_json_7_0= 'json' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:459:1: (lv_json_7_0= 'json' )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:459:1: (lv_json_7_0= 'json' )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:460:3: lv_json_7_0= 'json'
                    {
                    lv_json_7_0=(Token)match(input,24,FOLLOW_24_in_ruleConstructor893); 

                            newLeafNode(lv_json_7_0, grammarAccess.getConstructorAccess().getJsonJsonKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                           		setWithLastConsumed(current, "json", true, "json");
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleConstructor919); 

                	newLeafNode(otherlv_8, grammarAccess.getConstructorAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRulePropertySection"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:485:1: entryRulePropertySection returns [EObject current=null] : iv_rulePropertySection= rulePropertySection EOF ;
    public final EObject entryRulePropertySection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySection = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:486:2: (iv_rulePropertySection= rulePropertySection EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:487:2: iv_rulePropertySection= rulePropertySection EOF
            {
             newCompositeNode(grammarAccess.getPropertySectionRule()); 
            pushFollow(FOLLOW_rulePropertySection_in_entryRulePropertySection955);
            iv_rulePropertySection=rulePropertySection();

            state._fsp--;

             current =iv_rulePropertySection; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertySection965); 

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
    // $ANTLR end "entryRulePropertySection"


    // $ANTLR start "rulePropertySection"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:494:1: rulePropertySection returns [EObject current=null] : (otherlv_0= 'properties:' () ( (lv_properties_2_0= ruleProperty ) )* ) ;
    public final EObject rulePropertySection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_properties_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:497:28: ( (otherlv_0= 'properties:' () ( (lv_properties_2_0= ruleProperty ) )* ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:498:1: (otherlv_0= 'properties:' () ( (lv_properties_2_0= ruleProperty ) )* )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:498:1: (otherlv_0= 'properties:' () ( (lv_properties_2_0= ruleProperty ) )* )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:498:3: otherlv_0= 'properties:' () ( (lv_properties_2_0= ruleProperty ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulePropertySection1002); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertySectionAccess().getPropertiesKeyword_0());
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:502:1: ()
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:503:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertySectionAccess().getPropertySectionAction_1(),
                        current);
                

            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:508:2: ( (lv_properties_2_0= ruleProperty ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==26||(LA13_0>=31 && LA13_0<=34)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:509:1: (lv_properties_2_0= ruleProperty )
            	    {
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:509:1: (lv_properties_2_0= ruleProperty )
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:510:3: lv_properties_2_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertySectionAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePropertySection1032);
            	    lv_properties_2_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertySectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_2_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "rulePropertySection"


    // $ANTLR start "entryRuleProperty"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:534:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:535:2: (iv_ruleProperty= ruleProperty EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:536:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1069);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1079); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:543:1: ruleProperty returns [EObject current=null] : ( ( (lv_readOnly_0_0= 'readonly' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_readOnly_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:546:28: ( ( ( (lv_readOnly_0_0= 'readonly' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:547:1: ( ( (lv_readOnly_0_0= 'readonly' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:547:1: ( ( (lv_readOnly_0_0= 'readonly' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:547:2: ( (lv_readOnly_0_0= 'readonly' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:547:2: ( (lv_readOnly_0_0= 'readonly' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:548:1: (lv_readOnly_0_0= 'readonly' )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:548:1: (lv_readOnly_0_0= 'readonly' )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:549:3: lv_readOnly_0_0= 'readonly'
                    {
                    lv_readOnly_0_0=(Token)match(input,26,FOLLOW_26_in_ruleProperty1122); 

                            newLeafNode(lv_readOnly_0_0, grammarAccess.getPropertyAccess().getReadOnlyReadonlyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                           		setWithLastConsumed(current, "readOnly", true, "readonly");
                    	    

                    }


                    }
                    break;

            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:562:3: ( (lv_type_1_0= ruleType ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:563:1: (lv_type_1_0= ruleType )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:563:1: (lv_type_1_0= ruleType )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:564:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleProperty1157);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:580:2: ( (lv_name_2_0= RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:581:1: (lv_name_2_0= RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:581:1: (lv_name_2_0= RULE_ID )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:582:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1174); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleProperty1191); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMethodSection"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:610:1: entryRuleMethodSection returns [EObject current=null] : iv_ruleMethodSection= ruleMethodSection EOF ;
    public final EObject entryRuleMethodSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodSection = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:611:2: (iv_ruleMethodSection= ruleMethodSection EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:612:2: iv_ruleMethodSection= ruleMethodSection EOF
            {
             newCompositeNode(grammarAccess.getMethodSectionRule()); 
            pushFollow(FOLLOW_ruleMethodSection_in_entryRuleMethodSection1227);
            iv_ruleMethodSection=ruleMethodSection();

            state._fsp--;

             current =iv_ruleMethodSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodSection1237); 

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
    // $ANTLR end "entryRuleMethodSection"


    // $ANTLR start "ruleMethodSection"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:619:1: ruleMethodSection returns [EObject current=null] : (otherlv_0= 'methods:' () ( (lv_methods_2_0= ruleMethod ) )* ) ;
    public final EObject ruleMethodSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_methods_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:622:28: ( (otherlv_0= 'methods:' () ( (lv_methods_2_0= ruleMethod ) )* ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:623:1: (otherlv_0= 'methods:' () ( (lv_methods_2_0= ruleMethod ) )* )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:623:1: (otherlv_0= 'methods:' () ( (lv_methods_2_0= ruleMethod ) )* )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:623:3: otherlv_0= 'methods:' () ( (lv_methods_2_0= ruleMethod ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleMethodSection1274); 

                	newLeafNode(otherlv_0, grammarAccess.getMethodSectionAccess().getMethodsKeyword_0());
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:627:1: ()
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:628:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMethodSectionAccess().getMethodSectionAction_1(),
                        current);
                

            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:633:2: ( (lv_methods_2_0= ruleMethod ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=31 && LA15_0<=34)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:634:1: (lv_methods_2_0= ruleMethod )
            	    {
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:634:1: (lv_methods_2_0= ruleMethod )
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:635:3: lv_methods_2_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodSectionAccess().getMethodsMethodParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleMethodSection1304);
            	    lv_methods_2_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_2_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleMethodSection"


    // $ANTLR start "entryRuleMethod"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:659:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:660:2: (iv_ruleMethod= ruleMethod EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:661:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1341);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1351); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:668:1: ruleMethod returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleType ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_returnType_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:671:28: ( ( ( (lv_returnType_0_0= ruleType ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:672:1: ( ( (lv_returnType_0_0= ruleType ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:672:1: ( ( (lv_returnType_0_0= ruleType ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:672:2: ( (lv_returnType_0_0= ruleType ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ';'
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:672:2: ( (lv_returnType_0_0= ruleType ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=31 && LA16_0<=34)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==RULE_ID||LA16_2==28) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:673:1: (lv_returnType_0_0= ruleType )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:673:1: (lv_returnType_0_0= ruleType )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:674:3: lv_returnType_0_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleMethod1397);
                    lv_returnType_0_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_0_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:690:3: ( (lv_name_1_0= RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:691:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:691:1: (lv_name_1_0= RULE_ID )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:692:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1415); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMethod1432); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:712:1: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=31 && LA18_0<=34)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:712:2: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:712:2: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:713:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:713:1: (lv_parameters_3_0= ruleParameter )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:714:3: lv_parameters_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod1454);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:730:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==23) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:730:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMethod1467); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:734:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:735:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:735:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:736:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod1488);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleMethod1504); 

                	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleMethod1516); 

                	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:768:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:769:2: (iv_ruleParameter= ruleParameter EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:770:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1552);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1562); 

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
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:777:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:780:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:781:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:781:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:781:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:781:2: ( (lv_type_0_0= ruleType ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:782:1: (lv_type_0_0= ruleType )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:782:1: (lv_type_0_0= ruleType )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:783:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleParameter1608);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:799:2: ( (lv_name_1_0= RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:800:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:800:1: (lv_name_1_0= RULE_ID )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:801:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1625); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
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


    // $ANTLR start "entryRuleType"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:825:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:826:2: (iv_ruleType= ruleType EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:827:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1666);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1676); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:834:1: ruleType returns [EObject current=null] : ( ( ( (lv_datatype_0_0= ruleDatatype ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_arrayType_2_0= ruleArrayType ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_datatype_0_0 = null;

        EObject lv_arrayType_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:837:28: ( ( ( ( (lv_datatype_0_0= ruleDatatype ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_arrayType_2_0= ruleArrayType ) )? ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:838:1: ( ( ( (lv_datatype_0_0= ruleDatatype ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_arrayType_2_0= ruleArrayType ) )? )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:838:1: ( ( ( (lv_datatype_0_0= ruleDatatype ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_arrayType_2_0= ruleArrayType ) )? )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:838:2: ( ( (lv_datatype_0_0= ruleDatatype ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_arrayType_2_0= ruleArrayType ) )?
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:838:2: ( ( (lv_datatype_0_0= ruleDatatype ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=31 && LA19_0<=34)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:838:3: ( (lv_datatype_0_0= ruleDatatype ) )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:838:3: ( (lv_datatype_0_0= ruleDatatype ) )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:839:1: (lv_datatype_0_0= ruleDatatype )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:839:1: (lv_datatype_0_0= ruleDatatype )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:840:3: lv_datatype_0_0= ruleDatatype
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getDatatypeDatatypeEnumRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDatatype_in_ruleType1723);
                    lv_datatype_0_0=ruleDatatype();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"datatype",
                            		lv_datatype_0_0, 
                            		"Datatype");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:857:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:857:6: ( (otherlv_1= RULE_ID ) )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:858:1: (otherlv_1= RULE_ID )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:858:1: (otherlv_1= RULE_ID )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:859:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType1749); 

                    		newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getWrapperObjectWrapperCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:870:3: ( (lv_arrayType_2_0= ruleArrayType ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:871:1: (lv_arrayType_2_0= ruleArrayType )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:871:1: (lv_arrayType_2_0= ruleArrayType )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:872:3: lv_arrayType_2_0= ruleArrayType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getArrayTypeArrayTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArrayType_in_ruleType1771);
                    lv_arrayType_2_0=ruleArrayType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"arrayType",
                            		lv_arrayType_2_0, 
                            		"ArrayType");
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleArrayType"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:896:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:897:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:898:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType1808);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType1818); 

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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:905:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_dimensions_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_dimensions_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:908:28: ( ( () otherlv_1= '[' ( (lv_dimensions_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:909:1: ( () otherlv_1= '[' ( (lv_dimensions_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:909:1: ( () otherlv_1= '[' ( (lv_dimensions_2_0= RULE_INT ) )? otherlv_3= ']' )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:909:2: () otherlv_1= '[' ( (lv_dimensions_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:909:2: ()
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:910:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleArrayType1864); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:919:1: ( (lv_dimensions_2_0= RULE_INT ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:920:1: (lv_dimensions_2_0= RULE_INT )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:920:1: (lv_dimensions_2_0= RULE_INT )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:921:3: lv_dimensions_2_0= RULE_INT
                    {
                    lv_dimensions_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArrayType1881); 

                    			newLeafNode(lv_dimensions_2_0, grammarAccess.getArrayTypeAccess().getDimensionsINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrayTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dimensions",
                            		lv_dimensions_2_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleArrayType1899); 

                	newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:949:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:950:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:951:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1936);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1947); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:958:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:961:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:962:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:962:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:962:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1987); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:969:1: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:970:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleQualifiedName2006); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2021); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleDatatype"
    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:990:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'string' ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:992:28: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'string' ) ) )
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:993:1: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'string' ) )
            {
            // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:993:1: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'string' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt23=1;
                }
                break;
            case 32:
                {
                alt23=2;
                }
                break;
            case 33:
                {
                alt23=3;
                }
                break;
            case 34:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:993:2: (enumLiteral_0= 'int' )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:993:2: (enumLiteral_0= 'int' )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:993:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleDatatype2082); 

                            current = grammarAccess.getDatatypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getINTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:999:6: (enumLiteral_1= 'float' )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:999:6: (enumLiteral_1= 'float' )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:999:8: enumLiteral_1= 'float'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleDatatype2099); 

                            current = grammarAccess.getDatatypeAccess().getFLOATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getFLOATEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1005:6: (enumLiteral_2= 'boolean' )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1005:6: (enumLiteral_2= 'boolean' )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1005:8: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_33_in_ruleDatatype2116); 

                            current = grammarAccess.getDatatypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDatatypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1011:6: (enumLiteral_3= 'string' )
                    {
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1011:6: (enumLiteral_3= 'string' )
                    // ../net.blimster.gwt.threejs.wdl/src-gen/net/blimster/gwt/threejs/wdl/parser/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1011:8: enumLiteral_3= 'string'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_34_in_ruleDatatype2133); 

                            current = grammarAccess.getDatatypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDatatypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleDatatype"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectWrapper_in_ruleModel130 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleObjectWrapper_in_entryRuleObjectWrapper166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectWrapper176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleObjectWrapper219 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleObjectWrapper245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectWrapper262 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleObjectWrapper280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectWrapper300 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleObjectWrapper314 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleObjectWrapper326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectWrapper347 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleObjectWrapper359 = new BitSet(new long[]{0x000000000A060000L});
    public static final BitSet FOLLOW_ruleConstructorSection_in_ruleObjectWrapper380 = new BitSet(new long[]{0x000000000A020000L});
    public static final BitSet FOLLOW_rulePropertySection_in_ruleObjectWrapper402 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_ruleMethodSection_in_ruleObjectWrapper424 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleObjectWrapper437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorSection_in_entryRuleConstructorSection473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructorSection483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleConstructorSection529 = new BitSet(new long[]{0x0000000000580012L});
    public static final BitSet FOLLOW_19_in_ruleConstructorSection548 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstructorSection573 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstructorSection585 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConstructorSection597 = new BitSet(new long[]{0x0000000000500012L});
    public static final BitSet FOLLOW_22_in_ruleConstructorSection618 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstructorSection643 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstructorSection655 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConstructorSection667 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleConstructorSection690 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor788 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstructor806 = new BitSet(new long[]{0x0000000780000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleConstructor827 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_23_in_ruleConstructor840 = new BitSet(new long[]{0x0000000780000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleConstructor861 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21_in_ruleConstructor875 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_24_in_ruleConstructor893 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConstructor919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertySection_in_entryRulePropertySection955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertySection965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePropertySection1002 = new BitSet(new long[]{0x0000000784000012L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePropertySection1032 = new BitSet(new long[]{0x0000000784000012L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleProperty1122 = new BitSet(new long[]{0x0000000780000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleProperty1157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1174 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProperty1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodSection_in_entryRuleMethodSection1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodSection1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMethodSection1274 = new BitSet(new long[]{0x0000000780000012L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMethodSection1304 = new BitSet(new long[]{0x0000000780000012L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod1397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1415 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMethod1432 = new BitSet(new long[]{0x0000000780200010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod1454 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_23_in_ruleMethod1467 = new BitSet(new long[]{0x0000000780000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod1488 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21_in_ruleMethod1504 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMethod1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter1608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleType1723 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType1749 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleType1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType1808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleArrayType1864 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArrayType1881 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleArrayType1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1987 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleQualifiedName2006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2021 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_31_in_ruleDatatype2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDatatype2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDatatype2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDatatype2133 = new BitSet(new long[]{0x0000000000000002L});

}