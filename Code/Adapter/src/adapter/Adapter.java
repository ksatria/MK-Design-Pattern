/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author User
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gadget smartphone = new Smartphone();
        Gadget handphone = new Handphone();
        
        PeralatanElektronik penanaknasi = new PenanakNasi();
        Gadget penanaknasi2 = new AdapterElektronik(penanaknasi);
        
        useGadget(smartphone);
        useGadget(handphone);
        useGadget(penanaknasi2);
    }
    
    static void useGadget(Gadget g){
        g.turnOn();
        g.play();
        g.turnOff();
    }
}
