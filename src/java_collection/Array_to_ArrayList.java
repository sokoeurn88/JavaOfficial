package java_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_to_ArrayList {

	public static void main(String[] args) {

		String vichecal[]= {"sedan","SUV","Crossover","Pickup"};
		for(String v:vichecal) {
			System.out.println(v);
		}
		
		/*Convert String Array to ArrayList*/
		ArrayList vhc= new ArrayList(Arrays.asList(vichecal));
		System.out.println(vhc);

	}

}
