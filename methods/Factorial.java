//Wap to find the factorial of a number usinf the factorial method and
//display the o/p within the main(s[] args)
class Factorial
{
	public static void main(String[] args) 
	{
		System.out.println("main()");
		System.out.println(factorial(3));
	}
	public static int factorial(int i){
		int fact=1;
		for (int j=1;j<=i ;j++ )
		{
			fact=fact*j;
			
		}
		return fact;
	
	}
}
