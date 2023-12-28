import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class Quiz {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    char menu = 'y';
    do {
      int number = random.nextInt(10) +1 ;
      boolean success = false;
      do{
        System.out.print("Tebak Angka (1-10): ");
        int answer = input.nextInt();
        input.nextLine();
        success = (answer == number);
        if(answer < number){
          System.out.println("Angka Yang Anda Masukkan Lebih Kecil");
        }
        else if(answer > number){
          System.out.println("Angka Yang Anda Masukkan Lebih Besar");
        }
        else{
          System.out.println("Selamat tebakan Anda Benar");
        }
      }while (!success);
      System.out.println("Apakah Anda Ingin Mengulang Permainan (Y/T)? ");
      menu = input.nextLine().charAt(0);
    }while(menu == 'y' || menu == 'Y'); 
  }
}
