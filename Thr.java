/*current thread metod is used to get the curent thread o present working
thread. 

setName used to assign a specific name to the thread .
getName used to get name of the thread , by default it is thraed-0,thread-1,thread-
"we can also assign PRIORITY  to the thread "
*/




class Thr extends Thread
{

	public void run ()
	{
		Thread t=Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			System.out.print("\n\t\t"+i+"\t\t"+t.getName());
		
		}
	
	}

	public static void main(String args[])
	{
		Thr t1=new Thr();
		//t1.start();
		
		Thr t2=new Thr();
		//t2.start();
		
		Thr t3=new Thr();
		//t3.start();
		
		Thr t4=new Thr();
		//t4.start();
		
		Thr t5=new Thr();
		//t5.start();
		t1.setName("a");
		t2.setName("b");
		t3.setName("c");
		t4.setName("d");
		t5.setName("e");
		
	/*	t1.setPriority(7);
		t2.setPriority(10);
		t3.setPriority(5);
		t4.setPriority(8);
		t5.setPriority(2);
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		*/
		
		System.out.println("min :"+Thread.MIN_PRIORITY); //1
		System.out.println("max :"+Thread.MAX_PRIORITY);  //10
		System.out.println("normal :"+Thread.NORM_PRIORITY);//5
	}
	
	
}

