package practice;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		primeNum(num);
	}

	private static void primeNum(int num) {
		// TODO Auto-generated method stub
		int count=0,i=1;
		while(i<=num){
			if(num%i==0)
				count++;
			i++;
		}
		if(count==2)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");
	}

}
