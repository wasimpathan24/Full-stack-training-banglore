import java.util.*;

class armstrongNumber
{

	void input()
	{
	
		int n,original,cb;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		n=sc.nextInt ;
		
	
	}
	
	void process()
	{
	
	    original = n;
        cb = 0;
		
		while(n!=0)
		{
		d=n%10;
		cb+=d*d*d;
		n=n/10;
		
		}
		
		if(original==cb)
		{
		System.out.print("Armstrong Number :");
		}
		else
		{
		System.out.print("Not Armstrong Number :");
		}
		
		
	}

}