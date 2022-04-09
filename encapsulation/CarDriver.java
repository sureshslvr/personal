class CarDriver 
{
	public static void main(String[] args) 
	{
		System.out.println("From User Logic");
		Car car1=new Car("BMW",190.00,new Engine(22.0));
		car1.engine.combustion();
		car1.drive();
	}
}
