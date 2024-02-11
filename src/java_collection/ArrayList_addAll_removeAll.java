package java_collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_addAll_removeAll {

	public static void main(String[] args) {
		
		ArrayList animal = new ArrayList();
		animal.add("dog");
		animal.add("cat");
		animal.add("mouse");
		animal.add("rabbit");
		animal.add("pigeon");
		
		/*copy/ add object from one ArrayList to another ArrayList*/
		ArrayList coyAnimal = new ArrayList();
		coyAnimal.addAll(animal);
		System.out.println(coyAnimal);
		
		coyAnimal.removeAll(coyAnimal);
		System.out.println(coyAnimal);
		System.out.println(animal);	//only removeAll from copyAnimal
		
		/* sort() has in collections class, not in ArrayList*/
		Collections.sort(animal);
		System.out.println(animal);
		
		/*reverse() has only in collections class, not in ArrayList*/
		Collections.reverse(animal);
		System.out.println(animal);
		
		/*shuffle() has only in collection class, not in ArrayList*/
		Collections.shuffle(animal);
		System.out.println(animal);

	}

}
