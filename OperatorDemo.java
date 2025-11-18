// Nama kelas: OperatorDemo
// Semua kode Java harus berada di dalam sebuah class
public class OperatorDemo {

    // Metode utama (main) tempat program mulai dijalankan
    public static void main(String[] args) {

        // Deklarasi dan inisialisasi variabel bertipe double (bilangan desimal)
        double angka1 = 15.0;
        double angka2 = 5.0;

        // Menampilkan nilai awal ke layar
        System.out.println("Angka 1: " + angka1);
        System.out.println("Angka 2: " + angka2);
        System.out.println("-------------------------------------");

        // ===========================
        // 1. Operator Aritmatika
        // ===========================

        // Operator Tambah (+)
        double hasilTambah = angka1 + angka2; // 15 + 5 = 20
        System.out.println("Hasil Tambah (" + angka1 + " + " + angka2 + "): " + hasilTambah);

        // Operator Kurang (-)
        double hasilKurang = angka1 - angka2; // 15 - 5 = 10
        System.out.println("Hasil Kurang (" + angka1 + " - " + angka2 + "): " + hasilKurang);

        // Operator Kali (*)
        double hasilKali = angka1 * angka2; // 15 * 5 = 75
        System.out.println("Hasil Kali (" + angka1 + " * " + angka2 + "): " + hasilKali);

        // Operator Bagi (/)
        double hasilBagi = 0;

        // Dicek dulu agar tidak terjadi pembagian dengan nol (error)
        if (angka2 != 0) {
            hasilBagi = angka1 / angka2; // 15 / 5 = 3
            System.out.println("Hasil Bagi (" + angka1 + " / " + angka2 + "): " + hasilBagi);
        } else {
            System.out.println("Hasil Bagi: Tidak bisa dibagi dengan nol.");
        }

        System.out.println("-------------------------------------");

        // ===========================
        // 2. Operator Perbandingan & Logika
        // ===========================

        // Deklarasi variabel boolean untuk menyimpan hasil logika (true / false)
        boolean kondisi1;
        boolean kondisi2;
        boolean hasilLogikaAND;
        boolean hasilLogikaOR;

        // Kondisi 1: Apakah hasil tambah lebih besar dari 20?
        // 20 > 20 → false
        kondisi1 = hasilTambah > 20.0;
        System.out.println("Kondisi 1 (Hasil Tambah > 20.0): " + kondisi1);

        // Kondisi 2: Apakah hasil kali sama dengan 75?
        // 75 == 75 → true
        kondisi2 = hasilKali == 75.0;
        System.out.println("Kondisi 2 (Hasil Kali == 75.0): " + kondisi2);

        System.out.println("-------------------------------------");

        // Operator Logika AND (&&)
        // Menghasilkan true hanya jika kedua kondisi true
        // false && true → false
        hasilLogikaAND = kondisi1 && kondisi2;
        System.out.println("Hasil Logika && (Kondisi 1 && Kondisi 2): " + hasilLogikaAND);

        // Operator Logika OR (||)
        // Menghasilkan true jika salah satu kondisi true
        // false || true → true
        hasilLogikaOR = kondisi1 || kondisi2;
        System.out.println("Hasil Logika || (Kondisi 1 || Kondisi 2): " + hasilLogikaOR);

        System.out.println("-------------------------------------");

        // ===========================
        // 3. Perbandingan Tambahan
        // ===========================

        // Bandingkan hasil pengurangan dan hasil pembagian
        // 10 < 3 → false
        boolean kondisi3 = hasilKurang < hasilBagi;

        // 10 > 3 → true
        boolean kondisi4 = hasilKurang > hasilBagi;

        System.out.println("Kondisi 3 (Hasil Kurang < Hasil Bagi): " + kondisi3);
        System.out.println("Kondisi 4 (Hasil Kurang > Hasil Bagi): " + kondisi4);

        // Operator logika AND (&&)
        // false && true → false
        boolean hasilLogikaAND2 = kondisi3 && kondisi4;
        System.out.println("Hasil Logika && (Kondisi 3 && Kondisi 4): " + hasilLogikaAND2);

        // Operator logika OR (||)
        // false || true → true
        boolean hasilLogikaOR2 = kondisi3 || kondisi4;
        System.out.println("Hasil Logika || (Kondisi 3 || Kondisi 4): " + hasilLogikaOR2);
    }
}
