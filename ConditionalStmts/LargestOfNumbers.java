//wap to check the largest of 4 numbers using the switch conditional


class LargestOfNumbers{
	public static void main(String[] args){
		int a=2999;
		int b=44;	
		int c=255;
		int d=555;	
		if(a>b && a>c && a>d){
			System.out.println(a+"is largest");
		}

		else if(b>c && b>d){
			System.out.println(b+"is largest");
		}

		else if(c>d){
			System.out.println(c+"is largest");
		}
		else{
			System.out.println(d+"is largest");
		}
		
	}

}