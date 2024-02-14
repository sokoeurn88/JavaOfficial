package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_Streams_Demo {

	public static void main(String[] args) {
		
		/*Streams is used for processing data in collection. e.g ArrayList, LinkedList, 
		 * 
		 * Collection is group of data/ object as a single entity
		 * 
		 * Streams provide filter() and map() to process data in collection
		 * 
		 * map() take each data and update them, then put new collection
		 * 
		 * filter() filter the data in collect based on condition, then produce new collections
		 * 
		 * filter() and map() will not work directly with source data
		 * 
		 * filter() and map() are used with Lambda expression
		 * 
		 * Collection Source Data => to Streams(stream is copy of source data) => to new Collection data for your purposes.
		 * 
		 *methods use with Streams API AND new object data(collection data after processing) 
		 *collect()
		 *count()
		 *sort()
		 *distring()
		 *forEach()
		 *min()
		 *max()
		 *
		 * 
		 * */
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(15);
//		al.add(20);
//		al.add(25);
//		al.add(30);
//		al.add(35);
//		al.add(40);
		
		/*another way*/
		List <Integer> al3 = Arrays.asList(100,150,200,250,300,350,400,450);
		List<Integer> eventNumberAR = new ArrayList<Integer>();
		
		for(Integer e:al3) {
			
			if(e%2==0) {
				eventNumberAR.add(e);
			}
	
		}
		System.out.println(eventNumberAR);
		
		
		
	}
}


