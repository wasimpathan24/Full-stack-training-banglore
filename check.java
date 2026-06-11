/*in our each program there is a thread and this thread is exceuting our thread
as we know exceution is genrally done by a thread thats why a we 
have need of thraed at least 1 internal and external 
now this default thread is "main" that is "main" is a current thread always 
our code  

*/



class check
{

	public static void main (String args [])
	
	{
	
	System.out.print("My name is wasim :");
	Thread t= Thread.currentThread();
	System.out.print("Current thread is : "+t.getName());
	
	}

}