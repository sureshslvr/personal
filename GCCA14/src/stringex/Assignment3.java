package stringex;

//WAP to check how many digits in the String
import java.util.Scanner;


public class Assignment3 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter String");
		String s=scan.next();
		int count=0;
		//
		for(int i=0;i<s.length();i++) {
			//to check the digit
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				count++;
			}
		}
		System.out.println(count);
	}
	

}
