import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// パネルクラス
public class MGPanel extends JPanel {

	private		MGMouseAdapter		mgma		= null;

	private		String				message		= null;
	private		int					x			= 0;
	private		int					y			= 0;

	/**
	 * コンストラクタ
	 */
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

	/**
	 * 描画メソッド.
	 * <pre>
	 * ペイントする必要があるときにこのメソッドを呼び出されます。
	 * </pre>
	 */
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

	/**
	 * マウスアダプタ
	 */
	private class MGMouseAdapter extends MouseAdapter {

		/**
		 * マウスが押された時に呼ばれます
		 */
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

		/**
		 * マウスが離された時に呼ばれます
		 */
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

		/**
		 * マウスがクリックされた時に呼ばれます
		 */
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
