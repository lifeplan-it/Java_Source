// Syntax_Calculation_Keyinput.java
// ���͂����f�[�^��z��ɓ����
// ���v�E���E���ρE�ő�E�ŏ����v�Z����
//
// ���s���@�@( Windows Shell )
// $ javac J0033_input_dim_average.java
//
// $ java J0033_input_dim_average
// ��������͂��Ă��������B
// 4
// ��������͂��Ă��������B
// 5
// ��������͂��Ă��������B
// 2
// ��������͂��Ă��������B
// 3
// ��������͂��Ă��������B
// 7
// ��:5
// ���v:21
// ����:4.2
// �ő�l7
// �ŏ��l2
//
import java.io.*;

class Syntax_Calculation_Keyinput {
   public static void main(String[] args) throws IOException    {
     // �ϐ���`
     // ���v�̕ϐ��@goukei
     int goukei = 0;
     // ���͌��@kosu
	   int kosu = 0;
     // ���ϒl�@heikin
	   double heikin = 0.0;
     // �ő�l�@max1
     int max1 = 0;
     // �Œ��n�@min1
     int min1 = 0;

     // �z��̒�`
     int[] test;
	   test = new int[5];

     // �L�[�{�[�h���͂̒�`
     BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

      // ����
      for(int i=0; i< 5; i++)
      {
        // ���̗͂U��
	      System.out.println("��������͂��Ă��������B");

        // �L�[�{�[�h����
        String str = br.readLine();

        // �����@res �Ɂ@������@str ��ϊ�
        int res = Integer.parseInt(str);

        // �z��@test �Ɂ@�����@res ����
        test[i] = res ;

        // ���͉񐔂̃J�E���g
        kosu++;
      }

      // ���v�̌v�Z
      for(int i=0; i< 5; i++){
	       goukei = goukei + test[i];
      }

      // ���ς̌v�Z
      heikin = (double)goukei / (double)kosu;

      // �ő�l�̌v�Z
      max1 = test[0];
      for(int i=0; i< 5; i++){
        if (max1 < test[i]) {
          max1 = test[i];
        }
    	}

      // �ŏ��l�̌v�Z
      min1 = test[0];
      for(int i=0; i< 5; i++){
        if (min1 > test[i]) {
          min1 = test[i];
        }
    	}

      // �o��
      System.out.println("��:" + kosu);
      System.out.println("���v:" + goukei);
      System.out.println("����:" + heikin);
      System.out.println("�ő�l�F" + max1);
      System.out.println("�ŏ��l�F" + min1);
   }
}
