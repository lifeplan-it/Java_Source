// HelloJava_Gui_Main.java
// �T�v
// �@�@Frame�ɕ������o�͂���v���O����

// ���C���N���X
class HelloJava_Gui_Main
{
  // ���C�����\�b�h
  public static void main(String[] args)
  {
     // ���\�b�h            
     HelloJava_Gui_Method () ;
  }

  // ���\�b�h
  public static void HelloJava_Gui_Method ()
  {
      // �N���X�̃C���X�^���X��        
      HelloJava_Gui_subClass obj = new HelloJava_Gui_subClass ();
      // �����̏�����
      String str = "Hello JAVA!!" ;
      //  �I�u�W�F�N�g���������\�b�h�̎��s
      obj.HelloJava_Gui_subClass_method ( str ) ;
  }
}
// GUI�p���C�u�����̗��p�̒�`
import java.awt.*;
// GUI�p�C�x���g���C�u�����̒�`
import java.awt.event.*;

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
    // �^�C�g����`
    setTitle ( "Hello JAVA" );
    // Frame�̃T�C�Y�̒�`
    setBounds(200, 200, 100, 80);
    // Frame�̃T�C�Y�̒�`
    setSize(480, 240);
    // ���C�A�E�g�}�l�[�W���[�̒�`
    setLayout(null) ; 
    // �\���̎w��
    setVisible(true);

    // ���x���̒�`�i�����@str �j���g�p
    lb = new Label( str );
    // ���x���̈ʒu��`
    lb.setBounds(10, 40, 250,  20);
    // �����̐F
    lb.setForeground(Color.BLUE);
    // �\��Font�̐ݒ�
    lb.setFont(new Font("Serif", Font.BOLD, 24));

    // Frame��Label��ǉ�
    add(lb);
    // �C�x���g���X�i�̒�`
    addWindowListener(new GuiWindowListener());
  }

   // �C�x���g�̏���
   class GuiWindowListener extends WindowAdapter
   {
      // Close �C�x���g�̎擾
      public void windowClosing(WindowEvent e)
      {
         // �I��
         System.exit(0);
      }
   }
}

