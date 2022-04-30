package stringpractisce;

// WAP to remove the given character from the given string
import java.util.Scanner;

public class RemoveCharFromString {
	
		static Scanner scan = new Scanner(System.in);

		public static void main(String[] args) {
			System.out.println("enter string");
			String s = scan.nextLine();
			char c=scan.next().charAt(0);
			String str = "";
			for (int i = 0; i < s.length(); i++) {
					if (!(s.charAt(i) == c)) {
						str = str + s.charAt(i);
					}
			}

			System.out.println(str);
		}
}
