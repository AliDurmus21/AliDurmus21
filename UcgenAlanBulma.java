import java.util.Scanner;
public class UcgenAlanBulma {
    public static void main(String[] args) {

        double a,b,c,cevre,alan,u;
        Scanner inp = new Scanner(System.in);
        System.out.println("Üçgenin kenarlarını sırayla giriniz");

        System.out.print("Birinci kenarı giriniz : ");
        a = inp.nextDouble();

        System.out.print("İkinci kenarı giriniz : ");
        b = inp.nextDouble();

        System.out.print("Üçüncü kenarı giriniz : ");
        c = inp.nextDouble();

        u = (a+b+c)/2;
        cevre = 2*u;

        alan =Math.sqrt (u * (u - a)* (u - b) * (u - c)) ;

        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);


    }
}
