// AttackUser.java
// Unit.java
   interface Unit {
   	void Work();
	void Atack();
	void Weapon();
  } 

//Maige.java
    class Mage  implements Unit {
	@Override public void Work() { System.out.println("Work:–‚–@g‚¢‚ª‚ä‚Á‚­‚è•à‚­"); }
	@Override public void Atack() { System.out.println("Atack:–‚–@‚ÅUŒ‚");  }
	@Override public void Weapon() { System.out.println("Weapon:ñ‚Å‰£‚é");   }
  }

//human.java
    class Humen implements Unit {
	@Override public void Work() { System.out.println("Work:l‚ª•à‚­"); }
	@Override public void Atack() { System.out.println("Atack:“ç‚ÅUŒ‚‚·‚é"); }
	@Override public void Weapon() { System.out.println("Weapon:“ç‚ğ“Š‚°‚é"); }
  }

//Soldier.java
    class Soldier implements Unit {
	@Override public void Work() { System.out.println("Work:Œ•m‚ª‘‚­•à‚­"); }
	@Override public void Atack() { System.out.println("Atack:Œ•‚ÅUŒ‚"); }
	@Override public void Weapon() { System.out.println("Weapon:’ZŒ•‚ğ“Š‚°‚é"); }
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
