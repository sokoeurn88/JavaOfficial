package java_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	
	/*create constructor to reference the value*/
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class filter_method_with_object_data {

	public static void main(String[] args) {
		
		/*Create one collection contain Object Product. This is the reason why we create class Product*/
		List<Product> lp = new ArrayList<Product>(); /*Product type must be defined in order to add new object*/
		lp.add(new Product(1,"Dell",1200));
		lp.add(new Product(2,"Apple",1300));
		lp.add(new Product(3,"Lenovo",1000));
		lp.add(new Product(4,"Accer",900));
		
		/*filter the price condition and add to new collection*/
		List<Product> lpNew =lp.stream().filter(p->p.price>=1000).collect(Collectors.toList());
		System.out.println(lpNew);
		 
		 
		
	}

}
