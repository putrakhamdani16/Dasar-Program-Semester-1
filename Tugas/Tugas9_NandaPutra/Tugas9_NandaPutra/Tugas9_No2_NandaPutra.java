public class Tugas9_No2_NandaPutra{
  public static void main(String[] args) {
    int [][] books = {{8, 9, 5, 2},{7, 5, 10, 3},{4, 6, 6, 5}};
    int total[] = new int[]{0,0,0,0};
    int hJual[] = new int[]{40000,28000,60000,75000};
    int cabangDieng=0, cabangSoehat=0, cabangSengkaling=0, totalBuku=0,pBooks,max=0,totalPemasukan=0;

    System.out.println("----------------------TOGAMAS----------------------");
    System.out.println("------Banyaknya Buku Terjual Di Setiap Cabang------");

    for(int i=0; i < books.length; i++){
      for(int j=0; j < books[0].length; j++){
        if(i==0){
          cabangDieng+= books[0][j];
        }
        if(i==1){
          cabangSoehat += books[1][j];
        }
        if(i==2){
          cabangSengkaling += books[2][j];
        }
        totalBuku += books[i][j];
      }
      if (i==0){
        System.out.println("Banyak buku terjual di Togamas cabang dieng\t\t: " +cabangDieng);
    } else if (i==1){
        System.out.println("Banyak buku terjual di Togamas cabang Soehat\t\t: " +cabangSoehat);
    } else{
        System.out.println("Banyak buku terjual di Togamas cabang Sengkaling\t: " +cabangSengkaling);
    }
    }
    System.out.println("Total Buku Pada Semua Cabang Togamas\t\t\t: "+totalBuku);
    System.out.println(" ");
    System.out.println("-------------Total Pendapatan Togamas-------------");
    
    for(int i=0; i < books.length; i++){
      for(int j=0; j < books[0].length; j++){
        switch(j) {
          case 0:
          pBooks = books[i][j] * hJual[j];
          total[i] +=pBooks;
          if(total[i] > max ){
            max = total[i];
          }
          break;
          case 1:
          pBooks = books[i][j] * hJual[j];
          total[i] +=pBooks;
          if(total[i] > max ){
            max = total[i];
          }
          break;
          case 2:
          pBooks = books[i][j] * hJual[j];
          total[i] +=pBooks;
          if(total[i] > max ){
            max = total[i];
          }
          break;
          case 3:
          pBooks = books[i][j] * hJual[j];
          total[i] +=pBooks;
          if(total[i] > max ){
            max = total[i];
          }
          break;
          default:
          total[i] = books[4][j];
          if (total[i] > max){
            max = total[i];
          }
        } 
      }
      totalPemasukan += total[i];
    }
    System.out.println("Total buku terjual di Semua cabang Togamas sebanyak "+totalBuku+" buku dan total seluruh penjualan tersebut adalah: "+totalPemasukan);
    System.out.println(" ");
    System.out.println("------------Pendapatan Cabang Tertinggi------------");
    if(total[0]==max){
      System.out.println("Pemasukan tertinggi adalah cabang Dieng dengan pemasukan sebesar Rp"+total[0]);
  }else if(total[1]==max){
      System.out.println("Pemasukan tertinggi adalah cabang Soehat dengan pemasukan sebesar Rp"+total[1]);
  } else if (total[2]==max){
      System.out.println("Pemasukan tertinggi adalah cabang Sengkaling dengan pendapatan sebesar Rp"+total[2]);
  }
  }
}