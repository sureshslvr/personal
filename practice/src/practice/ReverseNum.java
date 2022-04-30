package practice;

//Wap to reverse a number
import java.util.Scanner;

public class ReverseNum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter number");
		int a = sc.nextInt();
		int rev = 0;
		while (a > 0) {
			int rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		System.out.println(rev);
	}

}
