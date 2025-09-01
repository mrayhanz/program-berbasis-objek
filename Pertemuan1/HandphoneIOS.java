class HandphoneIOS extends Handphone {
    String versiIOS;
    boolean ultraWideKamera;
    int jumlahKamera;
    
    public HandphoneIOS(String merk, int kapasitasBaterai, String versiIOS, int jumlahKamera){
        super(merk, kapasitasBaterai);
        this.versiIOS = versiIOS;
        this.jumlahKamera = jumlahKamera;
    }

    void bukaAppStore(){
        System.out.println(merk + " membuka App Store");
    }

    void gunakanUltraWide(){
        if (ultraWideKamera == true){
            System.out.println(merk + " sedang menggunakan kamera ultra wide");{
            }
        }else{
            System.out.println(merk + " tidak memiliki kamera ultra wide");
        }
    }

    void cetakStatus(){
        super.cetakStatus();
        System.out.println("Versi IOS : " + versiIOS);
        System.out.println("Jumlah Kamera : " + jumlahKamera);
        System.out.println("Ultra Wide Kamera : " + (ultraWideKamera? "ada" : "tidak ada"));
    }
}
