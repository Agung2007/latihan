// File: PenilaianMahasiswa.java
import java.util.Scanner;

public class PenilaianMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ----------------------------
        // 1. TIPE DATA dan INPUT
        // ----------------------------
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine(); // tipe data String

        System.out.print("Masukkan nilai Tugas: ");
        double tugas = input.nextDouble(); // tipe data double

        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();


        // 2. OPERATOR dan PERHITUNGAN
        
        double nilaiAkhir = (tugas * 0.3) + (uts * 0.3) + (uas * 0.4); // operator * dan +
        boolean lulus = nilaiAkhir >= 60; // operator perbandingan >=


        // 3. PERCABANGAN (IF - ELSE)

        System.out.println("\n=== HASIL PENILAIAN MAHASISWA ===");
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Tugas: " + tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (lulus) {
            System.out.println("Status: Lulus 🎉");
        } else {
            System.out.println("Status: Tidak Lulus 😞");
        }

        // ----------------------------
        // 4. PERULANGAN (FOR)
        // ----------------------------
        System.out.println("\nDaftar percobaan pengambilan mata kuliah:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Percobaan ke-" + i);
        }

        // ----------------------------
        // 5. OUTPUT AKHIR
        // ----------------------------
        System.out.println("\nTerima kasih telah menggunakan program penilaian, " + nama + "!");

        input.close(); // menutup Scanner
    }
}
