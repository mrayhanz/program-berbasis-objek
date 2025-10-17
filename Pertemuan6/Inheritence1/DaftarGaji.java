package Inheritence1;
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawaiSaatIni;

    public DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
        jumlahPegawaiSaatIni = 0;
    }

    public void addPegawai(Pegawai p) {
        if (jumlahPegawaiSaatIni < listPegawai.length) {
            listPegawai[jumlahPegawaiSaatIni] = p;
            jumlahPegawaiSaatIni++;
        } else {
            System.out.println("Kapasitas daftar gaji sudah penuh!");
        }
    }

    public void printSemuaGaji(){
        for (int i = 0; i < jumlahPegawaiSaatIni; i++) {
            Pegawai p = listPegawai[i];
            System.out.println("Nama: " + p.getNama() + " -> Gaji: " + p.getGaji());
        }
    }
}
