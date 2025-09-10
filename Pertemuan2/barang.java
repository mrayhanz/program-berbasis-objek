public class barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon; 

    int hitungHargaJual() {
        return hargaDasar - (int)(diskon / 100 * hargaDasar);
    }

    void tampilData() {
        System.out.println("Kode Barang   : " + kode);
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Harga Dasar   : " + hargaDasar);
        System.out.println("Diskon        : " + diskon + "%");
        System.out.println("Harga Jual    : " + hitungHargaJual());
    }
}
