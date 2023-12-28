public class App {
    public static void main(String[] args) throws Exception {
        //latihan aritmatika
        int variable1 = 10;
        int variable2 = 5;

        int hasil;

        //penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

        //pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);

        //perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d * %d = %d \n",variable1,variable2,hasil);

        //pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);

        float a = 12;
        float b = 10;
        float hasilFloat = a/b;
        System.out.println(a + "/" + b + "=" + hasilFloat);
       
        //modulus
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);
    }
}
