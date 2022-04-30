/*

    *    *
   **    **
  **********
 ************
**************
 ************
  ***    ***
   **    **
    *    *


*/
class P8 
{
	public static void main(String[] args) 
	{
	int star=0,space=5;
	for (int i=1;i<=9 ;i++ ){
		//left side pattern starts
		if (i<=5)
		{
		star++;
		space--;
		}
		else
		{
		star--;
		space++;
		}
		for (int j=1;j<=space ;j++ ){
			System.out.print(" ");
		}
		for (int j=1;j<=star ;j++ )
		{
			System.out.print("*");
		}
		//left side pattern ends
		//second pattern
		if (i>=3 && i<=6)
		{
		for (int j=1;j<=4;j++){
			System.out.print("*");
		}
		}
		else{
		for (int j=1;j<=4;j++){
			System.out.print(" ");
		}
		}
		//third pattern
	
		for (int j=1;j<=star ;j++ )
		{
			System.out.print("*");
		}

	System.out.println();
	
	}
	
	}
}
