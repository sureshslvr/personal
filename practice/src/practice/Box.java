package practice;

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
	public static void main(String[] args) 
	{
		Box b1=new Box(10.0,5.0);
		b1.display();
		System.out.println("************");
		Box b2=new Box(13.23,12.2,1.2);
		b2.display();
		System.out.println("************");
		Box b3=new Box(10.0,6.7,3.4);
		b3.display();
	}
}

