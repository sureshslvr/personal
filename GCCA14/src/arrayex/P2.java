package arrayex;

import java.util.Scanner;

//Wap to create an doublearray of size 5 and insert all the elements
//and copy the elements into the new array and display the elements
//from the new array
public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		Double[] d = new Double[size];

		System.out.println("enter the elements one by one");

		for (int i = 0; i <= size-1 ; i++) {
			d[i] = sc.nextDouble();
		}

		Double[] d1 = new Double[size];

		for (int j = 0; j <= size - 1; j++) {
			d1[j] = d[j];
		}

		for (int i = 0; i <= size - 1; i++) {
			System.out.println(d1[i]);
		}
	}
}
