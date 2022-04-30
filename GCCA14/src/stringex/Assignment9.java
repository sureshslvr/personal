package stringex;

import java.util.Scanner;

//Wap to reverse the string in given order
//a.i/p:"java css html"
//	o/p:"lmth ssc avaj"
//b.i/p:"java css html"
//	o/p:"avaj ssc lmth"
//c.i/p:"java css html"
//	o/p:"html css java"
public class Assignment9 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter string");
		String s=scan.nextLine();
		
		System.out.println("pattern a:");
		String[] s1=s.split(" ");
		String str="";
		for (int i=0;i<s.length();i++) {
			
			str=s.charAt(i)+str;
			
		}
		System.out.print(str+" ");
		
		System.out.println("pattern b:");
		
		for (String s2 : s1) {
			String str2="";
			str2=s2+" "+str2;
			System.out.print(str2+" ");
		}
		
		System.out.println("pattern c");
		
		for (int i = 0; i < s1.length; i++) {
			String str4="";
			str4=s1[i]+" "+str4;
			System.out.print(str4+" ");
		}
		
	}
}
