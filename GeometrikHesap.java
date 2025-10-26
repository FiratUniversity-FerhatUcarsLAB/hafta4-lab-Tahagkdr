import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Yarıçapbilgisi
        double yarıçap = input.nextDouble();

        //pi sayısı tanımla
        double pi = 3.14159f;

        //Matematiksel işlemler
        double Alan = pi * Math.pow(yarıçap, 2);
        System.out.printf("\n daire alan: %2f", Alan);

        double Çevre = 2 * pi * yarıçap;
        System.out.printf("\n daire Çevre: %2f" ,Çevre);

        double çap = 2* yarıçap;
        System.out.printf("\n çap: %2f", çap);

        double küre_hacimi = 4.0/3.0 * pi *Math.pow(yarıçap, 3);
        System.out.printf("\n küre_hacimi : %2f", küre_hacimi);

        double küre_yüzey_alanı = 4 * pi * Math.pow(yarıçap,2 );
        System.out.printf("\n küre_yüzey_alanı: %2f" ,küre_yüzey_alanı );








    }
}



