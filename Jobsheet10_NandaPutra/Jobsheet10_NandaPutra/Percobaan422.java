import java.util.Scanner;
public class Percobaan422 {
  public static void main(String[] args) {
    int nilai1, nilai2, nilaix, nilaiy;
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Nilai 1: ");
    nilai1 = input.nextInt();
    System.out.println("Masukkan Nilai 2: ");
    nilai2 = input.nextInt();
    int hasil = Kurang(nilai1, nilai2);
    System.out.println("Hasil akhir adalah " +hasil);

    System.out.println("Masukkan nilai x: ");
    nilaix = input.nextInt();
    System.out.println("Masukkan nilai y: ");
    nilaiy = input.nextInt();
    int hasil2 = Tambah(nilaix, nilaiy);
    System.out.println("Hasil penambahan dari pengurangan dan perkalian x & y: " +hasil2);

  }

  static int Kali (int C, int D) {
    int H;
    H = (C + 10) % (D + 19);
    return H;
  }

  static int Kurang (int A, int B) {
    int X;
    A = A + 7;
    B = B + 4;
    X = Kali(A,B);
    return X;
  }

  static int Tambah(int x,int y) {
    int Z;
    int H = Kali (x, y);
    int X = Kurang(x, y);
    Z = H + X;
    return Z;
  }
}
