public class Persegi22 {
  public static void main(String[] args) {
    int luasan = luasPersegi(5);
    System.out.println("luas persegi dengan sisi 5 = " +luasan);
  }

  static int luasPersegi(int sisi) {
    int luas = sisi * sisi;
    return luas;
  }
}
