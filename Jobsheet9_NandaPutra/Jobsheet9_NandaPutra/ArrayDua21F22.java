import java.util.Scanner;
public class ArrayDua21F22 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkanya Banyaknya Element Baris: ");
    int elemen = scan.nextInt();
    System.out.print("Masukkan Elemen Kolom: ");
    int elemen2 = scan.nextInt();
    scan.nextLine();
    String[][] pengunjung = new String[elemen][elemen2];
    for(int baris= 0; baris<pengunjung.length; baris++){
      for(int kolom= 0; kolom<pengunjung[0].length; kolom++){
        System.out.printf("Masukkan Pengunjung Ke [%s][%s]: ", baris,kolom);
        pengunjung [baris][kolom] = scan.nextLine();
      }System.out.println("-------------");
    }
    // for(int baris= 0; baris<pengunjung.length; baris++){
    //   for(int kolom= 0; kolom<pengunjung[0].length; kolom++){
    //     System.out.printf("%s\t", pengunjung[baris][kolom]);
    //   }
    //   System.out.println("");
    // }
    for(String array[] : pengunjung) {
      for(String ar : array) {
        System.out.printf("%s ", ar);
      }
      System.out.println("");
    }
  }
}
