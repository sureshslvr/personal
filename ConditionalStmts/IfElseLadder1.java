class IfElseLadder1	 {
	public static void main(String[] args) {
		//in if else ladder only one gets executed.
		//if else ladder for showing grades of the student
		
		double i=-1;

	if(i>=0.0 && i<=100.0){	
		if(i>=70.0){
			System.out.println("Grade is : A");
		}
		
		else if(i>=60.0){
			System.out.println("Grade is : B");
		}	
		else if(i>=55.0 ){
			System.out.println("Grade is : C");
		}	
		else{
			System.out.println("failed");
		}
	}
	else{
		System.out.println("entered percentage is incorrect...");
	}
	}
}