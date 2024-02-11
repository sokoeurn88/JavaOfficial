package java_collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_in_Java {

	public static void main(String[] args) {
		
		/*Heterogeneous data type, no default size*/
		LinkedList ll = new LinkedList();
		ll.add("Laptop");
		ll.add("Laptop");
		ll.add("Pen");
		ll.add(null);
		ll.add(2);
		ll.add('B');
		ll.add("true");
		ll.add("20.30");
		System.out.println(ll);
		System.out.println(ll.size());
		
		ll.add(0,"Java");
		ll.add(4,"Java");
		System.out.println(ll);
		
		System.out.println(ll.get(4));
//		System.out.println(ll.get("Java")); //can't be used in LinkedList
		
		System.out.println(ll.remove(4));
		System.out.println(ll);
		
		System.out.println(ll.remove("Java"));
		System.out.println(ll);

		ll.set(3, "Python");
		System.out.println(ll);
		
		System.out.println(ll.contains("Python"));
		System.out.println(ll.contains("C#"));
		
		System.out.println(ll.isEmpty());
		
		
		for(int i=0;i<ll.size();i++) {
			System.out.println("=>"+ll.get(i));
		}
		
		for(Object e:ll) {
			System.out.println("**"+e);
		}
		
		Iterator itLL = ll.iterator();
		while(itLL.hasNext()) {
			System.out.println(">>"+itLL.next());
		}
		
		LinkedList studyTools = new LinkedList();
		studyTools.add("pen");
		studyTools.add("Laptop");
		studyTools.add("books");
		studyTools.add("adjustable table");
		studyTools.add("Monitor");
		studyTools.add("Internet");
		System.out.println(studyTools);
		
		LinkedList copyStudyTools = new LinkedList();
		copyStudyTools.addAll(studyTools);
		System.out.println(copyStudyTools);
		
//		copyStudyTools.removeAll(copyStudyTools);
//		System.out.println(copyStudyTools);
		
		/*sort() only has in Collections class, sort() can be done with same data type*/
		Collections.sort(copyStudyTools);
		System.out.println(copyStudyTools);
		
		/*reverse() only has in Collections class, reverse() can be done with same data type*/
		Collections.reverse(copyStudyTools);
		System.out.println(copyStudyTools);
		
		Collections.shuffle(copyStudyTools);
		System.out.println(copyStudyTools);
		
		
		
		
	}

}
