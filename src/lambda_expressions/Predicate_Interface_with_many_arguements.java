package lambda_expressions;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int esalary;
	int eexperience;
	
	/*Create a class constructor*/
	Employee(String name, int salary, int experience){
		ename=name;
		esalary=salary;
		eexperience=experience;
	}
}

public class Predicate_Interface_with_many_arguements {

	public static void main(String[] args) {
				
		/*Requirements: print a name of employee whose salary>30000 and experiece is more than 3 years*/
		Predicate<Employee> p = e->(e.esalary>30000 && e.eexperience>3);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Sarom",20000,2));
		al.add(new Employee("Darom",30000,3));
		al.add(new Employee("Tarom",40000,4));
		al.add(new Employee("Narom",50000,5));
		al.add(new Employee("Parom",60000,6));
		
		for(Employee e:al) {
			if(p.test(e)) {
				System.out.println(e.ename+" "+e.esalary);
			}
		}
		
		for(Employee e:al) {
			if(e.esalary>30000 && e.eexperience>3) {
				System.out.println(e.ename+" "+e.esalary);
			}
		}
		
		
		
		

	}

}
