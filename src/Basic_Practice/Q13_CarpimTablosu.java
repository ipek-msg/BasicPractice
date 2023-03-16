package Basic_Practice;

public class Q13_CarpimTablosu {

    /* Kullsnicinin girdiği sayiya kadar carpim tablosunu bize yazdiran bir method yaziniz

     */
    public static void main(String[] args) {

        int input =10 ;

        carpimTablosu(input);

    }

    private static void carpimTablosu(int input) {


        for (int i =1 ;i <=input ; i++){

            for (int j = 1 ; j<=input ; j++){

                System.out.printf("%3" , i*j);//basamak ayarlandıgı icin bu 3 ü yazdık

            }
            System.out.println();
        }
    }
}
