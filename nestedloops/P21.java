/*

1st pattern:
        1 
       2 2
      3 3 3 
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9


*/


class P21
{
	public static void main(String[] args) 
	{
		int space=9;
		System.out.println("1st pattern:");
		for (int i=1;i<=9;i++){
			space--;
			for (int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++ ){
				System.out.print(i+" ");
			}
		System.out.println();
		}

/*

2nd pattern:

        1 
	   1 2 
	  1 2 3 
	 1 2 3 4 
	1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9

*/

		System.out.println("2nd pattern:");
		space=9;
		for (int i=1;i<=9;i++){
			space--;
			for (int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++ ){
				System.out.print(j+" ");
			}
		System.out.println();
		}
/*
3rd pattern:
        * 
	   * * 
	  * * * 
	 * * * *
	* * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * * 
* * * * * * * * *

*/

		System.out.println("3rd pattern:");
		space=9;
		for (int i=1;i<=9;i++){
			space--;
			for (int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++ ){
				System.out.print("* ");
			}
		System.out.println();
		}

	}
}
