/**
 *Find Total Feet


Given an array of integers representing measurements in inches, write a program to calculate the total of measurements in feet. Ignore the measurements that are less than a foot (eg. 10).


Note:

You are expected to write code in the findTotalFeet function only which will receive the first parameter as the number of items in the array and the second parameter as the array itself. You are not required to take input from the console


Example:

Finding the total measurements in feet from a list of 5 numbers


Input

5

18 11 27 12 14


Output

5

Explanation

The first parameter (5) is the size of the array. Next is an array of measurements in inches. The total number of feet is 5 which is calculated as shown below:

18->1

11->0

27->2

12->1

14->1 
 */
package techm;

import java.util.Scanner;

public class FindTotalFeet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter aray size");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findTotalFeet(arr));
	}

	static int findTotalFeet(int arr[]) {
		int feet = 0;
		for (int i = 0; i < arr.length; i++) {
			feet += arr[i] / 12;
		}
		return feet;
	}
}
