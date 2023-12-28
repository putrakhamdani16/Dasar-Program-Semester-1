public class Kuis_22_NandaPutra {
  public static void main(String[] args) {
    int [][] makanan22={{6,8,4},{10,16,11},{9,14,10},{12,5,7},{5,8,5}};
    int italian22=0, korean22=0, chinese22=0, jogja22=0, madura22=0, rataRata22=0, dineinB22=0, dineK22=0,dnL22=55000,dnD22=40000,tk22=0,tk122=0,takeout22=60000,takeoutL22=45000;

    for(int i=0; i < makanan22.length; i++){
      for(int j=0; j < makanan22[0].length;j++){
        if(i==0){
          italian22 += makanan22[0][j];
        }
        if(i==1){
          korean22 += makanan22[1][j];
        }
        if(i==2){
          chinese22 += makanan22[2][j];
          rataRata22 = chinese22/3;
        }
        if(i==3){
          jogja22 += makanan22[3][j];
        }
        if(i==4){
         madura22 += makanan22[4][j];
        }
        }
        if (i==0){
          System.out.println("Banyak italian food dibeli pelanggan: " +italian22);
      } else if (i==1){
          System.out.println("Banyak korean food dibeli pelanggan: " +korean22);
      } else if (i==2){
        System.out.println("Banyak chinese food dibeli pelanggan: " +chinese22);
      } else if (i==3){
        System.out.println("Banyak jogja food dibeli pelanggan: " +jogja22);
      } else {
        System.out.println("Banyak madura food dibeli pelanggan: " +madura22);
      }
    }
    System.out.println("-------------------------------");
    System.out.println("Rata rata pembelian chinese food: " +rataRata22);
    System.out.println("-------------------------------");
    dineinB22 = makanan22[4][0];
    dineK22 = makanan22[3][0];
    System.out.println("Makanan dine in paling tidak laku dari italian: " + dineinB22);
    System.out.println("Makanan dine in paling laku dari khas jogja: " +dineK22);
    System.out.println("-------------------------------");

    tk22 = (makanan22[0][0] + makanan22[1][0] + makanan22[2][0]) * dnL22;
    tk122 = (makanan22[3][0] + makanan22[4][0]) * dnD22;
    int jtkn22 = (makanan22[0][1] + makanan22[1][1] + makanan22[2][1]) * takeout22;
    int jtkn122 = (makanan22[3][1] + makanan22[4][1]) *takeoutL22;
    int last22 = (makanan22[0][2] + makanan22[1][2] + makanan22[2][2]) *takeout22;
    int last122 = (makanan22[3][2] + makanan22[4][2]) *takeoutL22;
    int total = tk22 + tk122 + jtkn22 + jtkn122 + last22 + last122;
    System.out.println("total hasil pendapatan dalam 1 hari: " +total );
  }
}
  
