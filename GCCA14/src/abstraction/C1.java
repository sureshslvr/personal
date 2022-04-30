package abstraction;

public class C1 extends C2 implements I1,I2,I3{
	public static void main(String[] args) {
		I1 obj = new C1();
		obj.run();
		obj.log1();
		I2 obj1 = new C1();
		obj1.hi();
		System.out.println(I1.i);
		System.out.println(I1.j);
	}

	@Override
	public void run() {
		System.out.println("from run");
	}

	@Override
	public void log1() {
		System.out.println("from log");

	}

	@Override
	public void hi() {
		System.out.println("from hi");
		
	}

}
