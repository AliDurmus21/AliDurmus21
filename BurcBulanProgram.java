import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {

        int month,day;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğdunuz Ay (Sayı olarak giriniz!) : ");
        month = input.nextInt();

        System.out.print("Doğdunuz Gün : ");
        day = input.nextInt();

        if (month>12){
            System.out.println("Hatalı Bir Ay Girdiniz ! Tekrar Deneyiniz");
        }else if (day>31){
            System.out.println("Hatalı Bir Gün Girdiniz ! Tekrar Deneyiniz");
            return;
        }

        if (month==1){
            if (day<=21){
                System.out.println("Burcunuz Oğlak");
            }else
                System.out.println("Burcunuz Kova");
        }
        if (month==2){
            if (day<=19){
                System.out.println("Burcunuz Kova");
            }else
                System.out.println("Burcunuz Balık");
        }
        if (month==3){
            if (day<=20){
                System.out.println("Burcunuz Balık");
            }else
                System.out.println("Burcunuz Koç");
        }
        if (month==4){
            if (day<=20){
                System.out.println("Burcunuz Koç");
            }else
                System.out.println("Burcunuz Boğa");
        }
        if (month==5){
            if (day<=21){
                System.out.println("Burcunuz Boğa");
            }else
                System.out.println("Burcunuz İkizler");
        }
        if (month==6){
            if (day<=22){
                System.out.println("Burcunuz İkizler");
            }else
                System.out.println("Burcunuz Yengeç");
        }
        if (month==7){
            if (day<=22){
                System.out.println("Burcunuz Yengeç");
            }else
                System.out.println("Burcunuz Aslan");
        }
        if (month==8){
            if (day<=22){
                System.out.println("Burcunuz Aslan");
            }else
                System.out.println("Burcunuz Başak");
        }
        if (month==9){
            if (day<=22){
                System.out.println("Burcunuz Başak");
            }else
                System.out.println("Burcunuz Terazi");
        }
        if (month==10){
            if (day<=22){
                System.out.println("Burcunuz Terazi");
            }else
                System.out.println("Burcunuz Akrep");
        }
        if (month==11){
            if (day<=21){
                System.out.println("Burcunuz Akrep");
            }else
                System.out.println("Burcunuz Yay");
        }
        if (month==12){
            if (day<=21){
                System.out.println("Burcunuz Yay");
            }else
                System.out.println("Burcunuz Oğlak");

        }
    }
}
