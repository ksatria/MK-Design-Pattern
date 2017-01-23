/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom;

/**
 *
 * @author Khoirul Umam
 */
public class KingdomCharacter {
    public int hitpoint;
    public int strength;
    
    public void fight(){
        System.out.println("Menyerang dengan kekuatan sebesar " + this.hitpoint + " poin");
    }
    
    public void defend() {
        System.out.println("Bertahan dengan kekuatan sebesar " + this.strength + " poin");
    }
}
