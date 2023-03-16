import java.util.Random;
import java.util.Scanner;

public class Q16_SayiTahminiOyunu {

    //Bilgisayar 0-100 arası tututp kullanıcıdan tahmin ister
    //Sayiyi bulana kadar kucult veya buyut diye yol gösterir
    //bulunca kacıncı tahminde buldugunu yazar

    public static void main(String[] args) {
        System.out.println("Hosgeldiniz!");

        Random r =new Random();
        int num =r.nextInt(100); //int bound vereni seçiyoruz üst sınır dmek
        int bul =num;
        System.out.println(num);

        Scanner scan = new Scanner(System.in);

        int count = 1;
        num= 1;

        do{
           if (count==1){
               System.out.println("0 ile 100 arasında bir sayi tuttum \nBunu tahmin et");
           }else if (bul>num) System.out.println("Daha büyük sayı giriniz");
           else System.out.println("Daha kucuk bir sayı giriniz");


           num =scan.nextInt();
           if(num ==bul){
               System.out.println("Dogru tahmin ! "+ count + ". tahminde buldunuz");
           }else System.out.println("yanlıs tahmin !Denemeye devam et");

           count++;
        }while (num!=bul);
    }
}
