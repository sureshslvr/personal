class Dog extends Animal 
{
	String name="jimmy";
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		System.out.println(d.name);
		d.run();
	}
}
