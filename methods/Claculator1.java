class Claculator1 
{
	public static void main(String[] args) 
	{
		System.out.println("from main..");
		int sum=add(5,15);//method calling stmnt can give a value if 
		//a method have return type and we can store the value from 
		//method calling stmt ino a variable only if the method have
		//some return type other than void.

		System.out.println("sum is:"+sum);

	}

	public static int add( int i,int j){//method with return type
		int sum=i+j;
		
		return sum;//return keyword will transfer the
		//jvm control back to method calling statement along with the values
	
	}
}
