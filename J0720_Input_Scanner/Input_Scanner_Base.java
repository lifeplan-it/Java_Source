// Java �L�[�{�[�h���́iScanner�j
// Input_Scanner_Base.java
import java.util.Scanner;
class Input_Scanner_Base {
  public static void main(String[] args) {
	String str = Input_Scanner_str () ;
      	System.out.println("���͂��ꂽ�����́u" + str + "�v�ł�");

	int num = Input_Scanner_int () ;
      	System.out.println("���͂��ꂽ�����u" + num  + "�v�ł�");
  }

  public static String Input_Scanner_str () {
	System.out.println("�L�[�{�[�h���當������͂��Ă�������");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
      	// System.out.println("���͂��ꂽ�����́u" + str + "�v�ł�");
   	return str ;
  }

  public static int Input_Scanner_int () {
	System.out.println("�L�[�{�[�h���琔������͂��Ă�������");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	int num = Integer.parseInt(str);
      	// System.out.println("���͂��ꂽ�����u" + num  + "�v�ł�");
   	return num ;
  }
}
