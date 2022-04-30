package Collections;

import java.util.*;

public class ArrayListex {

	public static void main(String[] args) {
		List<Student> s=new ArrayList<>();
		s.add(new Student(1,"suresh","nani",123456));
		s.add(new Student(4,"manoj","kumar",123453));
		s.add(new Student(2,"vasmhi","krishna",123454));
		s.add(new Student(3,"anu","nani",123455));
		s.add(new Student(5,"rajesh","konda",123457));
		System.out.println(s);
		
		//System.out.println(s.isEmpty());
		//System.out.println(s.size());
		//Collections.reverse(s);
		//s.stream().forEach(n->System.out.println(n));
		//Collections.sort((List<T>) s);
		//s.forEach(n->System.out.println(n));
		
		//Collections.sort(s, new Mysort());//ascending or descending order
		//System.out.println(s);
		
		/*Collections.sort(s,new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				return (int)(o2.getPhno()-o1.getPhno());
			}
		});
		
		System.out.println(s);
		*/
		
		Collections.sort(s,new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				return (int)(o1.Fname.compareTo(o2.Fname));
			}
		});
		
		System.out.println(s);
		
		Collections.sort(s,(o1,o2) ->(o2.Fname.compareTo(o1.Fname)));//lamda expression to the collection
		
		System.out.println(s);
		
	}

}
class Mysort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int)(o2.getPhno()-o1.getPhno());
	}
	
}
