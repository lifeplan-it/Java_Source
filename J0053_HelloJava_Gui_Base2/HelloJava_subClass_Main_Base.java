// HelloJava_subClass_Main_Base.java
// �T�v
//      HelloJava_subClass_Base�ō쐬�����T�u�N���X���g�p����
// �ړI
//      �N���X�t�@�C�������p���ł��鎖�̊m�F������B
// �@�@�N���X�ɑ΂��Ĉ����istr �j�Ńf�[�^��n���鎖���m�F����B
 
import java.awt.*;		// GUI�p���C�u�����̒�`
import java.awt.event.*;	// GUI�p�C�x���g���C�u�����̒�`

class HelloJava_subClass_Main_Base  {	// ���C���N���X
  public static void main(String[] args) {		// ���C�����\�b�h
        HelloJava_subClass_Base obj = new HelloJava_subClass_Base(); // �N���X�̃I�u�W�F�N�g��        
        String str = "Hello JAVA!!" ;		// �����̏�����
        obj.HelloJava_subClass_method( str ) ;	//  �I�u�W�F�N�g�������N���X�̎��s
  }
}
