// Syntax_Switch_Base.java

static class Syntax_Switch_Base {
   public static void main(String[] args)  {
      Input_Scanner_int () ;
      int res = 1 : 
    }

    public static Syntax_Switch_Base () {
      switch(res){
         case 1:
            System.out.println("��Ԗ�");
            break;
         case 2:
            System.out.println("��Ԗ�");
            break;
         case 3:
            System.out.println("�O�Ԗ�");
            break;
         case 4:
            System.out.println("�l�Ԗ�");
            break;
         case 5:
            System.out.println("�����ւ�D�G�ł��B");
            break;
         default:
            System.out.println("�P�`�T����͂��Ă��������B");
            break;
        }
   }

�@  public static int Input_Scanner_int () {
	System.out.println("�L�[�{�[�h������͂��Ă�������");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
 	int num = Integer.parseInt(str);
   	return num ;
  }
}
