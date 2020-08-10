// awtFrameTextAreaMain.java

import java.awt.*;
import java.awt.event.*;

class awtFrameTextAreaMain {
  public static void main(String[] args) {
        Frame1 sm = new Frame1();
  }
}

class Frame1 extends Frame {
   
   private Label lb;

   public Frame1()  {
      super("フレーム");

      addWindowListener(new GuiWindowListener());

	setBounds(200, 200, 100, 80);
	setSize(480, 240);
	setVisible(true);
	setLayout(null);

        // TextField t1 = new TextField("Hello World!!");
        // add(t1);
	
	TextArea ta = new TextArea("Hello World!!",10,20);
	ta.setBounds(20, 50, 200, 80);
	add(ta);

	// addNotify() TextAreaのピアを作成。
	// appendText(String) 与えられたテキストを最後に追加する。
	// getColumns() TextArea内にカラム数を返す。
	// getRows() TextArea内の行数を返す。
	// insertText(String, int) 指定した位置に指定されたテキストを挿入する。
	// minimumSize(int, int) TextAreaの指定された最小サイズを返す。
	// minimumSize() TextAreaの最小サイズを返す。
	// paramString() このTextAreaのStringパラメータを返す。
	// preferredSize(int, int) TextAreaの指定された行とカラムのサイズを返す。
	// preferredSize() TextAreaの推奨サイズを返す。
	// replaceText(String, int, int) 指定された始点と終点の間のテキストを指定された新しいテキストで置き換える。
   }

   class GuiWindowListener extends WindowAdapter  {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
   }
}
