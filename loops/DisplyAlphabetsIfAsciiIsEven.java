
//wap to display Alphabets from 'A' to 'Z' if their ascii values are even numbers.
class DisplyAlphabetsIfAsciiIsEven {
	public static void main(String [] args) {
		
		for(char ch='A' ;ch<='Z';ch++){
			int i=ch;
			if(i%2==0)
			System.out.println(ch);
		}
	}
}
