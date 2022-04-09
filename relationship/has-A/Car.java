class Car 
{
	String brandName;
	Double topSpeed;
	Engine engine;
	Car(String brandName,Double topSpeed,Engine engine){
		this.brandName=brandName;
		this.topSpeed=topSpeed;
		this.engine=engine;
	}

	public void drive() 
	{
		System.out.println("driving with rita to hell");
	}
}
