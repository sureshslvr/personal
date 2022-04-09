//wap to find the sum of sqares of the individual numbers
//i/p:121
//o/p: 1^2+2^2+1^2=6

class Assignment200420201
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		sumOfSqares(121);
		sumOfSqaresOdd(122);
		reverse(234);
	}
	public static void sumOfSqares(int num){
		int rem,sum=0,sqare,rev;
		while(num!=0){
		rem=num%10;
		sqare=rem*rem;
		sum+=sqare;
		num=num/10;
		}
		System.out.println(sum);
	}

//wap to find the sum of  sqares of the individual odd digits of a number
//i/p:121
//o/p:1^2+1^2=2

	public static void sumOfSqaresOdd(int num){
		int rem,sum=0,sqare;
		
		while(num!=0){
		rem=num%10;
		if(rem%2!=0){
			sqare=rem*rem;
			sum+=sqare;
		}
		num=num/10;
		}
		System.out.println(sum);
	}

//wap program to reverse the given number
//i/p: 234
//o/p: 432
	public static void reverse(int num){
		int rem,rev=0,sum=0;
		
		while(num!=0){
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		System.out.println(rev);
		while(rev!=0){
			rem=rev%10;
			sum=rem*rem;
			rev=rev/10;

		}
		System.out.println(sum);
	}	


}
