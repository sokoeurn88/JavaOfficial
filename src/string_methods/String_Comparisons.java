package string_methods;

public class String_Comparisons {

	public static void main(String[] args) {
		
		String name = "Sokoeurn";
		String name1 = "Sokoeurn";
		
		System.out.println(name==name1);
		System.out.println(name.equals(name1));
		
		/* == is used to compare object, but equals() is used to compare the value of object
		new means greate new object e.g lastName is an object for value chhay
		and lastName1 is another object for value chhay.
		*/
		String lastName = new String("chhay");
		String lastName1 = new String("chhay");
		System.out.println(lastName);
		System.out.println(lastName1);
		
		System.out.println(lastName==lastName1);	/*compare object lastName is not lastName1*/
		System.out.println(lastName.equals(lastName1));  /*compare value chhay is same as chhay*/
		
		String cup1 = "Marble Cup";
		String cup2 = new String("Marble Cup");
		String cup3=cup2;
		
		System.out.println(">>>"+(cup1==cup2));
		System.out.println(cup1.equals(cup2));
		System.out.println(cup1==cup3);
		System.out.println(cup1.equals(cup3));
	
		
		
		

	}

}
