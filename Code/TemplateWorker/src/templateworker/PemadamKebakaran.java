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
public class PemadamKebakaran extends Pekerja{
    public PemadamKebakaran(){
        super.jenis = "pemadam kebakaran";
    }
    
    public void bekerja(){
        System.out.println("Memadamkan kebakaran");
    }
}
