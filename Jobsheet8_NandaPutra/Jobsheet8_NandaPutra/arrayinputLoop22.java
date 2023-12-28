import java.util.Scanner;

public class arrayinputLoop22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nilaiUAS[] = new int[6];
    // for(int i=0; i<6; i++){
    //   System.out.print("Masukkan Nilai UAS ke "+i+": ");
    //   nilaiUAS[i] = sc.nextInt();
    // }
    for(int i=0; i<nilaiUAS.length; i++){
      System.out.print("Masukkan Nilai UAS ke "+i+": ");
      nilaiUAS[i] = sc.nextInt();
    }
    // for(int i=0; i<6; i++){
    //   System.out.println("Nilai UAS ke " +i+ " adalah " +nilaiUAS[i]);
    // }
    for(int i=0; i<nilaiUAS.length; i++){
      if(nilaiUAS[i]>70){
        System.out.println("Mahasiswa " +i+ " Lulus "); 
      }
      if(nilaiUAS[i]<=70){
        System.out.println("Mahasiswa " +i+ " Gagal ");
      }
    }
  }
}
