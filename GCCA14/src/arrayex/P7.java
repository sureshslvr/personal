//WAP to create String array with 4 elements in a seperate method and
//and print the elements in main method.
package arrayex;

import java.util.Scanner;

public class P7 {
	static Scanner scan=new Scanner(System.in);
	public static String[] stringArray() {
		System.out.println("enter  the size of array: ");
		int size=scan.nextInt();
		String[] s= new String[size];
		
		//to scan and store the values in matrix
			for(int i=0;i<s.length;i++) {
				System.out.print("enter  ele one by one");
				s[i]=scan.next();
				}
			
		return s;
	}
	public static void main(String[] args) {
		
		
		String[] s1=stringArray();
		
		System.out.println("matrix..........");
		for(int i=0;i<s1.length;i++) {
	
			 System.out.print(s1[i]+" ");
			
		}
		
	}

}
