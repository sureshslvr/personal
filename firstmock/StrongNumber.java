//WAP to check whether the number is strong number or not,if only the given number is odd number and if the number given is even print the number given is even
import java.util.Scanner;
//Name: Siliveru.Suresh
//phno: 9704552577
//email: sureshslvr@gmail.com
class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		if(num%2==1){
			strongNumber(num);
		}
		else{
			System.out.println("given number is even");
		}

	}
	public static void strongNumber(int num){
		int rem,n=num,sum=0,fact;
		while(num>0){
			rem=num%10;
			fact=1;
			for (int i=1;i<=rem ;i++ ){
				fact=fact*i;
			}
			num=num/10;
			sum=sum+fact;
		}
		if(n==sum)
			System.out.println("num is strong number");
		else
			System.out.println("num is not a strong number");
	}


}
