package Basic_Practice;

import java.util.Scanner;

public class Q6_UsHesaplama {

     //Kullanıcıdan 2 sayi alınız
    //1. sayi taban
    //2.sayi us
    //1 sayinin ussunu hesaplatan code create edelim

    //3, 3 sonuc=27
    //2, 3 = 2*2*2=8
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("iki tane tam sayi giriniz :");

        int taban =scan.nextInt();
        int kuvvet =scan.nextInt();

        long sonuc =1;
        //cıkan sonuc sınırlarını kapsasın diye long kullanıldı
        //carpma olucagı icin 1 degeri atandı 0 olsaydı etkisiz olurdu.
        //deger atamamz gerekti cunku default olmasın diye calıssın diye
        while (kuvvet!=0){
            sonuc *=taban;

            kuvvet--;
        }
        System.out.println(taban + "in istenen kuvveti = "+ sonuc);
    }


}
