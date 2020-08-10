class Car extends Thread
{
   private String name;

   public Car(String nm)
   {
      name = nm;
   }
   public void run()
   {
      for(int i=0; i<5; i++){

         System.out.println(name + "‚Ìˆ—‚ð‚µ‚Ä‚¢‚Ü‚·B");

      } 
   }
}
class Sample2
{
   public static void main(String[] args)
   {
      Car car1 = new Car("1†ŽÔ");
      car1.start();

      Car car2 = new Car("2†ŽÔ");
      car2.start();

      for(int i=0; i<5; i++){

         System.out.println("main()‚Ìˆ—‚ð‚µ‚Ä‚¢‚Ü‚·B");

      } 
   }
}
