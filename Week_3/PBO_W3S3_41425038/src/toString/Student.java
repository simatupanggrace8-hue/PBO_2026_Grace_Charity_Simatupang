/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toString;

/**
 *
 * @author Grace
 */
// Contoh override method toString()
public class Student {
    @Override
    public String toString() {
        return "Student object";
    }
    public static void main(String[] args) {
        Student s = new Student(); // membuat object Student
        System.out.println(s.toString()); // memanggil toString()
    }
}

