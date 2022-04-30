class P8 
{
	static int j=10;
	int i;//non static global variable
	public static void learn(){
		System.out.println("from learn");
	}

	public  void read(){
		System.out.println("from read");
		this.learn();
		int i=100;//local variable
		System.out.println(this.i);//0 --global var
		System.out.println(i);//100 -->local var
		this.i=i;//the global var i is update the value ro 100
		System.out.println(this.i);//100
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		P8 obj=new P8();
		obj.read();
	}
}
/*
O/P:-
Hello world!
from read
from learn
0
100
100
*/
