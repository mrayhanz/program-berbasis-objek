package Inheritence1;
public class Main {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(3);

        Pegawai pegawai1 = new Pegawai("P001", "Budi", "Jl. Merdeka 10");
        Dosen dosen1 = new Dosen("D001", "Dr. Citra", "Jl. Pendidikan 25");
        Dosen dosen2 = new Dosen("D002", "Prof. Dian", "Jl. Cendekia 5");

        dosen1.setSKS(12);
        dosen2.setSKS(10);
        
        daftar.addPegawai(pegawai1);
        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);

        daftar.printSemuaGaji();
    }
}
