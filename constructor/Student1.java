//example for constructor chaining
/*Wap to create the blueprint of the student,wherein some students have completed
upto 10th,some are copleted upto 12th and remaining upto degree.
[use the properies name,10th percfentage,12th percentage and degree percentage].
create a user logic having a student completed upto 12th and remaining 2 completed uptodegree and display their properties by calling display() from the blueprint.
*/

class Student1 
{
	String name;
	double tePer;
	double twPer;
	double dePer;
	
	Student1(String name,double tePer){
		this.name=name;
		this.tePer=tePer;
	}
	Student1(String name,double tePer,double twPer){
		this(name,tePer);
		this.twPer=twPer;
	}
	Student1(String name,double tePer,double twPer,double dePer){
		this(name,tePer,twPer);
		this.dePer=dePer;
	}
	public void display(){
		System.out.println("name: "+this.name);
		System.out.println("tenthper: "+this.tePer);
		if(this.twPer!=0.0)
			System.out.println("twelthper: "+this.twPer);
		if(this.dePer!=0.0)
			System.out.println("degreeper: "+this.dePer);
	}



}
