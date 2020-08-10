// Awt_Base_Frame.java

// awt ライブラリのインポート
import java.awt.*;
import java.awt.event.*;

//コントロールクラス
public class Awt_Base_Frame{
    public static void main(String [] args) {
	awtBaseMain();
    }

    public static void awtBaseMain() {
        mainFrame mF = new mainFrame();
	mF.mainFrame();
    }
}

class mainFrame extends Frame {

    //メンバ変数
    private Frame Frame1 ;    
    private Panel Panel1 ;
    private Label Label1 ;

    private TextField TextField1 ;
    private Button Button1 ;
    //コンストラクタ
    mainFrame() {
	// Frame001の初期値の定義
	//setLayout(null);
	//addWindowListener(new FrameWindowListener());
    }

    // メインソッド
    void mainFrame() {
	Frame1 = new Frame() ;
	Frame1.setTitle("SubFrame001");
	Frame1.setBounds(100,100, 480, 200);
	Frame1.setBackground(Color.LIGHT_GRAY);
	Frame1.setLayout(null);
	Frame1.setVisible(true);
	Frame1.addWindowListener(new FrameWindowListener());

	Panel1 = new Panel();
	Panel1.setBounds(30, 50, 400, 100);
	Panel1.setBackground(Color.BLUE);
	Panel1.setLayout(null);

	TextField1 = new TextField();
	TextField1.setBounds(10, 10, 250, 20);	
	TextField1.addActionListener(new TextActionListener());
	
	Label1 = new Label();
	Label1.setBounds(10, 40, 250,  20);
	Label1.setBackground(Color.WHITE);
	Label1.setForeground(Color.BLUE);
	Label1.setFont(new Font("Serif", Font.BOLD, 16));

	Frame1.add(Panel1);
	Panel1.add(TextField1);
	Panel1.add(Label1);

	TextField1.addActionListener(new TextActionListener());
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
   class ButtonActionListener1 implements ActionListener {
      public void actionPerformed(ActionEvent e) {
		// actionPerformedをオーバーライド
		// Label2.setText("ボタンが押された");
      }
   }

    // Button Eventの処理
   class ButtonActionListener2 implements ActionListener {
      public void actionPerformed(ActionEvent e) {
		// actionPerformedをオーバーライド
		System.exit(0);
      }
   }

}
