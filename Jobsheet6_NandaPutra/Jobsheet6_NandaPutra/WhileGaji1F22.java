import java.util.Scanner;

public class WhileGaji1F22 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int karyawan, jam, gaji, jumlah=0;
    String namaJabatan;
    
    System.out.print("Masukkan Jumlah Karyawan: ");
    karyawan = scan.nextInt();

    int i = 0;
    while (i < karyawan) {
      System.out.println("Pilihan Jabatan - Direktur, Manager, Staf");
      System.out.print("Masukkan Jabatan Ke-" + (i + 1) + ": " );
      namaJabatan = scan.next();
      System.out.print("masukkan Jumlah Jam Lembur: ");
      jam = scan.nextInt();
      i++;
      if (namaJabatan.equalsIgnoreCase("direktur")) {
        continue;
      }
      else if (namaJabatan.equalsIgnoreCase("manager")) {
        gaji = jam * 100000;
      }
      else {
        gaji = jam * 75000;
      }
      jumlah += gaji;
    }
    System.out.println("Pengeluaran Perusahan: " +jumlah);
  }
}
