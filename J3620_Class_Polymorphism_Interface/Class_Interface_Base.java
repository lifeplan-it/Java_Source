// Class_Interface_Base.java
public class Class_Interface_Base {
    public static void main(String[] args) {
	//String Prayer[] = { Humen , Soldier, mage, } ;
	Unit Prayer1 = new Mage() ;
	Prayer1.Work();
	Prayer1.Atack();
	Prayer1.Weapon();
    }
}
   // Unit.java
   interface Unit {
   	void Work();
	void Atack();
	void Weapon();
  }
    class Mage  implements Unit {
	@Override public void Work() { System.out.println("���@�g��������"); }
	@Override public void Atack() { System.out.println("���@�ōU��");  }
	@Override public void Weapon() { System.out.println("��ŉ���");   }
  }
    class Humen  implements Unit {
	@Override public void Work() { System.out.println("�l������"); }
	@Override public void Atack() { System.out.println("��ōU��"); }
	@Override public void Weapon() { System.out.println("��𓊂���"); }
  }
    class Soldier implements Unit {
	@Override public void Work() { System.out.println("���m������"); }
	@Override public void Atack() { System.out.println("���ōU��"); }
	@Override public void Weapon() { System.out.println("�Z���𓊂���"); }
  }
