package practice;

import java.util.Scanner;

//swap 2 num using third variable
public class P1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a value");
		int a=input.nextInt();
		System.out.println("enter b value");
		int b=input.nextInt();
		int c=a;
		a=b;
		b=c;
		
		System.out.println("variables after swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
