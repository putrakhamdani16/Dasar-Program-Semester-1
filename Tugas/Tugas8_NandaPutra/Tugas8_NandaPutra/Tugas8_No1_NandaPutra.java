import java.util.Scanner;

public class Tugas8_No1_NandaPutra{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nilai = new int[5];
    
    for (int i=0; i < nilai.length; i++ ){
      System.out.print("Masukkan Element Array: ");
      nilai[i] = sc.nextInt();
    }
    System.out.println("Original Array");
    for (int i=0; i < nilai.length; i++ ){
      System.out.print(nilai[i] + " ");
    }
    System.out.println();
    System.out.println("Reverse Array");
    for(int i = nilai.length - 1; i >= 0; i--){
      System.out.print(nilai[i] + " ");
    }
  }
}