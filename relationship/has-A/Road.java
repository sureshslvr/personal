//Wap to create the blueprint of clock and also and clock tower
//each one behaviour and illustate has -a relationship b/w them
//with the help of user logic road
//create two objects of clocktower within the road class and
//display their properties...

class Road 
{
	public static void main(String[] args) 
	{
		System.out.println("from road");
		ClockTower c1=new ClockTower("hyderabad",new Clock(11,45,55));
		c1.showTime();
		
		ClockTower c2=new ClockTower("mysore",new Clock(33,4544,445));
		c2.showTime();
	}
}
