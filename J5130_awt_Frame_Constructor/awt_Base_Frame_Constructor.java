// awt_Base_Frame_Constructor.java
// awt ���C�u�����̃C���|�[�g
import java.awt.* ;

// ���C���N���X
class awt_Base_Frame_Constructor {
    // ���C�����\�b�h
    public static void main( String[] arge ){
	// �R���g���[�����\�b�h�̌Ăяo��
	awt_Base_Method();
    }

    // �R���g���[�����\�b�h
    public static void awt_Base_Method (){
	// �T�u�N���X�̃I�u�W�F�N�g��
	awt_Main_Frame mF = new awt_Main_Frame ();
	// mF.showFrame (); // �Ăяo�������Ȃ�
    }
}

// Frame���g�����ăT�u�N���X���쐬���܂��B
// awt_Main_Frame.java
class awt_Main_Frame extends Frame {
    // �R���X�g���N�^
    // �I�u�W�F�N�g���Ɠ����Ɏ��s�����
    public awt_Main_Frame() {
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
