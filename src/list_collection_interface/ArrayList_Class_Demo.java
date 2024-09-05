package list_collection_interface;
import java.util.ArrayList;

public class ArrayList_Class_Demo {
	public static void main(String[] args) {
		//Types of ArrayLists
		ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
		ArrayList<Object> arrayList1 = new ArrayList<Object>();
		
		ArrayList<String> arrayList = new ArrayList<String>();	//ArrayList Class implements List Interface. should add data type to ArrayList. ArrayList is dynamic in size.
		
		arrayList.add("Sarom");		//all the class(ArrayList, LinkedList, Vector) implemments List can accept duplicate values.
		arrayList.add("Sarom");
		arrayList.add("Sarom");
		arrayList.add("Sarom");
		arrayList.add("Sarom");
		arrayList.add("Nath");
		arrayList.add(0, "Ksatra"); 	//adding element by index
		arrayList.add(1, "Nitha");
		arrayList.add(2, "Lida");
		System.out.println(arrayList);
		
		arrayList.remove(0);
		arrayList.remove("Nitha");
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(0));
		
		boolean namePresent = arrayList.contains("Sarom");//check if the String contains in ArrayList
		System.out.println(namePresent);
		
		boolean namePresent1 = arrayList.contains("Ksatra");
		System.out.println(namePresent1);
		
		System.out.println(arrayList.indexOf("Nath"));
		System.out.println(arrayList.indexOf("Ksatra"));

		System.out.println(arrayList.isEmpty());
		
		System.out.println(arrayList.size());
		

	}

}
