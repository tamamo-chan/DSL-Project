package decisiontree;

import java.util.ArrayList;
import java.util.List;
public class Conclusion {
	
	Decision decision = new Decision();
	Parameter param = new Parameter();
	
	public List<String> begin(Input input) {
		
		Rules rule = new Rules(input, param);
		List<String> nested = new ArrayList<>();
		
		String response = rule.setupRules();
		
		if (response != null) {
			nested.add(response);
			return nested;
		}
	
		if (param.getGood() > 70) {
			nested.add(decision.getAccept());
			return nested;
		}
		
		if (20 > param.getGood() ) {
			nested.add(decision.getReject());
			return nested;
		}
		
		if (param.getGood() <= param.getBad() ) {
			nested.add(decision.getReject());
			return nested;
		}
		
		// Nested code
		
		if ( param.getGood() > 55 ) {
			for (String s : decision.getMaybe().nested_values) {
				if (s.equals("get_more_credit")) {
					nested.add(s);
				}
			}
		}
		
		if ( param.getGood() < 45 ) {
			for (String s : decision.getMaybe().nested_values) {
				if (s.equals("recommend_reject")) {
					nested.add(s);
				}
			}
		}
		
		if ( param.getBad() > 0 ) {
			for (String s : decision.getMaybe().nested_values) {
				if (s.equals("recommend_reject")) {
					nested.add(s);
				}
			}
		}
		
		if (nested.size() < 1) {
			nested.add("unsure");
		}
		
		return nested;
		
		
	}
}
