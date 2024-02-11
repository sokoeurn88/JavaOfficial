package object_oriented_programming;

public class Method_Types {
	
	public static void main(String args[]) {
		
		/*Methods is groups of statements that perform certain tasks
		 * Methods are called through object
		 * Methods can be
		 * 
		 * No parameter no return value
		 * No parameter return value
		 * Parameter no return value
		 * Parameter return value
		 * 
		 * void is for return type.
		 * void means nothing
		 * 
		 * */
		
		/*To invoke greeting method*/
		Method_Types2 mt= new Method_Types2();
		mt.greeting();
		
		String name = mt.call();//if method return some data, need variable to store data from method.
		System.out.println(name);
		System.out.println(mt.call());
		
		mt.giveName("Sarom"); //Parameter needs to pass
		
		int ageNow = mt.getAge(36);
		System.out.println(mt.getAge(36));
		System.out.println(ageNow);
	}

}
