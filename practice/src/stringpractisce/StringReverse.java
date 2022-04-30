package stringpractisce;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to get reverse of the string");
		String s=sc.nextLine();//nextLine() will Accept multiple strings
		revString(s);//method calling stmt	
	}
	//logic to reverse a string
	private static void revString(String s) {							//ex:hel
		String rev="";												
		for (int i = 0; i < s.length(); i++) {						//rev=h+"";   //"h"
			char ch=s.charAt(i);									//rev=e+"h";  //"eh"
			rev=ch+rev;												//rev=l+"eh";  //"leh"
		}
		System.out.println(rev);
	}

}
