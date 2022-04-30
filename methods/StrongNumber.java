// Wap to check weather a given number is a strong number or not
//i/p: 145
//     1!+4!+5!=145
// o/p: number is a strong number
//i/p: 12
//     1!+2!=3
//o/p: number is not a strong number
class  StrongNumber
{
	public static void main(String[] args) 
	{
		strongNumber(12);
	}
	public static void strongNumber(int num){
		int rem,n=145,sum=0,fact;
		while(num>0){
			rem=num%10;
			fact=1;
			for (int i=1;i<=rem ;i++ ){
				fact=fact*i;
			}
			System.out.print(fact+" ");
			num=num/10;
			sum=sum+fact;
		}
		System.out.println("="+sum);
		if(n==sum)
			System.out.println(sum+" is a strong number");
		else
			System.out.println(sum+" is not a strong number");
	}

}
