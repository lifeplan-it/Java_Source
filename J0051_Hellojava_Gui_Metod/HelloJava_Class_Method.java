// HelloJava_Class_Method.java
// Windows��Frame��\������T���v���v���O����
// ���ɃR���p�C�����ꂽ�N���X���C���X�^���X�����܂��B
// �C���X�^���X������N���X�F HelloJava_Class 

import java.awt.*;
import java.awt.event.*;

// ���C���N���X�̒�`
class HelloJava_Class_Method {
// ���C�����\�b�h�̒�`
  public static void main(String[] args)
  {
     HelloJava_Class_sub () ;
  }

  public static void HelloJava_Class_sub ()
  {
     Frame Frame1 = new Frame() ; 
     Frame1.setTitle("Frame_method");
     Frame1.setBounds(100, 100, 320, 240 );

     Label Label1 = new Label( "Hello JAVA!!" );
     
     Frame1.add( Label1 );
     Frame1.setVisible(true);
  }
}