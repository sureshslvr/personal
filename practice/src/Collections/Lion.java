package Collections;

public class Lion implements LivingThings {
	String color;
	Integer weight;
	Lion(String c,Integer w){
		this.color=c;
		this.weight=w;
	}
	public void display() {
		System.out.println("lion is "+this.color+" and weight is "+this.weight);
	}
	@Override
	public void walk() {
		System.out.println("lion is walinkg");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("lion is chasing");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("lion is eating food");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("lion is sleeping");
	}

}
