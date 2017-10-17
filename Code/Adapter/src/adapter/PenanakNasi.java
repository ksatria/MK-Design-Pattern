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
public class PenanakNasi implements PeralatanElektronik{
    @Override
    public void hidupkan(){
        System.out.println("Penanak nasi mulai menanak beras.");
        
    }
    
    @Override
    public void matikan(){
        System.out.println("Nasi sudah siap. Penanak nasi dimatikan.");
    }
}
