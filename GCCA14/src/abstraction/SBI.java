package abstraction;

public class SBI extends ATM {//concrete implementing subclass
	
	public static void main(String[] args) {
		SBI obj=new SBI();//11 Object members +login()--200
		obj.login();//200--200
		ATM obj1=new SBI();
		obj1.login();//100--200
		
		
	}

	@Override
	public void login() {//200
		System.out.println("from sbi login");
		
	}

}
