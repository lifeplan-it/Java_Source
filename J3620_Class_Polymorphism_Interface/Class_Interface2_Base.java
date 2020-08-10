// Class_Interface2_Base.java
// HP / Hit Point（ひっとぽいんと）　体力
// MP / Magic Point（まじっくぽいんと）魔力
// STR / Strength（すとれんぐす）　力
// ATK / Attack（あたっく）　攻撃
// VIT / Vitality（ばいたりてぃ）　生命力
// DEF / Defense（でふぇんす）　防御力
// INT / Intelligence（いんてりじぇんす）　知恵
// RES / Resist（れじすと）　抵抗力
// DEX / Dexterity（でくすてりてぃ）　器用さ
// AGI / Agility（あじりてぃ）　素早さ
// LUK / Luck（らっく）　運
// EXP / Experience（えくすぺりえんす）経験値
// かわす	Dodge bool　
//人間【ヒューマン】
//精霊・妖精【エルフ】
//巨人【ジャイアント・ティタン（タイタン）】
//獣人
//天使【エンジェル】
//悪魔【デビル・デーモン】
//地底人【ドワーフ】
//魚人・人魚【マーマン・マーメイド】
//魔族（魔人）
//妖怪
//小人【ピグミー・ドワーフ】
//機械人間【アンドロイド】
//吸血鬼【ヴァンパイア・ドラキュラ】
//アンデッド
// 跳ねる	jump
// 飛ぶ	Flight
// 武器	剣、大剣、盾、大楯、
// 服装	防御スーツ、パワースーツ
// 備品　　回復、やけど、
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
	public void Attack() { System.out.println("魔法で攻撃");  }
	@Override
	public void Wepon() { System.out.println("魔法書");   }
	@Override
	public void Heal() { System.out.println("回復");   }
	@Override
	public void Work() { System.out.println("魔法使いが歩く"); }
	@Override
	public void Speek() { System.out.println("魔法使いが話す"); }
   }

  class Humen implements iHumen {
	@Override
	public void Work() { System.out.println("人が歩く"); }
	@Override
	public void Speek() { System.out.println("人が話す"); }
	@Override
	public void Eat() { System.out.println("人が食べる"); }
  }

  