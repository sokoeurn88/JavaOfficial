package object_oriented_programming;

public class Students_Main {

	public static void main(String[] args) {
		
		Students stu = new Students();
		stu.sid=201;
		stu.sname="Ksatra Chay";
		stu.sgrade='A';
		stu.printData();
		
		System.out.println();
		
		Students stu2 = new Students();
		stu2.sid=301;
		stu2.sname="Nitha Chhay";
		stu2.sgrade='A';
		stu2.printData();

	}

}
