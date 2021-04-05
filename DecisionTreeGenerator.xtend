/*
 * generated by Xtext 2.24.0
 */
package sdu.mmmi.tamamo.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import sdu.mmmi.tamamo.decisionTree.Input
import sdu.mmmi.tamamo.decisionTree.Decision
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EObject
import sdu.mmmi.tamamo.decisionTree.InputInt
import sdu.mmmi.tamamo.decisionTree.InputString
import sdu.mmmi.tamamo.decisionTree.Parameter
import sdu.mmmi.tamamo.decisionTree.Rules
import sdu.mmmi.tamamo.decisionTree.RuleTypeInt
import sdu.mmmi.tamamo.decisionTree.GreaterThan
import sdu.mmmi.tamamo.decisionTree.LessThan
import sdu.mmmi.tamamo.decisionTree.GreaterEqual
import sdu.mmmi.tamamo.decisionTree.Conclusion
import sdu.mmmi.tamamo.decisionTree.ConclusionNested
import sdu.mmmi.tamamo.decisionTree.RuleTypeID
import sdu.mmmi.tamamo.decisionTree.ConclusionElse

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DecisionTreeGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val Decision decModel = resource.allContents.filter(Decision).next
		val Input inputModel = resource.allContents.filter(Input).next
		val Parameter parameterModel = resource.allContents.filter(Parameter).next;
		val Rules rulesModel = resource.allContents.filter(Rules).next
		val Conclusion conclusionModel = resource.allContents.filter(Conclusion).next
		
		System::out.println("Anything")
		inputModel.display
		decModel.display
		parameterModel.display
		rulesModel.display
		conclusionModel.display
		
		inputModel.generateInputFile(fsa)
		decModel.generateDecisionFile(fsa)
		parameterModel.generateParameterFile(fsa)
		rulesModel.generateRulesFile(fsa)
		conclusionModel.generateConclusionFile(fsa)
	}
	
	def void generateConclusionFile(Conclusion conc, IFileSystemAccess2 fsa) {
		fsa.generateFile("Conclusion.java", generateConclusion(conc))
	}
	
	def CharSequence generateConclusion(Conclusion conclusion) {'''	
import java.util.List;

public class Conclusion {
	
	public Decision begin(Parameter param, List<Decision> list) {
	
		«generateBegin(conclusion)»
	
	}
}


'''}
	
	def CharSequence generateBegin(Conclusion conclusion) {'''
«IF conclusion instanceof ConclusionElse»
for (Decision decision : list) {
	if (decision._text.equals("«(conclusion.getLeft as RuleTypeID).getName»")) {
		return decision;
	}
}

return null;
«ELSEIF conclusion instanceof ConclusionNested»
for (Decision decision : list) {
	if (decision._text.equals("«conclusion.getParent»")) {
		list = decision._nested;
	}
}

«IF conclusion.getNested !== null»«generateBegin(conclusion.getNested)»«ENDIF»«ELSE»
if («generateComparison(conclusion)») {
		for (Decision decision : list) {
			if (decision._text.equals("«conclusion.getDecision»")) {
				return decision;
			}
		}
	}
	
«IF conclusion.getNext !== null»«generateBegin(conclusion.getNext)»«ENDIF»«ENDIF»
'''}




	def CharSequence generateComparison(Conclusion conclusion) {'''
«IF conclusion.getLeft instanceof RuleTypeID»param.get«(conclusion.getLeft as RuleTypeID).getName.toFirstUpper»()«ELSE»«(conclusion.getLeft as RuleTypeInt).getValue»«ENDIF»'''+
''' «conclusion.getOperator.getType» «IF conclusion.getRight instanceof RuleTypeID»param.get«(conclusion.getRight as RuleTypeID).getName.toFirstUpper»() «ELSE»«(conclusion.getRight as RuleTypeInt).getValue»«ENDIF»'''}





	
	def void generateParameterFile(Parameter param, IFileSystemAccess2 fsa) {
		fsa.generateFile("Parameter.java", generateParameter(param))
	}
	
	
	
	
	
	
	def CharSequence generateParameter(Parameter parameter) {'''
public class Parameter {
	«generateClassVariables(parameter)»
	
	public Parameter(«generateConstructor(parameter)») {
		«generateAssignment(parameter)»
	}
}'''}

	def CharSequence generateAssignment(Parameter param) {'''
this.«param.name» = «param.name»;
«IF param.next !== null»«generateAssignment(param.next)»«ENDIF»'''}




	def CharSequence generateConstructor(Parameter param) {'''
int «param.name»«IF param.next !== null», «generateConstructor(param.next)»«ENDIF»'''} 





	def CharSequence generateClassVariables(Parameter param) {'''
private int «param.name» = «param.value»;
public int get«param.name.toFirstUpper»() {
	return this.«param.name»;
}
public void set«param.name.toFirstUpper»(int value) {
	this.«param.name» = value;
}
«IF param.next !== null»«generateClassVariables(param.next)»«ENDIF»'''}




	
	
	
	def void generateInputFile(Input input,IFileSystemAccess2 fsa){
		fsa.generateFile("Input.java",generateInput(input))
	}
	
	def CharSequence generateInput(Input input) {'''
public class Input {
	
	«generateClassVariables(input)»
	
	public Input(«generateConstructor(input)») {
		«generateAssignment(input)»
	}	
}
'''}


	def CharSequence generateConstructor(Input input) {'''
«IF input.value instanceof InputInt»int«ELSEIF input.value instanceof InputString»String«ELSE»boolean«ENDIF»''' +
''' «input.value.name»«IF input.next !== null», «generateConstructor(input.next)»«ENDIF»'''} 
	
	
	
	def CharSequence generateAssignment(Input input) {'''
this.«input.value.name» = «input.value.name»;
«IF input.next !== null»«generateAssignment(input.next)»«ENDIF»'''}
	
	def CharSequence generateClassVariables(Input input) {'''
private « IF input.value instanceof InputInt»int «input.value.name»;
public int get«input.value.name.toFirstUpper»() {
	return this.«input.value.name»;
}
«ELSEIF input.value instanceof InputString»String «input.value.name»;
public String get«input.value.name.toFirstUpper»() {
	return this.«input.value.name»;
}
«ELSE»boolean «input.value.name»;
public boolean get«input.value.name.toFirstUpper»() {
	return this.«input.value.name»;
}
«ENDIF»
«IF input.next!==null»«generateClassVariables(input.next)»«ENDIF»'''}
	
	
	
	def void generateDecisionFile(Decision decision, IFileSystemAccess2 fsa){
		fsa.generateFile("Decision.java",generateDecision(decision))
	}
	
	def  generateDecision(Decision decision){
		'''
		import java.util.list;
		import java.util.ArrayList;
		public class _Decision {
			public String _text;
			«IF decision.nested!==null» «ELSE»public List<Decision> _nested; «ENDIF»
			public Decision _next;
			public Decision(String text){
			        _text = text;
			    }
			public String getText() {
			        return _text;
			    }
			
			«IF decision.nested!==null» «ELSE»public List<Decision> getNested() {
			        return _nested;
			    }
			«ENDIF»
			    public Decision getNext() {
			        return _next;
			    } 
		  public void setNext(Decision decision) {
		        _next = decision;
		    }
		
		    public void setNested(Decision decision) {
		        if (_nested != null) {
		            _nested.add(decision);
		        } else {
		            _nested = new ArrayList<Decision>();
		        }
		    }
		
		    public void setText(String value) {
		        _text = value;
		    }
		
		}
		'''
	}
	
	
	def void generateRulesFile(Rules rules, IFileSystemAccess2 fsa){
		fsa.generateFile("Rules.java",generateRules(rules))
	}
	
	def generateRules(Rules rules) {
		'''
		public class Rules {
			«IF rules.left instanceof RuleTypeInt »public int «ELSE»public String «ENDIF» _left;
			«IF rules.right!==null» 
			«ELSE»	
					«IF rules.operator instanceof GreaterThan» «generateRuleGraterThan(rules)»
					«ELSEIF rules.operator instanceof LessThan» «generateLessThan(rules)»
					«ELSEIF rules.operator instanceof GreaterEqual»«generateGreaterEqual(rules)»
					«ELSE» «generateLessEqual(rules)»
					«ENDIF»
			«ENDIF»
			«IF rules.points!=0»public int _points«ENDIF»
		}
		
		'''
	}
	
	def generateLessEqual(Rules rules) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def generateGreaterEqual(Rules rules) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def generateLessThan(Rules rules) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def generateRuleGraterThan(Rules rules) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	def void display(EObject obj){
		val res = new XMLResourceImpl
		res.contents.add(EcoreUtil::copy(obj))
		System::out.println("Dump of model:")
		res.save(System.out,null)
	}

//	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//
//		val test = resource.allContents.
//		
//
//	}
//	
//	
//	def CharSequence generateInput(Input input) {
//		var start = '''
//		
//		public class Input {
//		
//		    private «input.getValue.getType» «input.getValue.getName»;
//		
//		    public type get«input.getValue.getName»() {
//		
//		        return «input.getValue.getName»;
//		
//		    }''';
//		    
//		    start = start + '''test''';
//		    
//		return start;
//	}
	
}
