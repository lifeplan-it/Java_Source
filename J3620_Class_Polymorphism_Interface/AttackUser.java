// AttackUser.java
// Unit.java
   interface Unit {
   	void Work();
	void Atack();
	void Weapon();
  } 

//Maige.java
    class Mage  implements Unit {
	@Override public void Work() { System.out.println("Work:魔法使いがゆっくり歩く"); }
	@Override public void Atack() { System.out.println("Atack:魔法で攻撃");  }
	@Override public void Weapon() { System.out.println("Weapon:杖で殴る");   }
  }

//human.java
    class Humen implements Unit {
	@Override public void Work() { System.out.println("Work:人が歩く"); }
	@Override public void Atack() { System.out.println("Atack:鍋で攻撃する"); }
	@Override public void Weapon() { System.out.println("Weapon:鍋を投げる"); }
  }

//Soldier.java
    class Soldier implements Unit {
	@Override public void Work() { System.out.println("Work:剣士が早く歩く"); }
	@Override public void Atack() { System.out.println("Atack:剣で攻撃"); }
	@Override public void Weapon() { System.out.println("Weapon:短剣を投げる"); }
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
