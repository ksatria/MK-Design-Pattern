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
public class TukangPos {
    public final void rutinitas(){
        System.out.println("Rutinitas Tukang Pos:");
        
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
    
    public void bekerja(){
        System.out.println("Mengantarkan surat");
    }
    
    public void istirahat(){
        System.out.println("Beristirahat");
    }
}
