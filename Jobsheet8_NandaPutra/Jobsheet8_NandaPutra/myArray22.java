public class myArray22{
  public static void main(String[] args) {
    int[] bil = new int[4];
     bil[0]= 5;
     bil[1]= 12;
     bil[2]= 7;
     bil[3]= 20;
    
    //Modifikasi Homogen Yang Salah
    // bil[0]= 5.0;
    // bil[1]= 128567;
    // bil[2]= 7.5;
    // bil[3]= 2000000;

    System.out.println(bil[0]);
     System.out.println(bil[1]);
     System.out.println(bil[2]);
     System.out.println(bil[3]);
    
    //  Modifikasi Hasil Output Sama
    // for(int i = 0; i < 4; i++) {
    //   System.out.println(bil[i]);
    // }
  }
}