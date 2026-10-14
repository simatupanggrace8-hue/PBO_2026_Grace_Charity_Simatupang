/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_2;

/**
 *
 * @author Grace
 */
class KurirReguler {
    protected String nama;

    public KurirReguler(String nama) {
        this.nama = nama;
    }

    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

class KurirDrone extends KurirReguler {
    private String idDrone;

    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama
                + " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");

        KurirReguler k1 = new KurirReguler("Budi");

        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}


/*
1. Setelah @Override di hapus pada class KurirDrone dan method di 
bawahnya di ubah menjadi huruf b kecil
-  Apa output yang tercetak dari k2.kirimBarang("Gedung 
Graha Lt. 5")?
Jawab : Output yang tercetak adalah Arka mengantar paket ke Gedung Graha Lt. 5 
lewat jalur darat menembus kemacetan.
Hal ini terjadi karena method kirimbarang() pada KurirDrone salah penulisan, 
sehingga dianggap sebagai method baru dan bukan overriding method kirimBarang() 
dari KurirReguler. Akibatnya, ketika k2.kirimBarang() dipanggil, Java menggunakan 
method kirimBarang() milik KurirReguler.

- Apakah masih "lewat jalur udara" atau berubah menjadi "lewat jalur darat"? 
Jawab: Setelah adaa perubahan sekarang sudah berubah menjadi lewat jalur darat.

2. Setelah override di kembalikan
- Pesan eror yang muncul: 
Uncompilable code - method does not override or implement a method from a supertype

-  fungsi utama dari tulisan @Override bagi seorang programmer!
fungsi utama @Override itu untuk memastikan bahwa method pada child class benar-benar 
melakukan overriding terhadap method pada parent class. Selain itu, @Override membantu 
programmer menemukan kesalahan seperti salah mengetik nama method atau parameter.
*/
