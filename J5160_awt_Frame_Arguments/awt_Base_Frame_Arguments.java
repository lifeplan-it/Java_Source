// awt_Base_Frame_Arguments.java
// awt ���C�u�����̃C���|�[�g
import java.awt.* ;

// ���C���N���X
class awt_Base_Frame_Arguments {
    // ���C�����\�b�h
    public static void main( String[] arge ){
	// �R���g���[�����\�b�h�̌Ăяo��
	awt_Base_Method();
    }

    // �R���g���[�����\�b�h
    public static void awt_Base_Method (){
	// �����̏�����
	int x = 480;
	int y = 240;
	int w = 640;
	int h = 320;
	// �T�u�N���X�̃I�u�W�F�N�g��
	awt_Main_Frame mF = new awt_Main_Frame (x,y,w,h);

	// �\���p���\�b�h�ishowFrame �j�̌Ăяo��
	mF.showFrame ();
    }
}

// awt_Main_Frame.java
class awt_Main_Frame extends Frame {
	private int Frame_X ;
	private int Frame_Y ;
	private int Frame_W ;
	private int Frame_H ;

    // �R���X�g���N�^
    public awt_Main_Frame(int fx,int fy,int fw,int fh) {
	Frame_X = fx;
	Frame_Y = fy;
	Frame_W = fw;
	Frame_H = fh;
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
