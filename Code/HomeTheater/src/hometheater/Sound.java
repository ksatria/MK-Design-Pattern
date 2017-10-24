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
public class Sound {
    public void on(){
        // Turn on the sound system
        System.out.println("Sound system hidup.");
        System.out.println("Volume sound system = 0");
    }
    
    public void off(){
        // Turn off the sound system
        System.out.println("Sound system mati");
    }
    
    public void setVolume(int level){
        // Set the sound's volume to level
        System.out.println("Volume sound system = " + level);
    }
    
    public void stereoMode(){
        // Set sound mode for stereo
        System.out.println("Mode sound = stereo");
    }
    
    public void surroundMode(){
        // Set sound mode for surround
        System.out.println("Mode sound = surround");
    }
}
