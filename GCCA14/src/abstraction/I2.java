package abstraction;

public interface I2 extends I1,I3 {
	public static void main(String[] args) {
		System.out.println(I1.i);
		System.out.println(I3.f);
	}

}
