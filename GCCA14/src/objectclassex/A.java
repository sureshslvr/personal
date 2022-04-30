package objectclassex;

public class A {
	int i;

	public A(int i) {
		super();
		this.i = i;
	}
	
	public boolean equals(Object obj) {
		return this.i == ((A)obj).i;
	}
	

}
