package Inheritence2;

public class Laptop extends Komputer {
    public String jnsBatrai;
    public Laptop(){
        
    }
    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrai = jnsBatrai;
    }
    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai       : " + jnsBatrai);
    }
}
