// Awt_Base_Frame.java

// awt ���C�u�����̃C���|�[�g
import java.awt.*;
import java.awt.event.*;

//�R���g���[���N���X
public class Awt_Base_Frame{
    public static void main(String [] args) {
	awtBaseMain();
    }

    public static void awtBaseMain() {
        mainFrame mF = new mainFrame();
	mF.mainFrame();
    }
}

class mainFrame extends Frame {

    //�����o�ϐ�
    private Frame Frame1 ;    
    private Panel Panel1 ;
    private Label Label1 ;

    private TextField TextField1 ;
    private Button Button1 ;
    //�R���X�g���N�^
    mainFrame() {
	// Frame001�̏����l�̒�`
	//setLayout(null);
	//addWindowListener(new FrameWindowListener());
    }

    // ���C���\�b�h
    void mainFrame() {
	Frame1 = new Frame() ;
	Frame1.setTitle("SubFrame001");
	Frame1.setBounds(100,100, 480, 200);
	Frame1.setBackground(Color.LIGHT_GRAY);
	Frame1.setLayout(null);
	Frame1.setVisible(true);
	Frame1.addWindowListener(new FrameWindowListener());

	Panel1 = new Panel();
	Panel1.setBounds(30, 50, 400, 100);
	Panel1.setBackground(Color.BLUE);
	Panel1.setLayout(null);

	TextField1 = new TextField();
	TextField1.setBounds(10, 10, 250, 20);	
	TextField1.addActionListener(new TextActionListener());
	
	Label1 = new Label();
	Label1.setBounds(10, 40, 250,  20);
	Label1.setBackground(Color.WHITE);
	Label1.setForeground(Color.BLUE);
	Label1.setFont(new Font("Serif", Font.BOLD, 16));

	Frame1.add(Panel1);
	Panel1.add(TextField1);
	Panel1.add(Label1);

	TextField1.addActionListener(new TextActionListener());
    }


    // Windows Event�̏���
    class FrameWindowListener extends WindowAdapter  {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
    }

    // TextFelde Event�̏���
    class TextActionListener implements ActionListener {
       public void actionPerformed(ActionEvent e) {
		Label1.setText(TextField1.getText());
      }
    }

    // Button Event�̏���
   class ButtonActionListener1 implements ActionListener {
      public void actionPerformed(ActionEvent e) {
		// actionPerformed���I�[�o�[���C�h
		// Label2.setText("�{�^���������ꂽ");
      }
   }

    // Button Event�̏���
   class ButtonActionListener2 implements ActionListener {
      public void actionPerformed(ActionEvent e) {
		// actionPerformed���I�[�o�[���C�h
		System.exit(0);
      }
   }

}
