
// Java �ϐ��錾
// �@�^	�ϐ���  ; 
// �ϐ�������
// �@�^	�ϐ��� = �l ;

// boolean	true or false
// char	16Bit Unicode����	\u0000�`\uFFFF
// byte	  8Bit����	-128�`127
// byte	16Bit����	-32768�`32767
// int	32Bit����	-2147483648�`2147483647
// long	64Bit����	-9223372036854775808�`9223372036854775807
// float	32Bit�P���x���������_��
// double	64Bit�{���x���������_��
// �ϐ�var1�̓��e�F111
// �ϐ�var2�̓��e�F111
// �ϐ�Var_d1�̓��e�F123.45
// �ϐ�Var_d2�̓��e�F456.7
// �ϐ�str1�̓��e�F������P
// �ϐ�str2�̓��e�F������2
// �ϐ�Cha1�̓��e�Fa
// �ϐ�Cha2�̓��e�Fb
// https://ja.wikipedia.org/wiki/Unicode%E4%B8%80%E8%A6%A7_0000-0FFF

// Variable_Declaration_Base.java
class Variable_Declaration_Base {
    public static void main(String[] args) {

	Variable_Declaration_Int ();
	Variable_Declaration_Double();
	Variable_Declaration_String();
	Variable_Declaration_Char ();
  }

   public static void Variable_Declaration_Int () {
	// �����̕ϐ��錾
	int	Var1  ; 
 	Var1 = 111 ;
	System.out.print("�ϐ�var1�̓��e�F"  );
	System.out.println( Var1 );

	int	Var2 = 111 ;
	System.out.print("�ϐ�var2�̓��e�F"  );
	System.out.println( Var2 );
   }

   public static void Variable_Declaration_String () {
	// ������̕ϐ��錾
	String	Str1 ;
	Str1 = "������P" ;

	System.out.print   ( "�ϐ�str1�̓��e�F"  );
	System.out.println( Str1 );

	String	Str2 = "������2" ;
	System.out.print   ( "�ϐ�str2�̓��e�F"  );
	System.out.println( Str2 );
   }

   public static void Variable_Declaration_Double () {
	//������̕ϐ��錾
	double	Var_d1  ;
	Var_d1  = 123.45 ;

	System.out.print   ( "�ϐ�Var_d1�̓��e�F"  );
	System.out.println( Var_d1 );

	double	Var_d2  = 456.7 ;
	System.out.print   ( "�ϐ�Var_d2�̓��e�F"  );
	System.out.println( Var_d2   );
   }

   public static void Variable_Declaration_Char () {
	// Char�̕ϐ��錾
	char	Cha1  ; 
 	Cha1 = '\u0061';	
	System.out.print("�ϐ�Cha1�̓��e�F"  );
	System.out.println( Cha1 );

	char	Cha2 = 0x0062 ;	
	System.out.print("�ϐ�Cha2�̓��e�F"  );
	System.out.println( Cha2 );
   }
}
