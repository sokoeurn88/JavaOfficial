package java_collection;

import java.util.LinkedList;

public class LinkedList_Special_Methods {

	public static void main(String[] args) {
		
		LinkedList pet = new LinkedList();
		pet.add("dog");
		pet.add("cat");
		pet.add("dog");
		pet.add("puppy");
		System.out.println(pet);
		
		pet.addFirst("Chicken");
		pet.addLast("duck");
		System.out.println(pet);
		
		System.out.println(pet.getFirst());
		System.out.println(pet.getLast());
		
		System.out.println(pet.removeFirst());
		System.out.println(pet.removeLast());
		System.out.println(pet);
	}

}
