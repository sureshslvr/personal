package practice;
/*
 * Write a program to fond the difference between two dates 
I/p1: 25/06/1998
I/p2: 31/07/2021

Output:
23years 1month 6daysA
 */

import java.util.Scanner;

public class CalculateAge {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter your date of birth/previous DATE like month , day, year 1 by 1");
		int[] d= {31,28,31,30,31,30,31,31,30,31,30,31};
		int prevMonth=scan.nextInt();
		if(!(prevMonth>=1 && prevMonth<=12)) {
			System.out.println("enter correct month");
			prevMonth=scan.nextInt();
		}
		int prevDay=scan.nextInt();
		if(!(prevDay>0 && prevDay<=d[prevMonth-1])) {
			System.out.println("enter correct day");
			prevDay=scan.nextInt();
		}
		
		int prevYear=scan.nextInt();
		System.out.println("enter your date of present DATE like month , day, year 1 by 1");
		int presentMonth=scan.nextInt();
		if(!(presentMonth>=1 && presentMonth<=12)) {
			System.out.println("enter correct month");
			presentMonth=scan.nextInt();
		}
		int presentDay=scan.nextInt();
		if(!(presentDay>0 && presentDay<=d[presentMonth-1])) {
			System.out.println("enter correct day");
			presentDay=scan.nextInt();
		}
		int presentYear=scan.nextInt();
		
		calculateAge(prevDay,prevMonth,prevYear,presentDay,presentMonth,presentYear);
	}
	private static void calculateAge(int prevDay, int prevMonth, int prevYear, int presentDay, int presentMonth,int presentYear) {
		int days=0;int months=0;
		int[] d= {31,28,31,30,31,30,31,31,30,31,30,31};
		//days calculation
		if(presentDay>prevDay) {
			days=presentDay-prevDay;
		}
		else {
			if(presentMonth==2 && presentYear%4==0) {
				presentDay+=29;
				presentMonth-=1;
			}
			else {
				presentDay+=d[presentMonth-1];
				presentMonth-=1;
			}
			days=presentDay-prevDay;
		}
		//months calculation
		if(presentMonth>prevMonth) {
			months=presentMonth-prevMonth;
		}
		else {
			months=(presentMonth+12)-prevMonth;
			presentYear-=1;
		}
		
		System.out.println(presentYear-prevYear+"years "+months+"month "+days+"days");
				
		
	}

}
