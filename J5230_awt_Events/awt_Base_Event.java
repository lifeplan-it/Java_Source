// awt_Base_Event.java
// awt ���C�u�����̃C���|�[�g
import java.awt.* ;
// awt �C�x���g�p���C�u�����C���|�[�g
import java.awt.event.* ;

// ���C���N���X
class awt_Base_Event {
    // ���C�����\�b�h
    public static void main( String[] arge ){
	// �R���g���[�����\�b�h�̌Ăяo��
	awt_Base_Method();
    }

    // �R���g���[�����\�b�h
    public static void awt_Base_Method (){
	// �T�u�N���X�̃I�u�W�F�N�g��
	awt_Base_Frame_Event mF 
		= new awt_Base_Frame_Event ();
	// �\���p���\�b�h�ishowFrame �j�̌Ăяo��
	mF.showFrame ();
    }
}

// Frame���g�����ăT�u�N���X���쐬���܂��B
// �C�x���g��ǉ����܂��B
// awt_Base_Frame_Event.java
class awt_Base_Frame_Event extends Frame {
    // �R���X�g���N�^
    public awt_Base_Frame_Event() {
	
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
	
	// �C�x���g�p�N���X�̃I�u�W�F�N�g��
	FrameWindowListener wl 
		= new FrameWindowListener();
	// �I�u�W�F�N�g�������N���X��Frame�ɒǉ�
	addWindowListener( wl ) ;

    }
    
    // WindowAdapter ���g������
    // �C�x���g�����N���X���쐬
    class FrameWindowListener extends WindowAdapter {
	// Windows��Clse �{�^���������ꂽ�Ǝ��̏���
	public void windowClosing( WindowEvent e ) {
		// �I���̏���
		System.exit( 0 );
	}
    }
}
