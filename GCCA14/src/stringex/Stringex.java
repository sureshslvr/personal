package stringex;

import java.util.Scanner;

public class Stringex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}

		for (int i = 0; i < s1.length; i++) {

			String str = s1[i];
			String rev = "";
			for (int j = 0; j < str.length(); j++) {
				rev = str.charAt(j) + rev;
			}
			System.out.print(rev + " ");

		}
		System.out.println();
		//
		for (int i=s1.length-1; i>=0; i--) {

			String str = s1[i];
			String rev = "";
			for (int j = 0; j < str.length(); j++) {
				rev = str.charAt(j) + rev;
			}
			System.out.print(rev + " ");

		}
	}

}
