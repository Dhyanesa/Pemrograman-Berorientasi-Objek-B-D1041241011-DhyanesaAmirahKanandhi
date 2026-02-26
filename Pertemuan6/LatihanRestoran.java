public class LatihanRestoran {
    public static void main(String[] args) {
        int menuCode = 1;
        int quantity = 2;
        String namaMenu = "";
        int hargaSatuan = 0;

        switch (menuCode) {
            case 1:
                namaMenu = "Nasi Goreng";
                hargaSatuan = 15000;
                break;
            case 2:
                namaMenu = "Mie Ayam";
                hargaSatuan = 12000;
                break;
            case 3:
                namaMenu = "Bakso";
                hargaSatuan = 10000;
                break;
            case 4:
                namaMenu = "Soto Ayam";
                hargaSatuan = 13000;
                break;
            case 5:
                namaMenu = "Es Teh";
                hargaSatuan = 3000;
                break;
            default:
                namaMenu = "Menu Tidak Valid";
                break;
        }

        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);

        if (hargaSatuan > 0) {
            int totalBayar = hargaSatuan * quantity;
            System.out.println("Pesanan Anda:");
            System.out.println("Nama Menu: " + namaMenu);
            System.out.println("Harga Satuan: Rp " + hargaSatuan);
            System.out.println("Jumlah: " + quantity);
            System.out.println("---");
            System.out.println("Total Bayar: Rp " + totalBayar);
        } else {
            System.out.println("Error: Kode menu yang Anda masukkan salah.");
        }
    }
}
