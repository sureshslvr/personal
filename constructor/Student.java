class Student 
{
	String name;
	int age;
	long phoneNumber;
	Student(String name,int age,long phoneNumber)
	{
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;	
		
	}
	public void diplay(){
		System.out.println("Student name: "+this.name);
		System.out.println("Student age: "+this.age);
		System.out.println("Student phn_number: "+this.phoneNumber);
	}

}
