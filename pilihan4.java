import java.util.Scanner;

public class pilihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PANEN JAGUNG ===");

        System.out.print("Masukkan hasil panen jagung (kg): ");
        double hasilPanen = input.nextDouble();

        System.out.print("Masukkan harga jual per kg (Rp): ");  
        double hargaPerKg = input.nextDouble();

        System.out.print("Masukkan biaya produksi (Rp): ");
        double biayaProduksi = input.nextDouble();

        double pemasukan = hasilPanen * hargaPerKg;
        double keuntungan = pemasukan - biayaProduksi;

        // Menentukan kualitas
        String kualitas;
        if (hasilPanen >= 5000) {
            kualitas = "Baik";
        } else if (hasilPanen >= 3000) {
            kualitas = "Sedang";
        } else {
            kualitas = "Kurang";
        }

        System.out.println("\n=== HASIL PANEN JAGUNG ===");
        System.out.println("Hasil panen: " + hasilPanen + " kg");
        System.out.println("Harga jual per kg: Rp " + hargaPerKg);
        System.out.println("Biaya produksi: Rp " + biayaProduksi);
        System.out.println("Pemasukan: Rp " + pemasukan);
        System.out.println("Keuntungan: Rp " + keuntungan);
        System.out.println("Kualitas panen: " + kualitas);

        input.close();
    }
}
