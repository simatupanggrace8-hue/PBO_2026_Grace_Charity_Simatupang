/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterSetter_2;

/**
 *
 * @author Grace
 */
class GetSet {
    private int num;

    // Method 1 - Setter
    public void setNumber(int number)
    {
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException();
        }

        num = number;
    }

    // Method 2 - Getter
    public int getNumber() { return num; }
}
