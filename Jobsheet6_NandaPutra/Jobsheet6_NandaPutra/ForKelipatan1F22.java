import java.util.Scanner;

public class ForKelipatan1F22 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int kelipatan, total=0, counter=0;
    System.out.print("Masukkan Bilangan Kelipatan (1-9): ");
    kelipatan = scan.nextInt();

    for (int i = 1; i <= 50; i++) {
      if (i % kelipatan == 0){
      total += i;
      counter++;
      }
    }
    System.out.printf("Banyaknya Bilangan %d dari 1 Sampai 10 Adalah %d\n", kelipatan, counter);
    System.out.printf("Total Bilangan Kelipatan %d Dari 1 Sampai 50 Adalah %d\n ", kelipatan, total);
    float rataRata = (float)total/(float)counter;
    System.out.println("Rata Rata Dari Seluruh Bilangan Adalah: " +rataRata);
  }
}
