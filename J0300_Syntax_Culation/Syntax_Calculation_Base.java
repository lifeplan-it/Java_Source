// Java ���Z���̗�
// �l�����Z�̎���ł��B
// �Z�p���Z�q
// ��ȎZ�p���Z�q		
// ���Z�q	�T�v	��
// +	���Z	1 + 2 // 3
// -	���Z	5 ? 2 // 3
// *	��Z	3 * 4 // 12
// /	���Z	5.0 / 2 // 2.5
// %	��]	5 % 2 // 1
// +	������̘A��	�gA�h + �gB�h // 
// ++	�C���N�������g	x = 1;x++; // 2
// ?	�f�N�������g	x = 1;x?; // 0
// ���s����
// �����Z�F�@10
// �����Z�F�@4
// �|���Z�F�@21
// ����Z�F�@2.3333333333333335
// �]��(i % j)�F�@2
// �@
// ������Z�ii += j�j
// ����i:5
// ����j:9
// ����i:14
// ����j:9
// �@
// ������Z�ii -= j�j
// ����i:9
// ����j:5
// ����i:4
// ����j:5
// �@
// ������Z�ii /= j�j
// ����i:20.0
// ����j:5.0
// ����i:4.0
// ����j:5.0
// �@
// �C���N�������g�ii++�j
// ����i:4
// ����i:5
// �@
// �f�B�N�������g�ii--�j
// ����i:4
// ����i:3
// 
// Syntax_Calculation_Base.java
class Syntax_Calculation_Base {
   public static void main(String[] args) {
	int 	i ;
	double	d ;
	i = Addition( 3, 7) ;
	i = Subtraction ( 7, 3) ;
	i = Multiplication ( 7, 3) ;
	d = Division ( 7, 3);
	i = modulo( 12, 5);

	i = Assignment_plus( 5 , 9);
	i = Assignment_minus ( 9, 5) ;
	d = Assignment_Division(20.0,5.0);

	i = Increment( 4 );
	i = Decrement( 4 );
   }

   private static int Addition (int i,int j) {
	int res ;
	res = i + j;
	System.out.println("�����Z�F�@" + res );
	return res ;
   }

  private static int Subtraction (int i,int j) {
	int res ;
	res = i - j;
	System.out.println("�����Z�F�@" + res );
	return res ;  
   }

   private static int Multiplication (int i,int j) {
	int res ;
	res = i * j;
	System.out.println("�|���Z�F�@" + res );
	return res ;      
   }

   private static double Division (int i,int j) {
	double res ;
	res = (double)i / (double)j;	//�����𕂓������_�ɕϊ�
	System.out.println("����Z�F�@" + res );
	return res ;     
   }

   private static int modulo (int i,int j) {
	int res ;
	res = i % j;
	System.out.println("�]��(i % j)�F�@" + res );
	return res ;     
   }

   private static int Assignment_plus (int i,int j) {
	System.out.println("�@");
	System.out.println("������Z�ii += j�j");
	System.out.println("����i:" + i  );
	System.out.println("����j:" + j  );

	i += j;

	System.out.println("����i:" + i  );
	System.out.println("����j:" + j  );
	return i ;     
   }

   private static int Assignment_minus (int i,int j) {
	System.out.println("�@");
	System.out.println("������Z�ii -= j�j");
	System.out.println("����i:" + i  );
	System.out.println("����j:" + j  );

	i -= j;

	System.out.println("����i:" + i  );
	System.out.println("����j:" + j  );
	return i ;     
   }

   private static int Assignment_Multiplication(int i,int j) {
	System.out.println("�@");
	System.out.println("�����Z�ii *= j�j");
	System.out.println("����i:" + i  );
	System.out.println("����j:" + j  );

	i *= j;

	System.out.println("����i:" + i  );
	System.out.println("����j:" + j  );
	return i ;     
   }

   private static double Assignment_Division(double i,double j) {
	System.out.println("�@");
	System.out.println("������Z�ii /= j�j");
	System.out.println("����i:" + i  );	
	System.out.println("����j:" + j  );

	i /= j;

	System.out.println("����i:" + i  );	
	System.out.println("����j:" + j  );
	return i ;     
   }

   private static int Increment(int i) {
	System.out.println("�@");	
	System.out.println("�C���N�������g�ii++�j");	
	System.out.println("����i:" + i  );

	i++;

	System.out.println("����i:" + i  );
	return i ;     
   }

   //Decrement
   private static int Decrement(int i) {

	System.out.println("�@");	
	System.out.println("�f�B�N�������g�ii--�j");	
	System.out.println("����i:" + i  );

	i--;

	System.out.println("����i:" + i  );
      	return i ;     
   }

}
