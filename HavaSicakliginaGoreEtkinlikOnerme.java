import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int heat;
        System.out.print("Sıcaklını Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz. ");

        }else if (heat<=10 ){
            System.out.println("Sinemaya Gidebilirsin.");

        }else if (heat <= 15) {
            System.out.println("Sinemaya Gidebilirsin. \nPiknik Yapabilirsin");

        }else if (heat<=25){
            System.out.println("Piknik Yapabilirsin. ");

        }else {
            System.out.println("Yüzmeye Gidebilirsin.");
        }

    }
}
