/*

A B C D E
A B C D
A B C
A B 
A

*/


class P20
{
	public static void main(String[] args) 
	{
		for (int i=5;i>=1;i--){
			char ch='A';
			for (int j=1;j<=i;j++){
				System.out.print(ch++);
			}
		System.out.println();
		}

/*

a
bc
def
ghij
klmno


*/
		System.out.println("---------------");
		char ch='a';
		for (int i=1;i<=5 ;i++ )
		{
			
			for (int j=1;j<=i;j++ )
			{
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
