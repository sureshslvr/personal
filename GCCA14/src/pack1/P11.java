package pack1;


public class P11 {
	
	private static int j=10;
	private int i=20;
	
	private P11() {
		
	}

	public static void main(String[] args) {
		System.out.println(P11.j);
		P11 obj=new P11();
		System.out.println(obj.i);

	}

}
