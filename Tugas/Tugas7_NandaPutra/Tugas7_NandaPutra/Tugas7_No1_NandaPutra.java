import java.util.Scanner;

public class Tugas7_No1_NandaPutra{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N;
    do{
      System.out.print("Masukkan Nilai N (minimal 3): ");
       N = sc.nextInt();
      if (N >=3) break;
        System.out.println("Masukkan Angka Lebih Dari 3");
    }while(true);
    if (N >= 3){
    int i = 0;
    do{
      for(int o = (N-i); o>0; o--){
        System.out.print(" ");
      }
      for (int a = 0; a<i; a++){
        System.out.print(a+1);
      }
      System.out.print("\n");
      i++;
    }while (i<=N);
  }
  }
}