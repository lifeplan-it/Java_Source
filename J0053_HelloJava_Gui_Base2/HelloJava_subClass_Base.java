// HelloJava_subClass_Base.java
// �T�v
// �@�@Frame�ɕ������o�͂���v���O����
// �@�@HelloJava_Class_Main ���Ăяo������Ă��܂��B
// �@�@�i�P�Ƃł͓����܂���j
// �ړI
//      �e�̃N���X�ŃI�u�W�F�N�g�������N���X�̍쐬���w�т܂��B
//      �N���X�̊g���̃C���[�W���w�т܂��B

import java.awt.*;		// GUI�p���C�u�����̗��p�̒�`
import java.awt.event.*;	// GUI�p�C�x���g���C�u�����̒�`

public class HelloJava_subClass_Base extends Frame {	// �N���X�̒�`
						// Frame�N���X���p�����Ă���B
  private Label lb;					// �C���X�^���X�ϐ��̒�`
  public void HelloJava_subClass_Base ( )  {		// �R���X�g���N�^�̒�`
	// this.super�@( "Hello JAVA" ) ;			// ���̃N���X�ł͉������Ȃ�
  }

  public void HelloJava_subClass_method (String str )  {	// ���C���N���X����Ăяo�����N���X��`
    this.setTitle ( "Hello JAVA" );			// �^�C�g����`
    addWindowListener(new GuiWindowListener());		// �C�x���g���X�i�̒�`

    this.setBounds(200, 200, 100, 80);			// Frame�̃T�C�Y�̒�`
    this.setSize(480, 240);				// Frame�̃T�C�Y�̒�`
    this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // ���C�A�E�g�}�l�[�W���[�̒�`
    this.setVisible(true);				// �\���̎w��

    lb = new Label( str );				// ���x���̒�`�i�����@str �j���g�p
    lb.setForeground(Color.BLUE);			// �����̐F
    lb.setFont(new Font("Serif", Font.BOLD, 24));		// �\��Font�̐ݒ�

    this.add(lb);					// Frame��Label��ǉ�
  }

   class GuiWindowListener extends WindowAdapter  {	// �C�x���g�̏���
      public void windowClosing(WindowEvent e) {		// Close �C�x���g�̎擾
         System.exit(0);					// �I��
      }
   }
}
