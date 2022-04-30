package practice;

import java.util.Scanner;

public class DivisibleBy7 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter numb to check divisible by 7");
		int a=scan.nextInt();
		String res=(a%7==0)?(a+" divisible by 7"):(a+" not divisible by 7");
		System.out.println(res);
	}

}
