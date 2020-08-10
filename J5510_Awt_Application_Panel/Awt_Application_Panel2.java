// Awt_Application_Panel2.java

// awt ライブラリのインポート
import java.awt.*;
import java.awt.event.*;

//メインクラス
public class Awt_Application_Panel2 {
    public static void main(String [] args) {

	// Frame 作画のクラス呼び出し
        SubFrame000 sf000 = new SubFrame000();

	// Frame 作画のメソッド呼び出し
	sf000.SubFrame001(100,100);

	// Frame 作画のメソッド呼び出し
	sf000.SubFrame002(100,300);

    }
}

class SubFrame000 extends Frame {

    //Class 変数
    private Frame Frame1 ;    
    private Frame Frame2 ;    
    private Panel Panel1 ;
    private Panel Panel2 ;
    private Label Label1 ;
    private Label Label2 ;

    private TextField TextField1 ;
    private Button Button1 ;
    private Button Button2 ;

    SubFrame000() {
	//コンストラクタ
	// Frame001の初期値の定義

	//setLayout(null);
	//addWindowListener(new FrameWindowListener());
    }

    // SubFrame001　を作るメソッド
    void SubFrame001(int x, int y) {

	// Frame001の初期値の定義
	Frame1 = new Frame() ;
	Frame1.setTitle("SubFrame001");
	Frame1.setBounds(  x,  y, 480, 200);
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

    // SubFrame002　を作るメソッド
    void SubFrame002(int x, int y) {

	// Frame002の初期値の定義
	Frame2 = new Frame() ;
	Frame2.setTitle("SubFrame002");
	Frame2.setBounds(  x,  y, 480, 200);
	Frame2.setBackground(Color.LIGHT_GRAY);
	Frame2.setVisible(true);
	Frame2.setLayout(null);

	Panel2 = new Panel();
	Panel2.setBounds(30, 50, 400, 100);
	Panel2.setBackground(Color.YELLOW);
	Panel2.setLayout(null);

	Label2 = new Label();
	Label2.setBackground(Color.GREEN);
	Label2.setBounds(10, 50, 250,  20);

	Button1 = new Button("ボタン");
	Button1.setBounds(10,10, 80, 20);

	Button2 = new Button("終了");
	Button2.setBounds(80,80, 80, 20);

	Frame2.add(Panel2);
	Panel2.add(Button1);
	Panel2.add(Button2);
	Panel2.add(Label2);

	Frame2.addWindowListener(new FrameWindowListener());
	Button1.addActionListener(new ButtonActionListener1());
	Button2.addActionListener(new ButtonActionListener2());

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
		Label2.setText("テキストが入力された");
      }
    }

    // Button Eventの処理
   class ButtonActionListener1 implements ActionListener {
      public void actionPerformed(ActionEvent e) {
		// actionPerformedをオーバーライド
		Label2.setText("ボタンが押された");
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
