package objectclassex;

public class User {
	public static void main(String[] args) {
		A obj=new A(10);
		A obj1=new A(5);
		A obj3=obj1;
		System.out.println(obj.equals(obj1));
		System.out.println(obj1.equals(obj));
		System.out.println(obj3.equals(obj1));
		System.out.println(obj==obj1);//false
		System.out.println(obj==obj3);//true
	}
}
