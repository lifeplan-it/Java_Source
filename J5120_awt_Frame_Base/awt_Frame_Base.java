// awt_Frame_Base.java
// awt ���C�u�����̃C���|�[�g
import java.awt.* ;

// ���C���N���X
class awt_Frame_Base {
    // ���C�����\�b�h
    public static void main( String[] arge ){
	// �R���g���[�����\�b�h�̌Ăяo��
	awt_Base_Method();
    }

    // �R���g���[�����\�b�h
    public static void awt_Base_Method (){
	// �T�u�N���X�̃I�u�W�F�N�g��
	awt_Main_Frame mF = new awt_Main_Frame ();
	// �\���p���\�b�h�ishowFrame �j�̌Ăяo��
	mF.showFrame ();
    }
}

// Frame���g�����ăT�u�N���X���쐬���܂��B
// awt_Main_Frame.java
class awt_Main_Frame extends Frame {
    // �R���X�g���N�^
    public awt_Main_Frame() {
	
    }

    // Frame��\�����郁�\�b�h
    public void showFrame (){
	// �^�C�g���̐ݒ�
	setTitle( "awtFrame" );
	// Frame�̕\���ʒu
	setBounds( 640, 480, 100, 80 );
	// �T�C�Y�ݒ�
	setSize( 480, 240 );
	// �\��/��\����ON
	setVisible( true );
    }
}
