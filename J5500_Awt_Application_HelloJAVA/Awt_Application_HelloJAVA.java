// Source : Awt_Application_HelloJAVA.java
// Window　を作成して描画します。
// Window　には、テキストを入力して
// 入力した内容を再出力します。
// 「終了」ボタンを押すと終了します。

// awt ライブラリのインポート
import java.awt.*;
import java.awt.event.*;

//メインクラス:HelloJAVA
public class Awt_Application_HelloJAVA {
    //メインメソッド
    public static void main(String [] args) {

	// subFrame000 クラスをオブジェクト化
	subFrame000 obj001 = new subFrame000();

	// Frame 作画のメソッド呼び出し
	obj001.subFrame001(100,100);

    }
}

// クラス名:subFrame000
// 機能    ：　ウインドウを作成する。
// 性質    ：　
class subFrame000 extends Frame {

    //Class 変数の定義
    private Frame Frame1 ;    
    private Panel Panel1 ;
    private Label Label0 ;  
    private Label Label1 ;
    private TextField TextField1 ;
    private Button Button1 ;

    // コンストラクタ（ここではなにもしていません）
    subFrame000() {
	//setLayout(null);
	//addWindowListener(new FrameWindowListener());
    }

    void subFrame001(int x, int y) {

	Frame1 = new Frame() ;

	Frame1.setTitle("subFrame001");
	Frame1.setBounds(  x,  y, 350, 300);
	Frame1.setBackground(Color.LIGHT_GRAY);
	Frame1.setLayout(null);
	Frame1.setVisible(true);
	Frame1.addWindowListener(new FrameWindowListener());

	Panel1 = new Panel();

	Panel1.setBounds(30, 50, 290, 200);
	Panel1.setBackground(Color.BLUE);
	Panel1.setLayout(null);
	
	Label0 = new Label();

	Label0.setBounds(10, 10, 250,  20);
	Label0.setBackground(Color.BLUE);
	Label0.setForeground(Color.WHITE);
	Label0.setText("文字を入力してください" );
	Label0.setFont(new Font("Serif", Font.BOLD, 16));

	TextField1 = new TextField();

	TextField1.setBounds(10, 30, 250, 20);	
	TextField1.addActionListener(new TextActionListener());
	
	Label1 = new Label();

	Label1.setBounds(10, 100, 250,  20);
	Label1.setBackground(Color.WHITE);
	Label1.setForeground(Color.BLUE);
	Label1.setFont(new Font("Serif", Font.BOLD, 16));

	Button1 = new Button("終了");
	Button1.setBounds(80,180, 80, 20);
	Button1.addActionListener(new ButtonActionListener1());

	Frame1.add(Panel1);
	Panel1.add(Label0);
	Panel1.add(TextField1);
	Panel1.add(Label1);
	Panel1.add(Button1);

    }

    // TextFelde Eventの処理
    class TextActionListener implements ActionListener {
       public void actionPerformed(ActionEvent e) {
		Label1.setText(TextField1.getText());
      }
    }

    // Windows Eventの処理
    class FrameWindowListener extends WindowAdapter  {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
    }

    // Button Eventの処理
   class ButtonActionListener1 implements ActionListener {
	// actionPerformedをオーバーライド
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
      }
   }

}
