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
public class DVDPlayer {
    public String movie;
    
    public DVDPlayer(String movie){
        this.movie = movie;
    }
    
    public void on(){
        // Turn on the DVD player
        System.out.println("DVD player hidup");
    }
    
    public void off(){
        // Turn off the DVD player
        System.out.println("DVD player mati");
    }
    
    public void play(){
        // Play the movie
        System.out.println("DVD player memutar film \"" + movie + "\"");
    }
    
    public void pause(){
        // Pause the movie
        System.out.println("Pemutaran film \"" + movie + "\" dijeda");
    }
    
    public void stop(){
        // Stop the movie
        System.out.println("Film \"" + movie + "\" selesai diputar");
    }
    
    public void setSurroundAudio(){
        // Set the DVD player audio output to surround
        System.out.println("Audio DVD dalam mode surround");
    }
}
