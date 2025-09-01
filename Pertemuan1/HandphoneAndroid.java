class HandphoneAndroid extends Handphone{
    String versiAndroid;
    int jumlahKamera;

    public HandphoneAndroid(String merk, int kapasitasBaterai, String versiAndroid, int jumlahKamera){
        super(merk, kapasitasBaterai);
        this.versiAndroid = versiAndroid;
        this.jumlahKamera = jumlahKamera;
    }

    void bukaPlaystore(){
        System.out.println(merk + " membuka Playstore");
    }

    void multiTasking(){
        System.out.println(merk + " sedang melakukan multitasking di " + versiAndroid);
    }

    void cetakStatus(){
        super.cetakStatus();
        System.out.println("Versi Android : " + versiAndroid);
        System.out.println("Jumlah Kamera : " + jumlahKamera);
    }
}
