class Handphone {

    String merk;
    int kapasitasBaterai;

    public Handphone(String merk, int kapasitasBaterai){
        this.merk = merk;
        this.kapasitasBaterai = kapasitasBaterai;
    }

    void nyalakan(){
        System.out.println(merk + " nyala");
    }

    void matikan(){
        System.out.println(merk + " mati");
    }

    void cetakStatus(){
        System.out.println("Merk : " + merk);
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " mAh");
    }
}