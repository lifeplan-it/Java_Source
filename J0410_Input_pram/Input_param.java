// Java Param
// JAVA �R�}���h�p�����[�^�̎g����
// ���C�����\�b�h�̈����́A�R�}���h���C��������͂��ꂽ�l���󂯎�鎖���ł��܂��B
// 
// ���s���@
//$ javac Input_param.java
//$ java  Input_param 1 4 7
// ���s����
//���͂��ꂽ�p�����[�^�F1
//���͂��ꂽ�p�����[�^�F4
//���͂��ꂽ�p�����[�^�F7
// Input_param.java
class Input_param {
  public static void main(String[] args) {
	// �p�����[�^�̌�
	int P_count ;
	P_count = args.length ;

	// �p�����[�^�̌��̃`�F�b�N
	if (P_count == 0) {
		// �p�����[�^�����������" No data "���o�͂��ďI��
		System.out.println(" No data ");
	} else {
	    System.out.println("�p�����[�^�̐��F" + P_count );
	  // �p�����[�^������΃p�����[�^�̐������o��
	  for ( int i=0 ; i < P_count; i++ ) {
	    // �p�����[�^���o��
	    System.out.println("���͂��ꂽ�p�����[�^�F" + args[i]);
	    }
	}
  }
}

// ���s���@
//$ javac Input_param.java
//$ java  Input_param 1 4 7
//���͂��ꂽ�p�����[�^�F1
//���͂��ꂽ�p�����[�^�F4
//���͂��ꂽ�p�����[�^�F7