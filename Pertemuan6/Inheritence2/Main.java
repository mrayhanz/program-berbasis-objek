package Inheritence2;

public class Main {
    public static void main(String[] args) {
        Pc pc1 = new Pc("ASUS ROG", 4, 16, "Intel Core i9", 27);
        Mac mac1 = new Mac("MacBook Pro", 3, 16, "Apple M2", "Lithium-polymer", "T2 Security Chip");
        Windows windows1 = new Windows("Dell XPS", 3, 32, "Intel Core i7", "Lithium-ion", "Windows Hello");

        System.out.println("=========================================");
        System.out.println("             DATA SPESIFIKASI            ");
        System.out.println("=========================================");
        
        System.out.println("\n---------- DATA PC ----------");
        pc1.tampilPc();

        System.out.println("\n---------- DATA MAC ----------");
        mac1.tampilMac();

        System.out.println("\n---------- DATA WINDOWS ----------");
        windows1.tampilWindows();
        
        System.out.println("\n=========================================");
    }
}
