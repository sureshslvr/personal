class P1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(add(10,20));//CTB happen wrt first method
		System.out.println(add(10.09,20.45));//CTB happen wrt second method
		System.out.println(add(10,'a'));//CTB happen wrt first method
		System.out.println(add(10,20,20.5));
	}
	public static int add(int a,int b){
		System.out.println("add(int a,int b)");
		return (a+b);
	}
	public static double add(double d1,double d2){
		System.out.println("add(double a,double b)");
		return (d1+d2);
	}
	public static double add(int a,int b,double d1){
		
		return (a+b+d1);
	}
	public static int add(char ch1,char ch2){
		return (ch1+ch2);
	}
}
