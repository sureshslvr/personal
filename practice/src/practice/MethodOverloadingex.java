package practice;

public class MethodOverloadingex {

	public static void main(String[] args) {
		System.out.println(add(10.0,20.25));
		System.out.println(add(10,'a'));
		System.out.println(add(10.5,23,'a'));
		System.out.println(add(10f,'a'));
	}
	
	private static double add(int d,char c) {
		return d+c;
	}
	private static double add(float f, char c) {
		return f+c;
	}
	private static double add(double d, int i, char c) {
		return d+i+c;
	}
	private static double add(double d, double e) {
		return d+e;
	}

}
