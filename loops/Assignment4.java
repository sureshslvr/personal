/*
wap to print
A1a
B2b
.
.
Z26z
*/
class Assignment4 {
	public static void main(String [] args) {
		/*char ch='A';
		char ch1='a';
		int i=1;
		do{
			System.out.print(ch++);
			System.out.print(i++);
			System.out.println(ch1++);
		}
		while(ch<='Z'&&ch1<='z');*/

		int i=1;
		for(char ch='A',ch1='a';ch<='Z';ch++,ch1++,i++){
			
			System.out.println(ch+""+i+""+ch1);
		}
	}
}
