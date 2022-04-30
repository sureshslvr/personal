package practice;

//Java code for above implementation
class GFG
{
static int numberOf2sinRange(int n)
{
	String s = "";
	for(int i = 0; i < n + 1; i++)
	s += String.valueOf(i);	
	int count = 0;
	for(int i = 0; i < s.length(); i++)
	{
	if(s.charAt(i) == '2')
	{
		count++;
	}
	}
	return count;
}

//Driver code
public static void main(String[] args) {
	int n = 30;
	System.out.println(numberOf2sinRange(n));
}
}

//This code is contributed by divyesh072019

