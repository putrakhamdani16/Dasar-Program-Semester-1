//PERCOBAAN 3
import java.util.Scanner;

public class PemilihanPercobaan323 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int umur;
    System.out.println("Masukkan Umur Anda: ");
    umur = input.nextInt();

    if(umur>60){
      System.out.println("Lansia");
    }
    else if(umur>45){
      System.out.println("Tua");
    }
    else if(umur>17){
      System.out.println("Dewasa");
    }
    else if(umur>5){
      System.out.println("Kecil");
    }
    else if(umur>0) {
      System.out.println("Balita");
    }
    else{
      System.out.println("Maaf Umur Yang Anda Masukan Salah");
    }
  }
  
}
