import java.util.Scanner;

public class Tugas8_No3_NandaPutra {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Banyaknya Element: ");
    int elemen = sc.nextInt();
    int output[] = new int[elemen];

    for(int i = 0; i < output.length; i++){
      System.out.print("Masukka Nilai Elemen Ke " + (i+1) + " : ");
      output[i] = sc.nextInt();
    }
    for(int i= 0; i < output.length; i++){
      if(output[i] % 2== 0){
        System.out.println("Angka Genap: " +output[i]);
      }
    }
    for(int i= 0; i < output.length; i++){
      if(output[i] % 2 != 0){
        System.out.println("Angka Ganjil: " +output[i]);
      }
    }
  }
}
