// Variable_Array.java
class variable_Array  {
   public static void main(String[] args)  {

   }
    
public viod Variable_Declaration() {
// �ϐ���`
// ���v�̕ϐ��@goukei
     int goukei = 0;
     int kosu = 5;
     double heikin = 0.0;
     int max1 = 0;
     int min1 = 0;

     // �z��̒�`
     int[] test;
	   test = new int[kosu];

     // �z��̏�����
     test[0] = 3;
     test[1] = 5;
     test[2] = 2;
     test[3] = 4;
     test[4] = 6;

      // ���v�̌v�Z
      for(int i=0; i< kosu; i++){
	       goukei = goukei + test[i];
      }

      // ���ς̌v�Z
      heikin = (double)goukei / (double)kosu;

      // �ő�l�̌v�Z
      max1 = test[0];
      for(int i=0; i< kosu; i++){
        if (max1 < test[i]) {
          max1 = test[i];
        }
    	}

      // �ŏ��l�̌v�Z
      min1 = test[0];
      for(int i=0; i< kosu; i++){
        if (min1 > test[i]) {
          min1 = test[i];
        }
    	}

      System.out.println("��:" + kosu);
      System.out.println("���v:" + goukei);
      System.out.println("����:" + heikin);
      System.out.println("�ő�l�F" + max1);
      System.out.println("�ŏ��l�F" + min1);
   }
}
