package arrayex;
import java.util.*;
//Wap to create char[] with 7 elements and count numberof vowels in it
public class P3 {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = s.nextInt();
		char[] ch=new char[size];
		
		System.out.println("enter charecters one by one");
		
		for (int i = 0; i <= size-1 ; i++) {
			ch[i] = s.next().charAt(0);
		}
		
		int count=0;
		
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
		
		}
		System.out.println(count);
				
	}
}
