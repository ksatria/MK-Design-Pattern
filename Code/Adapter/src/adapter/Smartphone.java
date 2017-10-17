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
public class Smartphone implements Gadget {
    @Override
    public void turnOn(){
        System.out.println("Smartphone dihidupkan. Siap untuk digunakan.");
    }
    
    @Override
    public void turnOff(){
        System.out.println("Smartphone dimatikan.");
    }
    
    @Override
    public void play(){
        System.out.println("Aplikasi di dalam smartphone dijalankan.");
    }
}
