package accenture;

import java.util.*;
public class DiceSum {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int sum=scan.nextInt();
		int count=0;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j==sum)
					count++;
			}
		}
		System.out.println(count);
		
	}

}
