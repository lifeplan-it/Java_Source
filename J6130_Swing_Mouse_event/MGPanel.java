import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// �p�l���N���X
public class MGPanel extends JPanel {

	private		MGMouseAdapter		mgma		= null;

	private		String				message		= null;
	private		int					x			= 0;
	private		int					y			= 0;

	/**
	 * �R���X�g���N�^
	 */
	public MGPanel() {

		// �X�[�p�[�N���X���Ăяo��
		super();

		// �p�l���T�C�Y
		super.setPreferredSize(new Dimension(800, 600));
		// ���C�A�E�g�ݒ�
		super.setLayout(null);

		// �}�E�X�A�_�v�^�𐶐�
		mgma = new MGMouseAdapter();
		// �p�l���Ƀ}�E�X���X�i�[��ǉ�����
		super.addMouseListener(mgma);

	} // end MGPanel

	/**
	 * �`�惁�\�b�h.
	 * <pre>
	 * �y�C���g����K�v������Ƃ��ɂ��̃��\�b�h���Ăяo����܂��B
	 * </pre>
	 */
	public void paint(Graphics g){

		// ��ʂ�h��Ԃ�
		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 600);

		// ���b�Z�[�W������ꍇ�A
		if(message != null){
			// ���b�Z�[�W��`�悷��
			g.setColor(Color.yellow);
			g.drawString(message, x, y);
		}

	} // end paint

	/**
	 * �}�E�X�A�_�v�^
	 */
	private class MGMouseAdapter extends MouseAdapter {

		/**
		 * �}�E�X�������ꂽ���ɌĂ΂�܂�
		 */
		public void mousePressed(MouseEvent me){

			// �}�E�X�C�x���g�̓��e���o��
			message = "�}�E�X�������ꂽ��";
			System.out.println(me);
			// �ꏊ���L������
			x = me.getX();
			y = me.getY();
			// �`�悷��
			repaint();

		} //  end mousePressed

		/**
		 * �}�E�X�������ꂽ���ɌĂ΂�܂�
		 */
		public void mouseReleased(MouseEvent me){

			// �}�E�X�C�x���g�̓��e���o��
			message = "�}�E�X�������ꂽ��";
			System.out.println(me);
			// �ꏊ���L������
			x = me.getX();
			y = me.getY();
			// �`�悷��
			repaint();

		} //  end mouseReleased

		/**
		 * �}�E�X���N���b�N���ꂽ���ɌĂ΂�܂�
		 */
		public void mouseClicked(MouseEvent me){

			// �}�E�X�C�x���g�̓��e���o��
			message = "�}�E�X���N���b�N���ꂽ��";
			System.out.println(me);
			// �ꏊ���L������
			x = me.getX();
			y = me.getY();
			// �`�悷��
			repaint();

		} //  end mouseClicked

	} // end MGMouseAdapter

}
