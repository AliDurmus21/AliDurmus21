import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String hayvan = "";
        int yil;

        System.out.print("Doğum Yılınızı Giriniz : ");
        yil = inp.nextInt();

        if (yil % 12 == 0) {
            hayvan = "Maymun";
        }else if (yil % 12 == 1) {
            hayvan = "Horoz";
        }else if (yil % 12 == 2) {
            hayvan = "Köpek";
        }else if (yil % 12 == 3) {
            hayvan = "Domuz";
        }else if (yil % 12 == 4) {
            hayvan = "Fare";
        }else if (yil % 12 == 5) {
            hayvan = "Öküz";
        }else if (yil % 12 == 6) {
            hayvan = "Kaplan";
        }else if (yil % 12 == 7) {
            hayvan = "Tavşan";
        }else if (yil % 12 == 8) {
            hayvan = "Ejderha";
        }else if (yil % 12 == 9) {
            hayvan = "Yılan";
        }else if (yil % 12 == 10) {
            hayvan = "At";
        }else if (yil % 12 == 11) {
            hayvan = "Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz : " + hayvan);
    }
}
