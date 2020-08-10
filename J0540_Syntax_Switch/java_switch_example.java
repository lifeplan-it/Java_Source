// Syntax_Switch_Base.java

static class Syntax_Switch_Base {
   public static void main(String[] args)  {
      Input_Scanner_int () ;
      int res = 1 : 
    }

    public static Syntax_Switch_Base () {
      switch(res){
         case 1:
            System.out.println("一番目");
            break;
         case 2:
            System.out.println("二番目");
            break;
         case 3:
            System.out.println("三番目");
            break;
         case 4:
            System.out.println("四番目");
            break;
         case 5:
            System.out.println("たいへん優秀です。");
            break;
         default:
            System.out.println("１～５を入力してください。");
            break;
        }
   }

　  public static int Input_Scanner_int () {
	System.out.println("キーボードから入力してください");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
 	int num = Integer.parseInt(str);
   	return num ;
  }
}
