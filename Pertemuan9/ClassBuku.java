class Buku {
    String judul;
    String pengarang;
    int harga;

    public Buku(String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp " + harga);
    }
}

public class ClassBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);

        Buku buku2 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}
/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Kelas : B
 */