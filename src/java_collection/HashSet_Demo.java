package java_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		/*How to create HashSet
		 * HashSet hs = new HashSet(); //default capacity is 16, loadfactor/ fill ration is 0.75
		 * HashSet hs2 = new HashSet(100); //initial capacity is 100%
		 * HashSet hs3 = new HashSet(100, (float)0.90); //loadfactor is 90%
		 * 
		 * For Homogeneous data type:
		 * HashSet<String> hs4 = new HashSet<String>();
		 * 
		 * */ 
		
		/*Heterogeneous data type, order is not preserve, no duplicate values, null allowed*/
		HashSet hs = new HashSet();
		hs.add("SC");
		hs.add(true);
		hs.add(5);
		hs.add(null);
		hs.add('A');
		hs.add(10.13);
		hs.add(1);
		hs.add(10);
		hs.add(100);
		
		/*insertion order does not maintain*/
		System.out.println(hs);
		System.out.println(hs);
		
		/*get() a specific value, no index concept because it does not maintain order, so no index*/
		hs.remove('A');
		System.out.println(hs);
		
		/*contains()-search for specific value, will return boolean value*/
		System.out.println(hs.contains('A'));
		System.out.println(hs.contains("SC"));
		
		for(Object e:hs) {
			System.out.println(">>>"+e);
		}
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println("=>"+it.next());
		}
		
		System.out.println(hs);
		
		HashSet hs2 = new HashSet();
		hs2.add(1);
		hs2.add(10);
		hs2.add(100);
		hs2.add(1.12);
		hs2.add("Sarom");
		
		hs2.addAll(hs);
		System.out.println(hs2);
		
//		hs2.removeAll(hs2);
//		System.out.println(hs2);
		
		/*union is unique object, because HashSet can't store duplicate object so union is already come with*/
		hs2.addAll(hs);
		System.out.println("The union result is : "+hs2);
		
		/*intersection is common object in HashSet1 and HashSet2*/
		/*retainAll() - means get the the common object in HashSet1 and HashSet2*/
		
		hs2.retainAll(hs);
		System.out.println("The intersection result is: "+hs2);
		
		hs.removeAll(hs2);
		System.out.println("The different"+hs);
		
		System.out.println(hs2.containsAll(hs));
		
	
	}

}
