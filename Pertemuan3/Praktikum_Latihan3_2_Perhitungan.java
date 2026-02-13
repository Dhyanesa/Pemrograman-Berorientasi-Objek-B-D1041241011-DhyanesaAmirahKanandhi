public class Praktikum_Latihan3_2_Perhitungan {
    public static void main (String[] args){
        // 1. Buat variabel saldo awal
        int saldo = 1000000;

        // Variabel bantuan untuk menampung nilai transaksi
        int nominalSetor = 500000;
        int nominalTarik = 250000;

        System.out.println("=== SIMULASI TRANSAKSI BANK ===");

        // 2. Tampilkan saldo awal
        System.out.println("Saldo Awal          : " + saldo);

        // 3. Proses Setoran
        saldo = saldo + nominalSetor;

        // 4. Tampilkan info setoran
        System.out.println("Setoran             : " + nominalSetor);
        System.out.println("Saldo Setelah Setor : " + saldo);

        // 5. Proses Penarikan
        saldo = saldo - nominalTarik;

        // 6. Tampilkan info penarikan dan saldo akhir
        System.out.println("Penarikan           : " + nominalTarik);
        System.out.println("Saldo Akhir         : " + saldo);
    }
}

/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Tanggal : 13 Februari 2026
 */