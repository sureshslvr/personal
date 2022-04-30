/*

1
12
123
1234
12345
1234
123
12
1

*/


class P16
{
	public static void main(String[] args) 
	{
		int num=0;
		for (int i=1;i<=9 ;i++ ){
			if(i<=5)
				num++;
			else
				num--;

			for (int j=1;j<=num ;j++ )
			{
				System.out.print(j);
			}
				
			System.out.println();
		}
	}
}
