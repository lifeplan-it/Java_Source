// Swing_Mouse_Base.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Swing_Mouse_Base extends JFrame {
  public static void main(String[] args){
	Swing_Frame_Main mg01 = new Swing_Frame_Main ();
  }
}

// フレームクラス
class Swing_Frame_Main extends JFrame {
  private  MGPanel  panel = null ;
  // コンストラクタ
  public Swing_Frame_Main () {
	// スーパークラスを呼び出す
	super();
	// ×ボタンが押されたら、終了する
	super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// レイアウト設定
	super.setLayout(new BorderLayout());
	// パネルを生成する
	panel = new MGPanel();
	// フレームのコンテントペインを置き換える
	super.setContentPane(panel);
	// フレームを表示
	super.setVisible(true);
	// サイズを最適化する
	super.pack();
  } // end MGFrame
}

// パネルクラス
class MGPanel extends JPanel {
  private	MGMouseAdapter	mgma	= null ;
  private	String	message	= null ;
  private	int	x	= 0 ;
  private	int	y	= 0 ;
  // コンストラクタ
  public MGPanel() {
	// スーパークラスを呼び出す
	super();
	// パネルサイズ
	super.setPreferredSize(new Dimension(800, 600));
	// レイアウト設定
	super.setLayout(null);
	// マウスアダプタを生成
	mgma = new MGMouseAdapter();
	// パネルにマウスリスナーを追加する
	super.addMouseListener(mgma);
  } // end MGPanel
  // 描画メソッド.
  // ペイントする必要があるときにこのメソッドを呼び出されます。
  public void paint(Graphics g){
	// 画面を塗りつぶす
	g.setColor(Color.black);
	g.fillRect(0, 0, 800, 600);

	// メッセージがある場合、
	if(message != null){
		// メッセージを描画する
		g.setColor(Color.yellow);
		g.drawString(message, x, y);
	}

   } // end paint

// マウスアダプタ
private class MGMouseAdapter extends MouseAdapter {
  //マウスが押された時に呼ばれます
  public void mousePressed(MouseEvent me){
	// マウスイベントの内容を出力
	message = "マウスが押されたよ";
	System.out.println(me);
	// 場所を記憶する
	x = me.getX();
	y = me.getY();
	// 描画する
	repaint();
  } //  end mousePressed

  // マウスが離された時に呼ばれます
  public void mouseReleased(MouseEvent me){
  	// マウスイベントの内容を出力
	message = "マウスが離されたよ";
	System.out.println(me);
	// 場所を記憶する
	x = me.getX();
	y = me.getY();
	// 描画する
	repaint();
  } //  end mouseReleased

  // マウスがクリックされた時に呼ばれます
  public void mouseClicked(MouseEvent me){
	// マウスイベントの内容を出力
	message = "マウスがクリックされたよ";
	System.out.println(me);
	// 場所を記憶する
	x = me.getX();
	y = me.getY();
	// 描画する
	repaint();
  } //  end mouseClicked
} // end MGMouseAdapter
}

