package stringex;

import java.util.Scanner;

//Wap to find the no of occurences of every character in the string
//i/p: mummy
//o/p: occurence of m is: 3
public class Assignment8 {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter string");
		String s = scan.next();
		String s1 = s;
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = i; j >= 0; j--) {
				if (s.charAt(i) == s1.charAt(j)) {
					count++;
				}

			}
			if (count == 1) {
				str = str + s.charAt(i);
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if(str.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			System.out.println("ocuurence of "+str.charAt(i)+" is: "+count);
		}
		
	
	}
}
