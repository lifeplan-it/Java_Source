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
      super("�t���[��");

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

	// addNotify() TextArea�̃s�A���쐬�B
	// appendText(String) �^����ꂽ�e�L�X�g���Ō�ɒǉ�����B
	// getColumns() TextArea���ɃJ��������Ԃ��B
	// getRows() TextArea���̍s����Ԃ��B
	// insertText(String, int) �w�肵���ʒu�Ɏw�肳�ꂽ�e�L�X�g��}������B
	// minimumSize(int, int) TextArea�̎w�肳�ꂽ�ŏ��T�C�Y��Ԃ��B
	// minimumSize() TextArea�̍ŏ��T�C�Y��Ԃ��B
	// paramString() ����TextArea��String�p�����[�^��Ԃ��B
	// preferredSize(int, int) TextArea�̎w�肳�ꂽ�s�ƃJ�����̃T�C�Y��Ԃ��B
	// preferredSize() TextArea�̐����T�C�Y��Ԃ��B
	// replaceText(String, int, int) �w�肳�ꂽ�n�_�ƏI�_�̊Ԃ̃e�L�X�g���w�肳�ꂽ�V�����e�L�X�g�Œu��������B
   }

   class GuiWindowListener extends WindowAdapter  {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
   }
}
