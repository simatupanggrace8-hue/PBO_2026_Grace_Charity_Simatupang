/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrac_Class;

/**
 *
 * @author Grace
 */

import java.util.*;

abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    public abstract void efek();
    
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}
class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}
class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menghasilkan cahaya dari ujung tongkat.");
    }
}
public class DemoMantraAbstrak {
    public static void main(String[] args) {

        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();

        mantra3.ucapkan();
        mantra3.efek();
    }
}

/*
*/