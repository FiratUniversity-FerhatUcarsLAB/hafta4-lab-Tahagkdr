import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===ÇALIŞŞAN BİLGİ SİSTEMİ===");

        System.out.println("çalışan AdıSoyadı:");
        String adsoyad = input.nextLine();

        System.out.println("Aylık  bürüt Maaş: ");
        double brutMaas = input.nextDouble();

        System.out.println("Haftalık çalışma saati:");
        int haftalıkçalışmasaati  = input.nextInt();

        System.out.println("Mesai saati:");
        int mesaiSaati = input.nextInt();

        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesintisi = toplamGelir * 0.14;
        double gelirvergisi = toplamGelir * 0.15;
        double damgavergisi = toplamGelir * 0.00759;
        double toplakesinti = sgkKesintisi + damgavergisi + gelirvergisi;


        double netMaaş = toplamGelir - toplakesinti;

        double kesintioranı = (toplakesinti / toplamGelir) * 100;
        double saatliknetkazanç =  netMaaş /176;
        double günlüknetkazanç = netMaaş / 22;

        System.out.println("==============================================");
        System.out.println("           DETAYLI MAAŞ BORDROSU");
        System.out.println("==============================================");


        String satir1 = String.format("Çalışan            : %s", adsoyad );

        System.out.println(satir1);

        String satir2 = String.format("Haftalık Çalışma   : %d saat",haftalıkçalışmasaati );
        System.out.println(satir2);

        System.out.println("----------------------------------------------");

        System.out.println(); // Boşluk
        System.out.println("1. GELİRLER");
        System.out.println("----------------------------------------------");

        String satir3 = String.format("   Brüt Maaş        : %,18.2f TL", brutMaas);
        System.out.println(satir3);

        String satir4 = String.format("   Mesai Ücreti (%d saat): %,18.2f TL", mesaiSaati, mesaiUcreti);
        System.out.println(satir4);

        System.out.println("   -------------------------------------------");

        String satir5 = String.format("   TOPLAM GELİR     : %,18.2f TL", toplamGelir);
        System.out.println(satir5);

        System.out.println(); // Boşluk
        System.out.println("2. KESİNTİLER");
        System.out.println("----------------------------------------------");


        String satir6 = String.format("   SGK Kesintisi (%%14)  : %,18.2f TL", sgkKesintisi);
        System.out.println(satir6);

        String satir7 = String.format("   Gelir Vergisi (%%15)  : %,18.2f TL", gelirvergisi);
        System.out.println(satir7);

        String satir8 = String.format("   Damga Vergisi (%%0.759): %,18.2f TL",damgavergisi);
        System.out.println(satir8);

        System.out.println("   -------------------------------------------");
        String satir9 = String.format("   TOPLAM KESİNTİ   : %,18.2f TL", toplakesinti);
        System.out.println(satir9);

        System.out.println(); // Boşluk
        System.out.println("3. NET ÖDEME");
        System.out.println("----------------------------------------------");
        String satir10 = String.format("   NET MAAŞ         : %,18.2f TL", netMaaş);
        System.out.println(satir10);

        System.out.println(); // Boşluk
        System.out.println("4. İSTATİSTİKLER");
        System.out.println("----------------------------------------------");

        String satir11 = String.format("   Kesinti Oranı      : %17.2f %%", kesintioranı);
        System.out.println(satir11);

        String satir12 = String.format("   Saatlik Net Kazanç : %,18.2f TL", saatliknetkazanç);
        System.out.println(satir12);

        String satir13 = String.format("   Günlük Net Kazanç  : %,18.2f TL", günlüknetkazanç);
        System.out.println(satir13);

        System.out.println("==============================================");

        input.close();




    }
}
