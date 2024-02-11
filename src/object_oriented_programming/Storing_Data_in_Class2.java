package object_oriented_programming;

public class Storing_Data_in_Class2 {
	
	public static void main(String args[]) {
		
//		Storing_Data_in_Class sdc= new Storing_Data_in_Class();
		Storing_Data_in_Class sdc= new Storing_Data_in_Class("Ngoun", 5, 5); //invoke constructor
		
		//calling printFamily with constructor parameter
		sdc.printFamily();
		
		sdc.familyName="Chhay";
		sdc.brother=3;
		sdc.sister=4;
		
		sdc.printFamily();
		
		System.out.println();
		
		/*call method getFamily*/
		sdc.getFamily("Sarom", 7, 6);
		sdc.printFamily();
		
		
		/*Class have a contructor
		 * Constructor is a method, but method name must be same as class name
		 * Contructor is never return a value
		 * no need to write even void 
		 * can take parameters
		 * 
		 * How to call constructor
		 * 
		 * invoke when object creation
		 * Storing_Data_in_Class sdc= new Storing_Data_in_Class();
		 * if it needs parameter, must provide at the time of invocation
		 * 
		 * 
		 * */
		
		
		
		
		
	}
	

}
