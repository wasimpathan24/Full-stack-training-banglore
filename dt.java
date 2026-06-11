import java.util.*;

class dt
{
	public static void main(String args [])
	throws Exception
	{
		Date d ; 
		//System.out.print(d);
		
		while(true)
		{
		d=new Date();
		
		System.out.print("\r"+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		Thread.sleep(1000);
		}
	
	}
	
}