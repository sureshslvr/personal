class Music 
{
	public static void main(String[] args) 
	{
		System.out.println("from music");
		Instrument i=new Instrument();
		i.play();//super class implementation

		Guitar g=new Guitar();
		g.play();//subclass implemention due to overriding

		Instrument i1=new Guitar();
		i1.play();//subclass implemention due to overriding
	}
}
