import java.util.Scanner;

public class UceVeDorteTamBolunme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k;

        System.out.print("Sayı Giriniz : ");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i%3==0 && i%4==0){
                System.out.println(i);
            }
        }
    }
}
