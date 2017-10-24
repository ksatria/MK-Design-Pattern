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
public class Amplifier {
    public DVDPlayer dvdPlayer;
    public Sound soundDevice;
    
    public void setDvd(DVDPlayer dvd){
        dvdPlayer = dvd;
    }
    
    public void setSoundDevice(Sound sound){
        soundDevice = sound;
    }
    
    public void setStereoSound(){
        soundDevice.stereoMode();
    }
    
    public void setSurroundSound(){
        dvdPlayer.setSurroundAudio();
        soundDevice.surroundMode();
    }
    
    public void setVolume(int level){
        soundDevice.setVolume(level);
    }
    
    public void on(){
        System.out.println("Amplifier hidup");
    }
    
    public void off(){
        System.out.println("Amplifier mati");
    }
}
