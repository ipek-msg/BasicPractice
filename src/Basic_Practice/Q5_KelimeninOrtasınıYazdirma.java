package Basic_Practice;

import java.util.Scanner;

public class Q5_KelimeninOrtasınıYazdirma {


    /*
    Tek sayida harf iceren bir string degiskeninn ortasındaki harfi
    konsolda yazdırmak için bir java programı yazınız.
    eger kelime cift sayıda harf iceriyorsa ortadaki iki harfi yazdıran method create edin

    örn; input:Pyton
         output:th
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String input= scan.next();

        System.out.println(ortadakiHarfYazdir(input));
    }
    public static String ortadakiHarfYazdir(String input){

        int uzunluk =input.length(); //uzunluk atadık //input.length/2-1 de denebilir.başlangıc indexi icin
        int ortadakiIndex=uzunluk/2; // ortayı bulmak icin  2 ye bölündü
        int baslangicIndex=ortadakiIndex-1;
        int bitisIndex=ortadakiIndex+1;
       //substringde çift sayılı kelime de +1 yaptık çünlü ortasındaki 2 harfi almamız için
        //tek sayılıda -1 verdik

       if (uzunluk %2 == 0)  return input.substring(baslangicIndex,bitisIndex);

        else                return input.substring(ortadakiIndex,ortadakiIndex+1);


        }

    }

