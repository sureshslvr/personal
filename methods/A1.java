class  A1
{
	public static void main(String[] args) 
	{//calling method
		System.out.println("from main(--)");
		marriage();//method calling statement
		System.out.println("main ends(--)");
	}
	public static void marriage( ) {// called method
		System.out.println("marriage begins");
		engagement();//method calling statement
		System.out.println("marriage ends");

	}

	public static void engagement( ) {
		System.out.println("from engagement");
	}
//note: we can execute any method ,by calling the method in main(S[]) during the execution by using
//method calling statement.
//it is not mandatory to call every method within the main method.

}
