/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saleselektronik;

/**
 *
 * @author User
 */
public class SalesElektronik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TokoA tokoA = new TokoA();
        TokoB tokoB = new TokoB();
        
        Sales sales = new Sales(tokoA,tokoB);
        
        sales.daftarBarang();
    }
    
}
