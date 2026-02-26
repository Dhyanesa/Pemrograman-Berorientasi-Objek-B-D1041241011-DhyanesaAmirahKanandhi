public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        boolean ketemu = false;

        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");

        for (int baris = 1; baris <= 3; baris++) {
            for (int kolom = 1; kolom <= 5; kolom++) {
                System.out.println("Cek: [" + baris + "," + kolom + "]");

                if (baris == 2 && kolom == 3) {
                    System.out.println("✓ Koordinat ditemukan!");
                    ketemu = true;
                    break;
                }
            }

            if (ketemu) {
                break;
            }
        }

        System.out.println("Pencarian selesai.");
    }
}
/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Kelas : B
 */