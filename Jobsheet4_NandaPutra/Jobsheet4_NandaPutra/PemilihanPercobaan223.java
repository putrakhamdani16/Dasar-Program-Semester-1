//PERCOBAAN 2
import java.util.Scanner;

public class PemilihanPercobaan223 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int nilai1, nilai2;
    float ratarata;
   
    System.out.println("Mauskkan Bilangan Pertama: ");
    nilai1 = input.nextInt();
    System.out.println("Masukka  Bilangan kedua: ");
    nilai2 = input.nextInt();
    
    //SEBELUM DI MODIFIKASI
    // if (nilai>=100){
    //   nilai+=10;
    // }
    // else {
    //   nilai-=10;
    // }
    // System.out.println("Hasil Nilai Akhir Adalah: " +nilai);

    //SETELAH DI MODIFIKASI
    ratarata = ((float)nilai1 + (float)nilai2)/2;
    if (ratarata>=100){
      ratarata-=5;
      System.out.println("Hasil Nilai Rata-Rata Akhir: " +ratarata);
    } 
    else {
      System.out.println("Hasil Nilai Rata-Rata Akhir" +ratarata);
    }

  }
  
}
