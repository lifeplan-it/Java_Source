// Java static�ϐ�(Static Variable)
// static�ϐ����g���ă��\�b�h�ԂŒl�����L���鎖���ł��܂��B
// Static�ϐ��́A�N���X�錾�ƃ��\�b�h�̊ԂŐ錾�����܂��B
// �C���q��static���g�p���܂��B
// Static�ϐ��́A�N���X���S�Ẵ��\�b�h����A�N�Z�X���ł��܂��B
// Method_Static_Variable.java
class Method_Static_Variable {
    public  static  String  Str  ;	// static �ϐ��錾
    public  static  int        Var ;	// static �ϐ��錾
    public static void main(String[] args) {
	Variable_Init ();	 	// �ϐ�������������B
	Variable_Int_Print () ;	// �������o�͂���B
	Variable_Str_Print ();	// ��������o�͂���B
    }
    public static void Variable_Init () {
	Str  = "������" ;	// Static�ϐ���������
	Var = 999 ;	// Static�ϐ���������
    }

    public static void Variable_Int_Print () {
	System.out.print( "�ϐ�var�̓��e�F"  );
	System.out.println( Var );
    }

    public static void Variable_Str_Print () {
	System.out.print   ( "�ϐ�str�̓��e�F"  );
	System.out.println( Str );
    }
}
