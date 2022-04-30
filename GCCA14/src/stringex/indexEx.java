package stringex;



public class indexEx {

	public static void main(String[] args) {
		String s="developer";
		int index=s.indexOf('e');
		System.out.println(index);
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf('e',7));
		System.out.println(s.indexOf("ev"));
		System.out.println(s.indexOf("loper",5));
	}
}
