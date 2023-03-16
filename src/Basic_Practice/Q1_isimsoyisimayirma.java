package Basic_Practice;

import java.util.Scanner;

public class Q1_isimsoyisimayirma {


    //Kullanicidan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayiriniz
    //ad ayri soyad ayri sekilde ekrana yazdiriniz.
    //input:Ahmet Yılmaz
    //output:Ahmet
    //       Yılmaz

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisminizi giriniz");

        String adsoyad = scan.nextLine();

        String ad= adsoyad.substring(0,adsoyad.indexOf(' '));
        String soyad=adsoyad.substring(adsoyad.indexOf(' ')+1);

        System.out.println("ad = "+ ad +"\nsoyad ="+ soyad);


        //subString metodu üzerinde islem yapılan Stringin istenen parçasını size geri döndürür
        //Bunu yaparken iki farklı olanak sunar
        //ilki : 1 int parametre ister ve belirtilen indexten  Stringin sonunda kadar size geir döndürür
        //ikincisi ise 2 tane int parametre ister,ilk int parametre baslangıc indexini isaret eder ve o indexi
        //de dahil ederek verilen ikinci indexe kadar olan Stringi size döndürür.
        //ikinci indexteki karakter dahil değildir.
    }
}
