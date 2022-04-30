package stringpractisce;

//Wap to print the given string of odd indexes values in upper, even in lower
import java.util.Scanner;

public class StringOddIndextoUpperAndLowerElse {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.next();
		String str="";
		for (int i = 0; i <=s.length()-1; i++) {
			if(i%2==0) {
				String ch=s.charAt(i)+"";
				str+=ch.toLowerCase();
			}
			else {
				String ch=s.charAt(i)+"";
				str+=ch.toUpperCase();
			}
		}
		System.out.println(str);

	}

}
