// Output_print.java
// �W���o�͂̃T���v���v���O�����ł��B
//
// ���@�l�̃��e�����o�͂����郁�\�b�h
//    void Output_Numerical ()
// ������̃��e�����o�͂����郁�\�b�h
//    void Output_String_lf ()
// ���s���Ȃ��ŕ�����̃��e�����̏o�͂����郁�\�b�h
//    void Output_String
// ������̃��e�������������ďo�͂��郁�\�b�h
//    void Output_Add
//
// ���C���N���X
class Output_print {
  // ���C�����\�b�h
  public static void main(String[] args) {
    // �e���\�b�h�̌Ăяo��
    // ���@�l�̃��e�����o�͂����郁�\�b�h
    Output_Numerical();
    // ������̃��e�����o�͂����郁�\�b�h
	  Output_String_lf ();
    // ���s���Ȃ��ŕ�����̃��e�����o�͂����郁�\�b�h
    Output_String ();
    // ������̃��e�������������ďo�͂��郁�\�b�h
    Output_Add () ;
	}

  // ���@�l�̃��e�����o�͂����郁�\�b�h
  private static void Output_Numerical () {
    System.out.println("");
    System.out.println("���l���o�͂��o�͂��郁�\�b�h");

    System.out.println( 123 );
  }

  // ������̃��e�����o�͂����郁�\�b�h
  private static void Output_String_lf () {
    System.out.println("");
    System.out.println("������̃��e�����o�͂����郁�\�b�h");

    System.out.println("�悤����");
    System.out.println("Java��!");
  }

  // ���s���Ȃ��ŕ�����̃��e�����o�͂����郁�\�b�h
  private static void Output_String ()  {
    System.out.println("");
    System.out.println("���s���Ȃ��ŕ�����̃��e�����o�͂����郁�\�b�h");

    System.out.print("print��");
	  System.out.print("���s");
	  System.out.print("���Ȃ�");
	  System.out.println("");
  }

  // ������̃��e�������������ďo�͂��郁�\�b�h
  private static void Output_Add ()  {
    System.out.println("");
    System.out.println("��������������ă��e�����o�͂����郁�\�b�h");

	  System.out.println("������" + "+" + "��" + "�A������");
  }
}
