//WAP to find the transpose of  A matrix
package arrayex;
import java.sql.SQLOutput;
import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class P6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter matrix size");
		int row=scan.nextInt();
		int column=scan.nextInt();
		char[][] s= new char[row][column];
		
		//to scan and store the values in matrix
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length;j++) {
				System.out.print("enter value of"+i+j);
				s[i][j]=scan.next().charAt(0);
			}
		}
		
		
		System.out.println("matrix");
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length;j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//transpose of a matrix
		System.out.println("transpose of above matrix");
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length;j++) {
				System.out.print(s[j][i]+" ");
			}
			System.out.println();
		}
	}

}
