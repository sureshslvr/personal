class Sample2 
{
	static int a=10;
	public static void main(String[] args) 
	{//satic method implementation/static context
		int a=50;
		System.out.println("from main");
		System.out.println(a);//50
		System.out.println(Sample2.a);//10 "." is an access operator
		jsp();//we directly calling the jsp() present in sample area
		Sample2.jsp();//we can call static method jsp()within the other 
		//static method i.e, main(s[]) by the help of classname.
		//because every static members are present within the class static area.
		//with the name similar to class name.
	}
	public static void jsp(){
		System.out.println("jsp() begins..");
		System.out.println(a);
	}
}

/*
note: we can have one local and global variable with the same name
*/