import java.util.*;

class att  extends Thread
{
	int a,b,c;
	void input()
	{
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		a=sc.nextInt();
	    System.out.print("Enter second number : ");
		b=sc.nextInt();
	
	
	}
	
	void process()
	{
		c=a+b;
	
	}
	
	void display()
	{
	
		System.out.print("sum is : "+c);
	
	}
	
	public void run()
	{
		
/*	for(int i=0;i<5;i++)
		{
			
			System.out.print("display "+i);
			
		}*/
		
		input();
		process();
		display();
		
		Thread t=Thread.currentThread();
		

	}
	public static void main(String args[])
	{
		att a2=new att();
		att a1=new att();
		att a3=new att();
		att a4=new att();
		att a5=new att();
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
	
	}

}