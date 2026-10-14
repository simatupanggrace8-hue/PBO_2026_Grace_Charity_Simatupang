/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

/**
 *
 * @author Grace
 */
class Kendaraan {
    
    public void angkutBarang() {
        System.out.println("Kendaraan mengangkut barang.");
    }
}

class Motor extends Kendaraan {
    
    @Override
    public void angkutBarang() {
        System.out.println("Motor mengangkut barang melalui jalan kecil.");
    }
}

class Mobil extends Kendaraan {
    
    @Override
    public void angkutBarang() {
        System.out.println("Mobil mengangkut barang melalui jalan raya.");
    }
}

public class TantanganPolimorfisme {
    
    public static void main(String[] args) {
        
        // Array menggunakan tipe parent class
        Kendaraan[] armada = {
            new Motor(),
            new Mobil(),
            new Motor()
        };
        
        // Satu for-loop untuk semua objek
        for (Kendaraan kendaraan : armada) {
            kendaraan.angkutBarang();
        }
    }
}
