// AttackUser.java
// Unit.java
   interface Unit {
   	void Work();
	void Atack();
	void Weapon();
  } 

//Maige.java
    class Mage  implements Unit {
	@Override public void Work() { System.out.println("Work:���@�g��������������"); }
	@Override public void Atack() { System.out.println("Atack:���@�ōU��");  }
	@Override public void Weapon() { System.out.println("Weapon:��ŉ���");   }
  }

//human.java
    class Humen implements Unit {
	@Override public void Work() { System.out.println("Work:�l������"); }
	@Override public void Atack() { System.out.println("Atack:��ōU������"); }
	@Override public void Weapon() { System.out.println("Weapon:��𓊂���"); }
  }

//Soldier.java
    class Soldier implements Unit {
	@Override public void Work() { System.out.println("Work:���m����������"); }
	@Override public void Atack() { System.out.println("Atack:���ōU��"); }
	@Override public void Weapon() { System.out.println("Weapon:�Z���𓊂���"); }
  }

class AttackUser {
    public static void main(String[] args) {
	// { Humen , Soldier, mage, } ;
	Unit Player[] = new Unit[3] ;

	Player[0]  = new Humen() ;
	Player[1]  = new Soldier() ;
	Player[2]  = new Mage() ;

	for (int i = 0 ; i <= 2 ; i++) {
		Player[i].Work();
		Player[i].Atack();
		Player[i].Weapon();
		System.out.println ("=+=+=+=+=+=+= " ) ;
	}
    }
}
