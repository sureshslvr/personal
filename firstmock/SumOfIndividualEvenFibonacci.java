//Wap to find the sum of individual numbers in the fibonacci series upto 100 using recursion.
class SumOfIndividualEvenFibonacci
{
//Name: Siliveru.Suresh
//phno: 9704552577
//email: sureshslvr@gmail.com
	public static void main(String[] args) 
	{
		
		int sum=fibonacci(0,1);
		System.out.println(sum);

	}
	static int sum=0;
	public static int fibonacci(int n1,int n2){
		int c=n1+n2;
		if(c<100){
			if(c%2==0){
				sum=sum+c;
			}
		fibonacci(n2,c);
		}
		return sum;

	}

}