//wap to print
class Demo2 {
	public static void main(String []args) {
		/*
		char ch='A';
		do{
			System.out.println(ch++);
		}
		while(ch<='Z');
		ch='a';
		do{
			System.out.println(ch++);
		}
		while(ch<='z');
		*/
		

		char ch='A';
		do{
			if((ch>='A'&&ch<='Z')||(ch>='a' && ch<='z'))
			System.out.println(ch++);
			else
			ch++;
		}
		while(ch<='z');
	}
}