package java_collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable_Demo {

	public static void main(String[] args) {
		/*Hashtable
		 * is synchronized means one thread allowed to access HashTable one at a time, other one will wait
		 * is thread safe
		 * perform poor or low
		 * no null key and value
		 * not preserved insertion order
		 * underlying data structure is Hashtable using HashCode technology
		 * 
		 * 
		 * 
		 *HashMap is non-synchronized means multiple threads are allowed 
		 * is not thread safe
		 * perform faster
		 * allow one null key, 
		 * allow multiple duplicate value
		 * underlying data structure is HashTable
		 */
		Hashtable ht = new Hashtable();		//default capacity is 11, load factor or fill ratio is 0.75
		Hashtable ht2 = new Hashtable(/*initialize capacity*/); //custom capacity can be 90 or 80
		Hashtable ht3 = new Hashtable(/*capacity, loadfactor*/);
		
		Hashtable<Integer, String> ht4 = new Hashtable<Integer, String>(); //homogeneous data type
		ht4.put(001, "Laptop");
		ht4.put(002, "Books");
		ht4.put(003, "Pens");
		ht4.put(003, "Penciles");
//		ht4.put(null, "Pencils"); //NullPointerException
//		ht4.put(004, null); //NullPointerException
		
		System.out.println(ht4);
		System.out.println(ht4.get(001));
		System.out.println(ht4.values());
		
		System.out.println(ht4.remove(001));
		System.out.println(ht4);
		
		System.out.println(ht4.contains("Books"));
		System.out.println(ht4.contains("Tables"));
		
		System.out.println(ht4.containsKey(002));
		System.out.println(ht4.containsKey(006));
		
		System.out.println(ht4.isEmpty());
		
		System.out.println(ht4.keySet()); //will return Set
		System.out.println(ht4.values()); //will return Collection
		
		for(Integer ks:ht4.keySet()) {
			System.out.println(ks+" "+ht4.get(ks));
		}
		
		for(Entry<Integer, String> ets:ht4.entrySet()) {
			System.out.println(ets.getKey()+"=>"+ets.getValue());
		}
		
		Set es = ht4.entrySet();
		Iterator itEntry = es.iterator();
		while(itEntry.hasNext()) {
			Map.Entry entry = (Entry) itEntry.next();
			System.out.println(entry.getKey()+" =====> "+entry.getValue());
		}
		
		

	}

}
