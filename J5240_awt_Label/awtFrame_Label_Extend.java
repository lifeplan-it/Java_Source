// awtFrame_Label_Panel.java
// Frame �̕\��
// https://www.javadrive.jp/tutorial/nulllayout/index1.html
//

// awt ���C�u�����̃C���|�[�g
import java.awt.*;
import java.awt.event.*;

// Frame_Events�@�N���X���쐬
public class awtFrame_Frame001 extends Frame {

   awtFrame_Frame001() {

	super("�T���v��");
	Panel p = new Panel();
	setLayout(null);

	//setTitle("My Window Application");
	//setBackground(Color.cyan);
	//setBounds(200, 200, 100, 80);

	Label lb = new Label("�悤�����B");

	lb.setForeground(Color.BLUE);
	lb.setFont(new Font("Serif", Font.BOLD, 24));
	lb.setBounds(100, 100, 80, 30);
	add(lb);

	//TextField t1 = new TextField("Hello World!!");
	//TextField t1 = new TextField("Hello World!!");
	//t1.setBounds(100, 100, 80, 30);
	//add(t1)

	setSize(480, 240);
	setVisible(true);

	addWindowListener(new GuiWindowListener());

    }


}

class GuiWindowListener extends WindowAdapter  {
   public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
}

//���C���N���X
public class awtFrame_Label_Panel {
    public static void main(String [] args) {
	//awt���C�u������Frame���I�u�W�F�N�g��
        awtFrame_Frame001 af = new awtFrame_Frame001();

    }
}

