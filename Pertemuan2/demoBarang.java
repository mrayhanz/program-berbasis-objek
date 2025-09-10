public class demoBarang {
    public static void main(String[] args) {
        barang b = new barang();
        b.kode = "B001";
        b.namaBarang = "Playstation 5";
        b.hargaDasar = 7000000;
        b.diskon = 10;

        b.tampilData();
    }
}
