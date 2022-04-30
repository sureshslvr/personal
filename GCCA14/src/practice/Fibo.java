package practice;

import java.util.Scanner;

public class Fibo {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=scan.nextInt();
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		
		fibonacci(n,n1,n2);
	}
	public static void fibonacci(int n,int n1,int n2){
		int n3;
		System.out.print(n1+" "+n2+" ");
		while(true){
			n3=n1+n2;
			if(n3<n)
				System.out.print(n3+" ");
			else
				break;
			n1=n2;
			n2=n3;
			
		}

	}

}
