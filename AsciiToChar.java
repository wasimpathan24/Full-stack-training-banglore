import java.util.*;

class AsciiToChar
{
	public static void main(String args[])
	{  	int ascii;
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ASCII Value : ");
		ascii=sc.nextInt();
		
		System.out.print("ASCII Value is  : "+(char)ascii);
		
		
	}
}