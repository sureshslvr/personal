//wap to find the fibonacci series upto 100.
// 0 1 1 2 3  5 8 13...
class Fibonacci
{
	public static void main(String[] args) 
	{
		fibonacci();
	}
	public static void fibonacci(){
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2+" ");
		while(true){
			n3=n1+n2;
			if(n3<100)
				System.out.print(n3+" ");
			else
				break;
			n1=n2;
			n2=n3;
			
		}

	}
}
