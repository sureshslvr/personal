//wap to check whether the given character is a number/special char/alphabet.
class CheckingChar	 {
	public static void main(String[] args) {
		
		char ch=' ';

		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){	
			System.out.println("charecter contains a alphabet");
		}
		else if(ch>='0' && ch<='9'){
			System.out.println("charecter contains a number");
		}
		else{
			System.out.println("charecter contains a special character");
		}
	}
}