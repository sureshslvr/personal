package wrapperclassesex;

public class W4 {
	public static void main(String[] args) {
		run(10);
	}
	public static void run(int i) {
		System.out.println("from int i");
	}
	public static void run(long i) {
		System.out.println("from long i");
	}
	public static void run(float i) {
		System.out.println("from float i");
	}
	public static void run(double i) {
		System.out.println("from double i");
	}
	public static void run(Integer i) {
		System.out.println("from integer i");
	}
	public static void run(Long i) {
		System.out.println("from Long i");
	}
	public static void run(Double i) {
		System.out.println("from Double i");
	}
	public static void run(Object i) {
		System.out.println("from Object i");
	}
	
	//for CTB
	//1st priority is given for similar datatypes and the auto widening process
	//2nd priority is given for auto-Boxing
	//3rd priority is given for auto-upcasting to the Object type

}
