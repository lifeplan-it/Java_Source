// Class_Variable_Car.java

class Class_ClassVariable {
  public static int sum = 0;

  private int num;
  private double gas;

  public MethodClassVariable() {
	num = 0;	// �ϐ��̏�����
	gas = 0.0;	// �N���X�ϐ��̉��Z
	sum++;
	System.out.println("�Ԃ��쐬���܂����B");
  }

  //�@setCar���\�b�h�́i �I�[�o�[���[�h  �j
  public void setCar(int n , double g)  {
	// �������g�̃��\�b�h�̌Ăяo���@( this �ȗ��\)
	this.setCar_show();
	num = n ;
	gas = g ;
  }

  //�@setCar���\�b�h�́i �I�[�o�[���[�h  �j
  public	void setCar(int n) {
	num = n;
	this.setCar_show();
  }

  //�@�C���X�^���X�ϐ��ɉ����� u, a,m �����Z
  public void setCar_add(int u, double a, int m) {
	num = u ;
	gas = a ;
	sum = m ;
  }

  //�@�C���X�^���X�ϐ��@num ��߂�l�Ƃ��ĕԂ�
  public int  getNum() 	{
 	return this.num;
  }

  //�@�C���X�^���X�ϐ� gas ��߂�l�Ƃ��ĕԂ�
  public double getgas() 	{
	return this.gas;
  }

  //�@�C���X�^���X�ϐ�����ʂɏo��
  public void setCar_show() 	{
	System.out.println("setCar_show");
	System.out.println("�Ԃ̃i���o�[:" + this.num + "�ł��B");
	System.out.println("�K�\�����̗�:" + this.gas + "�ł��B");
	System.out.println("");
  }

	// �N���X ���\�b�h���FshowSum
	public static void showSum() 	{
	// �N���X�ϐ��@sum�@�̕\��
 		System.out.println("�Ԃ͑S����"  + sum + "�䂠��܂��B");
	}
}

// �N���X���FJ0330_class_car_private
class J0370_class_car_classvariable {
	public static void main(String[] args) {
		int number1 ;
		double gasoline1 ;
    		//  Car�N���X�́i �I�u�W�F�N�g�쐬 �j Car�^�̕ϐ�car�ɑ��
  		Car car1 = new Car();
		Car car2 = new Car();

		number1 = 893 ;
		gasoline1 = 55.0 ;
		System.out.println("����num�̒l�F" + number1);
		System.out.println("����gas�̒l�F" + gasoline1);
		car1.setCar(number1,gasoline1);

		number1 = 12345 ;
		gasoline1 = 60.0 ;
		System.out.println("����num�̒l�F" + number1);
		System.out.println("����gas�̒l�F" + gasoline1);
		car2.setCar(number1,gasoline1);

		// �N���X�ϐ��̎Q��
		System.out.println("�N���X�ϐ��F" + Car.sum);
		Car.showSum() ;

		// �C���X�^���X�ϐ��̎Q�Ɓ@�G���[�ɂȂ�
		// System.out.println("�C���X�^���X�ϐ��F" + Car.num);
 	}
}
