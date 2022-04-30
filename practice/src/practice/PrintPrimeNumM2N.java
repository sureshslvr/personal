package practice;
import java.util.Scanner;
public class PrintPrimeNumM2N {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter m and n values");
		int m=scan.nextInt();
		int n=scan.nextInt();
		printNum(m,n);

	}
	static void printNum(int m, int n) {
		for (int i = m; i <=n; i++) {
			int count=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
	}

}
