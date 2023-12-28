import java.security.Principal;

public class Tugas9_No1_NandaPutra {
  public static void main(String[] args) {
    char[] karakter = {'N', 'a', 'n', 'd', 'a', 'P', 'u', 't', 'r', 'a', 'K', 'h', 'a', 'm', 'd', 'a', 'n', 'i'};
    char[][] karakter2 = new char[8][5];
    int k = 0;
    for(int i = 0; i < karakter2.length; i++ ){
      for(int j = 0; j < karakter2[0].length; j++){
        if(k < karakter.length){
          karakter2[i][j] = karakter [k];
          k++;
        }
        else{
          k = 0;
          karakter2[i][j] = karakter [k];
          k++;
        }
        System.out.print(karakter2[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
