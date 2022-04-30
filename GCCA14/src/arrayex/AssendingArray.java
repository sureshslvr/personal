package arrayex;

import java.util.Scanner;

//Wap to sort an array in assending order
//i/p:  int[] a={12,1,4,5,23,65,20}
//o/p: int[] b={1,4,5,12,20,23,65}
public class AssendingArray {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter array size");

		int size = scan.nextInt();
		System.out.println("enter array elements one by one");
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("array elements before sorting");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("array after sorting in assending order");
		sortArrayAssending(a);
		
		System.out.println();
		
		System.out.println("array after sorting in dissending order");
		sortArraydissending(a);
	}

	private static void sortArraydissending(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int temp=0;
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

	public static void sortArrayAssending(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}
