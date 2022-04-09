class AtoZ {
	public static void main(String [] args) {
		//wap to print 'A' to 'Z'
		char ch='A';
		while(true){
			System.out.println(ch++);
			if(ch=='Z'){
				break;
			}
		}
	}
}