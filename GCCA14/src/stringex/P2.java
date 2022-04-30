package stringex;
//methods of String

public class P2 {
	public static void main(String[] args) {
		
		String s="developer";
		System.out.println(s.length());//9
		System.out.println(s.toLowerCase());//developer
		System.out.println(s.toUpperCase());//new object created & o/p:DEVELPOER 
		System.out.println(s.concat("java"));//developerjava
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(23));
	}

}
