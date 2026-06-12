// COMMAND LINE ARGUMENTS 

class cl 
{
	public static void main (String s[])
	{
		String a=s[0],b=s[1];
		
		int c =Integer.parseInt(a)+Integer.parseInt(b);
		int d =Integer.parseInt(a)-Integer.parseInt(b);
		int e =Integer.parseInt(a)*Integer.parseInt(b);
		int f =Integer.parseInt(a)/Integer.parseInt(b);
	
	
		System.out.println("Sum is : " +c);
		System.out.println("Sum is : " +d);
		System.out.println("Sum is : " +e);
		System.out.println("Sum is : " +f);
		
		
	}
}


