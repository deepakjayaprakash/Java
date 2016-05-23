	import java.awt.*; 
import java.awt.event.*;
import java.applet.*;
	public class button1 extends Applet implements ActionListener 
	{ 
		String msg = ""; Button yes, no, maybe;
	
 public void init() { 
	yes = new Button("Yes");
	no = new Button("No"); 
	maybe = new Button("Undecided"); add(yes); add(no); add(maybe); 
	yes.addActionListener(this); no.addActionListener(this); maybe.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		String str = ae.getActionCommand(); 
		if(str.equals("Yes")) { 
		msg = "That was to confuse you. You pressed No."; } 
		else if(str.equals("No")) { msg = "That was to confuse you You pressed YEs."; } 
		else { msg = "You pressed Undecided."; } repaint(); } 
		public void paint(Graphics g) { g.drawString(msg, 6, 100); }
		
		
	
			
		}
			
	
	
