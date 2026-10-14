/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartHome;

/**
 *
 * @author Grace
 */
public class SmartHome {
    public static void main(String[] args) {
        SmartLamp lampu = new SmartLamp(80);

        lampu.turnOn();
        lampu.connectToWifi("Rumah_Indah_5G", "192.168.1.50");

        SmartAC ac = new SmartAC(22);

        ac.turnOn();
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");
        ac.turnOff();
    }
}

