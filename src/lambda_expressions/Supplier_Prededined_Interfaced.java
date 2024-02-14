package lambda_expressions;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_Prededined_Interfaced {

	public static void main(String[] args) {
		/*
		 * Review
		 * 
		 * Predicate<take input t> ------------------------->return true/ false
		 * Function<take input t, return output t>---------->take input / return output
		 * Consumer<take input t>--------------------------->take input/ no return
		 * Supplier<return output t>------------------------>no take input/ return output
		 * 
		 * 
		 * */ 
		
		Supplier<Date> sp = ()-> new Date();
		System.out.println(sp.get());

	}

}
