/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverriding;

/**
 *
 * @author Grace
 */
import java.util.*;

class Penyihir{
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}
class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}
public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        
        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();
    }    
}


/*
1. Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih 
berjalan?
Jawab :
Program tetap bisa berjalan meskipun annotation @Override tidak digunakan, 
selama method yang dibuat memang memiliki nama dan parameter yang sesuai dengan 
method di kelas induk. Annotation @Override berfungsi membantu Java memeriksa apakah method tersebut benar-benar melakukan overriding.

2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
Jawab : 
Keuntungan polymorphism adalah kita dapat menggunakan satu tipe referensi, 
yaitu Penyihir, untuk menampung objek dari beberapa kelas turunan, seperti HarryPotter, Hermione, dan RonWeasley. 
Ketika method ucapkanMantra() dipanggil, setiap objek menjalankan implementasi yang sesuai dengan kelasnya.
*/