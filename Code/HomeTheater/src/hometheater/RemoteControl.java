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
public class RemoteControl {
    Sound sound;
    Amplifier amplifier;
    DVDPlayer dvd;
    Proyektor proyektor;
    PopcornPopper popcorn;
    Layar layar;
    LampuRuangan lampu;
    
    public RemoteControl(Sound sound, Amplifier amplifier, DVDPlayer dvd, Proyektor proyektor, PopcornPopper popcorn, Layar layar, LampuRuangan lampu){
        this.sound = sound;
        this.amplifier = amplifier;
        this.dvd = dvd;
        this.proyektor = proyektor;
        this.popcorn = popcorn;
        this.layar = layar;
        this.lampu = lampu;
    }
    
    public void watchMovie(){
        popcorn.on();
        popcorn.pop();
        
        lampu.hidup();
        lampu.redup(50);
        
        layar.buka();
        
        proyektor.on();
        proyektor.modeLayarLebar();
        
        sound.on();
        
        amplifier.on();
        amplifier.setDvd(dvd);
        amplifier.setSoundDevice(sound);
        amplifier.setSurroundSound();
        amplifier.setVolume(6);
        
        dvd.on();
        dvd.play();
    }
    
    public void endMovie(){
        dvd.stop();
        dvd.off();
        
        amplifier.setVolume(0);
        amplifier.off();
        
        sound.off();
        
        proyektor.off();
        
        layar.gulung();
        
        lampu.redup(100);
        
        popcorn.off();
    }
}
