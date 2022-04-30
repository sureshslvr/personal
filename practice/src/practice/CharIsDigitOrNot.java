package practice;

import java.util.Scanner;

public class CharIsDigitOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);
		if(ch>'0'&&ch<'9') {
			System.out.println(ch+" is a digit");
		}
		else
			System.out.println(ch+" is not digit");

	}

}
