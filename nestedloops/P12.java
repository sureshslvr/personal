/*

     1
	1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5

*/


class P12 
{
	public static void main(String[] args) 
	{
		int space=5,numSpace=0;
		for (int i=1;i<=5 ;i++ ){
			space--;
			numSpace++;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=numSpace ;j++ )
			{
				System.out.print(j+" ");
			}
				
			System.out.println();
		}
	}
}
