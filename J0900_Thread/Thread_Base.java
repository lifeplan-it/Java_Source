// Thread_Base.java

class Counter extends Thread {
   private String name;
   public Counter (String nm)    {
	name = nm;
   }

   public void run()    {
      for(int i=0; i<5; i++){
	
         System.out.println(name + "‚Ìˆ—‚ð‚µ‚Ä‚¢‚Ü‚·B");
      } 
   }
}

class Thread_Base {
   public static void main(String[] args)    {
      Counter count1 = new Counter("1†ŽÔ");
      count1.start();

      Counter count2 = new Counter("2†ŽÔ");
      count2.start();

      for(int i=0; i<5; i++){
	System.out.println("main()‚Ìˆ—‚ð‚µ‚Ä‚¢‚Ü‚·B");
      } 
   }
}
