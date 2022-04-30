

class Bike 
{
	String brandName;
	private double topSpeed;
	double milage;

	//setter for topSpeed
	public void settopSpeed(double topSpeed){
		if((topSpeed)>230.00)
			this.topSpeed=230.00;
		else
			this.topSpeed=topSpeed;
	}
	//getter for topSpeed
	public double gettopSpeed(){
		return this.topSpeed;
	}

	Bike(String brandName,double topSpeed,double milage){
		this.brandName=brandName;
		if((topSpeed)>230.00)
			this.topSpeed=230.00;
			
		else
			this.topSpeed=topSpeed;
		this.milage=milage;
	
	}

	public void display(){
		System.out.println("brandname: "+this.brandName+"\ntopspeed: "+this.topSpeed+"\nmilage: "+this.milage);
		
	}
}
