package object_oriented_programming;

public class Constructor_Polymorphism {
	
	double width, height, depth;
	
	Constructor_Polymorphism(){
		/*
		width=0;
		height=0;
		depth=0;
		*/
		
		width=height=depth=0;
	}
	
	Constructor_Polymorphism(double w, double h, double d){
		width=w;
		height=h;;
		depth=d;
	}
	
	Constructor_Polymorphism(double len){
		width=height=depth=len;
	}
	
	double volume() {
		return (width*height*depth);
	}
	

	public static void main(String[] args) {
		
		/* Constructor will be invoke when class Object is created*/
		Constructor_Polymorphism cpObject = new Constructor_Polymorphism();
		double d = cpObject.volume();
		System.out.println(d);
		
		Constructor_Polymorphism cpObject2 = new Constructor_Polymorphism(10.10,20.20,30.30);
		System.out.println(cpObject2.volume());
		
		Constructor_Polymorphism cpObject3 = new Constructor_Polymorphism(50.50);
		System.out.println(cpObject3.volume());
		
		

		

	}

}
