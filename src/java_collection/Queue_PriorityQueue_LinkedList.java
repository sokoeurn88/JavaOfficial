package java_collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_PriorityQueue_LinkedList {

	public static void main(String[] args) {
		
		/*used for Homogeneous data type, used for when element prior to processing, insertion order preserved, duplication is allowed
		 * */
		PriorityQueue pq = new PriorityQueue();
		pq.add('a');
		pq.add('b');
		pq.add('b');
		pq.add('c');
		pq.offer('s');
		pq.offer('s');
		System.out.println(pq);
		
		/*element() and peek() are for get head element if the PriorityQueue is not empty,
		 * if PriorityQueue is empty, then element() will return exception
		 * if PriorityQueue is empty, them peek() will return null */ 
		System.out.println(pq.element());
		System.out.println(pq.peek());
		
		/*poll() and remove() are for getting a head element and remove it from PriorityQueue if PriorityQueue is not empty
		 * if PriorityQueue is empty, remove() will return exception
		 * if PriorityQueue is empty, poll() will return null
		 * */
		System.out.println(pq.remove());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		for(Object x:pq) {
			System.out.println(x);
		}
		
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println("=>"+it.next());
		}
		
		
		
		
		

	}

}
