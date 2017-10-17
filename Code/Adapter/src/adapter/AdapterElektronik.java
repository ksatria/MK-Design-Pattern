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
public class AdapterElektronik implements Gadget{
    PeralatanElektronik e;
    
    public AdapterElektronik(PeralatanElektronik e){
        this.e = e;
    }
    
    @Override
    public void turnOn(){
        e.hidupkan();
    }
    
    @Override
    public void turnOff(){
        e.matikan();
    }
    
    @Override
    public void play(){
        //do nothing
    }
    
    public void apalah(){
        
    }
}
