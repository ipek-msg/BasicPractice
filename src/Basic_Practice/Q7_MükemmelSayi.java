package Basic_Practice;

import java.util.Scanner;

public class Q7_MükemmelSayi {

    /*
     *Bir sayinin mükemmel olup olmadıgını bulan bir program yazınız
     *
     *
     * mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,kendisine esitse o sayi mükemmeldir.
     *
     * ORN :
     *
     * INPUT :6
     *
     * OUTPUT :1,2,3 1+2+3 =6 =6
     *
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz : ");

        int number =scan.nextInt();
        int bolenlerinToplami = 0;
        //toplam olacagı icin 0 atayabiliriz
        int i =1 ;


        do{
            if (number%i==0){
                bolenlerinToplami +=i;

            }
            i++;
        }while (i<number);

        if (bolenlerinToplami==number) System.out.println(number + "mukemmel sayidir");
        else System.out.println(number + "mukemmel sayi degildir.");
    }
}


