/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/**
 *
 * @author Grace
 */
import id.ac.del.rental.VehicleRental;

public class TestRental {
    public static void main(String[] args) {
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);

        v.plateNumber = "";
        v.rentalRatePerDay = -500000;
        v.discountRate = 0.20;
        v.setRentalDays(-7);

        System.out.println("Total Biaya: Rp" + v.getTotalCost());
    }
}

/* Diskusi Kelompok
1. Analisis Kompilasi dan Hak Akses (Access Modifiers)

Pada kode TestRental.java, baris yang akan menyebabkan compile-time error 
adalah Baris B dan Baris C. Baris B yaitu v.rentalRatePerDay = -500000; 
tidak bisa dijalankan karena atribut rentalRatePerDay menggunakan 
access modifier protected, sedangkan TestRental berada di package yang 
berbeda dan bukan merupakan subclass dari VehicleRental. 
Sementara itu, Baris C yaitu v.discountRate = 0.20; 
juga mengalami error karena discountRate tidak memiliki 
modifier sehingga bersifat default atau package-private. 
Akses default hanya dapat digunakan oleh class yang berada 
dalam package yang sama. Berbeda dengan Baris A, plateNumber menggunakan 
public sehingga masih bisa diakses walaupun berbeda package. 
Baris D juga tidak error karena setRentalDays() merupakan method public, 
sehingga bisa dipanggil dari package lain.

2. Kelemahan Integritas Data (Data Hiding & Validation)

i) Cacat logika pada method setRentalDays
Walaupun atribut rentalDays sudah dibuat private dan hanya dapat diubah melalui
method setRentalDays(), method tersebut masih memiliki kelemahan karena tidak
melakukan validasi terhadap nilai yang diberikan. Pada kode saat ini, nilai
apa pun langsung disimpan ke dalam rentalDays, termasuk nilai negatif seperti -7.
Padahal jumlah hari penyewaan seharusnya tidak boleh bernilai negatif.
Jadi, masalahnya bukan pada penggunaan setter, tetapi karena setter tersebut
belum memiliki aturan untuk memeriksa apakah nilai yang diberikan valid sebelum
disimpan.

ii) Penyebab total biaya dapat bernilai negatif dan cara memperbaikinya
Total biaya dapat menjadi negatif karena beberapa data yang digunakan dalam
perhitungan masih dapat berisi nilai yang tidak valid. Misalnya, rentalRatePerDay
dapat diberi nilai negatif dan rentalDays juga dapat diisi dengan nilai negative
karena belum memiliki validasi. Selain itu, discountRate juga dapat diberi nilai
yang terlalu besar sehingga jumlah diskon melebihi harga sewa. Untuk mencegah
terjadinya korupsi data, atribut yang berkaitan dengan perhitungan biaya sebaiknya
dibuat private dan perubahan nilainya dilakukan melalui method yang memiliki validasi.
Tarif sewa harus lebih besar atau sama dengan nol, jumlah hari sewa harus lebih 
dari nol, dan nilai diskon harus dibatasi pada rentang yang wajar.
Dengan begitu, data yang digunakan dalam perhitungan tetap valid dan total biaya
tidak menghasilkan nilai yang tidak masuk akal.

3. Penerapan Interface (Dependency Injection) 

i) Interface Discountable dibuat dengan method calculateDiscount(double amount) 
sebagai kontrak untuk berbagai jenis diskon.

ii) Method getTotalCost() diubah agar menerima parameter Discountable. 
Harga total sebelum diskon dihitung terlebih dahulu, kemudian calculateDiscount() 
digunakan untuk menghitung potongan berdasarkan objek diskon yang diberikan saat runtime. 
Dengan begitu, berbagai jenis diskon dapat digunakan melalui polimorfisme.
*/