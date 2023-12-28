import java.util.Scanner;

public class UTS_22_NandaPutra {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String namaPelanggan22, jenisLayanan, konfirmasi22;
    double harga22=0,beratPakaian22=0,cuci22=3000,cuciDanSetrika22=5000,diskon22;
    
    do{
    System.out.println("Masukkan Nama Pelanggan: ");
    namaPelanggan22 = scan.nextLine();
    System.out.println("Apakah Nama Anda Berawalan Huruf S? (Y/T):" );
    konfirmasi22 = scan.nextLine();
    System.out.println("Masukkan Jenis Layanan (cuci / cuci dan setrika): ");
    jenisLayanan = scan.nextLine();
    System.out.println("Masukkan Berat Pakaian: ");
    beratPakaian22 = scan.nextFloat();
    if(jenisLayanan.equalsIgnoreCase("cuci")){
      if (konfirmasi22.equalsIgnoreCase("ya")){
        harga22 = beratPakaian22 * cuci22;
        diskon22 = harga22 * 0.7/100;
        System.out.println("total Harga Diskon 7%: " +diskon22);
      }
      else{
      harga22 = beratPakaian22 * cuci22;
      System.out.println("Total Harga : " +harga22);

      }
    }
    else if (jenisLayanan.equalsIgnoreCase("cuci dan setrika")){
      if (konfirmasi22.equalsIgnoreCase("ya")){
        harga22 = beratPakaian22 * cuciDanSetrika22;
        diskon22 = harga22 * 0.7/100;
        System.out.println("Total harga Diskon 7%: " +diskon22);
      }
      else{
      harga22 = beratPakaian22 * cuciDanSetrika22;
      System.out.println("Total Harga:" +harga22) ;

      }
    }
    else {
      System.out.println("Input Salah");
  }
}while(beratPakaian22>0);
    System.out.println("Jumlah Layanan Cuci: ");
    System.out.println("Jumlah Layanan Cuci dan Setrika: ");
    System.out.println("Total Sebelum Membayar Listrik: ");
    System.out.println("Total Sesudah Membayar Listrik: ");
}
}
