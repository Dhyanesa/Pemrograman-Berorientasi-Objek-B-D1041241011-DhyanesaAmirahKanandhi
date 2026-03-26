class Sekolah {
    String namaSekolah;

    public Sekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    class Kelas {
        String namaKelas;

        public Kelas(String namaKelas) {
            this.namaKelas = namaKelas;
        }

        public void info() {
            System.out.println("Sekolah: " + namaSekolah);
            System.out.println("Kelas: " + namaKelas);
        }
    }
}

public class LatihanInnerClass {
    public static void main(String[] args) {
        Sekolah sma = new Sekolah("SMA Negeri 1");

        Sekolah.Kelas kelasXA = sma.new Kelas("X-A");

        kelasXA.info();
    }
}

/*
Nama : Dhyanesa Amirah Kanandhi
NIM : D1041241011
Kelas : B
 */