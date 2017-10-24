/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometheater;

/**
 *
 * @author User
 */
public class Proyektor {
    public DVDPlayer dvdPlayer;
    
    public Proyektor(DVDPlayer dvd){
        dvdPlayer = dvd;
    }
    
    public void on(){
        System.out.println("Proyektor siap digunakan");
    }
    
    public void off(){
        System.out.println("Proyektor selesai digunakan");
    }
    
    public void modeTV(){
        System.out.println("Proyektor dalam mode TV menampilkan film \"" + dvdPlayer.movie + "\"");
    }
    
    public void modeLayarLebar(){
        System.out.println("Proyektor dalam mode layar lebar menampilkan film \"" + dvdPlayer.movie + "\"");
    }
}
