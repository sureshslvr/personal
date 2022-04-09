class Box 
{
	double length;
	double breadth;
	double height;
	Box(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	Box(double length,double breadth,double height){
		this(length,breadth);
		this.height=height;
	}
	public void display(){
		System.out.println("the lenght : "+this.length);
		System.out.println("the breadth : "+this.breadth);
		if(this.height!=0.0)
			System.out.println("the height : "+this.height);

	}
}
