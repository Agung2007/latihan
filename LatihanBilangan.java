// Nama file: LatihanBilangan.java

import java.util.Scanner;

public class LatihanBilangan {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan bilangan bulat
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = input.nextInt();

        // Mengecek apakah bilangan positif, negatif, atau nol
        if (bilangan > 0) {
            System.out.println("Bilangan tersebut adalah POSITIF.");
        } else if (bilangan < 0) {
            System.out.println("Bilangan tersebut adalah NEGATIF.");
        } else {
            System.out.println("Bilangan tersebut adalah NOL.");
        }

        // Mengecek apakah bilangan ganjil atau genap
        // Catatan: angka 0 dianggap genap secara matematika
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan tersebut adalah GENAP.");
        } else {
            System.out.println("Bilangan tersebut adalah GANJIL.");
        }

        // Menutup Scanner untuk mencegah memory leak
        input.close();
    }
}
