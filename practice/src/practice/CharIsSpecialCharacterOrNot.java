package practice;
//WAp to find the given number is 
import java.util.Scanner;

public class CharIsSpecialCharacterOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);
		
		
		if(ch>'0'&&ch<'9' ||ch>'a'&&ch<'z' ||ch>'A'&&ch<'Z') {
			System.out.println(ch+" is not a Special character");
		}
		else
			System.out.println(ch+" is a special character");

		/*
		 *not working
		if(ch>'!'&& ch<'?' &&(!(ch>'0'&& ch<'9')))
			System.out.println(ch+" is a special character");
		else
			System.out.println(ch+" is not a special character");
		*/
	}

}
