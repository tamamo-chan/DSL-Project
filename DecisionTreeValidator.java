/*
 * generated by Xtext 2.25.0
 */
package sdu.mmmi.tamamo.validation;


import org.eclipse.xtext.validation.Check;

import sdu.mmmi.tamamo.decisionTree.DecisionTreePackage;
import sdu.mmmi.tamamo.decisionTree.Input;
import sdu.mmmi.tamamo.decisionTree.RuleType;
import sdu.mmmi.tamamo.decisionTree.RuleTypeID;
import sdu.mmmi.tamamo.decisionTree.RuleTypeInt;
import sdu.mmmi.tamamo.decisionTree.Rules;
import sdu.mmmi.tamamo.decisionTree.Start;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class DecisionTreeValidator extends AbstractDecisionTreeValidator {

	@Check
	public void checkNoIntBool(Rules rule) {

		if (rule.getLeft() instanceof RuleTypeInt) {
			if (rule.getRight() == null) {
				error("Int cannot be the only parameter.", rule.eContainingFeature(), DecisionTreePackage.RULES__LEFT);
			}
		}
	}

	@Check
	public void checkNotBothArgumentsInts(Rules rule) {
		if (rule.getLeft() instanceof RuleTypeInt && rule.getRight() instanceof RuleTypeInt) {
			error("Please rewrite expression to an Input and an integer", rule.eContainingFeature(),
					DecisionTreePackage.RULES__LEFT);
		}
	}
	@Check
	public void checkInputExist(Start start) {
		Input input = start.getInput();
		Rules rule = start.getRules();

		HelperMethod(rule, input);

		while ((rule = rule.getNext()) != null) {
			HelperMethod(rule, input);
		}
	}

	private void HelperMethod(Rules rule, Input input) {

		RuleType left = rule.getLeft();
		boolean error = true;

		if (left instanceof RuleTypeID) {

			String rule_name = ((RuleTypeID) left).getName();

			if (input.getValue().getName().equals(rule_name)) {
				error = false;
			}

			while ((input = input.getNext()) != null && error) {
				if (input.getValue().getName().equals(rule_name)) {
					error = false;
				}
			}
			if (error) {
				error("Rule name is not part of the input.", rule, rule.eContainingFeature(),
						DecisionTreePackage.RULES__LEFT);
			}

		}

		RuleType right = rule.getRight();
		if (right instanceof RuleTypeID && !error) {
			String rule_name = ((RuleTypeID) right).getName();

			if (input.getValue().getName().equals(rule_name)) {
				error = false;
			}

			while ((input = input.getNext()) != null && error) {
				if (input.getValue().getName().equals(rule_name)) {
					error = false;
				}
			}
			if (error) {
				error("Rule name is not part of the input.", rule, rule.eContainingFeature(),
						DecisionTreePackage.RULES__RIGHT);
			}

		}
	}

}