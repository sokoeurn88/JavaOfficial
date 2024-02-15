package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int salary;
	Employee(int id, String name, int salary){
		this.id=id;
		this.name = name;
		this.salary = salary;
	}
}

public class Java_Streams_with_map_method {

	public static void main(String[] args) {

		List<String> vechicles = Arrays.asList("car","motor bike", "bikecycle", "taxi", "train");
		List<String> newVechi = new ArrayList<String>();
		
		/*Simple way before Java 8*/
		for(String v:vechicles) {
			newVechi.add(v.toUpperCase());
		}
		System.out.println(newVechi);
		
		/*using stream with map() method and Consumer Predefined Interface*/
		newVechi = vechicles.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
		System.out.println(newVechi);
		
		/*find the length*/
		vechicles.stream().map(v->v.length()).forEach(len->System.out.println(len));
		vechicles.stream().map(v->v.length()).forEach(System.out::println);
		
		/*Eample2*/
		List<Integer> li = Arrays.asList(2,3,4,5,6);
		List<Integer> newLI = li.stream().map(n->n*4).collect(Collectors.toList()); /*after stream add to new List*/
		System.out.println(newLI);
		
		li.stream().map(n->n*3).forEach(printn->System.out.println(printn)); /*print individual values*/
		
		/*Before Java 8*/
		List<Integer> li2 = new ArrayList<Integer>();
		for(Integer n:li) {
			System.out.println("==>"+n*5);
			/*if u want to add to new collection*/
			li2.add(n*10);	
		}
		System.out.println(li2);
		
		/*Using stream -> map() ->lambda expression*/
		li2 = li.stream().map(n->n*100).collect(Collectors.toList());
		System.out.println(li2);
		
		/*if u don't want to store in new collection*/
		li.stream().map(n->n*200).forEach(System.out::println);
		li.stream().map(n->n*300).forEach(neach->System.out.println(neach));
		
		/*Using filter() and map()*/
		List<Employee> employ = Arrays.asList(new Employee(100, "Dara", 50000),
				new Employee(200, "Chantha",40000),
				new Employee(300, "Sarom",60000)); /*direct add new Employee object*/
		/*Create new collection to data as Integer after stream*/
		List<Integer> emsal = employ.stream().filter(e->e.salary>=50000).map(e->e.salary).collect(Collectors.toList());
		System.out.println(emsal);

}
}
