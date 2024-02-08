package array_single_dimension;

public class Array_Multi_Dimensions {

	public static void main(String[] args) {
		
		int a[][]=new int[3][2];		/*first bracket is for row[3] and sencod bracket is for colum[2]*/
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;

		a[2][0]=500;
		a[2][1]=600;
		
		for(int r=0;r<=2;r++) {
			for(int c=0;c<=1;c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		
		
		
		int b[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println(b.length);	/*will return the length of the row*/
		System.out.println(b[0].length);	/*will alway return number of columns*/
		
		/* Read each value in the row and coloum*/
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		
		for(int row=0;row<b.length;row++) {
			for(int column=0;column<b[row].length;column++) {
				System.out.print(b[row][column]+" ");
			}
			System.out.println();
		}
		
		for(int rowx[]:b) {
			for(int columnx:rowx) {
				System.out.println(columnx);
			}
			
		}

	}

}
