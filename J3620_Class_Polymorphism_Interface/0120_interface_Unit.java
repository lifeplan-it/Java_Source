// 0120_interface_Unit.java
class AttackUser {
    public static void main(String[] args) {
	//String Prayer[] = { Humen , Soldier, mage, } ;
	Unit Prayer1 = new Mage() ;
	Prayer1.Work();
	Prayer1.Atack();
	Prayer1.Weapon();
    }

   public interface Unit {
   	void Work();
	void Atack();
	void Weapon();
  } 
}

    public class Mage  implements Unit {
	@Override public void work() { System.out.println("���@�g��������"); }
	@Override public void Atack() { System.out.println("���@�ōU��");  }
	@Override public void Weapon() { System.out.println("��ŉ���");   }
  }

    public class Humen  implements Unit {
	@Override public void work() { System.out.println("�l������"); }
	@Override public void Atack() { System.out.println("��ōU��"); }
	@Override public void Weapon() { System.out.println("��𓊂���"); }
  }

    public  class Soldier implements Unit {
	@Override public void work() { System.out.println("���m������"); }
	@Override public void Atack() { System.out.println("���ōU��"); }
	@Override public void Weapon() { System.out.println("�Z���𓊂���"); }
  }
