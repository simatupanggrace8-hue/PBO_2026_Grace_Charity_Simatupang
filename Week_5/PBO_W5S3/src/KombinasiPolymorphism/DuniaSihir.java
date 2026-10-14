/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KombinasiPolymorphism;

/**
 *
 * @author Grace
 */
import java.util.*;
import java.util.ArrayList;
import java.util.List;

abstract class Mantra {
    private String nama;
    public Mantra(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }

        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    public void ucapkanSemuaMantra() {
        for (Mantra mantra : mantraList) {
            System.out.println(nama + " mengucapkan: " + mantra.getNama());
            mantra.efek();
        }
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos");

        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");
    }
}

/*
1.Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini? 
Jawab :
Polymorphism memungkinkan objek Expelliarmus, ExpectoPatronum, dan Lumos disimpan 
dalam satu daftar bertipe Mantra. Abstract class Mantra menetapkan method efek() yang harus 
diimplementasikan setiap kelas mantra. Ketika efek() dipanggil, Java menjalankan implementasi 
yang sesuai dengan objeknya.

2. Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah 
kelas Penyihir? Apakah mudah? Mengapa? 
Jawab :
Menambahkan mantra baru menjadi mudah. Cukup membuat kelas baru yang mewarisi 
Mantra dan mengimplementasikan method efek(). Setelah itu, objek mantra dapat 
ditambahkan menggunakan belajarMantra(). Kelas Penyihir tidak perlu diubah karena 
sudah dapat menerima semua objek turunan Mantra.

*/