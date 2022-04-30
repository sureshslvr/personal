package practice;
//write a function to print 1 if given string is palindrome else print 0
import java.util.Scanner;

public class IfStringISPalindrome0Else1 {

		static Scanner scan=new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("enter String to check palindrome? ");
			String s=scan.next();
			checkPalindrome(s);
		}
		private static void checkPalindrome(String s) {
			String temp="";
			//reverse the string
			for (int i=s.length()-1;i>=0;i--) {
				temp=temp+s.charAt(i);
			}
			//compare the states of the object
			if(s.equals(temp))
				System.out.println("1");
			else
				System.out.println("0");

		}
	}
