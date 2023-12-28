import java.util.Scanner;

public class Tugas5_No2_NandaPutra {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double luas, volume, sisi, alas, tinggi, jariJari;
    String menu;
    
    System.out.print("Masukkan Menu [1/2]: ");
    menu = sc.nextLine();

    if(menu.equalsIgnoreCase("1")) {
      System.out.println("a.Persegi");
      System.out.println("b.Segitiga");
      System.out.print("Masukkan Pilihan a/b: ");
      menu = sc.nextLine();
        if(menu.equalsIgnoreCase("a")) {
          System.out.print("Masukkan Sisi: ");
          sisi = sc.nextDouble();
          luas = sisi*sisi;
          System.out.println("Luas Persegi Panjang Adalah: " +luas);
        }
        else if(menu.equalsIgnoreCase("b")) {
          System.out.print("Inputkan Alas: ");
          alas = sc.nextDouble();
          System.out.print("Masukkan Tinggi: ");
          tinggi = sc.nextDouble();
          luas = 0.5*alas*tinggi;
          System.out.println("Luas Segitiga: " +luas);
        }
        else {
          System.out.println("Input Yang Anda Masukkan Salah");
        }
      }
      else if(menu.equalsIgnoreCase("2")) {
        System.out.println("a.Kubus");
        System.out.println("b.Tabung");
        System.out.print("Masukkan Pilihan a/b: ");
        menu = sc.nextLine();
        if(menu.equalsIgnoreCase("a")){
          System.out.print("Masukkan Sisi: ");
          sisi = sc.nextDouble();
          volume = sisi*sisi*sisi;
          System.out.println("Volume Kubus Adalah: " +volume);
        }
        else if(menu.equalsIgnoreCase("b")) {
          System.out.print("Masukkan Jari-Jari: ");
          jariJari = sc.nextDouble();
          System.out.print("Masukkan Tinggi: ");
          tinggi = sc.nextDouble();
          volume = 3.14 * jariJari *jariJari * tinggi;
          System.out.println("Volume Kubus Adalah: " +volume);
        }
        else {
          System.out.println("Input Yang Anda Masukkan Salah");
        }
      }
      else {
        System.out.println("Input Yang Anda Masukkan Salah");
      }
    }   
  }
