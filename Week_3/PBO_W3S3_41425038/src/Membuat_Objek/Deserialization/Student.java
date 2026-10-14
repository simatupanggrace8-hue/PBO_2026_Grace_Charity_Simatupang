/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Membuat_Objek.Deserialization;

/**
 *
 * @author Grace
 */
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    public Student(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student: " + name;
    }
}

