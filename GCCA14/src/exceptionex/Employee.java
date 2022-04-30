package exceptionex;

public class Employee {
	
	String ename;
	private double sal;
	
	public double getSal() {
		return sal;
	}
	
	public void setSal(double sal) {
		if(sal>0.0) {
		this.sal = sal;
		}
		else {
			 throw new SalaryIncorrectException();
		}
	}

	public Employee(String ename, double sal) {
		super();
		this.ename = ename;
		if(sal>0.0) {
		this.sal = sal;
		}
		else
		{
			throw new SalaryIncorrectException();
		}
	}
	
	

}
