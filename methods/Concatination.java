class Concatination
{
//WAP ro create a method which performs the concatination bW your name
//and your phone number passed from main method.
//display in contact mathod.

	public static void main(String[] args) 
	{
		System.out.println("main");
		contact("Suresh",9123456780l);//method calling stmnt		

	}

	public static void contact( String i,long j){//method with FA
		
		System.out.println("contact details:" +i+j);

	
	}
}
/*compile time biding:
the bind between the method calling statement and method implementation happens 
based upon the actual and formal arguments during the compilation
using ctb,the java execute a particular method during the runtime
NOTE: if we call a method using method calling statemement, then actual shuold match
with formal arguments,otherwise we get CTE because no compile time binding..
*/