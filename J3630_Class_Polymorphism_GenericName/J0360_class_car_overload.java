// J0360_class_car_overload.java
// �N���X���F�i�@  Car�@�@�j
class Car
{
  // �i �C���X�^���X�j�ϐ��@�C���q�����āi�J�v�Z�����j
	private int num;	// �Ԃ̃i���o�[��ݒ�
	private double gas;	// �K�\�����ʂ�ݒ�

  //�@setCar���\�b�h�́i �I�[�o�[���[�h  �j
	public void setCar(int n , double g)
	{
		num = n ;
		gas = g ;
		// �������g�̃��\�b�h�̌Ăяo���@( this �ȗ��\)
		this.setCar_show();
	}

  //�@setCar���\�b�h�́i �I�[�o�[���[�h  �j
  public	void setCar(int n)
	{
		num = n;
		this.setCar_show();
	}

	private void setCar_add()
	{
		num = num + 1000 ;
		gas = gas + 5.0  ;
	}

  public int  getNum()
	{
			return this.num;
	}

	public double getgas()
	{
			return this.gas;
	}

	public void setCar_show()
	{
		System.out.println("setCar_show");
		System.out.println("�Ԃ̃i���o�[:" + this.num + "�ł��B");
		System.out.println("�K�\�����̗�:" + this.gas + "�ł��B");
		System.out.println("");
	}
}

	// �N���X���FJ0330_class_car_private
class J0360_class_car_overload
{
  public static void main(String[] args)
	{
			int number1 ;
			double gasoline1 ;
    	//  Car�N���X�́i �I�u�W�F�N�g�쐬 �j Car�^�̕ϐ�car�ɑ��
  		Car car1 = new Car();

			// ���������@number1,gasoline1�@
			number1 = 893 ;
			gasoline1 = 55.0 ;
			System.out.println("����num�̒l�F" + number1);
			System.out.println("����gas�̒l�F" + gasoline1);
			car1.setCar(number1,gasoline1);

			number1 = 5589 ;
			System.out.println("����num�̒l�F" + number1);
			car1.setCar(number1);

			int number2 = car1.getNum();
			double gasoline2 = car1.getgas();

			System.out.println("���݂�num�̒l�F" + number2);
			System.out.println("���݂�gas�̒l�F" + gasoline2);

 	}
}
