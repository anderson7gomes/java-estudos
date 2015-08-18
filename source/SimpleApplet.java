import java.applet.Applet;
import java.awt.Graphics;

/*
   <applet code="SimpleApplet" width="200" height="60"></applet>
*/

public class SimpleApplet extends Applet {

	public void paint(Graphics g) {
	
		g.drawString("Hello Applet", 20, 20);
	
	} // end paint method

} // end SimpleApplet class
