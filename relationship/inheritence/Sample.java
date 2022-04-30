class Sample extends Object 
{
	public static void main(String[] args) 
	{
		Sample sample=new Sample();//here we have 11 non static members
		//from obect class
		System.out.println(sample.toString());
		System.out.println(sample.hashCode());
	}
}
