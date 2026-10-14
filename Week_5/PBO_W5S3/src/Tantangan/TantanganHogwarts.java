/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

/**
 *
 * @author Grace
 */
import java.util.*;
import java.util.ArrayList;
import java.util.List;

abstract class MantraPerlindungan {
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

class Protego extends MantraPerlindungan {
    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego dinonaktifkan!");
    }
}

class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Fidelius diaktifkan oleh " + secretKeeper + "!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Fidelius dinonaktifkan oleh " + secretKeeper + "!");
    }
}

class MantraAntiApparition extends MantraPerlindungan {
    private String area;

    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Anti-Apparition aktif di area " + area + "!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Anti-Apparition dinonaktifkan di area " + area + "!");
    }
}

class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra;

    public SistemPertahanan() {
        daftarMantra = new ArrayList<>();
    }

    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
    }

    public void aktifkanSemuaMantra() {
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    public void nonaktifkanSemuaMantra() {
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

public class TantanganHogwarts {
    public static void main(String[] args) {
        SistemPertahanan sistem = new SistemPertahanan();

        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Harry Potter");
        MantraPerlindungan antiApparition =
                new MantraAntiApparition("Hogwarts");

        sistem.tambahMantra(protego);
        sistem.tambahMantra(fidelius);
        sistem.tambahMantra(antiApparition);

        System.out.println("=== SISTEM PERTAHANAN HOGWARTS ===");
        System.out.println("\nMengaktifkan semua mantra:");
        sistem.aktifkanSemuaMantra();

        System.out.println("\nMenonaktifkan semua mantra:");
        sistem.nonaktifkanSemuaMantra();
    }
}
