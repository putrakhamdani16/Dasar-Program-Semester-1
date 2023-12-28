import java.util.Scanner;

public class Tugas7_No4_NandaPutra {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Nilai N (minimal 5): ");
    int N = sc.nextInt();
    int i, a=1;
    
    if(N >= 5){
      do {
        if (a % 2 != 0){
          for (i = 1; i <= N; i++){
            System.out.print(i);
          }
          System.out.println();
        }else {
          for (i = N ; i > 0; i--){
            System.out.print(i);
          }
          System.out.println();
        }
        a++;
      }while(a <= N);
    }
  }
}
