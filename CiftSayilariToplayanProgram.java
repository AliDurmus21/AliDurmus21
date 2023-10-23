import java.util.Scanner;

public class CiftSayilariToplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Tek bir sayı girene kadar devam edeceğiz.");
        System.out.println("Çıkmak için tek bir sayı girin.");

        while (true) {
            System.out.print("Bir sayı girin: ");
            int sayi = inp.nextInt();

            if (sayi % 4 == 0) {
                toplam += sayi;
            }

            if (sayi % 2 == 1) {
                break;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}
