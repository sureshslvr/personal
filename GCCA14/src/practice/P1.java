package practice;
//Write a Java Program to swap two numbers without using the third variable.
import java.util.Scanner;
public class P1 {
	static Scanner scan=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("enter a and b values to be swapped");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("numbers before swapping");
		System.out.println("a: "+a+" "+"b: "+b);
		
		a=a+b;//4+5=9
		b=a-b;//9-5=4
		a=a-b;//9-4=5
		
		System.out.println("numbers before swapping");
		System.out.println("a: "+a+" "+"b: "+b);
	}

}
