import java.util.Scanner;

public class BeratBadanIdeal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSiswa;

        // Sekolah 1
        System.out.print("Masukkan jumlah siswa di Sekolah 1: ");
        jumlahSiswa = input.nextInt();
        double totalTinggi1 = 0, totalBerat1 = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("\nData siswa ke-" + i + " Sekolah 1");
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jk = input.next().charAt(0);
            System.out.print("Masukkan tinggi badan (cm): ");
            double tinggi = input.nextDouble();

            double beratIdeal;
            if (jk == 'L' || jk == 'l') {
                beratIdeal = (tinggi - 100) - (0.1 * (tinggi - 100));
            } else {
                beratIdeal = (tinggi - 100) - (0.15 * (tinggi - 100));
            }

            System.out.println("Berat badan ideal siswa ke-" + i + " = " + beratIdeal + " kg");

            totalTinggi1 += tinggi;
            totalBerat1 += beratIdeal;
        }

        double rataTinggi1 = totalTinggi1 / jumlahSiswa;
        double rataBerat1 = totalBerat1 / jumlahSiswa;

        // Sekolah 2
        System.out.print("\nMasukkan jumlah siswa di Sekolah 2: ");
        jumlahSiswa = input.nextInt();
        double totalTinggi2 = 0, totalBerat2 = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("\nData siswa ke-" + i + " Sekolah 2");
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jk = input.next().charAt(0);
            System.out.print("Masukkan tinggi badan (cm): ");
            double tinggi = input.nextDouble();

            double beratIdeal;
            if (jk == 'L' || jk == 'l') {
                beratIdeal = (tinggi - 100) - (0.1 * (tinggi - 100));
            } else {
                beratIdeal = (tinggi - 100) - (0.15 * (tinggi - 100));
            }

            System.out.println("Berat badan ideal siswa ke-" + i + " = " + beratIdeal + " kg");

            totalTinggi2 += tinggi;
            totalBerat2 += beratIdeal;
        }

        double rataTinggi2 = totalTinggi2 / jumlahSiswa;
        double rataBerat2 = totalBerat2 / jumlahSiswa;

        // Hasil rata-rata
        System.out.println("\n=== HASIL RATA-RATA ===");
        System.out.println("Sekolah 1 - Rata-rata tinggi: " + rataTinggi1 + " cm");
        System.out.println("Sekolah 1 - Rata-rata berat ideal: " + rataBerat1 + " kg");
        System.out.println("Sekolah 2 - Rata-rata tinggi: " + rataTinggi2 + " cm");
        System.out.println("Sekolah 2 - Rata-rata berat ideal: " + rataBerat2 + " kg");
    }
}
