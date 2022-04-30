package stringpractisce;

import java.util.Scanner;

public class StringCapEach1stChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();//i love code
		String[] s1 = s.split(" ");//[i,love,code]
		for (String temp : s1) {
			String str="";
			String f=temp.substring(0,1);//first character
			String r=temp.substring(1);//remaing charcters
			str+=f.toUpperCase()+r.toLowerCase();
			System.out.print(str+" ");//I Love Code
			
		}
	}
}
