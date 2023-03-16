package Basic_Practice;

import java.util.Scanner;

public class Q8_KoordinatDuzlemi {

    //Kullsnıcıdan Aldıgınız kordinat noktasının(x=3,y=1)
    //kordinat duzleminde hangi bölgede oldugunu yazdıran bir kod yazdırın

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Korordinat duzlemindeki yerini bulmak isteidginiz noktanızn x ve y degerini giriniz");

        int x= scan.nextInt();
        int y= scan.nextInt();

         //kordinat dogurusu yap
        //ona göre bolge belirle
        //ve oradan alarak kodları yaz
        /*
   1.bölge      y    2.bölge
                ^
              3 |
              2 |
              1 |
     <-----------------------> x
     -3 -2 -1   |  1  2  3
             -1 |
             -2 |
             -3 |
  3.bölge              4.bölge
  //buradaki bütün olasılıkları kod ile yazıyoruz.
         */
        if (x > 0 && y >0) System.out.println("Girdiginiz nokta 1. bölgededir.");
        else if
            (x < 0 && y >0) System.out.println("Girdiginiz nokta 2. bölgededir.");
        else if
            (x < 0 && y <0) System.out.println("Girdiginiz nokta 3. bölgededir.");
        else if
            (x > 0 && y <0) System.out.println("Girdiginiz nokta 4. bölgededir.");
        else if
            (x != 0) System.out.println("Girdiginiz nokta 5. bölgededir.");
        else if
            (x != 0) System.out.println("Girdiginiz nokta 6. bölgededir.");
        else System.out.println("Girdiginiz nokta orjindir"); //ikisinin sıfır oldugu durumdur.
        }
}
