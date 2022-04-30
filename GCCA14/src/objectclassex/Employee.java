package objectclassex;

public class Employee {
	String eId;
	String eName;
	double sal;
	public Employee(String eId, String eName, double sal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.sal = sal;
	}
	@Override
	public String toString() {
		
		return "employee Id: "+this.eId+""+"Employee name: "+this.eName+"Empsalary: "+this.sal;
	}
	
	public boolean equals(Object obj) {
		Employee temp=(Employee(obj));
		return this.eId==temp.eId && this.eName==temp.eName && this.sal==temp.sal; 
	}
	public int hashCode() {
		int hc=0;
		hc=hc+eId.hashCode();
		hc=hc+eName.hashCode();
		hc=hc+(int)sal;
		return hc;
	}
	
}
