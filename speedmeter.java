// write a program create speedometer for 1 to 500.

class speedmeter
{
	public static void main(String s[])
	throws Exception
	{
		for(int i=1;i<=500;i++)
		{
			System.out.print("\r"+i);
			Thread.sleep(1000);
	
		}	
	}
	
}