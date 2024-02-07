package looping_iterative_statement;

public class While_Loop_Without_Condition {

	public static void main(String[] args) {
		int i = 1;
		while(true) {
			System.out.println("Hello" + i);
			i++;
			if(i==10) {
				break;
			}
		}

	}

}
