package decisiontree;

public class Rules {
	Parameter param = null;
	Input input = null;
	Decision decision = new Decision();
	
	public Rules(Input input, Parameter param) {
		this.input = input;
		this.param = param;
	}
	
	
	public String setupRules() {
		
		if ( input.getCredit() > 6000 ) {
			param.setGood(param.getGood() + 50);
		}
		
		if ( input.getCredit() > 5000 ) {
			param.setGood(param.getGood() + 6);
		}
		
		if ( input.getPrevious_loans()  ) {
			return decision.getReject();
		}
		
		if ( input.getCredit() <= 199 ) {
			param.setGood(param.getGood() - 10);
		}
		
		if ( input.getAccount_age() < 5 ) {
			param.setBad(param.getBad() + 10);
		}
		
		if ( input.getNumber_accounts() > 3 ) {
			param.setGood(param.getGood() + 10);
		}
		
		if ( 10000 < input.getCredit() ) {
			param.setGood(param.getGood() + 30);
		}
		
		if ( input.getCEO()  ) {
			return decision.getAccept();
		}
		
		
		
		
		
		
		
		
		
		
		return null;
	}
}

