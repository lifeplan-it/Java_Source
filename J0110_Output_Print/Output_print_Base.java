// Output_print_Base.java

class Output_print_Base  {
  public static void main(String[] args)  {
	Output_Print_String ();
	Output_Print_Str () ;
	Output_Print_Add () ;
	Output_Print_Esc () ;
	Output_Print_Tab ();
   }

   private static void Output_Print_String () {
	// ���e�����̏o��
      	System.out.println("�悤����Java��!");
   }

    private static void Output_Print_Str () {
	// ���s���Ȃ��ŏo�͂���
	System.out.print("print��");
	System.out.print("���s");
	System.out.print("���Ȃ�");
	System.out.println("");
    }

    private static void Output_Print_Add () {
	// ���e�����̌���
	System.out.println("������" + "+" + "��" + "�A������");
    }

    private static void Output_Print_Esc () {
	// ���s�����i\n�j
	System.out.println("�s��\n�����I��\n���s");
    }

    private static void Output_Print_Tab () {
	// TAB���i\t�j
	System.out.print("TAB\t");
	System.out.print("��\t");
	System.out.print("�Ԋu��\t");
	System.out.print("�󂯂�\t");
	System.out.println("");
    }

}