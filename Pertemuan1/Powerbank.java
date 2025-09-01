class Powerbank {
    String merk;
    int Kapasitas;

    public Powerbank(String merk, int Kapasitas) {
        this.merk = merk;
        this.Kapasitas = Kapasitas;
    }

    void isiDaya(){
        System.out.println("Powerbank " + merk + " sedang mengisi daya handphone");
    }

    void cekBaterai(){
        System.out.println("Powerbank " + merk + " kapasitas: " + Kapasitas + " mAh");
    }

    void cetakStatus(){
        System.out.println("Merk : " + merk);
        System.out.println("Kapasitas Baterai : " + Kapasitas + " mAh");
    }
}
