class BikeDetails 
{
	public static void main(String[] args) 
	{
		Bike b1=new Bike();
		b1.bikeName="honda shine";
		b1.mfgYear=2016;
		b1.price=70000.00;
		b1.milagePerLiter=50.57;
		b1.bikeColor="redblack";
		b1.display();
		System.out.println("-------------");
		Bike b2=new Bike();
		b2.bikeName="ktm";
		b2.mfgYear=2019;
		b2.price=90000.00;
		b2.milagePerLiter=40.57;
		b2.bikeColor="black";
		b2.display();
		System.out.println("-------------");
	}
}
