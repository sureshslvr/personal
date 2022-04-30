/** 
 * Odd Even Difference
Write a program to return the difference between the sum of odd and even numbers from an array of positive integers.
Note:

You are expected to write code in the findOddEvenDifference function only which will receive the first parameter as the number of items in the array and the second parameter is the array itself. You are not required to take input from the console

Example:

Finding the difference between the sum of odd-even numbers from a list of 5 numbers


Input

5

10 11 7 12 14

Output

-18

Explanation

Sum of Odd - Sum of Even => 18-36 = -18

 * 
 */
package techm;

import java.util.Scanner;

public class OddEvenDifference {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter aray size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(findOddEvenDiff(size,arr));
	}
	//logic
	static int findOddEvenDiff(int n,int arr[])
	{
	    int odd=0,even=0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]%2==0)
	            even+=arr[i];
	        else
	            odd+=arr[i];
	    }
	    return odd-even;
	}

}
