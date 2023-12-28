//PERCOBAAN 1
import java.util.Scanner;

public class PemilihanPercobaan123 {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int bil;
  
  System.out.println("Masukkan sebuah angka bilangan: ");
  bil=input.nextInt();

  //SEBELUM DI MODIFIKASI
  // if (bil%2==0){
  //   System.out.println("Bilangan Genap");
  // }
  // else{
  //   System.out.println("Bilangan Ganjil");
  // }

  //SETELAH DI MODIFIKASI
  String output=(bil%2==0)? "Bilangan Genap":"Bilanagan ganjil";
  System.out.println(output);
}
  
}
