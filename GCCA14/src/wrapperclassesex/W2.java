package wrapperclassesex;

public class W2 {
	public static void main(String[] args) {
		Integer i1=10;//auto-boxing
		int k=i1.intValue();//auto uboxing
		System.out.println(k);
		
		Integer i2=50;
		int l=i2;// int l=i2.intvalue() bcz unboxing is automatic from jdk1.5
		System.out.println(l);
		
		Character ch='a';
		char ch3=ch;//auto unboxing
		System.out.println(ch3);
		int i=ch; //auto widening
		System.out.println(i);
		
		
		
	}
}
