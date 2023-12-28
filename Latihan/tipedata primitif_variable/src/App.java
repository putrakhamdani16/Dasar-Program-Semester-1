import java.nio.charset.CharacterCodingException;

public class App {
    public static void main(String[] args) throws Exception {
       // kita akan membuat variable
       int a  = 10;
       System.out.println("nilai a =" + a);

       a = 20;
       System.out.println("nilai a baru =" + a);

       //kita akan membuat deklarasi
       int b;
       b = 16;
       System.out.println("nilai b=" + b);

       //Tipe Data Primitif
       //integer,byte,short,long,double,float,char,boolean
       
       //integer (satuan)
       int c = 2147483647;
       System.out.println("=====INTEGER=====");
       System.out.println("nilai c =" + c);
       System.out.println("nilai max =" + Integer.MAX_VALUE);
       System.out.println("nilai min =" + Integer.MIN_VALUE);
       System.out.println("Besar Integer =" + Integer.BYTES + "bytes");
       System.out.println("Besar Integer =" + Integer.SIZE + "Bit");

        //Byte (satuan)
       Byte d = 10;
       System.out.println("=====BYTE=====");
       System.out.println("nilai d =" + d);
       System.out.println("nilai max =" + Byte.MAX_VALUE);
       System.out.println("nilai min =" + Byte.MIN_VALUE);
       System.out.println("Besar Byte =" + Byte.BYTES + "bytes");
       System.out.println("Besar Byte =" + Byte.SIZE + "Bit");
       
       //long (satuan)
       long l = 10L;
       System.out.println("=====LONG=====");
       System.out.println("nilai l =" + l);
       System.out.println("nilai max =" + Long.MAX_VALUE);
       System.out.println("nilai min =" + Long.MIN_VALUE);
       System.out.println("Besar Long =" + Long.BYTES + "bytes");
       System.out.println("Besar Long =" + Long.SIZE + "Bit");

        //short (satuan)
       short s = 10;
       System.out.println("=====SHORT=====");
       System.out.println("nilai s =" + s);
       System.out.println("nilai max =" + Short.MAX_VALUE);
       System.out.println("nilai min =" + Short.MIN_VALUE);
       System.out.println("Besar Short =" + Short.BYTES + "bytes");
       System.out.println("Besar Short =" + Short.SIZE + "Bit");

       //double (satuan bisa koma)
       double i = 10.4d;
       System.out.println("=====DOUBLE=====");
       System.out.println("nilai i =" + i);
       System.out.println("nilai max =" + Double.MAX_VALUE);
       System.out.println("nilai min =" + Double.MIN_VALUE);
       System.out.println("Besar Double =" + Double.BYTES + "bytes");
       System.out.println("Besar Double =" + Double.SIZE + "Bit");

       //float (satuan bisa koma)
       float f = 33.4f;
       System.out.println("=====FLOAT=====");
       System.out.println("nilai f =" + f);
       System.out.println("nilai max =" + Float.MAX_VALUE);
       System.out.println("nilai min =" + Float.MIN_VALUE);
       System.out.println("besar Float =" + Float.BYTES + "bytes");
       System.out.println("besar Float =" + Float.SIZE + "Bit");

       //char (karakter) Berdasarkan ASCII
       char m = 'c';
       System.out.println("=====Character=====");
       System.out.println("nilai m =" + m);
       System.out.println("nilai max =" + Character.MAX_VALUE);
       System.out.println("nilai min =" + Character.MIN_VALUE);
       System.out.println("besar Character =" + Character.BYTES + "bytes");
       System.out.println("besar Character =" + Character.SIZE + "Bit");

       //boolean (nilai true/false)
       boolean val = false;
       System.out.println("=====Boolean=====");
       System.out.println("nilai boolean val= " + val);
       System.out.println("nilai boolean max = " + Boolean.TRUE);
       System.out.println("nilai boolean min = " + Boolean.FALSE); 


    }
}
