import java.util.Scanner;

public class DoWhileCuti1F22 {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int cuti = 5;
  char konfirmasi;
  do {
    System.out.print("Apakah Anda Menggunakan Jatah Cuti 1 Hari (y/t)? ");
    konfirmasi = scan.next().charAt(0);
    if(konfirmasi == 'y' || konfirmasi == 'Y'){
      cuti--;
      System.out.printf("sisa %d hari\n", cuti);
      if (cuti == 2) {
        System.out.println("Stop! Jatah Cuti Tinggal 2 Hari");
        break;
       }
       //modifikasi
      }else if (konfirmasi == 't' || konfirmasi == 'T') {
        break;
       }
      
    } while (cuti > 0);
  
  }
}
