package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Check_Exceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		/*Check exceptions can handle in two ways
		 * 
		 * using try{}catch(){}
		 * 
		 * throws 
		 * 
		 * */ 
		System.out.println("sok");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("sok");
		
		Thread.sleep(1000);
		
		System.out.println("sok");
		
		try {
		FileInputStream file = new FileInputStream("c:\\textfile.txt");
		} catch(FileNotFoundException e) {
		System.out.println("sok");
		}
	}

}
