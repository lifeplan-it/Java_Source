//Variable_Param_002.java
//�����̎g����

// ���\�b�h���FVariable_Param_002
class Variable_Param_002 {

   // ���C�����\�b�h
   public static void main(String[] args) {

	//�ϐ��̐錾
	String	Str ;
	int	Var ;

	//�ϐ��ւ̑��
	Str = "�悤����Java��!" ;

	// ���\�b�h�iVariable_String�j���Ăяo��
	Variable_String(Str);

	//�ϐ��ւ̑��
	Var = 111 ;

	// ���\�b�h�iVariable_Int�j���Ăяo��
	Variable_Int(Var);

	//�ϐ��ւ̑��
	Str = "�I��" ;

	// ���\�b�h�iVariable_String�j���Ăяo��
	Variable_String(Str);


   }

   // ���\�b�h���FVariable_String
   public static void Variable_String (String s) {

	System.out.println("�ϐ� s �̓��e�F" + s );

   }

   // ���\�b�h���FVariable_Int
   public static void Variable_Int (int i) {

	System.out.println("���� i �̓��e�F" + i );

   }

}
