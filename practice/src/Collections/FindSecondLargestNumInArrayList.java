package Collections;
import java.util.*;
public class FindSecondLargestNumInArrayList {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Integer size=sc.nextInt();
		Integer[] a=new Integer[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		List<Integer> al=Arrays.asList(a);
		System.out.println("original list");
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("list after sorting ");
		System.out.println(al);
		
		System.out.println("second largest ele: "+al.get(al.size()-2));
		
		System.out.println("second smallest ele: "+al.get(1));
		
	}

}
