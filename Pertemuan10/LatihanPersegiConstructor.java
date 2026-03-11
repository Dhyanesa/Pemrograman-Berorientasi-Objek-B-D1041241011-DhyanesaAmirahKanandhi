class Persegi {
    int sisi;
    int luas;
    int keliling;

    public Persegi(int sisi) {
        if (sisi <= 0) {
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }

        this.luas = this.sisi * this.sisi;
        this.keliling = 4 * this.sisi;
    }

    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + this.sisi + " cm");
        System.out.println("Luas    : " + this.luas + " cm²");
        System.out.println("Keliling: " + this.keliling + " cm");
    }
}

public class LatihanPersegiConstructor {
    public static void main(String[] args) {
        // Objek 1 dengan sisi valid
        Persegi p1 = new Persegi(5);
        p1.tampilkanHasil();

        // Objek 2 dengan sisi invalid
        Persegi p2 = new Persegi(-3);
        p2.tampilkanHasil();
    }
}
/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Kelas : B
 */