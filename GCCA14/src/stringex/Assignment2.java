package stringex;
//WAP to convert the first character of the String in Uppercase and remaing in the lowercase
import java.util.Scanner;
public class Assignment2 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("entrer the string to Convert");
		
		String s = scan.next();
		
		String temp="";
		temp=(s.charAt(0)+"").toUpperCase();
		for(int i=1;i<s.length();i++) {
				temp=temp+(s.charAt(i)+"").toLowerCase();
			
		}
		System.out.print(temp);
	

}
}
