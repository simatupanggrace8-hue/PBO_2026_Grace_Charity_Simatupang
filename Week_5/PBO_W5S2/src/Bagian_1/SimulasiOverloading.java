/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bagian_1;

/**
 *
 * @author Grace
 */
class MesinTarif {

    private String kotaAsal;

    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;

        if (isExpress) {
            total += 20000;
        }

        return total;
    }
}

public class SimulasiOverloading {

    public static void main(String[] args) {

        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");
        System.out.println("Ongkir Biasa (2.0 Kg)        : Rp " 
                + tarif.hitungOngkir(2.0));

        System.out.println("Ongkir dengan Asuransi (Barang 5Jt): Rp " 
                + tarif.hitungOngkir(2.0, 5000000.0));

        System.out.println("Ongkir Express (2.0 Kg)      : Rp " 
                + tarif.hitungOngkir(2.0, true));
    }
  }  
    /*
    1. Mengapa compiler Java dapat menentukan method hitungOngkir mana yang 
    dijalankan sebelum program dieksekusi (compile-time)? 
    Bagian method apa yang diperiksa compiler?
    Jawab:
    Compiler dapat menentukan method hitungOngkir yang akan dijalankan karena
    setiap method memiliki parameter yang berbeda. Saat program dikompilasi, compiler
    akan melihat methodnya, terutama nama method, jumlah parameter, dan tipe
    data parameternya.
    
    2. Mengapa compiler menolak kode tersebut padahal tipe kembaliannya berbeda (int vs double)? 
    Jawab :
    Compiler menolak karena method tersebut memiliki nama dan parameter yang sama persis dengan 
    method yang sudah ada yaitu public double hitungOngkir(double beratKg)
    Walaupun return type-nya berbeda, yaitu int dan double, return type tidak 
    digunakan untuk membedakan method dalam overloading. Jadi Java menganggap 
    kedua method tersebut sama dan menyebabkan error.
*/

