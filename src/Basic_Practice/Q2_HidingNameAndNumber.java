package Basic_Practice;

import java.util.Scanner;

public class Q2_HidingNameAndNumber {


    /*

    *Ask user Nme,Surname and Credit card numbers than //kullanıcıdan adını sayadını ve kredi kart numarasını isteyin
    *convert it to Special form
    *
    *Cheak credit card number,if there aren't 16 digit print//credi kart numarı 16 haneli değilse hata mesaji yazdırın
    *"invalid credit card number                            // "Geçersiz kart numarası"
    *
    *input:John White 1234234534561478
    *output: Name : J*** W****
             CCN :**** **** **** 1478
    * (initials fot name and surname should be uppercase)
     */

    //Kullanıcıdan isim ve soyismi al ve verilen özelliğe göre çevir
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in) ;

        System.out.println("Lutfen isminizi giriniz : ");
        String isim= scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz : ");
        String soyisim= scan.nextLine();

        System.out.println("Lutfen 16 haneli kredi karti numaranızı giriniz : ");
        String CCN= scan.nextLine();



        if (CCN.length()!=16)
            System.out.println("invalid credit card number");

        else {

            isim =isim.substring(0,1).toUpperCase() +isim.substring(1).replaceAll("\\w","*");

            soyisim =soyisim.substring(0,1).toUpperCase() +isim.substring(1).replaceAll("\\w","*");

            CCN="**** **** **** "+ CCN.substring(12);

            System.out.println("name : "+ isim + " " + soyisim +" \nCCN : " + CCN);
        }
    }



}
