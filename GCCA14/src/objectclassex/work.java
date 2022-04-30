package objectclassex;

public class work {

	public static void main(String[] args) {
		Employee obj= new Employee("A1","Thodima",2000.88);
		Employee obj1= new Employee("A2","thodima",2000.88);
		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	

}

}
