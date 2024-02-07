package javaofficial;

public class Switch_Case {

	public static void main(String[] args) {
		/* Syntax: switch(){
		case 1: statement; */
		
		int weekno = 3;
		switch(weekno) {
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Mondday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default: System.out.println("Invalid weekno");
		}
		
		String weekname = "Wednesday";
		switch(weekname) {
		case "Sunday": System.out.println(1);break;
		case "Monday": System.out.println(2);break;
		case "Tuseday": System.out.println(3);break;
		case "Wednesday": System.out.println(4);break;
		case "Thursday": System.out.println(5);break;
		case "Friday": System.out.println(6);break;
		case "Saturday": System.out.println(7);break;
		default: System.out.println("Invalid day");
		}

	}

}
