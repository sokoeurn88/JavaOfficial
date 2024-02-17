package java_streams;

import java.util.Arrays;
import java.util.List;

class StudentPlayer{
	String name;
	int score;
	/*Create constructor student*/
	StudentPlayer(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
}

public class Parallel_Stream_in_Java {

	public static void main(String[] args) {
		
		List<StudentPlayer> studentList = Arrays.asList(
				new StudentPlayer("Dara",80),
				new StudentPlayer("Vatana",90),
				new StudentPlayer("Vatana",90),
				new StudentPlayer("Vatana",90),
				new StudentPlayer("Srun",70),
				new StudentPlayer("Johny", 99)
				);
		
		/* Using stream() - sequential stream*/
		studentList.stream().filter(n->n.getScore()>=80).limit(4).forEach(e->System.out.println(e.getName()+" "+e.getScore()));
		
		/* Covert sequential stream() to parallel stream() by using parallel() method*/
		studentList.stream().parallel().filter(n->n.getScore()>=90).limit(2).forEach(e->System.out.println("===>"+e.getName()+" "+e.getScore()));
		
		/* Using parallel stream- parallel stream will create multi streams for operation, it give results faster*/
		studentList.parallelStream().filter(n->n.getScore()>=70).limit(3).forEach(e->System.out.println("***"+e.getName()+" "+e.getScore()));


	}

}
