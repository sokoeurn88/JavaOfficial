package wrapper_class;

public class Wrapper_Class {

	public static void main(String[] args) {
		
		String s = "welcome";
		System.out.println(s);
		
		//ca't convert to int
//		Integer.parseInt(s);
		System.out.println(s);
		
		
		String t = "10";
		String u = "20";
		System.out.println(Integer.parseInt(t)+Integer.parseInt(u));
		
		String a = "10.50";
		String b = "20.50";
		System.out.println(Double.parseDouble(a)+Double.parseDouble(b));
		
		String c = "selenium";
		Boolean.parseBoolean(c);
		System.out.println(c);
		
		//convert any data type to String
		int d = 10;
		double e = 5.5;
		char f = 's';
		boolean g = true;
		
		String h = String.valueOf(a);
		
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(e));
		System.out.println(String.valueOf(f));
		System.out.println(String.valueOf(g));
		System.out.println(h);
		
		

	}

}
