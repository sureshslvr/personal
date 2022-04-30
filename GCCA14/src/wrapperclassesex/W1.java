package wrapperclassesex;

public class W1 {
	public static void main(String[] args) {
		int i=10;
		Integer i1=new Integer(i);
		System.out.println(i1);
		
		Integer i2=new Integer(10);
		System.out.println(i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		Integer obj=Integer.valueOf(i);//boxing
		System.out.println(obj);
		
		char ch='a';
		Character ch1=Character.valueOf(ch);//boxing
		System.out.println(ch1.toString());
		
		Integer i3=i;//auto boxing from jdk 1.5
		System.out.println(i3);
		
		
		
		
	}

	
}


