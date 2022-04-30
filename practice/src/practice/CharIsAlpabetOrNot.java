package practice;

import java.util.Scanner;

public class CharIsAlpabetOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);
		if(ch>'a'&&ch<'z' ||ch>'A'&&ch<'Z') {
			System.out.println(ch+" is a alphabet");
		}
		else
			System.out.println(ch+" is not alphabet");
	}

}
