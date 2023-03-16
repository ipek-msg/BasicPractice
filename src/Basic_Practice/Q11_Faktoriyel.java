package Basic_Practice;

public class Q11_Faktoriyel {

    /*
    Parametre olarak int kabul eden ve sayinin faktoriyelini
    hesaplayan bir method giriniz

    ORN :

    INPUT : 6 ;
    OUTPUT :6!=6*5*4*3*2*1=720
     */

    public static void main(String[] args) {
        int sayi = 1;
        faktoriyel(sayi);

    }

    private static void faktoriyel(int input) {
        int fact=1;
        System.out.println(input+"!=");

        for (int i= input ; i>1 ; i--){
            fact*=i;

        }
        System.out.println("1="+fact);
            }
}
