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
public class Sales {
    TokoA tokoA;
    TokoB tokoB;
    
    public Sales(TokoA tokoA, TokoB tokoB){
        this.tokoA = tokoA;
        this.tokoB = tokoB;
    }
    
    public void daftarBarang(){
        Iterator daftarBarangTokoA = tokoA.createIterator();
        Iterator daftarBarangTokoB = tokoB.createIterator();
        
        System.out.println("DAFTAR BARANG DI TOKO A");
        System.out.println("-----------------------");
        printDataBarang(daftarBarangTokoA);
        
        System.out.println();
        
        System.out.println("DAFTAR BARANG DI TOKO B");
        System.out.println("-----------------------");
        printDataBarang(daftarBarangTokoB);
    }
    
    private void printDataBarang(Iterator iterator){
        int i = 0;
        while(iterator.hasNext()){
            Barang b = (Barang)iterator.next();
            
            System.out.println(++i + ". " + b.detailBarang());
        }
    }
}
