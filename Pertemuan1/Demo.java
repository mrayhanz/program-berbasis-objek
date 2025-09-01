public class Demo {
    public static void main(String[] args) {
        HandphoneAndroid android1 = new HandphoneAndroid("Samsung", 5000, "Android 10", 2);
        HandphoneIOS ios1 = new HandphoneIOS("iPhone", 5000, "iOS 14", 3);
        Smartwatch smartwatch1 = new Smartwatch("Xiaomi", 4);
        Powerbank pb1 = new Powerbank("Sony", 5000);

        android1.nyalakan();
        android1.bukaPlaystore();
        android1.multiTasking();
        android1.cetakStatus();
        android1.matikan();

        System.out.println();

        ios1.nyalakan();
        ios1.bukaAppStore();
        ios1.gunakanUltraWide();
        ios1.cetakStatus();
        ios1.matikan();

        System.out.println();

        smartwatch1.tampilkanWaktu();
        smartwatch1.hitungDetakJantung();
        smartwatch1.TampilkanNotifikasi("Pesan Whatsapp Masuk");
        smartwatch1.TampilkanNotifikasi("Pesan Instagram Masuk");
        smartwatch1.cetakStatus();

        System.out.println();

        pb1.cekBaterai();
        pb1.isiDaya();
        pb1.cetakStatus();

        System.out.println();
    }
}
