// IF �̊�{�\��
// ==	���ӂƉE�ӂ���������΁i�^�jtrue	
// !=	���ӂƉE�ӂ��������Ȃ���΁i�^�jtrue	5 != 5 // false
// <	���ӂ��E�ӂ�菬������΁i�^�jtrue	5 < 7 // true
// <=	���ӂ��E�ӈȉ��ł���΁i�^�jtrue	5 <= 3 // false
// >	���ӂ��E�ӂ��傫����΁i�^�jtrue	7 > 5 // true
// >=	���ӂ��E�ӈȏ�ł���΁i�^�jtrue	5 >= 7 // false
// ?:	�u������ ? ��1 : ��2�v�B��������true�Ȃ玮1�Afalse�Ȃ玮2
//  	i >= 1 ? �g�^�h : �g�U�h
// ���
// ���l�@A�@���@B�@���傫��
// �i�^�j�����Ȃ� "��"
// �i�U�j�����łȂ���� "�~" 
//  ���A�o�͂���
// Syantax_if_Base.java
class Syantax_if_Base {
  public static void main(String[] args){
	int  A   = 80 ;
	int  B   = 10 ;
	
	String str = Hikaku ( A , B ) ;
	System.out.println( str ) ;
  }
  public static String Hikaku( int a , int b ) {
	String res ;

	if ( a >= b ) {
	    res = "��" ;
	} else {
	    res = "�~" ;
	}
	return res ; 
  }
}
