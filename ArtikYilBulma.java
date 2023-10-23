import java.util.Scanner;

public class ArtikYilBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int yil;

        System.out.print("Yıl Giriniz : ");
        yil = inp.nextInt();

        if ((yil % 4 == 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır ! ");
        } else {
            System.out.println(yil + " bir artık yıl değildir ! ");
        }
    }
}
