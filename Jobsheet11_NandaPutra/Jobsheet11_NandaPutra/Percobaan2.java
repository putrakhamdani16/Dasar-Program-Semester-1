import java.util.Scanner;
public class Percobaan2 {
  public static void main(String[] args) {
   int bilangan, pangkat;
    Scanner sc = new Scanner(System.in);
  System.out.print("Bilangan yang dihitung: ");
   bilangan = sc.nextInt();
   System.out.print("Pangkat: "); 
   pangkat = sc.nextInt();

   for(int z = 0; z < pangkat; z++) {
    System.out.print(bilangan);
   if (z < pangkat - 1) {
    System.out.print(" x ");
   } 
  }
  System.out.println(" = " +hitungPangkat(bilangan, pangkat));
  }

  static int hitungPangkat(int x, int y) {
    if (y == 0) {
      return(1);
    }
    else {
      return (x * hitungPangkat(x, y - 1));
    }
  }
}