// Loacl�ϐ��F���\�b�h���Œ�`�����ϐ�
// ���[�J���ϐ��͂��̃��\�b�h�������ŗL���ɂȂ�܂��B
//
// �\�[�X�t�@�C����
//     Method_Local_Variable.java
// ���C���N���X��
//    Method_Local_Variable   
// �����̃��[�J���ϐ��錾���\�b�h
//       Variable_Int_Print () ;
// ������̃��[�J���ϐ��錾���\�b�h
//       Variable_Str_Print ();
// Method_Local_Variable.java
class Method_Local_Variable {
    public static void main(String[] args) {
       // �����̃��[�J���ϐ��錾���\�b�h
       Variable_Int_Print () ;
       // ������̃��[�J���ϐ��錾���\�b�h
       Variable_Str_Print ();
  }

  public static void Variable_Int_Print () {
    // ���[�J���ϐ��i�����j�̕ϐ�������
     int Var = 111  ;
     System.out.print( "�ϐ�var�̓��e�F"  );
     System.out.println( Var );
  }

   public static void Variable_Str_Print () {
      // ���[�J���ϐ��i������j�̕ϐ��錾
      String	Str ;
      Str = "���C�����\�b�h�I��" ;
      System.out.print   ( "�ϐ�str�̓��e�F"  );
      System.out.println( Str );
   }
}
