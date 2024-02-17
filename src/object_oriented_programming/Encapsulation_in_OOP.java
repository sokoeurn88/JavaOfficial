package object_oriented_programming;

public class Encapsulation_in_OOP {
	
	/*How to auto generate getter and setter method for private variable. Put cursor close to private variable => Source => Generate getter and setter. */
	
	private int accountNo;
	private String name;
	private double amount;
	private int debt;
	
	/* To access this private variable in the main class 
	 *we need to use getter() and setter() */
	
	void setDebt(int debt) {
		this.debt=debt;
	}
	
	int getDebt() {
		return debt;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	int getAccountNo() {
		return(accountNo);
	}

}
