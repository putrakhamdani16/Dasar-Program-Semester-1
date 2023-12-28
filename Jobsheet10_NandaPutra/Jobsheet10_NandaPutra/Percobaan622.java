import java.util.Scanner;
public class Percobaan622 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int p,l,t,L,vol;

    System.out.println("Masukkan panjang");
    p = input.nextInt();
    System.out.println("Masukkan lebar");
    l = input.nextInt();
    System.out.println("Masukkan tinggi");
    t = input.nextInt();
    // tanpa fungsi
    // L = p*l;
    L = hitungLuas(p, l);
    System.out.println("Luas persegi panjang adalah " +L);
    //tanpa fungsi
    // vol = p*l*t;
    vol = hitungVolume(t, p, l);
    System.out.println("Volume balok adalah " + vol);
  }

  static int hitungLuas (int pjg, int lb) {
    int Luas = pjg * lb;
    return Luas;
  }

  static int hitungVolume (int tinggi, int a, int b) {
    int volume = hitungLuas(a,b) * tinggi;
    return volume;
  }
}
