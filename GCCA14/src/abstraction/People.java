package abstraction;

public class People {
	
	public static void main(String[] args) {
		ATM obj=new HDFC();
		obj.login();
		ATM obj1=new ICICi();
		obj1.login();
		ATM obj2=new SBI();
		obj2.login();
		
		
	}

}
