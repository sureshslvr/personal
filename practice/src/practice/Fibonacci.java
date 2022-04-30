package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a and b values of sereis");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("enter ending num of series");
		int n=scan.nextInt();
		series(a,b,n);

	}

	private static void series(int a,int b,int n) {
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(true) {
			int c=a+b;
			if(c<=n) {
				System.out.print(c+" ");
				a=b;b=c;
			}
			else {
				break;
			}
		}
		
	}

}
