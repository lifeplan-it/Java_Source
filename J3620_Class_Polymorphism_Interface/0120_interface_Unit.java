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
	@Override public void work() { System.out.println("–‚–@g‚¢‚ª•à‚­"); }
	@Override public void Atack() { System.out.println("–‚–@‚ÅUŒ‚");  }
	@Override public void Weapon() { System.out.println("ñ‚Å‰£‚é");   }
  }

    public class Humen  implements Unit {
	@Override public void work() { System.out.println("l‚ª•à‚­"); }
	@Override public void Atack() { System.out.println("“ç‚ÅUŒ‚"); }
	@Override public void Weapon() { System.out.println("“ç‚ğ“Š‚°‚é"); }
  }

    public  class Soldier implements Unit {
	@Override public void work() { System.out.println("Œ•m‚ª•à‚­"); }
	@Override public void Atack() { System.out.println("Œ•‚ÅUŒ‚"); }
	@Override public void Weapon() { System.out.println("’ZŒ•‚ğ“Š‚°‚é"); }
  }
