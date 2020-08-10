// Class_Interface2_Base.java
// HP / Hit Point�i�Ђ��Ƃۂ���Ɓj�@�̗�
// MP / Magic Point�i�܂������ۂ���Ɓj����
// STR / Strength�i���Ƃ�񂮂��j�@��
// ATK / Attack�i���������j�@�U��
// VIT / Vitality�i�΂�����Ă��j�@������
// DEF / Defense�i�łӂ��񂷁j�@�h���
// INT / Intelligence�i����Ă肶���񂷁j�@�m�b
// RES / Resist�i�ꂶ���Ɓj�@��R��
// DEX / Dexterity�i�ł����Ă�Ă��j�@��p��
// AGI / Agility�i������Ă��j�@�f����
// LUK / Luck�i������j�@�^
// EXP / Experience�i�������؂肦�񂷁j�o���l
// ���킷	Dodge bool�@
//�l�ԁy�q���[�}���z
//����E�d���y�G���t�z
//���l�y�W���C�A���g�E�e�B�^���i�^�C�^���j�z
//�b�l
//�V�g�y�G���W�F���z
//�����y�f�r���E�f�[�����z
//�n��l�y�h���[�t�z
//���l�E�l���y�}�[�}���E�}�[���C�h�z
//�����i���l�j
//�d��
//���l�y�s�O�~�[�E�h���[�t�z
//�@�B�l�ԁy�A���h���C�h�z
//�z���S�y���@���p�C�A�E�h���L�����z
//�A���f�b�h
// ���˂�	jump
// ���	Flight
// ����	���A�匕�A���A��|�A
// ����	�h��X�[�c�A�p���[�X�[�c
// ���i�@�@�񕜁A�₯�ǁA
public class Class_Interface2_Base {
    public static void main(String[] args) {
	Class_Interface_main() ;
    }

    public static void Class_Interface_main( ) {
	// Prayer[] = { Humen , Soldier, mage, } ;
	// Mage mg = new Mage();
	iMagic mg  = new Magic() ;
	iHumen hu  = new Humen() ;
	mg.Work();
	mg.Attack() ;
	hu.Work();
	hu.Eat();
   }
}

   // Unit.java
   interface iHumen {
   	void Work();
   	void Speek();
	void Eat() ;
  }

   interface iMagic {
   	void Attack() ;
	void Wepon() ;
	void Heal() ;
	void Work() ;
	void Speek() ;
  }

  class Magic  implements  iMagic  {
	@Override
	public void Attack() { System.out.println("���@�ōU��");  }
	@Override
	public void Wepon() { System.out.println("���@��");   }
	@Override
	public void Heal() { System.out.println("��");   }
	@Override
	public void Work() { System.out.println("���@�g��������"); }
	@Override
	public void Speek() { System.out.println("���@�g�����b��"); }
   }

  class Humen implements iHumen {
	@Override
	public void Work() { System.out.println("�l������"); }
	@Override
	public void Speek() { System.out.println("�l���b��"); }
	@Override
	public void Eat() { System.out.println("�l���H�ׂ�"); }
  }

  