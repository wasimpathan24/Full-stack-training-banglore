class div
{
	public static void main(String s[])
	{
		int a,b,c;
		try{
		
		a=Integer.parseInt(s[0]);
		b=Integer.parseInt(s[1]);
		
		System.out.println((a+b));
		System.out.println((a-b));
		System.out.println((a*b));
		System.out.println((a/b));
		
	
		
		}
		catch(ArithmeticException e)
		{
			System.out.print("dont enter 0 " +e.getMessage());
			
		}	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("please enter 2 values");
		
			
		}
		catch(NumberFormatException e)
		{
			System.out.print("give me integer :");
			
		}
		catch(Exception e)
		{
			System.out.print(e);
			
		}
		finally 
		{
			
		System.out.println("Thanks ");
	    System.out.println("visit again ");
		
		}
		
		
		
		
		
	}
	
	

}