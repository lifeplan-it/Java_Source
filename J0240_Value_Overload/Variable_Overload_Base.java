// Method_Overload_Base.java
//�I�[�o�[���[�h�̎g����
// ���\�b�h���������ł�
// �����̌^�Ə��Ԃ���v���Ă���
// ���\�b�h���Ăяo����܂�

class Method_Overload_Base {
  public static void main(String[] args) {
	// �������Ȃ����\�b�h
	Variable_PrintOut();
	// ������������
	Variable_PrintOut("������̈���");
	// ������������
	Variable_PrintOut( 111 );
	// ������������Ɛ���
	Variable_PrintOut("������̈����Q", 222 );
   }

  public static void Variable_PrintOut () {
	System.out.println("�����Ȃ�" );
  }

  public static void Variable_PrintOut (String S ) {
	System.out.println("����������F" + S );
  }

  public static void Variable_PrintOut (int i ) {
	System.out.println("���������F" + i );
  }

  public static void Variable_PrintOut(String S,int i) {
	System.out.println("����������F" + S );
	System.out.println("���������F" + i );
  }
}
