package casting;

public class B extends A {
	int j=20;
	public static void main(String[] args) {
		
		//upcasting
		
		A obj=new B();
		System.out.println(obj.i);//10
		//System.out.println(obj.j);//Cte according to semantics
		System.out.println(obj.toString());//casting.B@182decdb
		
		Object obj1=new A();
		System.out.println(obj1.toString());//casting.A@26f0a63f
		//System.out.println(obj1.j);//CTE according to semantics
		//System.out.println(obj1.i);//CTE according to semantics
		
		//down casting
		
		A obj2=new B();//upcasting is madetory for downcasting otherwise we get CLassCasetExcepatin
		B obj3=(B) obj2;
		System.out.println(obj3.j);//20
		System.out.println(obj3.i);//10
		System.out.println(obj3.toString());//casting.B@4361bd48
	}
}
