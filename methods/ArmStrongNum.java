//WAp to find the given number is amstrong number or not
import java.util.Scanner;
class  ArmStrongNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int num=sc.nextInt();
		System.out.println(armStrong(num));
			
	}
	public static void armStrong(int num){
		int rem,sum=0,n=num,count=0;
		while(num>0){
			rem=0;
			rem=num%10;
			count++;
			num=num/10;
		}
		
			if (sum==n)
			System.out.println("given num is amstrong num");
			else
			System.out.println("given num is not amstrong num");
	}
	public static int 
}
 