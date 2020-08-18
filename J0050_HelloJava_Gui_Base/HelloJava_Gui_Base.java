// HelloJava_Gui_Base.java
// �T�v
// �@�@Frame�ɕ������o�͂���v���O����

// GUI�p���C�u�����̗��p�̒�`
import java.awt.*;
// GUI�p�C�x���g���C�u�����̒�`
import java.awt.event.*;

// ���C���N���X
class HelloJava_Gui_Base
{
  // ���C�����\�b�h
  public static void main(String[] args)
  {
	HelloJava_Gui_Method () ;
  }

  // �������\�b�h
  public static void HelloJava_Gui_Method ()
  {
      // �N���X�̃I�u�W�F�N�g��        
      HelloJava_Gui_subClass obj = new HelloJava_Gui_subClass ();
      // �����̏�����
      String str = "Hello JAVA!!" ;
      //  �I�u�W�F�N�g���������\�b�h�̎��s
      obj.HelloJava_Gui_subClass_method ( str ) ;
  }
}

// ���C�u�����̃N���X���g�����T�u�N���X�̍쐬
// HelloJava_Gui_subClass.java
// �N���X�̒�`
// Frame�N���X���p�����Ă���B
class HelloJava_Gui_subClass extends Frame
{
  // �C���X�^���X�ϐ��̒�`
  private Label lb;
  // �R���X�g���N�^�̒�`
  public void HelloJava_Gui_subClass ( )
  {
     // ���̃N���X�ł͉������Ȃ�
     // this.super�@( "Hello JAVA" ) ;
  }

 // ���C���N���X����Ăяo����郁�\�b�h
  public void HelloJava_Gui_subClass_method (String str )
  {
      setTitle ( "Hello JAVA" );			// �^�C�g����`
      setBounds(200, 200, 100, 80);		// Frame�̃T�C�Y�̒�`
      setSize(480, 240);			// Frame�̃T�C�Y�̒�`
      setLayout(null) ; 				// ���C�A�E�g�}�l�[�W���[�̒�`
      setVisible(true);				// �\���̎w��

      lb = new Label( str );			// ���x���̒�`�i�����@str �j���g�p
      lb.setBounds(10, 40, 250,  20);		// ���x���̈ʒu��`
      lb.setForeground(Color.BLUE);		// �����̐F
      lb.setFont(new Font("Serif", Font.BOLD, 24));	// �\��Font�̐ݒ�

      add(lb);				// Frame��Label��ǉ�
      addWindowListener(new GuiWindowListener());	// �C�x���g���X�i�̒�`
  }

   // �C�x���g�̏���
   class GuiWindowListener extends WindowAdapter
   {
      // Close �C�x���g�̎擾
      public void windowClosing(WindowEvent e)
      {
         System.exit(0);				// �I��
      }
   }
}
