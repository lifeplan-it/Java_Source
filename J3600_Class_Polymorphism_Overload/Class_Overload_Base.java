// Class_Overload_Base.java
//�I�[�o�[���[�h�̎g����
class Class_Overload_Base {
  public static void main(String[] args) {

	Class_PrintOut Cpo = new  Class_PrintOut() ;

	Cpo.Variable_PrintOut();
	Cpo.Variable_PrintOut("������̈���");
	Cpo.Variable_PrintOut( 111 );
	Cpo.Variable_PrintOut("������̈����Q", 222 );
   }
}

// Class_PrintOut.java
class Class_PrintOut {
  public static void Variable_PrintOut () {
	System.out.println("�����Ȃ�" );
  }

  public static void Variable_PrintOut (String S ) {
	System.out.println("������������F" + S );
  }

  public static void Variable_PrintOut (int i ) {
	System.out.println("�����������F" + i );
  }

  public static void Variable_PrintOut(String S,int i) {
	System.out.println("������������F" + S );
	System.out.println("�����������F" + i );
  }

}
