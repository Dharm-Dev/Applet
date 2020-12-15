import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
	<applet code="KeysEvent" width=300 height=200>
	</applet>
*/
public class KeysEvent extends Applet implements KeyListener{
	int a=40,b=50;
	String msg="";
	public void init(){
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent k){
		showStatus("Key Pressed.");	
	}
	public void keyReleased(KeyEvent k){
		showStatus("Key Release.");	
	}
	public void keyTyped(KeyEvent k){
		msg+=k.getKeyChar();
		showStatus("Key Typed.");
		repaint();	
	}
	
	public void start(){
		setForeground(Color.red);
		showStatus("Key Events.");
	}
	public void paint(Graphics g){
			g.drawString(msg,a,b);
	}
	public void destroy(){

	}
}