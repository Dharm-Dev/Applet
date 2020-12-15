/*WAP to display ‘in the status bar’ of applet window 
and display ‘in the applet window’. */
import java.awt.*;
import java.applet.*;
/*
<applet code="SampleApplet" width=300 height=50>
</applet>
*/
public class SampleApplet extends Applet{
	String msg;
	public void init() {
		setBackground(Color.red);
		setForeground(Color.white);
		msg = "In the Applet Window.";
	}
	// Display msg in applet window.
	public void paint(Graphics g) {	
		g.drawString(msg, 10, 30);
		showStatus("In the Status Bar.");
	}
}