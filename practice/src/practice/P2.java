package practice;

import java.util.Scanner;

//swap 2 num without using third variable
public class P2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a value");
		int a=input.nextInt();
		System.out.println("enter b value");
		int b=input.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("variables after swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
