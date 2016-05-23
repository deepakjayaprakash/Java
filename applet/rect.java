package applet;


import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class rect extends Applet {
int x,y;   
int flag=0;
public void init()
{
    addMouseListener(new myMouseListener());
    addMouseMotionListener(new myMouseMotionListener());
}
class myMouseListener extends MouseAdapter
{

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        super.mouseClicked(e);
        x=e.getX();
        y=e.getY();
        showStatus("Mouse Clicked");
        flag=0;
        repaint();
    }

   
}
class myMouseMotionListener extends MouseMotionAdapter
{
    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        super.mouseDragged(e);
        x=e.getX();
        y=e.getY();
        showStatus("Mouse Dragged");
        flag=1;
        repaint();
    }
   
}
public void paint(Graphics g)
{
    Rectangle r=new Rectangle(x,y,20,30);
    if(flag==1)
    g.fillRect((int)r.getX(), (int)r.getY(),(int) r.getWidth(), (int)r.getHeight());
    else
        g.drawLine(0, 0, x, y);
}
}