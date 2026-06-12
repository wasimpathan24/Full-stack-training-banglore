class cmprCmdLineArgu
{
	public static void main(String s[])
	{	
	
		String n1=s[0],n2=s[1];
		
	int	a=Integer.parseInt(n1);
	int	b=Integer.parseInt(n2);
		
		if(a>b)
		{
			System.out.print(a+ "is greatest ");
		}
		else if(a<b)
		{
			System.out.print(b+ "is greatest ");
		}	
		else 
		{
				System.out.print( "equal");
		}
	}

}