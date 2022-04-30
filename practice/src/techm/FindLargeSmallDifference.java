package techm;

import java.util.Scanner;

public class FindLargeSmallDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter aray size");
		int[] arr=new int[sc.nextInt()];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maxDiff(arr));
	}
	//Find Large Small Difference
	static int maxDiff(int arr[]) {
		int max_diff =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] > max_diff)
					max_diff = arr[j] - arr[i];
			}
		}
		return max_diff;
	}

}
