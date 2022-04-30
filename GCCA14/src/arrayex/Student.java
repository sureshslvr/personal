package arrayex;

public class Student {
	String name;
	double sal;
	
	
	public Student(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", sal=" + sal + "]";
	}
	
}
