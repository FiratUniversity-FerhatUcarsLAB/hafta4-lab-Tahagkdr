import java.util.Scanner;

public class ogrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
       String ad = input.nextLine();

        System.out.print("Soyadınız girin");
        String soyad = input.nextLine();

        System.out.print("Ögrenci numarası girin");
        int numaras = input.nextInt();

        System.out.print("Yaşınızı girin" );
        int yaş= input.nextInt();

        System.out.println("GPA (0.00-4.00):  ");
        float gpa= input.nextFloat();


        System.out.println("===ÖGRENCİ BİLGİ SİSTEMİ===");
        System.out.printf("Ad Soydad: %s  %s", "ad, soyad" );
        System.out.printf("\nOgrenci No : %d", "orencino");
        System.out.printf("\nYaş  %d , yaş");
        System.out.printf("\nGPA:%2f", "gpa");





    }
}
