package stringpractisce;

import java.util.Scanner;

public class PrintTheDuplicateCharInString {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String s = scan.next();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = i; j >= 0; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count>1) {
					str = str + s.charAt(i);
			}
		}
		System.out.println(str);
		String str1="";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i; j >= 0; j--) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count==1) {
					str1 = str1 + str.charAt(i);
			}
		}
		System.out.println(str1);

	}
}
