public class array {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3};
        System.out.println("Awal Program");
        try {
            System.out.println(angka[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: Indeks array di luar batas!");
        }
        System.out.println("Akhir Program");
    }
}
