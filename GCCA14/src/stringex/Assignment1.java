package stringex;
//WAP to print individual characters from the string
import java.util.Scanner;

public class Assignment1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("entrer the string to print individual char");
		
		String s=scan.next();
		
		int len=s.length();
		System.out.println("the individual characters of '"+s+"' are:");
		for(int i=0;i<len;i++) {
			char ch=s.charAt(i);
			System.out.println(ch+" ");
		}
	}

}
