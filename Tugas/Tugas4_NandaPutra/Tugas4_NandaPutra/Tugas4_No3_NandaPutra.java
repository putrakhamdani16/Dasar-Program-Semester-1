//Tugas4No3
import java.util.Scanner;

public class Tugas4_No3_NandaPutra {
  public static void main(String[] args) {
    Scanner nilai = new Scanner(System.in);
    float uas, uts, kuis, tugas, nilaiAkhir;

    System.out.println("Masukkan Nilai UAS: ");
    uas = nilai.nextFloat();
    System.out.println("Masukkan Nilai UTS: ");
    uts = nilai.nextFloat();
    System.out.println("Masukkan Nilai KUIS: ");
    kuis = nilai.nextFloat();
    System.out.println("Masukkan Nilai TUGAS: ");
    tugas = nilai.nextFloat();

    nilaiAkhir = (40 * uas)/100 + (30 * uts)/100 + (10 * kuis)/100 + (20 * tugas)/100;
    System.out.println("Nilai Akhir Anda Adalah: " + nilaiAkhir);
    
    if (nilaiAkhir > 65) {
      System.out.println("Selamat Anda Tidak Remidi");
    }
    else {
    System.out.println("Maaf Anda Remidi");
    }
  }
}