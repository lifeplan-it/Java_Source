// JAVA �R�}���h�p�����[�^�̎g����
// Java-args
// JAVA Sample Code
// J0010_Args.java

class J0010_Args {
  public static void main(String[] args) {
	// �p�����[�^�̌�
	int P_count ;
	P_count = args.length ;

	// �p�����[�^�̌��̃`�F�b�N
	if (P_count == 0) {
		// �p�����[�^�����������" No data "���o�͂��ďI��
		System.out.println(" No data ");
	}
	else {
	// �p�����[�^������΃p�����[�^�̐������o��
		for ( int i=0 ; i < P_count; i++ ) {
			// �p�����[�^���o��
			System.out.println("���͂��ꂽ�p�����[�^�F" + args[i]);
		}
	}
  }
}

// ���s���@
//$ javac J0010_Args.java
//$ java  J0010_Args 1 4 7
//���͂��ꂽ�p�����[�^�F1
//���͂��ꂽ�p�����[�^�F4
//���͂��ꂽ�p�����[�^�F7
