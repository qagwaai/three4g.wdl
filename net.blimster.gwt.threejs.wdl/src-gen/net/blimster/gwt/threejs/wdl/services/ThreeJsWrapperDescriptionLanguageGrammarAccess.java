/*
* generated by Xtext
*/

package net.blimster.gwt.threejs.wdl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ThreeJsWrapperDescriptionLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cWrappersAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cWrappersObjectWrapperParserRuleCall_0 = (RuleCall)cWrappersAssignment.eContents().get(0);
		
		//Model:
		//	wrappers+=ObjectWrapper*;
		public ParserRule getRule() { return rule; }

		//wrappers+=ObjectWrapper*
		public Assignment getWrappersAssignment() { return cWrappersAssignment; }

		//ObjectWrapper
		public RuleCall getWrappersObjectWrapperParserRuleCall_0() { return cWrappersObjectWrapperParserRuleCall_0; }
	}

	public class ObjectWrapperElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ObjectWrapper");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cAbstractAbstractKeyword_0_0 = (Keyword)cAbstractAssignment_0.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSupertypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cSupertypeObjectWrapperCrossReference_3_1_0 = (CrossReference)cSupertypeAssignment_3_1.eContents().get(0);
		private final RuleCall cSupertypeObjectWrapperIDTerminalRuleCall_3_1_0_1 = (RuleCall)cSupertypeObjectWrapperCrossReference_3_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cPackageKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cPckAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cPckQualifiedNameParserRuleCall_6_0 = (RuleCall)cPckAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cConstructorSectionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cConstructorSectionConstructorSectionParserRuleCall_8_0 = (RuleCall)cConstructorSectionAssignment_8.eContents().get(0);
		private final Assignment cPropertySectionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cPropertySectionPropertySectionParserRuleCall_9_0 = (RuleCall)cPropertySectionAssignment_9.eContents().get(0);
		private final Assignment cMethodSectionAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cMethodSectionMethodSectionParserRuleCall_10_0 = (RuleCall)cMethodSectionAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//ObjectWrapper:
		//	abstract?="abstract"? "class" name=ID ("extends" supertype=[ObjectWrapper])? "{" "package" pck=QualifiedName ";"
		//	constructorSection=ConstructorSection? propertySection=PropertySection? methodSection=MethodSection? "}";
		public ParserRule getRule() { return rule; }

		//abstract?="abstract"? "class" name=ID ("extends" supertype=[ObjectWrapper])? "{" "package" pck=QualifiedName ";"
		//constructorSection=ConstructorSection? propertySection=PropertySection? methodSection=MethodSection? "}"
		public Group getGroup() { return cGroup; }

		//abstract?="abstract"?
		public Assignment getAbstractAssignment_0() { return cAbstractAssignment_0; }

		//"abstract"
		public Keyword getAbstractAbstractKeyword_0_0() { return cAbstractAbstractKeyword_0_0; }

		//"class"
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//("extends" supertype=[ObjectWrapper])?
		public Group getGroup_3() { return cGroup_3; }

		//"extends"
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }

		//supertype=[ObjectWrapper]
		public Assignment getSupertypeAssignment_3_1() { return cSupertypeAssignment_3_1; }

		//[ObjectWrapper]
		public CrossReference getSupertypeObjectWrapperCrossReference_3_1_0() { return cSupertypeObjectWrapperCrossReference_3_1_0; }

		//ID
		public RuleCall getSupertypeObjectWrapperIDTerminalRuleCall_3_1_0_1() { return cSupertypeObjectWrapperIDTerminalRuleCall_3_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"package"
		public Keyword getPackageKeyword_5() { return cPackageKeyword_5; }

		//pck=QualifiedName
		public Assignment getPckAssignment_6() { return cPckAssignment_6; }

		//QualifiedName
		public RuleCall getPckQualifiedNameParserRuleCall_6_0() { return cPckQualifiedNameParserRuleCall_6_0; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }

		//constructorSection=ConstructorSection?
		public Assignment getConstructorSectionAssignment_8() { return cConstructorSectionAssignment_8; }

		//ConstructorSection
		public RuleCall getConstructorSectionConstructorSectionParserRuleCall_8_0() { return cConstructorSectionConstructorSectionParserRuleCall_8_0; }

		//propertySection=PropertySection?
		public Assignment getPropertySectionAssignment_9() { return cPropertySectionAssignment_9; }

		//PropertySection
		public RuleCall getPropertySectionPropertySectionParserRuleCall_9_0() { return cPropertySectionPropertySectionParserRuleCall_9_0; }

		//methodSection=MethodSection?
		public Assignment getMethodSectionAssignment_10() { return cMethodSectionAssignment_10; }

		//MethodSection
		public RuleCall getMethodSectionMethodSectionParserRuleCall_10_0() { return cMethodSectionMethodSectionParserRuleCall_10_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}

	public class ConstructorSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConstructorSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConstructorSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cConstructorsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cBuilderConstructorAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final Keyword cBuilderConstructorBuilderKeyword_2_0_0 = (Keyword)cBuilderConstructorAssignment_2_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cDefaultConstructorAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final Keyword cDefaultConstructorDefaultKeyword_3_0_0 = (Keyword)cDefaultConstructorAssignment_3_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Keyword cSemicolonKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cConstructorsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConstructorsConstructorParserRuleCall_4_0 = (RuleCall)cConstructorsAssignment_4.eContents().get(0);
		
		//ConstructorSection:
		//	{ConstructorSection} "constructors:" (builderConstructor="builder" "(" ")" ";")? (defaultConstructor="default" "(" ")"
		//	";")? constructors+=Constructor*;
		public ParserRule getRule() { return rule; }

		//{ConstructorSection} "constructors:" (builderConstructor="builder" "(" ")" ";")? (defaultConstructor="default" "(" ")"
		//";")? constructors+=Constructor*
		public Group getGroup() { return cGroup; }

		//{ConstructorSection}
		public Action getConstructorSectionAction_0() { return cConstructorSectionAction_0; }

		//"constructors:"
		public Keyword getConstructorsKeyword_1() { return cConstructorsKeyword_1; }

		//(builderConstructor="builder" "(" ")" ";")?
		public Group getGroup_2() { return cGroup_2; }

		//builderConstructor="builder"
		public Assignment getBuilderConstructorAssignment_2_0() { return cBuilderConstructorAssignment_2_0; }

		//"builder"
		public Keyword getBuilderConstructorBuilderKeyword_2_0_0() { return cBuilderConstructorBuilderKeyword_2_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_1() { return cLeftParenthesisKeyword_2_1; }

		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }

		//";"
		public Keyword getSemicolonKeyword_2_3() { return cSemicolonKeyword_2_3; }

		//(defaultConstructor="default" "(" ")" ";")?
		public Group getGroup_3() { return cGroup_3; }

		//defaultConstructor="default"
		public Assignment getDefaultConstructorAssignment_3_0() { return cDefaultConstructorAssignment_3_0; }

		//"default"
		public Keyword getDefaultConstructorDefaultKeyword_3_0_0() { return cDefaultConstructorDefaultKeyword_3_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3_1() { return cLeftParenthesisKeyword_3_1; }

		//")"
		public Keyword getRightParenthesisKeyword_3_2() { return cRightParenthesisKeyword_3_2; }

		//";"
		public Keyword getSemicolonKeyword_3_3() { return cSemicolonKeyword_3_3; }

		//constructors+=Constructor*
		public Assignment getConstructorsAssignment_4() { return cConstructorsAssignment_4; }

		//Constructor
		public RuleCall getConstructorsConstructorParserRuleCall_4_0() { return cConstructorsConstructorParserRuleCall_4_0; }
	}

	public class ConstructorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Constructor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConstructorAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParametersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParametersParameterParserRuleCall_3_0 = (RuleCall)cParametersAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cParametersAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_4_1_0 = (RuleCall)cParametersAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cJsonAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final Keyword cJsonJsonKeyword_6_0 = (Keyword)cJsonAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Constructor:
		//	{Constructor} name=ID? "(" parameters+=Parameter ("," parameters+=Parameter)* ")" json?="json"? ";";
		public ParserRule getRule() { return rule; }

		//{Constructor} name=ID? "(" parameters+=Parameter ("," parameters+=Parameter)* ")" json?="json"? ";"
		public Group getGroup() { return cGroup; }

		//{Constructor}
		public Action getConstructorAction_0() { return cConstructorAction_0; }

		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//parameters+=Parameter
		public Assignment getParametersAssignment_3() { return cParametersAssignment_3; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_0() { return cParametersParameterParserRuleCall_3_0; }

		//("," parameters+=Parameter)*
		public Group getGroup_4() { return cGroup_4; }

		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }

		//parameters+=Parameter
		public Assignment getParametersAssignment_4_1() { return cParametersAssignment_4_1; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_4_1_0() { return cParametersParameterParserRuleCall_4_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }

		//json?="json"?
		public Assignment getJsonAssignment_6() { return cJsonAssignment_6; }

		//"json"
		public Keyword getJsonJsonKeyword_6_0() { return cJsonJsonKeyword_6_0; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class PropertySectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertySection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPropertiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cPropertySectionAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cPropertiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPropertiesPropertyParserRuleCall_2_0 = (RuleCall)cPropertiesAssignment_2.eContents().get(0);
		
		//PropertySection:
		//	"properties:" {PropertySection} properties+=Property*;
		public ParserRule getRule() { return rule; }

		//"properties:" {PropertySection} properties+=Property*
		public Group getGroup() { return cGroup; }

		//"properties:"
		public Keyword getPropertiesKeyword_0() { return cPropertiesKeyword_0; }

		//{PropertySection}
		public Action getPropertySectionAction_1() { return cPropertySectionAction_1; }

		//properties+=Property*
		public Assignment getPropertiesAssignment_2() { return cPropertiesAssignment_2; }

		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_2_0() { return cPropertiesPropertyParserRuleCall_2_0; }
	}

	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReadOnlyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cReadOnlyReadonlyKeyword_0_0 = (Keyword)cReadOnlyAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Property:
		//	readOnly?="readonly"? type=Type name=ID ";";
		public ParserRule getRule() { return rule; }

		//readOnly?="readonly"? type=Type name=ID ";"
		public Group getGroup() { return cGroup; }

		//readOnly?="readonly"?
		public Assignment getReadOnlyAssignment_0() { return cReadOnlyAssignment_0; }

		//"readonly"
		public Keyword getReadOnlyReadonlyKeyword_0_0() { return cReadOnlyReadonlyKeyword_0_0; }

		//type=Type
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_1_0() { return cTypeTypeParserRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class MethodSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MethodSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMethodsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cMethodSectionAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cMethodsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMethodsMethodParserRuleCall_2_0 = (RuleCall)cMethodsAssignment_2.eContents().get(0);
		
		//MethodSection:
		//	"methods:" {MethodSection} methods+=Method*;
		public ParserRule getRule() { return rule; }

		//"methods:" {MethodSection} methods+=Method*
		public Group getGroup() { return cGroup; }

		//"methods:"
		public Keyword getMethodsKeyword_0() { return cMethodsKeyword_0; }

		//{MethodSection}
		public Action getMethodSectionAction_1() { return cMethodSectionAction_1; }

		//methods+=Method*
		public Assignment getMethodsAssignment_2() { return cMethodsAssignment_2; }

		//Method
		public RuleCall getMethodsMethodParserRuleCall_2_0() { return cMethodsMethodParserRuleCall_2_0; }
	}

	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Method");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReturnTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cReturnTypeTypeParserRuleCall_0_0 = (RuleCall)cReturnTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_3_0_0 = (RuleCall)cParametersAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParametersAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_3_1_1_0 = (RuleCall)cParametersAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Method:
		//	returnType=Type? name=ID "(" (parameters+=Parameter ("," parameters+=Parameter)*)? ")" ";";
		public ParserRule getRule() { return rule; }

		//returnType=Type? name=ID "(" (parameters+=Parameter ("," parameters+=Parameter)*)? ")" ";"
		public Group getGroup() { return cGroup; }

		//returnType=Type?
		public Assignment getReturnTypeAssignment_0() { return cReturnTypeAssignment_0; }

		//Type
		public RuleCall getReturnTypeTypeParserRuleCall_0_0() { return cReturnTypeTypeParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//(parameters+=Parameter ("," parameters+=Parameter)*)?
		public Group getGroup_3() { return cGroup_3; }

		//parameters+=Parameter
		public Assignment getParametersAssignment_3_0() { return cParametersAssignment_3_0; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_0_0() { return cParametersParameterParserRuleCall_3_0_0; }

		//("," parameters+=Parameter)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//parameters+=Parameter
		public Assignment getParametersAssignment_3_1_1() { return cParametersAssignment_3_1_1; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_1_1_0() { return cParametersParameterParserRuleCall_3_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Parameter:
		//	type=Type name=ID;
		public ParserRule getRule() { return rule; }

		//type=Type name=ID
		public Group getGroup() { return cGroup; }

		//type=Type
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_0_0() { return cTypeTypeParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cDatatypeAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final RuleCall cDatatypeDatatypeEnumRuleCall_0_0_0 = (RuleCall)cDatatypeAssignment_0_0.eContents().get(0);
		private final Assignment cWrapperAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final CrossReference cWrapperObjectWrapperCrossReference_0_1_0 = (CrossReference)cWrapperAssignment_0_1.eContents().get(0);
		private final RuleCall cWrapperObjectWrapperIDTerminalRuleCall_0_1_0_1 = (RuleCall)cWrapperObjectWrapperCrossReference_0_1_0.eContents().get(1);
		private final Assignment cArrayTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cArrayTypeArrayTypeParserRuleCall_1_0 = (RuleCall)cArrayTypeAssignment_1.eContents().get(0);
		
		//Type:
		//	(datatype=Datatype | wrapper=[ObjectWrapper]) arrayType=ArrayType?;
		public ParserRule getRule() { return rule; }

		//(datatype=Datatype | wrapper=[ObjectWrapper]) arrayType=ArrayType?
		public Group getGroup() { return cGroup; }

		//datatype=Datatype | wrapper=[ObjectWrapper]
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//datatype=Datatype
		public Assignment getDatatypeAssignment_0_0() { return cDatatypeAssignment_0_0; }

		//Datatype
		public RuleCall getDatatypeDatatypeEnumRuleCall_0_0_0() { return cDatatypeDatatypeEnumRuleCall_0_0_0; }

		//wrapper=[ObjectWrapper]
		public Assignment getWrapperAssignment_0_1() { return cWrapperAssignment_0_1; }

		//[ObjectWrapper]
		public CrossReference getWrapperObjectWrapperCrossReference_0_1_0() { return cWrapperObjectWrapperCrossReference_0_1_0; }

		//ID
		public RuleCall getWrapperObjectWrapperIDTerminalRuleCall_0_1_0_1() { return cWrapperObjectWrapperIDTerminalRuleCall_0_1_0_1; }

		//arrayType=ArrayType?
		public Assignment getArrayTypeAssignment_1() { return cArrayTypeAssignment_1; }

		//ArrayType
		public RuleCall getArrayTypeArrayTypeParserRuleCall_1_0() { return cArrayTypeArrayTypeParserRuleCall_1_0; }
	}

	public class ArrayTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ArrayType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cArrayTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDimensionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDimensionsINTTerminalRuleCall_2_0 = (RuleCall)cDimensionsAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ArrayType:
		//	{ArrayType} "[" dimensions=INT? "]";
		public ParserRule getRule() { return rule; }

		//{ArrayType} "[" dimensions=INT? "]"
		public Group getGroup() { return cGroup; }

		//{ArrayType}
		public Action getArrayTypeAction_0() { return cArrayTypeAction_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//dimensions=INT?
		public Assignment getDimensionsAssignment_2() { return cDimensionsAssignment_2; }

		//INT
		public RuleCall getDimensionsINTTerminalRuleCall_2_0() { return cDimensionsINTTerminalRuleCall_2_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	public class DatatypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Datatype");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINTIntKeyword_0_0 = (Keyword)cINTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFLOATEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFLOATFloatKeyword_1_0 = (Keyword)cFLOATEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBOOLEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBOOLBooleanKeyword_2_0 = (Keyword)cBOOLEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cSTRINGEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cSTRINGStringKeyword_3_0 = (Keyword)cSTRINGEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Datatype:
		//	INT="int" | FLOAT="float" | BOOL="boolean" | STRING="string";
		public EnumRule getRule() { return rule; }

		//INT="int" | FLOAT="float" | BOOL="boolean" | STRING="string"
		public Alternatives getAlternatives() { return cAlternatives; }

		//INT="int"
		public EnumLiteralDeclaration getINTEnumLiteralDeclaration_0() { return cINTEnumLiteralDeclaration_0; }

		//"int"
		public Keyword getINTIntKeyword_0_0() { return cINTIntKeyword_0_0; }

		//FLOAT="float"
		public EnumLiteralDeclaration getFLOATEnumLiteralDeclaration_1() { return cFLOATEnumLiteralDeclaration_1; }

		//"float"
		public Keyword getFLOATFloatKeyword_1_0() { return cFLOATFloatKeyword_1_0; }

		//BOOL="boolean"
		public EnumLiteralDeclaration getBOOLEnumLiteralDeclaration_2() { return cBOOLEnumLiteralDeclaration_2; }

		//"boolean"
		public Keyword getBOOLBooleanKeyword_2_0() { return cBOOLBooleanKeyword_2_0; }

		//STRING="string"
		public EnumLiteralDeclaration getSTRINGEnumLiteralDeclaration_3() { return cSTRINGEnumLiteralDeclaration_3; }

		//"string"
		public Keyword getSTRINGStringKeyword_3_0() { return cSTRINGStringKeyword_3_0; }
	}
	
	private ModelElements pModel;
	private ObjectWrapperElements pObjectWrapper;
	private ConstructorSectionElements pConstructorSection;
	private ConstructorElements pConstructor;
	private PropertySectionElements pPropertySection;
	private PropertyElements pProperty;
	private MethodSectionElements pMethodSection;
	private MethodElements pMethod;
	private ParameterElements pParameter;
	private TypeElements pType;
	private ArrayTypeElements pArrayType;
	private DatatypeElements unknownRuleDatatype;
	private QualifiedNameElements pQualifiedName;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public ThreeJsWrapperDescriptionLanguageGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	wrappers+=ObjectWrapper*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//ObjectWrapper:
	//	abstract?="abstract"? "class" name=ID ("extends" supertype=[ObjectWrapper])? "{" "package" pck=QualifiedName ";"
	//	constructorSection=ConstructorSection? propertySection=PropertySection? methodSection=MethodSection? "}";
	public ObjectWrapperElements getObjectWrapperAccess() {
		return (pObjectWrapper != null) ? pObjectWrapper : (pObjectWrapper = new ObjectWrapperElements());
	}
	
	public ParserRule getObjectWrapperRule() {
		return getObjectWrapperAccess().getRule();
	}

	//ConstructorSection:
	//	{ConstructorSection} "constructors:" (builderConstructor="builder" "(" ")" ";")? (defaultConstructor="default" "(" ")"
	//	";")? constructors+=Constructor*;
	public ConstructorSectionElements getConstructorSectionAccess() {
		return (pConstructorSection != null) ? pConstructorSection : (pConstructorSection = new ConstructorSectionElements());
	}
	
	public ParserRule getConstructorSectionRule() {
		return getConstructorSectionAccess().getRule();
	}

	//Constructor:
	//	{Constructor} name=ID? "(" parameters+=Parameter ("," parameters+=Parameter)* ")" json?="json"? ";";
	public ConstructorElements getConstructorAccess() {
		return (pConstructor != null) ? pConstructor : (pConstructor = new ConstructorElements());
	}
	
	public ParserRule getConstructorRule() {
		return getConstructorAccess().getRule();
	}

	//PropertySection:
	//	"properties:" {PropertySection} properties+=Property*;
	public PropertySectionElements getPropertySectionAccess() {
		return (pPropertySection != null) ? pPropertySection : (pPropertySection = new PropertySectionElements());
	}
	
	public ParserRule getPropertySectionRule() {
		return getPropertySectionAccess().getRule();
	}

	//Property:
	//	readOnly?="readonly"? type=Type name=ID ";";
	public PropertyElements getPropertyAccess() {
		return (pProperty != null) ? pProperty : (pProperty = new PropertyElements());
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}

	//MethodSection:
	//	"methods:" {MethodSection} methods+=Method*;
	public MethodSectionElements getMethodSectionAccess() {
		return (pMethodSection != null) ? pMethodSection : (pMethodSection = new MethodSectionElements());
	}
	
	public ParserRule getMethodSectionRule() {
		return getMethodSectionAccess().getRule();
	}

	//Method:
	//	returnType=Type? name=ID "(" (parameters+=Parameter ("," parameters+=Parameter)*)? ")" ";";
	public MethodElements getMethodAccess() {
		return (pMethod != null) ? pMethod : (pMethod = new MethodElements());
	}
	
	public ParserRule getMethodRule() {
		return getMethodAccess().getRule();
	}

	//Parameter:
	//	type=Type name=ID;
	public ParameterElements getParameterAccess() {
		return (pParameter != null) ? pParameter : (pParameter = new ParameterElements());
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//Type:
	//	(datatype=Datatype | wrapper=[ObjectWrapper]) arrayType=ArrayType?;
	public TypeElements getTypeAccess() {
		return (pType != null) ? pType : (pType = new TypeElements());
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//ArrayType:
	//	{ArrayType} "[" dimensions=INT? "]";
	public ArrayTypeElements getArrayTypeAccess() {
		return (pArrayType != null) ? pArrayType : (pArrayType = new ArrayTypeElements());
	}
	
	public ParserRule getArrayTypeRule() {
		return getArrayTypeAccess().getRule();
	}

	//enum Datatype:
	//	INT="int" | FLOAT="float" | BOOL="boolean" | STRING="string";
	public DatatypeElements getDatatypeAccess() {
		return (unknownRuleDatatype != null) ? unknownRuleDatatype : (unknownRuleDatatype = new DatatypeElements());
	}
	
	public EnumRule getDatatypeRule() {
		return getDatatypeAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
