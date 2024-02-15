package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class filter_method {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(10,20,30,40,50,15,25,35,45);
		List<Integer> eventL = new ArrayList<Integer>();
		
		for(Integer ev:l) {
			if(ev%2==0) {
				eventL.add(ev);
			}
		}
		System.out.println(eventL);
		
		
		/*using streams, Predicate Interface also use */
		eventL = l.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(eventL);
		
		/*Consumer Interface take in input "n", and no return*/
		l.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		l.stream().filter(n->n%2==0).forEach(System.out::println);
		
		List<String> names=Arrays.asList("Sarom","Nath","Sothy","Davay","koy","Sokeurn");
		List<String> longNames = new ArrayList<String>();
		
		longNames = names.stream().filter(str->str.length()>=4 && str.length()<=8).collect(Collectors.toList());
		System.out.println(longNames);
		
		/*directly print name*/
		names.stream().filter(str->str.length()>=5 && str.length()<=7).forEach(str->System.out.println(str));
		
		names.stream().filter(str->str.length()>=6 && str.length()<=8).forEach(System.out::println);
		
		/*Example*/
		List<String> nature = Arrays.asList("Forest",null,"Tree","Mountain","Lakes",null);
		List<String> natNew = nature.stream().filter(nat->nat!=null).collect(Collectors.toList()); /*after stream, we store in new arraylist*/
		System.out.println(natNew);
	}

}
