import java.awt.Graphics;
import java.awt.event.*;
import java.applet.*;
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
	String msg="";
	int mouseX=0,mousey=0;  //Coordinates of mouse
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void mouseEntered(MouseEvent me)
	{
		//save coordinates
		mouseX=0;
		mousey=10;
		msg="mouse entered";
		repaint();
	}

	//handle MouseExcited
	public void mouseExcited(MouseEvent me)
	{
		//save coordinates
		mouseX=0;
		mousey=10;
		msg="mouse exited";
		repaint();
	}

public void mousePressed(MouseEvent me)
{
	//save coordinates
	mouseX=me.getX();
	mousey=me.getY();
	msg="down";
	repaint();
}
//handle Mouse Released
public void mouseReleased(MouseEvent me)
{
	//save coordinates
	mouseX=me.getX();
	mousey=me.getY();
	msg="up";
	repaint();
}


public void mouseDragged(MouseEvent me)
{
	//save coordinates
	mouseX=me.getX();
	mousey=me.getY();
	msg="*";
	showStatus("dragging at"+mouseX+" "+mousey);
	repaint();
}
//handle Mouse moved
public void mouseMoved(MouseEvent me)
{
	showStatus("mouse moving at"+me.getX()+","+me.getY());
}

//Display message in applet window at current x, y location
public void paint(Graphics g)
{
	g.drawString(msg,mouseX,mousey);
}

@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
