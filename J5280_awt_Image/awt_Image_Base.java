// awt_Image_Base.java

import java.awt.*;
import java.awt.event.*;

public class awt_Image_Base {
   public static void main(String[] args)  {
      Start_awt_Frame ();
   }
  
  public static void Start_awt_Frame () {
      awt_Image_Main sm = new awt_Image_Main();

      sm.Paint_imag("ICON-48.jpg") ;

  }
}

class awt_Image_Main extends Frame {
     private Toolkit tk ;
     private Image  img ;

     public awt_Image_Main()   {
 	super("paint Image");
	addWindowListener(new SampleWindowListener());
	setSize(640, 320 );
	setVisible(true);
	tk = getToolkit();
   }

   public void Paint_imag ( String ImgFile ) {
	// tk = getToolkit();
	img = tk.getImage( ImgFile );
  }

   public void paint(Graphics g)   {
      g.drawImage(img, 100, 100, this);
   }

   class SampleWindowListener extends WindowAdapter    {
      public void windowClosing(WindowEvent e)    {
         System.exit(0);
      }
  } 
}
