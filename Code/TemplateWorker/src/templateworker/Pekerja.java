/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateworker;

/**
 *
 * @author User
 */
public abstract class Pekerja {
    protected String jenis;
    
    public final void rutinitas(){
        System.out.println("Rutinitas " + jenis + ":");
        
        bangunPagi();
        sarapan();
        bekerja();
        istirahat();
        
        System.out.println();
    }
    
    public void bangunPagi(){
        System.out.println("Bangun pagi");
    }
    
    public void sarapan(){
        System.out.println("Sarapan");
    }
    
    public abstract void bekerja();
    
    public void istirahat(){
        System.out.println("Beristirahat");
    }
}
