class Employee extends Human
{
	int empId;
	int phnNum;
	Employee(int empId,int phnNum,String name,String color){
		super(name,color);
		this.empId=empId;
		this.phnNum=phnNum;
	}
	public static void main(String[] args) 
	{
		Employee emp=new Employee(1234,47724682,"suresh","white");
		
		System.out.println(emp.name);
		System.out.println(emp.empId);
		System.out.println(emp.phnNum);
		System.out.println(emp.color);
	}
}
