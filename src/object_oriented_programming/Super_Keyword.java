package object_oriented_programming;

class Color {
	String car = "white";
	
	void eatNoodle() {
		System.out.println("I am eating noodle");
	}
}

class Black extends Color{
	String car = "black";
	String print() {
		System.out.println(super.car);
		return super.car;
	}
	
	void eatNoodle() {
		System.out.println("I am eating rice, but not noodle");
		super.eatNoodle();
	}
}


public class Super_Keyword {

	public static void main(String[] args) {
		
		/* super is used for invoke the immediate parent class variable*/
		
		
		Black b = new Black();
		System.out.println(b.car);
		
		b.eatNoodle();
		
		b.eatNoodle();
	}

}
