//Wap to print the individual of a number.
//i/p:231
//o/p:1
//    2
//    3

class  IndividualNumners
{
	public static void main(String[] args) 
	{
	  individual(231);
	  add(231);
	}
	public static void individual(int i){
		int rem=0;
		while(i!=0){
		rem=i%10;
		System.out.println(rem);
		i=i/10;
		}
		
	}
	System.out.println("................");
	public static void add(int i){
		int rem,sum=0;
		
		while(i!=0){
		rem=i%10;
		sum+=rem;
		i=i/10;
		}
		System.out.println(sum);
	}
}
