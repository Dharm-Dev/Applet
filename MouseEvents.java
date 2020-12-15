import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
	<applet code="DemoEvent" width=300 height=200>
	</applet>
*/
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener{
	int x=0,y=0;
	int rectX=50,rectY=50;
	int leng=200,width=100;
	String msg;
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent e){
		showStatus("Inside Applet Window.");	
	}
	public void mouseMoved(MouseEvent e){
		x=e.getX();
		y=e.getY();
		if((x>=rectX&&x<(rectX+leng))&&(y>rectY&&y<(rectY+width))){
			msg="Inside Rectangle.";
		}
		else{
			msg="Outside Rectangle";
		}
		repaint();
	}
	
	public void start(){
		setForeground(Color.red);
		showStatus("Mouse Events");
	}
	public void paint(Graphics g){
			
			g.fillRect(rectX,rectY,leng,width);
			g.drawString(msg,25,35);
	}
	public void mouseExited(MouseEvent e){
		showStatus("Outside Applet Window.");
		// msg="OutSide Applet Window";
		// msg="OutSide Applet Window";
		// repaint();
	}
	public void mouseDragged(MouseEvent e){
		// x=e.getX();
		// y=e.getY();
		// msg="Mouse Draged at coordinate ("+x+","+y+").";
		// showStatus(msg);
		// repaint();
	}
	public void mouseReleased(MouseEvent w){

	}
	public void mousePressed(MouseEvent e){

	}
	public void mouseClicked(MouseEvent e){
		

	}
	public void destroy(){

	}
}