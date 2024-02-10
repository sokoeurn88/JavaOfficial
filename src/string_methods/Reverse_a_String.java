package string_methods;

public class Reverse_a_String {

	public static void main(String[] args) {
		
		/* length(), charAt()*/
		
		String greeting = "Welcome";
		String rev = "";
		for(int i=greeting.length()-1;i>=0;i--) {
			rev=rev+greeting.charAt(i);
		}
		System.out.println("Reverse string is : "+ rev);
		
		/*toCharArray()*/
		String name ="Sokoeurn Chhay";
		char charName[]=name.toCharArray();
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+charName[i];
		}
		System.out.println("The reverse String is : "+reverse);
		
		/* String is immutable. it means it can't be changed*/
		String s = "Welcome";
		String st = new String("Welcome");
		
		/* StringButter and StringBuilder are mutable. mutable means it can changed*/
		StringBuffer sb = new StringBuffer("Home");
		System.out.println(sb.reverse());	/*StringBuffer has a revere() method in build in*/
		sb.append(" is peacefull place");
		System.out.println(sb);		/*mutable*/
		
		StringBuilder sbu= new StringBuilder("house");
		System.out.println(sbu.reverse());	/*StringBuilder is mutable*/
		sbu.append(" is like a Mason");
		System.out.println(sbu);
		
		/*String is immutable becasue any methods apply to String will not change the original values*/
		String device = new String("Laptop");
		System.out.println(device);
		
		device.concat("is portable");
		System.out.println(device); 	/*immutable can't change value from Laptop to Laptop is portable eventhough we concat the value*/
		
		String dp = device.concat(" is porttable");
		System.out.println(dp);		/*mutable can changed the original value but it need to store in a new variable called dp*/
		
	}

}
