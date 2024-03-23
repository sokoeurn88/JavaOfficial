package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Class {
	
	public static void main(String[] args) {
		
		// Map => HashMap
		//data store in key and value pair
		//key is unique, values can be duplicates
		//indexing is now allowed.
		
		HashMap hm = new HashMap();
		hm.put(001, "sok");
		hm.put(001, "sok");
		hm.put(001, "sok");
		hm.put(002, "kosal");
		hm.put(002, "kosal");
		hm.put(003, "sarom");
		hm.put(004, "nath");
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		//access key
		System.out.println(hm.get(001));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		//replacement values
		hm.put(011, "chhay");
		System.out.println(hm);
		
		
		//no index so no for loop.
		for(Object e: hm.keySet()) {
			System.out.println(e+" "+hm.get(e));
		}
		
		
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty()) ;
		
		
		
	}

}
