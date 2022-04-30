class Pen 
{
	Cap cap;

	public Pen(Cap cap){
		this.cap=cap;
	}
	public  void write() 
	{
		cap.open();
		System.out.println("writing...");
		cap.close();
	}
}
