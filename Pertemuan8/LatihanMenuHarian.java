public class LatihanMenuHarian {
    public static void main(String[] args) {
        System.out.println("=== MENU MAKAN 3 HARI ===");

        for (int hari = 1; hari <= 3; hari++) {
            System.out.println("Hari " + hari + ":");

            for (int waktu = 1; waktu <= 2; waktu++) {
                String labelWaktu = "";
                String menu = "";

                if (waktu == 1) {
                    labelWaktu = "Pagi";
                    if (hari == 1) menu = "Nasi Goreng";
                    else if (hari == 2) menu = "Bubur Ayam";
                    else menu = "Roti Bakar";
                } else {
                    labelWaktu = "Siang";
                    if (hari == 1) menu = "Soto Ayam";
                    else if (hari == 2) menu = "Mie Goreng";
                    else menu = "Nasi Uduk";
                }

                System.out.println(labelWaktu + ": " + menu);
            }
        }
    }
}
/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Kelas : B
 */