/*
# Java �W���o��
# ���
�@�W���o�͂Ƃ́A���̃V�X�e���Ō��߂Ă�o�͑��u�ł��B
  �p�\�R���ł́A�R���\�[����W���ɂ��Ă��܂��B

# ��{�\��
   �W���o�́i���s�t���j
   System.out.println ;

   �W���o�́i���s�����j
   System.out.print ;

# �T���v���v���O����
## �\�[�X�t�@�C��
  Output_print_Base.java
## �N���X
  Output_print_Base
### ���@�l�̃��e�����o�͂����郁�\�b�h
    void Output_Numerical ()
### ������̃��e�����o�͂����郁�\�b�h
    void Output_String_lf ()
### ���s���Ȃ��ŕ�����̃��e�����̏o�͂����郁�\�b�h
    void Output_String
### ������̃��e�������������ďo�͂��郁�\�b�h
    void Output_Add
*/

// ���C���N���X
class Output_print {
  // ���C�����\�b�h
  public static void main(String[] args)
  {
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
  private static void Output_Numerical ()
  {
    System.out.println("");
    System.out.println("���l���o�͂��o�͂��郁�\�b�h");

    System.out.println( 123 );
  }

  // ������̃��e�����o�͂����郁�\�b�h
  private static void Output_String_lf ()
  {
    System.out.println("");
    System.out.println("������̃��e�����o�͂����郁�\�b�h");

    System.out.println("�悤����");
    System.out.println("Java��!");
  }

  // ���s���Ȃ��ŕ�����̃��e�����o�͂����郁�\�b�h
  private static void Output_String ()
  {
    System.out.println("");
    System.out.println("���s���Ȃ��ŕ�����̃��e�����o�͂����郁�\�b�h");

    System.out.print("print��");
	  System.out.print("���s");
	  System.out.print("���Ȃ�");
	  System.out.println("");
  }

  // ������̃��e�������������ďo�͂��郁�\�b�h
  private static void Output_Add ()
  {
    System.out.println("");
    System.out.println("��������������ă��e�����o�͂����郁�\�b�h");

	  System.out.println("������" + "+" + "��" + "�A������");
  }
}
