// Awt_application_frame.java
// Frame �̕\��
// https://docs.oracle.com/javase/jp/8/docs/api/java/awt/Window.html
// public void setBounds(int x,int y,int width,int height)
// 	���̃R���|�[�l���g���ړ����A�T�C�Y�ύX���܂��B
// 	������̐V�����ʒu��x��y�ɂ���Ďw�肳��
//	�V�����T�C�Y��width��height�ɂ���Ďw�肳��܂��B
// setSize(int width, int height)
//	����width�ŁA������height�ɂȂ�悤��
//	���̃R���|�[�l���g�̃T�C�Y��ύX���܂��B
// setVisible(boolean b)
//	�p�����[�^b�̒l�ɉ�����
//	����Window��\���܂��͔�\���ɂ��܂��B
//
// �I���́@Ctrl + c
//
// awt ���C�u�����̃C���|�[�g
import java.awt.*;

// SubFrame001�@�N���X���쐬
class SubFrame001 extends Frame {
   // Frame001�̃R���X�g���N�^(�����l)
   SubFrame001() {
	// Frame001�̏����l�̒�`
	super("SubFrame001");
	//this.setTitle("SubFrame002");
	this.setBounds(200, 200, 100, 80);
	this.setSize(480, 240);
	this.setVisible(true);
    }
}

//���C���N���X
public class Awt_Application_Frame {
    public static void main(String [] args) {
	//awt���C�u������Frame���I�u�W�F�N�g��
        SubFrame001 af = new SubFrame001();
    }
}

