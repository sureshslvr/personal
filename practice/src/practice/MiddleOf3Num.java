package practice;

import java.util.Scanner;

public class MiddleOf3Num {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		/*
		if ((i<j && i>k )||(i>j && i<k ) ) {
			System.out.println(i+" is middle value");
		}
		else if ((j<i && j>k )||(j>i && j<k ) ) {
			System.out.println(j+" is middle value");
		}
		else if((k<j && k>i )||(k>j && k<i ) ) {
			System.out.println(k+" is middle value");
		}
		*/
		
		if((b<a && a<c) || (c<a && c<b)) {
			System.out.println(a);
		}
		else if((a<b && b<c) || (c<b && b<a)) {
			System.out.println(b);
		}
		else
			System.out.println(c);
	}

}
