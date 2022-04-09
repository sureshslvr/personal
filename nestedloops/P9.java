/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

*/

class P9 
{
	public static void main(String[] args) 
	{
		int space=5,starSpace=0;
		for (int i=1;i<=5 ;i++ ){
			space--;
			starSpace++;
			for (int j=1;j<=space ;j++ ){
				System.out.print(" ");
			}
			for (int j=1;j<=starSpace ;j++ ){
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}
