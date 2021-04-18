package decisiontree;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
    private static boolean handleBool(String s) {
         if (s.equals("true") || s.equals("1") || s.equals("True") || s.equals("TRUE")) {
             return true;
         } else {
             return false;
         }
    }
    
    public static void main(String[] args){
    
    
    	assert(args.length == 5);
    
        int credit = 0;
        try {
        	credit = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException nfe) {
        	System.out.println("The first argument must be an integer.");
        	System.exit(1);
        }
        
        int number_accounts = 0;
        try {
        	number_accounts = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException nfe) {
        	System.out.println("The first argument must be an integer.");
        	System.exit(1);
        }
        
        boolean previous_loans = handleBool(args[2]);
        
        int account_age = 0;
        try {
        	account_age = Integer.parseInt(args[3]);
        }
        catch (NumberFormatException nfe) {
        	System.out.println("The first argument must be an integer.");
        	System.exit(1);
        }
        
        boolean CEO = handleBool(args[4]);
        
    
    
        Input input = new Input(credit, number_accounts, previous_loans, account_age, CEO);
        Conclusion conclusion = new Conclusion();
        List<String> results = conclusion.begin(input);
        
        for (String s : results) {
        	System.out.println(s);
        }
    }
}  
