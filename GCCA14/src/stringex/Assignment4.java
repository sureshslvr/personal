package stringex;
//WAP to reverse the given string
import java.util.Scanner;
public class Assignment4 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter String to reverse: ");
		String s=scan.next();
		System.out.println("the reversed String is: ");
		//reverse the String 
		String str="";
		for (int i=0;i<s.length();i++) {
			str=s.charAt(i)+str;
		}
		System.out.println(str);

	}

}
