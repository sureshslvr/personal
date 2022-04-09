class D extends C{//subclass or deriverd class
	int j=50;
	D(){
		super();
		System.out.println("from subclass constructor");
	}
	public static void main(String[] args) 
	{
		D obj=new D();
	}
}
