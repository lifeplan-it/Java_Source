// HelloJava_Class_extends.java

import java.awt.*;
import java.awt.event.*;

//�@���C���N���X
class HelloJava_Class_extends {
  public static void main(String[] args) {
        // �N���X      HelloGui�@���I�u�W�F�N�g��
        HelloJava_class obj = new HelloJava_class();
  }
}

// �T�u�N���X�@�@HelloGui
// �X�[�p�[�N���X�@Frame�@�N���X���g�����Ă��܂��B
class HelloJava_class extends Frame {
   // �R���X�g���N�^
   public HelloJava_class()  {

        // �^�C�g����\��
        this.setTitle("Frame Demo");

        // �ʒu�ƃT�C�Y�̑�����ݒ�
        this.setBounds(200, 200, 480, 240);

        // �\��/��\���@��\���ɐݒ�
        this.setVisible(true);

        // Label ���\�b�h���I�u�W�F�N�g��
        //  �\��������"Hello JAVA"�ɐݒ�
        Label  lb = new Label("Hello JAVA");

        // Label �I�u�W�F�N�g��Frame�ɒǉ�
        add(lb);

        // �}�E�X�C�x���g��ǉ�
        addWindowListener(new GuiWindowListener());
   }

   // Windows �A�_�v�^
   class GuiWindowListener extends WindowAdapter  {
      // �}�E�X�C�x���g�@Windows �̕���{�^���������ꂽ���̏���
      public void windowClosing(WindowEvent e) {
         // �I��
         System.exit(0);
      }
   }
}

