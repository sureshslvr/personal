package practice;

import java.util.Scanner;

public class FindLargestUsingIfElse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 7 values one one by one");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int e=scan.nextInt();
		int f=scan.nextInt();
		int g=scan.nextInt();
		
		if(a>b&&a>c&&a>d && a>e && a>f &&a>g) {
			System.out.println(a);
		}
		else if(b>c&&b>d && b>e && b>f&&b>g) {
			System.out.println(b);
		}
		else if(c>d && c>e && c>f&&c>g) {
			System.out.println(c);
		}
		else if(d>e && d>f &&d>g) {
			System.out.println(d);
		}
		else if(e>f && e>g) {
			System.out.println(e);
		}
		else if(f>g) {
			System.out.println(f);
		}
		else
			System.out.println(g);
		

	}

}
