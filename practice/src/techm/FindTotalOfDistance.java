/** 
 * FindTotalDistance
Write a program to return the difference between the sum of distances b/w the adjacent numbers in an array of positive integers.
Note:

You are expected to write code in the findTotalDistance function only which will receive the first parameter as the number of items in the array and the second parameter is the array itself. You are not required to take input from the console

Example:

Finding the total distance b/w adjacent of a list of 5 numbers


Input

5

10 11 7 12 14

Output

12

Explanation
10-11=1
11-7=4
7-12=5
12-14=2

total distance= 1+4+5+2=12
 * 
 */
package techm;

import java.util.Scanner;

public class FindTotalOfDistance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter aray size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(findTotalDistance(n,arr));
	}
	//logic
	static int findTotalDistance(int n,int arr[])
	{
	    int total=0;
	    for(int i=0;i<n-1;i++)
	    {	int temp=0;
	    	if(arr[i]>arr[i+1])
	    		temp=arr[i]-arr[i+1];
	    	else
	    		temp=arr[i+1]-arr[i];
	    	total+=temp;
	    }
	    return total;
	}

}
