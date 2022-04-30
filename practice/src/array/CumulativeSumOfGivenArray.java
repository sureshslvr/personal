package array;
import java.util.Scanner;
public class CumulativeSumOfGivenArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[sc.nextInt()];//takig array size from console
		for (int i =0;i<a.length;i++) {
			a[i]=sc.nextInt();	//inserting array elements		
		}
		cumulativeSum(a);
	}
	//logic
	private static void cumulativeSum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			System.out.println(sum);
		}
		
	}

}
