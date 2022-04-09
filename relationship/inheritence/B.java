class B extends A //subclass or child class
{
	int j=50;

	public static void main(String[] args) 
	{
		B obj=new B();//instance of class A, instanc of class B and instance of object class

		System.out.println(obj.i);
		obj.run();
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
	}
}
