/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalize;

/**
 *
 * @author Grace
 */
// Contoh finalize() seperti pada modul
public class Student {
    public static void main(String[] args) {
        Student t = new Student();
        System.out.println(t.hashCode());

        t = null;

        System.gc();

        System.out.println("end");
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("finalize method called");
    }
}

