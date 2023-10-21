package Proje;

import java.util.Scanner;
public class KDVTutariHesaplama {
    public static void main(String[] args) {

        double tutar,kdvsiz,kdvli,kdv,kdvOran;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :");
        tutar = inp.nextDouble();

        kdvOran = (tutar > 0 && tutar <= 1000 ) ? 0.18 : 0.08 ;

        kdvsiz = tutar;
        System.out.println("KDV'siz Fiyat : " + kdvsiz);

        kdvli = tutar*kdvOran + tutar;
        System.out.println("KDV'li Fiyat : " + kdvli);

        kdv = tutar*kdvOran;
        System.out.println("KDV tutarı : " + kdv);


        System.out.println("KDV Oranı : " + kdvOran);

    }
}

