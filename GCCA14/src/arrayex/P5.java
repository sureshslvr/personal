package arrayex;


public class P5 {
	public static void main(String[] args) {
		String[][] s= {
				{
					"idli","vada","sambar"
				},{
					"biyani","curd","soupe"
				},
				{
					"biyani","curd","soupe"
				}
		};
		
		try {
			
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length;j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
		}
		catch(Exception e) {
			System.out.println("");
		}
	}

}
