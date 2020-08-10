// Source : Awt_Application_HelloJAVA.java
// Window�@���쐬���ĕ`�悵�܂��B
// Window�@�ɂ́A�e�L�X�g����͂���
// ���͂������e���ďo�͂��܂��B
// �u�I���v�{�^���������ƏI�����܂��B

// awt ���C�u�����̃C���|�[�g
import java.awt.*;
import java.awt.event.*;

//���C���N���X:HelloJAVA
public class Awt_Application_HelloJAVA {
    //���C�����\�b�h
    public static void main(String [] args) {

	// subFrame000 �N���X���I�u�W�F�N�g��
	subFrame000 obj001 = new subFrame000();

	// Frame ���̃��\�b�h�Ăяo��
	obj001.subFrame001(100,100);

    }
}

// �N���X��:subFrame000
// �@�\    �F�@�E�C���h�E���쐬����B
// ����    �F�@
class subFrame000 extends Frame {

    //Class �ϐ��̒�`
    private Frame Frame1 ;    
    private Panel Panel1 ;
    private Label Label0 ;  
    private Label Label1 ;
    private TextField TextField1 ;
    private Button Button1 ;

    // �R���X�g���N�^�i�����ł͂Ȃɂ����Ă��܂���j
    subFrame000() {
	//setLayout(null);
	//addWindowListener(new FrameWindowListener());
    }

    void subFrame001(int x, int y) {

	Frame1 = new Frame() ;

	Frame1.setTitle("subFrame001");
	Frame1.setBounds(  x,  y, 350, 300);
	Frame1.setBackground(Color.LIGHT_GRAY);
	Frame1.setLayout(null);
	Frame1.setVisible(true);
	Frame1.addWindowListener(new FrameWindowListener());

	Panel1 = new Panel();

	Panel1.setBounds(30, 50, 290, 200);
	Panel1.setBackground(Color.BLUE);
	Panel1.setLayout(null);
	
	Label0 = new Label();

	Label0.setBounds(10, 10, 250,  20);
	Label0.setBackground(Color.BLUE);
	Label0.setForeground(Color.WHITE);
	Label0.setText("��������͂��Ă�������" );
	Label0.setFont(new Font("Serif", Font.BOLD, 16));

	TextField1 = new TextField();

	TextField1.setBounds(10, 30, 250, 20);	
	TextField1.addActionListener(new TextActionListener());
	
	Label1 = new Label();

	Label1.setBounds(10, 100, 250,  20);
	Label1.setBackground(Color.WHITE);
	Label1.setForeground(Color.BLUE);
	Label1.setFont(new Font("Serif", Font.BOLD, 16));

	Button1 = new Button("�I��");
	Button1.setBounds(80,180, 80, 20);
	Button1.addActionListener(new ButtonActionListener1());

	Frame1.add(Panel1);
	Panel1.add(Label0);
	Panel1.add(TextField1);
	Panel1.add(Label1);
	Panel1.add(Button1);

    }

    // TextFelde Event�̏���
    class TextActionListener implements ActionListener {
       public void actionPerformed(ActionEvent e) {
		Label1.setText(TextField1.getText());
      }
    }

    // Windows Event�̏���
    class FrameWindowListener extends WindowAdapter  {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
    }

    // Button Event�̏���
   class ButtonActionListener1 implements ActionListener {
	// actionPerformed���I�[�o�[���C�h
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
      }
   }

}
