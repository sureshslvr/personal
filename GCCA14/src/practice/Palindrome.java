package practice;

import java.util.Scanner;

public class Palindrome {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int n=scan.nextInt();
		palindrome(n);
	}

	public static void palindrome(int num) {
		int rem, rev = 0, n = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == n) {
			System.out.println("num is palindrome");
		} else {
			System.out.println("num is not a palindrome");
		}
	}

}
