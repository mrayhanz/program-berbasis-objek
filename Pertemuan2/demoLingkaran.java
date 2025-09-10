public class demoLingkaran {
    public static void main(String[] args) {
        lingkaran ling = new lingkaran();
        ling.phi = 3.14;
        ling.r = 7;

        System.out.println("Jari-jari     : " + ling.r);
        System.out.println("Luas Lingkaran: " + ling.hitungLuas());
        System.out.println("Keliling      : " + ling.hitungKeliling());
    }
}
