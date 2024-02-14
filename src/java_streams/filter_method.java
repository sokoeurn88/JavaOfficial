package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		
		
		/*using streams*/
		eventL = l.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(eventL);
		
	}

}
