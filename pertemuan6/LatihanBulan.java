public class LatihanBulan {
    public static void main(String[] args) {

        int month = 13;
        String namaBulan;

        switch (month) {
            case 1:  namaBulan = "Januari"; break;
            case 2:  namaBulan = "Februari"; break;
            case 3:  namaBulan = "Maret"; break;
            case 4:  namaBulan = "April"; break;
            case 5:  namaBulan = "Mei"; break;
            case 6:  namaBulan = "Juni"; break;
            case 7:  namaBulan = "Juli"; break;
            case 8:  namaBulan = "Agustus"; break;
            case 9:  namaBulan = "September"; break;
            case 10: namaBulan = "Oktober"; break;
            case 11: namaBulan = "November"; break;
            case 12: namaBulan = "Desember"; break;
            default: namaBulan = "Error"; break;
        }

        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka Bulan: " + month);

        if (namaBulan.equals("Error")) {
            System.out.println("Error: Angka bulan tidak valid (1-12)");
        } else {
            System.out.println("Nama Bulan: " + namaBulan);
        }
    }
}
/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Kelas : B
 */