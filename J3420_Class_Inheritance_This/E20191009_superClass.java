//E20191009_superClass.java
//�ԃN���X
class Car
{
   private int num;
   private double gas;
   
   public Car()
   {
      num = 0;
      gas = 0.0;
      System.out.println("�Ԃ��쐬���܂����B");
   }
   public void setCar(int n, double g)
   {
      System.out.println("setCar���Ă΂ꂽ");
      num = n;
      gas = g;
      System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
   }
   public void show()
   {
      System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
      System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
   }
}
//���[�V���O�J�[�N���X
class RacingCar extends Car
{
   private int course;
   
   public RacingCar()
   {
      course = 0;
      System.out.println("���[�V���O�J�[���쐬���܂����B");
   }

   public void setCourse(int c)
   {
      course = c;
      System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
   }
}

class E20191009_superClass
{
   public static void main(String[] args)
   {
      
	//�X�[�p�[�N���X�̌Ăяo��
	Car car1 = new Car();
	// car1.num = 123;
	// car1.num = 10.5;

	car1.setCar( 123 , 10.5);


	RacingCar rccar1;
      rccar1 = new RacingCar();

      rccar1.setCar(1234, 20.5);
      rccar1.setCourse(5);
   }
}
