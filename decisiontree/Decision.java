package decisiontree;

import java.util.List;
import java.util.ArrayList;
public class Decision {
	
	
	 private String _accept = "accept";
	    
	    public String getAccept() {
	        return this._accept;
	    }
	  
	
	 private String _reject = "reject";
	    
	    public String getReject() {
	        return this._reject;
	    }
	  
	private Nested maybe = new Nested();
	
	public Nested getMaybe() {
	    return this.maybe;
	}
	
	public class Nested {
	    private String _maybe = "maybe";
	
	    List<String> nested_values;
	
	    public String getMaybe(){
	        return this._maybe;
	    }
	    public List<String> getNested_values(){
	                return this.nested_values;
	            } 
	
	    public Nested() {
	        nested_values = new ArrayList<>();
	        nested_values.add("get_more_credit");
	        nested_values.add("customer_account_age_too_low");
	        nested_values.add("recommend_reject");
	        nested_values.add("unsure");
	
	    }
	}
	
}
