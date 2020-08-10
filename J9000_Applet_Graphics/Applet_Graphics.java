import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="test.class" width="200" height="200">
	</applet>
*/

public class test extends Applet{
	public static void main(String args[]) {
		test win = new test();
		win.appRun();
	}
	public void appRun() {
		Frame frm = new Frame("Kitty on your lap");
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frm.setSize(200 , 200);
		write(frm , "Kitty on your lap");
		frm.setVisible(true);
	}

	public void init() {
		write(this , "Card Captor Sakura");
	}
	public void write(Container com , String str) {
		com.add(new Label(str));
	}
}
