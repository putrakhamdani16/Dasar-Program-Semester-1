import java.util.Scanner;

public class PercobaanNilai {
  public static void main(String[] args) {
    int nilai;
    String grade;
    Scanner scan = new Scanner(System.in);

    System.out.print("Inputkan nilai: ");
    nilai = scan.nextInt();

    if(nilai>=0 || nilai<=100){
      if (nilai>=90 && nilai<=100) {
        System.out.println("Nilai A, EXCELLENT");
      }
      else if (nilai>=80 && nilai<=89){
        System.out.println("Nilai B, Pertahankan Prestasi Anda");
      }
      else if (nilai>=60 && nilai<=79){
        System.out.println("Nilai C, Tingkatkan Prestasi Anda");
      }
      else if (nilai>=50 && nilai<=59){
        System.out.println("NIlai D, Tingkatkan Belajar Anda");
      }
      else {
        System.out.println("Nilai E, Anda Tidak Lulus!");
      }
    }
    else {
      //SEBELUM DI MODIFIKASI
      //System.out.println("Nilai Yang Anda Masukkan Tidak Valid");
      if (nilai<0){
        System.out.println("Nilai Yang Anda Masukkan Kurang Dari 0");
      }
      else {
        System.out.println("Nilai Yang Anda Masukkan Lebih Dari 100");
      }
    }
  }
}
