// FileName : HelloJava_subClass.java
// Windows��Frame��\������T���v���v���O����
// HelloJava_Class_Main ���Ăяo������Ă��܂��B
// �i�P�Ƃł͓����܂���j

import java.awt.*;
import java.awt.event.*;

//  �N���X��`
// �N���X���F  HelloJava_subClass
public class HelloJava_Class extends Frame {
  // Label �N���X���i�[����ϐ�
  private Label lb;

  // HelloJava_Class_Main ����Ăяo����郁�\�b�h
  // ���\�b�h���F HelloJava_subClass_method

  public void HelloJava_Class ( )  {
	// �R���X�g���N�^
	// this.super�@( "Hello JAVA" ) ;
  }

  public void HelloJava_Class_method (String str )  {
    this.setTitle ( "Hello JAVA" );
    // �}�E�X�N���b�N���ꂽ���̃C�x���g
    addWindowListener(new GuiWindowListener());

    //Frame�̃^�C�g����������
    this.setTitle ( "Hello JAVA" );
    //Frame��\������ʒu�̐ݒ�
     this.setBounds(200, 200, 100, 80);
    //Frame�̃T�C�Y
     this.setSize(480, 240);
    //Frame�̃��C�A�E�g��CENTER�ɐݒ�
     this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    //Frame��\��
     this.setVisible(true);

    // Label ���C���X�^���X��
    lb = new Label( str );

    // �����̐F��ݒ�
    lb.setForeground(Color.BLUE);
    // �����̃t�H���g��ݒ�
    lb.setFont(new Font("Serif", Font.BOLD, 24));

    // Label �I�u�W�F�N�g��Frame �ɒǉ�
    this.add(lb);
 
   // �����̐F��ݒ�
   lb.setForeground(Color.BLUE);
   // �����̃t�H���g��ݒ�
   lb.setFont(new Font("Serif", Font.BOLD, 24));
   }

   class GuiWindowListener extends WindowAdapter  {
      // Windows�̕���{�^�������������̃C�x���g
      public void windowClosing(WindowEvent e) {
         // �I��
         System.exit(0);
      }
   }
}
