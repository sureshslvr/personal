/*
    1
   123
  12345
 1234567
123456789

*/

class P23 
{
	public static void main(String[] args) 
	{
		int space=5,num=1;
		for (int i=1;i<=5 ;i++ )
		{
			space--;
			
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=num ;j++ )
			{
				System.out.print(j);
			}
			num+=2;

			System.out.println();
		}

/* 
1
121
12321
1234321
123454321



*/

			System.out.println("------------------------");

			for (int i=1;i<=5 ;i++ )
			{
			
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(j);
			}
			for (int j=i-1;j>=1 ;j--)
			{
				System.out.print(j);
			}

			System.out.println();
			}


/* 

   1
  234
  5678
9101112
*/
		System.out.println("--------------------");
		num=1;space=4;int k=1;
		for (int i=1;i<=4 ;i++ )
		{
			space--;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=num ;j++ )
			{
				System.out.print(k++);
			}
			num+=2;
			

			System.out.println();
		}

/*

  1
 123
12345
 123
  1
*/		 System.out.println("---------------");
		space=3;num=-1;
		for (int i=1;i<=5 ;i++ )
		{
			if(i<=3){
				space--;
				num+=2;
			}
			else{
				space++;
				num-=2;
			}
			
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=num ;j++ )
			{
				System.out.print(j);
			}
		

			System.out.println();
		}
	
	}

}
