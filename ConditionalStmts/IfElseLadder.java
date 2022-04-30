class IfElseLadder	 {
	public static void main(String[] args) {
		//in if else ladder only one gets executed.
		
		int i=10;

		
		if(false){
			System.out.println("from if block");
		}
		
		else if(false){
			System.out.println("from else if 1st block");
		}	
		else if(true){
			System.out.println("from else if 2st block");//o/p
		}
		//else if(i+5){//CTE
		//	System.out.println("from else if 3rd block")	
		//}
		else{
			System.out.println("from else block");
		}
	}
}