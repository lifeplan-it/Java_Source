// awtFrame_Events_Extend.java
// Frame �̕\��
// https://docs.oracle.com/javase/jp/8/docs/api/java/awt/Window.html
// public void setBounds(int x,int y,int width,int height)
// 	���̃R���|�[�l���g���ړ����A�T�C�Y�ύX���܂��B
// 	������̐V�����ʒu��x��y�ɂ���Ďw�肳��
//	�V�����T�C�Y��width��height�ɂ���Ďw�肳��܂��B
// setSize(int width, int height)
//	����width�ŁA������height�ɂȂ�悤��
//	���̃R���|�[�l���g�̃T�C�Y��ύX���܂��B
// setVisible(boolean b)
//	�p�����[�^b�̒l�ɉ�����
//	����Window��\���܂��͔�\���ɂ��܂��B
//
// �I���́@Ctrl + c
//

// awt ���C�u�����̃C���|�[�g
import java.awt.*;
import java.awt.event.*;

// Frame_Events�@�N���X���쐬
class awtFrame_Frame001 extends Frame {

   awtFrame_Frame001() {
	// awt��Fram���I�u�W�F�N�g��
	// Frame f1 = new Frame();

	//Frame001�̏����l�̒�`
	setBounds(200, 200, 100, 80);
	setSize(480, 240);
	setVisible(true);
	addWindowListener(new GuiWindowListener());

    }
}

class GuiWindowListener extends WindowAdapter  {
   public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
}

//���C���N���X
public class awtFrame_Events_Extend {
    public static void main(String [] args) {
	//awt���C�u������Frame���I�u�W�F�N�g��
        awtFrame_Frame001 af = new awtFrame_Frame001();

	af.setBackground(Color.cyan);
	af.setBounds(200, 500, 100, 80);
	af.setSize(480, 240);
	af.setVisible(true);

    }
}

