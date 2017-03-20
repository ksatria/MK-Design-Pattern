/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Khoirul Umam
 */
public class GarageDoor {
    public void up() {
        System.out.println("Garage door is open");
    }
    
    public void down() {
        System.out.println("Garage door is close");
    }
    
    public void stop() {
        System.out.println("Garage door is stoped");
    }
    
    public void lightOn() {
        System.out.println("Light of garage door is on");
    }
    
    public void lightOff() {
        System.out.println("Light of garage door is off");
    }
}
