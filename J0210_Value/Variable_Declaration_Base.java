//Java�ϐ��錾
// �@�^	�ϐ���;
// �ϐ�������
// �@�^	�ϐ���=�l;
//
// boolean true or false
// char     16bit Unicode����
// byte       8bit ����
// byte     16bit ����
// int        32bit ����
// long     64bit ����
// float     32bit �P���x���������_��
// double 64bit �{���x���������_��
// 
// ###################################
//�T���v���R�[�h
// Variable_Declaration_Base.java
//
//���C���N���X
//     Variable_Declaration_Base
//
// ������錾�̃T���v�����\�b�h
//     void Variable_Declaration_String()
//
// �����錾�̃T���v�����\�b�h
//     void Variable_Declaration_Int ()
//
// �{���x���������_�錾�̃T���v�����\�b�h
//     void Variable_Declaration_Double()

// Variable_Declaration_Base.java
class Variable_Declaration_Base {
  public static void main(String[] args) {
    // ������錾�̃T���v�����\�b�h
    Variable_Declaration_String();
    // �����錾�̃T���v�����\�b�h
    Variable_Declaration_Int ();
    // �{���x���������_�錾�̃T���v�����\�b�h
    Variable_Declaration_Double();
  }

  // ������̐錾�@
  public static void Variable_Declaration_String () {
     String	Str1 ;

     Str1 = "������P" ;
     System.out.println( Str1 );

     String	Str2 = "������Q" ;
     System.out.println( Str2 );
  }

  //�����̐錾
  public static void Variable_Declaration_Int () {
     int Var1  ;

     Var1 = 222 ;
     System.out.println( Var1 );

     int Var2 = 111 ;
     System.out.println( Var2 );
   }

  // double 64Bit�{���x���������_��
  public static void Variable_Declaration_Double () {
     double	Var_d1  ;

     Var_d1  = 123.45 ;
     System.out.println( Var_d1 );

     double	Var_d2  = 456.7 ;
     System.out.println( Var_d2   );
  }
}
