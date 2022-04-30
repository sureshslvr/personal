/**
 *Find Max Difference


Write a program to find the maximum difference between two adjacent numbers in an array of positive integers.


Note:

You are expected to write code in the findMaxDifference function only which will receive the first parameter as the number of items in the array and second parameter as the array itself. You are not required to take input from the console.


Example

Finding the maximum difference between adjacent items of a list of 5 numbers


Input

5

10 11 7 12 14


Output

4


Explanation

The first parameter (5) is the size of the array. Next is an array of integers. The difference between the integers 11 and 7 is 4 which is maximum compared to any other adjacent numbers in the list as follows:

10-11=-1

11-7=4

7-12=-5

12-14=-2
 */
package techm;

import java.util.Scanner;

public class FindMaxDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter aray size");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findMaxDiff(arr,size));
	}

	static int findMaxDiff(int arr[],int n)
	{
		int max=0;
		for(int i=0;i<n-1;i++)
			if(arr[i]-arr[i+1]>max)
				max=arr[i]-arr[i+1];
				
		return max;
	}
}
