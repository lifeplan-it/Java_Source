// J0330_class_car_return
// �N���X���F�i�@  Car�@�@�j
class Car {
  	int num;	// �Ԃ̃i���o�[��ݒ�
	double gas;	// �K�\�����ʂ�ݒ�

	/* ���\�b�h���F�i �@setCar_argument�@ �j
		�������W�@n,g ����l���擾���ĕ\�����܂��B
	 ����: ��
   	�߂�l�F�i �@���@�@ �j
	  */
	void setCar(int n , double g) 	{
		System.out.println("���\�b�h���FsetCar");
		num = n ;
		gas = g ;
		// ���\�b�h�@setCar_show ���Ăяo��
		this.setCar_show();
		// ���\�b�h�@setCar_add ���Ăяo��
		this.setCar_add();
		// ���\�b�h�@setCar_show ���Ăяo��
		this.setCar_show();
	}
	/* ���\�b�h���F�i setCar_add �j
		�t�B�[���h�̕ϐ��ɉ��Z���Ă��܂��B
	  ����: ��
   	�߂�l�F�i �@���@�@ �j
	  */
	void setCar_add() 	{
		//	System.out.println("setCar_argument");
		System.out.println("���\�b�h���FsetCar_add");
		num = num + 1000 ;
		gas = gas + 5.0  ;
	}
	/* ���\�b�h���F�i getNum �j
		�t�B�[���h�ϐ��@num ��߂�l�Ƃ��ĕԂ��B
		����: ��
   	�߂�l�F�i �@���@�@ �j
  */
	 int  getNum() {
		return this.num;
	}
	/* ���\�b�h���F�i�@getgas�@�j
		�t�B�[���h�ϐ��@gas ��߂�l���ĕԂ��Ă��܂��B
		����: ��
   	�߂�l�F�i �@���@�@ �j
  */
	double getgas() {
			return this.gas;
	}

	void setCar_show()
	{
		System.out.println("�t�B�[���h�ϐ�");
		System.out.println("�Ԃ̃i���o�[:" + this.num + "�ł��B");
		System.out.println("�K�\�����̗�:" + this.gas + "�ł��B");
		System.out.println("");
	}
}

	// �N���X���FJ0330_class_car_private
class J0330_class_car_return
{
  public static void main(String[] args)
	{
			int number1 ;
			double gasoline1 ;
    	//  Car�N���X�́i �I�u�W�F�N�g�쐬 �j Car�^�̕ϐ�car�ɑ��
  		Car car1 = new Car();

  		// ���\�b�h�@Car_show�@�̃t�B�[���h�ϐ��ɃA�N�Z�X
			System.out.println("car1 �̃t�B�[���h�ϐ�");
			car1.num = 1234;
			car1.gas = 20.5;
			car1.setCar_show();

			// ���\�b�h�@setCar_argument�@�Ɏ��������@number1,gasoline1�@��n���@
			System.out.println("car1 �̈���");
			number1 = 893 ;
			gasoline1 = 55.0 ;
			car1.setCar(number1,gasoline1);

			// ���\�b�h�@getNum�@�̖߂�l���@number2�@�Ɏ擾
			int number2 = car1.getNum();
			// ���\�b�h�@getgas�@�̖߂�l���@gasoline2�@�Ɏ擾
			double gasoline2 = car1.getgas();

      // �߂�l��\��
			System.out.println("���݂�num�̒l�F" + number2);
			System.out.println("���݂�gas�̒l�F" + gasoline2);
 	}
}
