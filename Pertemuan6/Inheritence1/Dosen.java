package Inheritence1;
public class Dosen extends Pegawai {
    private int jumlahSKS;
    private final int tarifSks = 120000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    @Override
    public int getGaji() {
        return this.jumlahSKS * tarifSks;
    }
}
