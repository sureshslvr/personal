package stringpractisce;
//WAP to find the given String is palindrome or not

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.next();
		System.out.println(checkPalindrome(s));
	}

	private static int checkPalindrome(String s) {
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			rev=s.charAt(i)+rev;
		}
		if(s.equals(rev)) 
			return 1;
		else
			return 0;
	}

}
