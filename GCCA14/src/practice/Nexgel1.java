package practice;

import java.util.Scanner;

/*write a program to count the numbers, number in a string and sum of the numbers in a string
Input:nexgileTechnologies123
Output:
count of the numbers is 3
Number in a string is 123
Sum of the numbers is 6
*/
public class Nexgel1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		String s=scan.next();
		countNumbers(s);
		pritnNubers(s);
		sumOfNumbers(s);
	}
	public static void sumOfNumbers(String s) {
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>'0' && s.charAt(i)<'9') {
				sum=sum+Integer.parseInt(s.charAt(i)+"");
			}
		}
		System.out.println(sum);
	}
	public static void pritnNubers(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>'0' && s.charAt(i)<'9') {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		
	}
	public static void countNumbers(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>'0' && s.charAt(i)<'9') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
