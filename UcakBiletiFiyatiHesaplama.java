import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double km, age, yolculukTipi, normalTutar, perkm, yasIndirim, indirimliTutar, yasIndirimOran, gidisDonusBiletiIndirim, toplamTutar;

        perkm = 0.10;
        yasIndirimOran = 0;

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = inp.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi = inp.nextInt();


        if ((age <= 0 || km <= 0)) {
            System.out.println("Hatalı Veri Girdiniz ! ");

        } else if ((yolculukTipi > 2 || 1 > yolculukTipi)) {
            System.out.println("Hatalı Veri Girdiniz ! ");
        }

        if (age < 12) {
            yasIndirimOran = 0.5;
        } else if (age > 12 && age <= 24) {
            yasIndirimOran = 0.1;
        } else if (age > 65) {
            yasIndirimOran = 0.3;
        }

        normalTutar = km * perkm;
        yasIndirim = normalTutar * yasIndirimOran;
        indirimliTutar = normalTutar - yasIndirim;
        gidisDonusBiletiIndirim = indirimliTutar * 0.20;
        toplamTutar = (indirimliTutar - gidisDonusBiletiIndirim) * 2;


        if (yolculukTipi == 1) {
            System.out.println("Toplam Tutar = " + indirimliTutar + " TL");

        } else if (yolculukTipi == 2) {
            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }
    }
}