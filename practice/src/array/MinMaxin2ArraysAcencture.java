package array;

import java.util.Scanner;

public class MinMaxin2ArraysAcencture {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter len1 for arr1");
		int len1=sc.nextInt();
		int[] arr1= new int[len1];
		
		System.out.println("enter arr1 elements ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter len2 for arr2");
		int len2=sc.nextInt();
		int[] arr2= new int[len2];
		System.out.println("enter arr2 elements ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("enter k value");
		int k= sc.nextInt();
		
		int result=minMaxInTwoArrays(arr1,arr2,len1,len2,k);
		System.out.println(result);

	}

	private static int minMaxInTwoArrays(int[] arr1,int[] arr2,int len1,int len2,int k) {
		int count1=0,count2=0;
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]>k) {
				count1++;
			}
		}
		for (int j = 0; j < arr2.length; j++) {
			if(arr2[j]<k) {
				count2++;
			}
		}
		/*if(count1>count2) {
			return count2;
		}
		else{
			return count2;
		}*/
		return count1;
	}

}
