// Class_Abstract_Base.java
// ���ۉ��N���X�̃T���v��
class Class_Abstract_Base {
   public static void main(String[] args)   {
 	BaseBoll_Payer  P1 = new BaseBoll_Payer () ;
 	P1.Walk  ( "20Km" ) ;
	P1.Speak( "����ɂ���" ) ;
	P1.Strike( "��ۑ�" );
   }
}

class BaseBoll_Payer extends Human {
   public BaseBoll_Payer() {	// �R���X�g���N�^
             System.out.println( "�싅�I��"  ); 
    }
   
   public void Strike ( String Stk ) {
         System.out.println( "�łF"  + Stk );
   }
   public void Walk( String Spd ) {
         System.out.println( "����F" + Spd );
   }
}

abstract class Human {
   public Human () {	
     // �R���X�g���N�^
   }

  abstract void Strike ( String Stk ) ;
 
   public void Walk( String Spd ) {
         System.out.println( "�����F" + Spd );
   }
   
   public void Speak(String Spk ) {
         System.out.println( "�b���F" + Spk );
   }
}

