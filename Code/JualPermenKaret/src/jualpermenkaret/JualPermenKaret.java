/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualpermenkaret;

/**
 *
 * @author User
 */
public class JualPermenKaret {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MesinPermenKaret mesin = new MesinPermenKaret(2);
        
        mesin.koinMasuk();
        mesin.putarTuas();
        
        mesin.koinMasuk();
        mesin.putarTuas();
        
        mesin.koinMasuk();
        mesin.putarTuas();
        
        mesin.isiUlang(5);
        
        mesin.koinMasuk();
        mesin.putarTuas();
    }
    
}
