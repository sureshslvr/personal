/*

5 4 3 2 1
5 4 3 2
5 4 3 
5 4
5

*/


class P17 
{
	public static void main(String[] args) 
	{
		for (int i=5;i>=1;i--){
			//int k=5;
			int k=5;
			for (int j=1;j<=i;j++){
				System.out.print(k--);
			}
		System.out.println();
		}
	}
}
