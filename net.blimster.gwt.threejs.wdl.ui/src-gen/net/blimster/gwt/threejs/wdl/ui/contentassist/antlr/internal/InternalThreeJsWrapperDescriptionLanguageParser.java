package net.blimster.gwt.threejs.wdl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import net.blimster.gwt.threejs.wdl.services.ThreeJsWrapperDescriptionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalThreeJsWrapperDescriptionLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'float'", "'boolean'", "'string'", "'class'", "'{'", "'package'", "';'", "'}'", "'extends'", "'constructors:'", "'('", "')'", "','", "'properties:'", "'methods:'", "'['", "']'", "'.'", "'abstract'", "'builder'", "'default'", "'json'", "'readonly'"
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
    public String getGrammarFileName() { return "../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g"; }


     
     	private ThreeJsWrapperDescriptionLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ThreeJsWrapperDescriptionLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:61:1: ( ruleModel EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:69:1: ruleModel : ( ( rule__Model__WrappersAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:73:2: ( ( ( rule__Model__WrappersAssignment )* ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:74:1: ( ( rule__Model__WrappersAssignment )* )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:74:1: ( ( rule__Model__WrappersAssignment )* )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:75:1: ( rule__Model__WrappersAssignment )*
            {
             before(grammarAccess.getModelAccess().getWrappersAssignment()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:76:1: ( rule__Model__WrappersAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:76:2: rule__Model__WrappersAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__WrappersAssignment_in_ruleModel94);
            	    rule__Model__WrappersAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getWrappersAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleObjectWrapper"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:88:1: entryRuleObjectWrapper : ruleObjectWrapper EOF ;
    public final void entryRuleObjectWrapper() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:89:1: ( ruleObjectWrapper EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:90:1: ruleObjectWrapper EOF
            {
             before(grammarAccess.getObjectWrapperRule()); 
            pushFollow(FOLLOW_ruleObjectWrapper_in_entryRuleObjectWrapper122);
            ruleObjectWrapper();

            state._fsp--;

             after(grammarAccess.getObjectWrapperRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectWrapper129); 

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
    // $ANTLR end "entryRuleObjectWrapper"


    // $ANTLR start "ruleObjectWrapper"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:97:1: ruleObjectWrapper : ( ( rule__ObjectWrapper__Group__0 ) ) ;
    public final void ruleObjectWrapper() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:101:2: ( ( ( rule__ObjectWrapper__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:102:1: ( ( rule__ObjectWrapper__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:102:1: ( ( rule__ObjectWrapper__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:103:1: ( rule__ObjectWrapper__Group__0 )
            {
             before(grammarAccess.getObjectWrapperAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:104:1: ( rule__ObjectWrapper__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:104:2: rule__ObjectWrapper__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__0_in_ruleObjectWrapper155);
            rule__ObjectWrapper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectWrapperAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectWrapper"


    // $ANTLR start "entryRuleConstructorSection"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:116:1: entryRuleConstructorSection : ruleConstructorSection EOF ;
    public final void entryRuleConstructorSection() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:117:1: ( ruleConstructorSection EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:118:1: ruleConstructorSection EOF
            {
             before(grammarAccess.getConstructorSectionRule()); 
            pushFollow(FOLLOW_ruleConstructorSection_in_entryRuleConstructorSection182);
            ruleConstructorSection();

            state._fsp--;

             after(grammarAccess.getConstructorSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructorSection189); 

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
    // $ANTLR end "entryRuleConstructorSection"


    // $ANTLR start "ruleConstructorSection"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:125:1: ruleConstructorSection : ( ( rule__ConstructorSection__Group__0 ) ) ;
    public final void ruleConstructorSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:129:2: ( ( ( rule__ConstructorSection__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:130:1: ( ( rule__ConstructorSection__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:130:1: ( ( rule__ConstructorSection__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:131:1: ( rule__ConstructorSection__Group__0 )
            {
             before(grammarAccess.getConstructorSectionAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:132:1: ( rule__ConstructorSection__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:132:2: rule__ConstructorSection__Group__0
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group__0_in_ruleConstructorSection215);
            rule__ConstructorSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleConstructorSection"


    // $ANTLR start "entryRuleConstructor"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:144:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:145:1: ( ruleConstructor EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:146:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor242);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getConstructorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor249); 

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:153:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:157:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:158:1: ( ( rule__Constructor__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:158:1: ( ( rule__Constructor__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:159:1: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:160:1: ( rule__Constructor__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:160:2: rule__Constructor__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0_in_ruleConstructor275);
            rule__Constructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getGroup()); 

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRulePropertySection"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:172:1: entryRulePropertySection : rulePropertySection EOF ;
    public final void entryRulePropertySection() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:173:1: ( rulePropertySection EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:174:1: rulePropertySection EOF
            {
             before(grammarAccess.getPropertySectionRule()); 
            pushFollow(FOLLOW_rulePropertySection_in_entryRulePropertySection302);
            rulePropertySection();

            state._fsp--;

             after(grammarAccess.getPropertySectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertySection309); 

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
    // $ANTLR end "entryRulePropertySection"


    // $ANTLR start "rulePropertySection"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:181:1: rulePropertySection : ( ( rule__PropertySection__Group__0 ) ) ;
    public final void rulePropertySection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:185:2: ( ( ( rule__PropertySection__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:186:1: ( ( rule__PropertySection__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:186:1: ( ( rule__PropertySection__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:187:1: ( rule__PropertySection__Group__0 )
            {
             before(grammarAccess.getPropertySectionAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:188:1: ( rule__PropertySection__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:188:2: rule__PropertySection__Group__0
            {
            pushFollow(FOLLOW_rule__PropertySection__Group__0_in_rulePropertySection335);
            rule__PropertySection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertySectionAccess().getGroup()); 

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
    // $ANTLR end "rulePropertySection"


    // $ANTLR start "entryRuleProperty"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:200:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:201:1: ( ruleProperty EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:202:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty362);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty369); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:209:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:213:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:214:1: ( ( rule__Property__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:214:1: ( ( rule__Property__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:215:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:216:1: ( rule__Property__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:216:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty395);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMethodSection"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:228:1: entryRuleMethodSection : ruleMethodSection EOF ;
    public final void entryRuleMethodSection() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:229:1: ( ruleMethodSection EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:230:1: ruleMethodSection EOF
            {
             before(grammarAccess.getMethodSectionRule()); 
            pushFollow(FOLLOW_ruleMethodSection_in_entryRuleMethodSection422);
            ruleMethodSection();

            state._fsp--;

             after(grammarAccess.getMethodSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodSection429); 

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
    // $ANTLR end "entryRuleMethodSection"


    // $ANTLR start "ruleMethodSection"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:237:1: ruleMethodSection : ( ( rule__MethodSection__Group__0 ) ) ;
    public final void ruleMethodSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:241:2: ( ( ( rule__MethodSection__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:242:1: ( ( rule__MethodSection__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:242:1: ( ( rule__MethodSection__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:243:1: ( rule__MethodSection__Group__0 )
            {
             before(grammarAccess.getMethodSectionAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:244:1: ( rule__MethodSection__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:244:2: rule__MethodSection__Group__0
            {
            pushFollow(FOLLOW_rule__MethodSection__Group__0_in_ruleMethodSection455);
            rule__MethodSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleMethodSection"


    // $ANTLR start "entryRuleMethod"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:256:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:257:1: ( ruleMethod EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:258:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod482);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod489); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:265:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:269:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:270:1: ( ( rule__Method__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:270:1: ( ( rule__Method__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:271:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:272:1: ( rule__Method__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:272:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod515);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:284:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:285:1: ( ruleParameter EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:286:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter542);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter549); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:293:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:297:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:298:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:298:1: ( ( rule__Parameter__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:299:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:300:1: ( rule__Parameter__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:300:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter575);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:312:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:313:1: ( ruleType EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:314:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType602);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType609); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:321:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:325:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:326:1: ( ( rule__Type__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:326:1: ( ( rule__Type__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:327:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:328:1: ( rule__Type__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:328:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType635);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleArrayType"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:340:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:341:1: ( ruleArrayType EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:342:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType662);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType669); 

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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:349:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:353:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:354:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:354:1: ( ( rule__ArrayType__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:355:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:356:1: ( rule__ArrayType__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:356:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType695);
            rule__ArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:368:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:369:1: ( ruleQualifiedName EOF )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:370:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName722);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName729); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:377:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:381:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:382:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:382:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:383:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:384:1: ( rule__QualifiedName__Group__0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:384:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName755);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleDatatype"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:397:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:401:1: ( ( ( rule__Datatype__Alternatives ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:402:1: ( ( rule__Datatype__Alternatives ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:402:1: ( ( rule__Datatype__Alternatives ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:403:1: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:404:1: ( rule__Datatype__Alternatives )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:404:2: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype792);
            rule__Datatype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "rule__Type__Alternatives_0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:415:1: rule__Type__Alternatives_0 : ( ( ( rule__Type__DatatypeAssignment_0_0 ) ) | ( ( rule__Type__WrapperAssignment_0_1 ) ) );
    public final void rule__Type__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:419:1: ( ( ( rule__Type__DatatypeAssignment_0_0 ) ) | ( ( rule__Type__WrapperAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:420:1: ( ( rule__Type__DatatypeAssignment_0_0 ) )
                    {
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:420:1: ( ( rule__Type__DatatypeAssignment_0_0 ) )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:421:1: ( rule__Type__DatatypeAssignment_0_0 )
                    {
                     before(grammarAccess.getTypeAccess().getDatatypeAssignment_0_0()); 
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:422:1: ( rule__Type__DatatypeAssignment_0_0 )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:422:2: rule__Type__DatatypeAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Type__DatatypeAssignment_0_0_in_rule__Type__Alternatives_0827);
                    rule__Type__DatatypeAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getDatatypeAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:426:6: ( ( rule__Type__WrapperAssignment_0_1 ) )
                    {
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:426:6: ( ( rule__Type__WrapperAssignment_0_1 ) )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:427:1: ( rule__Type__WrapperAssignment_0_1 )
                    {
                     before(grammarAccess.getTypeAccess().getWrapperAssignment_0_1()); 
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:428:1: ( rule__Type__WrapperAssignment_0_1 )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:428:2: rule__Type__WrapperAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Type__WrapperAssignment_0_1_in_rule__Type__Alternatives_0845);
                    rule__Type__WrapperAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getWrapperAssignment_0_1()); 

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
    // $ANTLR end "rule__Type__Alternatives_0"


    // $ANTLR start "rule__Datatype__Alternatives"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:437:1: rule__Datatype__Alternatives : ( ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:441:1: ( ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:442:1: ( ( 'int' ) )
                    {
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:442:1: ( ( 'int' ) )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:443:1: ( 'int' )
                    {
                     before(grammarAccess.getDatatypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:444:1: ( 'int' )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:444:3: 'int'
                    {
                    match(input,11,FOLLOW_11_in_rule__Datatype__Alternatives879); 

                    }

                     after(grammarAccess.getDatatypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:449:6: ( ( 'float' ) )
                    {
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:449:6: ( ( 'float' ) )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:450:1: ( 'float' )
                    {
                     before(grammarAccess.getDatatypeAccess().getFLOATEnumLiteralDeclaration_1()); 
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:451:1: ( 'float' )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:451:3: 'float'
                    {
                    match(input,12,FOLLOW_12_in_rule__Datatype__Alternatives900); 

                    }

                     after(grammarAccess.getDatatypeAccess().getFLOATEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:456:6: ( ( 'boolean' ) )
                    {
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:456:6: ( ( 'boolean' ) )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:457:1: ( 'boolean' )
                    {
                     before(grammarAccess.getDatatypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:458:1: ( 'boolean' )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:458:3: 'boolean'
                    {
                    match(input,13,FOLLOW_13_in_rule__Datatype__Alternatives921); 

                    }

                     after(grammarAccess.getDatatypeAccess().getBOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:463:6: ( ( 'string' ) )
                    {
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:463:6: ( ( 'string' ) )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:464:1: ( 'string' )
                    {
                     before(grammarAccess.getDatatypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:465:1: ( 'string' )
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:465:3: 'string'
                    {
                    match(input,14,FOLLOW_14_in_rule__Datatype__Alternatives942); 

                    }

                     after(grammarAccess.getDatatypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Datatype__Alternatives"


    // $ANTLR start "rule__ObjectWrapper__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:477:1: rule__ObjectWrapper__Group__0 : rule__ObjectWrapper__Group__0__Impl rule__ObjectWrapper__Group__1 ;
    public final void rule__ObjectWrapper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:481:1: ( rule__ObjectWrapper__Group__0__Impl rule__ObjectWrapper__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:482:2: rule__ObjectWrapper__Group__0__Impl rule__ObjectWrapper__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__0__Impl_in_rule__ObjectWrapper__Group__0975);
            rule__ObjectWrapper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__1_in_rule__ObjectWrapper__Group__0978);
            rule__ObjectWrapper__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__0"


    // $ANTLR start "rule__ObjectWrapper__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:489:1: rule__ObjectWrapper__Group__0__Impl : ( ( rule__ObjectWrapper__AbstractAssignment_0 )? ) ;
    public final void rule__ObjectWrapper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:493:1: ( ( ( rule__ObjectWrapper__AbstractAssignment_0 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:494:1: ( ( rule__ObjectWrapper__AbstractAssignment_0 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:494:1: ( ( rule__ObjectWrapper__AbstractAssignment_0 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:495:1: ( rule__ObjectWrapper__AbstractAssignment_0 )?
            {
             before(grammarAccess.getObjectWrapperAccess().getAbstractAssignment_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:496:1: ( rule__ObjectWrapper__AbstractAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:496:2: rule__ObjectWrapper__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ObjectWrapper__AbstractAssignment_0_in_rule__ObjectWrapper__Group__0__Impl1005);
                    rule__ObjectWrapper__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectWrapperAccess().getAbstractAssignment_0()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__0__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:506:1: rule__ObjectWrapper__Group__1 : rule__ObjectWrapper__Group__1__Impl rule__ObjectWrapper__Group__2 ;
    public final void rule__ObjectWrapper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:510:1: ( rule__ObjectWrapper__Group__1__Impl rule__ObjectWrapper__Group__2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:511:2: rule__ObjectWrapper__Group__1__Impl rule__ObjectWrapper__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__1__Impl_in_rule__ObjectWrapper__Group__11036);
            rule__ObjectWrapper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__2_in_rule__ObjectWrapper__Group__11039);
            rule__ObjectWrapper__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__1"


    // $ANTLR start "rule__ObjectWrapper__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:518:1: rule__ObjectWrapper__Group__1__Impl : ( 'class' ) ;
    public final void rule__ObjectWrapper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:522:1: ( ( 'class' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:523:1: ( 'class' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:523:1: ( 'class' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:524:1: 'class'
            {
             before(grammarAccess.getObjectWrapperAccess().getClassKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__ObjectWrapper__Group__1__Impl1067); 
             after(grammarAccess.getObjectWrapperAccess().getClassKeyword_1()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__1__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:537:1: rule__ObjectWrapper__Group__2 : rule__ObjectWrapper__Group__2__Impl rule__ObjectWrapper__Group__3 ;
    public final void rule__ObjectWrapper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:541:1: ( rule__ObjectWrapper__Group__2__Impl rule__ObjectWrapper__Group__3 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:542:2: rule__ObjectWrapper__Group__2__Impl rule__ObjectWrapper__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__2__Impl_in_rule__ObjectWrapper__Group__21098);
            rule__ObjectWrapper__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__3_in_rule__ObjectWrapper__Group__21101);
            rule__ObjectWrapper__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__2"


    // $ANTLR start "rule__ObjectWrapper__Group__2__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:549:1: rule__ObjectWrapper__Group__2__Impl : ( ( rule__ObjectWrapper__NameAssignment_2 ) ) ;
    public final void rule__ObjectWrapper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:553:1: ( ( ( rule__ObjectWrapper__NameAssignment_2 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:554:1: ( ( rule__ObjectWrapper__NameAssignment_2 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:554:1: ( ( rule__ObjectWrapper__NameAssignment_2 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:555:1: ( rule__ObjectWrapper__NameAssignment_2 )
            {
             before(grammarAccess.getObjectWrapperAccess().getNameAssignment_2()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:556:1: ( rule__ObjectWrapper__NameAssignment_2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:556:2: rule__ObjectWrapper__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__NameAssignment_2_in_rule__ObjectWrapper__Group__2__Impl1128);
            rule__ObjectWrapper__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectWrapperAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__2__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__3"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:566:1: rule__ObjectWrapper__Group__3 : rule__ObjectWrapper__Group__3__Impl rule__ObjectWrapper__Group__4 ;
    public final void rule__ObjectWrapper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:570:1: ( rule__ObjectWrapper__Group__3__Impl rule__ObjectWrapper__Group__4 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:571:2: rule__ObjectWrapper__Group__3__Impl rule__ObjectWrapper__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__3__Impl_in_rule__ObjectWrapper__Group__31158);
            rule__ObjectWrapper__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__4_in_rule__ObjectWrapper__Group__31161);
            rule__ObjectWrapper__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__3"


    // $ANTLR start "rule__ObjectWrapper__Group__3__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:578:1: rule__ObjectWrapper__Group__3__Impl : ( ( rule__ObjectWrapper__Group_3__0 )? ) ;
    public final void rule__ObjectWrapper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:582:1: ( ( ( rule__ObjectWrapper__Group_3__0 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:583:1: ( ( rule__ObjectWrapper__Group_3__0 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:583:1: ( ( rule__ObjectWrapper__Group_3__0 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:584:1: ( rule__ObjectWrapper__Group_3__0 )?
            {
             before(grammarAccess.getObjectWrapperAccess().getGroup_3()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:585:1: ( rule__ObjectWrapper__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:585:2: rule__ObjectWrapper__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ObjectWrapper__Group_3__0_in_rule__ObjectWrapper__Group__3__Impl1188);
                    rule__ObjectWrapper__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectWrapperAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__3__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__4"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:595:1: rule__ObjectWrapper__Group__4 : rule__ObjectWrapper__Group__4__Impl rule__ObjectWrapper__Group__5 ;
    public final void rule__ObjectWrapper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:599:1: ( rule__ObjectWrapper__Group__4__Impl rule__ObjectWrapper__Group__5 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:600:2: rule__ObjectWrapper__Group__4__Impl rule__ObjectWrapper__Group__5
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__4__Impl_in_rule__ObjectWrapper__Group__41219);
            rule__ObjectWrapper__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__5_in_rule__ObjectWrapper__Group__41222);
            rule__ObjectWrapper__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__4"


    // $ANTLR start "rule__ObjectWrapper__Group__4__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:607:1: rule__ObjectWrapper__Group__4__Impl : ( '{' ) ;
    public final void rule__ObjectWrapper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:611:1: ( ( '{' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:612:1: ( '{' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:612:1: ( '{' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:613:1: '{'
            {
             before(grammarAccess.getObjectWrapperAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__ObjectWrapper__Group__4__Impl1250); 
             after(grammarAccess.getObjectWrapperAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__4__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__5"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:626:1: rule__ObjectWrapper__Group__5 : rule__ObjectWrapper__Group__5__Impl rule__ObjectWrapper__Group__6 ;
    public final void rule__ObjectWrapper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:630:1: ( rule__ObjectWrapper__Group__5__Impl rule__ObjectWrapper__Group__6 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:631:2: rule__ObjectWrapper__Group__5__Impl rule__ObjectWrapper__Group__6
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__5__Impl_in_rule__ObjectWrapper__Group__51281);
            rule__ObjectWrapper__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__6_in_rule__ObjectWrapper__Group__51284);
            rule__ObjectWrapper__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__5"


    // $ANTLR start "rule__ObjectWrapper__Group__5__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:638:1: rule__ObjectWrapper__Group__5__Impl : ( 'package' ) ;
    public final void rule__ObjectWrapper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:642:1: ( ( 'package' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:643:1: ( 'package' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:643:1: ( 'package' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:644:1: 'package'
            {
             before(grammarAccess.getObjectWrapperAccess().getPackageKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__ObjectWrapper__Group__5__Impl1312); 
             after(grammarAccess.getObjectWrapperAccess().getPackageKeyword_5()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__5__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__6"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:657:1: rule__ObjectWrapper__Group__6 : rule__ObjectWrapper__Group__6__Impl rule__ObjectWrapper__Group__7 ;
    public final void rule__ObjectWrapper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:661:1: ( rule__ObjectWrapper__Group__6__Impl rule__ObjectWrapper__Group__7 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:662:2: rule__ObjectWrapper__Group__6__Impl rule__ObjectWrapper__Group__7
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__6__Impl_in_rule__ObjectWrapper__Group__61343);
            rule__ObjectWrapper__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__7_in_rule__ObjectWrapper__Group__61346);
            rule__ObjectWrapper__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__6"


    // $ANTLR start "rule__ObjectWrapper__Group__6__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:669:1: rule__ObjectWrapper__Group__6__Impl : ( ( rule__ObjectWrapper__PckAssignment_6 ) ) ;
    public final void rule__ObjectWrapper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:673:1: ( ( ( rule__ObjectWrapper__PckAssignment_6 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:674:1: ( ( rule__ObjectWrapper__PckAssignment_6 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:674:1: ( ( rule__ObjectWrapper__PckAssignment_6 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:675:1: ( rule__ObjectWrapper__PckAssignment_6 )
            {
             before(grammarAccess.getObjectWrapperAccess().getPckAssignment_6()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:676:1: ( rule__ObjectWrapper__PckAssignment_6 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:676:2: rule__ObjectWrapper__PckAssignment_6
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__PckAssignment_6_in_rule__ObjectWrapper__Group__6__Impl1373);
            rule__ObjectWrapper__PckAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getObjectWrapperAccess().getPckAssignment_6()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__6__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__7"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:686:1: rule__ObjectWrapper__Group__7 : rule__ObjectWrapper__Group__7__Impl rule__ObjectWrapper__Group__8 ;
    public final void rule__ObjectWrapper__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:690:1: ( rule__ObjectWrapper__Group__7__Impl rule__ObjectWrapper__Group__8 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:691:2: rule__ObjectWrapper__Group__7__Impl rule__ObjectWrapper__Group__8
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__7__Impl_in_rule__ObjectWrapper__Group__71403);
            rule__ObjectWrapper__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__8_in_rule__ObjectWrapper__Group__71406);
            rule__ObjectWrapper__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__7"


    // $ANTLR start "rule__ObjectWrapper__Group__7__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:698:1: rule__ObjectWrapper__Group__7__Impl : ( ';' ) ;
    public final void rule__ObjectWrapper__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:702:1: ( ( ';' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:703:1: ( ';' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:703:1: ( ';' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:704:1: ';'
            {
             before(grammarAccess.getObjectWrapperAccess().getSemicolonKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__ObjectWrapper__Group__7__Impl1434); 
             after(grammarAccess.getObjectWrapperAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__7__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__8"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:717:1: rule__ObjectWrapper__Group__8 : rule__ObjectWrapper__Group__8__Impl rule__ObjectWrapper__Group__9 ;
    public final void rule__ObjectWrapper__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:721:1: ( rule__ObjectWrapper__Group__8__Impl rule__ObjectWrapper__Group__9 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:722:2: rule__ObjectWrapper__Group__8__Impl rule__ObjectWrapper__Group__9
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__8__Impl_in_rule__ObjectWrapper__Group__81465);
            rule__ObjectWrapper__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__9_in_rule__ObjectWrapper__Group__81468);
            rule__ObjectWrapper__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__8"


    // $ANTLR start "rule__ObjectWrapper__Group__8__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:729:1: rule__ObjectWrapper__Group__8__Impl : ( ( rule__ObjectWrapper__ConstructorSectionAssignment_8 )? ) ;
    public final void rule__ObjectWrapper__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:733:1: ( ( ( rule__ObjectWrapper__ConstructorSectionAssignment_8 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:734:1: ( ( rule__ObjectWrapper__ConstructorSectionAssignment_8 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:734:1: ( ( rule__ObjectWrapper__ConstructorSectionAssignment_8 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:735:1: ( rule__ObjectWrapper__ConstructorSectionAssignment_8 )?
            {
             before(grammarAccess.getObjectWrapperAccess().getConstructorSectionAssignment_8()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:736:1: ( rule__ObjectWrapper__ConstructorSectionAssignment_8 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:736:2: rule__ObjectWrapper__ConstructorSectionAssignment_8
                    {
                    pushFollow(FOLLOW_rule__ObjectWrapper__ConstructorSectionAssignment_8_in_rule__ObjectWrapper__Group__8__Impl1495);
                    rule__ObjectWrapper__ConstructorSectionAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectWrapperAccess().getConstructorSectionAssignment_8()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__8__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__9"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:746:1: rule__ObjectWrapper__Group__9 : rule__ObjectWrapper__Group__9__Impl rule__ObjectWrapper__Group__10 ;
    public final void rule__ObjectWrapper__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:750:1: ( rule__ObjectWrapper__Group__9__Impl rule__ObjectWrapper__Group__10 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:751:2: rule__ObjectWrapper__Group__9__Impl rule__ObjectWrapper__Group__10
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__9__Impl_in_rule__ObjectWrapper__Group__91526);
            rule__ObjectWrapper__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__10_in_rule__ObjectWrapper__Group__91529);
            rule__ObjectWrapper__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__9"


    // $ANTLR start "rule__ObjectWrapper__Group__9__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:758:1: rule__ObjectWrapper__Group__9__Impl : ( ( rule__ObjectWrapper__PropertySectionAssignment_9 )? ) ;
    public final void rule__ObjectWrapper__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:762:1: ( ( ( rule__ObjectWrapper__PropertySectionAssignment_9 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:763:1: ( ( rule__ObjectWrapper__PropertySectionAssignment_9 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:763:1: ( ( rule__ObjectWrapper__PropertySectionAssignment_9 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:764:1: ( rule__ObjectWrapper__PropertySectionAssignment_9 )?
            {
             before(grammarAccess.getObjectWrapperAccess().getPropertySectionAssignment_9()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:765:1: ( rule__ObjectWrapper__PropertySectionAssignment_9 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:765:2: rule__ObjectWrapper__PropertySectionAssignment_9
                    {
                    pushFollow(FOLLOW_rule__ObjectWrapper__PropertySectionAssignment_9_in_rule__ObjectWrapper__Group__9__Impl1556);
                    rule__ObjectWrapper__PropertySectionAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectWrapperAccess().getPropertySectionAssignment_9()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__9__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__10"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:775:1: rule__ObjectWrapper__Group__10 : rule__ObjectWrapper__Group__10__Impl rule__ObjectWrapper__Group__11 ;
    public final void rule__ObjectWrapper__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:779:1: ( rule__ObjectWrapper__Group__10__Impl rule__ObjectWrapper__Group__11 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:780:2: rule__ObjectWrapper__Group__10__Impl rule__ObjectWrapper__Group__11
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__10__Impl_in_rule__ObjectWrapper__Group__101587);
            rule__ObjectWrapper__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group__11_in_rule__ObjectWrapper__Group__101590);
            rule__ObjectWrapper__Group__11();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__10"


    // $ANTLR start "rule__ObjectWrapper__Group__10__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:787:1: rule__ObjectWrapper__Group__10__Impl : ( ( rule__ObjectWrapper__MethodSectionAssignment_10 )? ) ;
    public final void rule__ObjectWrapper__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:791:1: ( ( ( rule__ObjectWrapper__MethodSectionAssignment_10 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:792:1: ( ( rule__ObjectWrapper__MethodSectionAssignment_10 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:792:1: ( ( rule__ObjectWrapper__MethodSectionAssignment_10 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:793:1: ( rule__ObjectWrapper__MethodSectionAssignment_10 )?
            {
             before(grammarAccess.getObjectWrapperAccess().getMethodSectionAssignment_10()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:794:1: ( rule__ObjectWrapper__MethodSectionAssignment_10 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:794:2: rule__ObjectWrapper__MethodSectionAssignment_10
                    {
                    pushFollow(FOLLOW_rule__ObjectWrapper__MethodSectionAssignment_10_in_rule__ObjectWrapper__Group__10__Impl1617);
                    rule__ObjectWrapper__MethodSectionAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectWrapperAccess().getMethodSectionAssignment_10()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__10__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group__11"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:804:1: rule__ObjectWrapper__Group__11 : rule__ObjectWrapper__Group__11__Impl ;
    public final void rule__ObjectWrapper__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:808:1: ( rule__ObjectWrapper__Group__11__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:809:2: rule__ObjectWrapper__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group__11__Impl_in_rule__ObjectWrapper__Group__111648);
            rule__ObjectWrapper__Group__11__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group__11"


    // $ANTLR start "rule__ObjectWrapper__Group__11__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:815:1: rule__ObjectWrapper__Group__11__Impl : ( '}' ) ;
    public final void rule__ObjectWrapper__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:819:1: ( ( '}' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:820:1: ( '}' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:820:1: ( '}' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:821:1: '}'
            {
             before(grammarAccess.getObjectWrapperAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FOLLOW_19_in_rule__ObjectWrapper__Group__11__Impl1676); 
             after(grammarAccess.getObjectWrapperAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group__11__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group_3__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:858:1: rule__ObjectWrapper__Group_3__0 : rule__ObjectWrapper__Group_3__0__Impl rule__ObjectWrapper__Group_3__1 ;
    public final void rule__ObjectWrapper__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:862:1: ( rule__ObjectWrapper__Group_3__0__Impl rule__ObjectWrapper__Group_3__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:863:2: rule__ObjectWrapper__Group_3__0__Impl rule__ObjectWrapper__Group_3__1
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group_3__0__Impl_in_rule__ObjectWrapper__Group_3__01731);
            rule__ObjectWrapper__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectWrapper__Group_3__1_in_rule__ObjectWrapper__Group_3__01734);
            rule__ObjectWrapper__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group_3__0"


    // $ANTLR start "rule__ObjectWrapper__Group_3__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:870:1: rule__ObjectWrapper__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ObjectWrapper__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:874:1: ( ( 'extends' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:875:1: ( 'extends' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:875:1: ( 'extends' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:876:1: 'extends'
            {
             before(grammarAccess.getObjectWrapperAccess().getExtendsKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__ObjectWrapper__Group_3__0__Impl1762); 
             after(grammarAccess.getObjectWrapperAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group_3__0__Impl"


    // $ANTLR start "rule__ObjectWrapper__Group_3__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:889:1: rule__ObjectWrapper__Group_3__1 : rule__ObjectWrapper__Group_3__1__Impl ;
    public final void rule__ObjectWrapper__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:893:1: ( rule__ObjectWrapper__Group_3__1__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:894:2: rule__ObjectWrapper__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__Group_3__1__Impl_in_rule__ObjectWrapper__Group_3__11793);
            rule__ObjectWrapper__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ObjectWrapper__Group_3__1"


    // $ANTLR start "rule__ObjectWrapper__Group_3__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:900:1: rule__ObjectWrapper__Group_3__1__Impl : ( ( rule__ObjectWrapper__SupertypeAssignment_3_1 ) ) ;
    public final void rule__ObjectWrapper__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:904:1: ( ( ( rule__ObjectWrapper__SupertypeAssignment_3_1 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:905:1: ( ( rule__ObjectWrapper__SupertypeAssignment_3_1 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:905:1: ( ( rule__ObjectWrapper__SupertypeAssignment_3_1 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:906:1: ( rule__ObjectWrapper__SupertypeAssignment_3_1 )
            {
             before(grammarAccess.getObjectWrapperAccess().getSupertypeAssignment_3_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:907:1: ( rule__ObjectWrapper__SupertypeAssignment_3_1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:907:2: rule__ObjectWrapper__SupertypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ObjectWrapper__SupertypeAssignment_3_1_in_rule__ObjectWrapper__Group_3__1__Impl1820);
            rule__ObjectWrapper__SupertypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectWrapperAccess().getSupertypeAssignment_3_1()); 

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
    // $ANTLR end "rule__ObjectWrapper__Group_3__1__Impl"


    // $ANTLR start "rule__ConstructorSection__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:921:1: rule__ConstructorSection__Group__0 : rule__ConstructorSection__Group__0__Impl rule__ConstructorSection__Group__1 ;
    public final void rule__ConstructorSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:925:1: ( rule__ConstructorSection__Group__0__Impl rule__ConstructorSection__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:926:2: rule__ConstructorSection__Group__0__Impl rule__ConstructorSection__Group__1
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group__0__Impl_in_rule__ConstructorSection__Group__01854);
            rule__ConstructorSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructorSection__Group__1_in_rule__ConstructorSection__Group__01857);
            rule__ConstructorSection__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group__0"


    // $ANTLR start "rule__ConstructorSection__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:933:1: rule__ConstructorSection__Group__0__Impl : ( () ) ;
    public final void rule__ConstructorSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:937:1: ( ( () ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:938:1: ( () )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:938:1: ( () )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:939:1: ()
            {
             before(grammarAccess.getConstructorSectionAccess().getConstructorSectionAction_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:940:1: ()
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:942:1: 
            {
            }

             after(grammarAccess.getConstructorSectionAccess().getConstructorSectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructorSection__Group__0__Impl"


    // $ANTLR start "rule__ConstructorSection__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:952:1: rule__ConstructorSection__Group__1 : rule__ConstructorSection__Group__1__Impl rule__ConstructorSection__Group__2 ;
    public final void rule__ConstructorSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:956:1: ( rule__ConstructorSection__Group__1__Impl rule__ConstructorSection__Group__2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:957:2: rule__ConstructorSection__Group__1__Impl rule__ConstructorSection__Group__2
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group__1__Impl_in_rule__ConstructorSection__Group__11915);
            rule__ConstructorSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructorSection__Group__2_in_rule__ConstructorSection__Group__11918);
            rule__ConstructorSection__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group__1"


    // $ANTLR start "rule__ConstructorSection__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:964:1: rule__ConstructorSection__Group__1__Impl : ( 'constructors:' ) ;
    public final void rule__ConstructorSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:968:1: ( ( 'constructors:' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:969:1: ( 'constructors:' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:969:1: ( 'constructors:' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:970:1: 'constructors:'
            {
             before(grammarAccess.getConstructorSectionAccess().getConstructorsKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ConstructorSection__Group__1__Impl1946); 
             after(grammarAccess.getConstructorSectionAccess().getConstructorsKeyword_1()); 

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
    // $ANTLR end "rule__ConstructorSection__Group__1__Impl"


    // $ANTLR start "rule__ConstructorSection__Group__2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:983:1: rule__ConstructorSection__Group__2 : rule__ConstructorSection__Group__2__Impl rule__ConstructorSection__Group__3 ;
    public final void rule__ConstructorSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:987:1: ( rule__ConstructorSection__Group__2__Impl rule__ConstructorSection__Group__3 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:988:2: rule__ConstructorSection__Group__2__Impl rule__ConstructorSection__Group__3
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group__2__Impl_in_rule__ConstructorSection__Group__21977);
            rule__ConstructorSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructorSection__Group__3_in_rule__ConstructorSection__Group__21980);
            rule__ConstructorSection__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group__2"


    // $ANTLR start "rule__ConstructorSection__Group__2__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:995:1: rule__ConstructorSection__Group__2__Impl : ( ( rule__ConstructorSection__Group_2__0 )? ) ;
    public final void rule__ConstructorSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:999:1: ( ( ( rule__ConstructorSection__Group_2__0 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1000:1: ( ( rule__ConstructorSection__Group_2__0 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1000:1: ( ( rule__ConstructorSection__Group_2__0 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1001:1: ( rule__ConstructorSection__Group_2__0 )?
            {
             before(grammarAccess.getConstructorSectionAccess().getGroup_2()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1002:1: ( rule__ConstructorSection__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1002:2: rule__ConstructorSection__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ConstructorSection__Group_2__0_in_rule__ConstructorSection__Group__2__Impl2007);
                    rule__ConstructorSection__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorSectionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ConstructorSection__Group__2__Impl"


    // $ANTLR start "rule__ConstructorSection__Group__3"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1012:1: rule__ConstructorSection__Group__3 : rule__ConstructorSection__Group__3__Impl rule__ConstructorSection__Group__4 ;
    public final void rule__ConstructorSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1016:1: ( rule__ConstructorSection__Group__3__Impl rule__ConstructorSection__Group__4 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1017:2: rule__ConstructorSection__Group__3__Impl rule__ConstructorSection__Group__4
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group__3__Impl_in_rule__ConstructorSection__Group__32038);
            rule__ConstructorSection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructorSection__Group__4_in_rule__ConstructorSection__Group__32041);
            rule__ConstructorSection__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group__3"


    // $ANTLR start "rule__ConstructorSection__Group__3__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1024:1: rule__ConstructorSection__Group__3__Impl : ( ( rule__ConstructorSection__Group_3__0 )? ) ;
    public final void rule__ConstructorSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1028:1: ( ( ( rule__ConstructorSection__Group_3__0 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1029:1: ( ( rule__ConstructorSection__Group_3__0 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1029:1: ( ( rule__ConstructorSection__Group_3__0 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1030:1: ( rule__ConstructorSection__Group_3__0 )?
            {
             before(grammarAccess.getConstructorSectionAccess().getGroup_3()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1031:1: ( rule__ConstructorSection__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1031:2: rule__ConstructorSection__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ConstructorSection__Group_3__0_in_rule__ConstructorSection__Group__3__Impl2068);
                    rule__ConstructorSection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorSectionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ConstructorSection__Group__3__Impl"


    // $ANTLR start "rule__ConstructorSection__Group__4"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1041:1: rule__ConstructorSection__Group__4 : rule__ConstructorSection__Group__4__Impl ;
    public final void rule__ConstructorSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1045:1: ( rule__ConstructorSection__Group__4__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1046:2: rule__ConstructorSection__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group__4__Impl_in_rule__ConstructorSection__Group__42099);
            rule__ConstructorSection__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group__4"


    // $ANTLR start "rule__ConstructorSection__Group__4__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1052:1: rule__ConstructorSection__Group__4__Impl : ( ( rule__ConstructorSection__ConstructorsAssignment_4 )* ) ;
    public final void rule__ConstructorSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1056:1: ( ( ( rule__ConstructorSection__ConstructorsAssignment_4 )* ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1057:1: ( ( rule__ConstructorSection__ConstructorsAssignment_4 )* )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1057:1: ( ( rule__ConstructorSection__ConstructorsAssignment_4 )* )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1058:1: ( rule__ConstructorSection__ConstructorsAssignment_4 )*
            {
             before(grammarAccess.getConstructorSectionAccess().getConstructorsAssignment_4()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1059:1: ( rule__ConstructorSection__ConstructorsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1059:2: rule__ConstructorSection__ConstructorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ConstructorSection__ConstructorsAssignment_4_in_rule__ConstructorSection__Group__4__Impl2126);
            	    rule__ConstructorSection__ConstructorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getConstructorSectionAccess().getConstructorsAssignment_4()); 

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
    // $ANTLR end "rule__ConstructorSection__Group__4__Impl"


    // $ANTLR start "rule__ConstructorSection__Group_2__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1079:1: rule__ConstructorSection__Group_2__0 : rule__ConstructorSection__Group_2__0__Impl rule__ConstructorSection__Group_2__1 ;
    public final void rule__ConstructorSection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1083:1: ( rule__ConstructorSection__Group_2__0__Impl rule__ConstructorSection__Group_2__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1084:2: rule__ConstructorSection__Group_2__0__Impl rule__ConstructorSection__Group_2__1
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group_2__0__Impl_in_rule__ConstructorSection__Group_2__02167);
            rule__ConstructorSection__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructorSection__Group_2__1_in_rule__ConstructorSection__Group_2__02170);
            rule__ConstructorSection__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group_2__0"


    // $ANTLR start "rule__ConstructorSection__Group_2__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1091:1: rule__ConstructorSection__Group_2__0__Impl : ( ( rule__ConstructorSection__BuilderConstructorAssignment_2_0 ) ) ;
    public final void rule__ConstructorSection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1095:1: ( ( ( rule__ConstructorSection__BuilderConstructorAssignment_2_0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1096:1: ( ( rule__ConstructorSection__BuilderConstructorAssignment_2_0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1096:1: ( ( rule__ConstructorSection__BuilderConstructorAssignment_2_0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1097:1: ( rule__ConstructorSection__BuilderConstructorAssignment_2_0 )
            {
             before(grammarAccess.getConstructorSectionAccess().getBuilderConstructorAssignment_2_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1098:1: ( rule__ConstructorSection__BuilderConstructorAssignment_2_0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1098:2: rule__ConstructorSection__BuilderConstructorAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ConstructorSection__BuilderConstructorAssignment_2_0_in_rule__ConstructorSection__Group_2__0__Impl2197);
            rule__ConstructorSection__BuilderConstructorAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorSectionAccess().getBuilderConstructorAssignment_2_0()); 

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
    // $ANTLR end "rule__ConstructorSection__Group_2__0__Impl"


    // $ANTLR start "rule__ConstructorSection__Group_2__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1108:1: rule__ConstructorSection__Group_2__1 : rule__ConstructorSection__Group_2__1__Impl rule__ConstructorSection__Group_2__2 ;
    public final void rule__ConstructorSection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1112:1: ( rule__ConstructorSection__Group_2__1__Impl rule__ConstructorSection__Group_2__2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1113:2: rule__ConstructorSection__Group_2__1__Impl rule__ConstructorSection__Group_2__2
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group_2__1__Impl_in_rule__ConstructorSection__Group_2__12227);
            rule__ConstructorSection__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructorSection__Group_2__2_in_rule__ConstructorSection__Group_2__12230);
            rule__ConstructorSection__Group_2__2();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group_2__1"


    // $ANTLR start "rule__ConstructorSection__Group_2__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1120:1: rule__ConstructorSection__Group_2__1__Impl : ( '(' ) ;
    public final void rule__ConstructorSection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1124:1: ( ( '(' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1125:1: ( '(' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1125:1: ( '(' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1126:1: '('
            {
             before(grammarAccess.getConstructorSectionAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__ConstructorSection__Group_2__1__Impl2258); 
             after(grammarAccess.getConstructorSectionAccess().getLeftParenthesisKeyword_2_1()); 

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
    // $ANTLR end "rule__ConstructorSection__Group_2__1__Impl"


    // $ANTLR start "rule__ConstructorSection__Group_2__2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1139:1: rule__ConstructorSection__Group_2__2 : rule__ConstructorSection__Group_2__2__Impl rule__ConstructorSection__Group_2__3 ;
    public final void rule__ConstructorSection__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1143:1: ( rule__ConstructorSection__Group_2__2__Impl rule__ConstructorSection__Group_2__3 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1144:2: rule__ConstructorSection__Group_2__2__Impl rule__ConstructorSection__Group_2__3
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group_2__2__Impl_in_rule__ConstructorSection__Group_2__22289);
            rule__ConstructorSection__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructorSection__Group_2__3_in_rule__ConstructorSection__Group_2__22292);
            rule__ConstructorSection__Group_2__3();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group_2__2"


    // $ANTLR start "rule__ConstructorSection__Group_2__2__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1151:1: rule__ConstructorSection__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ConstructorSection__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1155:1: ( ( ')' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1156:1: ( ')' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1156:1: ( ')' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1157:1: ')'
            {
             before(grammarAccess.getConstructorSectionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__ConstructorSection__Group_2__2__Impl2320); 
             after(grammarAccess.getConstructorSectionAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__ConstructorSection__Group_2__2__Impl"


    // $ANTLR start "rule__ConstructorSection__Group_2__3"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1170:1: rule__ConstructorSection__Group_2__3 : rule__ConstructorSection__Group_2__3__Impl ;
    public final void rule__ConstructorSection__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1174:1: ( rule__ConstructorSection__Group_2__3__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1175:2: rule__ConstructorSection__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group_2__3__Impl_in_rule__ConstructorSection__Group_2__32351);
            rule__ConstructorSection__Group_2__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group_2__3"


    // $ANTLR start "rule__ConstructorSection__Group_2__3__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1181:1: rule__ConstructorSection__Group_2__3__Impl : ( ';' ) ;
    public final void rule__ConstructorSection__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1185:1: ( ( ';' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1186:1: ( ';' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1186:1: ( ';' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1187:1: ';'
            {
             before(grammarAccess.getConstructorSectionAccess().getSemicolonKeyword_2_3()); 
            match(input,18,FOLLOW_18_in_rule__ConstructorSection__Group_2__3__Impl2379); 
             after(grammarAccess.getConstructorSectionAccess().getSemicolonKeyword_2_3()); 

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
    // $ANTLR end "rule__ConstructorSection__Group_2__3__Impl"


    // $ANTLR start "rule__ConstructorSection__Group_3__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1208:1: rule__ConstructorSection__Group_3__0 : rule__ConstructorSection__Group_3__0__Impl rule__ConstructorSection__Group_3__1 ;
    public final void rule__ConstructorSection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1212:1: ( rule__ConstructorSection__Group_3__0__Impl rule__ConstructorSection__Group_3__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1213:2: rule__ConstructorSection__Group_3__0__Impl rule__ConstructorSection__Group_3__1
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group_3__0__Impl_in_rule__ConstructorSection__Group_3__02418);
            rule__ConstructorSection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructorSection__Group_3__1_in_rule__ConstructorSection__Group_3__02421);
            rule__ConstructorSection__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group_3__0"


    // $ANTLR start "rule__ConstructorSection__Group_3__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1220:1: rule__ConstructorSection__Group_3__0__Impl : ( ( rule__ConstructorSection__DefaultConstructorAssignment_3_0 ) ) ;
    public final void rule__ConstructorSection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1224:1: ( ( ( rule__ConstructorSection__DefaultConstructorAssignment_3_0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1225:1: ( ( rule__ConstructorSection__DefaultConstructorAssignment_3_0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1225:1: ( ( rule__ConstructorSection__DefaultConstructorAssignment_3_0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1226:1: ( rule__ConstructorSection__DefaultConstructorAssignment_3_0 )
            {
             before(grammarAccess.getConstructorSectionAccess().getDefaultConstructorAssignment_3_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1227:1: ( rule__ConstructorSection__DefaultConstructorAssignment_3_0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1227:2: rule__ConstructorSection__DefaultConstructorAssignment_3_0
            {
            pushFollow(FOLLOW_rule__ConstructorSection__DefaultConstructorAssignment_3_0_in_rule__ConstructorSection__Group_3__0__Impl2448);
            rule__ConstructorSection__DefaultConstructorAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorSectionAccess().getDefaultConstructorAssignment_3_0()); 

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
    // $ANTLR end "rule__ConstructorSection__Group_3__0__Impl"


    // $ANTLR start "rule__ConstructorSection__Group_3__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1237:1: rule__ConstructorSection__Group_3__1 : rule__ConstructorSection__Group_3__1__Impl rule__ConstructorSection__Group_3__2 ;
    public final void rule__ConstructorSection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1241:1: ( rule__ConstructorSection__Group_3__1__Impl rule__ConstructorSection__Group_3__2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1242:2: rule__ConstructorSection__Group_3__1__Impl rule__ConstructorSection__Group_3__2
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group_3__1__Impl_in_rule__ConstructorSection__Group_3__12478);
            rule__ConstructorSection__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructorSection__Group_3__2_in_rule__ConstructorSection__Group_3__12481);
            rule__ConstructorSection__Group_3__2();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group_3__1"


    // $ANTLR start "rule__ConstructorSection__Group_3__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1249:1: rule__ConstructorSection__Group_3__1__Impl : ( '(' ) ;
    public final void rule__ConstructorSection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1253:1: ( ( '(' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1254:1: ( '(' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1254:1: ( '(' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1255:1: '('
            {
             before(grammarAccess.getConstructorSectionAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,22,FOLLOW_22_in_rule__ConstructorSection__Group_3__1__Impl2509); 
             after(grammarAccess.getConstructorSectionAccess().getLeftParenthesisKeyword_3_1()); 

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
    // $ANTLR end "rule__ConstructorSection__Group_3__1__Impl"


    // $ANTLR start "rule__ConstructorSection__Group_3__2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1268:1: rule__ConstructorSection__Group_3__2 : rule__ConstructorSection__Group_3__2__Impl rule__ConstructorSection__Group_3__3 ;
    public final void rule__ConstructorSection__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1272:1: ( rule__ConstructorSection__Group_3__2__Impl rule__ConstructorSection__Group_3__3 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1273:2: rule__ConstructorSection__Group_3__2__Impl rule__ConstructorSection__Group_3__3
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group_3__2__Impl_in_rule__ConstructorSection__Group_3__22540);
            rule__ConstructorSection__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstructorSection__Group_3__3_in_rule__ConstructorSection__Group_3__22543);
            rule__ConstructorSection__Group_3__3();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group_3__2"


    // $ANTLR start "rule__ConstructorSection__Group_3__2__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1280:1: rule__ConstructorSection__Group_3__2__Impl : ( ')' ) ;
    public final void rule__ConstructorSection__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1284:1: ( ( ')' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1285:1: ( ')' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1285:1: ( ')' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1286:1: ')'
            {
             before(grammarAccess.getConstructorSectionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,23,FOLLOW_23_in_rule__ConstructorSection__Group_3__2__Impl2571); 
             after(grammarAccess.getConstructorSectionAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__ConstructorSection__Group_3__2__Impl"


    // $ANTLR start "rule__ConstructorSection__Group_3__3"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1299:1: rule__ConstructorSection__Group_3__3 : rule__ConstructorSection__Group_3__3__Impl ;
    public final void rule__ConstructorSection__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1303:1: ( rule__ConstructorSection__Group_3__3__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1304:2: rule__ConstructorSection__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__ConstructorSection__Group_3__3__Impl_in_rule__ConstructorSection__Group_3__32602);
            rule__ConstructorSection__Group_3__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ConstructorSection__Group_3__3"


    // $ANTLR start "rule__ConstructorSection__Group_3__3__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1310:1: rule__ConstructorSection__Group_3__3__Impl : ( ';' ) ;
    public final void rule__ConstructorSection__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1314:1: ( ( ';' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1315:1: ( ';' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1315:1: ( ';' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1316:1: ';'
            {
             before(grammarAccess.getConstructorSectionAccess().getSemicolonKeyword_3_3()); 
            match(input,18,FOLLOW_18_in_rule__ConstructorSection__Group_3__3__Impl2630); 
             after(grammarAccess.getConstructorSectionAccess().getSemicolonKeyword_3_3()); 

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
    // $ANTLR end "rule__ConstructorSection__Group_3__3__Impl"


    // $ANTLR start "rule__Constructor__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1337:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1341:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1342:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0__Impl_in_rule__Constructor__Group__02669);
            rule__Constructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02672);
            rule__Constructor__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Constructor__Group__0"


    // $ANTLR start "rule__Constructor__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1349:1: rule__Constructor__Group__0__Impl : ( () ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1353:1: ( ( () ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1354:1: ( () )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1354:1: ( () )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1355:1: ()
            {
             before(grammarAccess.getConstructorAccess().getConstructorAction_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1356:1: ()
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1358:1: 
            {
            }

             after(grammarAccess.getConstructorAccess().getConstructorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0__Impl"


    // $ANTLR start "rule__Constructor__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1368:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1372:1: ( rule__Constructor__Group__1__Impl rule__Constructor__Group__2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1373:2: rule__Constructor__Group__1__Impl rule__Constructor__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor__Group__1__Impl_in_rule__Constructor__Group__12730);
            rule__Constructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12733);
            rule__Constructor__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Constructor__Group__1"


    // $ANTLR start "rule__Constructor__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1380:1: rule__Constructor__Group__1__Impl : ( ( rule__Constructor__NameAssignment_1 )? ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1384:1: ( ( ( rule__Constructor__NameAssignment_1 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1385:1: ( ( rule__Constructor__NameAssignment_1 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1385:1: ( ( rule__Constructor__NameAssignment_1 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1386:1: ( rule__Constructor__NameAssignment_1 )?
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1387:1: ( rule__Constructor__NameAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1387:2: rule__Constructor__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Constructor__NameAssignment_1_in_rule__Constructor__Group__1__Impl2760);
                    rule__Constructor__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Constructor__Group__1__Impl"


    // $ANTLR start "rule__Constructor__Group__2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1397:1: rule__Constructor__Group__2 : rule__Constructor__Group__2__Impl rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1401:1: ( rule__Constructor__Group__2__Impl rule__Constructor__Group__3 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1402:2: rule__Constructor__Group__2__Impl rule__Constructor__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor__Group__2__Impl_in_rule__Constructor__Group__22791);
            rule__Constructor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22794);
            rule__Constructor__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Constructor__Group__2"


    // $ANTLR start "rule__Constructor__Group__2__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1409:1: rule__Constructor__Group__2__Impl : ( '(' ) ;
    public final void rule__Constructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1413:1: ( ( '(' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1414:1: ( '(' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1414:1: ( '(' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1415:1: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Constructor__Group__2__Impl2822); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Constructor__Group__2__Impl"


    // $ANTLR start "rule__Constructor__Group__3"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1428:1: rule__Constructor__Group__3 : rule__Constructor__Group__3__Impl rule__Constructor__Group__4 ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1432:1: ( rule__Constructor__Group__3__Impl rule__Constructor__Group__4 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1433:2: rule__Constructor__Group__3__Impl rule__Constructor__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor__Group__3__Impl_in_rule__Constructor__Group__32853);
            rule__Constructor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__4_in_rule__Constructor__Group__32856);
            rule__Constructor__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Constructor__Group__3"


    // $ANTLR start "rule__Constructor__Group__3__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1440:1: rule__Constructor__Group__3__Impl : ( ( rule__Constructor__ParametersAssignment_3 ) ) ;
    public final void rule__Constructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1444:1: ( ( ( rule__Constructor__ParametersAssignment_3 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1445:1: ( ( rule__Constructor__ParametersAssignment_3 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1445:1: ( ( rule__Constructor__ParametersAssignment_3 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1446:1: ( rule__Constructor__ParametersAssignment_3 )
            {
             before(grammarAccess.getConstructorAccess().getParametersAssignment_3()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1447:1: ( rule__Constructor__ParametersAssignment_3 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1447:2: rule__Constructor__ParametersAssignment_3
            {
            pushFollow(FOLLOW_rule__Constructor__ParametersAssignment_3_in_rule__Constructor__Group__3__Impl2883);
            rule__Constructor__ParametersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getParametersAssignment_3()); 

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
    // $ANTLR end "rule__Constructor__Group__3__Impl"


    // $ANTLR start "rule__Constructor__Group__4"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1457:1: rule__Constructor__Group__4 : rule__Constructor__Group__4__Impl rule__Constructor__Group__5 ;
    public final void rule__Constructor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1461:1: ( rule__Constructor__Group__4__Impl rule__Constructor__Group__5 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1462:2: rule__Constructor__Group__4__Impl rule__Constructor__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor__Group__4__Impl_in_rule__Constructor__Group__42913);
            rule__Constructor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__5_in_rule__Constructor__Group__42916);
            rule__Constructor__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Constructor__Group__4"


    // $ANTLR start "rule__Constructor__Group__4__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1469:1: rule__Constructor__Group__4__Impl : ( ( rule__Constructor__Group_4__0 )* ) ;
    public final void rule__Constructor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1473:1: ( ( ( rule__Constructor__Group_4__0 )* ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1474:1: ( ( rule__Constructor__Group_4__0 )* )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1474:1: ( ( rule__Constructor__Group_4__0 )* )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1475:1: ( rule__Constructor__Group_4__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_4()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1476:1: ( rule__Constructor__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1476:2: rule__Constructor__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__Group_4__0_in_rule__Constructor__Group__4__Impl2943);
            	    rule__Constructor__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Constructor__Group__4__Impl"


    // $ANTLR start "rule__Constructor__Group__5"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1486:1: rule__Constructor__Group__5 : rule__Constructor__Group__5__Impl rule__Constructor__Group__6 ;
    public final void rule__Constructor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1490:1: ( rule__Constructor__Group__5__Impl rule__Constructor__Group__6 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1491:2: rule__Constructor__Group__5__Impl rule__Constructor__Group__6
            {
            pushFollow(FOLLOW_rule__Constructor__Group__5__Impl_in_rule__Constructor__Group__52974);
            rule__Constructor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__6_in_rule__Constructor__Group__52977);
            rule__Constructor__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Constructor__Group__5"


    // $ANTLR start "rule__Constructor__Group__5__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1498:1: rule__Constructor__Group__5__Impl : ( ')' ) ;
    public final void rule__Constructor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1502:1: ( ( ')' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1503:1: ( ')' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1503:1: ( ')' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1504:1: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Constructor__Group__5__Impl3005); 
             after(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Constructor__Group__5__Impl"


    // $ANTLR start "rule__Constructor__Group__6"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1517:1: rule__Constructor__Group__6 : rule__Constructor__Group__6__Impl rule__Constructor__Group__7 ;
    public final void rule__Constructor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1521:1: ( rule__Constructor__Group__6__Impl rule__Constructor__Group__7 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1522:2: rule__Constructor__Group__6__Impl rule__Constructor__Group__7
            {
            pushFollow(FOLLOW_rule__Constructor__Group__6__Impl_in_rule__Constructor__Group__63036);
            rule__Constructor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__7_in_rule__Constructor__Group__63039);
            rule__Constructor__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Constructor__Group__6"


    // $ANTLR start "rule__Constructor__Group__6__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1529:1: rule__Constructor__Group__6__Impl : ( ( rule__Constructor__JsonAssignment_6 )? ) ;
    public final void rule__Constructor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1533:1: ( ( ( rule__Constructor__JsonAssignment_6 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1534:1: ( ( rule__Constructor__JsonAssignment_6 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1534:1: ( ( rule__Constructor__JsonAssignment_6 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1535:1: ( rule__Constructor__JsonAssignment_6 )?
            {
             before(grammarAccess.getConstructorAccess().getJsonAssignment_6()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1536:1: ( rule__Constructor__JsonAssignment_6 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1536:2: rule__Constructor__JsonAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Constructor__JsonAssignment_6_in_rule__Constructor__Group__6__Impl3066);
                    rule__Constructor__JsonAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getJsonAssignment_6()); 

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
    // $ANTLR end "rule__Constructor__Group__6__Impl"


    // $ANTLR start "rule__Constructor__Group__7"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1546:1: rule__Constructor__Group__7 : rule__Constructor__Group__7__Impl ;
    public final void rule__Constructor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1550:1: ( rule__Constructor__Group__7__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1551:2: rule__Constructor__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group__7__Impl_in_rule__Constructor__Group__73097);
            rule__Constructor__Group__7__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Constructor__Group__7"


    // $ANTLR start "rule__Constructor__Group__7__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1557:1: rule__Constructor__Group__7__Impl : ( ';' ) ;
    public final void rule__Constructor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1561:1: ( ( ';' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1562:1: ( ';' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1562:1: ( ';' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1563:1: ';'
            {
             before(grammarAccess.getConstructorAccess().getSemicolonKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__Constructor__Group__7__Impl3125); 
             after(grammarAccess.getConstructorAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__Constructor__Group__7__Impl"


    // $ANTLR start "rule__Constructor__Group_4__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1592:1: rule__Constructor__Group_4__0 : rule__Constructor__Group_4__0__Impl rule__Constructor__Group_4__1 ;
    public final void rule__Constructor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1596:1: ( rule__Constructor__Group_4__0__Impl rule__Constructor__Group_4__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1597:2: rule__Constructor__Group_4__0__Impl rule__Constructor__Group_4__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group_4__0__Impl_in_rule__Constructor__Group_4__03172);
            rule__Constructor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group_4__1_in_rule__Constructor__Group_4__03175);
            rule__Constructor__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__Constructor__Group_4__0"


    // $ANTLR start "rule__Constructor__Group_4__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1604:1: rule__Constructor__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Constructor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1608:1: ( ( ',' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1609:1: ( ',' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1609:1: ( ',' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1610:1: ','
            {
             before(grammarAccess.getConstructorAccess().getCommaKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__Constructor__Group_4__0__Impl3203); 
             after(grammarAccess.getConstructorAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Constructor__Group_4__0__Impl"


    // $ANTLR start "rule__Constructor__Group_4__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1623:1: rule__Constructor__Group_4__1 : rule__Constructor__Group_4__1__Impl ;
    public final void rule__Constructor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1627:1: ( rule__Constructor__Group_4__1__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1628:2: rule__Constructor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group_4__1__Impl_in_rule__Constructor__Group_4__13234);
            rule__Constructor__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Constructor__Group_4__1"


    // $ANTLR start "rule__Constructor__Group_4__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1634:1: rule__Constructor__Group_4__1__Impl : ( ( rule__Constructor__ParametersAssignment_4_1 ) ) ;
    public final void rule__Constructor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1638:1: ( ( ( rule__Constructor__ParametersAssignment_4_1 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1639:1: ( ( rule__Constructor__ParametersAssignment_4_1 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1639:1: ( ( rule__Constructor__ParametersAssignment_4_1 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1640:1: ( rule__Constructor__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getConstructorAccess().getParametersAssignment_4_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1641:1: ( rule__Constructor__ParametersAssignment_4_1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1641:2: rule__Constructor__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Constructor__ParametersAssignment_4_1_in_rule__Constructor__Group_4__1__Impl3261);
            rule__Constructor__ParametersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getParametersAssignment_4_1()); 

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
    // $ANTLR end "rule__Constructor__Group_4__1__Impl"


    // $ANTLR start "rule__PropertySection__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1655:1: rule__PropertySection__Group__0 : rule__PropertySection__Group__0__Impl rule__PropertySection__Group__1 ;
    public final void rule__PropertySection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1659:1: ( rule__PropertySection__Group__0__Impl rule__PropertySection__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1660:2: rule__PropertySection__Group__0__Impl rule__PropertySection__Group__1
            {
            pushFollow(FOLLOW_rule__PropertySection__Group__0__Impl_in_rule__PropertySection__Group__03295);
            rule__PropertySection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertySection__Group__1_in_rule__PropertySection__Group__03298);
            rule__PropertySection__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__PropertySection__Group__0"


    // $ANTLR start "rule__PropertySection__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1667:1: rule__PropertySection__Group__0__Impl : ( 'properties:' ) ;
    public final void rule__PropertySection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1671:1: ( ( 'properties:' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1672:1: ( 'properties:' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1672:1: ( 'properties:' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1673:1: 'properties:'
            {
             before(grammarAccess.getPropertySectionAccess().getPropertiesKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__PropertySection__Group__0__Impl3326); 
             after(grammarAccess.getPropertySectionAccess().getPropertiesKeyword_0()); 

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
    // $ANTLR end "rule__PropertySection__Group__0__Impl"


    // $ANTLR start "rule__PropertySection__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1686:1: rule__PropertySection__Group__1 : rule__PropertySection__Group__1__Impl rule__PropertySection__Group__2 ;
    public final void rule__PropertySection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1690:1: ( rule__PropertySection__Group__1__Impl rule__PropertySection__Group__2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1691:2: rule__PropertySection__Group__1__Impl rule__PropertySection__Group__2
            {
            pushFollow(FOLLOW_rule__PropertySection__Group__1__Impl_in_rule__PropertySection__Group__13357);
            rule__PropertySection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertySection__Group__2_in_rule__PropertySection__Group__13360);
            rule__PropertySection__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__PropertySection__Group__1"


    // $ANTLR start "rule__PropertySection__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1698:1: rule__PropertySection__Group__1__Impl : ( () ) ;
    public final void rule__PropertySection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1702:1: ( ( () ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1703:1: ( () )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1703:1: ( () )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1704:1: ()
            {
             before(grammarAccess.getPropertySectionAccess().getPropertySectionAction_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1705:1: ()
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1707:1: 
            {
            }

             after(grammarAccess.getPropertySectionAccess().getPropertySectionAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySection__Group__1__Impl"


    // $ANTLR start "rule__PropertySection__Group__2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1717:1: rule__PropertySection__Group__2 : rule__PropertySection__Group__2__Impl ;
    public final void rule__PropertySection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1721:1: ( rule__PropertySection__Group__2__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1722:2: rule__PropertySection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertySection__Group__2__Impl_in_rule__PropertySection__Group__23418);
            rule__PropertySection__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PropertySection__Group__2"


    // $ANTLR start "rule__PropertySection__Group__2__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1728:1: rule__PropertySection__Group__2__Impl : ( ( rule__PropertySection__PropertiesAssignment_2 )* ) ;
    public final void rule__PropertySection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1732:1: ( ( ( rule__PropertySection__PropertiesAssignment_2 )* ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1733:1: ( ( rule__PropertySection__PropertiesAssignment_2 )* )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1733:1: ( ( rule__PropertySection__PropertiesAssignment_2 )* )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1734:1: ( rule__PropertySection__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getPropertySectionAccess().getPropertiesAssignment_2()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1735:1: ( rule__PropertySection__PropertiesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=11 && LA15_0<=14)||LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1735:2: rule__PropertySection__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__PropertySection__PropertiesAssignment_2_in_rule__PropertySection__Group__2__Impl3445);
            	    rule__PropertySection__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPropertySectionAccess().getPropertiesAssignment_2()); 

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
    // $ANTLR end "rule__PropertySection__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1751:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1755:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1756:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03482);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03485);
            rule__Property__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1763:1: rule__Property__Group__0__Impl : ( ( rule__Property__ReadOnlyAssignment_0 )? ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1767:1: ( ( ( rule__Property__ReadOnlyAssignment_0 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1768:1: ( ( rule__Property__ReadOnlyAssignment_0 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1768:1: ( ( rule__Property__ReadOnlyAssignment_0 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1769:1: ( rule__Property__ReadOnlyAssignment_0 )?
            {
             before(grammarAccess.getPropertyAccess().getReadOnlyAssignment_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1770:1: ( rule__Property__ReadOnlyAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1770:2: rule__Property__ReadOnlyAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Property__ReadOnlyAssignment_0_in_rule__Property__Group__0__Impl3512);
                    rule__Property__ReadOnlyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getReadOnlyAssignment_0()); 

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
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1780:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1784:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1785:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13543);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13546);
            rule__Property__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1792:1: rule__Property__Group__1__Impl : ( ( rule__Property__TypeAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1796:1: ( ( ( rule__Property__TypeAssignment_1 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1797:1: ( ( rule__Property__TypeAssignment_1 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1797:1: ( ( rule__Property__TypeAssignment_1 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1798:1: ( rule__Property__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1799:1: ( rule__Property__TypeAssignment_1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1799:2: rule__Property__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__1__Impl3573);
            rule__Property__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1809:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1813:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1814:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23603);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__23606);
            rule__Property__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1821:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1825:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1826:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1826:1: ( ( rule__Property__NameAssignment_2 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1827:1: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1828:1: ( rule__Property__NameAssignment_2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1828:2: rule__Property__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl3633);
            rule__Property__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1838:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1842:1: ( rule__Property__Group__3__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1843:2: rule__Property__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__33663);
            rule__Property__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1849:1: rule__Property__Group__3__Impl : ( ';' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1853:1: ( ( ';' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1854:1: ( ';' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1854:1: ( ';' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1855:1: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Property__Group__3__Impl3691); 
             after(grammarAccess.getPropertyAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__MethodSection__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1876:1: rule__MethodSection__Group__0 : rule__MethodSection__Group__0__Impl rule__MethodSection__Group__1 ;
    public final void rule__MethodSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1880:1: ( rule__MethodSection__Group__0__Impl rule__MethodSection__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1881:2: rule__MethodSection__Group__0__Impl rule__MethodSection__Group__1
            {
            pushFollow(FOLLOW_rule__MethodSection__Group__0__Impl_in_rule__MethodSection__Group__03730);
            rule__MethodSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodSection__Group__1_in_rule__MethodSection__Group__03733);
            rule__MethodSection__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__MethodSection__Group__0"


    // $ANTLR start "rule__MethodSection__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1888:1: rule__MethodSection__Group__0__Impl : ( 'methods:' ) ;
    public final void rule__MethodSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1892:1: ( ( 'methods:' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1893:1: ( 'methods:' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1893:1: ( 'methods:' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1894:1: 'methods:'
            {
             before(grammarAccess.getMethodSectionAccess().getMethodsKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__MethodSection__Group__0__Impl3761); 
             after(grammarAccess.getMethodSectionAccess().getMethodsKeyword_0()); 

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
    // $ANTLR end "rule__MethodSection__Group__0__Impl"


    // $ANTLR start "rule__MethodSection__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1907:1: rule__MethodSection__Group__1 : rule__MethodSection__Group__1__Impl rule__MethodSection__Group__2 ;
    public final void rule__MethodSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1911:1: ( rule__MethodSection__Group__1__Impl rule__MethodSection__Group__2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1912:2: rule__MethodSection__Group__1__Impl rule__MethodSection__Group__2
            {
            pushFollow(FOLLOW_rule__MethodSection__Group__1__Impl_in_rule__MethodSection__Group__13792);
            rule__MethodSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodSection__Group__2_in_rule__MethodSection__Group__13795);
            rule__MethodSection__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__MethodSection__Group__1"


    // $ANTLR start "rule__MethodSection__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1919:1: rule__MethodSection__Group__1__Impl : ( () ) ;
    public final void rule__MethodSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1923:1: ( ( () ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1924:1: ( () )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1924:1: ( () )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1925:1: ()
            {
             before(grammarAccess.getMethodSectionAccess().getMethodSectionAction_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1926:1: ()
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1928:1: 
            {
            }

             after(grammarAccess.getMethodSectionAccess().getMethodSectionAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodSection__Group__1__Impl"


    // $ANTLR start "rule__MethodSection__Group__2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1938:1: rule__MethodSection__Group__2 : rule__MethodSection__Group__2__Impl ;
    public final void rule__MethodSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1942:1: ( rule__MethodSection__Group__2__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1943:2: rule__MethodSection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MethodSection__Group__2__Impl_in_rule__MethodSection__Group__23853);
            rule__MethodSection__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__MethodSection__Group__2"


    // $ANTLR start "rule__MethodSection__Group__2__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1949:1: rule__MethodSection__Group__2__Impl : ( ( rule__MethodSection__MethodsAssignment_2 )* ) ;
    public final void rule__MethodSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1953:1: ( ( ( rule__MethodSection__MethodsAssignment_2 )* ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1954:1: ( ( rule__MethodSection__MethodsAssignment_2 )* )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1954:1: ( ( rule__MethodSection__MethodsAssignment_2 )* )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1955:1: ( rule__MethodSection__MethodsAssignment_2 )*
            {
             before(grammarAccess.getMethodSectionAccess().getMethodsAssignment_2()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1956:1: ( rule__MethodSection__MethodsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=11 && LA17_0<=14)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1956:2: rule__MethodSection__MethodsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MethodSection__MethodsAssignment_2_in_rule__MethodSection__Group__2__Impl3880);
            	    rule__MethodSection__MethodsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMethodSectionAccess().getMethodsAssignment_2()); 

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
    // $ANTLR end "rule__MethodSection__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1972:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1976:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1977:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03917);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03920);
            rule__Method__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1984:1: rule__Method__Group__0__Impl : ( ( rule__Method__ReturnTypeAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1988:1: ( ( ( rule__Method__ReturnTypeAssignment_0 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1989:1: ( ( rule__Method__ReturnTypeAssignment_0 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1989:1: ( ( rule__Method__ReturnTypeAssignment_0 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1990:1: ( rule__Method__ReturnTypeAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1991:1: ( rule__Method__ReturnTypeAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=11 && LA18_0<=14)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==RULE_ID||LA18_2==27) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:1991:2: rule__Method__ReturnTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Method__ReturnTypeAssignment_0_in_rule__Method__Group__0__Impl3947);
                    rule__Method__ReturnTypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 

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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2001:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2005:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2006:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13978);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__13981);
            rule__Method__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2013:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2017:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2018:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2018:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2019:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2020:1: ( rule__Method__NameAssignment_1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2020:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl4008);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2030:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2034:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2035:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__24038);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__24041);
            rule__Method__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2042:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2046:1: ( ( '(' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2047:1: ( '(' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2047:1: ( '(' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2048:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Method__Group__2__Impl4069); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2061:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2065:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2066:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__34100);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__34103);
            rule__Method__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2073:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2077:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2078:1: ( ( rule__Method__Group_3__0 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2078:1: ( ( rule__Method__Group_3__0 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2079:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2080:1: ( rule__Method__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||(LA19_0>=11 && LA19_0<=14)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2080:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl4130);
                    rule__Method__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2090:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2094:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2095:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__44161);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__44164);
            rule__Method__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2102:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2106:1: ( ( ')' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2107:1: ( ')' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2107:1: ( ')' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2108:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Method__Group__4__Impl4192); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2121:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2125:1: ( rule__Method__Group__5__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2126:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__54223);
            rule__Method__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2132:1: rule__Method__Group__5__Impl : ( ';' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2136:1: ( ( ';' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2137:1: ( ';' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2137:1: ( ';' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2138:1: ';'
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Method__Group__5__Impl4251); 
             after(grammarAccess.getMethodAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2163:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2167:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2168:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__04294);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__04297);
            rule__Method__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2175:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ParametersAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2179:1: ( ( ( rule__Method__ParametersAssignment_3_0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2180:1: ( ( rule__Method__ParametersAssignment_3_0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2180:1: ( ( rule__Method__ParametersAssignment_3_0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2181:1: ( rule__Method__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2182:1: ( rule__Method__ParametersAssignment_3_0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2182:2: rule__Method__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_0_in_rule__Method__Group_3__0__Impl4324);
            rule__Method__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_3_0()); 

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
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2192:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2196:1: ( rule__Method__Group_3__1__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2197:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__14354);
            rule__Method__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2203:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2207:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2208:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2208:1: ( ( rule__Method__Group_3_1__0 )* )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2209:1: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2210:1: ( rule__Method__Group_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2210:2: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__1__Impl4381);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group_3_1__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2224:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2228:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2229:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3_1__0__Impl_in_rule__Method__Group_3_1__04416);
            rule__Method__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__04419);
            rule__Method__Group_3_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Method__Group_3_1__0"


    // $ANTLR start "rule__Method__Group_3_1__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2236:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2240:1: ( ( ',' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2241:1: ( ',' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2241:1: ( ',' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2242:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Method__Group_3_1__0__Impl4447); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Method__Group_3_1__0__Impl"


    // $ANTLR start "rule__Method__Group_3_1__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2255:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2259:1: ( rule__Method__Group_3_1__1__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2260:2: rule__Method__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3_1__1__Impl_in_rule__Method__Group_3_1__14478);
            rule__Method__Group_3_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Method__Group_3_1__1"


    // $ANTLR start "rule__Method__Group_3_1__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2266:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2270:1: ( ( ( rule__Method__ParametersAssignment_3_1_1 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2271:1: ( ( rule__Method__ParametersAssignment_3_1_1 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2271:1: ( ( rule__Method__ParametersAssignment_3_1_1 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2272:1: ( rule__Method__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2273:1: ( rule__Method__ParametersAssignment_3_1_1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2273:2: rule__Method__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_1_1_in_rule__Method__Group_3_1__1__Impl4505);
            rule__Method__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Method__Group_3_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2287:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2291:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2292:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04539);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04542);
            rule__Parameter__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2299:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2303:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2304:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2304:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2305:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2306:1: ( rule__Parameter__TypeAssignment_0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2306:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl4569);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2316:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2320:1: ( rule__Parameter__Group__1__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2321:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14599);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2327:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2331:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2332:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2332:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2333:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2334:1: ( rule__Parameter__NameAssignment_1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2334:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4626);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2348:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2352:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2353:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04660);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04663);
            rule__Type__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2360:1: rule__Type__Group__0__Impl : ( ( rule__Type__Alternatives_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2364:1: ( ( ( rule__Type__Alternatives_0 ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2365:1: ( ( rule__Type__Alternatives_0 ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2365:1: ( ( rule__Type__Alternatives_0 ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2366:1: ( rule__Type__Alternatives_0 )
            {
             before(grammarAccess.getTypeAccess().getAlternatives_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2367:1: ( rule__Type__Alternatives_0 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2367:2: rule__Type__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_0_in_rule__Type__Group__0__Impl4690);
            rule__Type__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2377:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2381:1: ( rule__Type__Group__1__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2382:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14720);
            rule__Type__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2388:1: rule__Type__Group__1__Impl : ( ( rule__Type__ArrayTypeAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2392:1: ( ( ( rule__Type__ArrayTypeAssignment_1 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2393:1: ( ( rule__Type__ArrayTypeAssignment_1 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2393:1: ( ( rule__Type__ArrayTypeAssignment_1 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2394:1: ( rule__Type__ArrayTypeAssignment_1 )?
            {
             before(grammarAccess.getTypeAccess().getArrayTypeAssignment_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2395:1: ( rule__Type__ArrayTypeAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2395:2: rule__Type__ArrayTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__ArrayTypeAssignment_1_in_rule__Type__Group__1__Impl4747);
                    rule__Type__ArrayTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getArrayTypeAssignment_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2409:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2413:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2414:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__04782);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__04785);
            rule__ArrayType__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2421:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2425:1: ( ( () ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2426:1: ( () )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2426:1: ( () )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2427:1: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2428:1: ()
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2430:1: 
            {
            }

             after(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2440:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2444:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2445:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__14843);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__14846);
            rule__ArrayType__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2452:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2456:1: ( ( '[' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2457:1: ( '[' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2457:1: ( '[' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2458:1: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__ArrayType__Group__1__Impl4874); 
             after(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2471:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2475:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2476:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__24905);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__24908);
            rule__ArrayType__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ArrayType__Group__2"


    // $ANTLR start "rule__ArrayType__Group__2__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2483:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__DimensionsAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2487:1: ( ( ( rule__ArrayType__DimensionsAssignment_2 )? ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2488:1: ( ( rule__ArrayType__DimensionsAssignment_2 )? )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2488:1: ( ( rule__ArrayType__DimensionsAssignment_2 )? )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2489:1: ( rule__ArrayType__DimensionsAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getDimensionsAssignment_2()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2490:1: ( rule__ArrayType__DimensionsAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2490:2: rule__ArrayType__DimensionsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ArrayType__DimensionsAssignment_2_in_rule__ArrayType__Group__2__Impl4935);
                    rule__ArrayType__DimensionsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayTypeAccess().getDimensionsAssignment_2()); 

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
    // $ANTLR end "rule__ArrayType__Group__2__Impl"


    // $ANTLR start "rule__ArrayType__Group__3"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2500:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2504:1: ( rule__ArrayType__Group__3__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2505:2: rule__ArrayType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__34966);
            rule__ArrayType__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ArrayType__Group__3"


    // $ANTLR start "rule__ArrayType__Group__3__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2511:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2515:1: ( ( ']' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2516:1: ( ']' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2516:1: ( ']' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2517:1: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__ArrayType__Group__3__Impl4994); 
             after(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__ArrayType__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2538:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2542:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2543:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05033);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05036);
            rule__QualifiedName__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2550:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2554:1: ( ( RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2555:1: ( RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2555:1: ( RULE_ID )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2556:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5063); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2567:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2571:1: ( rule__QualifiedName__Group__1__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2572:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15092);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2578:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2582:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2583:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2583:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2584:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2585:1: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2585:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5119);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2599:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2603:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2604:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05154);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05157);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2611:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2615:1: ( ( '.' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2616:1: ( '.' )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2616:1: ( '.' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2617:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl5185); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2630:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2634:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2635:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15216);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2641:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2645:1: ( ( RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2646:1: ( RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2646:1: ( RULE_ID )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2647:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5243); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__WrappersAssignment"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2663:1: rule__Model__WrappersAssignment : ( ruleObjectWrapper ) ;
    public final void rule__Model__WrappersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2667:1: ( ( ruleObjectWrapper ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2668:1: ( ruleObjectWrapper )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2668:1: ( ruleObjectWrapper )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2669:1: ruleObjectWrapper
            {
             before(grammarAccess.getModelAccess().getWrappersObjectWrapperParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleObjectWrapper_in_rule__Model__WrappersAssignment5281);
            ruleObjectWrapper();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWrappersObjectWrapperParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__WrappersAssignment"


    // $ANTLR start "rule__ObjectWrapper__AbstractAssignment_0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2678:1: rule__ObjectWrapper__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ObjectWrapper__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2682:1: ( ( ( 'abstract' ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2683:1: ( ( 'abstract' ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2683:1: ( ( 'abstract' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2684:1: ( 'abstract' )
            {
             before(grammarAccess.getObjectWrapperAccess().getAbstractAbstractKeyword_0_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2685:1: ( 'abstract' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2686:1: 'abstract'
            {
             before(grammarAccess.getObjectWrapperAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__ObjectWrapper__AbstractAssignment_05317); 
             after(grammarAccess.getObjectWrapperAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getObjectWrapperAccess().getAbstractAbstractKeyword_0_0()); 

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
    // $ANTLR end "rule__ObjectWrapper__AbstractAssignment_0"


    // $ANTLR start "rule__ObjectWrapper__NameAssignment_2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2701:1: rule__ObjectWrapper__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ObjectWrapper__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2705:1: ( ( RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2706:1: ( RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2706:1: ( RULE_ID )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2707:1: RULE_ID
            {
             before(grammarAccess.getObjectWrapperAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectWrapper__NameAssignment_25356); 
             after(grammarAccess.getObjectWrapperAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ObjectWrapper__NameAssignment_2"


    // $ANTLR start "rule__ObjectWrapper__SupertypeAssignment_3_1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2716:1: rule__ObjectWrapper__SupertypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectWrapper__SupertypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2720:1: ( ( ( RULE_ID ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2721:1: ( ( RULE_ID ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2721:1: ( ( RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2722:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectWrapperAccess().getSupertypeObjectWrapperCrossReference_3_1_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2723:1: ( RULE_ID )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2724:1: RULE_ID
            {
             before(grammarAccess.getObjectWrapperAccess().getSupertypeObjectWrapperIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectWrapper__SupertypeAssignment_3_15391); 
             after(grammarAccess.getObjectWrapperAccess().getSupertypeObjectWrapperIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getObjectWrapperAccess().getSupertypeObjectWrapperCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__ObjectWrapper__SupertypeAssignment_3_1"


    // $ANTLR start "rule__ObjectWrapper__PckAssignment_6"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2735:1: rule__ObjectWrapper__PckAssignment_6 : ( ruleQualifiedName ) ;
    public final void rule__ObjectWrapper__PckAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2739:1: ( ( ruleQualifiedName ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2740:1: ( ruleQualifiedName )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2740:1: ( ruleQualifiedName )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2741:1: ruleQualifiedName
            {
             before(grammarAccess.getObjectWrapperAccess().getPckQualifiedNameParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ObjectWrapper__PckAssignment_65426);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getObjectWrapperAccess().getPckQualifiedNameParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ObjectWrapper__PckAssignment_6"


    // $ANTLR start "rule__ObjectWrapper__ConstructorSectionAssignment_8"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2750:1: rule__ObjectWrapper__ConstructorSectionAssignment_8 : ( ruleConstructorSection ) ;
    public final void rule__ObjectWrapper__ConstructorSectionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2754:1: ( ( ruleConstructorSection ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2755:1: ( ruleConstructorSection )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2755:1: ( ruleConstructorSection )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2756:1: ruleConstructorSection
            {
             before(grammarAccess.getObjectWrapperAccess().getConstructorSectionConstructorSectionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleConstructorSection_in_rule__ObjectWrapper__ConstructorSectionAssignment_85457);
            ruleConstructorSection();

            state._fsp--;

             after(grammarAccess.getObjectWrapperAccess().getConstructorSectionConstructorSectionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ObjectWrapper__ConstructorSectionAssignment_8"


    // $ANTLR start "rule__ObjectWrapper__PropertySectionAssignment_9"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2765:1: rule__ObjectWrapper__PropertySectionAssignment_9 : ( rulePropertySection ) ;
    public final void rule__ObjectWrapper__PropertySectionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2769:1: ( ( rulePropertySection ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2770:1: ( rulePropertySection )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2770:1: ( rulePropertySection )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2771:1: rulePropertySection
            {
             before(grammarAccess.getObjectWrapperAccess().getPropertySectionPropertySectionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_rulePropertySection_in_rule__ObjectWrapper__PropertySectionAssignment_95488);
            rulePropertySection();

            state._fsp--;

             after(grammarAccess.getObjectWrapperAccess().getPropertySectionPropertySectionParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__ObjectWrapper__PropertySectionAssignment_9"


    // $ANTLR start "rule__ObjectWrapper__MethodSectionAssignment_10"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2780:1: rule__ObjectWrapper__MethodSectionAssignment_10 : ( ruleMethodSection ) ;
    public final void rule__ObjectWrapper__MethodSectionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2784:1: ( ( ruleMethodSection ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2785:1: ( ruleMethodSection )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2785:1: ( ruleMethodSection )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2786:1: ruleMethodSection
            {
             before(grammarAccess.getObjectWrapperAccess().getMethodSectionMethodSectionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleMethodSection_in_rule__ObjectWrapper__MethodSectionAssignment_105519);
            ruleMethodSection();

            state._fsp--;

             after(grammarAccess.getObjectWrapperAccess().getMethodSectionMethodSectionParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__ObjectWrapper__MethodSectionAssignment_10"


    // $ANTLR start "rule__ConstructorSection__BuilderConstructorAssignment_2_0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2795:1: rule__ConstructorSection__BuilderConstructorAssignment_2_0 : ( ( 'builder' ) ) ;
    public final void rule__ConstructorSection__BuilderConstructorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2799:1: ( ( ( 'builder' ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2800:1: ( ( 'builder' ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2800:1: ( ( 'builder' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2801:1: ( 'builder' )
            {
             before(grammarAccess.getConstructorSectionAccess().getBuilderConstructorBuilderKeyword_2_0_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2802:1: ( 'builder' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2803:1: 'builder'
            {
             before(grammarAccess.getConstructorSectionAccess().getBuilderConstructorBuilderKeyword_2_0_0()); 
            match(input,31,FOLLOW_31_in_rule__ConstructorSection__BuilderConstructorAssignment_2_05555); 
             after(grammarAccess.getConstructorSectionAccess().getBuilderConstructorBuilderKeyword_2_0_0()); 

            }

             after(grammarAccess.getConstructorSectionAccess().getBuilderConstructorBuilderKeyword_2_0_0()); 

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
    // $ANTLR end "rule__ConstructorSection__BuilderConstructorAssignment_2_0"


    // $ANTLR start "rule__ConstructorSection__DefaultConstructorAssignment_3_0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2818:1: rule__ConstructorSection__DefaultConstructorAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__ConstructorSection__DefaultConstructorAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2822:1: ( ( ( 'default' ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2823:1: ( ( 'default' ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2823:1: ( ( 'default' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2824:1: ( 'default' )
            {
             before(grammarAccess.getConstructorSectionAccess().getDefaultConstructorDefaultKeyword_3_0_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2825:1: ( 'default' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2826:1: 'default'
            {
             before(grammarAccess.getConstructorSectionAccess().getDefaultConstructorDefaultKeyword_3_0_0()); 
            match(input,32,FOLLOW_32_in_rule__ConstructorSection__DefaultConstructorAssignment_3_05599); 
             after(grammarAccess.getConstructorSectionAccess().getDefaultConstructorDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getConstructorSectionAccess().getDefaultConstructorDefaultKeyword_3_0_0()); 

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
    // $ANTLR end "rule__ConstructorSection__DefaultConstructorAssignment_3_0"


    // $ANTLR start "rule__ConstructorSection__ConstructorsAssignment_4"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2841:1: rule__ConstructorSection__ConstructorsAssignment_4 : ( ruleConstructor ) ;
    public final void rule__ConstructorSection__ConstructorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2845:1: ( ( ruleConstructor ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2846:1: ( ruleConstructor )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2846:1: ( ruleConstructor )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2847:1: ruleConstructor
            {
             before(grammarAccess.getConstructorSectionAccess().getConstructorsConstructorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConstructor_in_rule__ConstructorSection__ConstructorsAssignment_45638);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getConstructorSectionAccess().getConstructorsConstructorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ConstructorSection__ConstructorsAssignment_4"


    // $ANTLR start "rule__Constructor__NameAssignment_1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2856:1: rule__Constructor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2860:1: ( ( RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2861:1: ( RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2861:1: ( RULE_ID )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2862:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__NameAssignment_15669); 
             after(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constructor__NameAssignment_1"


    // $ANTLR start "rule__Constructor__ParametersAssignment_3"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2871:1: rule__Constructor__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__Constructor__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2875:1: ( ( ruleParameter ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2876:1: ( ruleParameter )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2876:1: ( ruleParameter )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2877:1: ruleParameter
            {
             before(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Constructor__ParametersAssignment_35700);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Constructor__ParametersAssignment_3"


    // $ANTLR start "rule__Constructor__ParametersAssignment_4_1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2886:1: rule__Constructor__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__Constructor__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2890:1: ( ( ruleParameter ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2891:1: ( ruleParameter )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2891:1: ( ruleParameter )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2892:1: ruleParameter
            {
             before(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Constructor__ParametersAssignment_4_15731);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Constructor__ParametersAssignment_4_1"


    // $ANTLR start "rule__Constructor__JsonAssignment_6"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2901:1: rule__Constructor__JsonAssignment_6 : ( ( 'json' ) ) ;
    public final void rule__Constructor__JsonAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2905:1: ( ( ( 'json' ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2906:1: ( ( 'json' ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2906:1: ( ( 'json' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2907:1: ( 'json' )
            {
             before(grammarAccess.getConstructorAccess().getJsonJsonKeyword_6_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2908:1: ( 'json' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2909:1: 'json'
            {
             before(grammarAccess.getConstructorAccess().getJsonJsonKeyword_6_0()); 
            match(input,33,FOLLOW_33_in_rule__Constructor__JsonAssignment_65767); 
             after(grammarAccess.getConstructorAccess().getJsonJsonKeyword_6_0()); 

            }

             after(grammarAccess.getConstructorAccess().getJsonJsonKeyword_6_0()); 

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
    // $ANTLR end "rule__Constructor__JsonAssignment_6"


    // $ANTLR start "rule__PropertySection__PropertiesAssignment_2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2924:1: rule__PropertySection__PropertiesAssignment_2 : ( ruleProperty ) ;
    public final void rule__PropertySection__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2928:1: ( ( ruleProperty ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2929:1: ( ruleProperty )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2929:1: ( ruleProperty )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2930:1: ruleProperty
            {
             before(grammarAccess.getPropertySectionAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__PropertySection__PropertiesAssignment_25806);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertySectionAccess().getPropertiesPropertyParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PropertySection__PropertiesAssignment_2"


    // $ANTLR start "rule__Property__ReadOnlyAssignment_0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2939:1: rule__Property__ReadOnlyAssignment_0 : ( ( 'readonly' ) ) ;
    public final void rule__Property__ReadOnlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2943:1: ( ( ( 'readonly' ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2944:1: ( ( 'readonly' ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2944:1: ( ( 'readonly' ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2945:1: ( 'readonly' )
            {
             before(grammarAccess.getPropertyAccess().getReadOnlyReadonlyKeyword_0_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2946:1: ( 'readonly' )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2947:1: 'readonly'
            {
             before(grammarAccess.getPropertyAccess().getReadOnlyReadonlyKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__Property__ReadOnlyAssignment_05842); 
             after(grammarAccess.getPropertyAccess().getReadOnlyReadonlyKeyword_0_0()); 

            }

             after(grammarAccess.getPropertyAccess().getReadOnlyReadonlyKeyword_0_0()); 

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
    // $ANTLR end "rule__Property__ReadOnlyAssignment_0"


    // $ANTLR start "rule__Property__TypeAssignment_1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2962:1: rule__Property__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Property__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2966:1: ( ( ruleType ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2967:1: ( ruleType )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2967:1: ( ruleType )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2968:1: ruleType
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Property__TypeAssignment_15881);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Property__TypeAssignment_1"


    // $ANTLR start "rule__Property__NameAssignment_2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2977:1: rule__Property__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2981:1: ( ( RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2982:1: ( RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2982:1: ( RULE_ID )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2983:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_25912); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Property__NameAssignment_2"


    // $ANTLR start "rule__MethodSection__MethodsAssignment_2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2992:1: rule__MethodSection__MethodsAssignment_2 : ( ruleMethod ) ;
    public final void rule__MethodSection__MethodsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2996:1: ( ( ruleMethod ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2997:1: ( ruleMethod )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2997:1: ( ruleMethod )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:2998:1: ruleMethod
            {
             before(grammarAccess.getMethodSectionAccess().getMethodsMethodParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__MethodSection__MethodsAssignment_25943);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodSectionAccess().getMethodsMethodParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MethodSection__MethodsAssignment_2"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3007:1: rule__Method__ReturnTypeAssignment_0 : ( ruleType ) ;
    public final void rule__Method__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3011:1: ( ( ruleType ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3012:1: ( ruleType )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3012:1: ( ruleType )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3013:1: ruleType
            {
             before(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method__ReturnTypeAssignment_05974);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Method__ReturnTypeAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3022:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3026:1: ( ( RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3027:1: ( RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3027:1: ( RULE_ID )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3028:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_16005); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParametersAssignment_3_0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3037:1: rule__Method__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3041:1: ( ( ruleParameter ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3042:1: ( ruleParameter )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3042:1: ( ruleParameter )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3043:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_3_06036);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Method__ParametersAssignment_3_0"


    // $ANTLR start "rule__Method__ParametersAssignment_3_1_1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3052:1: rule__Method__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3056:1: ( ( ruleParameter ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3057:1: ( ruleParameter )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3057:1: ( ruleParameter )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3058:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_3_1_16067);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Method__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3067:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3071:1: ( ( ruleType ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3072:1: ( ruleType )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3072:1: ( ruleType )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3073:1: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_06098);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3082:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3086:1: ( ( RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3087:1: ( RULE_ID )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3087:1: ( RULE_ID )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3088:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_16129); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Type__DatatypeAssignment_0_0"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3097:1: rule__Type__DatatypeAssignment_0_0 : ( ruleDatatype ) ;
    public final void rule__Type__DatatypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3101:1: ( ( ruleDatatype ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3102:1: ( ruleDatatype )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3102:1: ( ruleDatatype )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3103:1: ruleDatatype
            {
             before(grammarAccess.getTypeAccess().getDatatypeDatatypeEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleDatatype_in_rule__Type__DatatypeAssignment_0_06160);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getDatatypeDatatypeEnumRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Type__DatatypeAssignment_0_0"


    // $ANTLR start "rule__Type__WrapperAssignment_0_1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3112:1: rule__Type__WrapperAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__WrapperAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3116:1: ( ( ( RULE_ID ) ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3117:1: ( ( RULE_ID ) )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3117:1: ( ( RULE_ID ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3118:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getWrapperObjectWrapperCrossReference_0_1_0()); 
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3119:1: ( RULE_ID )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3120:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getWrapperObjectWrapperIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__WrapperAssignment_0_16195); 
             after(grammarAccess.getTypeAccess().getWrapperObjectWrapperIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getWrapperObjectWrapperCrossReference_0_1_0()); 

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
    // $ANTLR end "rule__Type__WrapperAssignment_0_1"


    // $ANTLR start "rule__Type__ArrayTypeAssignment_1"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3131:1: rule__Type__ArrayTypeAssignment_1 : ( ruleArrayType ) ;
    public final void rule__Type__ArrayTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3135:1: ( ( ruleArrayType ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3136:1: ( ruleArrayType )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3136:1: ( ruleArrayType )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3137:1: ruleArrayType
            {
             before(grammarAccess.getTypeAccess().getArrayTypeArrayTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__Type__ArrayTypeAssignment_16230);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getArrayTypeArrayTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Type__ArrayTypeAssignment_1"


    // $ANTLR start "rule__ArrayType__DimensionsAssignment_2"
    // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3146:1: rule__ArrayType__DimensionsAssignment_2 : ( RULE_INT ) ;
    public final void rule__ArrayType__DimensionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3150:1: ( ( RULE_INT ) )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3151:1: ( RULE_INT )
            {
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3151:1: ( RULE_INT )
            // ../net.blimster.gwt.threejs.wdl.ui/src-gen/net/blimster/gwt/threejs/wdl/ui/contentassist/antlr/internal/InternalThreeJsWrapperDescriptionLanguage.g:3152:1: RULE_INT
            {
             before(grammarAccess.getArrayTypeAccess().getDimensionsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArrayType__DimensionsAssignment_26261); 
             after(grammarAccess.getArrayTypeAccess().getDimensionsINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ArrayType__DimensionsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WrappersAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000040008002L});
    public static final BitSet FOLLOW_ruleObjectWrapper_in_entryRuleObjectWrapper122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectWrapper129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__0_in_ruleObjectWrapper155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorSection_in_entryRuleConstructorSection182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructorSection189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group__0_in_ruleConstructorSection215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0_in_ruleConstructor275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertySection_in_entryRulePropertySection302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertySection309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySection__Group__0_in_rulePropertySection335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodSection_in_entryRuleMethodSection422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodSection429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodSection__Group__0_in_ruleMethodSection455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DatatypeAssignment_0_0_in_rule__Type__Alternatives_0827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__WrapperAssignment_0_1_in_rule__Type__Alternatives_0845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Datatype__Alternatives879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Datatype__Alternatives900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Datatype__Alternatives921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Datatype__Alternatives942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__0__Impl_in_rule__ObjectWrapper__Group__0975 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__1_in_rule__ObjectWrapper__Group__0978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__AbstractAssignment_0_in_rule__ObjectWrapper__Group__0__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__1__Impl_in_rule__ObjectWrapper__Group__11036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__2_in_rule__ObjectWrapper__Group__11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ObjectWrapper__Group__1__Impl1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__2__Impl_in_rule__ObjectWrapper__Group__21098 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__3_in_rule__ObjectWrapper__Group__21101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__NameAssignment_2_in_rule__ObjectWrapper__Group__2__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__3__Impl_in_rule__ObjectWrapper__Group__31158 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__4_in_rule__ObjectWrapper__Group__31161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group_3__0_in_rule__ObjectWrapper__Group__3__Impl1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__4__Impl_in_rule__ObjectWrapper__Group__41219 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__5_in_rule__ObjectWrapper__Group__41222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ObjectWrapper__Group__4__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__5__Impl_in_rule__ObjectWrapper__Group__51281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__6_in_rule__ObjectWrapper__Group__51284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ObjectWrapper__Group__5__Impl1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__6__Impl_in_rule__ObjectWrapper__Group__61343 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__7_in_rule__ObjectWrapper__Group__61346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__PckAssignment_6_in_rule__ObjectWrapper__Group__6__Impl1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__7__Impl_in_rule__ObjectWrapper__Group__71403 = new BitSet(new long[]{0x0000000006280000L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__8_in_rule__ObjectWrapper__Group__71406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ObjectWrapper__Group__7__Impl1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__8__Impl_in_rule__ObjectWrapper__Group__81465 = new BitSet(new long[]{0x0000000006280000L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__9_in_rule__ObjectWrapper__Group__81468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__ConstructorSectionAssignment_8_in_rule__ObjectWrapper__Group__8__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__9__Impl_in_rule__ObjectWrapper__Group__91526 = new BitSet(new long[]{0x0000000006280000L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__10_in_rule__ObjectWrapper__Group__91529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__PropertySectionAssignment_9_in_rule__ObjectWrapper__Group__9__Impl1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__10__Impl_in_rule__ObjectWrapper__Group__101587 = new BitSet(new long[]{0x0000000006280000L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__11_in_rule__ObjectWrapper__Group__101590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__MethodSectionAssignment_10_in_rule__ObjectWrapper__Group__10__Impl1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group__11__Impl_in_rule__ObjectWrapper__Group__111648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ObjectWrapper__Group__11__Impl1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group_3__0__Impl_in_rule__ObjectWrapper__Group_3__01731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group_3__1_in_rule__ObjectWrapper__Group_3__01734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ObjectWrapper__Group_3__0__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__Group_3__1__Impl_in_rule__ObjectWrapper__Group_3__11793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectWrapper__SupertypeAssignment_3_1_in_rule__ObjectWrapper__Group_3__1__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group__0__Impl_in_rule__ConstructorSection__Group__01854 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group__1_in_rule__ConstructorSection__Group__01857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group__1__Impl_in_rule__ConstructorSection__Group__11915 = new BitSet(new long[]{0x0000000180400010L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group__2_in_rule__ConstructorSection__Group__11918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ConstructorSection__Group__1__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group__2__Impl_in_rule__ConstructorSection__Group__21977 = new BitSet(new long[]{0x0000000180400010L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group__3_in_rule__ConstructorSection__Group__21980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_2__0_in_rule__ConstructorSection__Group__2__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group__3__Impl_in_rule__ConstructorSection__Group__32038 = new BitSet(new long[]{0x0000000180400010L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group__4_in_rule__ConstructorSection__Group__32041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_3__0_in_rule__ConstructorSection__Group__3__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group__4__Impl_in_rule__ConstructorSection__Group__42099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__ConstructorsAssignment_4_in_rule__ConstructorSection__Group__4__Impl2126 = new BitSet(new long[]{0x0000000000400012L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_2__0__Impl_in_rule__ConstructorSection__Group_2__02167 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_2__1_in_rule__ConstructorSection__Group_2__02170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__BuilderConstructorAssignment_2_0_in_rule__ConstructorSection__Group_2__0__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_2__1__Impl_in_rule__ConstructorSection__Group_2__12227 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_2__2_in_rule__ConstructorSection__Group_2__12230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ConstructorSection__Group_2__1__Impl2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_2__2__Impl_in_rule__ConstructorSection__Group_2__22289 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_2__3_in_rule__ConstructorSection__Group_2__22292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ConstructorSection__Group_2__2__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_2__3__Impl_in_rule__ConstructorSection__Group_2__32351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ConstructorSection__Group_2__3__Impl2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_3__0__Impl_in_rule__ConstructorSection__Group_3__02418 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_3__1_in_rule__ConstructorSection__Group_3__02421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__DefaultConstructorAssignment_3_0_in_rule__ConstructorSection__Group_3__0__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_3__1__Impl_in_rule__ConstructorSection__Group_3__12478 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_3__2_in_rule__ConstructorSection__Group_3__12481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ConstructorSection__Group_3__1__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_3__2__Impl_in_rule__ConstructorSection__Group_3__22540 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_3__3_in_rule__ConstructorSection__Group_3__22543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ConstructorSection__Group_3__2__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorSection__Group_3__3__Impl_in_rule__ConstructorSection__Group_3__32602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ConstructorSection__Group_3__3__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0__Impl_in_rule__Constructor__Group__02669 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1__Impl_in_rule__Constructor__Group__12730 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__NameAssignment_1_in_rule__Constructor__Group__1__Impl2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2__Impl_in_rule__Constructor__Group__22791 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Constructor__Group__2__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3__Impl_in_rule__Constructor__Group__32853 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__4_in_rule__Constructor__Group__32856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ParametersAssignment_3_in_rule__Constructor__Group__3__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__4__Impl_in_rule__Constructor__Group__42913 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__5_in_rule__Constructor__Group__42916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_4__0_in_rule__Constructor__Group__4__Impl2943 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__5__Impl_in_rule__Constructor__Group__52974 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__6_in_rule__Constructor__Group__52977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Constructor__Group__5__Impl3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__6__Impl_in_rule__Constructor__Group__63036 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__7_in_rule__Constructor__Group__63039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__JsonAssignment_6_in_rule__Constructor__Group__6__Impl3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__7__Impl_in_rule__Constructor__Group__73097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Constructor__Group__7__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_4__0__Impl_in_rule__Constructor__Group_4__03172 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_rule__Constructor__Group_4__1_in_rule__Constructor__Group_4__03175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constructor__Group_4__0__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_4__1__Impl_in_rule__Constructor__Group_4__13234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ParametersAssignment_4_1_in_rule__Constructor__Group_4__1__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySection__Group__0__Impl_in_rule__PropertySection__Group__03295 = new BitSet(new long[]{0x0000000400007810L});
    public static final BitSet FOLLOW_rule__PropertySection__Group__1_in_rule__PropertySection__Group__03298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PropertySection__Group__0__Impl3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySection__Group__1__Impl_in_rule__PropertySection__Group__13357 = new BitSet(new long[]{0x0000000400007810L});
    public static final BitSet FOLLOW_rule__PropertySection__Group__2_in_rule__PropertySection__Group__13360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySection__Group__2__Impl_in_rule__PropertySection__Group__23418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertySection__PropertiesAssignment_2_in_rule__PropertySection__Group__2__Impl3445 = new BitSet(new long[]{0x0000000400007812L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03482 = new BitSet(new long[]{0x0000000400007810L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ReadOnlyAssignment_0_in_rule__Property__Group__0__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__1__Impl3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23603 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__23606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__33663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Property__Group__3__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodSection__Group__0__Impl_in_rule__MethodSection__Group__03730 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_rule__MethodSection__Group__1_in_rule__MethodSection__Group__03733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MethodSection__Group__0__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodSection__Group__1__Impl_in_rule__MethodSection__Group__13792 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_rule__MethodSection__Group__2_in_rule__MethodSection__Group__13795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodSection__Group__2__Impl_in_rule__MethodSection__Group__23853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodSection__MethodsAssignment_2_in_rule__MethodSection__Group__2__Impl3880 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03917 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturnTypeAssignment_0_in_rule__Method__Group__0__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13978 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__13981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__24038 = new BitSet(new long[]{0x0000000000807810L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__24041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Method__Group__2__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__34100 = new BitSet(new long[]{0x0000000000807810L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__34103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__44161 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__44164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Method__Group__4__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__54223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group__5__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__04294 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__04297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_0_in_rule__Method__Group_3__0__Impl4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__14354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__1__Impl4381 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0__Impl_in_rule__Method__Group_3_1__04416 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__04419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Method__Group_3_1__0__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1__Impl_in_rule__Method__Group_3_1__14478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_1_1_in_rule__Method__Group_3_1__1__Impl4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04660 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_0_in_rule__Type__Group__0__Impl4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ArrayTypeAssignment_1_in_rule__Type__Group__1__Impl4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__04782 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__04785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__14843 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__14846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ArrayType__Group__1__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__24905 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__24908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__DimensionsAssignment_2_in_rule__ArrayType__Group__2__Impl4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__34966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ArrayType__Group__3__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05033 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5119 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectWrapper_in_rule__Model__WrappersAssignment5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ObjectWrapper__AbstractAssignment_05317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectWrapper__NameAssignment_25356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectWrapper__SupertypeAssignment_3_15391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ObjectWrapper__PckAssignment_65426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorSection_in_rule__ObjectWrapper__ConstructorSectionAssignment_85457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertySection_in_rule__ObjectWrapper__PropertySectionAssignment_95488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodSection_in_rule__ObjectWrapper__MethodSectionAssignment_105519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ConstructorSection__BuilderConstructorAssignment_2_05555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ConstructorSection__DefaultConstructorAssignment_3_05599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__ConstructorSection__ConstructorsAssignment_45638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__NameAssignment_15669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Constructor__ParametersAssignment_35700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Constructor__ParametersAssignment_4_15731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Constructor__JsonAssignment_65767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PropertySection__PropertiesAssignment_25806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Property__ReadOnlyAssignment_05842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Property__TypeAssignment_15881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_25912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__MethodSection__MethodsAssignment_25943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method__ReturnTypeAssignment_05974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_16005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_3_06036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_3_1_16067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_06098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_16129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Type__DatatypeAssignment_0_06160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__WrapperAssignment_0_16195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Type__ArrayTypeAssignment_16230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArrayType__DimensionsAssignment_26261 = new BitSet(new long[]{0x0000000000000002L});

}