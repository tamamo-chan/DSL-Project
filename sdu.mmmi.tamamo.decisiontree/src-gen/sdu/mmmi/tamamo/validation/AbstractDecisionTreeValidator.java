/*
 * generated by Xtext 2.24.0
 */
package sdu.mmmi.tamamo.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDecisionTreeValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(sdu.mmmi.tamamo.decisionTree.DecisionTreePackage.eINSTANCE);
		return result;
	}
}