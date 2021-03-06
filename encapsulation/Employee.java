//WAP to crate the blueprint of employee with four properties
//and protect the salary from the inavalid values
//create 3 employee objects along with their display behaviours
class Employee
{
	String empName;
	int empId;
	String empDisignation;
	private double empSalary;

	public void setEmpSalary(double empSalary){
		if(empSalary<0.0)
			this.empSalary=-empSalary;
		else
			this.empSalary=empSalary;
	}
	public double getEmpSalary(){
		return this.empSalary;
	}

	Employee(String empName,int empId,String empDisignation,double empSalary){
		this.empName=empName;
		this.empId=empId;
		this.empDisignation=empDisignation;
		if(empSalary<0.0)
			this.empSalary=-empSalary;
		else
			this.empSalary=empSalary;
	}

	public void display(){
		
		System.out.println("Name: "+this.empName+"\nempId: "+this.empId+"\ndisignation :"+this.empDisignation
							+"\nSalary: "+this.empSalary);
	}
}
