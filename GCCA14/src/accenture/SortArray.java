package accenture;

import java.util.Scanner;

//Given a list of the array, sort the array in descending order with the frequency of elements.
public class SortArray {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter array size");
		int size = scan.nextInt();
		int[] a = new int[size];
		int[] b = new int[size];
		System.out.println("enter elements for a[] one by one:");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		// to sort the array in descending order
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		// to sort the array in asscending order
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
