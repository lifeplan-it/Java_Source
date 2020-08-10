//のりものインターフェイス
interface iVehicle {
   void vShow();
}

//材料インターフェース
interface iMaterial {
   void mShow();
}

//車クラス
class Car implements iVehicle,iMaterial {
   private int num;
   private double gas;
   
   public Car(int n, double g)  {
      num = n;
      gas = g;
      System.out.println("ナンバー" + num + "ガソリン量" + gas+ "の車を作成しました。");
   }

   public void vShow()    {
      System.out.println("車のナンバーは" + num + "です。");
      System.out.println("ガソリン量は" + gas + "です。");
   }

   public void mShow()    {
      System.out.println("車の材質は鉄です。");
   }
}

class Sample4 {
   public static void main(String[] args)    {
      Car car1 = new Car(1234, 20.5);
      car1.vShow();
      car1.mShow();
   }
}
