package applet;

import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;
/*<applet code="InnerClassDemo" width=200 height=100>
</applet>*/
public class adapter_inner extends Applet {
	int x,y;
public void init() {
addMouseListener(new MyMouseAdapter());
}
class MyMouseAdapter extends MouseAdapter {
public void mousePressed(MouseEvent me) {
showStatus("Mouse Pressed");
}
public void mouseClicked(MouseEvent me) {
showStatus("Mouse clicked");
x=me.getX();
y=me.getY();
repaint();
}


}
public void paint(Graphics g) {
	g.drawRect(0, 50, x, y);
	
	
	  
	g.drawString("("+x+","+y+")",100,100);
}
}