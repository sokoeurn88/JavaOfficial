package object_oriented_programming;

public class Passing_Parameters_to_Main_Method {

	public static void main(String[] args) { 		/*String[] args is String Array passing as argument*/
		
		System.out.println(args.length);
		
		for(String value:args) {
			System.out.print(value+" ");
		}
		
		/*
		How to pass argument to String[] args
		
		Right click in eclipse working space
		Then click Run AS
		Then Run Configurations
		Then click argument
		Then Program argument
		*/

	}

}
