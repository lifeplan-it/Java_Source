import java.awt.*;
import java.awt.event.*;

class GraphicsFrame extends Frame {
    public GraphicsFrame() {
	setSize(200, 200);
	addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g) {
	g.drawLine(50,50,150,150);
	g.drawLine(50,150,150,50);
	g.drawRect(70,70,60,60);
	g.drawOval(50,50,100,100);
    }
}

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
	System.exit(0);
    }
}

public class GraphicsTest {
    public static void main(String[] args) {
	GraphicsFrame f = new GraphicsFrame();
	f.setVisible(true);
    }
}