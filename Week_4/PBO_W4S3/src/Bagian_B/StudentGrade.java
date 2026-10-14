/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

/**
 *
 * @author Grace
 */
public class StudentGrade {

    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf;

    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0.0;
        this.nilaiUTS = 0.0;
        this.gradeHuruf = "E";

        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: "
                + nim + " - " + nama);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiKuis() {
        return nilaiKuis;
    }

    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            updateGradeHuruf();

            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: "
                    + nilaiKuis);
        } else {
            System.out.println("[Error] Nilai kuis tidak valid: "
                    + nilaiKuis + " (Harus antara 0 - 100)");
        }
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;
            updateGradeHuruf();

            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: "
                    + nilaiUTS);
        } else {
            System.out.println("[Error] Nilai UTS tidak valid: "
                    + nilaiUTS + " (Harus antara 0 - 100)");
        }
    }

    public String getGradeHuruf() {
        return gradeHuruf;
    }

    private void updateGradeHuruf() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 85) {
            gradeHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = "B";
        } else if (nilaiAkhir >= 55) {
            gradeHuruf = "C";
        } else if (nilaiAkhir >= 40) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }

    public double hitungNilaiAkhir() {
        return (nilaiKuis * 0.40) + (nilaiUTS * 0.60);
    }

    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Kuis  : " + nilaiKuis);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        System.out.println("Grade Huruf : " + gradeHuruf);
    }

    public static void main(String[] args) {
        StudentGrade student = new StudentGrade("11425001", "Marsha");
        student.setNilaiKuis(110.0);
        student.setNilaiKuis(85.0);
        student.setNilaiUTS(90.0);
        student.cetakLaporan();
    }
}
