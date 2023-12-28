public class App {
    public static void main(String[] args) throws Exception {
        //operator bitwise (operator untuk operasi pada nilai bit)

        byte a = 3;
        byte b ,c;
        String a_bits,b_bits,c_bits;

        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);

        //operator SHIFTLEFT
        System.out.println("====SHIFT LEFT");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a << 3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

        //operator SHIFTRIGHT
        System.out.println("====SHIFT RIGHT");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a >> 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

        //operator BITWISE OR
        System.out.println("====BITWISE OR");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("----------OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);

        //operator BITWISE AND
        


    }
}
