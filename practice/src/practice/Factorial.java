package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		long num=scan.nextInt();
		System.out.print(fact(num));
	}

	private static long fact(long num) {
		if(num==0)
			return 1;
		else 
			return num*fact(num-1);
		
	}

}
