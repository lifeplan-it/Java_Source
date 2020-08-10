// Awt_Main_Base.java
// awt ライブラリのインポート
import java.awt.*;
//メインクラス
public class Awt_Main_Base {
    public static void main(String [] args) {
	Awt_Main_method();
    } 

    public static void Awt_Main_method() {
	Awt_Main_Frame Main_Frame = new Awt_Main_Frame ();
	Main_Frame.showFrame();
    } 
}

class Awt_Main_Frame extends Frame {
	public static void Awt_Frame () {
		 // Frame MainFrame = new Frame("appFrame");
	}

	public static void showFrame () {
		Frame MainFrame = new Frame("appFrame");
		MainFrame.setBounds(200, 200, 100, 80);
		MainFrame.setSize(480, 240);
		MainFrame.setVisible(true);
	}
}

