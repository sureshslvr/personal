//Wap to check whether the given number is a prime number or not
import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
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
			System.out.println(num+" is a prime num");
		}
		else{
			System.out.println(num+" is not a prime num");
		}
	}
}