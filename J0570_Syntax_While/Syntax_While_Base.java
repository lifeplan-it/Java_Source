// Syntax_While_Base.java
// �X�C�b�`���̎g����
// �L�[�{�[�h���琮������͂���
// �����ɉ������������Ԃ��B
// 0����͂�����I��
import java.util.Scanner;
class Syntax_While_Base {
   public static void main(String[] args)  {
	// �P��ڂ�while ���I�����Ȃ��l�ɏ�����
	int var = -1;
	// 0 �����͂����܂ŌJ��Ԃ�
	while ( var != 0 ) {
	    // �L�[�{�[�h�ǂݍ���
	    var = Input_Scanner_int () ;
	    // �l�@var  �ɉ�������������@str �ɕԂ�
	    String str = Syntax_Switch ( var ) ;
	    // Str �̏o��
	    System.out.println ( str ) ;
	}  // While �͏��������s���ďI��
   }
  // �����@res  �ɉ������������Ԃ�
  public static String Syntax_Switch ( int s ) {
         String res ;
         switch( s ){
         case 0:
            res = "�I�����܂��B";
            break;
         case 1:
            res = "����΂�܂��傤�B";
            break;
         case 2:
            res = "������������΂�܂��傤�B"  ;
            break;
         case 3:
            res = "����΂�܂����ˁB" ;
            break;
         case 4:
            res = "�����ւ�悭�ł��܂����B" ;
            break;
         case 5:
            res = "�ō��_�ł��B" ; 
            break;
         default:
            res = "0�A�P�`�T�̒l����͂��Ă��������B"  ;
            break;
        }
	return res ;
  }

  public static int Input_Scanner_int () {
	System.out.println("�L�[�{�[�h���琔������͂��Ă��������i 0�F�I���j");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	int num = Integer.parseInt(str);
      	// System.out.println("���͂��ꂽ�����u" + num  + "�v�ł�");
   	return num ;
  }
}
