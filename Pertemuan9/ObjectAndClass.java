class ObjectClass {
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void percepatan(int increment){
        kecepatan += increment;
    }

    public void tampilkanInfo() {
        System.out.println("merk : " + merk);
        System.out.println("warna : " + warna);
        System.out.println("tahun : " + tahun);
        System.out.println("kecepatan : " + kecepatan + " km/h ");
    }
}

public class ObjectAndClass {
    public static void main(String[] args){
        ObjectClass mobil1 = new ObjectClass();
        mobil1.merk = "Wuling";
        mobil1.warna = "ungu";
        mobil1.tahun = 2026;
        mobil1.kecepatan = 70;

        System.out.println("Informasi Mobil:");
        mobil1.tampilkanInfo();
    }

}
