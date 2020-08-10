// Runnable_Base.java

class Counter implements Runnable {
   private String name;
   public Counter (String nm)    { 
	name = nm;
  }

   public void run()    {
      for(int i=0; i<5; i++){
         System.out.println(name + "�̏��������Ă��܂��B");
      } 
   }
}

class Runnable_Base  {
   public static void main(String[] args)    {
	Runnable_Test () ;
   }

   public static void Runnable_Test ()    {
      Counter count1 = new Counter("1����");
      Thread th1 = new Thread ( count1 ) ;
      th1.start();

      Counter count2 = new Counter("2����");
      Thread th2 = new Thread ( count2 ) ;
      th2.start();

      try{
	th1.join();
      } catch(InterruptedException e) {
	System.out.println("th1�̏������ُ�I�����܂����B");
      }

      try{
	th2.join();
      } catch(InterruptedException e) {
	System.out.println("th1�̏������ُ�I�����܂����B");
      }

      System.out.println("main()�̏������I���܂��B");

   }
}
