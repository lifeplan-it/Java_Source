// Awt_Application_Panel2.java

// awt ���C�u�����̃C���|�[�g
import java.awt.*;
import java.awt.event.*;

//���C���N���X
public class Awt_Application_Panel2 {
    public static void main(String [] args) {

	// Frame ���̃N���X�Ăяo��
        SubFrame000 sf000 = new SubFrame000();

	// Frame ���̃��\�b�h�Ăяo��
	sf000.SubFrame001(100,100);

	// Frame ���̃��\�b�h�Ăяo��
	sf000.SubFrame002(100,300);

    }
}

class SubFrame000 extends Frame {

    //Class �ϐ�
    private Frame Frame1 ;    
    private Frame Frame2 ;    
    private Panel Panel1 ;
    private Panel Panel2 ;
    private Label Label1 ;
    private Label Label2 ;

    private TextField TextField1 ;
    private Button Button1 ;
    private Button Button2 ;

    SubFrame000() {
	//�R���X�g���N�^
	// Frame001�̏����l�̒�`

	//setLayout(null);
	//addWindowListener(new FrameWindowListener());
    }

    // SubFrame001�@����郁�\�b�h
    void SubFrame001(int x, int y) {

	// Frame001�̏����l�̒�`
	Frame1 = new Frame() ;
	Frame1.setTitle("SubFrame001");
	Frame1.setBounds(  x,  y, 480, 200);
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

    // SubFrame002�@����郁�\�b�h
    void SubFrame002(int x, int y) {

	// Frame002�̏����l�̒�`
	Frame2 = new Frame() ;
	Frame2.setTitle("SubFrame002");
	Frame2.setBounds(  x,  y, 480, 200);
	Frame2.setBackground(Color.LIGHT_GRAY);
	Frame2.setVisible(true);
	Frame2.setLayout(null);

	Panel2 = new Panel();
	Panel2.setBounds(30, 50, 400, 100);
	Panel2.setBackground(Color.YELLOW);
	Panel2.setLayout(null);

	Label2 = new Label();
	Label2.setBackground(Color.GREEN);
	Label2.setBounds(10, 50, 250,  20);

	Button1 = new Button("�{�^��");
	Button1.setBounds(10,10, 80, 20);

	Button2 = new Button("�I��");
	Button2.setBounds(80,80, 80, 20);

	Frame2.add(Panel2);
	Panel2.add(Button1);
	Panel2.add(Button2);
	Panel2.add(Label2);

	Frame2.addWindowListener(new FrameWindowListener());
	Button1.addActionListener(new ButtonActionListener1());
	Button2.addActionListener(new ButtonActionListener2());

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
		Label2.setText("�e�L�X�g�����͂��ꂽ");
      }
    }

    // Button Event�̏���
   class ButtonActionListener1 implements ActionListener {
      public void actionPerformed(ActionEvent e) {
		// actionPerformed���I�[�o�[���C�h
		Label2.setText("�{�^���������ꂽ");
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
