class CarDriver 
{
	public static void main(String[] args) 
	{
		System.out.println("From User logic");
		Car car1=new Car("BMW",190.00,new Engine(22.00));
		car1.engine.comburstion();
		car1.drive();
	}
}
