import java.util.Scanner;

public class Tugas8_No2_NandaPutra {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.print("Masukkan Banyaknya Element: ");
    int elemen = sc.nextInt();
    int output[] = new int[elemen];

    for(int i = 0; i < output.length; i++){
      System.out.print("Masukka Nilai Elemen Ke " + i + " : ");
      output[i] = sc.nextInt();
    }
    int biggest = output[0];
    for(int a = 0; a < output.length; a++){
      if(output[a] > biggest){
         biggest = output[a];
      }
    }
    System.out.print("Nilai Terbesar Elemen Adalah " +biggest );
  }
}
