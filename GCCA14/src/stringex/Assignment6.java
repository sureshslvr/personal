package stringex;

import java.util.Scanner;

//wap to remove the duplicate characters form the given String indexOf()
//i/p:java
//o/p:jav
public class Assignment6 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter string");
		String s=scan.next();

		String s1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
				if(s1.indexOf(ch)==-1) {
					
					s1=s1+ch;
				}
		
		}
		
		System.out.println(s1);
	}
}
