package Basic_Practice;

import java.util.Scanner;

public class Q3_GünismiYazdırma {

    /*Kullanıcıdan gün numarasını alıp
    gün ismini yazdıran bir program yazın

     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarası giriniz");
        int gunSayisi = scan.nextInt();


        System.out.println("======IF ELSE COZUMU======");

        if (gunSayisi <= 0 || gunSayisi > 7)
            System.out.println("Gecersiz giris yaptınız");
        else if (gunSayisi == 1) System.out.println("Pazartesi");
        else if (gunSayisi == 2) System.out.println("Sali");
        else if (gunSayisi == 3) System.out.println("Carsamba");
        else if (gunSayisi == 4) System.out.println("Persembe");
        else if (gunSayisi == 5) System.out.println("Cuma");
        else if (gunSayisi == 6) System.out.println("Cumartesi");
        else System.out.println("Pazar");

        System.out.println("=========SWITCH CASE COZUMU===========");

        switch (gunSayisi) {


            case 1:

                System.out.println("Pazartesi");
                break;


            case 2:

                System.out.println("sali");
                break;

            case 3:

                System.out.println("çarşamba");
                break;

            case 4:

                System.out.println("Persembe");
                break;

            case 5:

                System.out.println("Cuma");
                break;

            case 6:

                System.out.println("Cumartesi");
                break;

            case 7:

                System.out.println("Pazar");
                break;

            default:
                System.out.println("Geçersiz gün sayisi");


                }
        }


    }

