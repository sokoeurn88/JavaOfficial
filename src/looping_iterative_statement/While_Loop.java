package looping_iterative_statement;

public class While_Loop {

	public static void main(String[] args) {

		int i = 1;
		while(i<=20) {
			System.out.println(i);
//			i++;
			i+=2;
		}
		
		int j = 1;
		while(j<=10) {
			System.out.println("Sokoeurn Chhay");
			j++;
		}
		
		int k = 2;
		while(k<=10) {
			System.out.println(k);
			k+=2;
		}
		
		int l = 1;
		while(l<=10) {
			if(l%2!=0) {
			System.out.println(l);
			}
			l++;
		}
		
		int m = 1;
		while(m<=10) {
			if(m%2==0) {
				System.out.println(m + " is event number");
			} else {
				System.out.println(m+ " is odd number");
			}
			m++;
		}

	}

}
