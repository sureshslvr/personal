package wrapperclassesex;

import java.util.Scanner;

//WAP to add the sum of digits present in the given String 
//i/p: java1qsp2
//o/p:3
public class W5 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		String s=scan.next();
		
		sumOfDigits(s);
	}

	private static void sumOfDigits(String s) {
		int sum=0;
		for (int i = 0; i <s.length(); i++) {
			String s1=""+s.charAt(i);
			if(Character.isDigit(s1.charAt(0))) {
				int k=Integer.parseInt(s1);
				sum=sum+k;
			}
		}
		System.out.println("the sum of digits present in given string is: "+sum);
		
	}

}
