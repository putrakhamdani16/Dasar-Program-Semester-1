import java.util.Scanner;

public class rataNilai22{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double total = 0;
    double rata;
    System.out.print("Masukkan jumlah Mahasiswa: ");
    int elemen = sc.nextInt();
    int nilai[] = new int[elemen];


    for(int i = 0; i < nilai.length; i++) {
      System.out.print("Masukkan Nilai Mahasiswa ke " + (i+1) +" : ");
      nilai[i] = sc.nextInt();
    }
    for(int i = 0; i < nilai.length; i++) {
      total += nilai[i];
      
    }
    rata = total / nilai.length;
    System.out.println("Rata Rata Nilai Kelas Adalah: " +rata);
  }
}