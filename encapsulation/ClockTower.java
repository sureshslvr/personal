class  ClockTower
{
	public static void main(String[] args) 
	{
		Clock c1=new Clock(1,54,5);
		c1.setSec(24);
		int sec=c1.getSec();
		System.out.println(sec);
		c1.setHr(3);

		c1.showTime();
		
	}
}
