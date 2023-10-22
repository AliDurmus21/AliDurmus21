import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double armut,elma,domates,muz,patlican,kilo,kilo1,kilo2,kilo3,kilo4,total;

        System.out.print("Armut kaç kilo ? : ");
        kilo = inp.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        kilo1 = inp.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        kilo2 = inp.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        kilo3 = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        kilo4 = inp.nextDouble();

        armut=2.14*kilo;
        elma=3.67*kilo1;
        domates=1.11*kilo2;
        muz=0.95*kilo3;
        patlican=5*kilo4;

        total = armut+elma+domates+muz+patlican;

        System.out.println("Toplam Tutar : " + total);
    }
}
