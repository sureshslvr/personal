package practice;

public class Manoj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 1;
		System.out.println(i);
		System.out.println(j);

		while (true) {
			int k = i + j;
			if (k <= 100) {
				System.out.println(k);
				i = j;
				j = k;
			} 
			else
				break;

		}
	}

}
