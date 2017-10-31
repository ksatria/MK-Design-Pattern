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
public class Dosen extends Pekerja{
    public Dosen(){
        super.jenis = "dosen";
    }
    
    public void bekerja(){
        System.out.println("Memberikan perkuliahan kepada mahasiswa");
    }
}
