package Inheritence2;

public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    // Default constructor
    public Komputer() {
    }

    // Parameterized constructor
    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData() {
        System.out.println("Merk                : " + merk);
        System.out.println("Kecepatan Prosesor  : " + kecProsesor + " GHz");
        System.out.println("Ukuran Memory       : " + sizeMemory + " GB");
        System.out.println("Jenis Prosesor      : " + jnsProsesor);
    }
}
