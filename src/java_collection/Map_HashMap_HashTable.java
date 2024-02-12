package java_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_HashMap_HashTable {

	public static void main(String[] args) {
		
		/*Map is used for a pair of data set, which has key and value. Both key and value are objects
		 * Duplicate keys are not allowed
		 * Duplicate values are allowed
		 * Entry is key + value
		 * 
		 */
		
		/*
		 * HashMap Underlying data structure is HashTable
		 * Insertion order is not preserve
		 * No duplicate keys
		 * Duplicate values are allowed
		 * Null key is allowed only one, because if one null key plus one more null key, they become duplicate null keys, Duplicate keys are not allowed in HashMap
		 * Null values are allowed multiple times because it can have duplicate values
		 * 
		 * HashMap is use for search operation because it is fast
		 * 
		 * */
		
		HashMap hm = new HashMap();		//Heterogeneous data types
		
		hm.put(100, "Sarom");
		hm.put(102, "Nath");
		hm.put(103, "Sothy");
		hm.put(103, "Dvay");	//103 is duplicate, so value will be updated from Sothy to Davy
		hm.put(104, "Sarom");	//duplicate values are allowed.
		
		System.out.println(hm);
		
		/*get(key) will return a value*/
		System.out.println(hm.get(100));
		
		/*remove() will remove a key and value pair*/
		hm.remove(104);
		System.out.println(hm);
		
		System.out.println(hm.containsKey(100));
		System.out.println(hm.containsKey(200));
		
		System.out.println(hm.containsValue("Sarom"));
		System.out.println(hm.containsValue("Sokoeurn"));
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.keySet());	//will return key set as Set Object, because in Set, Duplications are not allowed
		System.out.println(hm.values());	// will return as Collection
		
		System.out.println(hm.entrySet());
		
		/* Read keySet one by one*/
		for(Object k:hm.keySet()) {
			System.out.println(k);
		}
		
		for(Object v:hm.values()) {
			System.out.println(v);
		}
		
		for(Object k:hm.keySet()) {
			System.out.println(k+"="+hm.get(k));
		}
		
		/*Map Interface has Entry Interface, which is used to entry(key+value)
		 * Entry Interface is implemented by some methods
		 * */
		
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();		//Strick key = integer, value=String
		hm2.put(1, "Student01");
		hm2.put(2, "Student02");
		hm2.put(3, "Student03");
		
		for(Entry<Integer, String> entry:hm2.entrySet()) {
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}
		
		for(Map.Entry entry:hm2.entrySet()) {
			System.out.println(entry.getKey()+"<=="+entry.getValue());
		}
		
		
		/*Iterator()*/
		Set es = hm.entrySet();
		Iterator it = es.iterator();
		while(it.hasNext()) {
			Map.Entry itNext = (Map.Entry) it.next();
			System.out.println(itNext.getKey()+"***"+itNext.getValue());
		}
		
		

	}

}
