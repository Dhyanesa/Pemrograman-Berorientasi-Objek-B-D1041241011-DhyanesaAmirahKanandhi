class Persegi {
    int sisi;
    int luas;
    int keliling;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        luas = sisi * sisi;
    }

    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}

public class ClassPersegi {
    public static void main(String[] args) {
        Persegi p = new Persegi(5);

        p.hitungLuas();
        p.hitungKeliling();
        p.tampilkanHasil();
    }
}
/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Kelas : B
 */