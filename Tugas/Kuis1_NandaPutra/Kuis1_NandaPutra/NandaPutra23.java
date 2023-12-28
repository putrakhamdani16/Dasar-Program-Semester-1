import java.util.Scanner;
//Soal 1 Kuis Nanda Putra
public class NandaPutra23{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float konversiKilometer23, konversiMeter23;
    int kecepatan23;
    System.out.println("-----Program Konfers Kecepatan-----");
    System.out.println("Masukkan Kecepetan kendaraan: " );
    kecepatan23 = sc.nextInt();
    konversiKilometer23 = kecepatan23;
    konversiMeter23 = (konversiKilometer23 * 1000) / 3600;
    System.out.println("Kecepatan kendaraan = " + konversiKilometer23 + "km/jam"  + " atau " + konversiMeter23 + "m/s");


   

  }
}