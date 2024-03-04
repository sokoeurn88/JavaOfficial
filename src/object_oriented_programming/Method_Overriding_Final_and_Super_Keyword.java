package object_oriented_programming;

class Bank{
	double getRate() {
		return 0;
	}
}

class BankBranch1 extends Bank{
	double getRate() {
		return 10.50;
	}
}

class BankBranch2 extends Bank{
	
	double getRate() {							/*overriding concepts*/
		return 11.50;
	}
	
	double getRate(double d, double e) {		/*overloading concept*/
		return d+e;
	}
}

public class Method_Overriding_Final_and_Super_Keyword {

	public static void main(String[] args) {
		
		Bank bn = new Bank();
		System.out.println(bn.getRate());
		
		BankBranch1 bn1 = new BankBranch1();
		System.out.println(bn1.getRate());
		
		BankBranch2 bn2 = new BankBranch2();
		System.out.println(bn1.getRate());
		
		double dd = bn2.getRate(100.50, 200.50);
		System.out.println(dd);
		
		/*final can apply for variable, method, class*/
		
		
		
	}

}
