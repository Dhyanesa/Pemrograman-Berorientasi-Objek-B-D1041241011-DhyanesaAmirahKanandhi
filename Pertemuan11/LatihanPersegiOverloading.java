class PersegiPanjang {
    int panjang;
    int lebar;
    int luas;
    int keliling;

    public PersegiPanjang(int sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    public void tampilkanInfo(String tipe) {
        System.out.println("=== " + tipe.toUpperCase() + " ===");
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}

public class LatihanPersegiOverloading {
    public static void main(String[] args) {
        PersegiPanjang objek1 = new PersegiPanjang(5);
        PersegiPanjang objek2 = new PersegiPanjang(8, 4);

        objek1.tampilkanInfo("Persegi");
        System.out.println();
        objek2.tampilkanInfo("Persegi Panjang");
    }
}

/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Kelas : B
 */