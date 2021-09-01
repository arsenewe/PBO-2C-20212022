/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sepedademo;

/**
 *
 * @author septianenggars
 */
public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        
        //spd1.merk = "Turbo";
        
        spd1.setMerk("Polygone");
        spd1.gantiGear(2);
        spd1.tambahKecepatan(10);
        spd1.tambahKecepatan(40);
        spd1.rem(5);
        spd1.gantiGear(4);
        spd1.cetakStatus();
        
        // sepeda gunung
        spd3.setMerk("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(5);
        spd3.setTipeSuspensi("Gas");
        spd3.cetakStatus();
    }
}
