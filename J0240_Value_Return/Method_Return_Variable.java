// Java �߂�l(return value)
// �߂�l(return value)���g���ă��\�b�h����l���󂯎�鎖���ł܂��B
// �߂�l�̂��郁�\�b�h�́i�^�j���`���܂��B
// �߂�l�̂Ȃ����\�b�h�́ivoid�j���`���܂��B
// �߂�l�̌^�ƃ��\�b�h�錾�̌^�͈�v���Ă���K�v������܂��B

// Method_Return_Variable.java
class Method_Return_Variable {
   public static void main(String[] args) {
	String	In_Str = "Null" ; 	// ���\�b�h�ɓn������������
	int	In_Var = 000  ;	// ���\�b�h�ɓn������������

	String Out_Str  = Variable_String( In_Str );
	int Out_Var = Variable_Int( In_Var );

	System.out.println("�ϐ� Out_Str �̓��e�F" + Out_Str );	
	System.out.println("�ϐ� Out_Var �̓��e�F" + Out_Var );
   }

   public static String Variable_String ( String s ) {
	s = "�߂�l" ;		//���[�J���ϐ��̏�����
	return s ;			//�߂�l�̐ݒ�
   }

   public static int Variable_Int ( int i ) {
	i = 9999 ;			//���[�J���ϐ��̏�����
	return i ;			//�߂�l�̐ݒ�
   }
}
