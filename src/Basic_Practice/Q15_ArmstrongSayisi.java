package Basic_Practice;

import java.util.Scanner;

public class Q15_ArmstrongSayisi {

    //Verilen bir sayinin Armstrong sayi olup olmadıgını kontrol eden bir kod yazınız
    //Armstrong sayi rakamlarının kuplerinin toplamına esit olan sayıdır
    //153 =(1*1*1) + (5*5*5) +(3*3*3) gibi


    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Armstrong sayisi olup olmadıgını kontrol etmek istediginiz bir tam sayi giriniz giriniz :");
        int sayi =scan.nextInt();

        int kuplerToplamı = 0;
        int ilkDeger = sayi;
        int rakam =0 ;

        while(sayi!=0){

            rakam= sayi%10;
            kuplerToplamı+=rakam*rakam*rakam;
            sayi/=10;
        }

        if (kuplerToplamı==ilkDeger ) System.out.println("Girdiginiz sayi bir armstrong sayidir !");
        else System.out.println("Girdiginiz sayi bir Armstrong sayi degildir !");

    }
}