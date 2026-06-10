import java.util.*;

class StringAscii
{
	public static void main(String args[])
	{
		String s;
		char ch;
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter string : ");
		s=sc.next();
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			
			System.out.print((int) ch+ " ");
		
		}
	
	}

}