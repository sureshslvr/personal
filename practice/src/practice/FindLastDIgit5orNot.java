package practice;

import java.util.Scanner;

//Wap to find the last digit of a given num is 5 or not
public class FindLastDIgit5orNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value");
		int a=scan.nextInt();
		if(a%10==5) {
			System.out.println(a+" is have last digit 5");
		}
		else
			System.out.println(a+" is not have last digit 5");
	}

}
