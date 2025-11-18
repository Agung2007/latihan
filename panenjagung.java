import java.util.Scanner;

public class panenjagung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah lot panen: ");
        int n = input.nextInt();
        input.nextLine(); // buang newline

        double totalHasil = 0.0;    // total berat panen (kg)
        double totalKeuntungan = 0.0; // total keuntungan (Rp)

        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.println("Lot ke-" + i + ":");
            System.out.print("  Nama lot: ");
            String nama = input.nextLine();

            System.out.print("  Hasil panen (kg): ");
            double hasilKg = input.nextDouble();

            System.out.print("  Harga jual per kg (Rp): ");
            double hargaPerKg = input.nextDouble();

            System.out.print("  Biaya total untuk lot ini (Rp): ");
            double biaya = input.nextDouble();
            input.nextLine(); // buang newline sebelum iterasi berikutnya

            double pemasukan = hasilKg * hargaPerKg;
            double keuntungan = pemasukan - biaya;

            // Klasifikasi kualitas berdasarkan hasil (kg) -- aturan sederhana
            String kualitas;
            if (hasilKg >= 5000) {
                kualitas = "Baik";
            } else if (hasilKg >= 3000) {
                kualitas = "Sedang";
            } else {
                kualitas = "Kurang";
            }

            // Tampilkan ringkasan untuk lot ini
            System.out.printf("  -> Lot: %s | Hasil: %.2f kg | Kualitas: %s\n", nama, hasilKg, kualitas);
            System.out.printf("     Pemasukan: Rp %.2f | Biaya: Rp %.2f | Keuntungan: Rp %.2f\n\n",
                    pemasukan, biaya, keuntungan);

            totalHasil += hasilKg;
            totalKeuntungan += keuntungan;
        }

        // Tampilkan total akhir
        System.out.println("=== HASIL TOTAL SELAMA MUSIM ===");
        System.out.printf("Total hasil panen (semua lot): %.2f kg\n", totalHasil);
        System.out.printf("Total keuntungan (semua lot): Rp %.2f\n", totalKeuntungan);

        input.close();
    }
}
