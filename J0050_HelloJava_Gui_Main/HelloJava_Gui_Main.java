// HelloJava_Gui_Main.java
// �T�v
// �@�@Frame�ɕ������o�͂���v���O����

import java.awt.*;		// GUI�p���C�u�����̗��p�̒�`
import java.awt.event.*;	// GUI�p�C�x���g���C�u�����̒�`

class HelloJava_Gui_Main  {	// ���C���N���X
  public static void main(String[] args) {			// ���C�����\�b�h
	HelloJava_Gui_Method () ;
  }
  public static void HelloJava_Gui_Method () {		// GUI�p���\�b�h
  	HelloJava_Gui_subClass obj 
	     = new HelloJava_Gui_subClass ();		// �N���X�̃I�u�W�F�N�g��        

	String str = "Hello JAVA!!" ;			// �����̏�����
	obj.HelloJava_Gui_subClass_method ( str ) ;	//  �I�u�W�F�N�g�������N���X�̎��s
  }
}
// HelloJava_Gui_subClass.java
class HelloJava_Gui_subClass extends Frame {		// �N���X�̒�`
						// Frame�N���X���p�����Ă���B
  private Label lb;					// �C���X�^���X�ϐ��̒�`
  public void HelloJava_Gui_subClass ( )  {		// �R���X�g���N�^�̒�`
	// this.super�@( "Hello JAVA" ) ;			// ���̃N���X�ł͉������Ȃ�
  }

  public void HelloJava_Gui_subClass_method (String str )  { // ���C���N���X����Ăяo����郁�\�b�h

	setTitle ( "Hello JAVA" );			// �^�C�g����`
	setBounds(200, 200, 100, 80);			// Frame�̃T�C�Y�̒�`
	setSize(480, 240);				// Frame�̃T�C�Y�̒�`
	setLayout(null) ; 				// ���C�A�E�g�}�l�[�W���[�̒�`
	setVisible(true);				// �\���̎w��

	lb = new Label( str );			// ���x���̒�`�i�����@str �j���g�p
	lb.setBounds(10, 50, 250,  20);		// ���x���̈ʒu��`
	lb.setForeground(Color.BLUE);		// �����̐F
	lb.setFont(new Font("Serif", Font.BOLD, 24));	// �\��Font�̐ݒ�

	add(lb);					// Frame��Label��ǉ�
	addWindowListener(new GuiWindowListener());	// �C�x���g���X�i�̒�`
  }

   class GuiWindowListener extends WindowAdapter  {	// �C�x���g�̏���
      public void windowClosing(WindowEvent e) {		// Close �C�x���g�̎擾
         System.exit(0);					// �I��
      }
   }
}
