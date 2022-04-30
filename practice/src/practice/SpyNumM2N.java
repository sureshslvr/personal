package practice;

import java.util.Scanner;

public class SpyNumM2N {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter >2 digits number of m and n  ");
		int m = scan.nextInt();
		int n = scan.nextInt();
		spyNum(m, n);

	}

	private static void spyNum(int m, int n) {
		for (int i = m; i <= n; i++) {
			int sum = 0, product = 1;
			int num = i;
			while (num > 0) {
				int rem = num % 10;
				sum += rem;
				product *= rem;
				num /= 10;
				
			}
			if (sum == product) {
				System.out.print(i + " ");
			}
			
		}
	}

}
