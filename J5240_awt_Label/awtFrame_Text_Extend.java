// awtFrame_Text_Extend.java
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

        super("�T���v��");
	
	//Frame001�̏����l�̒�`
	//setTitle("My Window Application");
	//setBackground(Color.cyan);
	//setBounds(200, 200, 100, 80);
	//setSize(480, 240);
	//setVisible(true);

	TextField t1 = new TextField("Hello World!!",60);
	t1.setForeground(Color.BLUE);
	t1.setFont(new Font("Serif", Font.BOLD, 24));
	t1.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(t1);

	//TextField t2 = new TextField(" scond ",60);
        //add(t2);
	
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
public class awtFrame_Text_Extend {
    public static void main(String [] args) {
	//awt���C�u������Frame���I�u�W�F�N�g��
        awtFrame_Frame001 af = new awtFrame_Frame001();

    }
}

