import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("1. Sayıyı Giriniz : ");
        a = input.nextInt();
        System.out.print("2.Sayıyı Giriniz : ");
        b = input.nextInt();
        System.out.print("3.Sayıyı Giriniz : ");
        c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Sıralama : " + c + "<" + b + "<" + a);
            }else
                System.out.println("Sıralama : " + b + "<" + c + "<" + a);

        } else if (b>a && b>c) {
            if (a>c){
                System.out.println("Sıralama : " + c + "<" + a + "<" + b);
            }else
                System.out.println("Sıralama : " + a + "<" + c + "<" + b);

        } else if (c>a && c>b) {
            if (a>b){
                System.out.println("Sıralama : " + b + "<" + a + "<" + c);
            }else
                System.out.println("Sıralama : " + a + "<" + b + "<" + c);

        }else {
            System.out.println("Sıralama : " + c + "=" + b + "=" + a);
        }
    }
}