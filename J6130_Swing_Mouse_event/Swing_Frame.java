// Swing_Frame.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// フレームクラス
public class Swing_Frame extends JFrame {
	private	MGPanel	panel = null;

	public static void main(String[] args){
		MGFrame mg01 = new MGFrame();
	}

	// コンストラクタ
	public Swing_Frame() {

		// スーパークラスを呼び出す
		super();

		// ×ボタンが押されたら、終了する
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// レイアウト設定
		super.setLayout(new BorderLayout());

		// パネルを生成する
		// panel = new MGPanel();

		// フレームのコンテントペインを置き換える
		// super.setContentPane(panel);

		// フレームを表示
		super.setVisible(true);
		// サイズを最適化する
		super.pack();

	} // end MGFrame

}
