public class ContohVariable23 {
    public static void main(String[] args) throws Exception {
        String salahSatuHobiSayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 20;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println("Hobi saya adalah = " +salahSatuHobiSayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin = " + jenisKelamin);
        System.out.println("Umur saat ini = " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
