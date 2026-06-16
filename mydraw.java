import java.applet.*;
import java.awt.*;
import java.util.*;
//<applet code="mydraw" width="700" height="700">
//</applet>

public class mydraw extends Applet
{
	
	public void paint(Graphics g)
	{
		//g.drawLine(10,20,100,200);
		
      // g.drawRect(100,100,200,300);
	 //  g.drawOval(100,200,200,100);
	 // g.drawRect(100,200,200,100);
	  //g.drawOval(100,200,300,300);
	  //g.setColor(Color.red);
	  //g.fillRect(200,200,400,400);
	 // g.drawRect(100,100,400,400);
	 Color c;
	 int l,m,n;
	 int left,top;
	 left=0;
	 top=0;
	 l=m=n=0;
	 
	 Random r=new Random();
	 for(int i=1;i<=200;i++){
	  c= new Color(l,m,n);
	  g.setColor(c);
	  
	  l=r.nextInt(256);
	  m=r.nextInt(256);
	  n=r.nextInt(256);
	  
	 // g.drawOval(100+i,100+i,400-2*i,400-2*i);
		left=r.nextInt(400);
		top=r.nextInt(400);
	    g.fillOval(left,top,300,300);
	 
	  
	  try{Thread.sleep(200);}catch(Exception e){}
	  
	   // g.drawOval(100,100,200,200);
	
	}
	
	
}