package object_oriented_programming;

public class Encapsulation_in_OOP_Main {

	public static void main(String[] args) {

		/*Encapsulation is for security data.
		 * Encapsulation is wrapping up of data(variable) and methods into single unit(class).
		 * 
		 * Variable can't be access from out side the class even though you create class Object.
		 * e.g Animal an = new Animal();
		 * 
		 * to make variable private we use "private" key word
		 * this private variable is access through the method in the Encapsulation class only.
		 * 
		 * every private variable need to methods:
		 * setter()
		 * getter()
		 * 
		 * 
		 * Encapsulation is 
		 * all variables should be private
		 * for every variable there should be 2 methods (getter() & setter()
		 * variable can operated only through methods
		 * 
		 * */
		
		Encapsulation_in_OOP esop = new Encapsulation_in_OOP();
		esop.setAccountNo(101);
		System.out.println(esop.getAccountNo());
		
		esop.setName("Sokoeurn Chhay");
		System.out.println(esop.getName());
		
		esop.setAmount(5000);
		System.out.println(esop.getAmount());
		
		esop.setDebt(5000);
		System.out.println(esop.getDebt());

	}

}
