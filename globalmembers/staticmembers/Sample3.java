class Sample3 
{
	static int j=50;
	static{// in java ,if any block defined with only static keyword
		//then it is a SIB.
		//it is an anonymous block defined with only static keyword
		System.out.println("from SiB--1");
		int j=100;
		System.out.println(j);//100
	}
	static {
		System.out.println("From SIB-2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(j);//50
	}
}
/*
note:
is it possible to execute the any instructions before the 
execution of main method.
yes it possible by SIB.
*/

