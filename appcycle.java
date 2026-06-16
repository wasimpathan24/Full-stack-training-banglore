import java.applet.*;
import java.awt.*;

//<applet code="appcycle" width="700" height="700">
//</applet>


public class appcycle extends Applet
{	

	public void init()
	{	
		showStatus("i am in init method");
		try{Thread.sleep(2000);}catch(Exception e){}
		
	}
	
	public void start()
	{
		showStatus("i am in start method");
		try{Thread.sleep(2000);}catch(Exception e){}
		
	}
	public void paint (Graphics g)
	{
		showStatus("i am in paint method");
		try{Thread.sleep(2000);}catch(Exception e){}
		g.drawString("hello ",100,200);
	
	
	}
	public void stop()
	{
		showStatus("i am in stop method");
		try{Thread.sleep(2000);}catch(Exception e){}
		
	}
	public void destroy()
	{
		showStatus("i am in destroy method");
		try{Thread.sleep(2000);}catch(Exception e){}
		
	}
	
} 