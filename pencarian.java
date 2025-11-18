// Import library JOptionPane agar bisa menggunakan dialog input/output berbentuk popup
import javax.swing.JOptionPane;

// Deklarasi kelas utama bernama "pencarian"
public class pencarian {

    // Fungsi utama yang akan dijalankan pertama kali saat program dimulai
    public static void main(String[] args) {

        // Deklarasi array 'data' berukuran 5 untuk menyimpan 5 angka yang dimasukkan pengguna
        int data[] = new int[5];

        // Deklarasi variabel
        int i, angka, cari;  // i untuk perulangan, angka untuk input sementara, cari untuk angka yang dicari
        boolean ketemu;      // untuk menandai apakah angka yang dicari ditemukan atau tidak

        // -----------------------------
        // Bagian 1: Input Data ke Array
        // -----------------------------
        for (i = 0; i < data.length; i++) {
            // Meminta pengguna memasukkan angka ke-i menggunakan JOptionPane
            angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka ke-" + (i + 1) + ":"));
            
            // Menyimpan angka yang dimasukkan ke dalam array 'data'
            data[i] = angka;
        }

        // ---------------------------------
        // Bagian 2: Menampilkan Data di Konsol
        // ---------------------------------
        System.out.print("Angka Dimasukkan = { ");
        for (i = 0; i < data.length; i++) {
            // Menampilkan isi array satu per satu
            System.out.print(data[i] + " ");
        }
        System.out.println("}");

        // ---------------------------------
        // Bagian 3: Input Angka yang Ingin Dicari
        // ---------------------------------
        // Meminta pengguna memasukkan angka yang ingin dicari
        cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Yang Ingin Dicari :"));
        
        // Menampilkan angka yang dicari di konsol
        System.out.println("Angka Dicari : " + cari);

        // ---------------------------------
        // Bagian 4: Proses Pencarian Angka
        // ---------------------------------
        ketemu = false; // Awalnya dianggap belum ketemu
        for (i = 0; i < data.length; i++) {
            // Jika elemen array sama dengan angka yang dicari
            if (data[i] == cari) {
                ketemu = true; // tandai bahwa angka ditemukan
                break;         // hentikan perulangan (karena sudah ketemu)
            }
        }

        // ---------------------------------
        // Bagian 5: Menampilkan Hasil Pencarian
        // ---------------------------------
        if (ketemu) {
            // Jika angka ditemukan, tampilkan posisi urutannya
            System.out.println("Angka ditemukan dalam urutan ke-" + (i + 1));
        } else {
            // Jika tidak ditemukan, tampilkan pesan ini
            System.out.println("Angka tidak ditemukan");
        }
    }
}
