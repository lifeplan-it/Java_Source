// J0010_Args_check_count.java
// ���s���ɗ^�����p�����[�^�̃e�X�g
//
// ���s���@�@( Windows Shell )
// $javac J0001_Args_test.java
// $java J0001_Args_test 1
//
//
// main() �N���X���@J0001_Args_test

class J0010_Args_check_count
{
// main() ���\�b�h�@
public static void main(String[] args)
	{
		// �p�����[�^�̌�
		int P_count ;
		P_count = args.length ;

		// �p�����[�^�̌��̃`�F�b�N
		if (P_count == 0)
		{
			  // �p�����[�^�����������" No data "���o�͂��ďI��
				System.out.println(" No data ");
		}
		else
		{
			// �p�����[�^������΃p�����[�^�̐������o��
			for ( int i=0 ; i < P_count; i++ )
			{
				// �p�����[�^���o��
				System.out.println(args[i]);
			}
		}
	}
}
