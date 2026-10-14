/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Class_dan_Object;

/**
 *
 * @author Grace
 */
// Program untuk membuat class Student dan object Student
class Student {
    int id;
    String n;
    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }
}
public class Main {
    public static void main(String[] args) {
        // Membuat object Student
        Student s1 = new Student(10, "Alice");
        // Menampilkan atribut object
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}
