import java.util.ArrayDeque;
import java.util.Scanner;

public class ContohAntrean2 {
    public static void main(String[] args) {
        ArrayDeque<String> daftar = new ArrayDeque<>();
        Scanner input = new Scanner(System.in);

        // Data awal
        daftar.add("Agung Ganteng");   
        daftar.add("Aminudin");
        daftar.add("Zaskia");
        daftar.add("Rina Melati");
        daftar.add("Farhan");
        daftar.add("Agnes Monica");
        

        int pilihan = 0;

        do {
            System.out.println("\n=== MENU ANTREAN ===");
            System.out.println("1. Keluarkan data pertama");
            System.out.println("2. Tambah data di belakang");
            System.out.println("3. Tampilkan antrean");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang enter

            switch (pilihan) {

                case 1:
                    if (!daftar.isEmpty()) {
                        String keluar = daftar.remove(); // FIFO
                        System.out.println("Data keluar: " + keluar);
                    } else {
                        System.out.println("Antrean kosong!");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = input.nextLine();
                    daftar.add(namaBaru);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("\nIsi antrean sekarang:");
                    for (String nama : daftar) {
                        System.out.println("- " + nama);
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak ada!");
            }

        } while (pilihan != 4);

        input.close();
    }
}
