package practice;

public class PowerOdPrime {

	public static void main(String[] args) {
		int a=3;
		int p=4,i=1;
		int count=0;
		
		while(i<=a){
			if(a%i==0)
				count++;
			i++;
		}
		int res=1;
		if(count==2) {
			for(int j=1;j<=p;j++) {
				res=res*a;
			}
			System.out.println(res);
		}
		else {
			System.out.println("entered num is not prime number");
		}
		
	}

}
