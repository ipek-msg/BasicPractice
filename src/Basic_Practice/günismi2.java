package Basic_Practice;

import java.util.Scanner;

public class günismi2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         /*
                Kullanıcıdan gün ismi alıp
                 gün ismini yazdıran bir program yazın

                 */

        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scan.next();

        //Pazartesi ,pazartesi ,Pazartesi ,pAzArTeSİ
        gunIsmi = gunIsmi.toLowerCase();


        switch (gunIsmi) {

            case "pazartesi":

            case "sali":

            case "carsamba":

            case "persembe":

            case "cuma":
                System.out.println("Girdiginiz gun hafta icidir.");
                break;
            case "cumartesi":
                System.out.println("Girdiginiz gun hafta sonudur.");
                break;
            case "pazar":
            default:
                System.out.println("Gecersiz gun ismi girdiniz!");

        }
    }
}
