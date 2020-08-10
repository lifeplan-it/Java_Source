// Awt_Application_Text.java
// awt ライブラリのインポート
import java.awt.*;
import java.awt.event.*;

//メインクラス
public class Awt_Application_Text  {
    public static void main(String [] args) {
	// Frame 作画のクラス呼び出し
	SubFrame000 sf000 = new SubFrame000();

	// Frame 作画のメソッド呼び出し
	sf000.SubFrame001(100,100);
    }
}

class SubFrame000 extends Frame {

    //Class 変数
    private Frame Frame1 ;    
    private Panel Panel1 ;
    private Label Label1 ;
    private TextField TextField1 ;
    private Button Button1 ;

    SubFrame000() {
	//コンストラクタ
	//setLayout(null);
	//addWindowListener(new FrameWindowListener());
    }

    // LabelとTextFildeのForme
    void SubFrame001(int x, int y) {
	int PanelX = 50 ;
	int PanelY = 100 ;
	int PanelW = 400 ;
	int PanelH  = 300 ;

	// Frame001の初期値の定義
	Frame1 = new Frame() ;
	Frame1.setTitle("Frame001");
	Frame1.setBounds(  x,  y, 500, 500);
	Frame1.setBackground(Color.WHITE);
	Frame1.setLayout(null);
	Frame1.setVisible(true);
	Frame1.addWindowListener(new FrameWindowListener());

	Panel1 = new Panel();
	Panel1.setBounds(PanelX, PanelX, PanelW, PanelH);
	Panel1.setBackground(Color.YELLOW);
	Panel1.setLayout(null);

	TextField1 = new TextField();
	TextField1.setBounds(10, 100, 250, 20);	
	TextField1.addActionListener(new TextActionListener());
	
	Label1 = new Label();
	Label1.setBounds(10, 150, 250,  20);
	Label1.setBackground(Color.WHITE);
	Label1.setForeground(Color.BLUE);
	Label1.setFont(new Font("Serif", Font.BOLD, 16));

	Button1 = new Button("終了");
	Button1.setBounds(200,200, 80, 20);

	Frame1.add(Panel1);
	Panel1.add(TextField1);
	Panel1.add(Label1);
	Panel1.add(Button1);

	TextField1.addActionListener(new TextActionListener());
	Button1.addActionListener(new ButtonActionListener());
    }

    // Windows Eventの処理
    class FrameWindowListener extends WindowAdapter  {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
    }

    // TextFelde Eventの処理
    class TextActionListener implements ActionListener {
       public void actionPerformed(ActionEvent e) {
		Label1.setText(TextField1.getText());
      }
    }

    // Button Eventの処理
   class ButtonActionListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
		System.exit(0);
		// Label2.setText("ボタンが押された");
      }
   }

}
