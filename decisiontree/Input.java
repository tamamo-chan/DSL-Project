package decisiontree;
public class Input {
	
	private int credit;
	public int getCredit() {
		return this.credit;
	}
	private int number_accounts;
	public int getNumber_accounts() {
		return this.number_accounts;
	}
	private boolean previous_loans;
	public boolean getPrevious_loans() {
		return this.previous_loans;
	}
	private int account_age;
	public int getAccount_age() {
		return this.account_age;
	}
	private boolean CEO;
	public boolean getCEO() {
		return this.CEO;
	}
	
	public Input(int credit, int number_accounts, boolean previous_loans, int account_age, boolean CEO) {
		this.credit = credit;
		this.number_accounts = number_accounts;
		this.previous_loans = previous_loans;
		this.account_age = account_age;
		this.CEO = CEO;
	}	
}
