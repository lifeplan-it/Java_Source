import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// �t���[���N���X
public class MGFrame extends JFrame {
	private	MGPanel	panel = null;

	public static void main(String[] args){
		MGFrame mg01 = new MGFrame();
	}

	// �R���X�g���N�^
	public MGFrame() {

		// �X�[�p�[�N���X���Ăяo��
		super();

		// �~�{�^���������ꂽ��A�I������
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���C�A�E�g�ݒ�
		super.setLayout(new BorderLayout());

		// �p�l���𐶐�����
		panel = new MGPanel();

		// �t���[���̃R���e���g�y�C����u��������
		super.setContentPane(panel);

		// �t���[����\��
		super.setVisible(true);
		// �T�C�Y���œK������
		super.pack();

	} // end MGFrame

}
