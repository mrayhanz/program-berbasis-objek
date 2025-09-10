public class peminjaman {
    String id;
    String namaMember;
    String namaGame;
    int lamaSewa;
    int harga;

    int hitungHarga() {
        return lamaSewa * harga;
    }

    void tampilData() {
        System.out.println("ID Member     : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Harga per Hari: " + harga);
        System.out.println("Total Bayar   : " + hitungHarga());
    }
}