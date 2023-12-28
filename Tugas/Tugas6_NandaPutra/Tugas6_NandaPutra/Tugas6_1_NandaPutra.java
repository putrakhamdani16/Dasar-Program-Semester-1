import java.util.Scanner;

public class Tugas6_1_NandaPutra{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int bAngka;
    System.out.print("Masukkan Batas Angka : ");
    bAngka = scan.nextInt();
    //Akhir nim 0 + 2 = kelipatan 2 tidak dimunculkan
    for(int a= 1; a <= bAngka; a++){
      if (a % 2 == 0)
      continue;
      System.out.printf("%d ", a);
    }
  }
}