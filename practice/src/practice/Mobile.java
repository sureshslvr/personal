package practice;

public class Mobile {
	String userName;
	private String password;
	
	//getters
	public String getPassword() {
		return password;
	}
	
	//setters
	public void setPassword(String arg1) {
		this.password=arg1;
	}
	
	Mobile(String name,String pswrd){
		this.userName=name;
		this.password=pswrd;
	}

	public void display() {
		System.out.println("username "+this.userName);
		System.out.println("password "+this.password);
		
	}
}
