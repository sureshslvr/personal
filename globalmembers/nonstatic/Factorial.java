
class Factorial 
{
	public static void main(String[] args) 
	{
		int num=5;

		System.out.println(fact(num));
	}
	public static int fact(int num){
		int n=1;
		for(int i=1;i<=num;i++)
		{
			n=n*i;
		}
		return n;	
	}

}
