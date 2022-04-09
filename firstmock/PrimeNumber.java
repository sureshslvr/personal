//Wap to check whether a given number is prime or not. 
import java.util.Scanner;
//Name: Siliveru.Suresh
//phno: 9704552577
//email: sureshslvr@gmail.com
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		
		primeNum(num);
	}

	public static void primeNum(int num){
		int count=0;
		for (int i=num;i>=1;i-- )
		{
			if (num%i==0)
				count++;
			
		}
		if(count==2){
			System.out.println("prime number");
		}
		else{
			System.out.println("not a prime number");
		}
	}
}