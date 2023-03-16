package Basic_Practice;

import java.util.Scanner;

public class Q10_StringTekrarliYazdirma {


    /* Kullanicidan 3 harften uzun bir kelime ve 10 dan kucuk bir sayi aliniz
    kelimenin son 2 harfini girilen sayi kadar yazdiran bir program yaziniz

    ORn:

    Input: kelime =Mustafa sayi=3
    Output: fafafa


     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Bir kelime giriniz :");
        String kelime =scan.next();

        System.out.println("10 dan kucuk bir tam sayi giriniz :");
        int sayi= scan.nextInt();

        String son2Harf =kelime.substring(kelime.length()-2);

       // System.out.println(son2Harf.repeat(sayi));

        for (int i=0 ; 1 < sayi ; i++){
            System.out.println(son2Harf);
        }
    }
}
