package lambda_expressions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Job{
	String name;
	int salary;
	
	/*used constructor to initilize the value
	 * "this" key word is used when class variable name same as constructor variable name
	 */
	
	/*constructor's name same as class name, constructor body same as method format (){}
	 * 
	 */
	
	Job(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
}

public class Function_Interface_with_Object_as_Argument {

	public static void main(String[] args) {
		
		ArrayList<Job> arrJob = new ArrayList<Job>();
		arrJob.add(new Job("Ranuth", 50000));
		arrJob.add(new Job("Sarom",100000));
		arrJob.add(new Job("Davy",80000));
		arrJob.add(new Job("Nika",40000));
		arrJob.add(new Job("Srun",30000));
		
		/*Function interface take <anyargumenttype, returnanyargumenttype>*/
		Function<Job, Integer> fn = e->{
			int sal = e.salary;
			if(sal>20000 && sal<=30000) {
				return(sal*10/100);
			} else if(sal>30000 && sal <=40000) {
				return(sal*20/100);
			} else if(sal>40000 && sal<=50000) {
				return(sal*30/100);
			} else {
				return(sal*40/100);
			}
		};
		
		Predicate<Integer> p = b->b>5000;
		
		for(Job j:arrJob) {
			int bonus = fn.apply(j);	/*using Function Interface*/
			
			if(p.test(bonus)) { /*using Predicate Interface*/
				System.out.println(j.name+" "+j.salary+" "+bonus);
			}; 
			
			
		}

	}

}
