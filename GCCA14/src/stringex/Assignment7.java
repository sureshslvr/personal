package stringex;

import java.util.Scanner;

//wap to remove the duplicate values from the given srting without using indexOf()
public class Assignment7 {
	static Scanner scan = new Scanner(System.in);

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

		System.out.println(str);
	}
}
