//wap to check whether the given charecter contains a vowel or consonant using the switch conditional


class VowelOrConsonant{
	public static void main(String[] args){
		char ch='e';
		if(!(ch>='0'&&ch<='9')){
			switch(ch){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.println(ch + ":is a vowel");
					break;
				default: System.out.println(ch + ":is a consonent");
			}
		}
		else{
			System.out.println(ch + ": is not an alphabet");
		}
		
	}

}