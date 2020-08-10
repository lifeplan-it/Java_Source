// Student.java
class Subject {
  static int total ;
  int score ;

  public static void dispScore ( int s ) {
	score = s ;
	total += score ;
	System.out.println ("score : " + score + " total : " + total ); 
  }

public static Student { 
  public static void main ( String [] arge ) {
  	Subject math = new Subject () ;
	Subject english = new Subject () ;
	
	math.dispScore( 90 ) ;
	english.dispScore( 85 ) ;

  }
}
}