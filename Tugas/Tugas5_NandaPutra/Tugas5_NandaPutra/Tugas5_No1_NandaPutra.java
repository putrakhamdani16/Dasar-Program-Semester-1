import java.util.Scanner;

public class Tugas5_No1_NandaPutra {
  public static void main(String[] args) {
    int biayaAdmin, pg, sg, mg, reg;
    String kodeKeberangkatan;
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Kode Keberangkatan [pg/sg/mg/reg]: ");
    kodeKeberangkatan = sc.nextLine();
    System.out.println("Kode Keberangkatan: " +kodeKeberangkatan);

    if (kodeKeberangkatan.equalsIgnoreCase("pg")){
      pg = 1250000;
      biayaAdmin = pg + 50000;
      System.out.println("Kelas Kereta: Eksekutif");
      System.out.println("Biaya Tiket : " +pg);
      System.out.println("Total Bayar: " +biayaAdmin);
    }
    else if (kodeKeberangkatan.equalsIgnoreCase("sg")){
      sg = 1375000;
      biayaAdmin = sg + 50000;
      System.out.println("Kelas Kereta: Bisnis");
      System.out.println("Biaya Tiket: " +sg);
      System.out.println("Total Bayar: " +biayaAdmin);
    }
    else if (kodeKeberangkatan.equalsIgnoreCase("mg")){
      mg = 2500000;
      biayaAdmin = mg + 50000;
      System.out.println("Kelas Kereta: Luxury");
      System.out.println("Biaya Tiket: " +mg);
      System.out.println("Total Bayar: " +biayaAdmin);
    }
    else if (kodeKeberangkatan.equalsIgnoreCase("reg")){
      reg = 50000;
      System.out.println("Kelas Kereta: Luxury");
      System.out.println("Biaya Tiket: " +reg);
      System.out.println("Total Bayar: " +reg);
    }
    else {
      System.out.println("Kode Keberangkatan Yang Anda Masukkan Salah");
    }   
  }
}