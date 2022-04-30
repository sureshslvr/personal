package arrayex;
//WAP to create an array of integer elements in the main([]) 
//and print the elements in another mehtod
import java.util.Scanner;
public class P8 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter array size:");
		int size=scan.nextInt();
		int[] s= new int[size];
		System.out.print("enter  ele one by one");
		for(int i=0;i<s.length;i++) {
			s[i]=scan.nextInt();
		}
		
		printArray(s);
	}
	//conclusion: a method can have arrayrefence variable as formal argument
	public static void printArray(int[] i) {  
		for(int arg:i) {
			System.out.print(arg+" ");
		}
		
	}

}
