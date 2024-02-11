package java_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		
		/*Hetrogeneous data types*/
//		ArrayList rl = new ArrayList();
		
		
		/*Homogeneous data type*/
//		ArrayList <Integer> al2 = new ArrayList<Integer>();
		
		
		/*Homogeneous data type*/
//		ArrayList <String> al3 = new ArrayList<String>();
		
		/*Hetrogeneous data types, the default size is 10*/ 
		ArrayList al = new ArrayList();
		
		al.add("Sokoeurn");
		al.add(20);
		al.add(true);
		al.add(12.30);
		al.add('B');
		System.out.println(al);
		
		al.add(0,"Kosal"); 	/*add to a specific index*/
		System.out.println(al); 
		
		/*size()*/
		System.out.println(al.size());
		
		/*remove- by index or by Object o*/
		System.out.println(al.remove(0));
		System.out.println(al);
		
		System.out.println(al.remove("Sokoeurn"));
		System.out.println(al);
		
		/*get(index) sepecific element*/
		System.out.println(al.get(3));
		
		/*set(index, Object o)-change/ replace*/
		al.set(3, 'A');
		System.out.println(al);
		
		/*contains(Object o)-search for element, will return true/ false*/
		System.out.println(al.contains(12.30));
		
		/*isEmpty()-check for object in arraylist, will return true/ false*/
		System.out.println(al.isEmpty());
		
		/*Reading object in ArrayList*/
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
//			System.out.println(i); // will get only index, if you have index you can get object by al.get(index)
		}
		
		for(Object x:al) {
			System.out.println(x);
		}
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
