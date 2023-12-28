public class Tugas6_2_NandaPutra {
  public static void main(String[] args) {
    int anak = 50000, dewasa = 100000, jumlahAnak,jumlahDewasa,totalPerhari,totalAgustus=0;
    
    int hari = 1;
    while (hari <= 31){
      jumlahAnak = anak * 5;
      jumlahDewasa = dewasa * 5;
      totalPerhari = jumlahAnak + jumlahDewasa;
      hari++;

      if(hari % 7 == 0){
        continue;
      }
      totalAgustus += totalPerhari;
    }
    System.out.printf("Total Pendapatan Bulan Agustus: %d ", totalAgustus);
  } 
}