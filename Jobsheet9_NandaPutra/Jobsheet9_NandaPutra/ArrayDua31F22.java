import java.util.Scanner;

public class ArrayDua31F22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] data = new int[4][4];
    int jam[] = {3,6,9,12};
    int min[] = {100, 100, 100, 100};
    int max[] = {0, 0, 0, 0};
    double total[] = {0, 0, 0, 0};
    double rata[] = {0, 0, 0, 0};

    for(int i = 0; i < data.length; i++){
      System.out.printf("Jam %s\n", jam[i]);
      for(int j= 0; j < data[0].length; j++){
        switch (j) {
          case 0:
          System.out.print("Masukkan Suhu: ");
          data[i][j] = sc.nextInt();
          if(min[j] > data[i][j]){
            min[j] = data[i][j];
          }
          if(max[j] < data[i][j]){
            max[j] = data[i][j];
          }
          total[j] += data[i][j];
          break;
          case 1:
          System.out.print("Masukkan Kelembaban: ");
          data[i][j] = sc.nextInt();
          if(min[j] > data[i][j]){
            min[j] = data[i][j];
          }
          if(max[j] < data[i][j]){
            max[j] = data[i][j];
          }
          total[j] += data[i][j];
          break;
          case 2:
          System.out.print("kecepatan Angin: ");
          data[i][j] = sc.nextInt();
          if(min[j] > data[i][j]){
            min[j] = data[i][j];
          }
          if(max[j] < data[i][j]){
            max[j] = data[i][j];
          }
          total[j] += data[i][j];
          break;
          case 3:
          System.out.print("Masukkan Index UV: ");
          data[i][j] = sc.nextInt();
          if(min[j] > data[i][j]){
            min[j] = data[i][j];
          }
          if(max[j] < data[i][j]){
            max[j] = data[i][j];
          }
          total[j] += data[i][j];
          break;
        }
        rata[j] = total[j] / data[0].length;
      }
    }
    System.out.println("---------------");
    for( int i= 0; i < data.length; i++){
      for(int j= 0; j < data[0].length; j++){
        System.out.print(data[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("----------------");
    for(int i= 0, j= 2; i<data.length; i++ ){
      System.out.print(data[i][j]);
      System.out.println("");
    }
    System.out.println("----------------");
    System.out.printf("Rata - rata suhu: %.2f\n", rata[0]);
    System.out.printf("Presentase kelambaban terendah: %s\n", min[1]);
    System.out.printf("Index UV Maksimal: %s\n", max[3]);
  }
}
