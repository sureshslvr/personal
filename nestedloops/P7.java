/*

*********
 *******
  *****
   ***
    *


*/
class P7
{
	public static void main(String[] args) 
	{
	int star=11,space=0;
	for (int i=1;i<=9 ;i++ ){
		star-=2;
		space++;
		for (int j=1;j<=space ;j++ )
		{
			System.out.print(" ");
		}
		
		for (int j=1;j<=star ;j++ )
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
}
