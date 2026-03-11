class Mobil {
    String merk;
    String warna;
    int tahun;

    public Mobil() {
        this.merk = "Belum diisi";
        this.warna = "Belum diisi";
        this.tahun = 0;
    }

    public Mobil(String merk) {
        this.merk = merk;
        this.warna = "Belum diisi";
        this.tahun = 0;
    }

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
}

public class LatihanMobilConstructor {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

        Mobil mobil2 = new Mobil("Toyota");

        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}
/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Kelas : B
 */