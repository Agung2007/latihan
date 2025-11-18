<?php
// Program: latihan_bilangan.php
// Tujuan: Menentukan apakah sebuah bilangan bulat bernilai
//         positif, negatif, atau nol, dan apakah ganjil atau genap.

// Menampilkan pesan untuk memasukkan bilangan ke user
echo "Masukkan sebuah bilangan bulat: ";

// Membaca input dari pengguna (terminal/CLI)
$input = trim(fgets(STDIN));

// Mengubah input menjadi integer
$bilangan = (int) $input;

// Mengecek apakah bilangan positif, negatif, atau nol
if ($bilangan > 0) {
    echo "Bilangan tersebut adalah POSITIF." . PHP_EOL;
} else if ($bilangan < 0) {
    echo "Bilangan tersebut adalah NEGATIF." . PHP_EOL;
} else {
    echo "Bilangan tersebut adalah NOL." . PHP_EOL;
}

// Mengecek apakah bilangan ganjil atau genap
// Catatan: nol juga termasuk bilangan genap
if ($bilangan % 2 == 0) {
    echo "Bilangan tersebut adalah GENAP." . PHP_EOL;
} else {
    echo "Bilangan tersebut adalah GANJIL." . PHP_EOL;
}
?>
