package arrayex;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the student array size");
		
		int size=sc.nextInt();
		Student[] s=new Student[size];
		
		System.out.println("enter values of the student as name and sal one ny one");
		
		for(int i=0;i<=s.length-1;i++) {
			String name=sc.next();
			double sal=sc.nextDouble();
			s[i]=new Student(name,sal);
		}
	
		System.arraycopy(s, size, s, size, size);
		for(Student s1:s) 
			System.out.println(s1.toString());
		}
	}
}
