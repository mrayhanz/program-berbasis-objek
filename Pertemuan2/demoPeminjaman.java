public class demoPeminjaman {
    public static void main(String[] args) {
        peminjaman pinjam = new peminjaman();
        pinjam.id = "M001";
        pinjam.namaMember = "Rayhan";
        pinjam.namaGame = "FIFA 2025";
        pinjam.lamaSewa = 3;
        pinjam.harga = 20000;

        pinjam.tampilData();
    }
}
