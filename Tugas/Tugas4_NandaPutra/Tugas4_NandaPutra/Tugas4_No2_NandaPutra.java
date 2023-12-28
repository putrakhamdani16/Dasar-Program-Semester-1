// Tugas4No2
import java.util.Scanner;

public class Tugas4_No2_NandaPutra {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int umur;

    System.out.println("Masukkan Umur Anda: ");
    umur = sc.nextInt();

    if(umur>=17){
      System.out.println("Selamat Anda Dapat Berkendara");
    }
    else if(umur<17 && umur>0){
      System.out.println("Mohon Maaf Anda Tidak Diperbolehkan Berkendara");
    }
    else {
      System.out.println("Maaf Umur Yang Anda Masukkan Tidak Valid");
    }  
  }  
}
