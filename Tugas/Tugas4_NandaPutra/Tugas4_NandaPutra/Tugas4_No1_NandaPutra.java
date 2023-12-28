//Tugas4No1
import java.util.Scanner;

public class Tugas4_No1_NandaPutra{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nilai1, nilai2;

    System.out.println("Masukkan Bilangan Pertama: ");
    nilai1 = sc.nextInt();
    System.out.println("Masukkan Bilangan Kedua: ");
    nilai2 = sc.nextInt();

    if (nilai1 > nilai2){
      System.out.println("Nilai Bilangan Terbesar Adalah: " + nilai1);
    }
    else if (nilai1 < nilai2) {
      System.out.println("Nilai Bilangan Terbesar Adalah: " + nilai2);
    }  
    else {
      System.out.println("Bilangan Yang Anda Masukan Sama Besar");
    }
  }
}