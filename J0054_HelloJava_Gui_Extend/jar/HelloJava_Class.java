// FileName : HelloJava_Class.java
// Windows��Frame��\������T���v���v���O����
// HelloJava_Class_Main ���Ăяo������Ă��܂��B
// �i�P�Ƃł͓����܂���j

import java.awt.*;
import java.awt.event.*;

//  �N���X��`
// �N���X���F  HelloJava_Class
public class HelloJava_Class {
  // Label �N���X���i�[����ϐ�
  private Label lb;

  // HelloJava_Class_Main ����Ăяo����郁�\�b�h
  // ���\�b�h���F HelloJava_Class
  public void HelloJava_Class ( str  )  {
      // �R���X�g���N�^
      public void HelloJava_Class_method (String str )  {
      	// this.super�@( "Hello JAVA" ) ;
    	this.setTitle ( "Hello JAVA" );
    	// �}�E�X�N���b�N���ꂽ���̃C�x���g
    	addWindowListener(new GuiWindowListener());

    //Frame��\������ʒu�̐ݒ�
     this.setBounds(200, 200, 100, 80);
    //Frame�̃T�C�Y
     this.setSize(480, 240);
    //Frame��\��
     this.setVisible(true);
    //Frame�̃��C�A�E�g��CENTER�ɐݒ�
     this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

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
