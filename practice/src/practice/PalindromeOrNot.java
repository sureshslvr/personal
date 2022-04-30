package practice;

import java.util.Scanner;

public class PalindromeOrNot {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter number");
		int a = sc.nextInt();
		int temp=a;
		int rev = 0;
		while (a > 0) {
			int rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		if(temp==rev)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
	}
}

