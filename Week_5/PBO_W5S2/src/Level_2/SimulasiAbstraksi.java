/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level_2;

/**
 *
 * @author Grace
 */
// abtract menunjukan bahwa kendaraanEkpedisi adalah abstrak class
// artinya tidak boleh dibuat objek secara langsung karena konsepnya umum
// kita tidak tau kendaraan ekspedisi apa yang di maksud. Truk? Van? dll
abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;
    
    // constructor
    // data awal kendaraan 
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }
    
    // method 1 : untuk menampilkan info kendaraan
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }
    
    // abtract method
    // setiap kendaraan ekpedisi wajib mempunyai fungsi angkutBarang()
    // tapi tidak menentukan bagaimana cara mengankut barangnya
    public abstract void angkutBarang(String namaBarang);
}

// artinya TrukBox mewarisi atribut dan method dari KendaraanEkspedisi
class TrukBox extends KendaraanEkspedisi {
    
    // constructor
    // menggunkan super untuk memanggil constructor parent untuk
    //mengisi nomor polisi serta kapasitas kendaraan
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }
    
    // Karena KendaraanEkspedisi memiliki abstract method angkutBarang()
    // maka TrukBox wajib mengimplementasikan method tersebut
    // @Override menunjukkan bahwa method ini mengimplementasikan
    // abstract method angkutBarang()yang berasal dari parent.
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat " + namaBarang
                + " ke dalam kontainer tertutup pendingin.");
    }
}

class MobilVan extends KendaraanEkspedisi {

    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat " + namaBarang
                + " di bagasi belakang untuk distribusi kota.");
    }
}

// class utama untuk menjalankan program
public class SimulasiAbstraksi {

    public static void main(String[] args) {

        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        //KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        // artinya kita meminta objek fuso menjalankan method infoKendaraan
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Unit Kulkas");

        System.out.println("------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        //Karena grandmax merupakan objek MobilVan, maka Java menggunakan 
        //implementasi angkutBarang() milik MobilVan.
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
 }   
    
/*
1. EKSPERIMEN 1
Setelah  buka komentar (uncomment) pesan error :
KendaraanEkspedisi is abstract; cannot be instantiated
Mengapa Java menggagalkan baris kode?
Karena KendaraanEkspedisi adalah abstract class. Abstract class tidak bisa 
langsung dibuat menjadi objek menggunakan new. Class ini hanya menjadi kerangka 
dasar untuk class turunannya. Oleh karena itu, kita harus membuat objek dari 
subclass seperti TrukBox atau MobilVan, bukan langsung dari KendaraanEkspedisi.

2. EKSPERIMEN 2
2 opsi solusi untuk  class baru dengan nama MotorKurir yang melakukan extends ke 
KendaraanEkspedisi,
- MotorKurir is not abstract and does not override abstract method
menjadikan MotorKurir sebagai abstract class sehingga tidak wajib 
mengimplementasikan method angkutBarang().

- angkutBarang(String) in KendaraanEkspedisi
menambahkan dan mengimplementasikan method angkutBarang() yang diwariskan dari 
KendaraanEkspedisi.

*/

