class Mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan = 0;

    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }

    public void percepat() {
        kecepatan = kecepatan + 20;
        System.out.println("Mobil dipercepat...");
    }

    public void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}

public class ClassMobil {
    public static void main(String[] args) {
        Mobil mobilKu = new Mobil("Toyota Avanza", "Silver", 2020);

        mobilKu.tampilkanSpesifikasi();
        mobilKu.percepat();
        mobilKu.percepat();
        mobilKu.tampilkanKecepatan();
    }
}
/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Kelas : B
 */