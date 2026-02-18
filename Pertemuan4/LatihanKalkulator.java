public class LatihanKalkulator {
    public static void main(String[] args) {
        int angka1 = 25;
        int angka2 = 4;

        int hasilJumlah = angka1 + angka2;
        int hasilKurang = angka1 - angka2;
        int hasilKali = angka1 * angka2;
        int hasilBagi = angka1 / angka2;
        int sisaBagi = angka1 % angka2;
        double pembagianDesimal = (double) angka1 / angka2;

        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1: " + angka1);
        System.out.println("Angka 2: " + angka2);
        System.out.println("---");
        System.out.println("Penjumlahan: " + hasilJumlah);
        System.out.println("Pengurangan: " + hasilKurang);
        System.out.println("Perkalian: " + hasilKali);
        System.out.println("Pembagian: " + hasilBagi);
        System.out.println("Sisa Bagi: " + sisaBagi);
        System.out.println("Pembagian Desimal: " + pembagianDesimal);
    }
}
