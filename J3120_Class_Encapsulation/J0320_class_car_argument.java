// J0320_class_car_argument.java
// �N���X���F�i�@  Car�@�@�j
class Car
{
  // �i �C���X�^���X�j�ϐ��@�C���q�����āi�J�v�Z�����j
	int num;	// �Ԃ̃i���o�[��ݒ�
	double gas;	// �K�\�����ʂ�ݒ�

	/* ���\�b�h���F�i �@setCar�@ �j
		������ n , g ����l���擾���ĕ\�����܂��B
	  ����: ��
   	�߂�l�F�i�@�� �j
  */
	void setCar(int n , double g)
	{
		num = n ;
		gas = g ;
		System.out.println("����������擾(SetCar)");
		System.out.println("�Ԃ̃i���o�[:" + n + "�ł��B");
		System.out.println("�ɃK�\������:" + g + "�ł��B");
		System.out.println("");
	}

	/* ���\�b�h���F�i �@setCar_show�@ �j
		�t�B�[���h�ϐ� num,gas ����l���擾���ĕ\�����܂��B
	  ����: ��
   	�߂�l�F�i �@���@�@ �j
  */
	void setCar_show()
	{
		System.out.println("�t�B�[���h�ϐ�����擾");
		System.out.println("�Ԃ̃i���o�[:" + num + "�ł��B");
		System.out.println("�K�\�����̗�:" + gas + "�ł��B");
		System.out.println("");
	}
}

// main �N���X
class J0320_class_car_argument
{
  public static void main(String[] args)
	{
			int number1 ;
			double gasoline1 ;
    	//  Car�N���X�́i �I�u�W�F�N�g�쐬 �j Car�^�̕ϐ�car�ɑ��
  		Car car1 = new Car();

  		// �I�u�W�F�N�g�́i�@�t�B�[���h�ϐ��@�j�ɐ��l��n���B
			System.out.println("�I�u�W�F�N�g�@car1 �̃C���X�^���X");
			car1.num = 1234;
			car1.gas = 20.5;
			car1.setCar_show();

			// �������@number1,	gasoline1���琔�m��n��
			number1 = 893 ;
			gasoline1 = 55.0 ;
			car1.setCar(number1,gasoline1);

 	}
}
