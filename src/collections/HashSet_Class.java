package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Class {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		Set s = new HashSet();
		HashSet <String> hs2 = new HashSet<String>();
		
		//insert order is not preserved
		//duplicate is not allowed
		//multiple null is not allowed
		
		hs.add("sok");
		hs.add(10);
		hs.add(20.20);
		hs.add(null);
		hs.add(null);
		hs.add("sok");
		hs.add(true);
		hs.add("sok");
		hs.add("sok");
		System.out.println(hs);
		System.out.println(hs.size());
		
		//insert is not poosible
		// accessing specific element is not possible
		
		//covert HashSet inot ArrayList
		ArrayList al = new ArrayList(hs);
		System.out.println(al.get(2));
		
		for(Object e: hs) {
			System.out.println(e);
		}
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(">>>>>>>>>>>>"+it.next());
		}
		
		hs.clear();
		System.out.println(hs.isEmpty());

	}

}
