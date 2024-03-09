package access_modifier_and_packages.sub_pack;

public class access_modifiers_2 {


	public static void main(String[] args) {
		
		//Access through the object of the class
		access_modifiers_01 ac = new access_modifiers_01();
		System.out.println(ac.a);
		ac.test1();
		
		
		//when b and test2 are private. it can't be accessed.
//		System.out.println(ac.b);
//		ac.test2();
		
		
		
	}

}
