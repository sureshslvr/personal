package practice;

public class Singletonclass {
	
	static Singletonclass singletonclass=null;
	int i=10;
	private Singletonclass() {
		
	}
	
	public static Singletonclass getInstance() {
		if(singletonclass==null) {
			singletonclass = new Singletonclass();
		}
		
		return singletonclass;
	}
	public void hi() {
		
		System.out.println(this.i);
	}
	
	public static void main(String[] args) {
		Singletonclass obj=Singletonclass.getInstance();
		System.out.println(obj);
		obj.hi();
		Singletonclass obj1=Singletonclass.getInstance();
		System.out.println(obj1);
		obj1.hi();
		
		obj1.i=20;

		obj.hi();
	}

}
