/*in below pro we are creating 4 threads and each thread is performing diff
diff task . that is a actual concept of multiple theaing where multiple 
threads doing diff diff task parallely.
for diff diff task we have to create in single class not possible to create 
same ...
so in each class we have create diff diff run methods with diiff diff 
functining . and in last.....*/



class text extends Thread
{
	public void run()
	{
		for(int i=1;i<=7;i++)
		{
			System.out.print("\n\t\t\t Text Dowmload");
			
		}
		
		
	}
	
	
	
}
class image extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			
			System.out.print("\n\t\t image Downloding...");
		}
		
	}
}
class video extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=6;i++)
		{
			
			System.out.print("\n\t video Downloding...");
		}
		
	}
}

class audio extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			
			System.out.print("\n\t audio Downloding...");
		}
		
	}
}

class myThread 
{
	public static void main(String args [])
	{
		text t=new text();
		image i=new image();
		video v=new video();
		audio a=new audio();
		
		t.start();
		i.start();
		v.start();
		a.start();
		
		
		
	}	
	
}


