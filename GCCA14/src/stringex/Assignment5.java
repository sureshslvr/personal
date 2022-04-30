 package stringex;
//WAP to check whether the given String is palindrome or not
import java.util.Scanner;
public class Assignment5 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter String to check palindrome? ");
		String s=scan.next();
		String temp="";
		//reverse the string
		for (int i=s.length()-1;i>=0;i--) {
			temp=temp+s.charAt(i);
		}
		//compare the states of the object
		if(s.equals(temp))
			System.out.println("the given sring is palindrome");
		else
			System.out.println("the given String is not palindrome");

	}

}
