/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author Khoirul Umam
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Human h = new Human(); <-- Illegal
        
        Asian h = new Asian();
        
        h.looks();
        h.move("left");
        h.dance("Gandrung");
        h.sing();
    }
    
}
