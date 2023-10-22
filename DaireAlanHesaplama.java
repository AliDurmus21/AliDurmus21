import java.util.Scanner;
public class DaireAlanHesaplama {
    public static void main(String[] args) {


        int r,alfa;
        double pi,alan;
        pi=3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Daire'nin Yarıçapını Giriniz : ");
        r = inp.nextInt();
        System.out.print("Alfa'nın Değerini Giriniz : ");
        alfa = inp.nextInt();

        alan = (pi * (r*r) * alfa) / 360;
        System.out.println("Dairenin Alanı : " + alan);


    }
}
