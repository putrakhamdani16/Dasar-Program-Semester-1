import java.util.Scanner;
public class Tugas10_NandaPutra {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int s,vol,L;
    System.out.println("Masukkan sisi kubus: ");
    s = input.nextInt();

    vol = hitungVolume(s);
    System.out.println("Volume kubus adalah; " +vol);

    L = hitungLuas(s);
    System.out.println("Volume luas adalah: " +L);
  }

  static int hitungVolume(int sisi) {
    int volume = sisi * sisi * sisi;
    return volume;
  }

  static int hitungLuas(int sisi) {
    int luas = 6 * (sisi*sisi);
    return luas;
  }
}
