import java.util.Scanner;
//TUGAS NOMER 3
public class Tugas3_NandaPutra{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  float suhu, celcius, reamur, fahrenheit, kelvin;
  System.out.println("suhu: ");
  suhu = sc.nextFloat();
  celcius = suhu;
  reamur = celcius * 4/5;
  fahrenheit = (celcius * 9/5) + 32;
  kelvin = celcius + 273;
  System.out.println("Celcius = " + celcius);
  System.out.println("Fahrenhiet = " + fahrenheit);
  System.out.println("Reamur = " + reamur);
  System.out.println("Kelvin = " + kelvin);


  }
}