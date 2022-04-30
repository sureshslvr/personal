package stringpractisce;
// Wap to remove all duplicates from a given string?


import java.util.Scanner;

public class RemoveDuplicatesFormString {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.next();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = i; j >= 0; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}

			}
			if (count == 1) {
				str = str + s.charAt(i);
			}
		}

		System.out.println(str);
	}

}
