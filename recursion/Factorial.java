import java.util.Scanner;
class  Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("factorial of "+num+" is "+fact(num));
		
	}
	public static int fact(int num){
		if(num!=0)
			num=num*fact(num-1);
		else
			num=1;
		return num;
	}
}
