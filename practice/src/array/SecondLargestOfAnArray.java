package array;


import java.util.*;
import java.util.Arrays;

public class SecondLargestOfAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		Integer[] arr=new Integer[size];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("original Array");
		for (int i : arr) {
		System.out.print(i+" ");	
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("Array after sorting");
		for (int i : arr) {
		System.out.print(i+" ");	
		}
		System.out.println();
		
		System.out.println("the second largest element of given array is: "+arr[arr.length-2]);
		
		System.out.println("Array in descending oder");
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i : arr) {
		System.out.print(i+" ");	
		}
		System.out.println();
	}

}
