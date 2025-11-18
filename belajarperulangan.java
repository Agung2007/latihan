// Deklarasi kelas utama dengan nama "belajarperulangan"
public class belajarperulangan {

    /**
     * Metode utama (main method)
     * Program Java selalu mulai dieksekusi dari method main()
     * @param args digunakan untuk menerima argumen dari command line (jika ada)
     */
    public static void main(String[] args) {

        // TODO code application logic here
        // Kode utama program akan ditulis di bawah baris ini

        // Perulangan FOR digunakan untuk mengulang perintah secara berurutan
        // Struktur umum: for (inisialisasi; kondisi; perubahan)
        // i = 1       → nilai awal variabel i dimulai dari 1
        // i <= 100    → perulangan akan terus berjalan selama i kurang dari atau sama dengan 100
        // i++         → setiap kali perulangan selesai, nilai i bertambah 1

        for (int i = 1; i <= 100; i++) {
            // Perintah di dalam blok ini akan dijalankan setiap kali perulangan terjadi
            // Menampilkan nilai variabel i ke layar
            System.out.println(i);
        }

        // Setelah i mencapai 101 (tidak memenuhi kondisi i <= 100),
        // maka perulangan berhenti, dan program selesai dijalankan.
    }
}
