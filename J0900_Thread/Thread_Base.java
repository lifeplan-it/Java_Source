// Thread_Base.java

class Counter extends Thread {
   private String name;
   public Counter (String nm)    {
	name = nm;
   }

   public void run()    {
      for(int i=0; i<5; i++){
	
         System.out.println(name + "の処理をしています。");
      } 
   }
}

class Thread_Base {
   public static void main(String[] args)    {
      Counter count1 = new Counter("1号車");
      count1.start();

      Counter count2 = new Counter("2号車");
      count2.start();

      for(int i=0; i<5; i++){
	System.out.println("main()の処理をしています。");
      } 
   }
}
