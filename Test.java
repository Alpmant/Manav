import java.io.Console;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        System.out.print("Kaç Kilo Armut: ");
        double a = input.nextDouble();
        System.out.print("Kaç Kilo Elma: ");
        double e = input.nextDouble();
        System.out.print("Kaç Kilo Domates: ");
        double d = input.nextDouble();
        System.out.print("Kaç Kilo Muz: ");
        double m = input.nextDouble();
        System.out.print("Kaç Kilo Patlıcan: ");
        double p = input.nextDouble();
        double toplam = (a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlican);
        System.out.print("Toplam Tutar: "+toplam + "TL");



























    }
}
