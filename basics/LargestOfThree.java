class LargestOfThree {
	public static void main(String[] args) {
		int a=23;
		int b=25;
		int c=120;
		
		//i did
		//String largest; 
		//largest=(a>b)?(a+" is larger"):(b+" is larger");
		//largest=(b>c)?(b+" is larger"):(c+" is larger");
		//largest=(a>c)?(a+" is larger"):(c+" is larger");
		//System.out.println(largest);

		//sir told
		//int largest=a>b?a:b;
		//String output=(largest>c)?(largest+" is larger"):(c+" is larger");
		//System.out.println(output);
		
		//sir told
		int largest=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(largest+ "is larger");
		
	}
}