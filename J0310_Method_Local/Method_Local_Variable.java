// Method_Local_Variable.java
// Loacl�ϐ��F���\�b�h���Œ�`�����ϐ�
class Method_Local_Variable {
    public static void main(String[] args) {
	Variable_Int_Print () ;	// ���\�b�h�Ăяo��
	Variable_Str_Print ();	// ���\�b�h�Ăяo��
  }

   public static void Variable_Int_Print () {
	int Var = 111  ;	// ���[�J���ϐ��i�����j�̕ϐ�������
	System.out.print( "�ϐ�var�̓��e�F"  );
	System.out.println( Var );
   }

   public static void Variable_Str_Print () {
	String	Str ;	// ���[�J���ϐ��i������j�̕ϐ��錾
	Str = "���C�����\�b�h�I��" ;
	System.out.print   ( "�ϐ�str�̓��e�F"  );
	System.out.println( Str );
   }
}
