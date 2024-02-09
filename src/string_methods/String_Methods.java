package string_methods;

public class String_Methods {

	public static void main(String[] args) {
		
		String s="Welcome to Cambodia";
		String r=new String("Welcome to Cambodia");
		System.out.println(s+" "+r);
		
		System.out.println(s.length());
		System.out.println("Phnom Penh is beautiful now".length()); /*If you don't have any String variable*/
		
		String lastName = "Chhay";
		String firstName = "Sokoeurn";
		String cityName = "Dallas";
		System.out.println(lastName.concat(" "+firstName).concat(" "+cityName));
		/* Instead of variable you can pass variable value as well*/
		System.out.println("I am studying".concat(" every moringing at early as I wake up"));

		String device="        Laptop            ";
		System.out.println("The length of device is: "+ device.length());
		System.out.println(device.trim().length());
		
		/*charAt()*/
		String t = "tables";
		System.out.println(t.charAt(3));
		System.out.println(t.charAt(5));
		
		/*contains()*/
		String m="Microwave";
		String n="cro";
		System.out.println(m.contains(n));
		System.out.println(m.contains("m"));
		System.out.println(n.contains("o"));
		
		/*equals(), equalsIgnoreCase()*/
		String greeting = "welcome";
		String wel = "welcome";
		System.out.println(greeting.equals(wel));
		System.out.println(greeting==wel);
		System.out.println(greeting.equals("Welcome"));
		System.out.println(greeting.equalsIgnoreCase("Welcome"));
	}

}
