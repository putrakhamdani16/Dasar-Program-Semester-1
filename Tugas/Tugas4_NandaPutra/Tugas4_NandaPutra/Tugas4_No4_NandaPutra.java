//Tugas4No4
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Tugas4_No4_NandaPutra {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int barA, barB, barC, jumA, jumB,jumC, total;
    float diskon, bayar;

    System.out.println("Masukkan Harga Barang A: ");
    barA = sc.nextInt();
    System.out.println("Masukkan Jumlah Barang A: ");
    jumA = sc.nextInt();
    System.out.println("Masukkan Harga Barang B: ");
    barB = sc.nextInt();
    System.out.println("Masukkan Jumlah Barang B: ");
    jumB = sc.nextInt();
    System.out.println("Masukkan Harga Barang C: ");
    barC = sc.nextInt();
    System.out.println("Masukkan Jumlah Barang C: ");
    jumC = sc.nextInt();

    System.out.println("\t------Setruk Nota------");
    System.out.println("Nama Barang | " + " Harga | " + " Jumlah | " + " Total");
    System.out.println(String.format("Barang A \t%s \t%s \t%s", barA, jumA, barA * jumA));
    System.out.println(String.format("Barang B \t%s \t%s \t%s", barB, jumB, barB * jumB));
    System.out.println(String.format("Barang C \t%s \t%s \t%s", barC, jumC, barC * jumC));
    
    total = (barA * jumA) + (barB * jumB) + (barC * jumC);
    System.out.println("Total\t\t: " +total);
    
    if(total>1000000){
      diskon = total * 10/100;
    }
    else if(total>500000){
      diskon = total * 5/100;
    }
    else if(total>200000){
      diskon = total * 2/100;
    }
    else{
      diskon = 0;
      System.out.println("Mohon Maaf Anda Tidak Mendapatkan Diskon");
    }
    System.out.println("Diskon\t\t: " + diskon);
    bayar = total - diskon;
    System.out.println("Total Bayar\t: " + bayar);

  }
}
