package practice;

public class LargestOf3Num {

	public static void main(String[] args) {
		int a=11111;
		int b=88;
		int c=100;
		
		
		String s=((a>b&&a>c)?(a+" a is larger"):((b>c)?(b+" is larger"):(c+" is larger")));
		System.out.println(s);
	}

}
