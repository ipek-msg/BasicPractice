package Basic_Practice;

import java.util.Scanner;

public class Q14_TamKareBulma {

    /*
    Girilen pozitif bir sayinin tamm kare olup olmadıgını bulunuz
    tam kare ise true degilse false yazdırınız
    not: sqrt // math class gibi fonksiyonları kullanmayınız.
    example :1
    ınput :16
    output: true
    not: bu sayı tamkare cunku 4*4 =16
    example :2
    input:25
    output:true
    note: bu sayı tam kare cunku 5*5 =25
    example :3
    ınput :14
    output :false
     */

    public static void main(String[] args) {

        //while sadece bir şart var devam etme şart sağlandıgı müddetçe devam eder sayacı biz sağlıyoruz.
        //for da başlangıç noktası ve bitiş noktanız belli artış miktarı siz belirlersiniz.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bi tam sayi giriniz :");
        int sayi =scan.nextInt();

        int count= 1;

        boolean a= false;

        while(count*count<=sayi){
            if(count*count==sayi){
                a= true;
                System.out.println(a);
            }
            count++ ;
        }
        if(!a) System.out.println(a);

    }
}
