/*
wap to print
Aa
Bb
.
.
Zz
*/
class Assignment3 {
	public static void main(String [] args) {
		/*char ch='A';
		char ch1='a';
		do{
			System.out.print(ch++);
			System.out.println(ch1++);
		}
		while(ch<='Z'&&ch1<='z');*/

		for(char ch='A',ch1='a';ch<='Z'&&ch1<='z';ch++,ch1++){
			System.out.println(ch+""+ch1);
			//System.out.println(ch1);
		}
	}
}
