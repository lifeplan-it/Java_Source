// Awt_Frame_Method.java
// awt �N���X���C�u�������C���|�[�g���܂��B
import java.awt.* ;

// ���C���N���X���쐬���܂��B
public class Awt_Frame_Method {
  // ���C�����\�b�h���쐬���܂��B
  public static void main (String [] arge) {
	// �I�u�W�F�N�g����郁�\�b�h���Ăяo���܂��B
	mainFrame ();
  }

  // �I�u�W�F�N�g����郁�\�b�h�����܂��B
  public static void mainFrame(){
	// awt ���C�u�����̒���Frame�N���X���I�u�W�F�N�g�����܂��B
	Frame f = new Frame( "mainFrame" ) ;
	// Frame �̕\���ʒu���w�肵�܂��B
	f.setBounds( 200, 200, 480, 240);
	// Frame �̕��ƍ��������߂܂��B
	f.setSize ( 480, 240 ) ;
	// Frame ��\������ݒ��ON�ɂ��܂��B
	f.setVisible ( true ) ;
  }
}








