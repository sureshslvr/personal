/*

   a 
  a b 
 a b c 
a b c d

*/


class P14
{
	public static void main(String[] args) 
	{
		int space=5,letterSpace=0;
		for (int i=1;i<=5 ;i++ ){
			space--;
			letterSpace++;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			char ch='a';
			for (int j=1;j<=letterSpace ;j++ )
			{
				
				System.out.print(ch+++" ");
				
			}
							
			System.out.println();
		}
	}
}
