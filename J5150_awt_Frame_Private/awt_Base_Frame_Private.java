// awt_Base_Frame_Private.java
// awt ���C�u�����̃C���|�[�g
import java.awt.* ;

// ���C���N���X
class awt_Base_Frame_Private {
    // ���C�����\�b�h
    public static void main( String[] arge ){
	// �R���g���[�����\�b�h�̌Ăяo��
	awt_Base_Method();
    }

    // �R���g���[�����\�b�h
    public static void awt_Base_Method (){
	// �T�u�N���X�̃I�u�W�F�N�g��
	awt_Main_Frame mF = new awt_Main_Frame ();

	// �����o�ϐ��ւ̃A�N�Z�X�̓G���[
	// mF.Frame_X = 480;
	// mF.Frame_Y = 480;
	// mF.Frame_W = 640;
	// mF.Frame_H = 320;

	// �\���p���\�b�h�ishowFrame �j�̌Ăяo��
	mF.showFrame ();
    }
}

// Frame���g�����ăT�u�N���X���쐬���܂��B
// awt_Main_Frame.java
class awt_Main_Frame extends Frame {
    // �����o�ϐ��̒�`
	private int Frame_X ;
	private int Frame_Y ;
	private int Frame_W ;
	private int Frame_H ;

    // �R���X�g���N�^
    // �����o�ϐ��̏�����
    public awt_Main_Frame() {
	Frame_X = 480;
	Frame_Y = 480;
	Frame_W = 640;
	Frame_H = 320;
    }

    // Frame��\�����郁�\�b�h
    public void showFrame (){
	// �^�C�g���̐ݒ�
	setTitle( "awtFrame" );
	// Frame�̕\���ʒu
	setBounds( Frame_X, Frame_X, Frame_W, Frame_H );
	// �T�C�Y�ݒ�
	setSize( Frame_W, Frame_H );
	// �\��/��\����ON
	setVisible( true );
    }
}
