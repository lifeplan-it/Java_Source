// Java �����iArguments�j
// �����iArguments�j���g���Ēl�������n�����Ƃ��ł��܂��B
// ���\�b�h�ɒ�`���鎞�̈�����������(parameter)�ƌ����܂��B
// ���\�b�h�ɒl��n��������������(Argument)�ƌ����܂��B

// Variable_method_Arguments.java
// �����F���\�b�h�Ԃ̒l�̎󂯓n�����s���܂��B
class Variable_method_Arguments {
   public static void main(String[] args) {
	String	Str  = "HelloJAVA!" ; 
	int	Var = 111 ;		//�ϐ��ւ̑��

	Variable_String( Str );		// ���\�b�h�Ăяo��
	Variable_Int( Var );
   }

   public static void Variable_String ( String Str ) {
	System.out.println("�ϐ� s �̓��e�F" + Str );
   }

   public static void Variable_Int (int i) {
	System.out.println("���� i �̓��e�F" + i );
   }
}
