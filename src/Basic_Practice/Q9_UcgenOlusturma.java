package Basic_Practice;

import java.util.Scanner;

public class Q9_UcgenOlusturma {


    /*
    Kullanıcıdan 3 tane pzoitif tam sayi aliniz
    bu uc sayının ucgen olusturma durumunu kontrol ediniz
    eger ucgen olabiliyor ise ,es kenar ucgen olma durumunu da kontrol ediniz


    ucgen olma sartı : herhangi iki kenar toplamı dıger kenardan buyuk,
    herhangi iki kenar farkı diger kenardan kucuk olmalı

    a+b>c>a-b
    a+c>b>a-c
    b+c>a>b-c
    a=b=c es kenar ucgen
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 3 sayı giriniz");
        int topAveB = 0, farkAveB = 0;
        int topAveC = 0, farkAveC = 0;
        int topBveC = 0, farkBveC = 0;


        int a, b, c;

        String yanlisGirisMesaji = "Girdiginiz deger 0'dan kucuk olamaz!";

        a = scan.nextInt();
        if (a <= 0) {
            System.out.println("yanlisGirisMesaji");
            System.exit(0);
        }
        b = scan.nextInt();
        if (b <= 0) {
            System.out.println("yanlisGirisMesaji");
            System.exit(0);

        }
        c = scan.nextInt();
        if (c <= 0) {
            System.out.println("yanlisGirisMesaji");
            System.exit(0);
        }
        topAveB = a + b ;
        topAveC = a + c ;
        topBveC = b + c ;

        farkAveB = Math.abs(a-b);//mutlak deger
        farkAveC = Math.abs(a-c);
        farkBveC = Math.abs(b-c);

        if (topAveB>c && c>farkAveB &&
            topAveC>b && b>farkAveC &&
            topBveC>a && a>farkBveC)   {
            System.out.println("Girdiginiz degerler ile ucgen olusturulabilir.");
            if (farkAveB == 0 && farkBveC == 0){
                System.out.println("Girdiginiz degerler iel olusan ucgen eskenar ucgendir.");
            }
        }else System.out.println("Girdiginiz degerlenrile  ucgen oluturulamaz");
    }

}