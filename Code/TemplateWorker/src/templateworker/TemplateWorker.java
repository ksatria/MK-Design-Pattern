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
public class TemplateWorker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PemadamKebakaran pmk = new PemadamKebakaran();
        TukangPos pos = new TukangPos();
        Dosen dsn = new Dosen();
        
        pmk.rutinitas();
        pos.rutinitas();
        dsn.rutinitas();
    }
    
}
