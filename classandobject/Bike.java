//WAP to create the blueprint of bike by having the 4 properties 
//and a behaviour display() which displays the properties of the 
//the bike object.
//create a seperate user logic having 3 bike object with their
//display behaviour
class Bike
{
	String bikeName;
	int mfgYear;
	double price;
	double milagePerLiter;
	String bikeColor;
	public void display()
	{
		System.out.println("model name "+this.bikeName );
		System.out.println("year "+this.mfgYear);
		System.out.println("price "+this.price);
		System.out.println("milage "+this.milagePerLiter);
		System.out.println("color "+this.bikeColor);
	}

}
