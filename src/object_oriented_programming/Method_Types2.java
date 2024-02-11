package object_oriented_programming;

public class Method_Types2 {
	
	/*No return no parameter*/
	void greeting(){
		System.out.println("Hello all friends");
	}
	
	/* No parameter, return value*/
	String call() {
		//return("call sokoeurn");
		return"call sokoeurn";
	}
	
	/*Parameter, no return value*/
	void giveName(String name) {
		System.out.println("The given name is: "+name);
	}
	
	/*Parameter, and return value*/
	int getAge(int age) {
		return age;
	}

}
