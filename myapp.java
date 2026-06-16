import java.applet.*;
import java.awt.*;

/*<applet code="myapp" width="700" height="700">
</applet>
*/

public class myapp extends Applet
{
	public void paint(Graphics g)
		
	
	{	
		showStatus("this is message for status bar");
		Color c=new Color(255,110,100);
	
		setBackground(c);
		g.setColor(Color.cyan);
		g.drawString("my name is wasim  ",100,200);
		g.setColor(Color.red);
		g.drawString("city : bhilwara ",100,220);
	
	}
}