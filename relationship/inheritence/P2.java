class P2 extends P1 
{
	boolean b= true;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		P2 obj=new P2();//subclass object--->Instances of supermost Class(object)+
		//instances of superclass(p1)+instances of subclass(p2)

		p1 obj1=new p1();//Superclass object---> Instances of object+instances of object.

		Object obj2=new Object();//supermost class object--instances of only object class.

	}
}
//12 inherited memebers(1 from p1 and 11 from object)+
//2 incorporate members>>>   14 total
//because static members do not inherit