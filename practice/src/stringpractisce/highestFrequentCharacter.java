package stringpractisce;
//Wap to check the highest frequent character in string
import java.util.Scanner;

public class highestFrequentCharacter {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.next();
		int[] a=new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			a[i]=count;
		}
		
		int high = 0;
		char ch=' ';
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j <a.length; j++) {
				if(a[i]>a[j]) {
					high=a[i];
					ch=s.charAt(i);
				}
			}
		}
		System.out.println(high + ""+ch);
		System.out.println(ch);
	}

}
