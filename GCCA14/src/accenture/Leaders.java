package accenture;
//wap to print the sum of all the leaders in the array.An element is leader if it is greater than all elements to its right side.
import java.util.*;
public class Leaders {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int size=scan.nextInt();
		int[] a=new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		int leader=0;
		for(int i=0;i<size;i++) {				//not compleated
			for(int j=i+1;j<size;j++) {
				if(a[i]<a[j]) {
					break;
				}
				if(size==j) {
					leader=leader+a[i];
				}
			}
		}
		System.out.println(leader);
	}
	

}
