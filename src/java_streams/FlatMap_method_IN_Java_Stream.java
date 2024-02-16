package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int id;
	char grade;
	/*student contructor to instanciate the paramether*/
	Student(String name, int id, char grade){
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	public void name() {
		// TODO Auto-generated method stub
		
	}
}

public class FlatMap_method_IN_Java_Stream {

	public static void main(String[] args) {
		
		/*flatmap() can take single argument or collection and stream then to other collections
		 * 
		*/
		
		List<Integer> li1 = Arrays.asList(1,2);
		List<Integer> li2 = Arrays.asList(3,4);
		List<Integer> li3 = Arrays.asList(4,5);
		
		List<List<Integer>> finallist = Arrays.asList(li1,li2,li3);
		
		List<Integer> lastlist = finallist.stream().flatMap(n->n.stream()).collect(Collectors.toList());
		
		/*if you want to apply some operations*/
		List<Integer> secondlastlist = finallist.stream().flatMap(n->n.stream().map(e->e*2)).collect(Collectors.toList());
		
		System.out.println(lastlist);
		System.out.println(secondlastlist);
		
		List<String> player1 = Arrays.asList("Sraom","Nath","Sothy");
		List<String> player2 = Arrays.asList("Koy","Davy","Sokoeurn");
		List<String> player3 = Arrays.asList("Liday","Nitha","Ksatra");
		
		List<List<String>> finalplayer = new ArrayList<List<String>>();
		finalplayer.add(player1);
		finalplayer.add(player2);
		finalplayer.add(player3);
		
		/*Before Java 8*/
		for(List<String> eachfp:finalplayer) {
			for(String eachname:eachfp) {
				System.out.println(eachname);
			}
		}
		
		/* Using stream() flatmap(). Remember: flatmap() take collction as argument and add stream in Lambda expression*/
		List<String> finalpname = finalplayer.stream().flatMap(finalp->finalp.stream()).collect(Collectors.toList());
		System.out.println(finalpname);
		
		
		List<Student> liststudent = new ArrayList<Student>();
		liststudent.add(new Student("Nyka",1,'A'));/*add object student directly*/
		liststudent.add(new Student("Pich",2,'B'));
		
		List<Student> liststudent2 = new ArrayList<Student>();
		liststudent2.add(new Student("Vatana",3,'C'));
		liststudent2.add(new Student("Srun",4,'D'));
		
		List<List<Student>> finalliststudent = Arrays.asList(liststudent,liststudent2);
		
		/*Before Java 8*/
		for(List<Student> eachliststudent:finalliststudent) {
			for(Student eachstudentname:eachliststudent) {
				System.out.println(eachstudentname.name);
			}
		}
		
		/*using stream and flatMap()*/
		List<String> lastfls = finalliststudent.stream().flatMap(colstudentlist->colstudentlist.stream().map(sn->sn.name)).collect(Collectors.toList());
		System.out.println(lastfls);
		
		
	}

}
