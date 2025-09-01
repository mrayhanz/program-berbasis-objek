class Smartwatch {
    String merk;
    int tahananBaterai;

    public Smartwatch(String merk, int tahananBaterai) {
        this.merk = merk;
        this.tahananBaterai = tahananBaterai;
    }

    void hitungDetakJantung(){
        System.out.println(merk + " menghitung detak jantung");
    }

    void TampilkanNotifikasi(String pesan){
        System.out.println(merk + " menampilkan notifikasi" + pesan);
    }
    

    void tampilkanWaktu(){
        System.out.println(merk + " menampilkan waktu");
    }

    void cetakStatus(){
        System.out.println("Merk : " + merk);
        System.out.println("Tahanan Baterai : " + tahananBaterai + " Jam");
    }
}
