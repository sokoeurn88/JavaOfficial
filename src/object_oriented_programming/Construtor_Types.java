package object_oriented_programming;

public class Construtor_Types {
	
	int x;
	int y;
	
	Construtor_Types(){
		x=100;
		y=200;
	}
	
	Construtor_Types(int a, int b){
		x=a;
		y=b;
	}
	
	void sum(){
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		/*Parameterize contructor*/
		Construtor_Types ct = new Construtor_Types(15,20);
		ct.sum();
		
		/*default constructor*/
		Construtor_Types ct1 = new Construtor_Types();
		ct1.sum();
		
		
		

	}

}
