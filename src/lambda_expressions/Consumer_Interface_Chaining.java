package lambda_expressions;

import java.util.function.Consumer;

public class Consumer_Interface_Chaining {

	public static void main(String[] args) {
		
		Consumer<String> cs = st->System.out.println(st+" is Cambodian American");
		Consumer<String> cs2 = st->System.out.println(st+" is current working at DCS in Dallas");
		Consumer<String> cs3 = st->System.out.println(st+" is married to Old School friend, she is cambodian");
		
		cs.andThen(cs2).andThen(cs3).accept("Sokoeurn");
		
		/*another way of chaining Consumer Interface*/
		Consumer<String> cs4 = cs.andThen(cs2).andThen(cs3);
		cs4.accept("Sokoeurn Chhay");

	}

}
