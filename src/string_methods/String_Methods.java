package string_methods;

import java.util.Arrays;

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
		
		/*replace() for char and String*/
		String o="own a beutiful house in country side";
		System.out.println(o.replace('o', 'i'));
		System.out.println(o.replace("house", "home"));
		
		/*substring(index0, index+1) - extract sub portion from the main string*/
		String name="sokoeurn";
		System.out.println(name.substring(0,3));
		System.out.println(name.substring(3,8));
		System.out.println(name.substring(2,4));
		
		/*toUpperCase() or toLowerCase()*/
		String honey="Kosal Im";
		System.out.println(honey.toUpperCase());
		System.out.println(honey.toLowerCase());
		
		String userEmail = "sokeourn.chhay@gmail.com";
		String[] email = userEmail.split("@");	/* it becomes array now*/
		System.out.println(Arrays.toString(email));
		System.out.println(email[0]);
		System.out.println(email[1]);
		
		/*Now useremail have changed*/
		userEmail="sc@gmail.com";
		String un[]=userEmail.split("@");
		System.out.println(un[0]);
		System.out.println(un[1]);
		
		String money="$15,23.87";
		System.out.println(money.replace("$", ""));
		System.out.println(money.replace("$", "").replace(",", "").replace(".", ""));
		
		String randomEmail = "abc,123@gmail.com";
		String[] rE = randomEmail.split(",");
		System.out.println(Arrays.toString(rE));
		String[] splitrE = rE[1].split("@");
		System.out.println(Arrays.toString(splitrE));
		
		System.out.println(rE[0]);
		System.out.println(splitrE[0]);
		System.out.println(splitrE[1]);
		
		/*split("dilimeter" but you can't use some special symbols: * % ^ ( ) - */
		
		
		
		
	}

}
