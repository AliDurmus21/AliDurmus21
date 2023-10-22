import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double boy,kilo,vki;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        vki = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz :" + vki);

    }
}
