//wap to find palindrome
class Palindrome 
{
	public static void main(String[] args) 
	{
		palindrome(121);
	}
	public static void palindrome(int num){
		int rem,rev=0,n=num;
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (rev==n)
		{
			System.out.println("num is palindrome");
		}
		else{
			System.out.println("num is not a palindrome");
		}
	}
}
