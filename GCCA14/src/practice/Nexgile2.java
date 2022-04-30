package practice;

import java.util.Scanner;

/*In the given rang of numbers how many 2&#39;s are there
Input:0-35
Output:14
*/
public class Nexgile2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int count = count2S(n);
		System.out.println(count);
	}

	public static int count2S(int n) {
		int count1 = 0;
		for (int i = 1; i < n; i++) {
			String s = "";
			s += String.valueOf(i);

			for (int k = 0; k < s.length(); k++) {
				if (s.charAt(k) == '2') {
					count1++;
				}
			}

		}
		return count1;

	}
}
