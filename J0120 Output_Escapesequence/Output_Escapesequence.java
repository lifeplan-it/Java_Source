/*
# Java �G�X�P�[�v�V�[�P���X�o��
# ���
 �p���ȊO�̕������o�͂��������Ɏg�p���܂��B

# ��ȃG�X�P�[�v�V�[�P���X
|�L�q|����|���e|
|:----:|:---|:-----:|
| \b | BS |  �o�b�N�X�y�[�X(Back Space) |
| \t | TAB |	�����^�u(TAB) |
| \n | LF  | ���s(Line Feed) |
| \r | CR  | �����ɖ߂�(Carriage Return) |
| \f | CLS | ���y�[�W(Page Feed) |
| \' | '   | �V���O���N�I�[�e�[�V����(Single Quotation) |
| \" | "   | �_�u���N�I�[�e�[�V����(Double Quotation) |
| \\ | \   | �o�b�N�X���b�V��(Back Slash) |

# �\�[�X�t�@�C��
  Output_Escapesequence.java
# �N���X
�@Output_Escapesequence�@�@
# ���\�b�h
## ���s�i\n�j���o�͂��郁�\�b�h
      void Output_LF ()
## TAB�i\t�j���o�͂��郁�\�b�h
      void Output_TAB ()
## '�i\'�j���o�͂��郁�\�b�h
      void Output_SQuotation ()
## "�i\"�j���o�͂��郁�\�b�h
      void Output_WQuotation ()
## \ \\ ���o�͂��郁�\�b�h
      void Output_BackSlash ()
*/

class Output_Escapesequence {
  public static void main(String[] args)  {
      // ���s�i\n�j���o�͂��郁�\�b�h
      Output_LF () ;
      // TAB�i\t�j���o�͂��郁�\�b�h
      Output_TAB ();
      // '�i\'�j���o�͂��郁�\�b�h
      Output_SQuotation () ;
      // "�i\"�j���o�͂��郁�\�b�h
      Output_WQuotation () ;
      // \ \\ ���o�͂��郁�\�b�h
      Output_BackSlash () ;
  }

  // ���s�i\n�j���o�͂��郁�\�b�h
  private static void Output_LF () {
    System.out.println("");
    System.out.println("�s�������I�ɉ��s����");
    System.out.println("�s��\n�����I��\n���s����");
  }

  // TAB�i\t�j���o�͂��郁�\�b�h
  private static void Output_TAB () {
    System.out.println("");
    System.out.println("TAB�ŊԊu���󂯂�");
    System.out.println("TAB \t �� \t�Ԋu��\t �󂯂�\t");
  }

  // '�i\'�j���o�͂��郁�\�b�h
  private static void Output_SQuotation () {
    System.out.println("");
    System.out.println("�V���O���R�[�e�V�����Łu�����v���͂�");
    System.out.println("�V���O���R�[�e�V������\'����\'���͂�");
  }

  // "�i\"�j���o�͂��郁�\�b�h
  private static void Output_WQuotation () {
    System.out.println("");
    System.out.println("�_�u���R�[�e�V�����Łu�����v���͂�");
    System.out.println("�_�u���R�[�e�V������\"����\"���͂�");
  }

 // \ \\ ���o�͂��郁�\�b�h
  private static void Output_BackSlash () {
    System.out.println("");
    System.out.println("�o�b�N�X���b�V�����o�͂���");
    System.out.println("�o�b�N�X���b�V���i\\�j ���o�͂���");
  }
}
