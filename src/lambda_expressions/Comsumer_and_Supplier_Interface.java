package lambda_expressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class ExEmployee{
	String name;
	int salary;
	String gender;
	ExEmployee(String name, int salary, String gender){
		this.name=name;
		this.salary=salary;
		this.gender=gender;
	}
}

public class Comsumer_and_Supplier_Interface {

	public static void main(String[] args) {
		/*Comsumer Interface takes an input, but does not return any value
		 * Comsumer Interface has one method is accept()
		 * 
		 * 
		 * Supplier Interface does not take an input, but it return some value
		 * Supplier Interface has one method is get()
		 * */ 
		
		Consumer <String> c = s->System.out.println(s);
		c.accept("Sokoeurn");
		
		ArrayList<ExEmployee> al = new ArrayList<ExEmployee>();
		al.add(new ExEmployee("Sarom",30000,"Male"));
		al.add(new ExEmployee("Nath",40000,"Femal"));
		al.add(new ExEmployee("Sothy",50000,"Female"));
		al.add(new ExEmployee("Koy",60000,"Male"));
		al.add(new ExEmployee("Davy",70000,"Female"));
		
		//Calculate bonus of employee
		Function<ExEmployee, Integer> f = cal->(cal.salary*10)/100;
		
		//find bonus greater than 5000 or not
		Predicate<Integer> p = b->b>=5000;
		
		//Print the details of employee
		Consumer<ExEmployee> con = pemp->{
			System.out.println(pemp.name+" "+pemp.salary+" "+pemp.gender);
		};
		
		for(ExEmployee alobj:al) {
			Integer bonus = f.apply(alobj); /*plug alobj into Function method is apply(), will return Integer bonus*/
			
			if(p.test(bonus)) {/*plug bonus into Predicate method is test(), will return true/ false*/
				
				con.accept(alobj); /*invoke Consumer Interface*/
				System.out.println("Employee bonus is: "+ bonus);
			}; 
			
			
		}
		
		
		
		
		
				
	}

}
