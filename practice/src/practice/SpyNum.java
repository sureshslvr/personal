package practice;

import java.util.Scanner;

//num=123
//product=1*2*3=6
//sum=1+2+3=6
//product==sum is spy num
public class SpyNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of 2 digits");
		int num=scan.nextInt();
		spyNum(num);
	}

	private static void spyNum(int num) {
		// TODO Auto-generated method stub
		int sum=0,product=1,temp=num;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			product*=rem;
			num/=10;
		}
		if(sum==product) {
			System.out.println(temp+" is a spy number");
		}
		else {
			System.out.println(temp+" is not spy number");
		}
		
	}

}
