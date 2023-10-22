import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //"valid" değişkeni tanımlayarak 0 ve 100 arasında olan notlar girildikçe, o notlar bu değişkenin içinde toplanacak.
        //"validNumber" değişkenine de 0 ve 100 arası nota sahip ders sayısı atanacak.

        double math, music, chemistry, physics, turk, valid = 0, average, validNumber = 0;

        System.out.print("Matematik notunuz : ");
        math = inp.nextDouble();
        if (math>=0 && math<=100) {
            valid +=math;
            ++validNumber;
        }

        System.out.print("Kimya notunuz : ");
        chemistry = inp.nextDouble();
        if (chemistry>=0 && chemistry<=100) {
            valid +=chemistry;
            ++validNumber;
        }

        System.out.print("Fizik notunuz : ");
        physics = inp.nextDouble();
        if (physics>=0 && physics<=100) {
            valid +=physics;
            ++validNumber;
        }

        System.out.print("Müzik notunuz : ");
        music = inp.nextDouble();
        if (music>=0 && music<=100) {
            valid +=music;
            ++validNumber;
        }

        System.out.print("Türkçe notunuz : ");
        turk = inp.nextDouble();
        if (turk>=0 && turk<=100) {
            valid +=turk;
            ++validNumber;
        }

        average = valid/validNumber;

        if (average>=55){
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        else {
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("Ortalamanız: " + average);
    }
}