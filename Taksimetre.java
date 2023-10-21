import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {

        int startPrice = 10;
        double km, perKm, total;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden Giriniz : ");
        km = inp.nextDouble();

        perKm = 2.20;
        total = km * perKm;
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);

    }
}
