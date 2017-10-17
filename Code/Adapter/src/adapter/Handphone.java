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
public class Handphone implements Gadget{
    @Override
    public void turnOn(){
        System.out.println("Handphone dihidupkan. Pesan selamat datang ditampilkan.");
    }
    
    @Override
    public void turnOff(){
        System.out.println("Handphone dimatikan. Semua lampu indikator mati.");
    }
    
    @Override
    public void play(){
        System.out.println("Handphone digunakan untuk mengirim sms.");
    }
}
